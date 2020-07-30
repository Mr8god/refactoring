package cn.mr8god.refactorfirst.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 * @date
 * @time
 */
public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("begin");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("end");
    }

    @Test
    public void add() {
        System.out.println("add() begin");
    }

    @Test
    public void subtract() {
        System.out.println("subtract() begin");
    }

    @Test
    public void multipe() {
        System.out.println("multipe() begin");
    }

    @Test
    public void divide() {
    }

    @Test
    public void getResult() {
    }
}