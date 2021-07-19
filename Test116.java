/*=========================
++++++++Ŭ���� ���++++++++
- �������̽�(Interface)
===========================
�� Test116.java
=========================*/

// �� �ǽ� ����
//    ���� ó�� ���α׷��� �����Ѵ�.
//    ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ����
// �ο� �� �Է�(1~10): 2
// 1��° �л��� �й� �̸� �Է�(���� ����): 2104256 a
// ���� ���� ���� ���� �Է�(���� ����): 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����): 2104257 b
// ���� ���� ���� ���� �Է�(���� ����): 85 70 65

// 210456 a		90 100 85		275		91
//              �� �� ��
// 210457 b		85 70 65		220		73
//              �� �� ��

// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// 90~100: ��
//  80~89: ��
//  70~79: ��
//  60~69: ��
//    ~59: ��


import java.util.Scanner;


// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	String hak, name;		//--�й�, �̸�
	int kor, eng, mat;		//--����, ����, ����
	int tot, avg;			//--����, ���
}


// �������̽�
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}


// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjukImpl extends Record implements Sungjuk
{
	Scanner sc = new Scanner(System.in);

	Record[] stuArr;

	String[][] grade;	//--����̾簡
	int[][] score;
	int num;			//--�ο� ��

	@Override
	public void set()
	{
		do
		{
			System.out.print("�ο� �� �Է�(1~10): ");
			num = sc.nextInt();
		}
		while (num < 1 || num > 10);

		stuArr = new Record[num];
		grade = new String[num][3];		//--����, ����, ����
		score = new int[num][3];
	}

	@Override
	public void input()
	{
		for (int i=0; i<num; i++)
		{
			stuArr[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����): ", i+1);
			stuArr[i].hak = sc.next();
			stuArr[i].name = sc.next();
			System.out.print("���� ���� ���� ���� �Է�(���� ����): ");
			score[i][0] = stuArr[i].kor = sc.nextInt();
			score[i][1] = stuArr[i].eng = sc.nextInt();
			score[i][2] = stuArr[i].mat = sc.nextInt();

			stuArr[i].tot = stuArr[i].kor + stuArr[i].eng + stuArr[i].mat;
			stuArr[i].avg = stuArr[i].tot / 3;
			
			for (int j=0; j<3; j++)
			{
				switch (score[i][j]/10)
				{	
					case 10: case 9: grade[i][j]="��"; break;
					case 8: grade[i][j]="��"; break;
					case 7: grade[i][j]="��"; break;
					case 6: grade[i][j]="��"; break;
					default: grade[i][j]="��"; break;
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
		// Sungjuk�� �������̽�
		Sungjuk ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		ob.set();
		ob.input();
		ob.print();
	}
}


/*
[���� ���]
�ο� �� �Է�(1~10): 2
1��° �л��� �й� �̸� �Է�(���� ����): 210456 A
���� ���� ���� ���� �Է�(���� ����): 90 100 85
2��° �л��� �й� �̸� �Է�(���� ����): 210457 B
���� ���� ���� ���� �Է�(���� ����): 85 70 65

210456    A       90 100  85      275  91
                  ��  ��  ��

210457    B       85  70  65      220  73
                  ��  ��  ��

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/