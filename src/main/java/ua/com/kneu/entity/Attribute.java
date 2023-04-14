package ua.com.kneu.entity;

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
@Table(name = "_attribute")
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String values_attribute;
    private String description;

    @OneToMany(mappedBy = "attributes")
    private List<AttributeHasProduct> attributeHasProducts;
}
