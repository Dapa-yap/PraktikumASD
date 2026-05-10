public class stackSurat {
    surat10[] stack;
    int size;
    int top;

    public stackSurat(int size) {
        this.size = size;
        stack = new surat10[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(surat10 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
            System.out.println("Surat berhasil diterima dan ditumpuk!");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public surat10 pop() {
        if (!isEmpty()) {
            surat10 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang masuk.");
            return null;
        }
    }
    public void cariSurat(String namaMhs) {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat.");
            return;
        }
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMhs)) {
                System.out.println("=====================================");
                System.out.println("Surat ditemukan pada tumpukan ke-" + (top - i + 1) + " dari atas.");
                System.out.println("ID Surat   : " + stack[i].idSurat);
                System.out.println("Nama       : " + stack[i].namaMahasiswa);
                System.out.println("Kelas      : " + stack[i].kelas);
                System.out.println("Jenis Izin : " + (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 's' ? "Sakit" : "Keperluan Lain"));
                System.out.println("Durasi     : " + stack[i].durasi + " hari");
                System.out.println("=====================================");
                ditemukan = true;
                break; 
            }
        }
        
        if (!ditemukan) {
            System.out.println("Surat dari mahasiswa bernama " + namaMhs + " tidak ditemukan.");
        }
    }
}