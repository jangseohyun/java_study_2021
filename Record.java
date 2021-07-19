// 1. Record 클래스
//    - 속성만 존재하는 클래스로 설계할 것 (메소드 없이 변수들로만 구성되어 있는 클래스)


public class Record
{
	String name;
	int[] score = new int[3];
	int sum;
	double avg;
	int rank;
}

/*
[강사님 풀이]

// 학생 1명을 표현할 수 있는 속성들로 구성

String name;				//--이름
int[] score = new int[3];	//--국어, 영어, 수학 점수(int kor, eng, mat;)
int tot;					//--총점
double avg;					//--평균
int rank;					//--석차
*/

/*
[원래 내 코드]
public class Record
{
	String name;
	int kor, eng, mat;
	int sum;
	double avg;
	int rank;
}
*/