/*=========================
++++++++클래스 고급++++++++
- 중첩 클래스
===========================
◎ Test120.java
=========================*/

/*
○ Anonymous 클래스 (익명 클래스, 무명 클래스)

   - AWT나 안드로이드 이벤트 처리에서 일반적으로 사용
   - 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
   - 클래스의 객체가 필요하면 또다시 클래스를 생성해야 하는
     번거로움 때문에 익명의 클래스를 생성하여 처리한다.

○ 형식 및 구조

   new 상위클래스의생성자()
   {
	   접근제어지시자 자료형 메소드()
	   {
		   // ...;
	   }
   };	//--반드시 세미콜론 써야 함
*/

// Q: 자바는 단일 상속만 허용한다면서요?

// 모든 클래스는 Object를 상속받음
// Object는 java.lang에 들어있어서 import 구문 필요 없음

// import java.lang.*; (생략)

// 외부 클래스
class Test	// extends Object (Object 상속 생략)
{
	// super ...;	//--사용 가능(super → Object)

	public Object getString()
	{
		/*
		Object result = new Object();
		...
		return result;	//--return new Object(){...};
		*/

		// 익명의 클래스
		return new Object()	//--생략된 Object의 생성자
		{
			@Override
			public String toString()
			{
				return "익명의 클래스 . . .";
			}
		};	//--세미콜론 필수
	}
}


// main() 메소드를 포함하는 외부의 다른 클래스
public class Test120
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println(ob1.toString());
		System.out.println(ob1.getString());
	}
}

/*
[실행 결과]
Test@15db9742
익명의 클래스 . . .
계속하려면 아무 키나 누르십시오 . . .
*/