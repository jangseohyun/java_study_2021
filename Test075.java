/*===================================
++++++++++클래스와 인스턴스++++++++++
-생성자(Constructor)
=====================================
◎ Test075.java
===================================*/


class NumberTest2
{
	int num;
	
	/*
	NumberTest2()
	{
	}
	*/

	// 사용자 정의 생성자 → 인자를 전달받는 생성자
	NumberTest2(int n)
	{
		num = n;

		// 시각적인 확인으 ㄹ위한 출력 구문 삽입
		System.out.println("인자 전달: "+n);
	}
	
	int getNum()
	{
		return num;
	}
}


public class Test075
{
	public static void main(String[] args)
	{
		// NumberTest2 클래스 기반의 인스턴스 생성
		// NumberTest2 ob = new NumberTest2();
		// 사용자 정의 생성자를 정의한 이후에는 컴파일 에러 발생
		// NumberTest2 클래스에는 사용자 정의 생성자가 존재하고 있는 상황이기 때문에
		// 『default 생성자』 (NumberTest2())가 자동으로 생성되지(삽입되지) 않는다

		// NumberTest2 클래스 기반의 인스턴스 생성
		NumberTest2 ob = new NumberTest2(10);
		System.out.println("메소드 반환 값: "+ob.getNum());	//--10

		// NumberTest2 클래스 기반의 인스턴스 생성
		NumberTest2 ob2 = new NumberTest2(2456);
		System.out.println("메소드 반환 값: "+ob2.getNum());	//--2456
	}
}


/*
[실행 결과]
인자 전달: 10
메소드 반환 값: 10
인자 전달: 2456
메소드 반환 값: 2456
계속하려면 아무 키나 누르십시오 . . .
*/