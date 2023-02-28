# TesteSafeWay

### Mudanças:
- O usuário admin ao logar, tinha apenas acesso como cliente, então não aparecia a opção de ver dados da empresa.
- A arquitetura de pastas foram alteradas para poder visualizar e entender melhor as funções de cada classe.
- Nomes de variáveis que não seguiam padrão clean code.
- Foi adicionado uma exception para quando a senha ou usuário especificado forem incorretos.
- Foi adicionado uma classe para simular um banco de dados, que antes essas informações estavam na classe main, o que não torna o código limpo e claro.
### Erros de regras de negócios corrigidos:
- Além do administrador e a própria empresa, todos os outro usuários poderiam ver
informações da empresa (além do nome).
- O saldo da empresa não era mostrado ja com o desconto da taxa, de nenhuma forma (agora é mostrado um valor sem taxa e outro com a taxa).
- E a empresa não via sua taxa de comissão ao listar as vendas.
