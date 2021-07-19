/*==================================
++++++�ڹ��� �ֿ�(�߿�) Ŭ����++++++
- Calendar Ŭ����
====================================
�� Test139.java
==================================*/


// �� �ǽ� ����
//    ������ ��������
//    �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
//    ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, Calendar Ŭ������ Ȱ���Ͽ� ó���Ѵ�.

// ���� ����)
// ���� ��¥: 2021-3-8 ������
// ��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�?: 200

// =======[ Ȯ�� ��� ]=======
// 200�� ��: 2021-xx-xx x����
// ===========================
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// �� Ư�� ��¥�� �������� ������ ���ϴ� ���� �޼ҵ�
//    ����¥��ü.add(Calendar.DATE, ����)��


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Test139
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		String[] week = {"","�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};

		// ���� ��¥ ���
		System.out.printf("���� ��¥: %d-%d-%d %s\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), week[cal.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�?: ");
		int date = sc.nextInt();

		cal.add(Calendar.DAY_OF_MONTH, date);

		System.out.println("\n=======[ Ȯ�� ��� ]=======");
		System.out.printf("%d�� ��: %d-%d-%d %s\n", date, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), week[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("===========================");
	}
}

/*
[����� Ǯ��]
// Scanner �ν��Ͻ� ����
Scanner sc = new Scanner(System.in);

// Calendar �ν��Ͻ� ����
Calendar now = Calendar.getInstance();

// �ֿ� ���� ����
int nalsu;			//--����ڷκ��� �Է¹��� ����
int y, m, d, w;		//--��, ��, ��, ����
Stirng[] week = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};

// ������ ��, ��, ��, ���� Ȯ��(��������: get())
y = now.get(Calendar.YEAR);
m = now.get(Calendar.MONTH)+1;
d = now.get(Calendar.DATE);
w = now.get(Calendar.DAY_OF_WEEK);

// ������ ��, ��, ��, ���� Ȯ�� ��� ���
System.out.printf("���� ��¥: %tF %tA", now, now);	//--���� ��¥: 2021-03-08 ������

do
{
	System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�?: ");
	nalsu = sc.nextInt();
}
while(nalsu<1);

// ���� ���ϱ� ����
now.add(Calendar.DATE, nalsu);

// ��� ���
System.out.println();
System.out.println("\n=======[ Ȯ�� ��� ]=======");
System.out.printf("%d�� ��: %tF %tA\n", nalsu, now, now);
System.out.println("============================");
*/


/*
[���� ���]
���� ��¥: 2021-3-8 ������
��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�?: 200

=======[ Ȯ�� ��� ]=======
200�� ��: 2021-9-24 �ݿ���
===========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/