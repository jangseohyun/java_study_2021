/*===============================
+++++�ڹ��� �⺻ �����(I/O)+++++
=================================
�� Test168.java
===============================*/

// Reader �ǽ�
// Test166�� ��


import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in: �ڹ��� ǥ�� �Է� ��Ʈ��(��ü) -> ����Ʈ ��� ��Ʈ�� 
		// InputStreamReader: ����Ʈ ����� ��Ʈ���� ���� ����� ��Ʈ������ ��ȯ���ִ� ��ü(��ȯ��, ������ ���� ����) 
		// Reader: ���� ��� ��Ʈ�� ��ü
		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(���� Ctrl+z):");

		while ((data = rd.read()) != -1)
		{
			ch = (char)data;

			// print(): ���� ��Ʈ��
			System.out.print(ch);	//--�ѱ� ������ ����

			// write(): OutputStream Ŭ������ ��ǥ�� �޼ҵ�(����Ʈ ��Ʈ��)
			System.out.write(ch);	//--�� �������|
		}
	}
}

/*
[���� ���]
���ڿ� �Է�(���� Ctrl+z):
1234
1234
abcd
abcd
ABCD
ABCD
�����ٶ�
�����ٶ�
*/