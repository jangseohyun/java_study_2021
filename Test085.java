/*=============================
++++++++++배열(array)++++++++++
-배열의 기본적인 활용
===============================
◎ Test085.java
=============================*/

// ○ 과제
// 사용자로부터 학생 수를 입력받고, 그만큼의 점수(정수 형태)를 입력받아
// 전체 학생 점수의 합, 평균, 편차를 구하여 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예시
// 학생 수 입력: 5
// 1번 학생 점수 입력: 90	
// 2번 학생 점수 입력: 82	
// 3번 학생 점수 입력: 64	
// 4번 학생 점수 입력: 36	
// 5번 학생 점수 입력: 98	

// >> 합: 370
// >> 평균: 74.0
// >> 편차:
// 90: -16.0
// 82: -8.0
// 64: 10.0
// 36: 38.0
// 98: -24.0
// 계속하려면 아무 키나 누르십시오 . . .


import java.util.Scanner;


public class Test085
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avg=0, dev=0;

		System.out.print("학생 수 입력: ");
		int num = sc.nextInt();

		int[] students = new int[num];

		for (int i=0; i<num; i++)
		{
			System.out.printf("%d번 학생 점수 입력: ", (i+1));
			students[i] = sc.nextInt();
			sum += students[i];
		}

		avg = sum / students.length;

		System.out.println(">> 합: "+sum);
		System.out.println(">> 평균: "+avg);
		System.out.println(">> 편차: ");

		for (int j=0; j<num; j++)
		{
			dev = avg-students[j];
			System.out.println(students[j]+": "+dev);
		}
	}
}


/*
[실행 결과]
학생 수 입력: 5
1번 학생 점수 입력: 90
2번 학생 점수 입력: 82
3번 학생 점수 입력: 64
4번 학생 점수 입력: 36
5번 학생 점수 입력: 98
>> 합: 370
>> 평균: 74.0
>> 편차:
90: -16.0
82: -8.0
64: 10.0
36: 38.0
98: -24.0
계속하려면 아무 키나 누르십시오 . . .
*/