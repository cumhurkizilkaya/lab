package lab;

import java.util.Random;

/**
 *
 * @author BM
 */
public class Main {
	

    
    public  static int bublesort(int []dizi){
        int yedek;
        int swap=0;
        int karsilastirma=0;
        
        for(int i=0;i<dizi.length-1;i++){
            for(int j=i;j<dizi.length-1;j++){
                if(dizi[j]<dizi[i]){
                    yedek=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=yedek;
                    swap++;
                }
                karsilastirma++;
            }
            
    }
        for(int i=0;i<dizi.length;i++){
            System.out.print(dizi[i]+" , ");
        }
        System.out.println();
        System.out.println("buble swap sayýmýz : "+swap);
        System.out.println("buble Karþýlaþtýrma  sayýmýz : "+karsilastirma);
        return 0;
        
           
    }

    //selection
    
    public static int SelectionSort(int [] dizi){
        
    
    
    int sKarsilastirma=0;
    int sYedekleme=0;
    
    
    
        for (int i = 0; i < dizi.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < dizi.length; j++){
                sKarsilastirma=sKarsilastirma+1;
                if (dizi[j] < dizi[index]){
                    index = j;
      
                int smallerNumber = dizi[index]; 
                dizi[index] = dizi[i];
                dizi[i] = smallerNumber;
                sYedekleme=sYedekleme+1;
                }
            }

        }
        
     System.out.println();
     System.out.println("selection swap= " + sYedekleme);
    
    System.out.println();
    System.out.println("selection karsilastirma= " + sKarsilastirma);
    System.out.println();
  
    return 0;
       
    }
    
    //selection
 
   
    
    public static void main(String[] args) {
        
        int[] dizi = new int[500];
        Random rnd = new Random();
        for(int i=0;i<dizi.length;i++){
            dizi[i]=rnd.nextInt(100000);
        }
         bublesort(dizi);
        SelectionSort(dizi);
   
        
    }
    
}