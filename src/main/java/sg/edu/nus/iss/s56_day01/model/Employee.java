package sg.edu.nus.iss.s56_day01.model;

import org.springframework.core.style.ToStringCreator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//annotation at the class level
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String id;
    private String firstName;
    private String lastName;

}
