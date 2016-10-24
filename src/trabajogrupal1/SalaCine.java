/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal1;

/**
 *
 * @author Miguel Paz
 */
public class SalaCine {
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
}
