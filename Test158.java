/*==============================
+++++++�÷���(Collection)+++++++
================================
�� Test158.java
==============================*/

// �� �ǽ� ����
//    ���� �ۼ� ���� Test158 Ŭ������ �ϼ��Ͽ�
//    ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ����)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 1

	1��° ��� �Է�: ������
	1��° ��� �Է� ����
	��� �Է� ���(Y/N): y

	2��° ��� �Է�: ������
	2��° ��� �Է� ����
	��� �Է� ���(Y/N): N

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 2

	[���� ��ü ���]
		������
		������
	���� ��ü ��� �Ϸ�

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 3

	�˻��� ��� �Է�: ������

	[�˻� ��� ���]
	�׸��� �����մϴ�
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 4

	������ ��� �Է�:

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 5

	������ ��� �Է�:
	������ ���� �Է�:

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 6

	���α׷� ����

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Menus
{
	public static final int E_ADD = 1;		//--��� �߰�
	public static final int E_DISP = 2;		//--��� ���
	public static final int E_FIND = 3;		//--��� �˻�
	public static final int E_DEL = 4;		//--��� ����
	public static final int E_CHA = 5;		//--��� ����
	public static final int E_EXIT = 6;		//--����
}

public class Test158
{
	// �ֿ� �Ӽ� ���� (�ϼ�)
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;	//--���� ��
	private static String con;	//--��� ����


	// static �ʱ�ȭ �� (�ϼ�)
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));
		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ� (�ϼ�)
	public static void menuDisp()
	{
		System.out.println("\n\n\t[ �޴� ���� ]");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����\n");

		System.out.print("\t>> �޴� ����(1~6): ");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
		/*
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<Menus.E_ADD);
		*/

		sel = Integer.parseInt(br.readLine());
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case Menus.E_ADD: addElement(); break;
		case Menus.E_DISP: dispElement(); break;
		case Menus.E_FIND: findElement(); break;
		case Menus.E_DEL: delElement(); break;
		case Menus.E_CHA: chaElement(); break;
		case Menus.E_EXIT: exit(); break;
		default: System.out.println("\t�޴� ���� ����");
		}
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		String nameInput;

		while (true)
		{
			System.out.printf("\n\t%d��° ��� �Է�: ",vt.size()+1);
			nameInput = br.readLine();
			System.out.printf("\t[%d��° ��� �Է� ����]",vt.size()+1);
			vt.add(nameInput);
			System.out.print("\n\t��� �Է� ���(Y/N): ");
			con = br.readLine();

			if (con.equals("Y"))
				continue;
			else
				break;
		}
	}

	// ��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println("\n\t[���� ��ü ���]");

		if (vt.isEmpty())
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");
		else
		{
			for (Object obj : vt)
				System.out.print("\t\t"+obj);
			System.out.println("\n\t[���� ��ü ��� �Ϸ�]");
		}
	}
	
	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.print("\n\t�˻��� ��� �Է�: ");
		String searchStr = br.readLine();
		if (vt.contains(searchStr))
			System.out.println("\t�˻� �׸��� �����մϴ�.");
		else
			System.out.println("\t�˻� �׸��� �������� �ʽ��ϴ�.");
	}
	
	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		System.out.print("\n\t������ ��� �Է�: ");
		String searchStr = br.readLine();

		if (vt.contains(searchStr))
		{
			vt.remove(searchStr);
			System.out.println("\t�ش� �׸��� �����Ǿ����ϴ�.");	
		}
		else
			System.out.println("\t������ �׸��� �������� �ʽ��ϴ�.");
	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print("\t������ ��� �Է�: ");
		String searchStr = br.readLine();

		if (vt.contains(searchStr))
		{
			System.out.print("\t������ ���� �Է�: ");
			String changeStr = br.readLine();
			vt.set(vt.indexOf(searchStr), changeStr);
			System.out.println("\t�ش� �׸��� ����Ǿ����ϴ�.");
		}
		else
			System.out.println("\t������ �׸��� �������� �ʽ��ϴ�.");
	}

	// ���α׷� ���� �޼ҵ�
	public static void exit()
	{
		System.out.println("\n\t���α׷� ����\n\n");
		System.exit(-1);
	}

	// ���� �޼ҵ� (�ϼ�)
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}