package ua.khpi.oop.naimytenko04;

import java.util.Scanner;

public class Helper {
	 
	public static boolean flag;
	public static Scanner scan = new Scanner(System.in);
	
	public static String input_text()
	{
		
		String str;
		System.out.print("�������� ����������: ");
		str = scan.nextLine(); 
		return str;
	}
	
	public static void Show(String str)
	{
		System.out.println(str);
	}

	public static void info_about_creater() {
		System.out.println("���������� - ���������� �����, ������ ʲ�-119�");
		System.out.println("���������� ��� ������������ �������� - ");
		System.out.println("������ �����. � ����� ������ �� ������� �� �����-��������� (�������� �������� � ���� ��������� - ���� ������� �� ������ �����. ���������: \"noon\", \"civic\", \"radar\", \"level\", \"rotor\", \"refer\").");
		System.out.println("����� ������� ������ �� ������ ������������ �������� - 'task' ");
		System.out.println("�������� ������ 'task' - ����� ������� � ����� ���� � ���, �� �������� �� ��������� ����� ����������, ���� ���, �� �������� ���� �� �����");
		System.out.println("str - ����� �� ����� ���������� ���������� ������� ������������");
		System.out.println("arr - ����� � ���� ����������� ������������� �����");
		
	}
	 
	public static void task(String str)
	{
		StringBuilder b_str = new StringBuilder(str);
		int size = b_str.length(); 
		char[] arr = new char[size];
		b_str.getChars(0, size,arr,0);
		System.out.println(arr);
		if(flag)
			System.out.println("����� ��� ���������");
		for (int i=0,j= 0; j < size; j++) 
		{
			if(j+1!=size)
			{
					if(j<size && (j==0||arr[j-1]==' ' || arr[j+1]==',' || arr[j-1]=='.' ||   arr[j-1]=='!' ||  arr[j-1]=='?' || arr[j-1]==':' ||  arr[j-1]==';'))
				{
					if(flag)
						System.out.println("�������� ������� �����, ����������� '�' ��������� �� ������� �����. � = " + i);
					i=j;
				}
				if(j!= size && (arr[j+1]==' ' || arr[j+1]==',' || arr[j+1]=='.' ||   arr[j+1]=='!' ||  arr[j+1]=='?' || arr[j+1]==':' ||  arr[j+1]==';'||  arr[j+1]=='\0'))
				{
					if(flag)
						System.out.println("�������� ����� �����. j = " + j);
					for(int k=i,f=j; f!=k && f>=i && k<=j ;f--,k++)
					{
						if(flag)
							System.out.println("��������� ���� ����� � - " + arr[i] + " j - " + arr[j]);
						if(arr[k]==arr[f]&&(f>=0||k<=size))
							if(k+1==f-1||f-1==k||k+1==f)
							{
								if(flag)
									System.out.println("�������� ��������");
								Show(b_str.substring(i, j+1));
							}
								
					} 

				}
			}
		
		}
		
	}
}
