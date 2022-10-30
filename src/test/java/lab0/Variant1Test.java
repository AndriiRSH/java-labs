package lab0;

import lab0.Variant1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.function.Function;

import static org.testng.Assert.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class Variant1Test {

    @Test(dataProvider = "integerProvider")
    public void inputTest(int p1, int p3) {
        assertEquals(new Variant1().integerNumbersTask(p1), p3);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 100, 1 }, { 1000, 10 }, { 139, 1 } };
    }

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int[] myArray) {
        assertEquals(new Variant1().ifTask(p1, p2), myArray);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 2, 3, 2, 3 }, { 4, 1, 1, 4 }};
    }

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, boolean p3) {
        assertEquals(new Variant1().booleanTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 5, 3, true }, { 0, 4, false }, { -3, 4, true } };
    }

    @Test
    void switchTask(){
        assertArrayEquals(new Variant1().switchTask( 31,12), new int[]{1, 1});
    }

    @Test(dataProvider = "forProvider")
    public void forTest(int a, int b, int p2) {
        assertEquals(new Variant1().forTask(a,b), p2);
    }
    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] { { 3, 4, 25 }, { 7, 5, 0 }, { 2, 8, 203 } };
    }
////
    @Test(dataProvider = "numbersProvider")
    public void numbersTest(int[] p1, int[] p2) {
        assertArrayEquals(new Variant1().numbers(p1), p2);
    }

    @DataProvider
    public Object[][] numbersProvider() {
        return new Object[][] {{new int[]{1, 7, 2, 3, 5}, new int[]{1, 7}}};
    }

    @Test(dataProvider = "whileProvider")
    public void whileTest(int n, int c) {
        assertEquals(new Variant1().whileTask(n), c);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { { 3, 2 }, { 8, 2 }, { 9, 3 } };
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][] { { 2 }, { 4 }, { 8 } };
    }

    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(Integer[] array, Integer[] A) {
        assertEquals(new Variant1().arrayTask(array), A);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] output = {4,2};
        return new Object[][] {{input, output}};
    }

    @Test(dataProvider = "matrixProvider")
    public void matrixTest(int[][] input, int[][] p3) {
        assertEquals(new Variant1().matrixTask(input), p3);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        return new Object[][] {{
                new int [][]{
                {4, 4, 2, 2, 5},
                {2, 5, 3, 3, 2},
                {3, 2, 5, 1, 3}
        }, new int[][]{
                {2, 5, 3, 3, 2}
                }
        }};
    }

}


