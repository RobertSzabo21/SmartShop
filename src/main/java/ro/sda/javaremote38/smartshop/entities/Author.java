package ro.sda.javaremote38.smartshop.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Author {


    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
}
