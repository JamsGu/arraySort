package com.hello2;

/**
 * 直接选择排序
 * 
 */
public class SelectSort {
	public static void main(String[] args) {
		// 创建一个数组，这个数组元素是乱序的
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// 创建直接排序类的对象
		SelectSort sorter = new SelectSort();
		// 调用排序对象的方法将数组排序
		sorter.sort(array);
	}

	/**
	 * 直接选择排序法
	 * 
	 * @param array
	 *            要排序的数组
	 */
	private void sort(int[] array) {
		// TODO 自动生成的方法存根
		int index;
		for (int i = 1; i < array.length; i++) {
			index = 0;
			for (int j = 1; j <= array.length - i; j++) {
				if (array[j] > array[index]) {
					index = j;
				}
			}
			// 交换在位置 array.length-i 和index（最大值）上的两个数
			int temp = array[array.length - i];// 把一个元素值保存到临时变量中
			array[array.length - i] = array[index];// 把第二个元素值保存到第一个元素单元中
			array[index] = temp;// 把临时变量也就是第一个元素值保存到第二个元素中
		}
		showArray(array);// 输出直接选择排序后的数组值
	}

	/**
	 * 显示数组中的所有元素
	 * 
	 * @param array
	 *            要显示的数组
	 */
	private void showArray(int[] array) {
		// TODO 自动生成的方法存根
		for (int i : array) {// 遍历数组
			System.out.print(">" + i);// 输出每个数组元素值
		}
		System.out.println();
	}
}
