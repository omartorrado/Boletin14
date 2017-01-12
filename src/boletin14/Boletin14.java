/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author otorradomiguez
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println(ConversorTemp.centigradosAFarenheit(89));
            System.out.println(ConversorTemp.centigradosAReamur(150));
        }
        catch(TempErroException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally");
        }
    }
    
}
