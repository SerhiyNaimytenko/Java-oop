package ua.khpi.oop.naimytenko04;

import java.util.Scanner;

public class Helper {
	 
	public static boolean flag;
	public static Scanner scan = new Scanner(System.in);
	
	public static String input_text()
	{
		
		String str;
		System.out.print("Введення інформації: ");
		str = scan.nextLine(); 
		return str;
	}
	
	public static void Show(String str)
	{
		System.out.println(str);
	}

	public static void info_about_creater() {
		System.out.println("Виконавець - Наймитенко Сергій, группа КІТ-119а");
		System.out.println("Інформація про індивідуальне завдання - ");
		System.out.println("Ввести текст. У тексті знайти та вивести всі слова-паліндроми (однаково читається в обох напрямках - зліва направо та справа наліво. Наприклад: \"noon\", \"civic\", \"radar\", \"level\", \"rotor\", \"refer\").");
		System.out.println("Назва основно методу що виконує індивідуальне завдання - 'task' ");
		System.out.println("Алгоритм методу 'task' - метод визначає в тексті одне з слів, та перевіряє чи являється слово поліндромом, якщо так, то виводить його на екран");
		System.out.println("str - рядок до якого запишеться інформація введена користувачем");
		System.out.println("arr - масив в який посимвольно перезапишится рядок");
		
	}
	 
	public static void task(String str)
	{
		StringBuilder b_str = new StringBuilder(str);
		int size = b_str.length(); 
		char[] arr = new char[size];
		b_str.getChars(0, size,arr,0);
		System.out.println(arr);
		if(flag)
			System.out.println("Пошук слів поліндромів");
		for (int i=0,j= 0; j < size; j++) 
		{
			if(j+1!=size)
			{
					if(j<size && (j==0||arr[j-1]==' ' || arr[j+1]==',' || arr[j-1]=='.' ||   arr[j-1]=='!' ||  arr[j-1]=='?' || arr[j-1]==':' ||  arr[j-1]==';'))
				{
					if(flag)
						System.out.println("Знайдено початок слова, переведення 'і' аргумента на початок слова. і = " + i);
					i=j;
				}
				if(j!= size && (arr[j+1]==' ' || arr[j+1]==',' || arr[j+1]=='.' ||   arr[j+1]=='!' ||  arr[j+1]=='?' || arr[j+1]==':' ||  arr[j+1]==';'||  arr[j+1]=='\0'))
				{
					if(flag)
						System.out.println("Знайдено кінець слова. j = " + j);
					for(int k=i,f=j; f!=k && f>=i && k<=j ;f--,k++)
					{
						if(flag)
							System.out.println("Порівняння літер слова і - " + arr[i] + " j - " + arr[j]);
						if(arr[k]==arr[f]&&(f>=0||k<=size))
							if(k+1==f-1||f-1==k||k+1==f)
							{
								if(flag)
									System.out.println("Знайдено поліндром");
								Show(b_str.substring(i, j+1));
							}
								
					} 

				}
			}
		
		}
		
	}
}
