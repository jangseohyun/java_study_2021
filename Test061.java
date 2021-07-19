/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- 반복문 (for문) 실습
- 별찍기 실습
====================================
◎ Test061.java
==================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*
    *
   ***
  *****
 *******
*********

*/

public class Test061
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++)	
		{
			for (int j=5; j>0; j--)
			{
				if (j>i)						//--예) 2번째 줄: i=2, j=5
					System.out.print(" ");	    //--예) 2번째 줄: j=5→4→3→
				else if (j==i)
					System.out.print("*");		//--예) 2번째 줄: j=2→
				else							//--예) 2번째 줄: j=1
					for (int k=1; k>=0; k--)	//--예) 2번째 줄: k=1(j가 반복되는 만큼 출력)
						System.out.print("*");	//--예) 2번째 줄: k=1(1번 출력)→0(1번 출력)
			}
			System.out.println();
		}
	}
}

/*
public class Test061
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++)	
		{
			for (int j=0; j<(5-i); j++)		//--" "가 (5-i)보다 작은만큼 반복
				System.out.print(" ");		//--예) 2번째 줄: j<3, j=0→1→2
			for (int k=0; k<(2*i-1); k++)	//--"*"이 (2*i-1)보다 작은만큼 반복
				System.out.print("*");		//--예) 2번째 줄: k<3, k=0→1→2
			System.out.println();
		}
	}
}
*/

/*
    *
   ***
  *****
 *******
*********
계속하려면 아무 키나 누르십시오 . . .
*/
