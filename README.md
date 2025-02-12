# Orçamento Serviço Mecânico

## Descrição

Este projeto é um sistema de gerenciamento de orçamentos para serviços mecânicos. Ele permite cadastrar clientes, veículos, serviços e criar orçamentos detalhados para os clientes.

## Funcionalidades

- **Cadastrar Cliente e Veículo**: Permite cadastrar um cliente junto com as informações do seu veículo.
- **Cadastrar Serviço**: Permite cadastrar serviços oferecidos pela oficina mecânica.
- **Criar Orçamento**: Permite criar um orçamento para um cliente selecionando os serviços desejados.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src`: Contém os arquivos fonte do projeto.
  - `App.java`: Classe principal que contém o menu e a lógica de interação com o usuário.
  - `Cliente.java`: Classe que representa um cliente.
  - `Veiculo.java`: Classe que representa um veículo.
  - `Servico.java`: Classe que representa um serviço.
  - `Orcamento.java`: Classe que representa um orçamento.
  - `GestorClientes.java`: Classe responsável pelo gerenciamento de clientes.
  - `GestorServicos.java`: Classe responsável pelo gerenciamento de serviços.
  - `GestorOrcamentos.java`: Classe responsável pelo gerenciamento de orçamentos.

## Temas Abordados

- **Encapsulamento**: Uso de modificadores de acesso para proteger os dados das classes.
- **Métodos e Variáveis Estáticas**: Uso de métodos e variáveis estáticas para funcionalidades compartilhadas.
- **Sobrecarga de Construtores e Métodos**: Implementação de múltiplos construtores e métodos com o mesmo nome, mas diferentes parâmetros.
- **Tratamento de Exceções**: Uso de blocos try-catch para tratar possíveis exceções.
- **Relacionamento entre Classes**: Implementação de agregação simples e composição entre as classes.

## Como Executar

1. Clone o repositório para sua máquina local.
2. Navegue até o diretório do projeto.
3. Compile os arquivos Java:
   ```sh
   javac src/*.java
   ```
4. Execute a aplicação:
   ```sh
   java src/App
   ```

## Exemplo de Uso

1. **Cadastrar Cliente e Veículo**:
   - Nome do Cliente: João
   - Telefone: 123456789
   - Placa do Veículo: ABC-1234
   - Marca do Veículo: Toyota
   - Modelo do Veículo: Corolla
   - Ano do Veículo: 2020

2. **Cadastrar Serviço**:
   - Nome do Serviço: Troca de Óleo
   - Preço do Serviço: 150.00

3. **Criar Orçamento**:
   - Escolha o cliente pelo número: 1
   - Escolha o serviço pelo número: 1
   - Orçamento criado com sucesso!

## Contribuição

Sinta-se à vontade para contribuir com o projeto. Para isso, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma nova branch:
   ```sh
   git checkout -b minha-feature
   ```
3. Faça as alterações desejadas e commit:
   ```sh
   git commit -m 'Minha nova feature'
   ```
4. Envie para o repositório remoto:
   ```sh
   git push origin minha-feature
   ```
5. Abra um Pull Request.
