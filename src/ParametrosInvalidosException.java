public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
