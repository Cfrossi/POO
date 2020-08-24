public class Livros {
    private String titulo;
    private String autor;
    private int ano;
    private String categoria;
    private int NumEstante;
    private int NumPratileira;
    private boolean emprestimo;

    public Livros(String novoTitulo,String novoAutor,int novoAno,String novaCategoria,int novoNumEstante,int novoNumPratileira,boolean novoEmprestimo){
        titulo = novoTitulo;
        autor = novoAutor;
        ano = novoAno;
        categoria = novaCategoria;
        NumEstante = novoNumEstante;
        NumPratileira = novoNumPratileira;
        emprestimo = novoEmprestimo;
        
    }

    //titulo
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }

    //Autor
    public String getAutor(){
        return autor;
    }
    public void setAutor(String novoAutor){
        autor = novoAutor;
    }

    //Ano
    public int getAno(){
        return ano;
    }
    public void setAno(int novoAno){
        ano = novoAno;
    }

    //Categoria
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String novaCategoria){
        categoria = novaCategoria;
    }

    //Numero Estante
    
    public int getNumEstante(){
        return NumEstante;
    }    
    public void setNumEstante(int novoNumEstante){
        NumEstante = novoNumEstante;
    }
    
    // Numero Pratileira
        
    public int getNumPratileira(){
        return NumPratileira;
    }
    public void setNumPratileira(int novoNumPratileira){
        NumPratileira = novoNumPratileira;
    }
    
    // Emprestado

    public boolean isEmprestimo(){
        return emprestimo;
    }
    public void setEmprestimo(boolean novoEmprestimo){
        emprestimo = novoEmprestimo;
    }

    void exibirInfo(){
        System.out.println("Título: "+ titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano: "+ano);
        System.out.println("Categoria: "+categoria);
        System.out.println("Número Estante: "+NumEstante);
        System.out.println("Número Prátileira: "+NumPratileira);
        System.out.println("Está Emprestado: "+ emprestimo);
    }

        


}