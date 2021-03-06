package org.razertory.datastructure.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthBigestTest {
    private int index = 0;
    private int []nums = null;
    private KthBigest kthBigest = null;

    @Before
    public void setup() {
       index = 1;
      // nums = new int[] {9,3,2,4,8};
        nums = new int[]{1,3,4,2};
       kthBigest = new KthBigest();
    }

    @Test
    public void kthLargestElement() {
        Assert.assertEquals(4, kthBigest.kthLargestElement(index, nums));
    }
}