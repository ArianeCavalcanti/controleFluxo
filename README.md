## Controle de Fluxo - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo desenvolvendo o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros. Com estes dois números, o programa deverá calcular a quantidade de interações necessárias (usando um loop `for`) e imprimir no console (`System.out.print`) os números incrementados. 

### Exemplo

Se você inserir os números 12 e 30, o sistema realizará uma interação (loop `for`) com 18 ocorrências, imprimindo cada número na sequência. A saída será algo como:
e assim por diante.

### Regras do Sistema

- **Validação dos Parâmetros**: Se o primeiro parâmetro for maior que o segundo, o sistema deverá lançar uma exceção customizada chamada `ParametrosInvalidosException`. A mensagem da exceção será: `"O segundo parâmetro deve ser maior que o primeiro"`.
- **Estrutura do Projeto**:
  - Crie o projeto `DesafioControleFluxo`.
  - Dentro do projeto, crie a classe `Contador.java`, que conterá a lógica do programa.
  - Crie a classe `ParametrosInvalidosException`, que representará a exceção de negócio do sistema.

### Implementação do Código

Abaixo está um exemplo de estrutura para o código, com alguns trechos a serem completados onde há `??`:

```java
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
