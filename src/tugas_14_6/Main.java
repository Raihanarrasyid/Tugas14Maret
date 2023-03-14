package tugas_14_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //test hexToDecimal
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka hexadesimal: ");
        String hexString = in.nextLine();
        System.out.println("Hexadecimal " + hexString + " dalam desimal adalah " + hexToDecimal(hexString.toUpperCase()));

    }

    static int hexToDecimal(String hexString) {
        if (hexString.matches("[0-9A-F]+") == false)
            throw new NumberFormatException("Inputan harus berupa angka hexadesimal!");
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;

    }

    static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }

}
