/*==============================
+++++++컬렉션(Collection)+++++++
================================
◎ Test150.java
==============================*/

import java.util.Stack;

public class Test150
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};
	
	// 생성자
	public Test150()
	{
		// st라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 (String)
		Stack<String> st = new Stack<String>();

		// st라는 Stack 자료구조에 데이터 담기
		// colors라는 문자열 배열 요소를 모두 담아내기
		for (String color : colors)
			st.push(color);
		
		// 데이터 추가
		st.push("보라");

		// 데이터 추가
		st.push("하늘");

		// 데이터 추가
		//st.push(0.0);		//--에러 발생(컴파일 에러)
		// 제네릭 표현식을 통해 선언하고 있는
		// String이 아닌 다른 자료형(double)을 스택에 push()하려고 했기 때문

		// 출력 메소드 호출
		popStack(st);
	}

	// 출력 메소드
	public void popStack(Stack<String> st)
	{
		System.out.print("pop: ");

		while (!st.empty())
			System.out.print(st.pop() + " ");
		
		System.out.println();
	}	

	public static void main(String[] args)
	{
		new Test150();
	}
}

/*
[실행 결과]
pop: 하늘 보라 연두 빨강 파랑 초록 노랑 검정
계속하려면 아무 키나 누르십시오 . . .
*/