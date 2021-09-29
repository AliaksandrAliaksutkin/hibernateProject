package model;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_auto")
@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_auto")
    private int idAddress;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;
    @Column(name = "year_of_issue")
    private int yearOfIssue;
    @ManyToMany(mappedBy = "auto")
    @JoinColumn(name = "user_id")
    private User user;
    private Auto auto;

    public Auto (String model, String color, int yearOfIssue) {
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }
}
