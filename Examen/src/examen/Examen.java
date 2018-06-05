
package examen;

import java.util.Scanner;




public class Examen {

    
    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        int numLibros;
        
        
        do{
        
        System.out.println("Cuantos libros va a ingresar ? ");
        System.out.println("NOTA: capacidad maxima de libros = 10");
        numLibros = scan.nextInt();
        
        
        
        }while( numLibros > 10 );
        System.out.println("Usted ingreso correctamente el numero de libros maximos");
        Libro[] libros = new Libro[numLibros];
              
        int opcion = 0;
        
        do{
            
            System.out.println("        ##Bienvenido a su biblioteca##");  
            System.out.println("1._Ingresar libros en la biblioteca");
            System.out.println("2._Imprimir la lista de todos los libros favoritos");
            System.out.println("3._Contar libros de autor");
            System.out.println("\n");
            
            System.out.print("Escoja una opcion: ");
            opcion = scan.nextInt();
            
            switch(opcion){
                
                case 1: 
                    
                    
                    for(int i = 0; i<libros.length; i++){
                        libros[i] = new Libro();
                        scan.nextLine();
                        System.out.println("Ingrese la siguiente informacion del libro " + (i+1));
                        
                        System.out.println("Ingrese el titulo del libro  "+ (i+1));
                        
                        String nombreTitulo = scan.nextLine();                        
                        libros[i].setTitulo(nombreTitulo);
                                                
                        System.out.println("Ingrese los datos del Autor "+ (i+1));
                        Autor[] autores = new Autor[1];
                        
                        
                        
                        for(int j = 0; j<autores.length; j++){
                            
                            autores[j] = new Autor();
                            
                            
                            //System.out.println("\n");
                            System.out.print("Ingrese el nombre del Autor " + (j+1) + ": ");
                            String nombreAutor = scan.nextLine();
                            autores[j].setNombre(nombreAutor);
                            
                            System.out.print("Ingrese el pais del Autor " + (j+1) + ": ");
                            String paisAutor = scan.nextLine();
                            autores[j].setPais(paisAutor);
                            
                            libros[i].setAutor(autores);
                            
                        }
                        /*(System.out.println("\n");
                        break;*/
                        
                        System.out.println("\n");
                        System.out.print("Ingrese el año del libro  "+ (i+1));
                        int anioLibro = scan.nextInt();
                        libros[i].setAnio(anioLibro);
                        
                        System.out.println("Desea agregar este libro a sus favoritos? ...");
                        System.out.println("SI : 1 / NO: 0");
                        int fav = scan.nextInt();
                        if( fav == 1){
                            libros[i].setFavorito(true);
                        }else{
                            libros[i].setFavorito(false);
                        }
                        
                        
                        
                     }
                    
                    
                    break;
                    
                case 2: 
                    System.out.println("Esta es la informacion: ");
                    for(int i = 0; i < libros.length; i++){
                        System.out.println(libros[i]);
                    }
                    break;
                    
                case 3:
                    int cont = 0;
                    for(int i = 0; i<libros.length; i++){
                        
                        cont = cont + 1;
                    }
                    System.out.println("numero de libros : " +  cont);
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta ADIOS");
                    break;
                
                
                
                
                
                
            }
            
            
        }while( opcion != 3);   
    }
    
}
