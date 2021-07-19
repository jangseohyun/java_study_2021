/*=============================
++++++++++배열(array)++++++++++
-배열의 선언과 초기화
===============================
◎ Test080.java
=============================*/

/*
○ 배열의 개요

   1. 배열이란 크기와 성격이 같은 일련의 원소들이 모여
      공동의 집합 구조를 갖는 자료의 집합체를 의미하는 것으로
	  『동질적인 성격을 가진 자료들』에 대해
	  개별적으로 자료형(Data Type)을 부여하지 않고
	  하나의 이름을 가지고 일괄적으로 처리할 목적으로 사용된다.

   2. 자바에서의 배열은 다음과 같은 순서에 의해 사용된다.
      배열 선언 → 배열에 메모리 할당 → 배열 요소의 사용

   3. 형식 및 구조
      자료형[] 변수명; → 자료형 변수명[];
	  변수명 = new 자료형[요소크기];
	  변수명[인덱스] = 값;

	  int a[];
	  arr = new int[3];
*/


public class Test080
{
	public static void main(String[] args) //--배열에 String형을 담을 args 변수
	{
		// 배열 선언
		int[] arr;

		// 메모리 할당
		arr = new int[10];

		// 배열은 다음과 같이 선언과 동시에 메모리 할당이 가능하다.
		int[] arr2 = new int[10];
		int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
		int arr4[] = {1,2,3,4,5,6,7,8,9,10};

		// 배열의 사용 → 배열 요소 사용 → 접근 → 인덱스를 토애
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		
		// ※ 값을 할당하지 않은 나머지 배열 공간은
		//    자동으로 초기화 된다 → 0 (int형 배열)

		// 배열에 담김 데이터(요소)의 값 출력
		System.out.println("arr: "+arr);	//--arr: arr: [I@15db9742
		// 배열을 출력하기 위해 배열명을 일반 변수처럼 사용하여 출력하는
		// 구문으로 작성하게 되면 배열의 각 방에 들어있는 데이터가 출력되는 것이 아니라
		// 우리가 알아볼 수 없는 코드가 출력된다.

		System.out.println("arr[0]: "+arr[0]);	//--1
		System.out.println("arr[0]: "+arr[1]);	//--2
		System.out.println("arr[0]: "+arr[2]);	//--3
		System.out.println("arr[0]: "+arr[3]);	//--4
		System.out.println("arr[0]: "+arr[4]);	//--5
		System.out.println("arr[0]: "+arr[5]);	//--6
		System.out.println("arr[0]: "+arr[6]);	//--7
		System.out.println("arr[0]: "+arr[7]);	//--8
		System.out.println("arr[0]: "+arr[8]);	//--9
		System.out.println("arr[0]: "+arr[9]);	//--10

		System.out.println(arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4]+", "+arr[5]+", "+arr[6]+", "+arr[7]+", "+arr[8]+", "+arr[9]);

		// 반복문을 활용하여 배열에 담긴 데이터 전체 출력
		for (int i=0; i<10; i++)
		{
			System.out.printf("%2d ",arr[i]);
			System.out.printf("arr 배열의 %d번째 방: %d\n", i, arr[i]);
		}
		System.out.println();
	}
}


/*
[실행 결과]
arr: [I@15db9742
arr[0]: 1
arr[0]: 2
arr[0]: 3
arr[0]: 4
arr[0]: 5
arr[0]: 6
arr[0]: 7
arr[0]: 8
arr[0]: 9
arr[0]: 10
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 1 arr 배열의 0번째 방: 1
 2 arr 배열의 1번째 방: 2
 3 arr 배열의 2번째 방: 3
 4 arr 배열의 3번째 방: 4
 5 arr 배열의 4번째 방: 5
 6 arr 배열의 5번째 방: 6
 7 arr 배열의 6번째 방: 7
 8 arr 배열의 7번째 방: 8
 9 arr 배열의 8번째 방: 9
10 arr 배열의 9번째 방: 10

계속하려면 아무 키나 누르십시오 . . .
*/