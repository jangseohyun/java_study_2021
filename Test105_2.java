/*=================================
++++++++정렬(sort) 알고리즘++++++++
===================================
◎ Test105_2.java
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

class Students
{
	String name;
	int grade;
}

public class Test105_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;				//--do while문에 쓰기 위해 미리 선언
		int pass = 0;
		String temp = "";
		boolean flag = false;

		System.out.print("인원 수 입력: ");
		int num = sc.nextInt();

		Students[] stuArr = new Students[num];

		do
		{
			for (i=0; i<num; i++)
			{
				stuArr[i] = new Students();
				System.out.printf("이름 점수 입력(%d): ", i+1);
				stuArr[i].name = sc.next();
				stuArr[i].grade = sc.nextInt();

			}
		}
		while (i>num);

		do
		{	
			flag = false;
			pass++;

			for (int j=0; j<num-pass; j++)
			{
				if (stuArr[j].grade < stuArr[j+1].grade)	//--내림차순 정렬
				{
					stuArr[j].grade = stuArr[j].grade^stuArr[j+1].grade;
					stuArr[j+1].grade = stuArr[j+1].grade^stuArr[j].grade;
					stuArr[j].grade = stuArr[j].grade^stuArr[j+1].grade;
					
					temp = stuArr[j].name;
					stuArr[j].name = stuArr[j+1].name;
					stuArr[j+1].name = temp;

					flag = true;
				}
			}
		}
		while (flag);

		System.out.println("==========================");

		for (int j=0; j<num; j++)
			System.out.printf("%d등 %s %d\n", j+1, stuArr[j].name, stuArr[j].grade);
		
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