
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
public class Library {
    private ArrayList<Book> books;
    
    public Library(){
        books = new ArrayList();
    }
    
    public void addBook(Book newBook){
       this.books.add(newBook);
       
    }
    public void printBooks(){
        for(Book book : books){
            System.out.println(book);
            
        } 
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book book : books){
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book book : books){
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            } else {
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book book : books){
            if(book.year() == year){
                found.add(book);
            }
        }
        return found;
        
    }
}
