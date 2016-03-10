package com.hello2;

/**
 * ֱ��ѡ������
 * 
 */
public class SelectSort {
	public static void main(String[] args) {
		// ����һ�����飬�������Ԫ���������
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// ����ֱ��������Ķ���
		SelectSort sorter = new SelectSort();
		// �����������ķ�������������
		sorter.sort(array);
	}

	/**
	 * ֱ��ѡ������
	 * 
	 * @param array
	 *            Ҫ���������
	 */
	private void sort(int[] array) {
		// TODO �Զ����ɵķ������
		int index;
		for (int i = 1; i < array.length; i++) {
			index = 0;
			for (int j = 1; j <= array.length - i; j++) {
				if (array[j] > array[index]) {
					index = j;
				}
			}
			// ������λ�� array.length-i ��index�����ֵ���ϵ�������
			int temp = array[array.length - i];// ��һ��Ԫ��ֵ���浽��ʱ������
			array[array.length - i] = array[index];// �ѵڶ���Ԫ��ֵ���浽��һ��Ԫ�ص�Ԫ��
			array[index] = temp;// ����ʱ����Ҳ���ǵ�һ��Ԫ��ֵ���浽�ڶ���Ԫ����
		}
		showArray(array);// ���ֱ��ѡ������������ֵ
	}

	/**
	 * ��ʾ�����е�����Ԫ��
	 * 
	 * @param array
	 *            Ҫ��ʾ������
	 */
	private void showArray(int[] array) {
		// TODO �Զ����ɵķ������
		for (int i : array) {// ��������
			System.out.print(">" + i);// ���ÿ������Ԫ��ֵ
		}
		System.out.println();
	}
}
