package myPack;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Array_Digest {

    public static void main(String[] args) {
        // Example array
        byte[] dataArray = { 1, 2, 3, 4, 5 };

        try {
            // Create a MessageDigest object with SHA-256 algorithm
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Update the digest with the array data
            digest.update(dataArray);

            // Get the final digest (hash) as a byte array
            byte[] hashedArray = digest.digest();

            // Convert the byte array to a hexadecimal string for easy representation
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedArray) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }

            System.out.println("Original Array: " + byteArrayToHexString(dataArray));
            System.out.println("Hashed Array (SHA-256): " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    // Helper method to convert a byte array to a hexadecimal string
    private static String byteArrayToHexString(byte[] array) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : array) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1)
                hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
