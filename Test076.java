/*===========================================
+++++메소드 중복정의(Method Overloading)+++++
=============================================
◎ Test076.java
===========================================*/

/*
○ 메소드 중복정의 개요
   메소드 중복정의(Method Overloading)란
   메소드가 처리하는 기능은 같고(혹은 매우 유사하고)
   메소드 괄호 속에 넘겨주게 되는 인수(인자, 매개변수, 파라미터)의 『개수』가 다르거나
   『자료형(Data type)』이 다른 경우
   메소드의 이름을 동일한 이름으로 사용해도 이들을 서로 구분(식별)할 수 있기 때문에
   동일한 이름을 부여하여 메소드를 정의할 수 있도록
   문법적으로 허용하게 되는데
   이를 『메소드 중복정의(Method Overloading)』라고 한다.
*/


public class Test076
{
	public static void main(String[] args)
	{
		Test076 ob = new Test076();

		ob.drawLine();			//--====================
		ob.drawLine('+');		//--++++++++++++++++++++
		ob.drawLine('/', 20);	//--////////////////////
	}

	// 선을 그리는 메소드 정의
	public void drawLine()
	{
		System.out.println("====================");	//--『=』 20개
	}

	// 선의 형태를 바꾸어 그리는 메소드 정의
	public void drawLine(char c)
	{
		for (int i=0; i<20; i++)
			System.out.print(c);
		System.out.println();
	}

	// 선의 형태와 길이를 바꾸어 그리는 메소드 정의
	public void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(c);
		System.out.println();
	}
}

/*
[실행 결과]
====================
++++++++++++++++++++
////////////////////
계속하려면 아무 키나 누르십시오 . . .
*/