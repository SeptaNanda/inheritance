package Tugas;
public class Pegawai {

public String nip, nama, alamat;

Pegawai(){
    
}
    public Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public void getNama(String nama){
        System.out.println("Nama : " + nama);
    }
    public void getGaji(int gaji){
        System.out.println("Gaji : " + gaji);
    }
}
