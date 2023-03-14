package tugas_14_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        Scanner in = new Scanner(System.in);
        boolean error = false;
        while (!error) {
            try {
                System.out.print("Masukkan index array: ");
                int index = in.nextInt();
                System.out.println("Nilai elemen array pada index " + index + " adalah " + a[index]);
                error = true;
            } catch (IndexOutOfBoundsException e) {
                // TODO: handle exception
                System.out.println("Index array melebihi batas!");
                in.nextLine();
            }
        }
    }
}
