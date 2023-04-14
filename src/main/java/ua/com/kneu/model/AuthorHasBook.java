package ua.com.kneu.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "author_has_book")
public class AuthorHasBook {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "author_id" )
    private Author author;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
