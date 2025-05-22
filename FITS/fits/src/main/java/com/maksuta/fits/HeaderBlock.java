package com.maksuta.fits;

import java.util.Arrays;

/**
 * @author John Maksuta
 * @apiNote From Section 3.2 Individual FITS Structures
 *          The header blocks shall contain only the restricted set of
 *          ASCII-text characters, decimal 32 through 126 (hexadecimal 0x20
 *          through 0x7E)
 * 
 *          The ASCII control character with decimal values less than 32
 *          (including the null, tab, carriage return, and line-ffed
 *          characters), and the delete character (decimal 127 or hexadecimal
 *          0X7F) MUST NOT apear anywhere within a header block.
 */
public class HeaderBlock extends FitsBlock {

    private KeywordRecord[] keywordRecords;

    public HeaderBlock() {
        this.keywordRecords = new KeywordRecord[36];
    }

    public HeaderBlock(FitsBlock fitsBlock) {
        // TODO Auto-generated constructor stub
    }

    @Override
    byte[] getData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getData'");
    }

    public int getNAXIS() {
        int result = 0;
        KeywordRecord[] records = this.keywordRecords.clone();
        Arrays.sort(records);
        int index = Arrays.binarySearch(records, "NAXIS");
        if (index > -1) {
            result = Integer.parseInt(this.keywordRecords[index].getValue());
        }
        return result;
    }

    public int getNAXISn(int n) {
        int result = 0;
        KeywordRecord[] records = this.keywordRecords.clone();
        Arrays.sort(records);
        int index = Arrays.binarySearch(records, String.format("NAXIS%d", n));
        if (index > -1) {
            result = Integer.parseInt(this.keywordRecords[index].getValue());
        }
        return result;
    }

}
