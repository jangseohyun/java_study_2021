/*
====================================
++++++++자바 기본 프로그래밍++++++++
-자바 소스 코드 입력 및 컴파일 실습
-println()과 print()
====================================
◎ Test002.java
====================================
*/

public class Test002
{
	public static void main(String[] args)
	{
		System.out.println("첫 번째 구문...");
		System.out.print("두 번째 구문...\n");
		System.out.print("세 번째 구문...\n\n");
		System.out.print("네 번째 구문...\n\n\n");
		//-- 『println()』메소드와 『print()』메소드의 차이는
		//    라인 스킵(줄바꿈, 개행) 유무에 있다.
		//    『\n』을 문자열에 포함하면 라인 스킵이 가능하다.
		//    여러번 사용하는 것도 가능하다.

		System.out.println(7);
		System.out.println('7');
		System.out.println("7");

		System.out.println(7+7);
		System.out.println('7'+'7');  //문자가 가진 코드 형태로 저장됨 ('7'=55)
		System.out.println("7"+"7");
	}
}


/*
[실행 결과]
첫 번째 구문...
두 번째 구문...
세 번째 구문...

네 번째 구문...


7
7
7
14
110
77
계속하려면 아무 키나 누르십시오 . . .
*/