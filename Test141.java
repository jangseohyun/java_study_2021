/*==================================
++++++�ڹ��� �ֿ�(�߿�) Ŭ����++++++
- Random Ŭ����
====================================
�� Test141.java
==================================*/

/*
�� java.util.Random Ŭ������

   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
   0.0~1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ� ���� Ŭ������ Random Ŭ������
   ������ �����ϰ� �ִ�.
*/

// �ζ� ��ȣ ������ (���� �߻� ���α׷�)
// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
// 1 3 4 17 23 44
// 1 2 8 16 28 42
//		|
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

import java.util.Random;


class Lotto
{
	Random rd = new Random();
	int[] n = new int[6];

	void nums()
	{
		for (int i=0; i<n.length; i++)
		{
			n[i] = rd.nextInt(45)+1;	//--1~45
			
			for (int j=0; j<i; j++)		//--�ߺ� ���� ����(i�� �ڷ� ������ ���ڸ� �ٽ� ����)
			{
				if (n[j] == n[i])
					i--;
			}
		}
	}

	void sort()
	{
		for (int i=0; i<n.length-1; i++)
		{
			boolean flag = false;

			for (int j=0; j<n.length-1; j++)
			{
				if (n[j] > n[j+1])
				{
					n[j] = n[j]^n[j+1];
					n[j+1] = n[j+1]^n[j];
					n[j] = n[j]^n[j+1];
					flag = true;
				}
			}

			if (!flag)
				break;
		}
	}

	void print()
	{
		for (int i=0; i<n.length; i++)
			System.out.printf("%2d ", n[i]);
	}
}


public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		
		for (int i=0; i<5; i++)
		{
			lotto.nums();
			lotto.sort();
			lotto.print();
			System.out.println();
		}
	}
}

/*
[����� Ǯ��]
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6��
	private int[] num = new int[6];		//--information hiding

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6�� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;
		
		jump:	//--continue label
		while (cnt < 6)	//--cnt �� 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;		//--1~45

			for (int i=0; i<cnt; i++)	//--�� ���� �ϰ� ���
			{
				if(num[i] == n)
					continue jump;
			}

			num[cnt++] = n;
		}

		// ���� �޼ҵ� ȣ��
		sorting();
	}

	// ���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);
	}

}

public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		
		for (int i=1; i<=5; i++_
		{
			lotto.start();

			for (int n : lotto.getNum())
				System.out.printf("%4d", n");

			System.out.println();
		}
	}
}
*/


/*
[���� ���]
13 19 24 27 29 35
18 23 28 29 33 34
15 16 24 30 34 43
 1  3  9 31 32 35
 1  7 12 36 39 43
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/