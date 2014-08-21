/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;
import java.util.Date;
/**
 *
 * @author Lab4
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int diaSemana;
    Date dt=new Date();
    diaSemana=dt.getDay();
    switch (diaSemana){
        case 0: System.out.println("Hoje é Domingo");
            break;
        case 1: System.out.println("Hoje é Segunda");
            break;
        case 2: System.out.println("Hoje é Terça");
            break;
        case 3: System.out.println("Hoje é Quarta");
            break;
        case 4: System.out.println("Hoje é Quinta");
            break;
        case 5: System.out.println("Hoje é Sexta");
            break;
        case 6: System.out.println("Hoje é Sabado");
            break;
       }
    }
    }
    
