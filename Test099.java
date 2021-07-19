/*=======================
+++++++배열(Array)+++++++
-배열의 복사
=========================
◎ Test099.java
=======================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// 실행 예시
// 첫 번째 배열 요소를 입력하세요(공백 구분): 2 3 7 10 11
// 두 번째 배열 요소를 입력하세요(공백 구분): 3 6 10 14
// 2 3 7 10 11 6 1
// 계속하려면 아무 키나 누르십시오 . . .

// 2 3 7 10 11 (3) 6 (10) 14

import java.util.Scanner;

public class Test099
{
	int[] a = {2, 3, 7, 10, 11};
	int[] b = {3, 6, 10, 14};
	
	int num = 0;		//--겹치는 값의 개수를 세기 위한 변수

	int[] copy()
	{
		int[] temp = new int[a.length+b.length];
		int n = a.length;

		for (int i=0; i<a.length; i++)
			temp[i] = a[i];

		for (int i=0; i<b.length; i++)
		{
			for (int j=0; j<temp.length; j++)
			{
				if (b[i] == temp[j])
				{
					num++;
					break;
				}
				
				if (j == temp.length-1)
				{
					temp[n] = b[i];
					n++;
					break;
				}
			}
		}

		return temp;
	}
	
	// temp = {2, 3, 7, 10, 11, 6, 0, 14, 0}
	void print(int[] temp)
	{
		for (int i=0; i<temp.length-num; i++)	//--temp.length에서 겹치는 값이 존재하는 만큼(num) 빼고 출력함
			System.out.printf("%d ", temp[i]);

		System.out.println();
	}

	public static void main(String[] args)
	{
		// 임의의 두 배열
		// int[] a = {2, 3, 7, 10, 11};
		// int[] b = {3, 6, 10, 14};
		
		Test099 ob = new Test099();

		int[] temp = ob.copy();
		ob.print(temp);

		ob.input();
	}
}

/*
[강사님 풀이]
// 방법 ①
// -집합 a의 전체 요소 출력
for (int i=0; i<a.length; i++)
	System.out.printf("%3d", a[i]);

// -집합 b의 요소 출력
//  단, 집합 b는 집합 a의 요소와 중복되는 데이터를 제거하면서 출력
for (int i=0; i<b.length; i++)
{
	boolean flag = false;

	for (int j=0; j<a.length; j++)
	{
		if (b[i] == a[j])
		{
			flag = true;
			break;			//--멈춘다 + 빠져나간다(j관련 반복문 탈출)
		}
	}
	if (flag)				//--flag가 true라면
		continue;			//--뒷부분 무시하고 계속하기

	System.out.printf("%3d", b[i]);
}
System.out.println();


// 방법 ②
// -임시 배열을 만들고
int[] temp = new int[a.length + b.length]

// -만들어진 임시 배열에 중복되지 않은 배열 요소를 채운 다음
int n;		//--변수의 선언 위치 중요(temp[n]을 위함)

for (int n=0; n<a.length; n++)
	temp[n] = a[n];

for (int k=0; k<b.length; k++)
{
	boolean flag = false;

	for (int m=0; m<a.length; m++)
	{
		if (b[k] == a[m])
		{
			flag = true;
			break;
		}

		if (flag)
		continue;
	
		temp[n] = b[k];
		n++
	}

	// 그렇게 구성된 임시 배열을 출력(채워진만큼만 출력)
	for (int h=0; h<n; h++)
		System.out.printf("%3d", temp[h]);
	System.out.println();
}
*/

/*
2 3 7 10 11 6 14
계속하려면 아무 키나 누르십시오 . . .
*/