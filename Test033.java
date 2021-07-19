/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- if�� �ǽ�
====================================
�� Test033.java
==================================*/

// ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ��������, ������� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ~ else ���ǹ��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ����
// ������ ���� �Է�: 2020
// >> 2020 �� ����
// >> ��� �Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ���� ����
// ������ ���� �Է�: 2021
// >> 2021 �� ���
// >> ��� �Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// �� ������ �Ǻ� ����
//    ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//    �Ǵ�, 400�� ����̸� ����


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test033 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է�: ");
		int year = Integer.parseInt(br.readLine());

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.printf(">> %d �� ����\n", year);
		else 
			System.out.printf(">> %d �� ���\n", year);
	}
}


/*
[���� ���]
������ ���� �Է�: 2020
>> 2020 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�: 2000
>> 2000 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�: 2021
>> 2021 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/