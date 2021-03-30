import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array_test {
    @Test
    public void checkArrayMethod1_1(){
        int[] testArr1 = new int[]{2,3};
        int[] givenArr1 = new int[]{4,2,3};
        assertArrayEquals(testArr1, Array.getArrayAfterLast4(givenArr1));
    }

    @Test
    public void checkArrayMethod1_2(){
        int[] testArr1 = new int[]{1,7};
        int[] givenArr1 = new int[]{1,2,4,4,2,3,4,1,7};
        assertArrayEquals(testArr1, Array.getArrayAfterLast4(givenArr1));
    }

    @Test
    public void checkArrayMethod1_3(){
        int[] testArr1 = new int[]{};
        int[] givenArr1 = new int[]{1,2,4,4};
        assertArrayEquals(testArr1, Array.getArrayAfterLast4(givenArr1));
    }

    @Test
    public void checkArrayMethod1_4(){
        int[] testArr1 = new int[]{1,7,5,1};
        int[] givenArr1 = new int[]{4,4,2,3,4,1,7,5,1};
        assertArrayEquals(testArr1, Array.getArrayAfterLast4(givenArr1));
    }

    @Test (expected = RuntimeException.class)
    public void checkArrayMethod1_Exception(){
        int[] testArr1 = new int[]{2,3};
        int[] givenArr1 = new int[]{9,2,3};
        assertArrayEquals(testArr1, Array.getArrayAfterLast4(givenArr1));
    }

    @Test
    public void checkArrayMethod2(){
        int[] givenArr1 = new int[]{4,1,1};
        assertEquals(true, Array.checkArrayConsistsOf1And4(givenArr1));
    }
}
