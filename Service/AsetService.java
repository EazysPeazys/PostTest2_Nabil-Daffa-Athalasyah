/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.util.ArrayList;
import java.util.Scanner;
import Model.AsetInvestasi;
/**
 *
 * @author LENOVO
 */
public class AsetService {
    private ArrayList<AsetInvestasi> daftarAset = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // CREATE
    public void tambahAset() {
        System.out.print("Masukkan nama aset: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jenis aset (Emas/Saham/Crypto/Obligasi/Reksa Dana): ");
        String jenis = input.nextLine();

        // Validasi angka
    double nilai = 0;
    boolean valid = false;
    while (!valid) {
        try {
            System.out.print("Masukkan nilai aset: ");
            nilai = Double.parseDouble(input.nextLine());

            if (nilai <= 0) {
                System.out.println("Nilai aset harus lebih dari 0!");
            } else {
                valid = true; // input valid
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid! Nilai aset harus berupa angka.");
        }
    }

    AsetInvestasi aset = new AsetInvestasi(nama, jenis, nilai);
    daftarAset.add(aset);

    System.out.println("Aset berhasil ditambahkan!");
}

    // READ
    public void lihatAset() {
        if (daftarAset.isEmpty()) {
            System.out.println("Belum ada data aset yang di tambahkan!");
        } else {
            System.out.println("\n===< Daftar Aset >===");
            for (int i = 0; i < daftarAset.size(); i++) {
                System.out.println((i + 1) + ". " + daftarAset.get(i));
            }
        }
    }

    // UPDATE
    public void ubahAset() {
        lihatAset();
        if (!daftarAset.isEmpty()) {
            System.out.print("Pilih nomor aset yang ingin diubah: ");
            int index = input.nextInt();
            input.nextLine();
            if (index > 0 && index <= daftarAset.size()) {
                AsetInvestasi aset = daftarAset.get(index - 1);

                System.out.print("Nama baru (" + aset.getNama() + "): ");
                aset.setNama(input.nextLine());

                System.out.print("Jenis baru (" + aset.getJenis() + "): ");
                aset.setJenis(input.nextLine());

                System.out.print("Nilai baru (" + aset.getNilai() + "): ");
                aset.setNilai(input.nextDouble());
                input.nextLine();

                System.out.println("Aset berhasil diubah!");
            } else {
                System.out.println("Nomor aset tidak valid! Silahkan masukkan nomor yang valid!");
            }
        }
    }

    // DELETE
    public void hapusAset() {
        lihatAset();
        if (!daftarAset.isEmpty()) {
            System.out.print("Pilih nomor aset yang ingin dihapus: ");
            int index = input.nextInt();
            input.nextLine();
            if (index > 0 && index <= daftarAset.size()) {
                daftarAset.remove(index - 1);
                System.out.println("Aset berhasil dihapus!");
            } else {
                System.out.println("Nomor aset tidak valid! Silahkan masukkan nomor yang valid!");
            }
        }
    }

    // SEARCH
    public void cariAset() {
        System.out.print("Masukkan nama aset yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (AsetInvestasi aset : daftarAset) {
            if (aset.getNama().toLowerCase().contains(keyword)) {
                System.out.println("Ditemukan: " + aset);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf aset tidak ditemukan!");
        }
    }
}