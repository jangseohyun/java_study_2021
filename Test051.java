/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- �ݺ��� (while��) �ǽ�
====================================
�� Test051.java
==================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� ������ ū �������� ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
// ù ��° ���� �Է�: 10
// �� ��° ���� �Է�: 20
// >> 10 ~ 20 ������ ��: xxxx
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ù ��° ���� �Է�: 10
// �� ��° ���� �Է�: 2
// >> 2 ~ 10 ������ ��: xxxx
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ù ��° ���� �Է�: 10
// �� ��° ���� �Է�: 10
// >> 10 ~ 10 ������ ��: 10
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test051
{
	public static void main(String[] args) throws IOException
	{
		int a = 0, b = 0, temp = 0;
		int sum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է�: ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�: ");
		b = Integer.parseInt(br.readLine());

		if (a > b)		//--a�� b���� ũ�� �ڸ� �ٲ�
		{
			temp = a;
			a = b;
			b = temp;
		}

		temp = a;

		while (a <= b)
		{
			sum += a;
			a++;
		}

		System.out.printf(">> %d ~ %d ������ ��: %d\n", temp, b, sum);
	}
}

/*
[����� Ǯ��
// �� �ֿ� ���� ����
int n, su1, su2, result = 0;	//--��������, ù ��° �Է°�, �� ��° �Է°�, �����(������ ���� ���)

// �� ���� �� ó��
//    ����ڿ��� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
System.out.print("ù ��° ���� �Է�: ");
su1 = Integer.parseInt(br.readLine());
System.out.print("�� ��° ���� �Է�: ");
su2 = Integer.parseInt(br.readLine());

//    ������ ���꿡 ���⿡ �ռ�
//    �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
//    ��, su1�� su2���� Ŭ ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��

if (su1 > su2)
{
	// �� ���� �ڸ� �ٲ�
	su1 = su1^su2;
	su2 = su2^su1;
	su1 = su1^su2;
}

n = su1;

while (n <= su2)
{
	result += n;
	n++;
}

// �� ��� ���
System.out.printf(">> %d ~ %d ������ ��: %d\n", su1, su2, result);
*/


/*
[���� ���]
ù ��° ���� �Է�: 10
�� ��° ���� �Է�: 20
>> 10 ~ 20 ������ ��: 165
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է�: 10
�� ��° ���� �Է�: 2
>> 2 ~ 10 ������ ��: 54
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/