
package estudosvetores4;

import java.util.Scanner;


public class EstudosVetores4 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int vetorA [] = new int [5];
       int vetorB [] = new int [vetorA.length];
       
       for(int i = 0; i<vetorA.length;i++ ){
           
           System.out.println("informe o " +(i+1)+ " numero do vetor A ");
           
          vetorA[i] = sc.nextInt();
          
       }
        System.out.println("");
        
        
        for(int i = 0; i<vetorA.length;i++ ){
           
           System.out.println("informe o " +(i+1)+ " numero do vetor B ");
           
          vetorB[i] = sc.nextInt();
           
       }
      
        for(int i = 0; i<vetorA.length;i++ ){
           
           System.out.println("o verotr A = "+vetorA[i]);
           
       }
           System.out.println("");
          for(int i = 0; i<vetorA.length;i++ ){
           
           System.out.println("o verotr B = "+vetorB[i]);
           
           
       }
          int vetorC [] = new int [vetorA.length*2];
          
          for(int i =0; i<vetorA.length;i++){
              vetorC[i]= vetorA[i];
          }
           for(int i = 0; i<vetorB.length;i++){
               
              vetorC[vetorA.length +i]= vetorB[i];
          }
          
          
          for(int i=0; i<vetorC.length;i++){
              System.out.println("vetor C = " +vetorC[i]);
          }
    }
    
}
