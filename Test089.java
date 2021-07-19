/*=============================
++++++++++�迭(array)++++++++++
-�迭�� �迭(2���� �迭)
===============================
�� Test089.java
=============================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
/*
 1  2  3  4  5
 5  1  2  3  4   1.0 
 4  5  1  2  3   2.0 2.1
 3  4  5  1  2   3.0 3.1 3.2
 2  3  4  5  1   4.0 4.1 4.2 4.3
*/
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


public class Test089
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n = 1;

		for (int i=0; i<arr.length; i++)	//--��) i=2
		{
			for (int j=i; j<arr[i].length; j++) //--��) j = 2 3 4
			{
				arr[i][j] = n;
				n++;
			}
			for (int k=0; k<i; k++)	//--��) k = 0 1
			{
				arr[i][k] = n;
				n++;
			}
			n = 1;
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	}
}

/*
[����� Ǯ��]
// �迭�� �迭 ���� �� �޸� �Ҵ�
int[][] arr = new int[5][5];

// �ʱ�ȭ
// 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5
for (int a=0; a<arr.length; a++)	//--a �� 0 1 2 3 4
{
	for (int b=a, n=1; n<=5; n++)	//--n �� 1 2 3 4 5
	{
		arr[a][b] = n;
		b++;
		if (b==5)
			b=0;
		// a=0 �� (0,0) 1 (0,1) 2 (0,2) 3 (0,3) 4 (0,4) 5
		// a=1 �� (1,1) 1 (1,2) 2 (1,3) 3 (1,4) 4 �� (1,0) 5
		// a=2 �� (2,2) 1 (2,3) 2 (2,4) 3 �� (2,0) 4 (2,1) 5
	}
}

// �迭�� �迭 ��� ��ü ���
for (int i=0; i<arr.length; i++)
{
	for (int j=0; j<arr[i].length; j++)
		System.out.printf("%3df", arr[i][j]);
	System.out.println();
}
*/


/*
[���� ���]
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/