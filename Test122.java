/*==================================
++++++자바의 주요(중요) 클래스++++++
====================================
◎ Test122.java
==================================*/

// ※ Test121.java와 비교


// import java.lang.*;


public class Test122	// extends Object
{
	/*
	
	Object 클래스로부터 상속받은 멤버들

	*/

	@Override
	public String toString()
	{
		// return 클래스명@해시코드;
		//        ----------------- String

		return "재정의한 toString() . . .";
	}

	public static void main(String[] args)
	{
		Test122 ob = new Test122();

		System.out.println("ob.toString: "+ob.toString());
		System.out.println("ob         : "+ob);
	}
}

/*
[실행 결과]
ob.toString: Test122@15db9742
ob         : Test122@15db9742
계속하려면 아무 키나 누르십시오 . . .

↓ 오버라이딩 후

ob.toString: 재정의한 toString() . . .
ob         : 재정의한 toString() . . .
계속하려면 아무 키나 누르십시오 . . .
*/