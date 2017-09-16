package util;

/**
 * array printer
 *
 * @author bullet
 * @time 2017-09-16 下午9:21
 */
public class ArrayPrinter {

  public static void printArray(int[] a) {
    for (int i : a) {
      System.out.print(i + ",");
    }
    System.out.println();
  }

}
