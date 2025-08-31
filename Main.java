/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * Ejercicio 3: sistema de organización de gimnasios
 * fecha de creación: 30 de agosto de 2025
 * ultima modificación: 31 de agosto de 2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gimnasio gimnasio = new Gimnasio();
        Controlador controlador = new Controlador(gimnasio);

        int opcion;

        do { 
            System.out.println("1. registrar un miembro");
            System.out.println("2. registrar un entrenador");
            System.out.println("3. consultar información de Staff y miembros");
            System.out.println("4. modificar rutina");
            System.out.println("5. obtener reporte");
            System.out.println("6. salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: //aqui necesitaba crear una rutina de una vez para que funcionara bien
                    System.out.println("ingrese el nombre de la persona que desea registrar");
                    String nombre = scanner.nextLine();

                    System.out.println("ingrese la membresía (basic, gold, diamond): ");
                    String membresia = scanner.nextLine();

                    System.out.println("ingrese el tipo de rutina que practica (bajar peso, aumentar musculo, resistencia): ");
                    String tipoRutina = scanner.nextLine();

                    System.out.println("ingrese el nombre de la rutina: ");
                    String nombreRutina = scanner.nextLine();

                    Rutina rutina = new Rutina(tipoRutina, nombreRutina);
                    Miembro miembro = new Miembro(nombre, membresia, rutina);

                    gimnasio.agregarMiembro(miembro);

                    System.out.println("miembro registrado existosamente \n");
                    break;


                case 2:
                    System.out.println("ingrese el nombre del entrenador: ");
                    String nombreEn = scanner.nextLine();
                    
                    System.out.println("ingrese la especialidad del entrenador: ");
                    String especialidad = scanner.nextLine();

                    Entrenador entrenador = new Entrenador(nombreEn, especialidad, null);

                    System.out.println("que miembros desea agregar al entrenador? ");

                    ArrayList<Miembro> lista = controlador.verMiembros();
                    if (lista.isEmpty()) {
                        System.out.println("no hay miembros inscritos");
                    } else {
                        for (Miembro m : lista) {
                            System.out.println(m);
                        }
                    }
                    
                    String miembroA = scanner.nextLine();
                    if (miembroA.equals(miembro.getNombre())) {
                        miembroA.asignarMiembro();
                    }
                    

                    break;
                case 3:
                    ArrayList<Miembro> lista2 = controlador.verMiembros();
                    if (lista2.isEmpty()) {
                        System.out.println("no hay miembros inscritos");
                    } else {
                        for (Miembro m : lista2) {
                            System.out.println(m);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada");
                    // Acción para la opción 4
                    break;
                case 5:
                    System.out.println("ddd");
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);
    }
}
