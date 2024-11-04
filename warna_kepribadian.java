/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 */
public class warna_kepribadian {
     // ANSI escape codes for colors
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m"; // Reset color to default

    // Create a map to store personality traits for each color
    public static Map<String, String[]> personalityTraits = new HashMap<>();

    public static void main(String[] args) {
        // Initialize the personality traits for each color
        personalityTraits.put("MERAH", new String[]{
                "Menyenangkan",
                "Bijaksana",
                "Pembawa diri tenang saat menghadapi masalah",
                "Dinamis",
                "Senang berbagi",
                "Bersahabat",
                "Tidak terlalu suka menjadi sorotan banyak orang",
                "Menyembunyikan perasaan karena cenderung mencari jalan damai"
        });

        personalityTraits.put("HIJAU", new String[]{
                "Optimis",
                "Sabar",
                "Selalu bersikap logis",
                "Menyenangkan",
                "Pintar bergaul",
                "Cenderung pemimpin alami",
                "Ramah",
                "Tidak suka terlalu banyak bicara"
        });

        personalityTraits.put("KUNING", new String[]{
                "Kreatif",
                "Selalu punya ide segar",
                "Menyenangkan",
                "Optimis",
                "Sangat perhatian",
                "Suka tantangan",
                "Berani mengambil risiko",
                "Tidak suka rutinitas"
        });

        personalityTraits.put("BIRU", new String[]{
                "Menyenangkan",
                "Bijaksana",
                "Pembawa diri tenang saat menghadapi masalah",
                "Dinamis",
                "Senang berbagi",
                "Bersahabat",
                "Tidak terlalu suka menjadi sorotan banyak orang",
                "Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai"
        });

        personalityTraits.put("UNGU", new String[]{
                "Penuh misteri",
                "Suka merenung",
                "Memiliki jiwa seni yang tinggi",
                "Intuisi yang kuat",
                "Sering berpikir mendalam",
                "Mandiri",
                "Terkadang susah ditebak",
                "Sangat menjaga privasi"
        });

        // Start the program
        cekKepribadian();
    }

    public static void cekKepribadian() {
        Scanner scanner = new Scanner(System.in);

        // Display instructions with each word in different color
        System.out.println(RED + "YUK" + RESET + " " + 
                           GREEN + "CEK" + RESET + " " + 
                           YELLOW + "KEPRIBADIANMU" + RESET + " " +
                           BLUE + "DARI" + RESET + " " + 
                           PURPLE + "WARNA" + RESET + " " + 
                           RED + "FAVORITMU" + RESET);
        System.out.println("==========================================");
        System.out.println("Pilih warna favoritmu:");
        System.out.println(RED + "MERAH" + RESET + ", " + GREEN + "HIJAU" + RESET + ", " +
                           YELLOW + "KUNING" + RESET + ", " + BLUE + "BIRU" + RESET + ", " +
                           PURPLE + "UNGU" + RESET);

        // User input for favorite color and name
        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine().toUpperCase();
        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine().toUpperCase();

        // Output personality traits based on the selected color
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Warna Favoritmu adalah: " + applyColor(warnaFavorit) + warnaFavorit + RESET);

        if (personalityTraits.containsKey(warnaFavorit)) {
            String[] traits = personalityTraits.get(warnaFavorit);
            for (int i = 0; i < traits.length; i++) {
                System.out.println((i + 1) + ". " + traits[i]);
            }
        } else {
            System.out.println("Warna tidak valid. Pilih warna dari MERAH, HIJAU, KUNING, BIRU, UNGU.");
        }
    }

    // Function to apply the correct color code based on user's input
    public static String applyColor(String color) {
        switch (color) {
            case "MERAH":
                return RED;
            case "HIJAU":
                return GREEN;
            case "KUNING":
                return YELLOW;
            case "BIRU":
                return BLUE;
            case "UNGU":
                return PURPLE;
            default:
                return RESET;
        }
    }
}
