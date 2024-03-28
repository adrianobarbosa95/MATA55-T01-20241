public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(2, 1, 2);
        System.out.println("Triangulo -> "+triangulo.toString());
        System.out.println("É equilatero: "+triangulo.isEquilatero());
        System.out.println("É escaleno: " +triangulo.isEscaleno());
        System.out.println("É isoceles: " +triangulo.isIsoceles());
    }
}
