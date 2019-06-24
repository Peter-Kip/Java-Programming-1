
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Phonebook {
    private ArrayList<Person> contacts;
    
    public Phonebook(){
        contacts = new ArrayList();
    }
    
    public void add(String name, String number){
        Person contact = new Person(name, number);
        this.contacts.add(contact);
    }
    
    public void printAll(){
        for(Person contact : contacts){
            System.out.println(contact);
        }
    }
    
    public String searchNumber(String name){
        for(Person contact : contacts){
            if(contact.getName().equals(name)){
                return contact.getNumber();
            }
        }
        return "number not known";
    }
}
