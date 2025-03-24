import java.util.Base64;
import java.io.UnsupportedEncodingException;

public class Encode {
	public static void main(String []args) {
		try {
			final Base64.Decoder decoder = Base64.getDecoder();
			System.out.println(decode(new String(decoder.decode("wovCisOZwrTDlsKuwofCrMKZwqfCmsOQwoXCiMKTw5Y="), "UTF-8")));
		}
		catch(UnsupportedEncodingException e){
			System.out.println("Error :" + e.getMessage());
		}
	}
	public static String decode(String paramString)
	{
		char[] arrayOfChar = paramString.toCharArray();
		for (int i = 0; i < arrayOfChar.length; i++)
			arrayOfChar[i] = (char)(0xE0 ^ arrayOfChar[i]);
		return new String(arrayOfChar);
	}
}