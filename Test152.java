/*==============================
+++++++컬렉션(Collection)+++++++
================================
◎ Test152.java
==============================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};
		
	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		Queue<Object> myQue = new LinkedList<Object>();

		// 해당 자료구조에 colors의 데이터 입력
		for (int i=0; i<colors.length; i++)
			myQue.offer(colors[i]);

		// 해당 자료구조의 모든 데이터 출력
		while (myQue.peek() != null)
			System.out.print((String)myQue.poll()+" ");

		System.out.println();
	}
}

/*
[강사님 풀이]
// Queue 자료구조 생성
// Queue 인터페이스 기반의 인스턴스를 생성하기 위해서는
// new 연산자를 이용하여 Queue 인터페이스를 implements한
// 하위 클래스의 생성자를 호출해야 한다.
Queue<String> qu = new LinkedList<String>();

// qu라는 해당 자료구조(Queue)에 colors 데이터 입력 → offer()
for (String color : colors)
   qu.offer(color);

// qu라는 해당 자료구조(Queue)의 모든 데이터 출력
while (qu.peek() != null)
	System.out.print(qu.poll()+" ");
System.out.println();
*/


/*
[실행 결과]
검정 노랑 초록 파랑 빨강 연두
계속하려면 아무 키나 누르십시오 . . .
*/