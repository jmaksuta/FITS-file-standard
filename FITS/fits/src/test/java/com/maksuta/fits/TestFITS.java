package com.maksuta.fits;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class TestFITS {

    @Test
    public void testClassExists() {
        FITS fits = new FITS();

        assertNotNull(fits);
    }

}
