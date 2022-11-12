# exercicio-de-fixacao
Exercício de fixação usando a linguagem Java.


INSTRUÇÕES:
Para conclusão desse exercício, você deve:
Criar um repositório privado no seu usuário do GitHub que tenha o usuário lmarques7 como usuário colaborador (editor)
Submeter no google classroom sua atividade contendo o link apontando para o repositório privado criado por você.
A avaliação da sua solução levará em consideração o histórico de commits parciais de como você criou a sua solução. Lembre-se de fazer commit da estrutura básica do projeto Java, independente da IDE que você venha a utilizar.

Classes e relacionamentos

Com base no diagrama UML abaixo, implemente as 4 classes em Java.

![diagrama-uml](https://user-images.githubusercontent.com/105317826/201497575-05d45b8f-4808-47e6-a2ba-c49fbe833b71.jpeg)

Produto
implemente os métodos get/set para cada atributo
Cliente
implemente os métodos get/set para cada atributo
método calcularIdade(): retorna a idade do cliente com base no atributo data Nascimento
ItemVenda: 
implemente os métodos get/set para cada atributo
método calcularTotal(): deve multiplicar o preço do produto do item de venda pela sua quantidade
Venda: 
implemente os métodos get/set para cada atributo
método adicionarItem(ItemVenda item): adiciona um item de venda ao objeto venda 
método calcularTotal(): efetua a soma de todos os itens de venda adicionados ao objeto venda
metodo listarItensVenda(): imprima os itens de venda conforme exemplo a seguir:
OBS: Siga as tabulações e alinhamentos conforme exemplo. Observe que os valores numéricos estão alinhados à direita, enquanto os textuais estão alinhados à esquerda. Use o método System.out.printf(...) para atingir esse resultado de forma rápida e organizada. Vide https://bit.ly/2L6oIzV ou https://bit.ly/37GEvxb. Vídeo com exemplos de printf: https://bit.ly/39OKr9R.

Tabela 1. Exemplo de impressão de uma Venda

Data da Venda: 23/12/2020
Cliente: José Maria Marques | CPF: 123456 | idade: 26
Atendente: Maria Dolores Sampaio

Nome do produto | Preço      | Quantidade | Total
-----------------------------------------------------
Produto 01      |   R$ 10.00 |         10 | R$ 100.00
Produto 02      |   R$  5.00 |          5 | R$  25.00
Produto 03      |   R$ 20.00 |         10 | R$ 200.00
Produto 04      |   R$ 15.00 |          2 | R$  30.00
-----------------------------------------------------
Total da Venda: 			               R$ 355.00 

Classe contendo método main: 
Escreva uma classe TesteVendaMain que vai realizar as seguintes operações:
Instanciar 4 objetos do tipo Produto contendo os dados apresentados na Tabela 1
Instanciar 4 objetos do tipo ItemVenda contendo os dados apresentados na Tabela 1 e associando-os diretamente aos objetos do tipo Produto criados no item anterior através da invocação de métodos do tipo set
Instanciar 1 objeto do tipo Cliente contendo os dados apresentados na Tabela 1
Instanciar 1 objeto do tipo Venda contendo os dados apresentados na Tabela 1 associando-o diretamente ao objetos do tipo Cliente criado no item anterior através da invocação de método do tipo set

Uma vez instanciados os objetos do Item A, execute as operações na seguinte ordem:
Adicione cada um dos objetos ItemVenda no objeto Venda chamando o método "adicionarItemVenda"
Chame o método listarItensVenda() do objeto Venda instanciado para realizar a impressão de informações conforme apresentado na Tabela 1.
