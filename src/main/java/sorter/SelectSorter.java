package sorter;

import java.util.Arrays;

/**
 * select sorter
 *
 * @author bullet
 * @time 2017-09-16 上午10:04
 */
public class SelectSorter implements Sorter{


  @Override
  public int[] sort(int[] array) {

    int[] a = Arrays.copyOf(array, array.length);
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i; j < a.length; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }



    return a;
  }
}
