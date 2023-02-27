package exceptions;

public class PasswordOrUsernameWorngExceptions extends RuntimeException{
    public String menssagem = "Senha ou usuario incorretos";

    public PasswordOrUsernameWorngExceptions() {
    }

    @Override
    public String toString() {
        return menssagem;
    }
}
