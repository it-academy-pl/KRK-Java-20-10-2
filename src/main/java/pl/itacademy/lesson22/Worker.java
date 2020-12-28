package pl.itacademy.lesson22;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Worker {
    private String name;
    private int salary;
    private String department;
}
