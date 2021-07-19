/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- 반복문 (for문) 실습
- 별찍기 실습
====================================
◎ Test063.java
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
 *******
  *****
   ***
    *
*/

/*
public class Test063
{
	public static void main(String[] args)
	{
		for (int i=1; i<=4; i++)				//--마지막 한 줄 지움
		{
			for (int j=5; j>0; j--)	
			{
				if (j>i)						
					System.out.print(" ");	  
				else if (j==i)
					System.out.print("*");		
				else							
					for (int k=1; k>=0; k--)	
						System.out.print("*");	
			}
			System.out.println();
		}
		for (int i=1; i<=5; i++)	
		{
			for (int j=1; j<=5; j++)	
			{
				if (j<i)						
					System.out.print(" ");	  				
				else if (j==i)
					System.out.print("*");						
				else							
					for (int k=1; k>=0; k--)	
						System.out.print("*");	
			}
			System.out.println();
		}
	}
}
*/

public class Test063
{
	public static void main(String[] args)
	{
		for (int i=1; i<=4; i++)				//--마지막 한 줄 지움	
		{
			for (int j=0; j<(5-i); j++)	
				System.out.print(" ");
			for (int k=0; k<(2*i-1); k++)
				System.out.print("*");
			System.out.println();
		}

		for (int i=5; i>0; i--)	
		{
			for (int j=0; j<(5-i); j++)			
				System.out.print(" ");
			for (int k=0; k<(2*i-1); k++)
				System.out.print("*");
			System.out.println();
		}
	}
}

/*
[실행 결과]
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/