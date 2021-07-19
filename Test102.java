/*=================================
++++++++정렬(sort) 알고리즘++++++++
- 선택 정렬(Selection Sort)
===================================
◎ Test102.java
=================================*/

/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함(보기 좋게 검색하기 위함)

※ 정렬은 리소스 소모가 심하다.

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ...
*/

/*
int[] a = {52,42,12,62,60};

52,42,12,62,60	→ 0, 1번째 비교
== ==
42,52,12,62,60	→ 0, 2번째 비교
==    ==
12,52,42,62,60  → 0, 3번째 비교
==       ==   
12,52,42,62,60  → 0, 4번째 비교
==          ==
-------------------------------- 1회전
12,52,42,62,60  → 1, 2번째 비교
   == ==
12,42,52,62,60  → 1, 3번째 비교
   ==    ==
12,42,52,62,60  → 1, 4번째 비교
   ==       ==
-------------------------------- 2회전
12,42,52,62,60  → 2, 3번째 비교
      == ==
12,42,52,62,60  → 2, 4번째 비교
      ==    ==
-------------------------------- 3회전
12,42,52,62,60  → 3, 4번째 비교
         == ==
-------------------------------- 4회전
12,42,52,60,62

// 제일 작은 수(제일 왼쪽)가 먼저 fix
*/


public class Test102
{
	public static void main(String[] args)
	{
		int[] a = {52,42,12,62,60};
		
		System.out.print("Source Data: ");
		
		for (int i=0; i<a.length; i++)
			System.out.printf("%d ", a[i]);

		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] > a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		System.out.print("\nSorted Data: ");

		for (int i=0; i<a.length; i++)
			System.out.printf("%d ", a[i]);

		System.out.println();
	}
}

/*
[강사님 풀이]
int i, j;

System.out.print("Source Data: ");

//for (i=0; i<a.length; i++)
//	System.out.print(a[i]+" ");
//System.out.println();

// 향상된 for문 = forEach 구문
// for (  : 자료구조)  자료구조 안에 들어있는 걸 순차적으로 꺼내옴
for (int n : a)
	System.out.print(n+" ");
System.out.println();

// Selection Sort 구현
// i → 0 1 2 3 → 비교 기준 데이터 인덱스
for (i=0; i<a.length-1; i++)	//--기준데이터는 a.length-1 까지
{
	// j → i=0: 1 2 3 4, i=1: 2 3 4, ...
	for (j=i+1; j<a.length; j++)
	{
		if (a[i] > a[j])		//--오름차순 구성
		{
			// 자리 바꾸기
			a[i] = a[i]^a[j];
			a[j] = a[j]^a[i];
			a[i] = a[i]^a[j];
		}
	}
}

// 결과물 출력
System.out.print("Sorted Data: ");
for (int n : a)
	System.out.print(n+" ");
System.out.println();
*/


/*
[실행 결과]
Source Data: 52 42 12 62 60
Sorted Data: 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/