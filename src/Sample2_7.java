import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_7
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("Ո�����������᣿");
		System.out.println("Ոݔ��Y��N");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
		if(letter =='Y' || letter =='y')
		{
			System.out.println("����������!"); 
		}
		else if (letter =='N' || letter =='n')
		{
			System.out.println("����Ů����!"); 
		}
		else
		{
			System.out.println("Ոݔ��Y��N"); 
		}
	}
}