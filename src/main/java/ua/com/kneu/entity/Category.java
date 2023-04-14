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

//
@Entity   // Hibernate class->table
@Table(name = "category") // // Hibernate
public class Category {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AI - i=i+1;
    private Long id;

    @Column(name = "_name")
    private String name;
    private String description;
    private String image;

    @OneToMany(mappedBy = "categories")
    private List<Product> productList;

}


//    public Category() {
//    }
//
//    public Category(Long id, String name, String description, String image) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.image = image;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Category category)) return false;
//        return Objects.equals(getId(), category.getId()) && Objects.equals(getName(), category.getName()) && Objects.equals(getDescription(), category.getDescription()) && Objects.equals(getImage(), category.getImage());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getName(), getDescription(), getImage());
//    }
//    @Override
//    public String toString() {
//        return "Category{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", image='" + image + '\'' +
//                '}';
//    }


