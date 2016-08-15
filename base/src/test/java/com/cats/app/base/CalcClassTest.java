package com.cats.app.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by guanj on 16-8-15.
 */
public class CalcClassTest {

    private static final String TAG = "CalcClassTest";

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void testAdd() throws Exception {
        System.out.println("testAdd");
    }

    @Test
    public void testSub() throws Exception {
        System.out.println("testSub");
    }
}