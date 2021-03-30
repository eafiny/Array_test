import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class Array_ParametrizedTest {
    private int[] givenArr;
    private int[] testArr;

    public Array_ParametrizedTest(int[] givenArr, int[] testArr) {
        this.givenArr = givenArr;
        this.testArr = testArr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{4,1,7}, new int[]{1,7}},
                {new int[]{1,2,4,4,3,4,1,8}, new int[]{1,8}},
        });
    }

    @Test
    public void checkArrayMethod1_1(){
        assertArrayEquals(testArr, Array.getArrayAfterLast4(givenArr));
    }
}
