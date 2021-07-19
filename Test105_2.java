/*=================================
++++++++����(sort) �˰���++++++++
===================================
�� Test105_2.java
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

class Students
{
	String name;
	int grade;
}

public class Test105_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;				//--do while���� ���� ���� �̸� ����
		int pass = 0;
		String temp = "";
		boolean flag = false;

		System.out.print("�ο� �� �Է�: ");
		int num = sc.nextInt();

		Students[] stuArr = new Students[num];

		do
		{
			for (i=0; i<num; i++)
			{
				stuArr[i] = new Students();
				System.out.printf("�̸� ���� �Է�(%d): ", i+1);
				stuArr[i].name = sc.next();
				stuArr[i].grade = sc.nextInt();

			}
		}
		while (i>num);

		do
		{	
			flag = false;
			pass++;

			for (int j=0; j<num-pass; j++)
			{
				if (stuArr[j].grade < stuArr[j+1].grade)	//--�������� ����
				{
					stuArr[j].grade = stuArr[j].grade^stuArr[j+1].grade;
					stuArr[j+1].grade = stuArr[j+1].grade^stuArr[j].grade;
					stuArr[j].grade = stuArr[j].grade^stuArr[j+1].grade;
					
					temp = stuArr[j].name;
					stuArr[j].name = stuArr[j+1].name;
					stuArr[j+1].name = temp;

					flag = true;
				}
			}
		}
		while (flag);

		System.out.println("==========================");

		for (int j=0; j<num; j++)
			System.out.printf("%d�� %s %d\n", j+1, stuArr[j].name, stuArr[j].grade);
		
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