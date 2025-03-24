package DCrypt;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
public class Crypt
{
	public static String Decrypt(String Data, String Key)
	{
		try
		{
			byte[] DataBytes = Base64.getDecoder().decode(Data);
			byte[] RetBytes = new byte[DataBytes.length];
			byte[] KeyBytes = Key.getBytes();
			int i = 0;
			for(int length = DataBytes.length - 1; length >= 0; length--)
			{
				RetBytes[length] = (byte)(DataBytes[length] ^ KeyBytes[i]);
				i++;
				if(i == KeyBytes.length)
				{
					i = 0;
				}
			}
			return new String(RetBytes, "utf-8");
		}
		catch(UnsupportedEncodingException e)
		{
			return null;
		}
	}
	public static String Encrypt(String Data, String Key)
	{
		try
		{
			byte[] DataBytes = Data.getBytes("utf-8");
			byte[] RetBytes = new byte[DataBytes.length];
			byte[] KeyBytes = Key.getBytes();
			int i = 0;
			for(int length = DataBytes.length - 1; length >= 0; length--)
			{
				RetBytes[length] = (byte)(DataBytes[length] ^ KeyBytes[i]);
				i++;
				if(i == KeyBytes.length)
				{
					i = 0;
				}
			}
			return new String(Base64.getEncoder().encodeToString(RetBytes));
		}
		catch(UnsupportedEncodingException e)
		{
			return null;
		}
	}
}