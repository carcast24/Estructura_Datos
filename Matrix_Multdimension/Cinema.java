public class Cinema {
    private boolean[][] sits;
    private int rows;
    private int columns;
    private int totalReservations;

    public Cinema(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.sits = new boolean[rows][columns];
        this.totalReservations = 0;
    }
    public void displayCinema() {
        System.out.println("     === SCREEN ===");

        // Imprimir encabezado de columnas
        System.out.print("     ");
        for (int j = 0; j < columns; j++) {
            System.out.print(j + "  ");
        }
        System.out.println();

        // Imprimir filas con asientos
        for (int i = 0; i < rows; i++) {
            System.out.print(i + "    ");
            for (int j = 0; j < columns; j++) {
                if (sits[i][j]) {
                    System.out.print("X  "); // ocupado
                } else {
                    System.out.print("O  "); // libre
                }
            }
            System.out.println();
        }
    }

}
