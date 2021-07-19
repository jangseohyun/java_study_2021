/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- switch�� �ǽ�
====================================
�� Test041.java
==================================*/

// 1���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
// �Է¹��� ������ŭ ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// �� switch ���� �Ϲ� ���� Ȱ���Ѵ�.
// �� switch ���� �⺻ ���� Ȱ���ϵ� ��break���� �� �� ���� ����� �� �ֵ��� �Ѵ�.

// ���� ����
// ������ ���� �Է�(1~3): 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ������ ���� �Է�(1~3): 7
// �Է� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test041 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է�(1~3): ");
		int a = Integer.parseInt(br.readLine());
		
		// �Ϲ� ��
		switch(a)
		{
			case 1: System.out.println("�Ϲ� ��: ��"); break;
			case 2: System.out.println("�Ϲ� ��: �ڡ�"); break;
			case 3:	System.out.println("�Ϲ� ��: �ڡڡ�"); break;
			default: System.out.println("�Ϲ� ��: �Է� ����"); break;
		}
		
		// �⺻ ��
		String stars ="�⺻ ��: ";

		switch(a)
		{
			case 3: stars += "��";
			case 2:	stars += "��";
			case 1: stars += "��"; System.out.println(stars); break;
			default: System.out.println("�⺻ ��: �Է� ����");
		}
	}
}

/*
[����� Ǯ��]
// �⺻ ��
switch (n)
{
	default: System.out.print("�Է� ����"); break;
	case 3: System.out.print("��");
	case 2: System.out.print("��");
	case 1: System.out.print("��");
}
System.out.println();
*/


/*
[���� ����]
������ ���� �Է�(1~3): 1
�Ϲ� ��: ��
�⺻ ��: ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3): 3
�Ϲ� ��: �ڡڡ�
�⺻ ��: �ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3): 7
�Ϲ� ��: �Է� ����
�⺻ ��: �Է� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/