/*=============================
++++++++++�迭(array)++++++++++
-�迭�� �迭(2���� �迭)
===============================
�� Test088.java
=============================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
/*
 1  2  3  4  5
 2  3  4  5  6
 3  4  5  6  7
 4  5  6  7  8
 5  6  7  8  9
*/
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


public class Test088
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n = 1;
		int k = 0;

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n+k;
				k++;
				System.out.printf("%3d", arr[i][j]);
			}
			k = 0;
			n++;
			System.out.println();
		}
	}
}

/*
[����� Ǯ��]
// �迭�� �迭 ���� �� �޸� �Ҵ�
int[][] arr = new int[5][5];
int n;

for (int i=0; i<arr.length; i++)
{
	n = i + 1;
	for (int j=0; j<arr[i].length; j++)
	{
		arr[i][j] = n;
		n++;
	}
}

for (int i=0; i<arr.length; i++)
{
	for (int j=0; j<arr[i].length; j++)
		System.out.printf("%3d", arr[i][j]);
	System.out.println();
}
*/

/*
[���� ���]
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/