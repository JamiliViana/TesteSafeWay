package exceptions;

public class PasswordOrUsernameWrongExceptions extends RuntimeException{
    public String menssagem = "Senha ou usuario incorretos";

    public PasswordOrUsernameWrongExceptions() {
    }

    @Override
    public String toString() {
        return menssagem;
    }
}
