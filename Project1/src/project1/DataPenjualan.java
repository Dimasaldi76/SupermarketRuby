/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;
public class DataPenjualan {
    
    public String tanggal;
    public int qt, id_barang;
    public static Scanner in = new Scanner (System.in);
    public static Scanner str= new Scanner (System.in);
    public DataPenjualan next1;
    
    public void inputdata_penjualan(){
        System.out.println("\n");
        System.out.print("\t\t\t\t\tMasukkan tanggal          : ");
        tanggal=str.nextLine();
        System.out.print("\t\t\t\t\tMasukkan kode barang      : ");
        id_barang=in.nextInt();
        System.out.print("\t\t\t\t\tMasukkan jumlah           : ");
        qt=in.nextInt();
        next1=null;    
    }
}
