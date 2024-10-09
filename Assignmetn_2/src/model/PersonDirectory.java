/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class PersonDirectory {

    private ArrayList<Person> people;
        
    public PersonDirectory(){
        this.people = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    
    public Person addPerson(){
        Person p = new Person();
        people.add(p);
        return p;
    }
    
    public void deletePerson(Person person){
        people.remove(person);
    }
    
    public Person searchPerson(String searchText){
        for (Person a: people){
            Address homeAddress = a.getHomeAddress();
            Address workAddress = a.getWorkAddress();
            if (a.getFirstName().contains(searchText)||
                a.getLastName().contains(searchText)||
                homeAddress.getStreetAddress().contains(searchText)||
                workAddress.getStreetAddress().contains(searchText)){
                
                return a;
            }
        }
        return null;
    }
    
}
