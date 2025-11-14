☕ Conversor de Moedas — Challenge Alura ONE

Status: ✔️ Concluído

Este projeto foi desenvolvido como o primeiro Challenge do programa Alura ONE (Oracle Next Education), focado em Lógica de Programação e Java.
O objetivo foi criar uma aplicação de console capaz de converter valores entre diferentes moedas, consumindo uma API de taxas de câmbio em tempo real.

🚀 Funcionalidades

Menu Interativo: Interface no console que se repete, permitindo várias operações.

Consumo de API: Integração com a ExchangeRate-API para obter taxas atualizadas.

6 Conversões Pré-definidas:

USD → ARS

ARS → USD

USD → BRL

BRL → USD

USD → COP

COP → USD

Cálculo Instantâneo: O usuário insere um valor e o sistema retorna o valor convertido.

Loop Opcional de Conversão: Permite repetir a mesma conversão sem voltar ao menu principal.

🛠️ Tecnologias Utilizadas

Java (JDK 17+)

IntelliJ IDEA

ExchangeRate-API

HttpURLConnection (Java nativo)

GSON (Google) para leitura e interpretação de JSON

⚙️ Como Executar
Pré-requisitos

Java JDK 17+

IntelliJ IDEA (ou outra IDE de sua preferência)

Uma chave válida da ExchangeRate-API

1. Adquira sua chave da API

No código, substitua o trecho:

String url_str = "https://v6.exchangerate-api.com/v6/SUA_API_KEY/pair/BRL/USD";


por:

String url_str = "https://v6.exchangerate-api.com/v6/SUA_CHAVE_AQUI/pair/BRL/USD";

2. Adicione a biblioteca GSON ao projeto

Baixe o arquivo .jar (ex.: gson-2.10.1.jar)

No IntelliJ, vá em:

File > Project Structure > Modules > Dependencies


Clique no + → JARs or directories...

Selecione o arquivo do GSON

3. Executando o projeto

Abra a classe principal (Main.java)

Clique em Run

Use o menu do console para selecionar a conversão desejada

🧠 O que foi Aprendido

Este projeto consolidou vários conceitos importantes do Java e de integração com APIs:

Requisições HTTP usando HttpURLConnection

Fluxo de leitura (I/O):

InputStream → bytes

InputStreamReader → caracteres

Parse de JSON com GSON: JsonParser, JsonObject, JsonElement

Estruturas de Controle:

do-while para loops de menu

switch-case para seleção de opções

Uso correto de break

Scanner e Entrada de Dados:

Diferença entre next() e nextLine()

Problema do “enter fantasma”

Comparação de Strings:

Por que usar .equals() ao invés de ==

👨‍💻 Autor

Rennan Tavares
