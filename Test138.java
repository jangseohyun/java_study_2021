/*==================================
++++++�ڹ��� �ֿ�(�߿�) Ŭ����++++++
- Calendar Ŭ����
====================================
�� Test138.java
==================================*/


/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �ʱ�����
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸��� Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ����.
   �������� �޼ҵ� ������ CalendarŬ������ ���� Ŭ������
   ��GregorianCalendar�� Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   ��getInstance()����� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� ���� �ִ� �ð� ��������
   ��get()�� �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   ��getInstance()�� �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� ��¥ �ð� ������
   ���� ���� �ִ�.
*/

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �ش� ��, ���� �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//    ��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ����
// ���� �Է�: 0
// ���� �Է�: 2021
// �� �Է�: -2
// �� �Է�: 16
// �� �Է�: 7

/*
	[2021�� 7��]

 �� �� ȭ �� �� �� ��
======================
              1  2  3
  4  5  6  7  8  9 10
 11 12 13 14 15 16 17
 18 19 20 21 22 23 24
 25 26 27 28 29 30 31
======================
*/


import java.util.Scanner;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test138
{
	public static void main(String[] args)
	{	
		// ��, �� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int y, m, w, w2, last, last2;
		int d = 1, n = 1;
		int n7;

		do
		{
			System.out.print("���� �Է�: ");
			y = sc.nextInt();
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է�: ");
			m = sc.nextInt();
		}
		while (m<1 | m>12);


		// �޷� ����
		Calendar cal = new GregorianCalendar();
		cal.set(y,m-1,1);	//--�Է¹��� ������ ���� 1�Ϸ� ����
		w = cal.get(Calendar.DAY_OF_WEEK);	//--1���� �ش��ϴ� ����(�Ͽ���: 1)
		last = cal.getActualMaximum(Calendar.DATE);	//--��¥ �ִ밪(������ ��)

		Calendar cal2 = new GregorianCalendar();
		cal2.set(y,m,1);
		w2 = cal2.get(Calendar.DAY_OF_WEEK);
		last2 = cal2.getActualMaximum(Calendar.DATE);

		
		// ���
		System.out.printf("\n     [%d�� %d��]\t\t     [%d�� %d��]",y,m,y,m+1);
		System.out.print("\n �� �� ȭ �� �� �� ��\t\t �� �� ȭ �� �� �� ��\n======================\t\t======================\n");
		
		// 1�� ������ ���� ���
		for (int i=1; i<w; i++)
			System.out.print("   ");

		for (int i=1; i<=35; i++)
		{	
			if (d <= last)
			{
				System.out.printf("%3d", d);
				d++;
			}
			else
				System.out.print("   ");

			if (w == 7)
			{
				System.out.printf("           ");

				for (int j=1; j<w2; j++)
					System.out.print("   ");

				for (int j=1; j<=7-w2+1; j++)
				{
					System.out.printf("%3d", j);
					n++;
				}
			}

			if (w == 14)
			{
				System.out.printf("           ");
				
				n7 = n+7;

				for (int j=n; j<n7; j++)
				{
					System.out.printf("%3d", j);
					n++;
				}
			}
			
			if (w == 21)
			{
				System.out.printf("           ");
				
				n7 = n+7;

				for (int j=n; j<n7; j++)
				{
					System.out.printf("%3d", j);
					n++;
				}
			}

			if (w == 28)
			{
				System.out.printf("           ");
				
				n7 = n+7;

				for (int j=n; j<n7; j++)
				{
					System.out.printf("%3d", j);
					n++;
				}
			}

			if (w == 35)
			{
				System.out.printf("           ");

				for (int j=n; j<=last2; j++)
				{
					System.out.printf("%3d", j);
				}
			}

			// ����
			if (w%7==0 && w!=35 && i != last)
				System.out.println();
			w++;
		}

		System.out.print("\n======================\t\t======================\n");
		
	}
}


/*
[���� ���]
���� �Է�: 2021
�� �Է�: 3

     [2021�� 3��]                    [2021�� 4��]
 �� �� ȭ �� �� �� ��            �� �� ȭ �� �� �� ��
======================          ======================
     1  2  3  4  5  6               .
  7  8  9 10 11 12 13               .
 14 15 16 17 18 19 20               .
 21 22 23 24 25 26 27               .
 28 29 30 31
======================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/