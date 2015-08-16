package com.raulavila.app;


import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertTrue;

public class AppIT {

    @Test
    public void testApp() throws Exception {
        SECONDS.sleep(2);
        assertTrue(true);
    }
}
