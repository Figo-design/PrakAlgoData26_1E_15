Laporan Praktikum Algoritma dan Struktur Data Jobsheet 6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT) 

Nama : Muhammad Figo Ferdyano Taufik

NIM : 254107020125

Kelas : TI 1E

-> Percobaan 1A

Hasil running

<img width="425" height="95" alt="image" src="https://github.com/user-attachments/assets/a2564f20-da91-4084-8adf-742b4fcf6c68" />

-> Percobaan 1B

Hasil running

<img width="449" height="91" alt="image" src="https://github.com/user-attachments/assets/b2910cb8-1265-48dd-a212-357754d0c7d9" />

-> Percobaan 1C

Hasil running

<img width="462" height="89" alt="image" src="https://github.com/user-attachments/assets/b59f812b-7fbf-4dfb-896d-15050b4bb560" />

Pertanyaan

<img width="812" height="731" alt="image" src="https://github.com/user-attachments/assets/f66e2584-0ac1-45ab-bbf2-403dca3eaa09" />

Jawaban
1. Kode ini digunnakan untuk mengurutkan data secara ascending dalam bubble sort dengan kondisi jika elemen kiri lebih besar dari elemen kanan maka akan ditukar posisinya
2. if (data[j-1] > data[j]) {
    temp = data[j];
    data[j] = data[j-1];
    data[j-1] = temp;
}
3. Kondisi j >= 0 memastikan indeks tidak keluar dari array
   data[j] > temp data sebelumnya lebih besar dari nilai yang akan disisipkan
   Fungsinya menggeser elemen ke kanan samapai menemukan posisi yang tepat untuk temp
4. Digunakan untuk menggeser elemen ke kanan

-> Percobaan 2A

Hasil running

<img width="508" height="573" alt="image" src="https://github.com/user-attachments/assets/aab7249b-2cf8-4e69-8831-55dae102afac" />

<img width="501" height="573" alt="image" src="https://github.com/user-attachments/assets/0266f403-79fd-4c7d-8c64-d50d2457ae3f" />

Pertanyaan

<img width="734" height="339" alt="image" src="https://github.com/user-attachments/assets/ed595731-4d9d-42fd-b140-282a8eda0731" />

Jawaban
1. A. Karena membutuhkan n-1 tahap untuk memastikan semua data terurut

   B. Karena setiap iterasi i, elemen paling akhir sudah terurut, jadi bagian yang perlu dicek semakin berkurang

   C. Perulangan i = 49 kali dan tahap bubble sort = 49 tahap
3. Modifikasi program
   <img width="644" height="703" alt="image" src="https://github.com/user-attachments/assets/9b2a5732-7209-49cc-a30f-e167d5a079b0" />

-> Percobaan 2B

Hasil running

<img width="506" height="583" alt="image" src="https://github.com/user-attachments/assets/8c7f6b1b-2abb-4d51-b71b-97b5fed2eebb" />

<img width="505" height="602" alt="image" src="https://github.com/user-attachments/assets/044cdef3-bdab-42e8-b028-06cc87674b23" />

Pertanyaan

<img width="676" height="299" alt="image" src="https://github.com/user-attachments/assets/023dcd57-29a1-4014-9ea4-b3a212722c35" />

Jawaban

idxMin = i artinya menganggap elemen indeks i adalah yang terkecil sementara
perulangan for (j=i+1 ...) artinya membandingkan elemen setelah indeks i sampai akhir array
kondisi if digunakan untuk membandingkan ipk saat ini dengan ipk minimum sementara, jika ditemukan ipk lebih kecil maka idxMin diperbarui ke posisi tersebut
Fungsi proses ini adalah menentukan posisi ipk terkecil dalam array yang belum terurut

-> Percobaan 2C

Hasil running

<img width="525" height="587" alt="image" src="https://github.com/user-attachments/assets/ca038558-7d9a-4d61-97cb-1857f855afa3" />

<img width="521" height="598" alt="image" src="https://github.com/user-attachments/assets/31143de8-931c-4dea-9d8b-29c0b3a55b04" />

Pertanyaan

<img width="740" height="128" alt="image" src="https://github.com/user-attachments/assets/333f7a06-fe86-4789-aef3-7823f499f46b" />

Jawaban

Modifikasi program
<img width="561" height="276" alt="image" src="https://github.com/user-attachments/assets/14f27010-e51e-4bbd-aca9-b284d01daebd" />

-> Latihan

<img width="687" height="789" alt="image" src="https://github.com/user-attachments/assets/e2e0b88b-c05f-43d3-82c1-f3a27dc0118b" />

Hasil running

<img width="524" height="460" alt="image" src="https://github.com/user-attachments/assets/c33e598f-7d6c-4ec5-8a71-01ae9390c072" />

<img width="529" height="421" alt="image" src="https://github.com/user-attachments/assets/af450602-df3d-4e65-b295-b7fd1abd88ae" />

<img width="533" height="439" alt="image" src="https://github.com/user-attachments/assets/dff56667-fae5-47b2-b7d3-2edf03ebe451" />

<img width="527" height="621" alt="image" src="https://github.com/user-attachments/assets/a943b8e5-1f9b-40c8-9115-a627fb2859d6" />
