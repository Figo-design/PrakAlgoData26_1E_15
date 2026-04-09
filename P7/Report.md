Laporan Praktikum Algoritma dan Struktur Data Jobsheet 7 Searching

Nama : Muhammad Figo Ferdyano Taufik

NIM : 254107020125

Kelas : TI 1E

-> Percobaan 1

Hasil running

<img width="411" height="655" alt="image" src="https://github.com/user-attachments/assets/075f780f-4306-435b-ba8c-18084e884f8f" />

<img width="358" height="553" alt="image" src="https://github.com/user-attachments/assets/14b97e07-dc03-48cf-a530-8d0a9919b1ea" />

<img width="555" height="246" alt="image" src="https://github.com/user-attachments/assets/41ad4d7a-8cfa-46a7-85af-a70a67e190ed" />

Pertanyaan

<img width="752" height="701" alt="image" src="https://github.com/user-attachments/assets/06dbe3ef-6247-490b-ac09-6b23e84fda46" />

Jawaban:
1. method tampilPosisi berfungsi untuk menampilkan posisi data yang ditemukan
   method tampilDataSearch berfungsi untuk menampilkan isi data mahasiswa berdasarkan hasil
   searching
2. fungsi break untuk menghentikan perulangan ketika data sudah ditemukan
3. fungsi variabel pos untuk menyimpan index hasil pencarian
4. data yang pertama ditemukan karena setelah data yang dicari ketemu akan di break
5. loop akan berjalan terus sampai akhir,  jika ada data yang sama maka nilai posisi adalah index
   terakhir yang ditemukan

-> Percobaan 2

Hasil running

<img width="426" height="662" alt="image" src="https://github.com/user-attachments/assets/7ab99770-4cee-4a9f-8fdc-27003d3b860b" />

<img width="398" height="561" alt="image" src="https://github.com/user-attachments/assets/0f445ea3-c4b9-4e94-bda4-48559d10c2cb" />

<img width="546" height="290" alt="image" src="https://github.com/user-attachments/assets/25ebb731-e1af-4397-9b20-b844c1c9bf37" />

Pertanyaan

<img width="736" height="404" alt="image" src="https://github.com/user-attachments/assets/321a1d7d-6d44-486a-ac5d-46b8c810f8b1" />

Jawaban:
1. mid = (left + right) / 2;
2. if (cari == listMhs[mid].ipk) {
     return mid;
  } else if (listMhs[mid].ipk > cari) {
      return findBinarySearch(cari, left, mid - 1);
  } else {
      return findBinarySearch(cari, mid + 1, right);
  }
3. left = index paling kiri pencarian
   right = index paling kanan pencarian
   mid = index tengah pencarian
4. program tetap berjalan tapi hasilnya bisa salah, karena binary search datanya harus urut jika
   tidak urut maka pembagian kiri/kanan menjadi tidak valid
5. hasilnya bisa jadi salah, karena dalam program pakai logika ascending
   solusinya adalah mengubah kondisi(dibalik) agar menjadi descending
6. jika left > right artinya semua data sudah dicek tetapi datanya tidak ditemukan
7. modifikasi program
   <img width="590" height="131" alt="image" src="https://github.com/user-attachments/assets/53ce35a2-7501-48e7-b764-3f5d5425110a" />
