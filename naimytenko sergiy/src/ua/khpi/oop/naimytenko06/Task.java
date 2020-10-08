package ua.khpi.oop.naimytenko06;

public class Task {

	
	public static void task(Container cont)
	{
		String str = cont.toString();
		StringBuilder b_str = new StringBuilder(str);
		int size = b_str.length(); 
		char[] arr = new char[size];
		b_str.getChars(0, size,arr,0); 
		
		System.out.println(arr);
 
		for (int i=0,j= 0; j < size; j++) 
		{
			if(j+1!=size)
			{
					if(j<size && (j==0||arr[j-1]==' ' || arr[j+1]==',' || arr[j-1]=='.' ||   arr[j-1]=='!' ||  arr[j-1]=='?' || arr[j-1]==':' ||  arr[j-1]==';'))
				{
					i=j;
				}
				if(j!= size && (arr[j+1]==' ' || arr[j+1]==',' || arr[j+1]=='.' ||   arr[j+1]=='!' ||  arr[j+1]=='?' || arr[j+1]==':' ||  arr[j+1]==';'|| j+1==size-1))
				{
					for(int k=i,f=j; f!=k && f>=i && k<=j ;f--,k++)
					{
						if(arr[k]==arr[f]&&(f>=0||k<=size))
							if(k+1==f-1||f-1==k||k+1==f)
								System.out.println(b_str.substring(i, j+1));
					} 

				}
			}
		
		} 
	
	}
}
