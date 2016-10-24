/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal1;

/**
 *
<<<<<<< HEAD
 * @author Miguel Paz
 */
public class SalaCine {
=======
 * @author David
 */
public class SalaCine {
    Ticket asientos[][]= new Ticket[10][30];
    int contticket=0;
    //Buscar por referencia
    public Coordenada buscarTicket(int n){
        return buscarTicket(n,0,0,10,30);
    }
    private Coordenada buscarTicket(int numero,int f,int c,int filas, int columnas){
        if(f<filas){
            if(c<columnas){
                if(numero == asientos[f][c].getIdTicket()){
                Coordenada coor = new Coordenada(f,c);
                return coor;
                }
            return buscarTicket(numero,f,c+1,filas,columnas);
            }
            else{
                return buscarTicket(numero,f+1,0,filas,columnas);
            }
            
                
        }
        return null;
    }
>>>>>>> 56c96b82f5011884325f4bd50283aa26c390d4ff
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
<<<<<<< HEAD
=======
    
    double income(){
        
    }
    public void reset(){
        
     borrar (0,0);
     contticket=0;
       
    } 
    private void borrar(int f, int c){
        if (f<10){
            if (c<=f){
             asientos [f] [c]= null;
             borrar (f, c+1);
             
            }else{
                borrar (f+1, c);
            }
        }  
    }
    
>>>>>>> 56c96b82f5011884325f4bd50283aa26c390d4ff
}
