package com.kkdev.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testAddition() {
        MathOperation math = new MathOperation(); //mencontruct MathOperation
        int result = math.add(6, 3); //menggunkanan method math.add untuk menambah 6 dan 3
        assertEquals(9, result); //apabila result yang dihasilkan sama dengan expected result yaitu 9. maka hasil akan pass
    }
}