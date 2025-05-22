package com.maksuta.fits;

public class HeaderAndDataUnit {

    private HeaderBlock header;
    private DataUnit data;

    private int NAXIS;
    private int NAXISn;

    public HeaderBlock getHeader() {
        return header;
    }

    public void setHeader(HeaderBlock header) {
        this.header = header;
    }

    public DataUnit getData() {
        return data;
    }

    public void setData(DataUnit data) {
        this.data = data;
    }

    public int getNAXIS() {
        return NAXIS;
    }

    public void setNAXIS(int nAXIS) {
        NAXIS = nAXIS;
    }

    public int getNAXISn() {
        return NAXISn;
    }

    public void setNAXISn(int nAXISn) {
        NAXISn = nAXISn;
    }

    public HeaderAndDataUnit() {
        super();
        this.header = new HeaderBlock();
        this.data = new DataUnit();

        this.NAXIS = 0;
        this.NAXISn = 0;
    }

    public HeaderAndDataUnit(FitsBlock[] blocks) {
        this();
        this.header = new HeaderBlock(blocks[0]);
        this.data = parseData(FitsBlock[] blocks);
    }

    private DataUnit parseData(FitsBlock[] blocks) {

        if (this.header.getNAXIS() > 0) {
            // TODO: parse the data blocks for each of the axes and build the this.data
            // property here.
        }
        throw new UnsupportedOperationException("Unimplemented method 'parseData'");
    }

    private DataUnit parseDataBlock(FitsBlock[] blocks) {
        // TODO: parse the data blocks for each of the axes
        throw new UnsupportedOperationException("Unimplemented method 'parseData'");
    }

}
