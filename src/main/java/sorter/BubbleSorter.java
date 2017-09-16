package sorter;

import java.util.Arrays;

/**
 * bubble sorter
 *
 * @author bullet
 * @time 2017-09-16 上午9:32
 */
public class BubbleSorter implements Sorter{


  @Override
  public int[] sort(int [] array) {

    int[] a = Arrays.copyOf(array, array.length);
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] > a[j+1]) {
          int temp = a[j+1];
          a[j+1] = a[j];
          a[j] = temp;
        }
      }
    }

    return a;
  }
}
