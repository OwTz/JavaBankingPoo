public class App {
    public static void main(String[] args) throws Exception {
        Conta novaconta = new Conta("sergio");

        novaconta.deposito(30);
        novaconta.fecharConta();
        novaconta.statusConta();
    }
}
