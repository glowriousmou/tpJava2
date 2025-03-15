import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FormeGeometrique {
    public static  void main(String arg[]) throws Exception {

        // Saisi d'un string
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Comment t'appelles-tu?  ");
        String nameUser = bufferedReader.readLine();
        System.out.println("Bienvenue "+ nameUser);

        // Saisi de tout type de valeur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de la longeur du rectangle ");
        int longueur = scanner.nextInt();
        System.out.println("Quelle est la valeur de la largeur du rectangle ");
        int largeur = scanner.nextInt();
        
        // Calcul du perimetre
        Rectangle rectangle = new Rectangle();
        int perimetre= rectangle.perimetreRectangle(longueur, largeur);
        System.out.println(
                "le perimètre d'un rectangle ayant une longeur de "
                        +longueur+
                        " et une largeur de "
                        +largeur+
                        " est "
                        + perimetre
        );

    }
}
