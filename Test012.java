/*=====================================
++++++++++�ڹ� �⺻ ���α׷���++++++++++
-������ �ڷ���
-�ڹ��� �⺻ �����: BufferedReader Ŭ����
=======================================
�� Test012.java
=====================================*/


import java.io.BufferedReader;
import java.io.InputStreamReader;	// �Էµ� �����͸� ����� ���� �� �ִ� �����ͷ� ��ȯ
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		// ��ǻ�� ��ü�� Ű���� ���� �� ���� �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int r;
		double a, b;

		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է�: ");		// println���� ���� ����� ä�� �Է��ϰ� ��
		// �� ����ڰ� �Է��� ��(���ڿ�)�� �� br.readLine()			�� ex. "50"
		//    ������(������)���� ��ȯ ��   �� Integer.parseInt()	�� ex. 50
		//    ������ ���� r�� ��Ƴ���
		r = Integer.parseInt(br.readLine());
		// �� ���� �� �ѷ� ����
		a = r * r * 3.141592;
		b = r * 2 * 3.141592;

		// ��� ���
		//System.out.println(">> ����: "+a);
		//System.out.println(">> �ѷ�: "+b);
		System.out.printf(">> ����: %.2f\n", a);
		//System.out.printf(">> �ѷ�: %f", b);

	}
}


/*
[���� ���]
���� ������ �Է�: 10
>> ����: 314.1592
>> �ѷ�: 62.83184
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/