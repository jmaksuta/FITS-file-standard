package com.maksuta.fits;

public class KeywordRecord implements Comparable<KeywordRecord> {

    private final String keyword;
    private final String value;

    public String getKeyword() {
        return keyword;
    }

    public String getValue() {
        return value;
    }

    private KeywordRecord() {
        super();
        this.keyword = "END";
        this.value = "";
    }

    public KeywordRecord(String keyword, String value) {
        super();
        this.keyword = keyword;
        this.value = value;
    }

    @Override
    public int compareTo(KeywordRecord o) {
        return this.getKeyword().compareTo(o.getKeyword());
    }

}
