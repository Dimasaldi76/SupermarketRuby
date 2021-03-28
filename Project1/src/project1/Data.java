
package project1;

import java.util.Scanner;
public class Data {
    
    public int id_barang, stok=0, harga;
    public String nama_barang;
    public Data next;
    
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
    
    public void input(){
        System.out.println("\n");
        System.out.print("\t\t\t\t\tMasukkan id barang       : ");
        id_barang=in.nextInt();
        System.out.print("\t\t\t\t\tMasukkan nama barang     : ");
        nama_barang=str.nextLine();
        System.out.print("\t\t\t\t\tMasukkan harga barang    : ");
        harga=in.nextInt();
        next=null;       
    }
    
    public void read(){
        System.out.println("\t\t\t\t|| "+id_barang+ "  || " + nama_barang + "\t|| " + harga+ "\t|| " + stok+"\t||");
    }
    
    
        
}
