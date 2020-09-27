package ua.khpi.oop.naimytenko04;
 
public class Main { 
	
	public static Helper help = new Helper(); 
	
	public static void main(String[] args ) {
		 
		 if(args.length>0)
		 {
			 if(args[0].equals("-help"))
				help.info_about_creater();
			 if (args[0].equals("-debug"))
				help.flag = true;
		 }	 
		 Menu(); 
		

		
		 
	}
//	substring(int start, int end)
//	Возвращает новый String, содержащий подпоследовательность символов, которые в данный момент содержатся в этой последовательности.
//	
 

	public static  void Menu()
	{
  
		String command, str = "";
		do
		{	
	 
			
			System.out.println("Доступні команди\r\n" + 
					"-  введення даних - 1\r\n" + 
					"-  перегляд даних - 2\r\n" + 
					"-  виконання обчислень - 3\r\n" +  
					"-  завершення програми - 0\r\n" + 
					"");
			System.out.println("Введіть команду: ");
			command = help.input_text();
			
			switch (command) {
			case "1": {
				 
				System.out.println("Введення рядка - ");	
				str =  help.input_text(); 
				break;
			}
			case "2": {
				
				
				System.out.println("Перегляд данних - ");	
				if(str != "")
					help.Show(str);
				else
					System.out.println("Ви не ввели рядок");
				break;
			}
			case "3": {
				
				System.out.println("Виконання індивідуального завдання"); 
				if(str != "")
					help.task(str);
				else
					System.out.println("Ви не ввели рядок");
				break;
			}
			case "0": { 
				System.out.println("Кінець програми");	
				
				break;
			}
			default:
				System.out.println("Ви помилилися командой");
				break;
			}
			
			
		}while(!(command.equals("0")));
		
	}

}

