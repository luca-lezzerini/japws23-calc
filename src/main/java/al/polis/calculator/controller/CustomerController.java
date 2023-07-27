/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package al.polis.calculator.controller;

import al.polis.calculator.model.Customer;
import al.polis.calculator.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/get-all-customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/name/{name}")
    public List<Customer> getCustomersByName(@PathVariable String name) {
        return customerService.getCustomersByName(name);
    }

    /**
     *
     * @param city
     * @return
     */
    @GetMapping("/city/{city}")
    public List<Customer> getCustomersByCity(@PathVariable String city) {
        return customerService.getCustomersByCity(city);
    }

    @GetMapping("/name/{name}/city/{city}")
    public List<Customer> getCustomersByNameAndCity(@PathVariable String name, @PathVariable String city) {
        return customerService.getCustomersByNameAndCity(name, city);
    }

    @GetMapping("/relationships")
    public void relationships() {
        customerService.testRelationships();
    }
}
