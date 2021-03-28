
package project1;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        int menu;
        Scanner input = new Scanner(System.in);
        LinkedList pil_menu = new LinkedList();
        DataPenjualan pil_menu1 = new DataPenjualan();
        
        System.out.println("\n\t\t======================================================================");
        System.out.println("\t\t\t\t\t      Supermarket Ruby");
        System.out.println("\t\t\t\t\tMemberikan pelayanan yang terbaik");
        System.out.println("\t\t======================================================================");
        do{
        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\tPilih Menu : ");
        System.out.println("\t\t\t\t\t1. Input data barang");
        System.out.println("\t\t\t\t\t2. Delete data barang");
        System.out.println("\t\t\t\t\t3. View data barang");
        System.out.println("\t\t\t\t\t4. Input data transaksi penjualan");
        System.out.println("\t\t\t\t\t5. Input data transaksi pembelian");
        System.out.println("\t\t\t\t\t8. Keluar");
        System.out.println("\t\t\t\t\t-------------------------");
        System.out.print("\t\t\t\t\t     Pilihan Anda : ");
        menu = input.nextInt();
        if (menu==1){
            pil_menu.enqueue();
        }else if (menu==2){
            pil_menu.dequeue();
        }else if(menu==3){
            pil_menu.view();
        }else if(menu==4){
            pil_menu.view();
            pil_menu.enqueue_DPenjualan();
        }else if(menu==5){
            pil_menu.view();
            pil_menu.enqueue_DPembelian();
        }
        else if(menu==8){
            System.out.println("\t\t\t\t\tTerimakasih!!!");
        }else {
            System.out.println("\t\t\t\t\tPerhatikan data yang Anda inputkan!!!");
        }
        
        }while (menu!=8);
    }
    
}
