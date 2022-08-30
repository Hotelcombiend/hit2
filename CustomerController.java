package com.example.service_f_1;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers;

    public CustomerController() {
        this.customers = new ArrayList<>();
        this.customers.add(new Customer("1010", "John", true, 25));
        this.customers.add(new Customer("1018", "Peter", true, 24));
        this.customers.add(new Customer("1019", "Sara", false, 23));
        this.customers.add(new Customer("1110", "Rose", false, 23));
        this.customers.add(new Customer("1001", "Emma", false, 30));
    }
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return this.customers;
    }
    @RequestMapping(value = "/customerbyid/{ID}", method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable("ID") String ID){
        int size = this.customers.size();
        for (int i = 0; i < size; i++) {
            if(this.customers.get(i).getID().equals(ID)){
                return this.customers.get(i);
            }
        }
        return new Customer();
    }
    @RequestMapping(value = "/customerbyname/{n}", method = RequestMethod.GET)
    public Customer getCustomerByName(@PathVariable("n") String name){
        int size = this.customers.size();
        for (int i = 0; i < size; i++) {
            if(this.customers.get(i).getName().equals(name)){
                return this.customers.get(i);
            }
        }
        return new Customer();
    }
    @RequestMapping(value = "customerDelByid/{id}", method = RequestMethod.DELETE)
    public boolean delCustomerByID(@PathVariable("id") String ID){
        int size = this.customers.size();
        for (int i = 0; i < size; i++) {
            if(this.customers.get(i).getID().equals(ID)){
                this.customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/customerDelByname/{n}", method = RequestMethod.DELETE)
    public boolean delCustomerByName(@PathVariable("n") String name){
        int size = this.customers.size();
        for (int i = 0; i < size; i++) {
            if(this.customers.get(i).getName().equals(name)){
                this.customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("id") String ID,
                               @RequestParam("name") String name,
                               @RequestParam("age") int age,
                               @RequestParam("sex") String sex){
        boolean sex_n = false;
        if(sex.equals("male")){
            sex_n = true;
        }
        else{
            sex_n = false;
        }
        this.customers.add(new Customer(ID, name, sex_n, age));
        return true;
    }
    @RequestMapping(value = "/addCustomer2", method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam("id") String ID,
                               @RequestParam("name") String name,
                               @RequestParam("age") int age,
                               @RequestParam("sex") String sex){
        boolean sex_n = false;
        if(sex.equals("male")){
            sex_n = true;
        }
        else{
            sex_n = false;
        }
        this.customers.add(new Customer(ID, name, sex_n, age));
        return true;
    }
}
