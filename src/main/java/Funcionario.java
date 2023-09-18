public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salario;

    // Construtor
    public Funcionario(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    // Métodos de acesso para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Métodos de acesso para o sobrenome
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    // Métodos de acesso para o salário
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

    // Método para calcular o salário anual
    public float getSalarioAnual() {
        return this.salario * 12;
    }

    // Método para conceder aumento
    public void concederAumento(float valorAumento) {
        this.salario *= 1 + (valorAumento /100);
    }
}
