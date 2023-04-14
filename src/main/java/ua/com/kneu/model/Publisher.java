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
@Table(name = "publishers")
public class Publisher {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String description;

    @OneToMany(mappedBy = "publisher")
    private List<Book> bookList;
}
