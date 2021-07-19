/*=========================
++++++++클래스 고급++++++++
- 상속(Inheritance)
===========================
◎ Test107.java
=========================*/

// ○ 실습 문제
//    다음과 같은 프로그램을 구현한다.
//    단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예시
// 임의의 두 정수 입력(공백 구분): 20 15
// 연산자 입력(+ - * /): -
// >> 20 - 15 = 5
// 계속하려면 아무 키나 누르십시오 . . .

/*
import java.util.Scanner;
import java.io.IOException;


class AClass
{
	protected int a, b, c, r;
	protected char ch;

	public void print()
	{
		System.out.printf(">> %d %c %d = %d\n", a, ch, b, r);
	}
}

class BClass extends AClass 
{
	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분): ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자 입력(+ - * /): ");
		c = System.in.read();
		ch = (char)c;
	}

	public void cal()
	{
		if (ch == '+') r = a + b;
		else if (ch == '-') r = a - b; break;
		else if (ch == '*')	r = a * b; break;
		else if (ch == '/')	r = a / b; break;
		print();
	}
}

public class Test108 
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();
		ob.input();
		ob.cal();
	}
}


[강사님 풀이]
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// super class
class AClass
{
	protected int x, y;
	protected char op;

	AClass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// sub class
class BClass extends AClass
{
	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 두 정수 입력(공백 구분): ");
		String temp = br.readLine();
		String[] str = temp.split("\\s");

		// ※ 문자열.split("구분자");
		//    예) "사과 딸기".split(공백); → 반환 → 배열 → {"사과", "딸기"}

		if (str.length != 2)
			return false;	//--값의 반환 → false → 메소드 종료
		// ※ 이 조건문을 수행할 경우 아래에 코드가 남아있는 상황이더라도
		//    더이상 수행하지 않고 결과값을 반환하며 메소드는 종료된다. 
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("연산자 입력(+ - * /): ");
		op = (char)System.in.read();

		if (op!='+' && op!='-' && op!='*' && op!='/')
			return false;
		
		if (op!='+' && op!='-' && op!='*' && op!='/')
			return true;

		return true;	//--이부분 다시 보기... false로 미리 해두면 나중에 안 뒤집히나??
	}

	double calc()
	{
		double result = 0;

		switch (op)
		{
			case '+': result=x+y; break;
			case '-': result=x-y; break;
			case '*': result=x*y; break;
			case '/': result=(double)x/y; break;
		}

		return result;
	}
}


public class Test108 
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		if (!ob.input())
		{
			System.out.println("Error . . .");
			return;
		}

		double result = ob.calc();
		ob.write(result);
	}
}



/*
[실행 결과]
임의의 두 정수 입력(공백 구분): 1 2
연산자 입력(+ - * /): +
>> 1 + 2 = 3
계속하려면 아무 키나 누르십시오 . . .
*/