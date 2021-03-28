/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;
public class MenuBarang{

    public void menu_barang(){
        Scanner input = new Scanner(System.in);
        LinkedList pil_menu = new LinkedList();
        
        
        System.out.println("\n\n\n\t\t\t\t==================================================");
        System.out.println("\t\t\t\t            Pilih menu barang ");
        System.out.println("\t\t\t\t==================================================");
        System.out.println("\t\t\t\t1. Input data barang");
        System.out.println("\t\t\t\t2. Delete data barang");
        System.out.println("\t\t\t\t3. View data barang");
        System.out.print("\t\t\t\tPilihan Anda adalah : ");
        int pil = input.nextInt();
        if(pil==1){
            pil_menu.enqueue();
        }else if(pil==2){
            pil_menu.dequeue();
        }else if(pil==3){
            pil_menu.view();
        }else{
            System.out.println("\t\t\t\t\tPerhatikan data yang Anda inputkan!!!!!\n");
        }
    }
}
