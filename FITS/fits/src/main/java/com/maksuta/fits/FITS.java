package com.maksuta.fits;

import java.util.LinkedList;

import jdk.jshell.spi.ExecutionControl;

public class FITS {

    private LinkedList<FitsBlock> blocks;

    public FitsBlock getPrimaryHDU() {
        return this.blocks.get(0);
    }

    public FitsBlock getHDU() {
        return this.blocks.get(0);
    }

    public FitsBlock[] getConformingExtensions() throws Exception {
        throw new ExecutionControl.NotImplementedException("This feature is not implemented yet.");
    }

    public FitsBlock[] getOtherSpecialRecords() throws Exception {
        throw new ExecutionControl.NotImplementedException("This feature is not implemented yet.");
    }

}
