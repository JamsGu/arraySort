package com.hello2;

/**
 * 冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		// 创建一个数组，这个数组元素是乱序的
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// 创建冒泡排序类的对象
		BubbleSort hj = new BubbleSort();
		// 调用排序方法把数组排序
		hj.sort(array);
	}

	/**
	 * 冒泡排序
	 * 
	 * @param array
	 *            要排序的数组
	 */
	private void sort(int[] array) {
		// TODO 自动生成的方法存根
		for (int i = 1; i < array.length; i++) {
			// 比较两个相邻的元素，较大的数往后冒泡
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];// 把一个元素值保存到临时变量中
					array[j] = array[j + 1];// 把第二个元素值保存到第一个元素单元中
					array[j + 1] = temp;// 把临时变量（也就是第一个元素原值）保存到第二个元素中
				}
			}
		}
		showArray(array); // 输出冒泡排序后的数组元素
	}

	/**
	 * 显示数组中的所有元素
	 * 
	 * @param array
	 *            要显示的数组
	 */
	public void showArray(int[] array) {
		for (int i : array) { // 遍历数组
			System.out.print("<" + i + "> "); // 输出每个数组元素值
		}
		System.out.println();
	}

}
