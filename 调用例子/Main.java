import DCrypt.Crypt;
import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try
		{
			System.out.println("�����������ı�:");
			System.out.println(DCrypt.Crypt.Decrypt(bufin.readLine(),"kj9T6NgLyGz0ehs6"));
		}
		catch(IOException E)
		{
			System.out.println("����I/O����!!!");
		}
	}
}