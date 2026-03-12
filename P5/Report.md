Laporan Praktikum Algoritma dan Struktur Data Jobsheet 5 Brute Force dan Devide Conquer

Nama : Muhammad Figo Ferdyano Taufik

NIM : 254107020125

Kelas : TI 1E

-> Percobaan 1

Hasil running

<img width="320" height="60" alt="image" src="https://github.com/user-attachments/assets/06282b83-6b0b-4f39-a2c8-c733bbb0570e" />

Pertanyaan

<img width="792" height="236" alt="image" src="https://github.com/user-attachments/assets/4864de97-68f0-458c-a294-470ee76dd222" />

Jawaban
1. if berguna untuk menentukan base case yang digunakan untuk menghentikan rekursi
   else berguna untuk menjalankan rekursi dengan memecah masalah menjadi bagian-bagian kecil sampai ke base case
2. Perulangan pada method faktorialBF() tidak harus menggunakan for, tetapi bisa menggunakan while atau do while, karena semua jenis perulangan bisa digunakan asal logikanya benar.
<img width="263" height="207" alt="image" src="https://github.com/user-attachments/assets/9d607115-7a3b-45d7-9e28-c93bc6dfae33" />

3. fakto = fakto * i nilai fakto akan dikalikan dengan i untuk setiap iterasi hingga selesai
   int fakto = n * faktorialDC(n-1) akan memanggil dirinya sendiri hingga base case
4. faktorialBF() akan mengalikan nilai mulai dari 1 sampai ke n secara bertahap
   faktorialDC() akan memanggil dirinya sendiri dengan nilai yang lebih kecil (n-1) sampai base case

-> Percobaan 2

Hasil running

<img width="389" height="279" alt="image" src="https://github.com/user-attachments/assets/4de101f8-830b-40b8-aa48-adedb434efc8" />

Pertanyaan

<img width="802" height="307" alt="image" src="https://github.com/user-attachments/assets/81a358a6-86b2-438b-a0d8-d5cf0325399e" />

Jawaban
1. Method pangkatBF() menghitung pangkat menggunakan metode bruteforce yang perulangannya mengalikan nilai basis dengan dirinya sendiri sebanyak nilai pangkat, sedangkan pangkatDC() menggunakan metode Divide and Conquer yang membagi masalah menjadi lebih kecil dengan memanggil method yang sama secara rekursif, program membagi pangkat menjadi setengah kemudian mengalikan hasilnya kembali, jika pangkat bernilai ganjil akan dikalikan nilai basis.
2. Iya sudah
<img width="536" height="67" alt="image" src="https://github.com/user-attachments/assets/5934d64b-1fc2-490c-8d0a-186e1d315885" />

3. Method pangkatBF() berparameter masih relevan jika method ingin dibuat lebih fleksibel, sehingga bisa menghitung pangkat dari nilai lain tanpa bergantung pada atribut objek. Method tersebut juga bisa dibuat tanpa parameter. Contoh:
<img width="354" height="147" alt="image" src="https://github.com/user-attachments/assets/58ed39c0-e673-4f00-8afe-7d3e292d267b" />

4. Method pangkatBF() bekerja secara iteratif (Brute Force) menggunakan perulangan. Program akan mengalikan nilai basis dengan dirinya sendiri secara berulang sebanyak nilai pangkat. Proses ini dilakukan sampai perulangannya selesai.
Sedangkan method pangkatDC() bekerja menggunakan rekursi metode Divide and Conquer. Program ini memecah masalah pangkat menjadi bagian yang lebih kecil dengan membagi pangkat menjadi setengahnya (n/2), kemudian mengalikan hasilnya kembali. Jika pangkat bernilai ganjil maka hasilnya dikalikan nilai basis.

-> Percobaan 3

Hasil running

<img width="449" height="150" alt="image" src="https://github.com/user-attachments/assets/981589f5-cfd0-48af-b429-e0b31556d022" />

Pertanyaan

<img width="640" height="300" alt="image" src="https://github.com/user-attachments/assets/5eadbc00-d0e2-4dde-bda5-f24241d1c5e7" />

Jawaban
1. Variabel mid diperlukan untuk menentukan titik tengah array sehingga dapat dibagi menjadi dua bagian.
2. double lsum15 = totalDC15(arr, l, mid15) menghitung jumlah elemen pada array sebelah kiri dengan indeks l sampai mid
   double rsum15 = totalDC15(arr, mid15 + 1, r) menghitung jumlah elemen pada array sebelah kanan dengan indeks mid + 1 sampai r
3. Itu merupakan tahap combine dalam algoritma devide and conquer, pada program tersebut menggabungkan hasil kedua sub array.
4. Ketika indeks l dan r bernilai sama.
5. Method totalDC() melakukan eksekusi dengan metode devide and conquer untuk menghitung toatal nilai dalam sebuah array. Cara kerjanya dengan membagi menjadi 2 bagian array dengan indeks tengah, kemudian masing-masing dihitung secara rekursif sampai base case. Setelah selesai, hasil kedua bagian dijumlahkan sehingga menjadi nilai total dari sebuah array.

-> Tugas

<img width="783" height="524" alt="image" src="https://github.com/user-attachments/assets/5543e615-4654-42fc-9f50-0ebedd962a05" />

Hasil running

<img width="314" height="62" alt="image" src="https://github.com/user-attachments/assets/8229fe36-d215-4e1e-9b9b-2fc6c09e2de1" />
