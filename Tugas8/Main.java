package TugasDelapan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                =====================================
                + + + + + + + + + + + + + + + + + + +
                -------------------------------------
                Nama    : Erlis Maulidiyah Rizqiyani
                NIM     : 215150700111015
                Kelas   : TI-A
                -------------------------------------
                + + + + + + + + + + + + + + + + + + +
                =====================================""");
        System.out.println("Selamat Datang Di Game Defend FILKOM   !!");
        System.out.print("Silahkan masukkan nama player: ");
        String nama = in.nextLine();
        int role = 0;
        int count = 0;
        boolean start = true;

        //solving error
        while (true) {
            start = true;
            System.out.println("List daftar karakter: "
                    + "\n1. Magician"
                    + "\n2. Healer"
                    + "\n3. Warrior");
            System.out.println("Silahkan pilih karakter yang Anda inginkan : ");
            try {
                String roles = in.nextLine();
                role = Integer.parseInt(roles);
            } catch (Exception e) {
                start = false;
            }

            if (start && role > 0 && role < 4) {
                break;
            } else if (!start) {
                System.out.println(
                        "Tolong masukkan angka ya !!");

            } else {
                System.out.println(
                        "Tolong pilih karakter yang tersedia !!");
            }
        }

        Character tn = new Titan();
        Character cr = null;
        System.out.printf("Selamat datang, %s !%n", nama);

        switch (role) {
            case 1 -> {
                cr = new Magician();
                cr.info();
            }
            case 2 -> {
                cr = new Healer();
                ((Healer) cr).info();
            }
            case 3 -> {
                cr = new Warrior();
                ((Warrior) cr).info();
            }
            default -> {
            }
        }

        while (tn.getHp() > 0 && cr.getHp() > 0) {
            count++;
            System.out.printf("========== TURN %d ========== %n", count);
            System.out.println("Enemy's HP\t: " + tn.getHp());
            System.out.printf("%s's HP\t: %d%n", nama, cr.getHp());
            if (count % 2 == 0 && cr instanceof Healer) {
                ((Healer) cr).heal();
            }
            if (tn.attack() == true) {
                cr.receiveDamage(tn.getAttack());
            }
            if (cr.attack() == true) {
                tn.receiveDamage(cr.getAttack());
            }
        }
        if (tn.getHp() <= 0) {
            tn.setHp(0);
        } else if (cr.getHp() <= 0) {
            cr.setHp(0);
        }
        String hasil = tn.getHp() <= 0 ? nama : "Titan";
        System.out.println(hasil + " menang\n");
        System.out.println(
                "========== PLAYER ==========");
        cr.info();
        System.out.println(
                "\n========== MUSUH ==========");
        tn.info();
    }
}
