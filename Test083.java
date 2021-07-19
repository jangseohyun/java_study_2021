/*=============================
++++++++++�迭(array)++++++++++
-�迭�� �⺻���� Ȱ��
===============================
�� Test083.java
=============================*/

// �� �ǽ� ����
// ����ڷκ��� �ο� ���� �Է¹ް�
// �̷��� �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹޾�
// �Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : �ڵ��� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ����� 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : �層�� 010-3333-3333

// --------------------
// ��ü �л� �� : 3��
// --------------------
//	�̸�	 ��ȭ��ȣ
// �ڵ��� 010-1111-1111
// ����� 010-2222-2222
// �層�� 010-3333-3333
// ---------------------
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// �̸�, ��ȭ��ȣ �迭 ����


import java.util.Scanner;


public class Test083
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10): ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);
		
		String nameArr[];
		nameArr = new String[num];
		String phoneArr[];
		phoneArr = new String[num];
		
		
		for (int i=0; i<num; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����): ", num);
			nameArr[i] = sc.next();
			phoneArr[i] = sc.next();
		}
		
		/*
		int i = 0;

		do
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����): ", num);
			nameArr[i] = sc.next();
			phoneArr[i] = sc.next();
			i++;
		}
		while (i<num);
		*/

		System.out.println("--------------------");
		System.out.printf(" ��ü �л� ��: %d��\n", num);
		System.out.println(" �̸�    ��ȭ��ȣ");
		
		for (int j=0; j<nameArr.length; j++)
			System.out.println(nameArr[j]+" "+phoneArr[j]);

		System.out.println("--------------------");
	}
}

/*
[����� Ǯ��]
import java.util.Scanner;

public class Test083
{
	public static void main(String[] args) 
	{
	
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڰ� �Է��ϴ� �л����� ��Ƶ� ����
		int memCount = 0;

		// �� ����� �Է°� �޾ƿ���	// �ϴ� ���� �޾ƾ� �ϴϱ� do~while��
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);

		// �׽�Ʈ
		// System.out.println("����ڰ� �Է��� �ο� �� : " + memCount);
		
		// �� �̸� ���� �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] names = new String[memCount];

		// �� ��ȭ��ȣ ���� �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
				// ��ȣ ������ ���� �������� ������ �� ��
				// 0���� �����ϴ� ��� �߸� ����� �� �ֱ� ����
		String[] tels = new String[memCount];	//--String[] tels = new String[names.length];

		// �� �ݺ����� Ȱ���Ͽ� ������� �Է� �����͸� �迭�� ��Ƴ���
		for (int n=0; n<memCount; n++)	//--memCount == names.length == tels.length
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����): ", (n+1));
			names[n] = sc.next();
			tels[n] = sc.next();
		}

		// �� ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("--------------------");
		System.out.printf(" ��ü �л� ��: %d��\n", memCount);
		System.out.println(" �̸�    ��ȭ��ȣ");

		for (int m=0; m<memCount; m++)
			System.out.printf("%3s %14s\n", names[m], tels[m]);

		System.out.println("--------------------");
	}
}
*/


/*
[���� ���]
�Է� ó���� �л� �� �Է�(��, 1~10): 3
�̸� ��ȭ��ȣ �Է�[3](���� ����): ������ 010-0000-0000
�̸� ��ȭ��ȣ �Է�[3](���� ����): ��ȿ�� 010-0000-0000
�̸� ��ȭ��ȣ �Է�[3](���� ����): ����Ƽ 127-0000-0000
--------------------
 ��ü �л� ��: 3��
 �̸�    ��ȭ��ȣ
������ 010-0000-0000
��ȿ�� 010-0000-0000
����Ƽ 127-0000-0000
--------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/