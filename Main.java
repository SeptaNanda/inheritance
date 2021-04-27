package Tugas;
public class Main {
    public static void main(String[] args) {
        
        Dosen DS = new Dosen("0341", "Naruto" , "Jl.Suhat 9");
        
        DaftarGaji DG = new DaftarGaji();
        DG.addPegawai(DS);
        DS.tarifSKS = 150000;
        DS.setSKS(4);
        DS.getNama();
        System.out.println("Gaji : " + DS.getGaji());
      
    }
    
}
