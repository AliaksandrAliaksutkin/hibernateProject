package model;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_user")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address_user")
    private Address address;

    public User(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

}