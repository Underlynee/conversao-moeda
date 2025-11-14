☕ Conversor de Moedas (Challenge Alura ONE)
Status: Concluído ✔️

Este projeto é o primeiro Challenge do programa Alura ONE (Oracle Next Education), focado em Lógica de Programação e Java. O objetivo foi construir um aplicativo de console capaz de converter valores monetários entre diferentes moedas, consumindo uma API de taxas de câmbio em tempo real.

🚀 Funcionalidades
Menu Interativo: Um menu de console que se repete, permitindo ao usuário realizar múltiplas operações.

Consumo de API: O sistema se conecta à API ExchangeRate-API para buscar as taxas de câmbio mais recentes.

6 Conversões Diferentes: O menu oferece 6 pares de conversão pré-definidos:

Dólar (USD) =>> Peso Argentino (ARS)

Peso Argentino (ARS) =>> Dólar (USD)

Dólar (USD) =>> Real Brasileiro (BRL)

Real Brasileiro (BRL) =>> Dólar (USD)

Dólar (USD) =>> Peso Colombiano (COP)

Peso Colombiano (COP) =>> Dólar (USD)

Cálculo de Conversão: O usuário informa um valor e o programa calcula e exibe o valor convertido.

Loop de Conversão (Opcional): Permite ao usuário realizar várias conversões do mesmo par sem precisar voltar ao menu principal.

🛠️ Tecnologias Utilizadas
Java (JDK 17+)

IntelliJ IDEA (Ambiente de Desenvolvimento)

ExchangeRate-API (API para taxas de câmbio)

HttpURLConnection (Classe Java para fazer a requisição HTTP)

GSON (by Google) (Biblioteca para "parsear" o JSON da resposta da API)

⚙️ Como Executar
Pré-requisitos:

Java JDK 17 ou superior.

IntelliJ IDEA ou outra IDE de sua preferência.

1. Obtenha sua Chave da API:

Este projeto requer uma chave de API da ExchangeRate-API.

No código (provavelmente na classe ConsultaApiTaxas ou similar), você deve substituir o placeholder "SUA_API_KEY" pela sua chave pessoal.

Java

String url_str = "https://v6.exchangerate-api.com/v6/SUA_API_KEY/pair/BRL/USD";
2. Adicione a Biblioteca GSON:

Este projeto depende do GSON para funcionar.

Baixe o arquivo .jar do GSON (ex: gson-2.10.1.jar).

No IntelliJ, adicione-o como uma dependência do projeto:

File > Project Structure...

Modules > Dependencies

Clique no + > JARs or directories...

Selecione o arquivo .jar que você baixou.

3. Execute:

Abra a classe principal que contém o método main (ex: Main.java).

Clique em "Run".

🧠 O que foi Aprendido
Este projeto foi uma imersão prática em conceitos fundamentais do Java, especialmente na comunicação com a web:

Requisições HTTP: Como fazer uma "chamada" para um servidor web usando HttpURLConnection e pegar a resposta.

Leitura de Dados (I/O): O fluxo complexo de "tradução" dos dados da web:

InputStream (O "cano" de bytes brutos)

InputStreamReader (O "tradutor" de bytes para caracteres)

Parse de JSON: O que é JSON e como usar a biblioteca GSON (JsonParser, JsonElement, JsonObject) para navegar e extrair os dados que precisamos (como o conversion_rate).

Estruturas de Controle:

O uso do do-while para criar um menu que se repete.

O uso do switch-case para "rotear" as opções do usuário.

A importância crítica do break; para evitar o "fall-through".

Tratamento de Input (Scanner):

A diferença fundamental entre next() e nextLine() e como lidar com o bug do "Enter Fantasma" 👻.

Comparação de Strings: A diferença vital entre usar == (que compara a memória) e .equals() (que compara o conteúdo) para Strings.

👨‍💻 Autor
Feito por Rennan Tavares (coloque seu nome aqui!) como parte do Challenge Alura ONE.