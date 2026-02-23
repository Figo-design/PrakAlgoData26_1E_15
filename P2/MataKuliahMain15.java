package P2;

public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 mk1 = new MataKuliah15("AL", "Aljabar Linear", 2, 4);
        mk1.tampilInformasi15();
        mk1.ubahSKS15(3);
        mk1.tambahJam15(4);
        mk1.kurangiJam15(2);
        mk1.tampilInformasi15();
        System.out.println();

        MataKuliah15 mk2 = new MataKuliah15();
        mk2.kodeMK15 = "ASD";
        mk2.nama15 = "Algoritma Struktur Data";
        mk2.sks15 = 4;
        mk2.jmlJam15 = 8;

        mk2.tampilInformasi15();;
        mk2.ubahSKS15(6);
        mk2.tambahJam15(2);
        mk2.tampilInformasi15();
    }
}
