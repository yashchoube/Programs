package main;

import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;

public class PasswordGenerator {

	private static final int shift = 2;
	public static void main(String args[]) {
	//String plaintext ="12345";
	
	String ciphertext ="abcde";
    //char alphabet;
    String decryptMessage = "";
    
    for(int i=0; i < ciphertext.length();i++)  

    {
        // Shift one character at a time
        char alphabet = ciphertext.charAt(i);
        // if alphabet lies between a and z 
       if(alphabet >= 33 && alphabet <= 142)
        {
            // shift alphabet
            alphabet = (char) (alphabet - shift);
        
            // shift alphabet lesser than 'a'
            if(alphabet < 'a') {
                //reshift to starting position 
                alphabet = (char) (alphabet-'a'+'z'+1);
            }
            decryptMessage = decryptMessage + alphabet;
        }    
            // if alphabet lies between A and Z
        else if(alphabet >= 'A' && alphabet <= 'Z')
        {
         // shift alphabet
            alphabet = (char) (alphabet - shift);
            
            //shift alphabet lesser than 'A'
            if (alphabet < 'A') {
                // reshift to starting position 
                alphabet = (char) (alphabet-'A'+'Z'+1);
            }
            decryptMessage = decryptMessage + alphabet;            
        }
        else 
        {
         decryptMessage = decryptMessage + alphabet;            
        } 
    }
    System.out.println(" decrypt message : " + decryptMessage);
}
}