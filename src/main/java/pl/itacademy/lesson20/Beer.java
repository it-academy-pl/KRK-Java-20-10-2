package pl.itacademy.lesson20;

import lombok.*;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Beer {
    private int volume;
    private String name;
    private double alcohol;
}
