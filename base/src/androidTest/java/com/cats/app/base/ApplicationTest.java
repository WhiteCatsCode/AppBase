package com.cats.app.base;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @Override
    public void setUp() throws Exception {
        Log.d("Test", "setUp");
    }

    @Override
    public void tearDown() throws Exception {
        Log.d("Test", "tearDown");
    }

    public void testApp() throws Exception {
        Log.d("Test", "test");
    }


}