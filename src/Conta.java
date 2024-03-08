import javax.swing.JOptionPane;

public class Conta {
    private String nome;
    private float saldo;
    protected boolean estado;
    protected String tipoC;

    /* Construtor da classe */
    public Conta(String nome) {
        this.saldo = 0f;

        this.tipoC = JOptionPane.showInputDialog("digite o tipe da conta");

        switch (this.tipoC) {
            case "cc":
                deposito(50);
                System.out.println(" a conta foi adicionada como CC");
                break;

            case "cp":
                deposito(150);
                break;
            default:
                System.out.println(" a conta não vai receber beneficios :(");
                break;
        }

        this.nome = nome;
        this.estado = true;

    }

    /* métodos getter */
    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    // * métodos setters */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /* métodos acessores */
    public void abrirConta() {
        if (this.estado == true) {
            System.out.println("a conta não pode ser aberta");
        } else {
            this.estado = true;
            System.out.println("a conta foi aberta");
        }
    }

    public void fecharConta() {

        if (this.estado == false) {
            System.out.println("a conta não pode ser desativada");
        } else {
            this.estado = false;
            System.out.println("a conta foi desativada");
        }
    }

    // * métodos acessores para saque e deposito */
    public void saque(float valor) {
        if (this.estado == false) {
            JOptionPane.showMessageDialog(null, "a conta não pode sacar dinheiro");
        } else {

            if (this.saldo <= valor) {
                System.out.println(" a operação de saque não pode ser completada");
            } else {
                this.saldo -= valor;
                System.out.println("o saldo foi atualizado com sucesso! ");
            }
        }

    }

    public void deposito(float valor) {
        this.saldo += valor;
    }

    public void statusConta() {
        System.out.println("os status da conta são: ");
        System.out.printf(" o nome da conta é: " + getNome());
        System.out.printf(" o o Saldo da conta é: " + getSaldo());
        System.out.printf(" o Status ativo da conta é: " + this.estado);
        System.out.printf(" o tipo da conta é: " + this.tipoC);
    }
}
