/*
 */
package al.polis.calculator.service;

import al.polis.calculator.model.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    List<Customer> getCustomersByName(String name);

    List<Customer> getCustomersByCity(String city);

    List<Customer> getCustomersByNameAndCity(String name, String city);

    void testRelationships();
}
