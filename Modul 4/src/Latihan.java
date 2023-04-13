import java.util.HashMap;
import java.util.Scanner;

public class Latihan {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Latihan(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void Main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan> mhs = new HashMap<>();
        String input;
        Latihan data;
        mhs.put("1", new Latihan("Putri", "3H", "Struktur data", 020000));
        mhs.put("2", new Latihan("Agus", "3A", "Matematika", 2020012));
        mhs.put("3", new Latihan("Arro", "3D", "Pemrograman", 020017));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.printf("Data Mahasiswa : " + data.nama + ", Kelas : " + data.kelas + ", Mata Kuliah Praktikum : " + data.matkulPraktikum +  ", nim : " + data.nim);
        }
    }
}
