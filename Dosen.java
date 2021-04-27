package Tugas;

public class Dosen extends Pegawai {
    
    public int jumlahSKS, tarifSKS;
    
    Dosen(String nip, String nama, String alamat){
        super(nip,nama,alamat);
      
    }
    public String getNama(){
        System.out.println("Nama : " + nama);
        return this.nama;
    }
    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public int getGaji(){
        return this.jumlahSKS * this.tarifSKS;
    }
}
