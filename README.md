

<div align="center">

<img width="500" height="500" alt="Badge-Conversor" src="https://github.com/user-attachments/assets/6527b0bb-eee7-465a-810c-b92452a1b53a" />


<div align="center">

<img src="assets/badge-conversor.png" alt="Badge do Challenge Conversor de Moedas - Alura ONE" width="200"/>

<h1 align="center">☕ Conversor de Moedas - Challenge Alura ONE</h1>

<p align="center"> Projeto #1 do programa Alura ONE (Oracle Next Education), focado em Lógica de Programação e consumo de APIs em Java. </p> </div>

Status: Concluído ✔️

Este projeto é um aplicativo de console construído em Java que permite ao usuário converter valores monetários entre diferentes moedas. O programa consome a ExchangeRate-API para buscar as taxas de câmbio em tempo real, garantindo que os valores sejam sempre precisos.

🚀 Funcionalidades
Menu Interativo: Um menu de console que se repete (do-while), permitindo ao usuário realizar quantas conversões desejar sem reiniciar o programa.

Consumo de API Real: Conecta-se à ExchangeRate-API para buscar taxas de câmbio ao vivo.

6 Pares de Conversão: O menu oferece 6 opções de conversão pré-definidas:

Dólar (USD) =>> Peso Argentino (ARS)

Peso Argentino (ARS) =>> Dólar (USD)

Dólar (USD) =>> Real Brasileiro (BRL)

Real Brasileiro (BRL) =>> Dólar (USD)

Dólar (USD) =>> Peso Colombiano (COP)

Peso Colombiano (COP) =>> Dólar (USD)

Cálculo de Conversão: Solicita ao usuário um valor e exibe o resultado da conversão de forma formatada.

Loop de Conversão (Bônus): Permite ao usuário realizar várias conversões do mesmo par sem precisar voltar ao menu principal.

🛠️ Tecnologias Utilizadas
Java (JDK 17+)

IntelliJ IDEA (Ambiente de Desenvolvimento)

ExchangeRate-API: API de terceiros para taxas de câmbio.

Java HttpURLConnection: Para criar, conectar e fazer a requisição HTTP.

GSON (by Google): Biblioteca para "parsear" (traduzir) a resposta JSON da API para objetos Java.

⚙️ Como Executar o Projeto
Pré-requisitos:

Java JDK 17 (ou superior) instalado.

IntelliJ IDEA (ou sua IDE Java preferida).

Passo 1: Obtenha sua Chave da API

Este projeto requer uma chave de API gratuita da ExchangeRate-API.

Após criar sua conta, copie sua chave.

No código (provavelmente na classe ConsultaApiTaxas.java ou Conversao.java), encontre a linha da URL e substitua "SUA_API_KEY" pela sua chave:

Java

// Em ConsultaApiTaxas.java (ou nome similar)
String url_str = "https://v6.exchangerate-api.com/v6/SUA_API_KEY/pair/" 
                 + moedaOrigem + "/" + moedaDestino;
Passo 2: Adicione a Biblioteca GSON

Este projeto depende da biblioteca GSON para ler o JSON.

Baixe o arquivo .jar do GSON (ex: gson-2.10.1.jar).

No IntelliJ, adicione-o como uma dependência:

Vá em File > Project Structure... (ou Ctrl+Alt+Shift+S).

No menu da esquerda, selecione Modules.

Na aba Dependencies, clique no + (sinal de mais).

Selecione JARs or directories....

Navegue e selecione o arquivo gson-....jar que você baixou.

Clique em OK.

Passo 3: Execute

Encontre a classe principal que contém o método main(String[] args).

Clique com o botão direito e selecione Run.

🧠 Principais Aprendizados
Este projeto foi uma imersão prática em conceitos fundamentais do Java, especialmente na comunicação com a web:

Requisições HTTP: Como usar HttpURLConnection para "conversar" com um servidor web, enviar um pedido e receber uma resposta.

Leitura de Dados (I/O): O fluxo complexo de "tradução" dos dados da web:

InputStream (O "cano" de bytes brutos)

InputStreamReader (O "tradutor" de bytes para caracteres legíveis)

Parse de JSON: O que é o formato JSON e como usar a biblioteca GSON (JsonParser, JsonElement, JsonObject) para navegar e extrair os dados que precisamos (como o conversion_rate).

Estruturas de Controle:

O uso do do-while para criar um menu que se repete pelo menos uma vez.

O uso do switch-case para "rotear" as opções do usuário.

A importância crítica do break; para evitar o bug de "fall-through".

Tratamento de Input (Scanner):

A diferença fundamental entre next() e nextLine() e como lidar com o bug do "Enter Fantasma" 👻.

Comparação de Strings: A diferença vital entre usar == (que compara a referência de memória) e .equals() (que compara o conteúdo do texto).

👨‍💻 Autor
Feito por Rennan Tavares como parte do Challenge Alura ONE.
