import org.junit.Assert;
import org.junit.Test;
import sorter.BubbleSorter;
import sorter.HeapSorter;
import sorter.InsertSorter;
import sorter.RecursionMergeSorter;
import sorter.SelectSorter;
import sorter.ShellSorter;
import sorter.Sorter;

/**
 * bubble sorter test
 *
 * @author bullet
 * @time 2017-09-16 上午9:43
 */
public class SorterTest {

  @Test
  public void selectSortTest() {
    int[] array = new int[]{1, 3, 7, 3, 5, 2, 8};
    int[] expect = new int[]{1, 2, 3, 3, 5, 7, 8};
    Sorter sorter = new SelectSorter();
    int[] result = sorter.sort(array);
    Assert.assertArrayEquals(expect, result);
  }

  @Test
  public void bubbleSortTest() {
    int[] array = new int[]{1, 3, 7, 3, 5, 2, 8};
    int[] expect = new int[]{1, 2, 3, 3, 5, 7, 8};
    Sorter sorter = new BubbleSorter();
    int[] result = sorter.sort(array);
    Assert.assertArrayEquals(expect, result);
  }

  @Test
  public void heapSortTest() {
    int[] array = new int[]{1, 3, 7, 3, 5, 2, 8};
    int[] expect = new int[]{1, 2, 3, 3, 5, 7, 8};
    Sorter sorter = new HeapSorter();
    int[] result = sorter.sort(array);
    Assert.assertArrayEquals(expect, result);
  }

  @Test
  public void insertSortTest() {
    int[] array = new int[]{1, 3, 7, 3, 5, 2, 8};
    int[] expect = new int[]{1, 2, 3, 3, 5, 7, 8};
    Sorter sorter = new InsertSorter();
    int[] result = sorter.sort(array);
    Assert.assertArrayEquals(expect, result);
  }

  @Test
  public void recursionMergeSortTest() {
    int[] array = new int[]{1, 3, 7, 3, 5, 2, 8};
    int[] expect = new int[]{1, 2, 3, 3, 5, 7, 8};
    Sorter sorter = new RecursionMergeSorter();
    int[] result = sorter.sort(array);
    Assert.assertArrayEquals(expect, result);
  }

  @Test
  public void shellSortTest() {
    int[] array = new int[]{1, 3, 7, 3, 5, 2, 8};
    int[] expect = new int[]{1, 2, 3, 3, 5, 7, 8};
    Sorter sorter = new ShellSorter();
    int[] result = sorter.sort(array);
    Assert.assertArrayEquals(expect, result);
  }

}
