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
			System.out.println("请输入请求文本:");
			System.out.println(DCrypt.Crypt.Decrypt(bufin.readLine(),"kj9T6NgLyGz0ehs6"));
		}
		catch(IOException E)
		{
			System.out.println("发生I/O错误!!!");
		}
	}
}