// 1. Record Ŭ����
//    - �Ӽ��� �����ϴ� Ŭ������ ������ �� (�޼ҵ� ���� ������θ� �����Ǿ� �ִ� Ŭ����)


public class Record
{
	String name;
	int[] score = new int[3];
	int sum;
	double avg;
	int rank;
}

/*
[����� Ǯ��]

// �л� 1���� ǥ���� �� �ִ� �Ӽ���� ����

String name;				//--�̸�
int[] score = new int[3];	//--����, ����, ���� ����(int kor, eng, mat;)
int tot;					//--����
double avg;					//--���
int rank;					//--����
*/

/*
[���� �� �ڵ�]
public class Record
{
	String name;
	int kor, eng, mat;
	int sum;
	double avg;
	int rank;
}
*/