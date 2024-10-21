package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci cümleyi giriniz: ");
        String cumle1 = scanner.nextLine();

        System.out.println("İkinci cümleyi giriniz: ");
        String cumle2 = scanner.nextLine();

        int index = cumle1.indexOf(cumle2);
        if (index != -1) {
            String cumle3 = cumle1.substring(0, index) + cumle1.substring(index + cumle2.length());
            System.out.println("İkinci girilen cümle ilk cümleden çıkarılınca aşağıdaki cümle elde edilmiştir:");
            System.out.println("\"" + cumle3.trim() + "\"");
        } else {
            System.out.println("İkinci cümle, birinci cümlede bulunamadı.");
        }
    }
}
