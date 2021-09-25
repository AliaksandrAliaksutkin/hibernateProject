package model;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
}
