
// ó���� ���� § �ڵ�


import java.util.Scanner;

class Sungjuk
{
	Scanner sc = new Scanner(System.in);
	int num, rank=0;

	void sungjuk()
	{
		do
		{
			System.out.print("�ο� �� �Է�(1~100): ");
			num = sc.nextInt();
		}
		while (num<1 || num>100);

		Record[] obArr = new Record[num];

		for (int i=0; i<num; i++)
		{
			obArr[i] = new Record();
			System.out.printf("%d��° �л��� �̸� �Է�: ", i+1);
			obArr[i].name = sc.next();
			System.out.print("���� ����: ");
			obArr[i].kor = sc.nextInt();
			System.out.print("���� ����: ");
			obArr[i].eng = sc.nextInt();
			System.out.print("���� ����: ");
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
�ο� �� �Է�(1~100): 2
1��° �л��� �̸� �Է�: �弭��
���� ����: 90
���� ����: 80
���� ����: 70
2��° �л��� �̸� �Է�: �弭��
���� ����: 82
���� ����: 72
���� ����: 62
�弭�� 90 80 70 240 80.00
�弭�� 82 72 62 216 72.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/