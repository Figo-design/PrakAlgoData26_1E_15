package P3;

public class DataDosen15 {
    public void dataSemuaDosen15(Dosen15[] arrayOfDosen15) {
        int counter15 = 1;
        for (Dosen15 dosen15 : arrayOfDosen15) {
           
            System.out.println("Data Dosen ke-" + counter15);
            System.out.println("Kode            : " + dosen15.kode15);
            System.out.println("Nama            : " + dosen15.nama15);
            System.out.println("Jenis Kelamin   : " + (dosen15.jenisKelamin15 ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dosen15.usia15);
            System.out.println("---------------------------------");
            counter15++;
            }
        }

    public void jumlahDosenPerJenisKelamin15(Dosen15[] arrayOfDosen15) {
        int pria15 = 0, wanita15 = 0;

        for (Dosen15 dosen15 : arrayOfDosen15) {
            if (dosen15.jenisKelamin15) {
                pria15++;
            } else {
                wanita15++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria15);
        System.out.println("Jumlah Dosen Wanita : " + wanita15);
    }

    public void rerataUsiaDosenPerJenisKelamin15(Dosen15[] arrayOfDosen15) {
        int totalUsiaPria15 = 0, totalUsiaWanita15 = 0;
        int jmlPria15 = 0, jmlWanita15 = 0;

        for (Dosen15 dosen15 : arrayOfDosen15) {
            if (dosen15.jenisKelamin15) {
                totalUsiaPria15 += dosen15.usia15;
                jmlPria15++;
            } else {
                totalUsiaWanita15 += dosen15.usia15;
                jmlWanita15++;
            }
        }

        if (jmlPria15 > 0)
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalUsiaPria15 / jmlPria15));
        if (jmlWanita15 > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalUsiaWanita15 / jmlWanita15));
    }

    public void infoDosenPalingTua15(Dosen15[] arrayOfDosen15) {
        Dosen15 tertua15 = arrayOfDosen15[0];

        for (Dosen15 dosen15 : arrayOfDosen15) {
            if (dosen15.usia15 > tertua15.usia15) {
                tertua15 = dosen15;
            }
        }

        System.out.println("Nama    : " + tertua15.nama15);
        System.out.println("Usia    : " + tertua15.usia15);
    }

        public void infoDosenPalingMuda15(Dosen15[] arrayOfDosen15) {
            Dosen15 termuda15 = arrayOfDosen15[0];
    
            for (Dosen15 dosen15 : arrayOfDosen15) {
                if (dosen15.usia15 < termuda15.usia15) {
                    termuda15 = dosen15;
                }
            }
    
            System.out.println("Nama    : " + termuda15.nama15);
            System.out.println("Usia    : " + termuda15.usia15);
        }
}
