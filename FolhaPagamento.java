import java.util.Scanner;

public class FolhaPagamento{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        double aumento;

        Empregado caio;
        

        caio = new Empregado();
        

        caio.setNome("Caio");
        caio.setCargo("Analista");
        caio.setSalario(1000.0);


        caio.exibirInfo();

        System.out.println("Informe qual será a % de aumento de Salário: ");
        aumento = teclado.nextDouble();
        caio.aumentarSalario(aumento);

        caio.exibirInfo();

    }
}