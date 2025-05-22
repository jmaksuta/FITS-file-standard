package com.maksuta.fits;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class TestKeywordRecord {

    @Test
    public void TestConstructor() {
        KeywordRecord record = new KeywordRecord("SIMPLE", "T");
        assertNotNull(record);
    }

}
