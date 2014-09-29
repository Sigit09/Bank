package tugasrpl;

import javax.swing.JOptionPane;

public class bank {
 private String nama_nsb,pin,norek_nsb,no_t;
 private double s,saldo_awal,saldo_akhir;
 private double setor,ambil,jum;
 
 public void setnsb1(){
    nama_nsb=JOptionPane.showInputDialog("Masukan nama anda ?");
    norek_nsb=JOptionPane.showInputDialog("Masukan No. Rekening anda ?");
 }

public void setnsb2(){
    String dat=JOptionPane.showInputDialog("Masukan Saldo awal (min Rp 50.000)?");
    saldo_awal=Double.parseDouble(dat);
    saldo_akhir=saldo_awal;
    if (saldo_akhir<50000)
    {JOptionPane.showMessageDialog(null,"Maaf saldo awal min Rp 50.000");}
    else
    {
    saldo_akhir=saldo_awal;}
} 
public void ambil(){
String data=JOptionPane.showInputDialog("Masukan jumlah pengambilan ?");
    ambil=Double.parseDouble(data);
    if (saldo_akhir<50000)
    {JOptionPane.showMessageDialog(null,"Maaf saldo anda kurang");}
    else
    {
    JOptionPane.showMessageDialog(null,"Pengambilan Rp. "+ambil+" Berhasil !");
    saldo_akhir=saldo_akhir-ambil;}
}
public void transfer(){
no_t=JOptionPane.showInputDialog("Masukan norek tujuan ?");
String data=JOptionPane.showInputDialog("Masukan jumlah yang akan ditransfer ?");
jum=Double.parseDouble(data);
saldo_akhir=saldo_akhir-jum;
}
public void setnsb3(){
    {
    String data=JOptionPane.showInputDialog("Masukan jumlah nominal setoran (min Rp 1000)?");
    setor=Double.parseDouble(data);
    if (setor<1000)
    {JOptionPane.showMessageDialog(null,"Maaf Setoran minimal Rp 1000");}
    else
    {
    JOptionPane.showMessageDialog(null,"Setoran Rp. "+setor+" Berhasil!");
    saldo_akhir=saldo_akhir+setor;}
    }
}
 public String getb(){
     return nama_nsb;
 }
  public String geta(){
     return norek_nsb;
 }
  public double getc(){
      return saldo_akhir;
  }
  public double getd(){
      return jum;
      
  }
  public String gete(){
      return no_t;
  }
}