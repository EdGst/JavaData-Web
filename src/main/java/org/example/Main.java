package org.example;


import org.example.data.FakeDb;
import org.example.example.models.Book;
import org.example.example.models.Category;
import org.example.example.models.forms.AddBookForm;
import org.example.repositories.BookRepository;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Book b = new Book("a", "b","c");
        b.setCategory(Category.action);
        System.out.println(b.getCategory());
        String s = b.getCategory().toString();
        Integer i = b.getCategory().ordinal();

        System.out.println(i);

        Category c = Category.values()[3];
        System.out.println(c);

        System.out.println(Category.aventure.value);

//        FakeDb.init();
//        BookRepository bookRepository = new BookRepository();
//        List<Book> books = bookRepository.getMany();
//
//        Book newBook = new Book("testAdd", "","");
//        bookRepository.add(newBook);
//
//
//        books = bookRepository.getMany();
//        AddBookForm form = new AddBookForm("toto", "a", "b");
//
//        bookRepository.update(7, form);
//
//        bookRepository.delete(7);
//
//        bookRepository.add(new Book("testAdd", "",""));
//
//        showList(books);



    }

    public static void showList(List<Book> books){ // le static permet de ne pas instancier le main
        books.forEach(System.out::println);
    }







//        FakeDb.books.forEach(System.out::println);

//        for( Book b : FakeDb.books){
//            System.out.println(b);
//        }

//        FakeDb.books.forEach(b -> System.out.println(b));

//        Map<Integer, Book> books = new HashMap<>();
//
//        for( Book b : FakeDb.books){
//            books.put(b.getId(), b);
//        }
//        for (Book b : books.values()){
//
//        }
//        System.out.println(FakeDb.getBook(5));
//
//
//        UUID id = UUID.randomUUID();
//        System.out.println(id);

//        Integer a = 2;
//        changeValue(a);
//        String nom = "tata";
//        System.out.println(a);
//
//        Book b = new Book("tata", "", "");
//        changeValue(b);;
//        System.out.println(b.getTitle());
//    }
//
//    public static void changeValue(int a){
//        a = 5;
//    }
//    public static void changeValue(Integer a){
//        a = 5;
//    }
//
//    public static void changeValue(String a){
//        a = "toto";
//    }
//
//    public static void changeValue(Book b){
//        b.setTitle("toto");}


}