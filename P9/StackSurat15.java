package P9;

public class StackSurat15 {
    Surat15[] stack;
    int size;
    int top;

    public StackSurat15(int size) {
        this.size = size;
        stack = new Surat15[size];
        top = -1;
    }

    public boolean isFull() {
         if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat15 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat15 pop() {
        if (!isEmpty()) {
            Surat15 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak bisa memproses surat.");
            return null;
        }
    }

    public Surat15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang ditambahkan.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID SUrat    : " + stack[i].idSurat);
                System.out.println("Nama        : " + stack[i].namaMahasiswa);
                System.out.println("Kelas       : " + stack[i].kelas);
                System.out.println("Jenis Izin  : " + stack[i].jenisIzin);
                System.out.println("Durasi      : " + stack[i].durasi);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan");
        }
    }
}
