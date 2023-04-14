package ua.com.kneu.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString


@Entity // class -> table
@Table(name = "books") // create name table
public class Book {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AI NN
    private Long id;
    private String name;


    @OneToMany(mappedBy = "book")
    private List<AuthorHasBook> authorsHasBook;


    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;


}
