package ua.khpi.oop.naimytenko08;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
 
import yampolskiy.helper;

public class Main {

	public static void main(String[] args) {
		 
	
		CarsShop array[] = new CarsShop[3];
		array[0] = new CarsShop("mazda",2020,"Хорошое состояние, требуется косметический ремонт",400000,15, 10);
		array[1] = new CarsShop("ВАЗ",1980,"Плохое состояние, после ДТП",30000,15, 10);
		array[2] = new CarsShop("Rolls-royce",2013,"Отличное состояние",7000000,49, 30);
		Container cont  = new Container();
		cont.array = array;
		int size  = 3;
		int i;
		int number;
		
		boolean n_end = true;
		boolean input;
		boolean fileCheck = false;
		
		String fileName = "";
		String str;
		String command;
		String path = "C:\\Users\\fox\\eclipse-workspace\\Java-oop";
		
		do
		{	
	 
			
			System.out.println("Доступні команди\r\n" + 
					"1 -  серіалізація                          - \r\n" +
					"2 -  десіалізація                          - \r\n" +
					"3 -  виведення масиву на екран             - \r\n" +
					"4 -  додавання елементу в кінец            - \r\n" +
					"5 -  видаленния елементу з початку         - \r\n" +
					"0 -  завершення програми                   - \r\n" + 
					"");
			System.out.println("Введіть команду: ");
			Scanner scan = new Scanner(System.in);
			command = scan.nextLine();  
			switch (command) {
			case "1": 
				System.out.println("Введите название для вашего XML файла для сохранение данных");
				fileName = scan.nextLine();
				if (fileName.indexOf(".xml") == -1) {
					fileName += ".xml";
				}
				System.out.println("Название вашего XML файла - " + fileName);
				while(n_end)
				{
					File directoryPath = new File(path);
					String contents[] = directoryPath.list();
					str = "";
					if (contents == null) {
				    	  System.out.println("Вы выбрали не каталог, попробуйте еще раз");
				    	  path = path.substring(0, path.length() - str.length());
				    	  continue;
				    }
					System.out.println("Текущий путь: " + path); 
					System.out.println("Список всех файлов и каталогов в указанном каталоге:");
				    for(i = 0; i < contents.length; i++) {
				         System.out.println(i + 1 + ") " + contents[i]);
				    }
				    System.out.println(++i + ") Выберите этот вариант, чтобы сохранить файл в этом каталоге.");
				    System.out.println(++i + ") выберите этот вариант, если хотите подняться по тропе");
				    System.out.println("Введите номер каталога, в который вы хотите сохранить файл, или выберите этот каталог:");
				    number = 0;
				  
				    do {
				    	input = false;
				    	number = scan.nextInt();
				    	if (number > i) {
				    		System.out.println("Вы ошиблись номером, повторите попытку");
				    		input = true;
				    	}
				    } while(input);
				    
				    if(number == i -1) {
				    	n_end = false;
				    }
				    else if (number == i) {
				    	if (path.contains(str) && !str.equals("")) {
				    		path = path.substring(0, path.length() - str.length());
				    	} 
				    	else 
						System.out.println("Вы не можете подняться из этого каталога");
				    } else {
					str = "\\" + contents[number - 1];
					path += str;							
				}
			}  
			File dir = new File(path);
		    File actualFile = new File (dir, fileName);
					try {
						XMLEncoder e = new XMLEncoder( new BufferedOutputStream
								(new FileOutputStream(actualFile)));
						e.writeObject(cont.array);
						e.close();
						System.out.println("Serialization successful\n");
						fileCheck = true;
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					break;  
			case "2": 
				str = "";
				n_end = true;
				 
				if (fileCheck) {
					System.out.println("Имя текущего файла XML - " + fileName);
				} else 
					System.out.println("XML-файл не был создан во время этого сеанса");
				path = "C:\\Users\\fox\\eclipse-workspace\\Java-oop";
				while (n_end) {
					File directoryPath = new File(path);
				      //List of all files and directories
				      String contents[] = directoryPath.list();
				      if (contents == null) {
				    	  System.out.println("Вы выбрали не каталог и не XML-файл, попробуйте еще раз");
				    	  path = path.substring(0, path.length() - str.length());
				    	  continue;
				      }
				      System.out.println("Текущий путь: " + path);
				      System.out.println("Список всех файлов и каталогов в указанном каталоге:");
				      for(i = 0; i < contents.length; i++) {
				         System.out.println(i + 1 + ")  " + contents[i]);
				      }
				    System.out.println(++i + ") Выберите этот вариант, если хотите подняться по тропе");
				    System.out.println("Введите номер каталога для перемещения туда или XML-файл, который вы хотите прочитать: ");
				    do {
				    	input = false;
				    	number = scan.nextInt();
				    	if (number > i) {
				    		System.out.println("Вы ввели неправильный номер, попробуйте еще раз");
				    		input = true;
				    	}
				    } while(input);
				    
				    if (number == i) {
				    	if (path.contains(str) && !str.equals("")) {
							path = path.substring(0, path.length() - str.length());
						} else 
							System.out.println("Вы не можете подняться из этого каталога");
				    } else {
						str = "\\" + contents[number - 1];
						path += str;							
						if (contents[number - 1].contains(".xml")) {
							n_end = false;
						} 
				    } 
				}
				dir = new File(path); 
				try {
 
					XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(dir)));
					cont.array =  (CarsShop[]) decoder.readObject();
					decoder.close();
					cont.Show();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "3": 
				for (CarsShop carsShop : cont.array) {
					carsShop.Show();
				}
				break;
			
			case "4": 
				cont.add();
				break;
			
			case "5":
				cont.remove();
				break;
			case "0": 
				System.out.println("Кінець програми");	
				break;
			
			default:
				System.out.println("Ви помилилися командой");
				break;
			}
			
		}while(!(command.equals("0"))); 
        
	}

}
