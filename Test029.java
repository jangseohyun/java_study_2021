/*==================================
++++++++++������(Operator)++++++++++
- ���� ������
====================================
�� Test029.java
==================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������� ������� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader�� readLine()�� Ȱ���ϰ�
// ������ ���� �����ڸ� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ����
// ������ ���� �Է�: 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ������ ���� �Է�: 2011
// 2011�� �� ���
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// �� ������ �Ǻ� ����
//    ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//    �Ǵ� 400�� ����̸� ����
//    �׷��� ������ ���


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է�: ");
		int year = Integer.parseInt(br.readLine());

		String result = year % 4 == 0 ? (year % 400 == 0 ? "����" : (year % 100 == 0 ? "���" : "����")) : "���";

		System.out.printf(" %d�� �� %s\n", year, result);
	}
}

/*
[����� Ǯ��]
int year;
String strResult;

System.out.print("������ ���� �Է�: ");
year = Integer.parseInt(br.readLine());

strResult = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "����" : "���";
// ���� ���� �������� �� �� �̻��� ������ ������ �����ϸ� �� �����ڸ� ����ؾ� �Ѵ�

System.out.printf("%d�� �� $s\n", year, strResult);
*/


/*
[���� ���]
������ ���� �Է�: 2000
 2011�� �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
������ ���� �Է�: 2011
 2011�� �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/