/*===============================
+++++�ڹ��� �⺻ �����(I/O)+++++
=================================
�� Test167.java
===============================*/

// OutputStream �ǽ�


import java.io.OutputStream;
import java.io.IOException;


public class Test167
{
	public static void main(String[] args) throws IOException
	{
		// System.in	: �ڹ��� ǥ�� �Է� ��Ʈ��(��ü)
		// System.out	: �ڹ��� ǥ�� ��� ��Ʈ��(��ü)
		OutputStream out = System.out;	//--���������� ư ��Ȳ

		// �迭 ����
		byte[] ch = new byte[3];
		ch[0] = 65;		//--A
		ch[1] = 97;		//--a
		ch[2] = 122;	//--z

		out.write(ch);	//--������ ������ ������ ��Ʈ���� ���(���ٱ⿡ ���)

		out.flush();	//--��ϵ� ��Ʈ���� �������� ����� ����
						//  ������ Buffer�� Ȱ������ �ʰ� �ִ� ��Ȳ�̹Ƿ�
						//  ������ ������ �ڵ�(������� �ʾƵ� ��¿� ���� ����)
						//  ������ Buffered �Ǿ� �ִ� Stream�� ��� ���� �Ұ�

		out.close();	//--��� ��Ʈ��(���ٱ�)�� ���� ���ҽ� �ݳ�
						//  (out ��ũ��(��������)�� �ᰡ���� ��Ȳ)
		System.out.println("�������� �ŷڵ��� ���� �ִ� ����");
	}
}

/*
[���� ���]
Aaz
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/