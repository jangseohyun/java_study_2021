/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- 반복문 (for문) 실습
- 별찍기 실습
====================================
◎ Test062.java
==================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*

*********
 *******
  *****
   ***
    *
*/


public class Test062
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++)	
		{
			// 제일 왼쪽에 오는 " "이 증가하는 형태이므로 j++
			for (int j=1; j<=5; j++)			
			{									
				// j++로 바꿔줬기 때문에 if문을 j<i로 바꿔줌
				if (j<i)						//--예) 3번째 줄: i=3, j=1
					System.out.print(" ");	    //--예) 3번째 줄: j=1→2→					
				else if (j==i)
					System.out.print("*");		//--예) 3번째 줄: j=3→						
				else							//--예) 3번째 줄: j=4→5
					for (int k=1; k>=0; k--)	//--예) 3번째 줄: k=1(j가 반복되는 만큼 출력)
						System.out.print("*");	//--예) 3번째 줄: k=1(2번 출력)→0(2번 출력)
			}
			System.out.println();
		}
	}
}

/*
public class Test062
{
	public static void main(String[] args)
	{
		for (int i=5; i>0; i--)	
		{
			for (int j=0; j<(5-i); j++)		//--" "가 (5-i)보다 작은만큼 반복			
				System.out.print(" ");		//--예) 3번째 줄: j<2, j=0→1
			for (int k=0; k<(2*i-1); k++)	//--"*"이 (2*i-1)보다 작은만큼 반복
				System.out.print("*");		//--예) 3번째 줄: k<5, k=0→1→2→3→4
			System.out.println();
		}
	}
}
*/

/*
[실행 결과]
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/