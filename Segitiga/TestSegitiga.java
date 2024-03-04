package Segitiga;

public class TestSegitiga {
    
    public static void main(String[] args) {
        SegitigaKaki segitigaKaki = new SegitigaKaki(5, 5, 5);
        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(2, 2, 2, 2, 2);
        SegitigaSiku segitigaSiku = new SegitigaSiku(4, 4, 4, 4, 4);
        SegitigaSisi segitigaSisi = new SegitigaSisi(3, 3, 3);

        segitigaKaki.getInfo();
        segitigaSembarang.getInfo();
        segitigaSiku.getInfo();
        segitigaSisi.getInfo();
    }
}
