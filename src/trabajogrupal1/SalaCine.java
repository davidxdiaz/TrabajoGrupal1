/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal1;

/**
 *
 * @author David
 */
public class SalaCine {
    Ticket asientos[][]= new Ticket[10][30];
    int contTicket=0;
    //Buscar por referencia
    public Coordenada buscarTicket(int n){
        return buscarTicket(n,0,0,10);
    }
    private Coordenada buscarTicket(int numero,int f,int c,int filas){
        if(f<filas){
            if(numero == asientos[f][c].getIdTicket()){
                Coordenada coor = new Coordenada(f,c);
                return coor;
            }
            return buscarTicket(numero,f+1,c+1,filas);
                
        }
        return null;
    }
    private static boolean IsPalindromo (String name, int inicio, int fin){
       if(inicio < fin){
            if(name.charAt(inicio) == name.charAt(fin))
                return IsPalindromo(name,inicio+1,fin-1);
            return false;
        }
        return true;
    }
    public static boolean IsPalindromo (String name){
        return IsPalindromo(name,0, name.length()-1);
    }
    double income(){
        
    }
    
}
