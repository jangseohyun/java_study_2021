/*===============================
+++++�ڹ��� �⺻ �����(I/O)+++++
=================================
�� Test166.java
===============================*/

import java.io.IOException;


public class Test166
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		System.out.println("���ڿ� �Է�(����: Ctrl+z): ");

		// read(): InputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
		while ( (data = System.in.read()) != -1)
		{
			ch = (char)data;

			// print(): ���� ��Ʈ��
			System.out.print(ch);
			/*
			���ڿ� �Է�(����: Ctrl+z): 
			1234
			1234
			abcd
			abcd
			ABCD
			ABCD
			�����ٶ�
			�Ƣ�������?��?
			*/

			// write(): OutputStream Ŭ������ ��ǥ�� �޼ҵ� (����Ʈ ��Ʈ��)
			System.out.write(ch);
			/*
			�ư�?����������?٢Ҷ??......
			*/
		}
	}
}