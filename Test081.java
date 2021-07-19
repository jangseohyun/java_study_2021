/*=============================
++++++++++�迭(array)++++++++++
-�迭�� ����� �ʱ�ȭ
-�迭�� �⺻���� Ȱ��
===============================
�� Test081.java
=============================*/


// �� �ǽ� ����
//    ������ �������� ����ִ� �迭�� ���� �����͵� ��
//    ¦���� ��Ҹ� ��� ����ϰ�
//    3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ѵ�.

// �� �迭�� �����ϴ� ������ ����
//    �� 4 7 9 1 3 2 5 6 8

// ���� ����
// �迭 ��� ��ü ���
// 4 7 9 1 3 2 5 6 8
// ¦�� ������ ���
// 4 2 8 6
// 3�� ��� ������ ���
// 9 3 6


public class Test081
{
	public static void main(String[] args)
	{
		int arr[];
		arr = new int[9];

		arr[0]=4;
		arr[1]=7;
		arr[2]=9;
		arr[3]=1;
		arr[4]=3;
		arr[5]=2;
		arr[6]=5;
		arr[7]=6;
		arr[8]=8;

		System.out.println("�迭 ��� ��ü ���");
		
		for (int i=0; i<9; i++)
			System.out.print(arr[i]+" ");

		System.out.println("\n¦�� ������ ���");

		for (int i=0; i<9; i++)
		{
			if (arr[i] % 2 == 0)
				System.out.print(arr[i]+" ");
		}

		System.out.println("\n3�� ��� ������ ���");

		for (int j=0; j<9; j++)
		{
			if (arr[j] % 3 == 0)
				System.out.print(arr[j]+" ");
		}
		
		System.out.println();
	}
}

/*
[����� Ǯ��]
// �迭 ���� �� �ʱ�ȭ
// ��� ��
int[] arr = new int[9];
arr[0] = 4;
arr[1] = 7;
arr[2]=9;
arr[3]=1;
arr[4]=3;
arr[5]=2;
arr[6]=5;
arr[7]=6;
arr[8]=8;

// ��� ��
int[] arr = {4,7,9,1,3,2,5,6,8}
System.out.println(arr);	//--[I@15db9742

System.out.println("�迭 ��� ��ü ���");
for (int i=0; i<9; i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println();

// �� �迭 arr�� ����(���� ����) Ȯ��
//    ��arr.length��

System.out.println("�迭 arr�� ����: "+arr.length);	//--9
*/


/*
[���� ���]
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/