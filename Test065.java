/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- continue
====================================
◎ Test065.java
==================================*/

// 실행 예시
/*
1 : 1
3 : 4
5 : 9
7 : 16
  |
99 : 2500
결과: 2500
*/


public class Test065
{
	public static void main(String[] args)
	{
		int sum = 0;

		for (int i=1; i<100; i++)
		{
			if (i % 2 ==0)	//--i가 짝수인 경우는 무시하고 계속한다
				continue;
			sum += i;
			System.out.printf("%2d : %4d\n", i, sum);
		}

		System.out.println("결과: "+sum);
	}
}

/*
[강사님 풀이]
int n=0, s=0;

while (n<100)	//--0~99
{
	n++;		//--0~100
	if (i % 2 == 0)		//--짝수일 때
		continue;		//--(뒷부분 무시하고+)계속해라
	s += n;							//--무시할 뒷부분
	System.out.println(n+" : "+s);	//--무시할 뒷부분
}
System.out.println("결과: "+s);
*/

/*
[실행 결과]
 1 :    1
 3 :    4
	|
99 : 2500
결과: 2500
계속하려면 아무 키나 누르십시오 . . .
*/