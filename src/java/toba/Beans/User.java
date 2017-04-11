/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.Beans;

import java.io.Serializable;
/**
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
 */
/**
 * 1. Create a User Java Bean
 * 2. Add all Attributes from the New Customer Form
 * 3. create a property for username and password
 */
//create class that impletments Serializable
public class User implements Serializable{
    
    //set all variables
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String username;
    private String password;
    
    //create the zero argument constructor
    public User(){
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        email = "";
    }
    //create a constructor for User
    public User(String firstName, String lastName, String phone, String address, String city, String state, String zip, String email){
        //connect the variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
    }
    //Create the first name get method
    public String getFirstName(){
        return firstName;
    }
    //Create the first name set method
    public void setFirstName(String firstName){
        //connect the variable
        this.firstName = firstName;
    }
    //Create the last name get method
    public String getLastName(){
        return lastName;
    }
    //Create the last name set method
    public void setLastName(String lastName){
        //connect the variable
        this.lastName = lastName;
    }
    //Create the phone get method
    public String getPhone(){
        return phone;
    }
    //Create the phone set method
    public void setPhone(String phone){
        //connect the variable
        this.phone = phone;
    }
    //Create the address get method
    public String getAddress(){
        return address;
    }
    //Create the address set method
    public void setAddress(String address){
        //connect the variable
        this.address = address;
    }
    //Create the city method
    public String getCity(){
        return city;
    }
    //Create the city set method
    public void setCity(String city){
        //connect the variable
        this.city = city;
    }
    //Create the state get method
    public String getState(){
        return state;
    }
    //Create the state set method
    public void setState(String state){
        //connect the variable
        this.state = state;
    }
    //Create the zip get method
    public String getZip(){
        return zip;
    }
    //Create the zip set method
    public void setZip(String zip){
        //connect the variable
        this.zip = zip;
    }
    //Create the email get method
    public String getEmail(){
        return email;
    }
    //Create the email set method
    public void setEmail(String email){
        //connect the variable
        this.email = email;
    }
    //Create the user name get method
    public String getUserName(){
        return username;
    }
    //Create the user name set method
    public void setUserName(String username){
        //connect the variable
        this.username = username;
    }
    //Create the password get method
    public String getPassword(){
        return password;
    }
   //Create the password set method
    public void setPassword(String password){
        //connect the variable
        this.password = password;
    }
            
}
