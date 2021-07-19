/*===================================================
++++++++++++++++++클래스와 인스턴스++++++++++++++++++
-생성자(Constructor)와 초기화 블럭(Initialized Block)
=====================================================
◎ Test079.java
===================================================*/


public class Test079
{
	int n;
	int m;


	// 생성자
	Test079()
	{
		n = 10;
		m = 20;
		System.out.println("생성자 실행");
	}

	Test079(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("생성자 실행");
	}

	// 초기화 블럭
	// 순서와 상관 없이 초기화 블럭이 먼저 실행됨
	{
		n = 100;
		m = 200;
		System.out.println("초기화 블럭 실행");
	}

	// 출력 메소드 정의
	void write()
	{
		System.out.println("n: "+n+", m: "+m);
	}

	public static void main(String[] args)
	{
		Test079 ob1 = new Test079();
		ob1.write();	//--초기화 블럭 실행 → 생성자 실행 → n=10, m=20

		Test079 ob2 = new Test079(1234,5678);
		ob2.write();	//--초기화 블럭 실행 → 인자 있는 생성자 실행 → n=10, m=20
	}
}


/*
[실행 결과]
초기화 블럭 실행
생성자 실행
n: 10, m: 20
초기화 블럭 실행
생성자 실행
n: 1234, m: 5678
계속하려면 아무 키나 누르십시오 . . .
*/