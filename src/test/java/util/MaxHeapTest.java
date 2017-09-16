package util;

import org.junit.Assert;
import org.junit.Test;

/**
 * max heap test
 * Created by bullet on 17-9-16.
 */
public class MaxHeapTest {

  @Test
  public void buildMaxHeap() {
    MaxHeap maxHeap = new MaxHeap(new int[]{16, 4, 10, 14, 7, 9, 3, 2, 8, 1});
    int[] expect = new int[]{16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
    int[] result = maxHeap.getData();
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + ",");
    }
    Assert.assertArrayEquals(expect, result);
  }

}