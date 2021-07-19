/*=============================
++++++++++배열(array)++++++++++
-배열의 배열(2차원 배열)
===============================
◎ Test089.java
=============================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예시
/*
 1  2  3  4  5
 5  1  2  3  4   1.0 
 4  5  1  2  3   2.0 2.1
 3  4  5  1  2   3.0 3.1 3.2
 2  3  4  5  1   4.0 4.1 4.2 4.3
*/
// 계속하려면 아무 키나 누르십시오 . . .


public class Test089
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n = 1;

		for (int i=0; i<arr.length; i++)	//--예) i=2
		{
			for (int j=i; j<arr[i].length; j++) //--예) j = 2 3 4
			{
				arr[i][j] = n;
				n++;
			}
			for (int k=0; k<i; k++)	//--예) k = 0 1
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
[강사님 풀이]
// 배열의 배열 선언 및 메모리 할당
int[][] arr = new int[5][5];

// 초기화
// 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5
for (int a=0; a<arr.length; a++)	//--a → 0 1 2 3 4
{
	for (int b=a, n=1; n<=5; n++)	//--n → 1 2 3 4 5
	{
		arr[a][b] = n;
		b++;
		if (b==5)
			b=0;
		// a=0 → (0,0) 1 (0,1) 2 (0,2) 3 (0,3) 4 (0,4) 5
		// a=1 → (1,1) 1 (1,2) 2 (1,3) 3 (1,4) 4 → (1,0) 5
		// a=2 → (2,2) 1 (2,3) 2 (2,4) 3 → (2,0) 4 (2,1) 5
	}
}

// 배열의 배열 요소 전체 출력
for (int i=0; i<arr.length; i++)
{
	for (int j=0; j<arr[i].length; j++)
		System.out.printf("%3df", arr[i][j]);
	System.out.println();
}
*/


/*
[실행 결과]
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/