# Projeto Final: Consulta CEP - API ViaCEP 📬

Este é o projeto final do curso [Java: consumindo API, gravando arquivos e lidando com erros](https://cursos.alura.com.br/course/java-consumindo-api-gravando-arquivos-lidando-erros/) da Alura.  
O sistema permite consultar endereços a partir de CEPs utilizando a API [ViaCEP](https://viacep.com.br), gravar os resultados em arquivos e tratar possíveis erros.

---

## 🛠 Funcionalidades
- Consulta de endereços a partir de CEP.
- Validação e normalização de CEPs digitados.
- Gravação das consultas em arquivos locais.
- Tratamento de erros com `try-catch`, incluindo CEPs inválidos ou falhas na requisição.
- Exibição das informações de forma clara e organizada.

---

## 💻 Tecnologias Utilizadas
- Java 11+
- API ViaCEP
- Manipulação de JSON (Gson)
- Leitura e gravação de arquivos
- Tratamento de exceções (`try-catch`)
- Expressões regulares (Regex) para validação de CEP

---

## 📁 Estrutura do Projeto
O projeto está organizado em pacotes que separam responsabilidades:

```
src/
 ├── Models/          # Representações de dados (ex.: Endereco)
 ├── Services/        # Requisição HTTP e gravação de arquivos
 ├── Utils/           # Classes utilitárias (ex.: ValidadorCep)
 └── Main.java        # Classe principal (execução do programa)
```

---

## 👨‍💻 Sobre
Este projeto é parte do meu aprendizado em Java, focando no consumo de APIs externas, manipulação de dados e tratamento de erros.

---
📚 Curso da Alura: *Java: consumindo API, gravando arquivos e lidando com erros*
