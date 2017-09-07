package triangulo;

/**
 *
 * @author LARISSA
 */

public class Triangulo {

    private int a, b, c;
    
    public Triangulo (int num1, int num2, int num3){
        a = num1;
        b = num2;
        c = num3;
    }
    
    public String verifica (){
        
        if ((a == 0) || (b == 0) || (c == 0))
            return "Invalido, nao pode ter valor igual a zero";
        else if ((a < 0) || (b < 0) || (c < 0))
            return "Invalido, nao pode existir lado negativo";
        else if (((a + b) < c) || ((a + c) < b) ||((c + b) < a))
            return "Invalido, a soma de 2 lados eh menor que o terceiro";
        else if (((a + b) == c) || ((a + c) == b) ||((c + b) == a))
            return "Invalido, a soma de 2 lados eh igual ao terceiro";
        else {
            if ((a == b)  && (a == c))
                return "Triangulo equilatero";
            else if ((a == b) || (a == c) || (c == b))
                return "Triangulo isoceles";
            else if ((a != b) && (a != c) && (b != c))
                return "Triangulo escaleno";
            
        }
        return ".";
    }
    
    public static void main(String[] args) {
        Triangulo valor = new Triangulo (2, 2, 3);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo isoceles"))
            System.out.println("Caso de teste 1 falhou!");
        
        valor.setA(3);
        valor.setB(2);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo isoceles"))
            System.out.println("Caso de teste 2 falhou!");
        
        valor.setA(2);
        valor.setB(3);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo isoceles"))
            System.out.println("Caso de teste 3 falhou!");
        
        valor.setA(2);
        valor.setB(2);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo equilatero"))
            System.out.println("Caso de teste 4 falhou!");
        
        valor.setA(2);
        valor.setB(3);
        valor.setC(4);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo escaleno"))
            System.out.println("Caso de teste 5 falhou!");
        
        valor.setA(2);
        valor.setB(4);
        valor.setC(3);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo escaleno"))
            System.out.println("Caso de teste 6 falhou!");
        
        valor.setA(3);
        valor.setB(4);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo escaleno"))
            System.out.println("Caso de teste 7 falhou!");
        
        valor.setA(3);
        valor.setB(2);
        valor.setC(4);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo escaleno"))
            System.out.println("Caso de teste 8 falhou!");
        
        valor.setA(4);
        valor.setB(3);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo escaleno"))
            System.out.println("Caso de teste 9 falhou!");
        
        valor.setA(4);
        valor.setB(2);
        valor.setC(3);
        
        if (!valor.verifica().equalsIgnoreCase("Triangulo escaleno"))
            System.out.println("Caso de teste 10 falhou!");
        
        valor.setA(2);
        valor.setB(1);
        valor.setC(1);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh igual ao terceiro"))
            System.out.println("Caso de teste 11 falhou!");
        
        valor.setA(1);
        valor.setB(2);
        valor.setC(1);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh igual ao terceiro"))
            System.out.println("Caso de teste 12 falhou!");
        
        valor.setA(1);
        valor.setB(1);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh igual ao terceiro"))
            System.out.println("Caso de teste 13 falhou!");
        
        valor.setA(0);
        valor.setB(1);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, nao pode ter valor igual a zero"))
            System.out.println("Caso de teste 14 falhou!");
        
        valor.setA(1);
        valor.setB(0);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, nao pode ter valor igual a zero"))
            System.out.println("Caso de teste 15 falhou!");
        
        valor.setA(1);
        valor.setB(2);
        valor.setC(0);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, nao pode ter valor igual a zero"))
            System.out.println("Caso de teste 16 falhou!");
        
        valor.setA(0);
        valor.setB(0);
        valor.setC(0);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, nao pode ter valor igual a zero"))
            System.out.println("Caso de teste 17 falhou!");
        
        valor.setA(2);
        valor.setB(3);
        valor.setC(6);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh menor que o terceiro"))
            System.out.println("Caso de teste 18 falhou!");
        
        valor.setA(2);
        valor.setB(6);
        valor.setC(3);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh menor que o terceiro"))
            System.out.println("Caso de teste 19 falhou!");
        
        valor.setA(3);
        valor.setB(6);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh menor que o terceiro"))
            System.out.println("Caso de teste 20 falhou!");
        
        valor.setA(3);
        valor.setB(2);
        valor.setC(6);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh menor que o terceiro"))
            System.out.println("Caso de teste 21 falhou!");
        
        valor.setA(6);
        valor.setB(3);
        valor.setC(2);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh menor que o terceiro"))
            System.out.println("Caso de teste 22 falhou!");
        
        valor.setA(6);
        valor.setB(2);
        valor.setC(3);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, a soma de 2 lados eh menor que o terceiro"))
            System.out.println("Caso de teste 23 falhou!");
        
        valor.setA(-1);
        valor.setB(2);
        valor.setC(3);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, nao pode existir lado negativo"))
            System.out.println("Caso de teste 24 falhou!");
        
        valor.setA(1);
        valor.setB(-2);
        valor.setC(3);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, nao pode existir lado negativo"))
            System.out.println("Caso de teste 25 falhou!");
        
        valor.setA(1);
        valor.setB(2);
        valor.setC(-3);
        
        if (!valor.verifica().equalsIgnoreCase("Invalido, nao pode existir lado negativo"))
            System.out.println("Caso de teste 26 falhou!");        
        
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

}
