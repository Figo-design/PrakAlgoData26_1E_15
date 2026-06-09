package P15;
import java.util.ArrayList;
import java.util.Collections;;

public class SortingDemo15 {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();

        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        Collections.sort(daftarSiswa);
        System.out.println(daftarSiswa);

        ArrayList<Customer15> customers = new ArrayList<>();

        customers.add(new Customer15(1, "Zakia"));
        customers.add(new Customer15(5, "Budi"));
        customers.add(new Customer15(4, "Cica"));
        customers.add(new Customer15(100, "Rosa"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}
