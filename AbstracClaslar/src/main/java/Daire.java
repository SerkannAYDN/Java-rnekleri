

/**
 *
 * @author Serkan
 */
public class Daire extends Sekil{
     private int yarıcap;
    public Daire(String isim,int yarıcap) {
        super(isim);
        this.yarıcap=yarıcap;
    }

    @Override
    void alanHesapla() {
        
        System.out.println(getIsim()+" alanı "+(Math.PI*yarıcap*yarıcap)+"dır.");
    }
    
}
