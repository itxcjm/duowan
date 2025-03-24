import java.io.UnsupportedEncodingException;

import java.util.Base64;


public class Decrypt {
    public static void main(String[] args) {
        System.out.println(Decrypt(
                "Am4KPVF2A0iNhNKO+bmd3MGp4v3QwYmM5pib1/HV4dlbYEU8UydMBh8USRMYHFgkFigCbAxnCVoW",
                "kj9T6NgLyGz0ehs6"));
    }

    public static String Decrypt(String Data, String Key) {
        try {
            final Base64.Decoder decoder = Base64.getDecoder();
            byte[] DataBytes = decoder.decode(Data);
            byte[] RetBytes = new byte[DataBytes.length];
            byte[] KeyBytes = Key.getBytes();
            int i = 0;

            for (int length = DataBytes.length - 1; length >= 0; length--) {
                RetBytes[length] = (byte) (DataBytes[length] ^ KeyBytes[i]);
                i++;

                if (i == KeyBytes.length) {
                    i = 0;
                }
            }

            return new String(RetBytes, "utf-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
