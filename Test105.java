/*=================================
++++++++����(sort) �˰���++++++++
===================================
�� Test105.java
=================================*/

// �� �ǽ� ����
//    ����ڷκ��� ���� �л��� ���� �����͸� ���� ���·� �Է¹޾�
//    ������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ����
// �ο� �� �Է�: 5
// �̸� ���� �Է�(1): a 90
// �̸� ���� �Է�(2): b 80
// �̸� ���� �Է�(3): c 85
// �̸� ���� �Է�(4): d 75
// �̸� ���� �Է�(5): e 95

// ==========================
// 1�� e 95
// 2�� a 90
// 3�� c 85
// 4�� b 80
// 5�� d 75
// ==========================
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.util.Scanner;


public class Test105
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;				//--do while���� ���� ���� �̸� ����
		int pass = 0;
		String temp = "";	//--�̸� �ڸ��ٲ� ����
		boolean flag;

		System.out.print("�ο� �� �Է�: ");
		int num = sc.nextInt();

		String[] name = new String[num];
		int[] grade = new int[num];

		do
		{
			for (i=0; i<num; i++)
			{
				System.out.printf("�̸� ���� �Է�(%d): ", i+1);
				name[i] = sc.next();
				grade[i] = sc.nextInt();

			}
		}
		while (i>num);

		do
		{	
			flag = false;
			pass++;

			for (int j=0; j<num-pass; j++)
			{
				if (grade[j] < grade[j+1])	//--�������� ����
				{
					grade[j] = grade[j]^grade[j+1];
					grade[j+1] = grade[j+1]^grade[j];
					grade[j] = grade[j]^grade[j+1];
					
					temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;

					flag = true;
				}
			}
		}
		while (flag);

		System.out.println("==========================");

		for (int j=0; j<num; j++)
			System.out.printf("%d�� %s %d\n", j+1, name[j], grade[j]);
		
		System.out.println("==========================");
	}
}

/*
[���� ���]
�ο� �� �Է�: 5
�̸� ���� �Է�(1): a 90
�̸� ���� �Է�(2): b 80
�̸� ���� �Է�(3): c 85
�̸� ���� �Է�(4): d 75
�̸� ���� �Է�(5): e 95
==========================
1�� e 95
2�� a 90
3�� c 85
4�� b 80
5�� d 75
==========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/