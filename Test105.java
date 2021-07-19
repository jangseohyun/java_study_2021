/*=================================
++++++++정렬(sort) 알고리즘++++++++
===================================
◎ Test105.java
=================================*/

// ○ 실습 문제
//    사용자로부터 여러 학생의 성적 데이터를 정수 형태로 입력받아
//    점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예시
// 인원 수 입력: 5
// 이름 점수 입력(1): a 90
// 이름 점수 입력(2): b 80
// 이름 점수 입력(3): c 85
// 이름 점수 입력(4): d 75
// 이름 점수 입력(5): e 95

// ==========================
// 1등 e 95
// 2등 a 90
// 3등 c 85
// 4등 b 80
// 5등 d 75
// ==========================
// 계속하려면 아무 키나 누르십시오 . . .


import java.util.Scanner;


public class Test105
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;				//--do while문에 쓰기 위해 미리 선언
		int pass = 0;
		String temp = "";	//--이름 자리바꿀 변수
		boolean flag;

		System.out.print("인원 수 입력: ");
		int num = sc.nextInt();

		String[] name = new String[num];
		int[] grade = new int[num];

		do
		{
			for (i=0; i<num; i++)
			{
				System.out.printf("이름 점수 입력(%d): ", i+1);
				name[i] = sc.next();
				grade[i] = sc.nextInt();

			}
		}
		while (i>num);

		do
		{	
			flag = false;
			pass++;

			for (int j=0; j<num-pass; j++)
			{
				if (grade[j] < grade[j+1])	//--내림차순 정렬
				{
					grade[j] = grade[j]^grade[j+1];
					grade[j+1] = grade[j+1]^grade[j];
					grade[j] = grade[j]^grade[j+1];
					
					temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;

					flag = true;
				}
			}
		}
		while (flag);

		System.out.println("==========================");

		for (int j=0; j<num; j++)
			System.out.printf("%d등 %s %d\n", j+1, name[j], grade[j]);
		
		System.out.println("==========================");
	}
}

/*
[실행 결과]
인원 수 입력: 5
이름 점수 입력(1): a 90
이름 점수 입력(2): b 80
이름 점수 입력(3): c 85
이름 점수 입력(4): d 75
이름 점수 입력(5): e 95
==========================
1등 e 95
2등 a 90
3등 c 85
4등 b 80
5등 d 75
==========================
계속하려면 아무 키나 누르십시오 . . .
*/