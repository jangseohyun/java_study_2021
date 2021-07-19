/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- switch�� �ǽ�
====================================
�� Test040.java
==================================*/

/*
�� ���� ���ù��̶� �ϸ�, switch�� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
   switch(����)
   {
	   case ���1 : ����1 : [break;]
	   case ���2 : ����2 : [break;]
	   |
	   [default : ���� n+1;] [break;]
	}

	switch ���� �����ġ��� case�� ���������
	byte, short, int, long ���̾�� �Ѵ�.

	case �� �ڿ� ��break;�� ������ ���� ������ ���
	���� case ���� ������ ����ؼ� �����ϰ� �ȴ�. (�⺻ ��)
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է�: ");
		String name = br.readLine();

		System.out.print("���� ����: ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("���� ����: ");
		int eng = Integer.parseInt(br.readLine());

		System.out.print("���� ����: ");
		int mat = Integer.parseInt(br.readLine());

		int tot = kor + eng + mat;
		// double avg
		int avg = tot / 3;
		char grade;

		switch(avg/10)
		{
			case 10: grade = 'A'; break;
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F'; break;
		}

		System.out.println("grade: "+grade);
	}
}


/*
[���� ���]
�̸� �Է�: �弭��
���� ����: 90
���� ����: 80
���� ����: 70
grade: B
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/