import java.util.Scanner;

public class Biblioteca{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int N,contador;
        N = 0;
        contador = 1;

        String titulo;
        String autor;
        int ano;
        String categoria;
        int NumEstante;
        int NumPratileira;
        boolean emprestimo;

        System.out.println("Bem vindo ao Sistema de Consulta de Livros");
        System.out.println("");
        System.out.println("Digite a quantidade de livros a ser exibida");
        N = Integer.parseInt(teclado.nextLine());
        System.out.println("");

        while(contador <= N) {

        System.out.print("Digite o nome do Título  : ");
        titulo = teclado.nextLine();

        System.out.print("Digite o nome do Autor  : ");
        autor = teclado.nextLine();

        System.out.print("Digite o nome do Ano  : ");
        ano = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite o nome do Categoria  : ");
        categoria = teclado.nextLine();

        System.out.print("Digite o nome do Número Estante  : ");
        NumEstante = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite o nome do Número Pratileira  : ");
        NumPratileira = Integer.parseInt(teclado.nextLine());

        System.out.print("Está Emprestado?  : ");
        emprestimo = Boolean.parseBoolean(teclado.nextLine());
        Livros l1;
        l1 = new Livros(titulo,autor,ano,categoria,NumEstante,NumPratileira,emprestimo);
        System.out.println("");
        l1.exibirInfo();
        System.out.println("");

        contador += 1;

        }





    }
}