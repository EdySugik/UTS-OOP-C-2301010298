package menumakanan;

import java.util.Scanner;

/**
 *
 * @author Edy
 * TGL : 10 Mei 2025
 */
public class MenuRestoran {
    static MenuMakanan[] menuList = new MenuMakanan[100];
    static int jumlahMenu = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU RESTORAN ===");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Tampilkan Semua Menu");
            System.out.println("3. Ubah Menu");
            System.out.println("4. Hapus Menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // konsumsi newline

            if (pilihan == 1) {
                tambahMenu();
            } else if (pilihan == 2) {
                tampilkanMenu();
            } else if (pilihan == 3) {
                ubahMenu();
            } else if (pilihan == 4) {
                hapusMenu();
            } else if (pilihan == 5) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tambahMenu() {
        System.out.print("Kode Menu: ");
        String kode = sc.nextLine();
        System.out.print("Nama Menu: ");
        String nama = sc.nextLine();
        System.out.print("Harga: ");
        double harga = sc.nextDouble();
        sc.nextLine(); // konsumsi newline
        System.out.print("Kategori (Makanan/Minuman): ");
        String kategori = sc.nextLine();

        menuList[jumlahMenu++] = new MenuMakanan(kode, nama, harga, kategori);
        System.out.println("Menu berhasil ditambahkan.");
    }

    static void tampilkanMenu() {
        if (jumlahMenu == 0) {
            System.out.println("Belum ada menu.");
        } else {
            for (int i = 0; i < jumlahMenu; i++) {
                System.out.println(menuList[i]);
            }
        }
    }

    static void ubahMenu() {
        System.out.print("Masukkan Kode Menu yang ingin diubah: ");
        String kode = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahMenu; i++) {
            if (menuList[i].getKode().equalsIgnoreCase(kode)) {
                System.out.print("Nama Baru: ");
                String nama = sc.nextLine();
                System.out.print("Harga Baru: ");
                double harga = sc.nextDouble();
                sc.nextLine();
                System.out.print("Kategori Baru: ");
                String kategori = sc.nextLine();

                menuList[i].setNama(nama);
                menuList[i].setHarga(harga);
                menuList[i].setKategori(kategori);
                System.out.println("Menu berhasil diubah.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu tidak ditemukan.");
        }
    }

    static void hapusMenu() {
        System.out.print("Masukkan Kode Menu yang ingin dihapus: ");
        String kode = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahMenu; i++) {
            if (menuList[i].getKode().equalsIgnoreCase(kode)) {
                for (int j = i; j < jumlahMenu - 1; j++) {
                    menuList[j] = menuList[j + 1];
                }
                jumlahMenu--;
                System.out.println("Menu berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu tidak ditemukan.");
        }
    }
}