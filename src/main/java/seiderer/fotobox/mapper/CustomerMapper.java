// CustomerMapper.java
package seiderer.fotobox.mapper;

import seiderer.fotobox.dto.CustomerDTO;
import seiderer.fotobox.entity.Customer;

public class CustomerMapper {

    public CustomerDTO toDTO(Customer customer) {
        if (customer == null) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setUsername(customer.getUsername());
        customerDTO.setPassword(customer.getPassword());
        customerDTO.setRole(customer.getRole());
        customerDTO.setInfos(customer.getInfos());

        return customerDTO;
    }

    public Customer toEntity(CustomerDTO customerDTO) {
        if (customerDTO == null) {
            return null;
        }

        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setUsername(customerDTO.getUsername());
        customer.setPassword(customerDTO.getPassword());
        customer.setRole(customerDTO.getRole());
        customer.setInfos(customerDTO.getInfos());

        return customer;
    }
}