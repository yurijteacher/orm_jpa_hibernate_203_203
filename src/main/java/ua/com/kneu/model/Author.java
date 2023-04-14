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

@Entity
@Table(name = "authors")
public class Author {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String description;

    @OneToMany(mappedBy = "author")
    private List<AuthorHasBook> authorHasBooks;

}
