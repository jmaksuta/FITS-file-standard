package com.maksuta.fits;

import java.util.LinkedList;

public class FITS {

    private LinkedList<FitsBlock> blocks;

    public FitsBlock getHDU() {
        return this.blocks.get(0);
    }
    
}
