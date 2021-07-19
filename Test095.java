/*=============================
+++++++클래스와 인스턴스+++++++
-클래스와 인스턴스 활용
===============================
◎ Test095.java
=============================*/


// ○ 실습 문제
// 1~3 사이의 정수 형태의 난수를 발생시켜
// 가위, 바위, 보 게임 프로그램을 구현한다
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.

// 기준 데이터 → 1: 가위, 2: 바위, 3: 보

// 실행 예시
// 1: 가위, 2: 바위, 3: 보 중 입력(1~3): 4
// 1: 가위, 2: 바위, 3: 보 중 입력(1~3): -10
// 1: 가위, 2: 바위, 3: 보 중 입력(1~3): 2
// -유저  : 바위
// -컴퓨터: 보
// >> 승부 최종 결과: 컴퓨터 승
// 계속하려면 아무 키나 누르십시오 . . .



import java.util.Scanner;
import java.util.Random;


class RpsGame
{
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	String[] rsp = {"가위", "바위", "보"};
	String[] result = {"무승부", "컴퓨터 승", "유저 승"};

	int user;
	String userS = "";

	int com;
	String comS = "";

	String gameresult = "무승부";

	void input()
	{
		do
		{
			System.out.print("1: 가위, 2: 바위, 3: 보 중 입력(1~3): ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);

		com = rd.nextInt(3)+1;
		
		userS = rsp[user-1];
		comS = rsp[com-1];
	}
	
	// 유저 1(가위): 1(무승부)  2(컴 승)   3(유저 승)
	//      2(바위): 1(유저 승) 2(무승부)  3(컴 승)
	//      3(보)  : 1(컴 승)   2(유저 승) 3(무승부)
	String cal()
	{
		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
			gameresult = result[2];
		else if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
			gameresult = result[1];

		return gameresult;
	}

	void print(String gameresult)
	{
		System.out.printf("-유저  : %s\n", userS);
		System.out.printf("-컴퓨터: %s\n", comS);
		System.out.printf(">> 승부 최종 결과: %s\n", gameresult);
	}
}

public class Test095
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		String gameresult = ob.cal();
		ob.print(gameresult);
	}
}

/*
[강사님 풀이]

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	int user;
	int com;
	
	// 컴퓨터 값
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
	}

	// 유저 값
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("1: 가위, 2: 바위, 3: 보 중 입력(1~3): ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
	}

	public void middleCalc()
	{
		String[] str = {"가위", "바위", "보"};

		System.out.println("-유저: "+str[user-1]);
		System.out.println("-컴퓨터: "+str[com-1]);
	}

	public String resultCalc()
	{
		String result = "무승부";

		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
			result = "유저 승";
		else if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
			result = "컴퓨터 승";

		return result;
	}

	public void print(String result)
	{
		System.out.println(">> 승부 최종 결과: "+result);
	}
}

public class Test095
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}
*/


/*
[실행 결과]
1: 가위, 2: 바위, 3: 보 중 입력(1~3): 4
1: 가위, 2: 바위, 3: 보 중 입력(1~3): -1
1: 가위, 2: 바위, 3: 보 중 입력(1~3): 2
-유저  : 바위
-컴퓨터: 가위
>> 승부 최종 결과: 유저 승
계속하려면 아무 키나 누르십시오 . . .
*/