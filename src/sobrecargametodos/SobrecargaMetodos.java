/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos;

/**
 *
 * @author Usuario
 */
public class SobrecargaMetodos {

        String titulo = "Se7en.";
        String genero = "Suspenso psicológico.";
        
        
        public void mostrarPelicula(){
        System.out.println("La película es: " + titulo);
        System.out.println("Pertenece al género: " + genero);
        }
        
                
        public void mostrarPelicula(String genero){
        System.out.println("La película pertenece al género: " + genero);
        }
        
        
    public static void main(String[] args) {
        SobrecargaMetodos peli1 = new SobrecargaMetodos ();
        peli1.mostrarPelicula();
        System.out.println("------------------");
        peli1.mostrarPelicula("Drama");
    }
    
    
}

