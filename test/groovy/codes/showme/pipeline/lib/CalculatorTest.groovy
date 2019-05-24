package codes.showme.pipeline.lib

import org.junit.Assert
import org.junit.Test

class CalculatorTest {

    @Test
    void name() {
        Calculator demo = new Calculator()
        Assert.assertEquals(24, demo.add(12,12))
    }

}
