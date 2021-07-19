// 2. Sungjuk 클래스
//    - 인원 수를 입력받아 입력받은 인원 수만큼
//      이름, 국어점수, 영어점수, 수학점수를 입력받고
//      총점과 평균을 산출하는 클래스로 설계할 것
//    - 속성: 인원 수, ★Record 형태의 배열★(Record[] recArr)
//    - 기능: 인원 수 입력, 상세 데이터(성적) 입력, 총점/평균 산출, 결과 출력

// 실행 예시
// 인원 수 입력(1~100): 105
// 인원 수 입력(1~100): -7
// 인원 수 입력(1~100): 3
// 1번째 학생의 이름 입력: a
// 국어 점수: 90
// 영어 점수: 80
// 수학 점수: 70
// ...

// a 90 80 70 240 xx.xx	2
// b 82 72 62 xxx xx.xx	3
// c 98 88 78 xxx xx.xx	1


import java.util.Scanner;


public class Sungjuk
{
	int num;
	Record[] objArr;

	Scanner sc = new Scanner(System.in);

	void studentNum()	//--학생 수 입력
	{
		do
		{
			System.out.print("인원 수 입력(1~100): ");
			num = sc.nextInt();
		}
		while (num<1 || num>100);

		objArr = new Record[num];
	}

	void grade()	//--학생 성적 입력
	{
		for (int i=0; i<num; i++)
		{
			objArr[i] = new Record();
		
			System.out.printf("%d번째 학생의 이름 입력: ", i+1);
			objArr[i].name = sc.next();

			System.out.print("국어 점수: ");
			objArr[i].score[0] = sc.nextInt();
			System.out.print("영어 점수: ");
			objArr[i].score[1] = sc.nextInt();
			System.out.print("수학 점수: ");
			objArr[i].score[2] = sc.nextInt();
		}
	}

	void cal()	//--총점, 평균 산출
	{
		for (int i=0; i<num; i++)
		{
			for (int j=0; j<3; j++)
				objArr[i].sum += objArr[i].score[j];

			objArr[i].avg = objArr[i].sum / 3;
		}
	}

	void calRank()	//--순위 산출
	{
		for (int i=0; i<num; i++)
		{
			objArr[i].rank = 1;

			for (int j=0; j<num; j++)	//--i번째 위치의 avg와 나머지 avg를 한 번씩 전부 비교
			{
				if (objArr[i].avg < objArr[j].avg)	//--i번째 위치의 avg가 j번째의 avg보다 작을 경우 rank 1씩 증가 
					objArr[i].rank++;
			}
		}
	}

	void print()	//--출력
	{
		for (int i=0; i<num; i++)
		{
			System.out.printf("%s ", objArr[i].name);

			for (int j=0; j<3; j++)
				System.out.printf("%d ", objArr[i].score[j]);

			System.out.printf("%d %.2f　　%d\n", objArr[i].sum, objArr[i].avg, objArr[i].rank);
		}
	}
}

/*
[강사님 풀이]

// 주요 속성 구성

import java.util.Scanner;

...


private int inwon;			//--인원 수
private Record[] recArr;	//--Record 배열(학생 1명 당 Record 배열방 1개 활용)

Scanner sc = new Scanner(System.in);

String[] subTitle = {"국어 점수: ", "영어 점수: ", "수학 점수: "};

// 메소드 정의
// ① 인원 수 입력
public void set()
{
	do
	{
		System.out.print("인원 수 입력(1~100): ");
		inwon = sc.nextInt();
	}
	while (inwon < 1 || inwon > 100);

	// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
	// 배열방을 inwon만큼 생성한 것이지,
	// Record 클래스의 인스턴스를 생성한 것은 아니다
	recArr = new Record[inwon];
}

// ② 상세 데이터 입력 + ③ 총점/평균 산출
public void input()
{
	Scanner sc = new Scanner(System.in);
	
	for (int i=0; i<inwon; i++)		//--인원 수만큼 반복(inwon == recArr.length)
	{
		// recArr 배열에는 Record[] 타입만 담을 수 있음
		// Record 클래스 기반의 인스턴스 생성(new Record();)
		// Record rec = new Record();
		// recArr[0] = rec;
		recArr[i] = new Record();

		System.out.printf("%d번째 학생의 이름 입력: ", (i+1));
		recArr[i].name = sc.next();

		for (int j=0; j<3; j++)	//--subTitle.length
		{
			// 안내 메세지 출력
			System.out.print(subTitle[j]);
			// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
			recArr[i].score[j] = sc.next();

			recArr[i].tot += recArr[i].score[j];
		}

		// System.out.print("국어 점수: ");
		// recArr[i].score[0] = sc.next();
		// recArr[i].tot += recArr[i].score[0];

		// System.out.print("영어 점수: ");
		// recArr[i].score[1] = sc.next();
		// recArr[i].tot += recArr[i].score[1];

		// System.out.print("수어 점수: ");
		// recArr[i].score[2] = sc.next();
		// recArr[i].tot += recArr[i].score[2];

		// 평균 산출
		recArr[i].avg = recArr[i].tot / 3.0;
	}
}

// ④ 결과 출력
public void print()
{
	// 석차 산출 메소드 호출 구문 추가
	ranking();

	// 개행
	System.out.println();

	// 학생 1인 당 반복 출력 구문
	for (int i=0; i<inwon; i++)		//--학생 인원 수만큼 반복
	{
		// 이름 출력
		System.out.printf("%5s", recArr[i].name);

		// 성적 출력(국어, 영어, 수학)
		for (inf j=0; j<subTitle.length; j++)
			System.out.printf("%4d", recArr[i].score[j]);
		
		// 총점, 평균 출력
		System.out.printf("%5d", recArr[i].tot);
		System.out.printf("%8.2f", recArr[i].avg);

		// 석차 출력
		System.out.printf("%5d", recArr[i].rank);

		// 개행
		System.out.println();
	}
}

// 메소드 추가 정의
// ⑤ 석차 산출
private void ranking()
{
	// 루프 변수
	int i;		//--비교 기준을 설정하는 인덱스
	int j;		//--비교 대상을 설정하는 인덱스

	// 모든 학생들의 등수(석차)를 1로 초기화
	for (i=0; i<inwon; i++)
		recArr[i].rank = 1;
	
	for (i=0; i<inwon-1; i++)
	{
		for (j=i+1; j<inwon; j++)	//--j=i+1, i번째의 다음 위치부터 비교
		{
			if (recArr[i].avg > recArr[j].avg)		//--기준 데이터가 비교 데이터보다 크다면
			{
				// 비교 데이터의 rank를 1만큼 증가
				recArr[j].rank++;
			}
			else if(recArr[j].avg > recArr[i].avg)	//--비교 데이터가 기준 데이터보다 크다면
			{
				// 기준 데이터의 rank를 1만큼 증가
				recArr[i].rank++;
			}
		}
	}
}
*/