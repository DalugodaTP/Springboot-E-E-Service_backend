package edu.icet.entity;
import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class CustomerEntity {
    private String id;
    private String name;
    private String address;
    private double salary;

    public CustomerEntity(String id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}
