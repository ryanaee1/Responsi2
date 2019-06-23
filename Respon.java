
package respon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Respon {

   
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    BufferedReader input2=new BufferedReader (new InputStreamReader (System.in));

//inisialisasi variabel
    int i =0;
    String [] hp = new String [100];
    String [] perdana = new String [100];
    int [] harga = new int[100];
    int [] harga2 = new int[100];
    String keputusan = "Y";
    int jumlah =0;
    int hargatotal=0;
    int bayar=0;
    int kembali=0;
    int potongan=0;
    int hargatotal1=0;


//buat tampilan awal
    System.out.println("***************");
    System.out.println("T-Cell");
    System.out.println("Selamat Datang & Selamat Berbelanja");
    System.out.println("***************");
    System.out.println("Ready segala Merk HP dan Perdana Operator");
    System.out.println("Pilihan Merk HP : ");
    System.out.println("1. Samsung = Rp. 2.500.000,-");
    System.out.println("2. Sony Ericson = Rp. 2.000.000,-");
    System.out.println("3. OPPO = Rp. 2.300.000,-");
    System.out.println("Pilihan Perdana :");
    System.out.println("1. Perdana Telkomsel = Rp. 25.000,-");
    System.out.println("2. Perdana Indosat = Rp. 23.000,-");
    System.out.println("3. Perdana XL = Rp. 23.500,-");
    System.out.println("");
    System.out.println("***************");
    System.out.println("");

//pengkondisian
    while (keputusan.equals("Y")||keputusan.equals("y"))
{
   System.out.print("Silahkan pilih merk hp yang anda inginkan : ");
    int pilih = input.nextInt();
switch (pilih) {
case 1:
    hp [i] = "Samsung";
    harga [i] = 2500000;
break;
case 2:
    hp [i] = "Sony Ericson";
    harga [i] = 2000000;
break;
case 3:
    hp [i] = "OPPO";
    harga [i] = 2300000;
break;
case 4:
default:
   System.out.println("HP yang anda inginkan sedang Out Of Stock.");
break;
}
for (int k=pilih;k<4;k++){
   System.out.println("Merk HP yang anda pilih adalah : "+hp[i]);
   System.out.print("Jumlah pesanan : ");
   int jumlahhp = input.nextInt();
   harga[i]=harga[i]*jumlahhp;
        System.out.println("Harga HP sebesar : Rp. "+harga[i]+ " ;");
break;
}
    System.out.println("");
    System.out.print("Silahkan pilih Perdana yang anda inginkan : ");
    int pilih2=input.nextInt();
switch (pilih2){
case 1:
    perdana [i] = "Perdana Telkomsel";
    harga2 [i] = 25000;
break;
case 2:
    perdana [i] = "Perdana Indosat";
    harga2 [i] = 23000;
break;
case 3:
    perdana [i] = "Perdana XL";
    harga2 [i] = 23500;
break;
case 4:
default:
    System.out.println("Perdana yang anda inginkan sedang Out Of Stock.");
break;
}
for (int j=pilih2;j<4;j++){
   System.out.println("Perdana yang anda pilih adalah : "+perdana[i]); 
   System.out.print("Jumlah pesanan : ");
   int jumlahperdana = input.nextInt();
   harga2[i]=harga2[i]*jumlahperdana;
       System.out.println("Harga Perdana sebesar : Rp. "+harga2[i]+ " ;");
break;
}
    System.out.println("");
    int total=harga[i]+harga2[i];
        System.out.println("Total belanja anda sebesar : Rp. "+total+ " ;");

    System.out.println("Apakah anda ingin order lagi ? Y/T : ");
try{
    keputusan = input2.readLine();
}catch(IOException e){
        System.out.println("Failed to Read Keyboard");
}
    i++;
}
    System.out.println("List Pesanan anda adalah : ");

    for (int a = 0; a<i;a++){
        System.out.println(hp[a]);
}
    for (int b = 0; b<i;b++){
        System.out.println(perdana[b]);
}
    for (int c=0;c<i;c++) {
     hargatotal=hargatotal+harga[c]+harga2[c];
    }
    System.out.println("Total Bayaran : "+hargatotal);
   
    boolean diskon = hargatotal >= 3000000;
        System.out.println("Apakah kamu mendapatkan diskon 10%? : " + diskon);

    if (diskon == true) {
     potongan = hargatotal * 10 / 100;
        System.out.println("Selamat kamu mendapat diskon sebesar : " + potongan);
                        
    }
    hargatotal1=hargatotal-potongan;
        System.out.println("Total Bayaran dengan Diskon : "+hargatotal1);
        System.out.print("Masukan Jumlah Uang Yang Akan Dibayarkan Rp.");
    bayar = input.nextInt();
    kembali = bayar - hargatotal1;
        System.out.println("Jumlah Kembalian : Rp." + kembali );
    }

    }

      





    
    

