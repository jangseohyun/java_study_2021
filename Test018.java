/*=====================================
++++++++++�ڹ� �⺻ ���α׷���++++++++++
-�ڹ��� �⺻ �����: java.util.Scanner
=======================================
�� Test018.java
=====================================*/

// �� ��java.util.Scanner��
//     �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//     ����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� �����̴�.
//     �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���,
//     �ٸ� ������ ������ ��ȯ�� �� �ִ�.


import java.util.Scanner;


public class Test018
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �ֿ� ���� ����
		String name;
		int kor, eng, mat, tot;

		// ���� �� ó��
		System.out.print("�̸� ���� ���� ���� �Է�(���� ����): ");
		
		// ����ڰ� �Է��� �����͸� �� ������ ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// ���� ����
		tot = kor + eng + mat;

		// ��� ���
		System.out.println();
		System.out.printf("�̸�: %s%n", name);
		System.out.printf("����: %d%n", tot);
	}
}


/*
[���� ���]
�̸� ���� ���� ���� �Է�(���� ����): �弭�� 90 80 70

�̸�: �弭��
����: 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/