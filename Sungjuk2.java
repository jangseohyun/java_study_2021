
// 처음에 내가 짠 코드


import java.util.Scanner;

class Sungjuk
{
	Scanner sc = new Scanner(System.in);
	int num, rank=0;

	void sungjuk()
	{
		do
		{
			System.out.print("인원 수 입력(1~100): ");
			num = sc.nextInt();
		}
		while (num<1 || num>100);

		Record[] obArr = new Record[num];

		for (int i=0; i<num; i++)
		{
			obArr[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력: ", i+1);
			obArr[i].name = sc.next();
			System.out.print("국어 점수: ");
			obArr[i].kor = sc.nextInt();
			System.out.print("영어 점수: ");
			obArr[i].eng = sc.nextInt();
			System.out.print("수학 점수: ");
			obArr[i].mat = sc.nextInt();
			obArr[i].sum = (obArr[i].kor+obArr[i].eng+obArr[i].mat);
			obArr[i].avg = obArr[i].sum/3;
		}

		for (int i=0; i<num; i++)
		{
			obArr[i].rank = 1;
			for (int j=0; j<num; j++)
			{
				if (obArr[i].avg < obArr[0].avg)
					obArr[i].rank+=1;
			}
		}

		for (int i=0; i<num; i++)
			System.out.printf("%s %d %d %d %d %.2f\n", obArr[i].name, obArr[i].kor, obArr[i].eng, obArr[i].mat, obArr[i].sum, obArr[i].avg);
	}
}

/*
인원 수 입력(1~100): 2
1번째 학생의 이름 입력: 장서현
국어 점수: 90
영어 점수: 80
수학 점수: 70
2번째 학생의 이름 입력: 장서현
국어 점수: 82
영어 점수: 72
수학 점수: 62
장서현 90 80 70 240 80.00
장서현 82 72 62 216 72.00
계속하려면 아무 키나 누르십시오 . . .
*/