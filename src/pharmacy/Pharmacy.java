/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pharmacy;

/**
 *
 * @author Entity
 */
public class Pharmacy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Splash mySplash = new Splash() ;
       mySplash.setVisible(true);
       try{
           for(int i=0 ; i<=100 ; i++){
               Thread.sleep(40);
               mySplash.jProgressBar1.setValue(i);
               mySplash.percent.setText(Integer.toString(i)+"%");
           }
       }
       catch(Exception e){
         e.printStackTrace();
       }
       new Login().setVisible(true);
       mySplash.dispose();
    }
   
   
    
}
