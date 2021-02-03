package pl.itacademy.lesson22;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UtilsTest {

    @Test
    public void sum_twoAndTwo_returnsFour() {
        int result = Utils.sum(2, 2);

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void sum_twoAndZero_returnsTwo() {
        int result = Utils.sum(2, 0);

        assertThat(result).isEqualTo(2);
    }

}