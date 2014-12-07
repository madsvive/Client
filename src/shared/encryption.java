package shared;

public class encryption {
	

//	Decryption path
	public String decrypt(byte[] b)
	{
		String Ffcryptkey = "3.1470";
//		Defines the decryption value of the byte
		//The 4 lines below needs to work later on, but for now, it will be hardcode
		System.out.println(Ffcryptkey);
		String crypKey = Ffcryptkey;
		System.out.println(crypKey);
		double doublekey = Double.parseDouble(crypKey);
		byte ff = (byte) doublekey;
//		Generates for loop containing decryption value
		for(int i = 0 ; i<b.length ; i++)
		{
			b[i] = (byte)(b[i]^ff);
		}
//		Generates new String without any white spaces following or leading
		String encrypted = new String(b).trim();
//		Returns decrypted String
		return encrypted;
	}
}
