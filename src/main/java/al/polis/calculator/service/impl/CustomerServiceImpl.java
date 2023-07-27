package al.polis.calculator.service.impl;

import al.polis.calculator.model.Car;
import al.polis.calculator.model.Customer;
import al.polis.calculator.model.Person;
import al.polis.calculator.repository.CarRepository;
import al.polis.calculator.repository.CustomerRepository;
import al.polis.calculator.repository.PersonRepository;
import al.polis.calculator.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private CarRepository carRepository;
    
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    @Override
    public List<Customer> getCustomersByName(String name) {
        return customerRepository.kerkoiClientEmri(name);
    }
    
    @Override
    public List<Customer> getCustomersByCity(String city) {
        return customerRepository.findByCity(city);
    }
    
    @Override
    public List<Customer> getCustomersByNameAndCity(String name, String city) {
        return customerRepository.findByNameAndCity(name, city);
    }
    
    @Override
    public void testRelationships() {
        // delete all cars
//        carRepository.deleteAll();
        // delete all persons
//        personRepository.deleteAll();

        // create one person
        Person p1 = new Person();
        p1.setFirstName("Ledio");
        p1.setLastName("Hoxha");
        p1 = personRepository.save(p1);

        // create one car
        Car c1 = new Car();
        c1.setPlate("AA123BB");
        c1.setModel("Hummer");
        c1 = carRepository.save(c1);
        // create another car
        Car c2 = new Car();
        c2.setPlate("AA456BB");
        c2.setModel("Mercedes");
        c2 = carRepository.save(c2);

        // associate c1 to p1
        c1.setOwner(p1);
        carRepository.save(c1);
        // associate c2 to p1
        c2.setOwner(p1);
        carRepository.save(c2);
        
        // ... and now associate c1 and c2 to p1
        List<Car> cs = p1.getOwnedCars();
        cs.add(c1);
        cs.add(c2);
        p1 = personRepository.save(p1);

        // retrieve and print cars owned by p1
        p1 = personRepository.findById(402L)
                .orElse(null);
        List<Car> cars = p1.getOwnedCars();
        for (Car car : cars) {
            System.out.println("Car plate is " + car.getPlate());
        }
    }
    
}
