public class Empregado{

    private String nome;
    private String cargo;
    private double salario;
    




    String getNome(){
        return nome;
    }

    void setNome(String novoNome){
        nome = novoNome;
    }

    String novoCargo(){
        return cargo;
    }

    void setCargo(String novoCargo){
        cargo = novoCargo;
    }

    double getSalario(){
        return salario;
    }

    void setSalario(double novoSalario){
        salario = novoSalario;
    }

    void exibirInfo(){
        System.out.printf("Nome: %s / %s R$ %.2f\n", nome,cargo,salario);
    }

    
    public void aumentarSalario(double aumento){
        salario = ((salario * aumento) / 100) + salario;
    }


}