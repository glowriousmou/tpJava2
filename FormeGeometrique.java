public class FormeGeometrique {
    public static  void main(String arg[]) {
        int longueur =2;
        int largeur= 4;
        Rectangle rectangle = new Rectangle();
        int perimetre= rectangle.perimetreRectangle(longueur, largeur);
        System.out.println("le perimetre est: "+ perimetre);

    }
}
