// 2. Sungjuk Ŭ����
//    - �ο� ���� �Է¹޾� �Է¹��� �ο� ����ŭ
//      �̸�, ��������, ��������, ���������� �Է¹ް�
//      ������ ����� �����ϴ� Ŭ������ ������ ��
//    - �Ӽ�: �ο� ��, ��Record ������ �迭��(Record[] recArr)
//    - ���: �ο� �� �Է�, �� ������(����) �Է�, ����/��� ����, ��� ���

// ���� ����
// �ο� �� �Է�(1~100): 105
// �ο� �� �Է�(1~100): -7
// �ο� �� �Է�(1~100): 3
// 1��° �л��� �̸� �Է�: a
// ���� ����: 90
// ���� ����: 80
// ���� ����: 70
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

	void studentNum()	//--�л� �� �Է�
	{
		do
		{
			System.out.print("�ο� �� �Է�(1~100): ");
			num = sc.nextInt();
		}
		while (num<1 || num>100);

		objArr = new Record[num];
	}

	void grade()	//--�л� ���� �Է�
	{
		for (int i=0; i<num; i++)
		{
			objArr[i] = new Record();
		
			System.out.printf("%d��° �л��� �̸� �Է�: ", i+1);
			objArr[i].name = sc.next();

			System.out.print("���� ����: ");
			objArr[i].score[0] = sc.nextInt();
			System.out.print("���� ����: ");
			objArr[i].score[1] = sc.nextInt();
			System.out.print("���� ����: ");
			objArr[i].score[2] = sc.nextInt();
		}
	}

	void cal()	//--����, ��� ����
	{
		for (int i=0; i<num; i++)
		{
			for (int j=0; j<3; j++)
				objArr[i].sum += objArr[i].score[j];

			objArr[i].avg = objArr[i].sum / 3;
		}
	}

	void calRank()	//--���� ����
	{
		for (int i=0; i<num; i++)
		{
			objArr[i].rank = 1;

			for (int j=0; j<num; j++)	//--i��° ��ġ�� avg�� ������ avg�� �� ���� ���� ��
			{
				if (objArr[i].avg < objArr[j].avg)	//--i��° ��ġ�� avg�� j��°�� avg���� ���� ��� rank 1�� ���� 
					objArr[i].rank++;
			}
		}
	}

	void print()	//--���
	{
		for (int i=0; i<num; i++)
		{
			System.out.printf("%s ", objArr[i].name);

			for (int j=0; j<3; j++)
				System.out.printf("%d ", objArr[i].score[j]);

			System.out.printf("%d %.2f����%d\n", objArr[i].sum, objArr[i].avg, objArr[i].rank);
		}
	}
}

/*
[����� Ǯ��]

// �ֿ� �Ӽ� ����

import java.util.Scanner;

...


private int inwon;			//--�ο� ��
private Record[] recArr;	//--Record �迭(�л� 1�� �� Record �迭�� 1�� Ȱ��)

Scanner sc = new Scanner(System.in);

String[] subTitle = {"���� ����: ", "���� ����: ", "���� ����: "};

// �޼ҵ� ����
// �� �ο� �� �Է�
public void set()
{
	do
	{
		System.out.print("�ο� �� �Է�(1~100): ");
		inwon = sc.nextInt();
	}
	while (inwon < 1 || inwon > 100);

	// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
	// �迭���� inwon��ŭ ������ ������,
	// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�
	recArr = new Record[inwon];
}

// �� �� ������ �Է� + �� ����/��� ����
public void input()
{
	Scanner sc = new Scanner(System.in);
	
	for (int i=0; i<inwon; i++)		//--�ο� ����ŭ �ݺ�(inwon == recArr.length)
	{
		// recArr �迭���� Record[] Ÿ�Ը� ���� �� ����
		// Record Ŭ���� ����� �ν��Ͻ� ����(new Record();)
		// Record rec = new Record();
		// recArr[0] = rec;
		recArr[i] = new Record();

		System.out.printf("%d��° �л��� �̸� �Է�: ", (i+1));
		recArr[i].name = sc.next();

		for (int j=0; j<3; j++)	//--subTitle.length
		{
			// �ȳ� �޼��� ���
			System.out.print(subTitle[j]);
			// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
			recArr[i].score[j] = sc.next();

			recArr[i].tot += recArr[i].score[j];
		}

		// System.out.print("���� ����: ");
		// recArr[i].score[0] = sc.next();
		// recArr[i].tot += recArr[i].score[0];

		// System.out.print("���� ����: ");
		// recArr[i].score[1] = sc.next();
		// recArr[i].tot += recArr[i].score[1];

		// System.out.print("���� ����: ");
		// recArr[i].score[2] = sc.next();
		// recArr[i].tot += recArr[i].score[2];

		// ��� ����
		recArr[i].avg = recArr[i].tot / 3.0;
	}
}

// �� ��� ���
public void print()
{
	// ���� ���� �޼ҵ� ȣ�� ���� �߰�
	ranking();

	// ����
	System.out.println();

	// �л� 1�� �� �ݺ� ��� ����
	for (int i=0; i<inwon; i++)		//--�л� �ο� ����ŭ �ݺ�
	{
		// �̸� ���
		System.out.printf("%5s", recArr[i].name);

		// ���� ���(����, ����, ����)
		for (inf j=0; j<subTitle.length; j++)
			System.out.printf("%4d", recArr[i].score[j]);
		
		// ����, ��� ���
		System.out.printf("%5d", recArr[i].tot);
		System.out.printf("%8.2f", recArr[i].avg);

		// ���� ���
		System.out.printf("%5d", recArr[i].rank);

		// ����
		System.out.println();
	}
}

// �޼ҵ� �߰� ����
// �� ���� ����
private void ranking()
{
	// ���� ����
	int i;		//--�� ������ �����ϴ� �ε���
	int j;		//--�� ����� �����ϴ� �ε���

	// ��� �л����� ���(����)�� 1�� �ʱ�ȭ
	for (i=0; i<inwon; i++)
		recArr[i].rank = 1;
	
	for (i=0; i<inwon-1; i++)
	{
		for (j=i+1; j<inwon; j++)	//--j=i+1, i��°�� ���� ��ġ���� ��
		{
			if (recArr[i].avg > recArr[j].avg)		//--���� �����Ͱ� �� �����ͺ��� ũ�ٸ�
			{
				// �� �������� rank�� 1��ŭ ����
				recArr[j].rank++;
			}
			else if(recArr[j].avg > recArr[i].avg)	//--�� �����Ͱ� ���� �����ͺ��� ũ�ٸ�
			{
				// ���� �������� rank�� 1��ŭ ����
				recArr[i].rank++;
			}
		}
	}
}
*/