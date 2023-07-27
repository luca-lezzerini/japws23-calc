/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package al.polis.calculator.repository;

import java.util.List;

/**
 *
 * @author henri
 */
public interface CustomerRepository {
    List<Customer> findByName(String name);
    List<Customer> findByCity(String city);
}
