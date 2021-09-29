package model;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_address")
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_address")
    private int idAddress;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "house")
    private int house;
    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private User user;

    public Address (String city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

}
