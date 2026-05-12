Laporan Praktikum Algoritma dan Struktur Data Jobsheet 12 Double Linked List

Nama : Muhammad Figo Ferdyano Taufik

NIM : 254107020125

Kelas : TI 1E

-> Percobaan 1

Hasil running

<img width="490" height="671" alt="image" src="https://github.com/user-attachments/assets/ce770112-dd39-43bc-9b92-c1e54111e123" />

<img width="480" height="390" alt="image" src="https://github.com/user-attachments/assets/5477d324-5e06-4fda-b91f-98f3152360b6" />

Pertanyaan

<img width="785" height="479" alt="image" src="https://github.com/user-attachments/assets/8e460faf-dc39-4c8b-a854-4c08f33fc299" />

Jawaban
1. Single Linked List:
   Setiap node hanya memiliki 1 pointer yaitu next
   Traverssal hanya bisa dilakukan dari depan ke belakang
   Penghapusan node tertentu lebih sulit karena harus mencari node sebelumnya
   Double Linked List:
   Setiap node memiliki 2 pointer yaitu next dan prev
   Traversal bisa dilakukan 2 arah, dari head ke tail atau sebaliknya
   Penghapusan lebih mudah karena node sebelumnya bisa diakses dengan prev
2. next:
   Digunakan untuk menunjuk node berikutnya
   Berfungsi saat traversal maju dari head ke tail
   Digunakan saat penambahan atau penghapusan node agar node tetap tersambung
   prev:
   Digunakan untuk menunjuk node sebelumnya
   Berfungsi saat traversal mundur dari tail ke head
   Mempermudah manipulasi node seperti penghapusan karena dapat mengakses node sebelumnya tanpa
   traversal ulang
3. Menginisialisasi linked list dalam keadaan kosong, dengan nilai head = null dan tail = null
4. Karena saat linked list kosong lalu ditambahkan 1 node pertama maka node tersebut menjadi node
   pertama sekaligus node terakhir
5. Modifikasi program
   <img width="576" height="297" alt="image" src="https://github.com/user-attachments/assets/59f3bb7a-dd50-4b43-9b53-3a437efb70db" />
6. Modifikasi program
   <img width="574" height="296" alt="image" src="https://github.com/user-attachments/assets/3915c61f-7f54-4ed8-86ea-86c6a1d30e86" />

-> Percobaan 2

Hasil running

<img width="496" height="713" alt="image" src="https://github.com/user-attachments/assets/bccf6a5f-2d04-46d3-9525-8a7ae6b7a356" />

<img width="494" height="650" alt="image" src="https://github.com/user-attachments/assets/98438749-d368-46d4-901b-9ee0f5417043" />

<img width="489" height="315" alt="image" src="https://github.com/user-attachments/assets/ddcae9a5-a243-4561-9dae-fbe9746b7da3" />

Pertanyaan

<img width="789" height="214" alt="image" src="https://github.com/user-attachments/assets/92b5096f-8345-4b04-907f-6438e7eb5ead" />

Jawaban
1. head = head.next:
   Digunakan untuk memindahkan posisi head ke node berikutnya
   Artinya node pertama lama dihapus dari linked list dan node kedua menjadi node pertama yang baru
   head.prev = null;
   Digunakan untuk memutus hubungan node baru dengan node lama yang sudah dihapus
2. Modifikasi program
   <img width="540" height="445" alt="image" src="https://github.com/user-attachments/assets/862f4d5d-8edc-4384-ac47-f35db3bbe86f" />
  <img width="537" height="441" alt="image" src="https://github.com/user-attachments/assets/72cb73d8-830e-42bd-9cf0-dd3ed7473124" />

-> Tugas

Hasil running

