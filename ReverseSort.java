package com.hello2;

/**
 * ��ת����
 */
public class ReverseSort {
	public static void main(String[] args) {
		// ����һ������
		int[] array = { 10, 20, 30, 40, 50, 60 };
		// ����һ����ת������Ķ���
		ReverseSort sorter = new ReverseSort();
		// �����������ķ��������鷴ת
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
		System.out.println("����ԭ�����ݣ�");
		showArray(array);// �������ǰ������ֵ
		int temp;
		int len = array.length;
		for (int i = 0; i < len / 2; i++) {
			temp = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = temp;
		}
		System.out.println("���鷴ת�����ݣ�");
		showArray(array);// �������������ֵ
	}

	/**
	 * ��ʾ�����е�����Ԫ��
	 * 
	 * @param array
	 *            Ҫ��ʾ������
	 */
	private void showArray(int[] array) {
		// TODO �Զ����ɵķ������
		for (int i : array) {
			System.out.print("\t" + i);
		}
		System.out.println();
	}
}
