/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal1;

import java.util.Calendar;

/**
 *
 * @author ANDY ESCOBAR 007
 */
public class Ticket {
    int idTicket;
    Calendar fecha;
    double precio;
    
    public Ticket(int n,double precio){
        Calendar hoy=Calendar.getInstance();
        idTicket=n;
        this.precio=precio;
        fecha=Calendar.getInstance();
    }
    
    
    public void print(){
        System.out.println("N° del Ticket: "+getIdTicket()+"  Precio: "+ getPrecio()+"  Fecha"+ fecha.getTime());
    }

    public int getIdTicket() {
        return idTicket;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public double getPrecio() {
        return precio;
    }
    
    
        
        
        
        
}

