package com.tutorial;

// Class tanpa constructor
class Polos {
    String dataString;
    int dataInteger;
}

// Class dengan construktor 
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // Ini adalah constructor = Dipanggil saat objek pertama kali di buat
    // Mahasiswa() {
    //     System.out.println("Ini adalah Constructor");
    // }

    // Constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);

    }

}

public class Main {

    public static void main (String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("Zulkarnen", "1900016072", "Sistem Informasi");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ahmad", "1800017062", "Perbankan");

    }
    
}
