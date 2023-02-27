package application;

import model.*;
import service.LoginService;

import java.util.List;

import static bancoDeDados.BancoDeDadosSimulador.*;

public class Main {

    public static void main(String[] args) {
        iniciar(usuarios, clientes, empresas, produtos, carrinho, vendas);
    }

    public static void iniciar(List<Usuario> usuarios, List<Cliente> clientes, List<Empresa> empresas,
                               List<Produto> produtos, List<Produto> carrinho, List<Venda> vendas) {
        LoginService login = new LoginService();
        login.realizarLogin(usuarios, clientes, empresas, produtos, carrinho, vendas);
    }
}
