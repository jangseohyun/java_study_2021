/*=======================
+++++++�迭(Array)+++++++
-�迭�� ����
=========================
�� Test099.java
=======================*/

// �� �ǽ� ����
// ������ �迭(a, b)�� ����ִ� ���ڵ��� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �ߺ��� ���ŵ� ������ �������� ����� �� �ֵ��� �Ѵ�.
// ����, �迭 ���� ������ ������� ó���� �� �ֵ��� �Ѵ�.

// ex) ������ �� �迭
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// ���� ����
// ù ��° �迭 ��Ҹ� �Է��ϼ���(���� ����): 2 3 7 10 11
// �� ��° �迭 ��Ҹ� �Է��ϼ���(���� ����): 3 6 10 14
// 2 3 7 10 11 6 1
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// 2 3 7 10 11 (3) 6 (10) 14

import java.util.Scanner;

public class Test099
{
	int[] a = {2, 3, 7, 10, 11};
	int[] b = {3, 6, 10, 14};
	
	int num = 0;		//--��ġ�� ���� ������ ���� ���� ����

	int[] copy()
	{
		int[] temp = new int[a.length+b.length];
		int n = a.length;

		for (int i=0; i<a.length; i++)
			temp[i] = a[i];

		for (int i=0; i<b.length; i++)
		{
			for (int j=0; j<temp.length; j++)
			{
				if (b[i] == temp[j])
				{
					num++;
					break;
				}
				
				if (j == temp.length-1)
				{
					temp[n] = b[i];
					n++;
					break;
				}
			}
		}

		return temp;
	}
	
	// temp = {2, 3, 7, 10, 11, 6, 0, 14, 0}
	void print(int[] temp)
	{
		for (int i=0; i<temp.length-num; i++)	//--temp.length���� ��ġ�� ���� �����ϴ� ��ŭ(num) ���� �����
			System.out.printf("%d ", temp[i]);

		System.out.println();
	}

	public static void main(String[] args)
	{
		// ������ �� �迭
		// int[] a = {2, 3, 7, 10, 11};
		// int[] b = {3, 6, 10, 14};
		
		Test099 ob = new Test099();

		int[] temp = ob.copy();
		ob.print(temp);

		ob.input();
	}
}

/*
[����� Ǯ��]
// ��� ��
// -���� a�� ��ü ��� ���
for (int i=0; i<a.length; i++)
	System.out.printf("%3d", a[i]);

// -���� b�� ��� ���
//  ��, ���� b�� ���� a�� ��ҿ� �ߺ��Ǵ� �����͸� �����ϸ鼭 ���
for (int i=0; i<b.length; i++)
{
	boolean flag = false;

	for (int j=0; j<a.length; j++)
	{
		if (b[i] == a[j])
		{
			flag = true;
			break;			//--����� + ����������(j���� �ݺ��� Ż��)
		}
	}
	if (flag)				//--flag�� true���
		continue;			//--�޺κ� �����ϰ� ����ϱ�

	System.out.printf("%3d", b[i]);
}
System.out.println();


// ��� ��
// -�ӽ� �迭�� �����
int[] temp = new int[a.length + b.length]

// -������� �ӽ� �迭�� �ߺ����� ���� �迭 ��Ҹ� ä�� ����
int n;		//--������ ���� ��ġ �߿�(temp[n]�� ����)

for (int n=0; n<a.length; n++)
	temp[n] = a[n];

for (int k=0; k<b.length; k++)
{
	boolean flag = false;

	for (int m=0; m<a.length; m++)
	{
		if (b[k] == a[m])
		{
			flag = true;
			break;
		}

		if (flag)
		continue;
	
		temp[n] = b[k];
		n++
	}

	// �׷��� ������ �ӽ� �迭�� ���(ä������ŭ�� ���)
	for (int h=0; h<n; h++)
		System.out.printf("%3d", temp[h]);
	System.out.println();
}
*/

/*
2 3 7 10 11 6 14
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/