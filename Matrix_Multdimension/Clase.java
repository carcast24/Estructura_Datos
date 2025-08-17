public class Clase{
    public static void main (String[] args){
     double[][] notas = new double[3][4];
        //estudiante 1
        notas[0][0] = 8.5; // Nota 1
        notas[0][1] = 7.0; // Nota 2
        notas[0][2] = 9.0; // Nota 3
        notas[0][3] = 6.5; // Nota 4

        //estudiante 2
        notas[1][0] = 7.5; // Nota 1
        notas[1][1] = 8.0; // Nota 2
        notas[1][2] = 6.0; // Nota 3
        notas[1][3] = 9.0; // Nota 4   

        //estudiante 3
        notas[2][0] = 8.0; // Nota 1
        notas[2][1] = 7.5; // Nota 2
        notas[2][2] = 8.5; // Nota 3        
        notas[2][3] = 9.5; // Nota 4

        // Imprimir las notas y promedio de cada estudiante
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            System.out.print("Notas del estudiante " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println("| Promedio: " + promedio);
        }
    }
}

    
