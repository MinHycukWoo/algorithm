package algorithmchapter;

import java.util.Scanner;

/*
 * �⺻ �ڷᱸ���� �迭�� ����Ʈ�� �ȹٷ� ����
 * �迭 : �޸��� ���Ӱ����� ���� ä���� �ִ� ������ �迭����
 * 		�迭�� ���� �ε����� ���� �����Ҽ� ������ (������ �ڷ���)�� ���� ������ �� �ֽ��ϴ�.
 * 
 * �ε��� 	:0, 1,  2,  3,  4
 * ��		:��1,��2,��3,��4,��5
 * �迭�� Ư¡
 * 1.�ε����� ����Ͽ� (���� �ٷ� �����Ҽ� �ִ�)
 * 2.���ο� ���� �����ϰų� Ư�� �ε����� �ִ� ���� �����ϱ� ��ƴ�.
 *   ���� �����ϰų� �����Ϸ��� �ش��ε��� �ֺ��� �ִ� ���� �̵���Ű�� ������ �ʿ��ϴ�
 * 3.�迭�� ũ��� �����Ҷ� ������ �� ������ �ѹ� �����ϸ� ũ�⸦ �ø��ų� ���ϼ� ����
 * 4.������ �����ϹǷ� �ڵ��׽�Ʈ�� ���� ���ȴ�
 * 
 * ���� 
 * ������ �����ϰ� ���� ������ ������ ���쳪 ��ȭ�� �����
 * 
 * */

/*
 * ����Ʈ
 * ����Ʈ�� ���� �����͸� ���� ����� ���� �����ͷ� ������ �ڷᱸ���Դϴ�.
 * *���� ��ǻ�Ͱ��п��� ��,�����͸� ������ ���� ���ʴ����� �θ��� ���Դϴ�.
 * 
 * ����Ʈ�� Ư¡
 * 1.�ε����� �����Ƿ� ���� �����Ϸ��� Head �����ͺ��� ������� �����ؾ� �Ѵ�.
 *   �ٽø��� ���� ������ ������.
 * 
 * 2.�����ͷ� ����Ǿ� �����Ƿ� �����͸� �����ϰų� �����ϴ� ����ӵ��� ������.
 * 3.������ �� ũ�⸦ ������ �������� �ʾƵ� �ȴ�. �ٽø��� ����Ʈ�� ũ��� ������ ���� ������
 *   ũ�Ⱑ ���ϱ� ���� �����͸� �ٷ궧 �����ϴ�
 * 4.�����͸� ���� ������ �ʿ��ϹǷ� �迭���� ������ �����ϴ�
 * 
 * ���� 
 * ������ �����ϰ� ���� ������ ������ ����쳪 ��ȭ�� ����.
 * 
 * */
public class Chapter1 {

	/*1. ������ �� ���ϱ�
	 *N���� ���ڰ� ������� ���ִ�. �� ���ڸ� ��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	 *�Է�
	 *1���� �ٿ��� ������ ���� N(1<= N <= 100)
	 *2���� �ٿ��� ���� N���� ������� �־�����.
	 *
	 * ���
	 * �Է����� �־��� ���� N���� ���� ����Ѵ�.
	 * */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//ù���� �Է°�
		//�Է°��� Spring�� ���� sNum�� ������ char[] �� ������ ��ȯ�ϱ�
		String sNum = sc.next();//�ι�° �Է°�
		char[] cNum = sNum.toCharArray();
		//�ι��� �Է°��� char�� �ϳ��� ���� �迭�� �����Ѵ�.
		//�׷��ϱ� 1���� 9�� �Ǵ¼�
		
		int sum = 0;
		for(int i=0; i<cNum.length; i++) {
			//System.out.print("??" + cNum[i]);
			sum += cNum[i] - '0';
			//cNum[i] �� ���������� ��ȯ�ϸ鼭 sum�� ���Ͽ� �����ϱ�
			//char���� ����0�� ������� ������ ���������� ��޵ȴ�.
		}
		//�迭��ŭ �ݺ��ؼ� ��� ���� ������
		System.out.print(sum);
				
	}
	
	
}