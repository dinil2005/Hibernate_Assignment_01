package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString


@Entity
public class Book {
     @Id
     private String book_id;
     private String book_name;
     private String year;

     @ManyToMany()
     private List<Author> authors;


     public Book(){

     }


     public Book(String book_id, String book_name, String year, List<Author> authors) {
          this.book_id = book_id;
          this.book_name = book_name;
          this.year = year;
          this.authors = authors;
     }
}
