public class QueueLinkedList {
    Node front, rear;
    int size;
    int max;
    
    public QueueLinkedList(int max){
        front = null;
        rear = null;
        size = 0;
        this.max = max;
    }
    public boolean IsEmpty(){
        return front == null;
    }
    public boolean IsFull(){
        return size == max;
    }
    public void clear (){
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
    public void enqueue(Mahasiswa data) {
        if (IsFull()) {
            System.out.println("Maaf, antrian sudah penuh!");
        } else {
            Node newNode = new Node(data, null);
            if (IsEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("-> Mahasiswa a.n " + data.nama + " berhasil masuk antrian.");
        }
    }
    public void dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada yang bisa dipanggil!");
        } else {
            Mahasiswa dipanggil = front.data;
            System.out.println(">>> MEMANGGIL ANTRIAN <<<");
            System.out.println("NIM       : " + dipanggil.nim);
            System.out.println("Nama      : " + dipanggil.nama);
            System.out.println("Keperluan : " + dipanggil.keperluan);
            
            front = front.next;
            size--;
            
            if (IsEmpty()) { 
                rear = null; 
            }
        }
    }
    public void peekFrontAndRear() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("--- Antrian Terdepan ---");
            System.out.println(front.data.nama + " (NIM: " + front.data.nim + ")");
            System.out.println("--- Antrian Paling Akhir ---");
            System.out.println(rear.data.nama + " (NIM: " + rear.data.nim + ")");
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            Node tmp = front;
            int i = 1;
            System.out.println("--- Daftar Mahasiswa Yang Sedang Antre ---");
            while (tmp != null) {
                System.out.println(i + ". " + tmp.data.nama + " | Keperluan: " + tmp.data.keperluan);
                tmp = tmp.next;
                i++;
            }
            System.out.println("\nJumlah mahasiswa yang masih mengantre: " + size);
        }
    }
}
