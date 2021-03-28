/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class PerhitunganStok {

    private final int stok, qt;
    
    public PerhitunganStok(int stok, int qt){
        this.stok=stok;
        this.qt=qt;
    }
    
    public int updatestok_penjualan(){
        return this.stok-this.qt;
    }
    
    public int updatestok_pembelian(){
        return this.stok+this.qt;
    }
}
