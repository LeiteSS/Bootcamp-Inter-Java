// Como rodar este programa no Terminal:
// javac HelloWorld.java
// java HelloWorld

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(""));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));
    }
}
