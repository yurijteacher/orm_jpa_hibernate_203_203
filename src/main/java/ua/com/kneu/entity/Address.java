package ua.com.kneu.entity;

import lombok.*;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString


@Entity
@Table(name = "_address")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@Column(name = "country")
    private String country;
    private String city;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Client _client;
}
