package com.maksuta.fits;

public class FitsFile {

    private final Object[] structures;

    /**
     * This is the Basic FITS file or Single Image FITS (SIF) file.
     */
    public FitsFile() {
        super();
        this.structures = new Object[] { new HeaderAndDataUnit() };
    }

    /**
     * This is the Multi-Extension FITS (MEF) file.
     * @param structures
     */
    public FitsFile(Object[] structures) {
        super();
        this.structures = structures;
    }

}
