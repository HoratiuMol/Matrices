public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {



        String[][] nombres={{"pepe","Pepa"},{"josefa","paco"},{"lucas","pancha"},};

        System.out.println("Iterando con foreach: \n");

        for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.println(nombre + "\t");
            }
            System.out.println();
        }
    }
}
