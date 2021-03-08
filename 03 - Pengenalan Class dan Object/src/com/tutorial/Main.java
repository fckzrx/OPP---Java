package com.tutorial;


// Membuat Class sebagai template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}


public class Main {

    public static void main (String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Zulkarnen";
        mahasiswa1.NIM = "1900016072";
        mahasiswa1.jurusan = "Sistem Informasi";
        mahasiswa1.IPK = 3.6;
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Bonny";
        mahasiswa2.NIM = "1900016071";
        mahasiswa2.jurusan = "Sistem Informasi";
        mahasiswa2.IPK = 2.1;
        mahasiswa2.umur = 22;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
    



}
