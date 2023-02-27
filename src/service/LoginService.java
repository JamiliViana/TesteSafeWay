package service;

import exceptions.PasswordOrUsernameWorngExceptions;
import model.*;

import java.util.List;
import java.util.Scanner;

public class LoginService {

    public static void realizarLogin(List<Usuario> usuarios, List<Cliente> clientes, List<Empresa> empresas,
                              List<Produto> produtos, List<Produto> carrinho, List<Venda> vendas) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu usuário e senha:");
        System.out.print("Usuário: ");
        String username = sc.next();
        System.out.print("Senha: ");
        String senha = sc.next();

        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getSenha().equals(senha)) {
                ExecutarService executarService = new ExecutarService();
                executarService.executar(usuarios, clientes, empresas, produtos, carrinho, vendas, sc, usuario);
                return;
            }else throw new PasswordOrUsernameWorngExceptions();
        }

        realizarLogin(usuarios, clientes, empresas, produtos, carrinho, vendas);
    }
}
