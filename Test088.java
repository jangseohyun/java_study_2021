/*=============================
++++++++++배열(array)++++++++++
-배열의 배열(2차원 배열)
===============================
◎ Test088.java
=============================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예시
/*
 1  2  3  4  5
 2  3  4  5  6
 3  4  5  6  7
 4  5  6  7  8
 5  6  7  8  9
*/
// 계속하려면 아무 키나 누르십시오 . . .


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
[강사님 풀이]
// 배열의 배열 선언 및 메모리 할당
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
[실행 결과]
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
계속하려면 아무 키나 누르십시오 . . .
*/