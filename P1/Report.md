Laporan Praktikum Algoritma dan Struktur Data Jobsheet 1 Konsep Dasar Pemrograman

Nama : Muhammad Figo Ferdyano Taufik

NIM : 254107020125

Kelas : TI 1E

2.1 Praktikum Pemilihan Pertanyaan

Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan di luar rentang tersebut maka akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya lakukan konversi nilai dengan ketentuan sebagai berikut:

<img width="521" height="262" alt="image" src="https://github.com/user-attachments/assets/6bbc4348-a3fa-409c-affd-bbca2882f9cd" />

Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS.

• Input dari program berupa komponen nilai tugas, kuis, UTS, UAS

• Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan

• Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS/ TIDAK LULUS

Jawaban

1. Hasil running program ketika salah satu nilai tidak valid

<img width="270" height="201" alt="image" src="https://github.com/user-attachments/assets/2201d261-3fe0-4723-8228-ca845a0eff1f" />

2. Hasil running program ketika semua nilai valid

<img width="282" height="239" alt="image" src="https://github.com/user-attachments/assets/f7b1d81d-0601-4a7d-bee0-1986d158fda1" />

2.2 Praktikum Perulangan Pertanyaan

Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n, dengan n = 2-digit terakhir NIM Anda. Berikut Adalah ketentuan untuk mencetak deretnya a. Bilangan kelipatan 3 dicetak dengan simbol # b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya c. Bilangan ganjil dicetak dengan simbol * d. Bilangan 10 dan 15 tidak dicetak *bila n<10 maka tambahkan 10 (n+=10)
Jawaban

1. Hasil running program ketika nilai 2 digit terakhir < 10

<img width="258" height="56" alt="image" src="https://github.com/user-attachments/assets/bcd8283d-8790-409b-a908-7bb0741b4630" />

2. Hasil running program ketika nilai 2 digit terakhir > 10

<img width="383" height="56" alt="image" src="https://github.com/user-attachments/assets/5038d7c7-4d02-4cfa-bde2-7c0d9e0aca9d" />

2.3 Praktikum Array Pertanyaan

Buatlah program untuk menghitung IP Semester dari mata kuliah yang Anda tempuh semester lalu. Formula untuk menghitung IP semester sebagai berikut:

<img width="363" height="54" alt="image" src="https://github.com/user-attachments/assets/bc5154c2-eb5b-4dcb-ba27-70297f1598fa" />

Nilai setara didapatkan dari tabel konversi berikut ini:

<img width="526" height="264" alt="image" src="https://github.com/user-attachments/assets/46052a9e-3311-4c3f-93c5-a63ac8667926" />

Input dari program berupa nama mata kuliah, bobot SKS, serta nilai huruf dari mata kuliah tersebut.

Jawaban

Hasil running program

<img width="697" height="450" alt="image" src="https://github.com/user-attachments/assets/a54bfdc1-328c-4cd5-9acc-240fed0fdfc3" />

2.4 Praktikum Fungsi Pertanyaan

RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga-bunga yang dijual selalu dicatat dengan rincian seperti berikut ini: Baris = Cabang Toko, Kolom = Stock bunga pada hari x

<img width="687" height="166" alt="image" src="https://github.com/user-attachments/assets/3eae466b-cd82-49cf-9bc5-cf2410f42e97" />

Rincian Harga Aglonema =75.000, Keladi = 50.000, Alocasia =60.000, Mawar =10.000.

1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual.

2. Tampilkan status dari setiap cabang dengan ketentuan sebagai berikut ini :

a. Jika pendapatan cabang > Rp1.500.000, maka cabang tersebut mendapat status “Sangat Baik”

b. Jika pendapatan ≤ Rp1.500.000, status “Perlu Evaluasi”.

Jawaban

Hasil running

<img width="191" height="219" alt="image" src="https://github.com/user-attachments/assets/f7c2ee60-0746-4c8e-b397-c82db04f722e" />

Tugas 1 

Pertanyaan

Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. Ilustrasi tampilan array tersebut adalah sebagai berikut:

<img width="623" height="324" alt="image" src="https://github.com/user-attachments/assets/58571774-05fd-430c-ac1b-ef614e7cfa9c" />

Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan nama kota dari kode plat nomor tersebut.

Jawaban

Hasil running

<img width="294" height="38" alt="image" src="https://github.com/user-attachments/assets/51a2ad5c-830c-4ef1-a971-b5fa8196d752" />

Tugas 2 Pertanyaan

Sebuah program digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa. Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan
• Baris menyatakan jadwal ke-i 
• Kolom menyatakan informasi jadwal: Nama Mata Kuliah, Ruang, Hari Kuliah, , Jam Kuliah. Contoh :
jadwal[0][0] = "Pemrograman Dasar" 
jadwal[0][1] = "Lab Komputasi 1" 
jadwal[0][2] = "Senin" 
jadwal[0][3] = "08.00–10.00" 
• Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna. Buatkan fungsi untuk
a. Menginput data jadwal kuliah ke dalam array 2 dimensi 
b. Menampilkan seluruh jadwal kuliah dalam bentuk tabel 
c. Menampilkan jadwal kuliah berdasarkan hari tertentu 
d. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu

Jawaban

Hasil running

Menu 1 input jadwal kuliah

<img width="326" height="371" alt="image" src="https://github.com/user-attachments/assets/39a7305b-b30e-427b-8e9c-ca304d595d03" />

Menu 2 menampilkan semua jadwal kuliah

<img width="415" height="218" alt="image" src="https://github.com/user-attachments/assets/36dcc008-150f-4a62-a8b2-7b6b5ccf193c" />

Menu 3 mencari jadwal berdasarkan hari

<img width="349" height="214" alt="image" src="https://github.com/user-attachments/assets/75bf576d-2766-4c6e-ba64-e87c7999a732" />

Menu 4 mencari jadwal berdasarkan mata kuliah

<img width="388" height="209" alt="image" src="https://github.com/user-attachments/assets/f611b7eb-40c5-4615-a25d-774cb492543f" />

Menu 5 keluar program

<img width="329" height="148" alt="image" src="https://github.com/user-attachments/assets/25e570be-1e20-40b5-87f3-bdf24f7ad749" />
