Laporan Praktikum Algoritma dan Struktur Data Jobsheet 14 Tree

Nama : Muhammad Figo Ferdyano Taufik

NIM : 254107020125

Kelas : TI 1E

-> Percobaan 1

Hasil running

<img width="676" height="892" alt="image" src="https://github.com/user-attachments/assets/7f4c61f1-16f5-4542-9ff3-a25e2776822e" />

Pertanyaan

<img width="826" height="518" alt="image" src="https://github.com/user-attachments/assets/65e1c9a2-1c51-4c94-a804-3e7f78fef45f" />

Jawaban
1. Karena dengan binary search tree kita hanya perlu memilih satu arah (kiri/kanan) untuk perbandingan nilai
2. left untuk menyimpan alamat ke child kiri, sedangkan right untuk menyimpan alamat ke child kanan
3. a. root berfungsi sebagai titik awal dari seluruh tree (root node)
   b. Ketika objek tree baru dibuat, nilai root adalah null
4. Dibuat node baru, kemudian cek apakah tree kosong, karena root = null, maka tree tersebut kosong, node baru dijadikan root
5. a. parent = current, untuk menyimpan posisi node saat ini ke variabel parent
   b. if (mahasiswa.ipk < current.mahasiswa.ipk), untuk membandingkan ipk data baru dengan ipk node saat ini
   c. current = current.left, untuk berpindah ke child kiri
   d. if (current == null), jika child kiri kosong maka posisi penyisipan telah ditemukan
   e. else, jika ipk baru lebih besar atau sama dengan ipk node saat ini
   f. current = current.right, untuk berpindah ke child kanan
   g. if (current == null), jika child kiri kosong maka posisi penyisipan telah ditemukan
6. Menentukan node yang akan dihapus, kemudian memanggil Node00 successor = getSuccessor(current), method getSuccessor() mencari node pengganti yaitu node dengan nilai terkecil pada subtree kanan, node successor menggantikan posisi node yang dihapus, lalu child kiri dari node lama dipindah ke successor, terakhir node lama terhaous dari tree
   Peran method getSuccessor adalah mencari in-order successor (node dengan nilai paling kecil pada subtree kanan)

-> Percobaan 2

Hasil running

<img width="552" height="185" alt="image" src="https://github.com/user-attachments/assets/3ffe5086-a659-414a-baa5-120df7b64e8e" />

Pertanyaan

<img width="755" height="221" alt="image" src="https://github.com/user-attachments/assets/afb0c682-b138-45fb-80be-5e3b89924b3f" />

Jawaban
1. data digunakan untuk mentimpan seluruh node binary tree dalam bentuk array
   idxLast digunakan untuk menyimpan indeks terakir yang berisi data pada array
2. Untuk mengisi data tree ke dalam array dan menentukan indeks terakhir yang berisi data
3. Untuk menampilkan seluruh node pada binary tree dengan inorder traversal
4. left child 2(2) + 1 = 5
   right child 2(2) + 2 = 6
5. Untuk menandai batas akhir data yang terisi, mencegah traversal mengakses indeks di luar data yang digunakan, menjadi penghentian rekursi pada traversal
6. Karena 2*idxStart+1 menunjukkan posisi child kiri, sedangkan 2*idxStart+2 menunjukkan posisi child kanan. Rumus tersebut merepresentasikan struktur pohon biner dalam array tanpa memerlukan pointer left dan right seperti pada linked list

-> Tugas
1. Menambahkan method add rekursif
   <img width="686" height="423" alt="image" src="https://github.com/user-attachments/assets/7fb10b69-a195-4d53-8b91-6f6f250aecec" />
2. Menambahkan method untuk mencari mahasiswa dengan ipk terkecil/terbesar
   <img width="635" height="661" alt="image" src="https://github.com/user-attachments/assets/83ee9a90-9474-4bcb-b29b-6a76d406377e" />
   <img width="500" height="99" alt="image" src="https://github.com/user-attachments/assets/9b117f12-016b-4796-86c9-90914ec8c054" />
3. Menambahkan method untuk menampilkan mahasiswa dengan IPK diatas 3.50
   <img width="624" height="391" alt="image" src="https://github.com/user-attachments/assets/b30b6f52-da19-439c-a8df-73022de86fe0" />
   <img width="503" height="99" alt="image" src="https://github.com/user-attachments/assets/9e7aff96-a1dd-4971-8e17-19b4185d3e04" />
4. Menambahkan method add dan traverse pre order
   <img width="580" height="437" alt="image" src="https://github.com/user-attachments/assets/688928a2-8d9b-4d9e-a1be-c4b53007b1c7" />
   <img width="513" height="190" alt="image" src="https://github.com/user-attachments/assets/5e55c2ea-cf6d-4e61-914d-49d06116dbae" />
