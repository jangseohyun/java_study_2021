/*==================================
+++++���� �帧�� ��Ʈ��(���)+++++
- switch�� �ǽ�
====================================
�� Test042.java
==================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���Ѵ�.

// ���� ����
// ù ��° ���� �Է�: 10
// �� ��° ���� �Է�: 31
// ������ �Է�(+, -, *, /): +
// >> 10 + 31 = 41
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է�: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�(+, -, *, /): ");
		int cal = System.in.read();

		switch (cal)
		{
			case 43: System.out.printf(">> %d + %d = %d\n", a, b, a+b); break;
			case 45: System.out.printf(">> %d - %d = %d\n", a, b, a-b); break;
			case 42: System.out.printf(">> %d * %d = %d\n", a, b, a*b); break;
			case 47: System.out.printf(">> %d / %d = %d\n", a, b, a/b); break;
			default: System.out.println(">> �Է� ����");
		}
	}
}

/*
[����� Ǯ��]
int a, b, result;
char op;

System.out.print("������ �Է�(+, -, *, /): ");
op = (char)System.in.read();

// case�� ������� �������� ���� �� �ϴ� �� ������ jdk 1.5���� �������� ����
switch (op)
{
	case '+': result=a+b; break;
	case '-': result=a-b; break;
	case '*': result=a*b; break;
	case '/': result=a/b; break;
	default: return;	//--�޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
	
	// �� ��return��: �� ���� ��ȯ �� �޼ҵ��� ����
}

System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
*/


/*
[���� ���]
ù ��° ���� �Է�: 10
�� ��° ���� �Է�: 31
������ �Է�(+, -, *, /): +
>> 10 + 31 = 41
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/