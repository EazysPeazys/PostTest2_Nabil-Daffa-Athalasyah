/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author LENOVO
 */
public class AsetInvestasi {
    private String nama;
    private String jenis;
    private double nilai;

    // Constructor
    public AsetInvestasi(String nama, String jenis, double nilai) {
        this.nama = nama;
        this.jenis = jenis;
        this.nilai = nilai;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Jenis: " + jenis + ", Nilai: Rp" + nilai;
    }
}