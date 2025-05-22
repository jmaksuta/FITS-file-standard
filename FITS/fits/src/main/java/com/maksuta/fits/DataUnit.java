package com.maksuta.fits;

public class DataUnit extends FitsBlock {
    private byte[] data;

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}
