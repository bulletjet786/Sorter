package util;

import org.junit.Assert;
import org.junit.Test;

/**
 * min heap test
 * Created by bullet on 17-9-16.
 */
public class MinHeapTest {

  @Test
  public void buildMinHeapTest() {

    MinHeap minHeap = new MinHeap(new int[]{16, 14, 3, 2, 5, 6, 8});
    int[] expect = new int[]{2, 5, 3, 14, 16, 6,8};
    int[] result = minHeap.getData();
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + ",");
    }
    Assert.assertArrayEquals(expect, result);


  }

}