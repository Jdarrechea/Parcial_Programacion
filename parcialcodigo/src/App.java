import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 3, 0);

        Libro libro2 = new Libro();
        System.out.print("Ingrese el título del libro 2: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Ingrese el autor del libro 2: ");
        libro2.setAutor(sc.nextLine());
        System.out.print("Ingrese el número de ejemplares del libro 2: ");
        libro2.setNumEjemplares(sc.nextInt());
        libro2.setNumEjemplaresPrestados(0);

        System.out.println("\nProbando préstamo y devolución para libro1:");
        if (libro1.prestamo()) {
            System.out.println("Préstamo realizado de: " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares disponibles para prestar de: " + libro1.getTitulo());
        }
        if (libro1.devolucion()) {
            System.out.println("Devolución realizada de: " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares prestados para devolver de: " + libro1.getTitulo());
        }

        System.out.println("\nProbando préstamo y devolución para libro2:");
        if (libro2.prestamo()) {
            System.out.println("Préstamo realizado de: " + libro2.getTitulo());
        } else {
            System.out.println("No hay ejemplares disponibles para prestar de: " + libro2.getTitulo());
        }
        if (libro2.devolucion()) {
            System.out.println("Devolución realizada de: " + libro2.getTitulo());
        } else {
            System.out.println("No hay ejemplares prestados para devolver de: " + libro2.getTitulo());
        }

        System.out.println("\nInformación de los libros:");
        System.out.println(libro1);
        System.out.println(libro2);

        sc.close();
    }
}