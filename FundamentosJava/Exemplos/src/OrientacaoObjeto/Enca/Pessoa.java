package OrientacaoObjeto.Enca;

public class Pessoa {
    private String nome;
    private String email;
    private float salario;

    //Construtor
    public Pessoa (String nome, String email, float salario){
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }
    public Pessoa(String nome, float salario){
        this.nome = nome;
        this.email = "não informado";
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void aumentaSalario(float indice) {
        salario = salario + indice * salario / 100;
    }

    public void exibirDados() {
        System.out.println("Sistema Pessoa *****");
        System.out.println("Nome : " + nome + " Email " + email);
        System.out.println("Salario R$ " + salario);
    }
}
