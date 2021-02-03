package pl.itacademy.interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class FinalTaskTest {

    private FinalTask finalTask;

    @BeforeEach
    public void setUp() {
        finalTask = new FinalTask();
    }

    @Test
    public void palindrome_returnsProperPalindromes() {
        assertThat(finalTask.findPalindromes(List.of("flight", "car", "civic", "radar", "level", "day", "round", "rotor", "kayak")))
                .containsExactlyInAnyOrder("civic", "radar", "level", "rotor", "kayak");
    }

    @Test
    public void secondMaxNumber_returnsProperValue() {
        assertThat(finalTask.secondMaxNumber(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11))).isEqualTo(10);
        assertThat(finalTask.secondMaxNumber(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1))).isEqualTo(9);
        assertThat(finalTask.secondMaxNumber(List.of(-10, -9, -8, -7, -6, -5, -4))).isEqualTo(-5);
        assertThat(finalTask.secondMaxNumber(List.of(-3, -4, -5, -6, -7, -8, -9, -10))).isEqualTo(-4);
        assertThat(finalTask.secondMaxNumber(List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7))).isEqualTo(6);
        assertThat(finalTask.secondMaxNumber(List.of(12, 12, 11, 11, 10, 10, 9, 9, 8, 8, 7, 7, 6, 6, 5, 5))).isEqualTo(11);
        assertThat(finalTask.secondMaxNumber(List.of(1, 10, 2, 9, 3, 8, 4, 7, 5, 6))).isEqualTo(9);
    }

}