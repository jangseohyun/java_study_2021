/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- �ݺ��� (while��) �ǽ�
====================================
�� Test052.java
==================================*/

// ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �� �������� ��ü ��, ¦���� ��, Ȧ���� ����
// ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ����
// ������ ���� �Է�: 284
// >> 1 ~ 284 ���� ������ ��: xxxx
// >> 1 ~ 284 ���� ¦���� ��: xxxx
// >> 1 ~ 284 ���� Ȧ���� ��: xxxx
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test052
{
	public static void main(String[] args) throws IOException
	{
		int a = 0, n = 0;
		int sum1=0, sum2=0, sum3=0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է�: ");
		a = Integer.parseInt(br.readLine());

		while (n <= a)
		{
			sum1 += n;
			if (n % 2 == 0)
				sum2 += n;
			else
				sum3 += n;
			n++;
		}

		System.out.printf(">> 1 ~ %d ���� ������ ��: %d\n", a, sum1);
		System.out.printf(">> 1 ~ %d ���� ¦���� ��: %d\n", a, sum2);
		System.out.printf(">> 1 ~ %d ���� Ȧ���� ��: %d\n", a, sum3);
	}
}


/*
[���� ���]
������ ���� �Է�: 284
>> 1 ~ 284 ���� ������ ��: 40470
>> 1 ~ 284 ���� ¦���� ��: 20306
>> 1 ~ 284 ���� Ȧ���� ��: 20164
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/