/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- 반복문 (for문) 실습
- 별찍기 실습
====================================
◎ Test060.java
==================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*
    *
   **
  ***
 ****
*****
*/

/*
public class Test060
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>0; j--)	
			{													
				if (j>i)					//--예) 1번째 줄: i=1, j=5
					System.out.print(" ");	//--예) 1번째 줄: j=5→4→3→2→
				else
					System.out.print("*");	//--예) 1번째 줄: j=1
			}
			System.out.println();		
		}
	}
}
*/

public class Test060
{
	public static void main(String[] args)
	{
		for (int i=0; i<5; i++)
		{
			for (int j=4; j>i; j--)		//--" "이 4개부터 시작해서 1개씩 줄어가는 형태(마지막 줄에는 0개여야 함)
				System.out.print(" ");

			for (int k=0; k<=i; k++)
				System.out.print("*");	//--"*"이 1개부터 시작해서 1개씩 늘어가는 형태
			
			System.out.println();
		}
	}
}

/*
[실행 결과]
    *
   **
  ***
 ****
*****
계속하려면 아무 키나 누르십시오 . . .
*/