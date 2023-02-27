# TesteSafeWay

### Mudanças:
- A arquitetura de pastas foram alteradas para poder visualizar e entender melhor as funções de cada classe
- Nomes de variáveis que não seguiam padrão clean code
- Foi adicionado uma exception para quando a senha ou usuário especificado forem incorretos
- Foi adicionado uma classe para simular um banco de dados, que antes essas informações estavam na classe main, o que não torna o código limpo e claro
### Erros corrigidos:
- Além do administrador e a própria empresa, todos os outro usuários poderiam ver
informações da empresa (além do nome)
- Ao finalizar uma compra o cliente não recebia um resumo da mesma
- A classe Produto não tinha nenhum controle sobre qual empresa pode vendê-lo.
