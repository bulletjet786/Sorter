package sorter;

import java.util.Arrays;

/**
 * insert sorter
 *
 * @author bullet
 * @time 2017-09-16 上午10:22
 */
public class InsertSorter implements Sorter {


  @Override
  public int[] sort(int[] array) {
    int[] a = Arrays.copyOf(array, array.length);
    // 先讲第一个元素视为已排序的数组，从第二个元素开始，不断向其中插入
    for (int i = 1; i < array.length; i++) {
      int key = a[i];
      int j = i - 1;
      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[++j] = key;
    }
    return a;
  }
}
