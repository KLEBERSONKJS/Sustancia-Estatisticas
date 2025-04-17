# Documentação do Projeto de Software

## Visão Geral do Projeto

Este documento descreve a **arquitetura**, **hierarquia de arquivos** e **propostas de melhorias** para o projeto **Sustância**, um software estatístico de visualização e manipulação de dados, baseado em um formulário pré-existente e/ou implementado. Ele serve como guia para desenvolvedores e colaboradores, fornecendo informações detalhadas sobre a estrutura do projeto e áreas de melhoria.

O frontend do projeto foi condicionado para o formato **JTE** (_Java Template Engine_), permitindo a geração dinâmica de páginas **HTML** com base em templates.  

Isso facilita a separação de lógica e apresentação, promovendo maior organização e reutilização de código. Enquanto o backend é desenvolvido em **Java**, utilizando o framework **_Spring Boot_** para facilitar a criação de aplicações web robustas e escaláveis.  

O banco de dados utilizado é o **H2**, um banco de dados em memória leve e fácil de usar, ideal para desenvolvimento e testes.  

O projeto também utiliza o **Maven** como ferramenta de gerenciamento de dependências e construção, facilitando a integração e o gerenciamento de bibliotecas externas.  

O projeto é estruturado em camadas, seguindo o padrão **MVC** (_Model-View-Controller_), o que promove uma separação clara entre a lógica de negócios, a apresentação e o controle de fluxo da aplicação.  

Essa abordagem facilita a manutenção e a escalabilidade do código, permitindo que diferentes equipes trabalhem em diferentes partes do projeto simultaneamente.

## Proposta da Aplicação

A **Sustância** inicialmente surgiu como um trabalho acadêmico, mas propensão evolutiva para um projeto mais robusto e complexo. Voltado para o público de **analistas** e **pesquisadores** do âmbito academico, especificamente da àrea de estudo da **Nutrição e afins**, com ênfase em **coletas de dados estatisticos** de pesquisas de campo e informações **sociais** e **socioeconômicas**, o objetivo principal é criar uma aplicação que permita a **coleta**, **análise** e **visualização** de dados de forma eficiente e intuitiva.  
Conta com um sistema de **formulários** que permite a coleta de dados de forma estruturada, facilitando a análise posterior.  
A aplicação também possui um sistema de **relatórios** que permite a geração de gráficos e tabelas a partir dos dados coletados, facilitando a visualização e interpretação dos resultados.  
Além dos citados, o projeto também possui um sistema de **autenticação** e **autorização**, garantindo que apenas usuários autorizados possam acessar e manipular os dados.
A aplicação é desenvolvida com foco na **usabilidade** e **acessibilidade**, garantindo que todos os usuários possam utilizá-la de forma eficiente e intuitiva.

### Notas
>
>O projeto é um trabalho acadêmico e não deve ser utilizado para fins comerciais ou de produção sem a devida revisão e validação.
>
>O projeto é um trabalho em andamento e pode conter erros ou falhas. O uso do projeto é por sua conta e risco.
>
>O projeto é desenvolvido por estudantes e não possui suporte técnico oficial. Qualquer dúvida ou problema deve ser reportado no repositório do projeto.  
>
>Está na versão de Protótipo de Media Fidelidade **v1.0.0 (PTY)**, e pode ser/será atualizado para versões futuras, com melhorias e correções de bugs.
