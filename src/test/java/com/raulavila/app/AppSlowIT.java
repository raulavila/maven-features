package com.raulavila.app;


import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertTrue;

public class AppSlowIT {

    @Test
    public void testApp() throws Exception {
        SECONDS.sleep(10);
        assertTrue(true);
    }
}
