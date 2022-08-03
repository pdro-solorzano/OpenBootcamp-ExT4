public class Main {
    public static void main(String[] args) {
        int numeroIf = -2;
        int numeroWhile = -1;
        String estacion = "INVIERNO";

        // Exercise if
        if (numeroIf > 0) {
            System.out.println("POSITIVO");
        } else if (numeroIf < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("CERO");
        }

        // Exercise While
        while (numeroWhile < 3) {
            numeroWhile ++;
            System.out.println("NUMERO WHILE: " + numeroWhile);
        }

        // Exercise do while
        do {
            numeroWhile ++;
            System.out.println("NUMERO DO-WHILE: " + numeroWhile);
        } while (numeroWhile == 100);

        // Exercise for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("NUMERO FOR: " + numeroFor);
        }

        // Exercise switch
        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("ES PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("ES VERANO");
                break;
            case "OTONIO":
                System.out.println("ES OTONIO");
                break;
            case "INVIERNO":
                System.out.println("ES INVIERNO");
                break;
            default:
                System.out.println("ESO NO ES UNA ESTACION");
                break;
        }
    }
}