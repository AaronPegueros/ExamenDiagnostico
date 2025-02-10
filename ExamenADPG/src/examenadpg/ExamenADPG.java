/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenadpg;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class ExamenADPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info=new Scanner(System.in);
        Scanner edad=new Scanner(System.in);
        String Nom,FeNa,Genero,Oc,Hobb,Pel,Co,An,Ob,Or,Mot;
        int ed;
        System.out.print("Ingresa tu nombre (empezando por apellidos): ");
        Nom=info.nextLine();
        System.out.print("\nFecha de nacimiento: ");
        FeNa=info.nextLine();
        System.out.print("\nEdad: ");
        ed=edad.nextInt();
        System.out.print("\nSexo: ");
        Genero=info.nextLine();
        System.out.print("\nOcupacion o Trabajo: ");
        Oc=info.nextLine();
        System.out.print("\nHobbie favorito: ");
        Hobb=info.nextLine();
        System.out.print("\nPelícula favorita: ");
        Pel=info.nextLine();
        System.out.print("\nComida favorita: ");
        Co=info.nextLine();
        System.out.print("\nAnimal favorito: ");
        An=info.nextLine();
        System.out.print("\nQue esperas de mí en la carrera? ");
        Ob=info.nextLine();
        System.out.print("\nTe sientes o sentiste orgulloso de mí? (Si/No): ");
        Mot=info.nextLine();
        if (Mot.equalsIgnoreCase("No")) 
        {
            System.out.print("¿Por qué?:\n");
            Mot = info.nextLine();
        }
        else
        {
            System.out.print("Muchas Gracias por Estar Orgulloso de mi "+Nom);
        }
    }
    
}