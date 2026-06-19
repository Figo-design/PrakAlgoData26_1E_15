package P16;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-25s %2d SKS", kodeMK, namaMK, sks);
    }
}