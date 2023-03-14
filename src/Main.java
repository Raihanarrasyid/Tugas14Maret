import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        boolean validInput = false;
        
        while(!validInput) {
            try {
              System.out.print("Masukkan angka pertama: ");
              a = in.nextInt();
              System.out.print("Masukkan angka kedua: ");
              b = in.nextInt();
              validInput = true;
            } catch (Exception e) {
              // TODO: handle exception
              System.out.println("Inputan harus berupa angka!");
              in.nextLine();
            }
        }
        int sum = a + b;
        System.out.println("Hasil penjumlahan: " + sum);
    }
}