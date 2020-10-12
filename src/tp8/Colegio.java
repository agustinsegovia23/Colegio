/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

/**
 *
 * @author agustin
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia ingles = new Materia (11,"Ingles I",1);
        Materia laboratorio1 = new Materia(12, "Laboratorio 1", 1);
        Materia matematica = new Materia (15, "Matematica", 1);
        
        
        
        Alumno alumno1 = new Alumno(1001,"Lopez", "Martin");
        
        Alumno alumno2 = new Alumno (1002, "Martinez", "Brenda");
        
        alumno1.agregarMateria(ingles);
        alumno1.agregarMateria(laboratorio1);
        alumno1.agregarMateria(matematica);
       
        
        alumno2.agregarMateria(ingles);
        alumno2.agregarMateria(laboratorio1);
        alumno2.agregarMateria(matematica);
        alumno2.agregarMateria(laboratorio1);
        
        System.out.println("La cantidad de materias de Lopez es: "+alumno1.cantidadMaterias());
        System.out.println("La cantidad de materias de Martinez es: "+alumno2.cantidadMaterias());
        
        /* La cantidad de materias inscriptas es igual para ambos alumnos 
        porque la coleccion que implementé es HashSet, la cual no permite duplicados. */
        
    }
    
}
