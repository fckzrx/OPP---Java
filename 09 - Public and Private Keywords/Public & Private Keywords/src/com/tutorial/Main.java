package com.tutorial;

class Player {
    String name; // Default, hanya bisa dibaca dan ditulis dari luar kelas
    public int exp; // Public, hanya bisa dibaca dan ditulis dari luar kelas
    private int health; // Private , hanya bisa dibaca dan ditulis dari dalam kelas saja

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // Default modifier access
    void display(){
        tambahExp(); // contoh mengakses private method
        System.out.println("\nName\t: " + this.name); 
        System.out.println("exp\t: " + this.exp); 
        System.out.println("health\t: " + this.health); // Membaca di dalam kelas
    }

    // Public
    public void ubahName (String nameBaru) {
        this.name = nameBaru;
    }

    // Private
    private void tambahExp() {
        this.exp += 100;
    }


}


class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Zul", 0, 100);

        // Default
        System.out.println(player1.name);
        player1.name = "Surti";
        System.out.println(player1.name);

        // Public
        System.out.println(player1.exp);
        player1.exp = 100;
        System.out.println(player1.exp);

        // Private  (Tidak bisa diakses)
        // System.out.println(player1.health);
        // player1.health = 200;
        // System.out.println(player1.health);

        // Methods
        // Default
        player1.display();

        // Public
        player1.ubahName("Tejo");
        player1.display();

        // Private (Tidak bisa diakses)
        // player.tambahExp();
        
    }
}