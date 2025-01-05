package ie.atu.week10cicd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Entity
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Min(18)
    private int age;

    @Email
    private String email;

    @NotBlank
    private String title;

    @NotBlank
    private String employeeId;

    @NotBlank
    private String position;

    @NotBlank
    private String department;


    public Person() {}


    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public Person(Long id, String name, int age, String email, String title, String employeeId, String position, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.title = title;
        this.employeeId = employeeId;
        this.position = position;
        this.department = department;
    }

    public Person(String name, int age, String email, String title, String employeeId, String position, String department) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.title = title;
        this.employeeId = employeeId;
        this.position = position;
        this.department = department;
    }
}