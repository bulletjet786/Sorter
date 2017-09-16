package sorter;

import java.util.Arrays;

/**
 * merge sorter
 *
 * @author bullet
 * @time 2017-09-16 下午9:56
 */
public class RecursionMergeSorter implements Sorter{



  @Override
  public int[] sort(int[] array) {
    array = Arrays.copyOf(array, array.length);
    // 基准条件
    if (array.length == 1)
      return new int[]{array[0]};
    int mid = array.length / 2;
    int[] leftArray = sort(Arrays.copyOfRange(array, 0, mid));
    int[] rightArray = sort(Arrays.copyOfRange(array, mid, array.length));
    int[] merge = new int[leftArray.length + rightArray.length];
    for (int i = 0, j = 0, k = 0; i < merge.length; ) {
      if (j < leftArray.length && k < rightArray.length) {
        if (leftArray[j] <= rightArray[k])
          merge[i++] = leftArray[j++];
        else
          merge[i++] = rightArray[k++];
      } else {
        while (j < leftArray.length) {
          merge[i++] = leftArray[j++];
        }
        while (k < rightArray.length) {
          merge[i++] = rightArray[k++];
        }
      }
    }
    return merge;
  }




}
