package sorter;

import java.util.Arrays;
import util.MaxHeap;

/**
 * heap sorter
 *
 * @author bullet
 * @time 2017-09-16 下午8:45
 */
public class HeapSorter implements Sorter {

  @Override
  public int[] sort(int[] array) {
    int[] a = Arrays.copyOf(array, array.length);
    MaxHeap maxHeap = new MaxHeap(a);
    int[] heapData = maxHeap.getData();
    // 直到堆的长度减少到二
    for (int i = heapData.length; i >= 2; i--) {
      int temp = heapData[0];
      heapData[0] = heapData[maxHeap.getHeapSize() - 1];
      heapData[maxHeap.getHeapSize() - 1] = temp;
      maxHeap.setHeapSize(maxHeap.getHeapSize() -1);
      maxHeap.maxHeapify(0);
    }
    return maxHeap.getData();
  }
}
