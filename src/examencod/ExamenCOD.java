
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux = 11;
        if (MetodoRefactorizado(aux)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int Contador = 2; Contador < 1000; Contador++) {
            if (MetodoRefactorizado(Contador)) {
                System.out.print(Contador + " ");
            }
        }
    }

    public static boolean MetodoRefactorizado(int varRec) {
        int var = 2;
        boolean aux = true;
        while ((aux) && (var != varRec)) {
            if (varRec % var == 0) {
                aux = false;
            }
            var++;
        }
        return aux;
    }

}
