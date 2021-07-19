/*==============================
+++++++컬렉션(Collection)+++++++
================================
◎ Test162.java
==============================*/


// Set → HashSet, TreeSet
// - 순서(의미) 없음
// - 중복을 허용하지 않는 구조(기본)

/*
○ HashSet<E> 클래스

   -java.util.HashSet<E> 클래스는
    Set 인터페이스를 구현하는 클래스로
	순서의 개념이 아니라 집합의 개념으로 이해해야 하는 자료구조이다.
   -이로 인해 데이터의 중복을 허용하지 않는다.
   -또한, 동기화를 지원하지 않는다.
*/


import java.util.Set;
import java.util.HashSet;


public class Test162
{
	public static void main(String[] args)
	{
		//Set<String> dogs = new Set<String>();	//--X
		Set<String> dogs = new HashSet<String>();	//--업 캐스팅

		// dogs 라는 HashSet 자료구조에 요소 추가
		dogs.add("푸들");
		dogs.add("시바견");
		dogs.add("리트리버");
		dogs.add("치와와");
		
		System.out.print("기존 데이터 Set: ");
		for (String str : dogs)
			System.out.print(str+" ");	//--기존 데이터 Set: 리트리버 푸들 시바견 치와와
		System.out.println();
		// 순서가 의미 없는 자료구조이기 때문에
		// 데이터 입력 순서(자료구조의 요소 격납 순서)와
		// 상관없이 구성되어 있는 것을 확인

		// 데이터(요소) 추가
		dogs.add("말티즈");
		dogs.add("사모예드");
		dogs.add("사모예드");
		dogs.add("사모예드");
		dogs.add("사모예드");
		dogs.add("말티즈");
		dogs.add("말티즈");
		dogs.add("리트리버");
		dogs.add("말티즈");
		dogs.add("리트리버");
		dogs.add("리트리버");
		dogs.add("리트리버");
		dogs.add("리트리버");
		dogs.add("리트리버");
		dogs.add("리트리버");
		dogs.add("리트리버");
		dogs.add("진돗개");
		dogs.add("풍산개");
		dogs.add("풍산개");
		dogs.add("풍산개");

		System.out.print("기존 데이터 Set: ");
		for (String str : dogs)
			System.out.print(str+" ");	//--기존 데이터 Set: 리트리버 진돗개 푸들 시바견 치와와 사모예드 말티즈 풍산개
		System.out.println();
		// ※ 중복 데이터를 추가한다고 해서
		//    데이터 삽입 과정에서 오류가 발생하는 것은 아님

		// ※ 데이터 추가되는 순서와 상관없이 목록이 구성되어 있으며
		//    같은 데이터 여러번 반복되어 추가될 경우(중복 데이터)
		//    하나만 유효한 데이터로 구성되어 있는 것을 확인할 수 있다.
		//    (아무리 추가해도 한 번만 출력됨.
	}
}