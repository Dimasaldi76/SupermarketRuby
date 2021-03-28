
package project1;


public class LinkedList implements Project {
   public Data head, tail;
   public DataPenjualan head1, tail1;
   public DataPembelian head2, tail2;

   public LinkedList(){
       head=null;
       tail=null;
       head1=null;
       tail1=null;
       head2=null;
       head2=null;
   }
    @Override
    public int enqueue (){
        Data DT= new Data();
        DT.input();
        
        for(Data a=head;a!=null; a=a.next){
            if(DT.id_barang==a.id_barang){
                return 0;
            }
        }
        if (head==null)
             head= DT; 
        else 
             tail.next=DT;
             tail=DT;   
        return 0;
   }
   @Override
   public void dequeue (){
       if (head==null){
           System.out.println("\n\t\t\t\t\tKosong");
       }else {
           System.out.println("\n\t\t\t\t\tKode barang dengan nomor : " + head.id_barang + " dengan nama barang " + head.nama_barang);
           head=head.next;
       }
   }
   @Override
   public void view (){
       if (head==null){
           System.out.println("\n\t\t\t\t\tData Kosong");
       }else{
           System.out.println("\n\t\t\t\t==========================================================");
           System.out.println("\t\t\t\t|| Id || Nama \t\t|| Harga \t|| Stok||");
           for (Data a=head; a!=null;a=a.next) a.read();
           System.out.println("\t\t\t\t==========================================================");
       }
   }
   @Override
   public int enqueue_DPenjualan (){
        DataPenjualan DP= new DataPenjualan();
        DP.inputdata_penjualan();
        for (Data a=head;a!=null; a=a.next){
            if(DP.id_barang==a.id_barang){
                if(a.stok<DP.qt){
                    System.out.println("\n\t\t\t\tTransaksi tidak dapat dilakukan!!!!");
                    return 1;
                }
            }
        }
        if (head1==null)
             head1= DP; 
        else 
             tail1.next1=DP;
             tail1=DP;   
        for (Data a=head;a!=null; a=a.next){
            if(DP.id_barang==a.id_barang){
                PerhitunganStok s = new PerhitunganStok(a.stok, DP.qt);
                a.stok=s.updatestok_penjualan();
                return 1;
            }
        }
        return 0;
   }
   public int enqueue_DPembelian(){
       DataPenjualan DP= new DataPembelian();
        DP.inputdata_penjualan();
        
        if (head1==null)
             head1= DP; 
        else 
             tail1.next1=DP;
             tail1=DP;   
        for (Data a=head;a!=null; a=a.next){
            if(DP.id_barang==a.id_barang){
                PerhitunganStok s = new PerhitunganStok(a.stok, DP.qt);
                a.stok=s.updatestok_pembelian();
                return 1;
            }
        }
        return 0;
   }

    
   
   
}













