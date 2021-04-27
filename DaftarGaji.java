package Tugas;
public class DaftarGaji {

Pegawai listPegawai[];    
public int DaftarGaji(int gaji){
    return gaji;
}
    public void addPegawai(Pegawai p){
        listPegawai = new Pegawai[1];
        listPegawai[0] = new Pegawai();
        listPegawai[0].nama = p.nama;
        listPegawai[0].nip = p.nip;
        listPegawai[0].alamat = p.alamat;
    }
    public void printSemuaGaji(Object nama){
        System.out.println("" + nama);
    }
}
