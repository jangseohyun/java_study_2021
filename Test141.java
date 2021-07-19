/*==================================
++++++자바의 주요(중요) 클래스++++++
- Random 클래스
====================================
◎ Test141.java
==================================*/

/*
○ java.util.Random 클래스는

   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
   0.0~1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산들을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는 전용 클래스인 Random 클래스를
   별도로 제공하고 있다.
*/

// 로또 번호 생성기 (난수 발생 프로그램)
// 프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.

// 실행 예시
// 1 3 4 17 23 44
// 1 2 8 16 28 42
//		|
// 계속하려면 아무 키나 누르십시오 . . .

import java.util.Random;


class Lotto
{
	Random rd = new Random();
	int[] n = new int[6];

	void nums()
	{
		for (int i=0; i<n.length; i++)
		{
			n[i] = rd.nextInt(45)+1;	//--1~45
			
			for (int j=0; j<i; j++)		//--중복 숫자 제거(i를 뒤로 돌려서 숫자를 다시 받음)
			{
				if (n[j] == n[i])
					i--;
			}
		}
	}

	void sort()
	{
		for (int i=0; i<n.length-1; i++)
		{
			boolean flag = false;

			for (int j=0; j<n.length-1; j++)
			{
				if (n[j] > n[j+1])
				{
					n[j] = n[j]^n[j+1];
					n[j+1] = n[j+1]^n[j];
					n[j] = n[j]^n[j+1];
					flag = true;
				}
			}

			if (!flag)
				break;
		}
	}

	void print()
	{
		for (int i=0; i<n.length; i++)
			System.out.printf("%2d ", n[i]);
	}
}


public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		
		for (int i=0; i<5; i++)
		{
			lotto.nums();
			lotto.sort();
			lotto.print();
			System.out.println();
		}
	}
}

/*
[강사님 풀이]
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6개
	private int[] num = new int[6];		//--information hiding

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6개 난수를 발생시키는 메소드 정의
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;
		
		jump:	//--continue label
		while (cnt < 6)	//--cnt → 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;		//--1~45

			for (int i=0; i<cnt; i++)	//--비교 먼저 하고 담기
			{
				if(num[i] == n)
					continue jump;
			}

			num[cnt++] = n;
		}

		// 정렬 메소드 호출
		sorting();
	}

	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}

}

public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		
		for (int i=1; i<=5; i++_
		{
			lotto.start();

			for (int n : lotto.getNum())
				System.out.printf("%4d", n");

			System.out.println();
		}
	}
}
*/


/*
[실행 결과]
13 19 24 27 29 35
18 23 28 29 33 34
15 16 24 30 34 43
 1  3  9 31 32 35
 1  7 12 36 39 43
계속하려면 아무 키나 누르십시오 . . .
*/