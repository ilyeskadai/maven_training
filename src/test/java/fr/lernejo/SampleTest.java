package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {
    private Sample sampleTest;
    @BeforeEach
    public void setUp() throws Exception{
        sampleTest = new Sample();
    }
    @Test
    void addOperation() {
        int a = 10;
        int b = 5;
        int res;

        res = sampleTest.op(Sample.Operation.ADD, a,b);
        Assertions.assertEquals(res, 15);
    }

    @Test
    void multOperation() {
        int a = 5;
        int b = 10;
        int res;

        res = sampleTest.op(Sample.Operation.MULT, a,b);
        Assertions.assertEquals(res, 50);
    }

    @Test
    void factOfNegValue() {
        org.assertj.core.api.Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() ->sampleTest.fact(-1)).withMessage("N should be positive");
    }
    @Test
    void factoriel() {
        Assertions.assertEquals(sampleTest.fact(4), 24);
    }
}
