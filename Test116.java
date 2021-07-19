/*=========================
++++++++클래스 고급++++++++
- 인터페이스(Interface)
===========================
◎ Test116.java
=========================*/

// ○ 실습 문제
//    성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예시
// 인원 수 입력(1~10): 2
// 1번째 학생의 학번 이름 입력(공백 구분): 2104256 a
// 국어 영어 수학 점수 입력(공백 구분): 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분): 2104257 b
// 국어 영어 수학 점수 입력(공백 구분): 85 70 65

// 210456 a		90 100 85		275		91
//              수 수 우
// 210457 b		85 70 65		220		73
//              우 미 양

// 계속하려면 아무 키나 누르십시오 . . .

// 90~100: 수
//  80~89: 우
//  70~79: 미
//  60~69: 양
//    ~59: 가


import java.util.Scanner;


// 속성만 존재하는 클래스 → 자료형 활용
class Record
{
	String hak, name;		//--학번, 이름
	int kor, eng, mat;		//--국어, 영어, 수학
	int tot, avg;			//--총점, 평균
}


// 인터페이스
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}


// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl extends Record implements Sungjuk
{
	Scanner sc = new Scanner(System.in);

	Record[] stuArr;

	String[][] grade;	//--수우미양가
	int[][] score;
	int num;			//--인원 수

	@Override
	public void set()
	{
		do
		{
			System.out.print("인원 수 입력(1~10): ");
			num = sc.nextInt();
		}
		while (num < 1 || num > 10);

		stuArr = new Record[num];
		grade = new String[num][3];		//--국어, 영어, 수학
		score = new int[num][3];
	}

	@Override
	public void input()
	{
		for (int i=0; i<num; i++)
		{
			stuArr[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분): ", i+1);
			stuArr[i].hak = sc.next();
			stuArr[i].name = sc.next();
			System.out.print("국어 영어 수학 점수 입력(공백 구분): ");
			score[i][0] = stuArr[i].kor = sc.nextInt();
			score[i][1] = stuArr[i].eng = sc.nextInt();
			score[i][2] = stuArr[i].mat = sc.nextInt();

			stuArr[i].tot = stuArr[i].kor + stuArr[i].eng + stuArr[i].mat;
			stuArr[i].avg = stuArr[i].tot / 3;
			
			for (int j=0; j<3; j++)
			{
				switch (score[i][j]/10)
				{	
					case 10: case 9: grade[i][j]="수"; break;
					case 8: grade[i][j]="우"; break;
					case 7: grade[i][j]="미"; break;
					case 6: grade[i][j]="양"; break;
					default: grade[i][j]="가"; break;
				}
			}
		}
	}
	
	//210456 a		90 100 85		275		91
	@Override
	public void print()
	{
		for (int i=0; i<num; i++)
		{
			System.out.printf("\n%6s%5s \t%4d%4d%4d\t %4d%4d\n", stuArr[i].hak, stuArr[i].name, stuArr[i].kor, stuArr[i].eng, stuArr[i].mat, stuArr[i].tot, stuArr[i].avg);
			System.out.print("\t\t");
			for (int j=0; j<3; j++)
			{
				System.out.printf("%3s", grade[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}


public class Test116
{
	public static void main(String[] args)
	{
		// Sungjuk은 인터페이스
		Sungjuk ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성
		ob.set();
		ob.input();
		ob.print();
	}
}


/*
[실행 결과]
인원 수 입력(1~10): 2
1번째 학생의 학번 이름 입력(공백 구분): 210456 A
국어 영어 수학 점수 입력(공백 구분): 90 100 85
2번째 학생의 학번 이름 입력(공백 구분): 210457 B
국어 영어 수학 점수 입력(공백 구분): 85 70 65

210456    A       90 100  85      275  91
                  수  수  우

210457    B       85  70  65      220  73
                  우  미  양

계속하려면 아무 키나 누르십시오 . . .
*/