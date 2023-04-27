package org.example.data;

import org.example.example.models.Book;

import java.util.ArrayList;
import java.util.List;

public class FakeDb {

    public static List<Book> books = new ArrayList<>();

    public static void init(){

        books.add(new Book("Livre1", "Description","Auteur1" ));
        books.add(new Book("Livre2", "Description","auteur2" ));
        books.add(new Book("Livre3", "Description","auteur3" ));
        books.add(new Book("Livre4", "Description","auteur4" ));
        books.add(new Book("Livre5", "Description","auteur5" ));
        books.add(new Book("Livre6", "Description","auteur6" ));

    }

    public static  Book getBook(Integer id){

//        for(Book b : books){
//            if(id == b.getId())
//                return b;
//        }
//        return null;
        return books.stream()
                .filter(b -> b.getId() == id) // j'ai une liste de livre qui ont répondu vrai à l'expression bool
                .findFirst() // tu prend le premier
                .orElse(null); //

    }
}
