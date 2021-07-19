/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- if문 실습
====================================
◎ Test031.java
==================================*/

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 구현한다.
// 단, BufferedReader의 readLine()을 통해 입력받을 수 있도록 하며
// printf()를 통해 출력할 수 있도록 한다.

// 실행 예시
// 이름 입력: 장서현
// 국어 점수: 90
// 영어 점수: 80
// 수학 점수: 70
// >> 당신의 이름은 장서현입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B입니다.
// 계속하려면 아무 키나 누르십시오 . . .

// ※ 이때, 등급은 평균 점수를 기준으로 처리한다.
//    90점 이상			   : A
//    80점 이상 ~ 90점 미만: B
//    70점 이상 ~ 80점 미만: C
//    60점 이상 ~ 70점 미만: D
//    60점 미만			   : F


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력: ");
		String name = br.readLine();

		System.out.print("국어 점수: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수: ");
		int mat = Integer.parseInt(br.readLine());

		int tot = kor + eng + mat;
		int avg = tot / 3;
		String grade = "";

		if (avg >= 90)
		{
			grade = "A";
		}
		else if (avg >= 80)
		{
			grade = "B";
		}
		else if (avg >= 70)
		{
			grade = "C";
		}
		else if (avg >= 60)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}

		System.out.printf(">> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d,\n>> 영어 점수는 %d,\n>> 수학 점수는 %d,\n", kor, eng, mat);
		System.out.printf(">> 총점은 %d이고, 평균은 %d입니다.\n", tot, avg);
		System.out.printf(">> 등급은 %s 입니다.\n", grade);
	}
}

/*
[강사님 풀이]
String name			//--이름
int kor, eng, mat;	//--국어, 영어, 수학
int tot;			//--총점
double avg			//--평균
char grade;			//--등급

if (avg >= 90)
{
	grade = 'A';
}
else if (avg >= 80)	//--(avg >= 80 && avg <90) 굳이 들어갈 필요 없음
{
	grade = 'B';
}
else if (avg >= 70)
{
	grade = 'C';
}
else
{
	grade = 'D';
}

System.out.printf(">> 당신의 이름은 %s입니다.\n", name);
System.out.printf(">> 국어 점수는 %d,\n>> 영어 점수는 %d,\n>> 수학 점수는 %d,\n", kor, eng, mat);
System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n", tot, avg);
System.out.printf(">> 등급은 %c 입니다.\n", grade);

/*
[실행 결과]
이름 입력: 장서현
국어 점수: 90
영어 점수: 80
수학 점수: 70
>> 당신의 이름은 장서현입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/