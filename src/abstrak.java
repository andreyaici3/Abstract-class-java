/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrey
 */
public class abstrak {
    public static void main(String[] args){
       
        mahasiswa mhs;
        mhs = new mahasiswa();
        
        mhs.setData("Andrey", "Cikubangmulya");
        mhs.Biodata();
        mhs.ubahAlamat("Kuningan");
        mhs.Biodata();
        
    }
}

abstract class orang{
    String nama;
    String alamat;
    
    public abstract void Biodata();    
    
    public String ubahAlamat(String alamat){
        return this.alamat = alamat;
    }
        
}

class mahasiswa extends orang {

    @Override
    public void Biodata() {
        System.out.println("Nama = " + super.nama + " Alamat: " + this.alamat);
    }
    
    public void setData(String nama, String alamat){
        super.nama = nama;
        super.alamat = alamat;
    }
    
    
}
