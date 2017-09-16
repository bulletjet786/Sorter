package sorter;

import java.util.Arrays;

/**
 * shell sorter
 *
 * @author bullet
 * @time 2017-09-16 上午10:20
 */
public class ShellSorter implements Sorter {

  private static int[] steps = new int[]{1, 5, 19, 41, 109, 209, 505, 929, 2161, 3905, 8929, 16001, 36289,
      64769, 146305, 260609, 587521, 1045505, 2354689, 4188161, 9427969, 16764929, 37730305,
      67084289, 150958081, 268386305, 603906049, 1073643521};

  /**
   * 生成Sedgewick提出的增量序列，其中n为序列的长度
   * 1, 5, 19, 41, 109, 209, 505, ......
   *
   * @param n 生成的序列的长度，最大为28，不然会溢出
   * @return 该增量序列
   */
  public static int[] StepSeqOfSedgewick(int n) {
    int[] seq = new int[n];
    for (int i = 0; i < seq.length; i++) {
      if (i % 2 == 0) {
        int k = i / 2;
        seq[i] = 9 * (int) (Math.pow(4, k) - Math.pow(2, k)) + 1;    // 1, 19, 109, 505, ...
      } else {
        int k = (i - 1) / 2;
        seq[i] = (int) (Math.pow(2, k + 2) * (Math.pow(2, k + 2) - 3) + 1); // 5, 41, 209, ...
      }
    }
    return seq;
  }

  @Override
  public int[] sort(int[] array) {
    int[] a = Arrays.copyOf(array, array.length);
    // 先讲第一个元素视为已排序的数组，从第二个元素开始，不断向其中插入
    for (int s = steps.length - 1; s >= 0; s--) {
      for (int i = 1; i < array.length; i++) {
        int key = a[i];
        int j = i - steps[s];
        while (j >= 0 && a[j] > key) {
          a[j + steps[s]] = a[j];
          j -= steps[s];
        }
        a[steps[s] + j] = key;
      }
    }
    return a;
  }


}
