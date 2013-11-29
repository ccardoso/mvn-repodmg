/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy.rim.type;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author llerena
 */
public class CS extends RimDataType {

    private String value;

    public void encode(AlgorithmType algorithm, String salt, String data) {  
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance(algorithm.name());
            messageDigest.update((data + salt).getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String encryptedPassword = (new BigInteger(messageDigest.digest())).toString(16);
        System.out.println("Encrypted Password: " + encryptedPassword); 
    }

    public String decode(AlgorithmType algorithm, String[] params) {
        return "";
    }
}
