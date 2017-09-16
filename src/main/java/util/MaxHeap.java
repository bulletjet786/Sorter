package util;

/**
 * 大顶堆
 *
 * @author Bullet
 * @time 2017-09-13 13:31
 */
public class MaxHeap {

  /**
   * data数组保存最大堆所有的数据，数据被组织成树形
   * 最大堆满足原则：对于父结点，其左右结点均小于等于父节点
   * 其中0号结点为根节点，对于结点i，其左右结点分别为(2 * i) + 1, (2 * i) + 2
   */
  private int[] data = new int[16 - 1];
  private int heapSize;

  /**
   * @before 要求左右子树都遵循最大堆原则
   * 通过让i接点的值逐级下降，使得i结点遵循最大堆原则
   * @param rootIndex 需要最大化的结点索引
   */
  public void maxHeapify(int rootIndex) {
    int leftIndex = getLeftIndex(rootIndex);
    int rightIndex = getRightIndex(rootIndex);

    int largestIndex = rootIndex;
    // 从左右两个堆中找出最大结点
    if (leftIndex != -1 && data[leftIndex] > data[largestIndex])
      largestIndex = leftIndex;
    if (rightIndex != -1 && data[rightIndex] > data[largestIndex])
      largestIndex = rightIndex;

    // 如果都比当前结点小，则当前结点肯定遵循最大堆原则
    // 否则交换最大结点和当前结点的值，之后最大结点可能不再符合最大堆原则，对其进行最大堆化
    if (largestIndex == rootIndex)
      return;
    else {
      int temp = data[largestIndex];
      data[largestIndex] = data[rootIndex];
      data[rootIndex]= temp;
      maxHeapify(largestIndex);
    }

  }

  public int getHeapSize() {
    return heapSize;
  }

  public void setHeapSize(int heapSize) {
    this.heapSize = heapSize;
  }

  public MaxHeap(int[] array) {
    heapSize = array.length;

    buildMaxHeap(array);
  }

  /**
   * 返回父节点的值
   * @param i 指定的当前结点
   * @return 返回父节点的值，对于根结点，返回null
   */
  public Integer getParent(int i) {
    if (i == 0)
      return null;
    else
      return data[(i - 1) / 2];
  }

  /**
   * 返回父节点索引
   * @param i 指定的当前结点
   * @return 返回父节点的值，对于根结点，返回-1
   */
  public int getParentIndex(int i) {
    if (i == 0)
      return -1;
    else
      return data[(i - 1) / 2];
  }

  /**
   * 左子节点索引
   * @param i 指定的当前结点
   * @return 返回左子节点的值，如果当前结点是叶子结点，返回-1
   */
  public int getLeftIndex(int i) {
    return ((2 * i + 1) > heapSize - 1 ) ? -1 : (2 * i + 1);
  }

  /**
   * 右子节点索引
   * @param i 指定的当前结点
   * @return 返回右子节点的值，如果当前结点是叶子结点，返回-1
   */
  public int getRightIndex(int i) {
    return ((2 * i + 2) > heapSize - 1 ) ? -1 : (2 * i + 2);
  }


  public void buildMaxHeap(int[] array) {
    data = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      data[i] = array[i];
    }

    // 从最后一个非叶子结点开始，向上不断最大堆化
    for (int i = heapSize / 2 - 1; i >= 0 ; i--) {
      maxHeapify(i);
    }
  }

  public int[] getData() {
    return data;
  }
}
