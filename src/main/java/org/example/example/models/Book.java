package org.example.example.models;
import lombok.*;


//@NoArgsConstructor

public class Book {
    private  static Integer currentId = 1;

    @Getter
    private Integer id;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private String author;
    @Getter @Setter
    private Category category;

    public Book(){
        this.id = currentId++;
    }
    public Book( String title, String description, String author) {
        this();
        this.title = title;
        this.description = description;
        this.author = author;

    }

    @Override
    public String toString() {
        return "Livre " + id + " : \n" +
                "\t    Titre = " + title + '\n' +
                "\t    Description = " + description + '\n' +
                "\t    Auteur = " + author + '\n' +
                "______________________________________________";
    }


}

