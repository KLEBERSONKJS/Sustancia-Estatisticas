# Documentação do Projeto de Software

## Visão Geral do Projeto

Este documento descreve a arquitetura, hierarquia de arquivos e propostas de melhorias para o projeto Sustancia-Estatisticas. Ele serve como guia para desenvolvedores e colaboradores, fornecendo informações detalhadas sobre a estrutura do projeto e áreas de melhoria.

O frontend do projeto foi condicionado para o formato **JTE** (Java Template Engine), permitindo a geração dinâmica de páginas HTML com base em templates. Isso facilita a separação de lógica e apresentação, promovendo maior organização e reutilização de código.

## Arquitetura e Hierarquia de Arquivos

Abaixo está a hierarquia de arquivos do projeto:

```shell
│   .gitattributes
│   .gitignore
│   mvnw
│   mvnw.cmd
│   pom.xml
│   Proposta-De-Melhorias.md
│
├───.mvn
│   └───wrapper
│           maven-wrapper.properties
│
├───.vscode
│       launch.json
│
├───data
│       sustancia.mv.db
│       sustancia.trace.db
│       sustancia2000.mv.db
│       sustancia2000.trace.db
│       sustanciaDb.mv.db
│       sustanciaDb.trace.db
│       sustanciaDb1000.mv.db
│       sustanciaDB1000.trace.db
│       sustanciaDB500.mv.db
│       sustanciaDB500.trace.db
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───ads
│   │   │           └───sustancia
│   │   │               ├── config
│   │   │               ├── controller
│   │   │               │   ├── coordenador
│   │   │               │   ├── entrevistador
│   │   │               │   └── relatorio
│   │   │               ├── dto
│   │   │               │   ├── request
│   │   │               │   └── response
│   │   │               ├── enums
│   │   │               ├── mapping
│   │   │               ├── model
│   │   │               ├── repository
│   │   │               ├── service
│   │   │               │   └── impl
│   │   │               └── util
│   │   ├───jte
│   │   │   │   coordenadores.jte
│   │   │   │   entrevistadores.jte
│   │   │   │   error.jte
│   │   │   │   formulario.jte
│   │   │   │   index.jte
│   │   │   │   login.jte
│   │   │   │   pag-inicial.jte
│   │   │   │   perfil.jte
│   │   │   │   relatorio.jte
│   │   │   │
│   │   │   └───layout
│   │   │           aside.jte
│   │   │           header.jte
│   │   │           main.jte
│   │   │
│   │   └───resources
│   │       │   application.properties
│   │       │   init.sql
│   │       │
│   │       ├───db
│   │       │   ├── sustancia.mv.db
│   │       │   ├── sustancia.trace.db
│   │       │   ├── sustancia2000.mv.db
│   │       │   ├── sustancia2000.trace.db
│   │       │   ├── sustanciaDb.mv.db
│   │       │   ├── sustanciaDb.trace.db
│   │       │   ├── sustanciaDb1000.mv.db
│   │       │   ├── sustanciaDB1000.trace.db
│   │       │   ├── sustanciaDB500.mv.db
│   │       │   └── sustanciaDB500.trace.db
│   │       │
│   │       ├───static
│   │       │   ├───assets
│   │       │   │   ├── icons
│   │       │   │   └── images
│   │       │   ├───css
│   │       │   └───js
│   │       └───templates
│   │           ├── layout
│   │           ├── coordenadores.jte
│   │           ├── entrevistadores.jte
│   │           ├── error.jte
│   │           ├── formulario.jte
│   │           ├── index.jte
│   │           ├── login.jte
│   │           ├── pag-inicial.jte
│   │           ├── perfil.jte
│   │           └── relatorio.jte
│   │
│   └───test
│       └───java
│           └───com
│               └───ads
│                   └───sustancia
│                           SustanciaApplicationTests.java
│
├───docs
│   ├── arquitetura.md
│   ├── propostas.md
│   └── diagramas/
│
└───target
    ├───classes
    │   │   application.properties
    │   │   init.sql
    │   │
    │   ├───com
    │   │   └───ads
    │   │       └───sustancia
    │   │           │   SustanciaApplication.class
    │   │           │
    │   │           ├───config
    │   │           │       SecurityConfig.class
    │   │           │
    │   │           ├───controller
    │   │           │       CoordenadorController.class
    │   │           │       EntrevistadorController.class
    │   │           │       FormularioController.class
    │   │           │       HomeController.class
    │   │           │       LoginController.class
    │   │           │       RelatorioController.class
    │   │           │
    │   │           ├───dto
    │   │           │   ├───request
    │   │           │   │       CoordenadorDTO.class
    │   │           │   │       EntrevistadorDTO.class
    │   │           │   │       FiltroDTO.class
    │   │           │   │       LoginDTO.class
    │   │           │   │       PessoaDTO.class
    │   │           │   │       UsuarioDTO.class
    │   │           │   │
    │   │           │   └───response
    │   │           │           DadosGraficoDTO.class
    │   │           │           ErrorResponse.class
    │   │           │
    │   │           ├───enums
    │   │           │       AuxilioEnum.class
    │   │           │       ConsumoOntemEnum.class
    │   │           │       DependentesEnum.class
    │   │           │       EmpregoEnum.class
    │   │           │       EscolaridadeEnum.class
    │   │           │       EstadoCivilEnum.class
    │   │           │       GeneroEnum.class
    │   │           │       RacaEnum.class
    │   │           │       RefeicaoDiaEnum.class
    │   │           │       ReligiaoEnum.class
    │   │           │       SimNaoNaoSabeEnum.class
    │   │           │       UserRole.class
    │   │           │       UsuarioStatusEnum.class
    │   │           │
    │   │           ├───mapping
    │   │           │       CoodenadorMapper.class
    │   │           │       CoodenadorMapperImpl.class
    │   │           │       EntrevistadorMapper.class
    │   │           │       EntrevistadorMapperImpl.class
    │   │           │       UsuarioMapper.class
    │   │           │       UsuarioMapperImpl.class
    │   │           │
    │   │           ├───model
    │   │           │       ConsumoAlimentar.class
    │   │           │       Coordenador.class
    │   │           │       Entrevistador.class
    │   │           │       InsegurancaAlimentar.class
    │   │           │       Papel.class
    │   │           │       Pessoa.class
    │   │           │       Resposta.class
    │   │           │       Usuario.class
    │   │           │
    │   │           ├───repository
    │   │           │       CoordenadorRepository.class
    │   │           │       EntrevistadorRepository.class
    │   │           │       PessoaRepository.class
    │   │           │       UsuarioRepository.class
    │   │           │
    │   │           └───service
    │   │               │   CoordenadorService.class
    │   │               │   EntrevistadorService.class
    │   │               │   PessoaService.class
    │   │               │   RelatorioService.class
    │   │               │   UsuarioService.class
    │   │               │
    │   │               └───impl
    │   │                       CoordenadorServiceImpl.class
    │   │                       CustomUserDetailService.class
    │   │                       EntrevistadorServiceImpl.class
    │   │                       PessoaServiceImpl.class
    │   │                       RelatorioServiceImpl.class
    │   │                       UsuarioServiceImpl.class
    │   │
    │   └───static
    │       ├───assets
    │       │   ├── icons
    │       │   └── images
    │       ├───css
    │       └───js
    │
    ├───generated-sources
    │   └───annotations
    │       └───com
    │           └───ads
    │               └───sustancia
    │                   └───mapping
    │                           CoodenadorMapperImpl.java
    │                           EntrevistadorMapperImpl.java
    │                           UsuarioMapperImpl.java
    │
    ├───generated-test-sources
    │   └───test-annotations
    └───test-classes
        └───com
            └───ads
                └───sustancia
                        SustanciaApplicationTests.class
```

### Descrição dos Diretórios

- **/.mvn**: Contém configurações específicas do Maven para o projeto.
- **/.vscode**: Configurações do editor Visual Studio Code.
- **/data**: Diretório destinado ao armazenamento de dados utilizados pelo projeto.
- **/src**: Contém o código-fonte principal do projeto.
- **/docs**: Diretório destinado à documentação do projeto, incluindo arquitetura, propostas e diagramas.
- **/target**: Diretório gerado pelo Maven para armazenar os artefatos compilados.

## Propostas de Melhorias

1. **Documentação do Código**: Adicionar comentários detalhados no código-fonte para facilitar a compreensão e manutenção.
2. **Testes Automatizados**: Implementar uma suíte de testes automatizados para garantir a qualidade do software.
3. **Padronização de Código**: Utilizar ferramentas como Checkstyle ou SonarQube para garantir a padronização do código.
4. **Melhoria na Estrutura de Diretórios**: Avaliar a necessidade de subdiretórios adicionais para organizar melhor os arquivos.
5. **Otimização de Templates JTE**: Revisar os templates para garantir eficiência e reutilização máxima.

## Área para Anotações

Ideias para implementação e aprimoramento da Aplicação Sustância:

- Simplificação de processos, melhorias de performance, etc.

- Avaliar a possibilidade de implementar um sistema de cache para melhorar a performance das consultas ao banco de dados.

- Considerar a utilização de um framework de frontend, como React ou Vue.js, para melhorar a experiência do usuário.

- Implementar um sistema de autenticação e autorização mais robusto, utilizando [JWT (JSON Web Tokens)](https://www.alura.com.br/artigos/o-que-e-json-web-tokens?utm_term=&utm_campaign=topo-aon-search-gg-dsa-artigos_conteudos&utm_source=google&utm_medium=cpc&campaign_id=11384329873_164068847699_703853174125&utm_id=11384329873_164068847699_703853174125&hsa_acc=7964138385&hsa_cam=topo-aon-search-gg-dsa-artigos_conteudos&hsa_grp=164068847699&hsa_ad=703853174125&hsa_src=g&hsa_tgt=aud-527303763294:dsa-2273097816642&hsa_kw=&hsa_mt=&hsa_net=google&hsa_ver=3&gad_source=1&gbraid=0AAAAADpqZIDv6iQBaZ3_aWQdgbD8FzD9p&gclid=Cj0KCQjwh_i_BhCzARIsANimeoGLfv0G82Wa9DnWdwFswps3iFF1ZEL665w_xR4tKUPZIW8GQ3Jf0gUaAmHAEALw_wcB) para segurança adicional.

- Utilização dos Conceitos de [KISS (Keep It Simple, Stupid)](https://www.aluralingua.com.br/artigos/voce-conhece-o-principio-kiss-em-programacao) e [DRY (Don't Repeat Yourself)](https://www.aluralingua.com.br/artigos/voce-conhece-o-principio-dry-em-programacao) para garantir um código mais limpo e fácil de manter.

- Avaliar a possibilidade de implementar um sistema de monitoramento e logging para facilitar a identificação de problemas em produção.

- Considerar a utilização de um banco de dados [NoSQL](https://aws.amazon.com/pt/dynamodb/?trk=dcded092-8595-4ef4-9958-26b7775a3f60&sc_channel=ps&ef_id=Cj0KCQjwh_i_BhCzARIsANimeoHmfpdt33ci7iiZ9KW-sP_fIVQazS-_twWxAqx2A6aZyJ-DlpV0WtgaAjoqEALw_wcB:G:s&s_kwcid=AL!4422!3!589951437554!e!!g!!base%20nosql!16393976608!133547558053&gbraid=0AAAAADjHtp9Sivf8MjD5dZiOF3jWy6Xh5&gclid=Cj0KCQjwh_i_BhCzARIsANimeoHmfpdt33ci7iiZ9KW-sP_fIVQazS-_twWxAqx2A6aZyJ-DlpV0WtgaAjoqEALw_wcB) para melhor desempenho em consultas complexas e escalabilidade horizontal.

- Implemente ferramentas como [ELK Stack](https://www.elastic.co/what-is/elk-stack) ou [Prometheus + Grafana](https://prometheus.io/) para monitorar o desempenho e registrar logs do sistema.

- **Internacionalização [(i18n)](https://www.alura.com.br/artigos/i18n-no-next-js?srsltid=AfmBOoqSzY9MYzwqpiIgOaA_k2pm4fohD6g8Va_1KRxkiSquBtChzf8b)**  
  Adicionar suporte a múltiplos idiomas para tornar o sistema acessível a um público mais amplo.

- **Sistema de Backup**  
  Configurar backups automáticos do banco de dados para evitar perda de dados.

- **Acessibilidade**  
  Certificarmos de que a aplicação segue as diretrizes de acessibilidade [(WCAG)](https://guia-wcag.com/) para atender usuários com deficiência.

- **Migração para Microservices**  
  Se o projeto crescer, considerar dividir a aplicação em microserviços para maior escalabilidade e flexibilidade. Por exemplo:  
  - Serviço para autenticação.  
  - Serviço para gestão de formulários.  
  - Serviço para geração de gráficos.

- **Melhoria na Experiência do Usuário**  
  Considerar integrar um framework de frontend moderno, como React ou Vue.js, para criar uma interface mais interativa e responsiva.

- **Sistema de Cache**  
  Implementar um sistema de cache (ex.: Redis) para melhorar a performance de consultas frequentes ao banco de dados.

- **Otimização de Templates JTE**  
  Revisar templates para eficiência e reutilização é importante para evitar duplicação de código.  
  - Considerar criar componentes reutilizáveis para elementos comuns, como cabeçalhos, rodapés e formulários.

- Avaliar a possibilidade de implementar lazy loading para imagens e outros recursos pesados, melhorando o tempo de carregamento da página.

- **Melhoria na Segurança**  
  Implementar medidas adicionais de segurança, como proteção contra [CSRF (Cross-Site Request Forgery)](https://www.ibm.com/docs/pt-br/sva/11.0.0?topic=configuration-prevention-cross-site-request-forgery-csrf-attacks) e [XSS (Cross-Site Scripting)](https://www.kaspersky.com.br/resource-center/definitions/what-is-a-cross-site-scripting-attack).

- Revisão dos conceitos de [SOLID](https://www.alura.com.br/artigos/solid)

- Revisão dos conceitos de [TDD (Test Driven Development)](https://www.alura.com.br/artigos/tdd-um-guia-completo-para-iniciantes) e [BDD (Behavior Driven Development)](https://www.alura.com.br/artigos/guia-completo-sobre-bdd-behavior-driven-development).

- Implementar um sistema de feedback para os usuários, permitindo que eles relatem bugs ou sugiram melhorias.

- Contador de formulários preenchidos para ser exibido nos relatórios.

- Implementar um sistema de notificações para alertar os usuários sobre atualizações ou eventos importantes.

- **Melhoria na Performance**  
  Avaliar a possibilidade de otimizar consultas ao banco de dados, utilizando índices e outras técnicas de otimização.
- **Melhoria na Escalabilidade**  
Considerar a utilização de um serviço de nuvem para hospedar a aplicação, permitindo escalabilidade horizontal e vertical conforme necessário.

- Melhoria na tecnologia de geração de gráficos estatisticos

- Utilização de APIs estatísticas como PowerBI para geração dos graficos, bem como mapas de calor e dendogramas.

- Atualização de formulário para acrescentar à pesquisa a regionalidade e a profissão do entrevistado, bem como a data que foi feita a entrevista.

- Melhor gestão das UI/UX, com a utilização de frameworks como Bootstrap ou Tailwind CSS para melhorar a aparência e usabilidade da aplicação.

- Refatoramento da Logo e tipografia e cores do projeto para garantir uma identidade visual mais coesa e profissional.

- Implementar um sistema de gerenciamento de usuários, permitindo a criação, edição e exclusão de usuários diretamente pela interface da aplicação.

- Implementar um sistema de auditoria para rastrear alterações feitas no banco de dados, permitindo a recuperação de dados em caso de erro ou má conduta.

- Autenticação de 2 fatores

- Implementar um sistema de gerenciamento de permissões, permitindo que diferentes usuários tenham diferentes níveis de acesso à aplicação.

- Implementar um sistema de gerenciamento de sessões, permitindo que os usuários possam visualizar e encerrar suas sessões ativas.

- Implementar um sistema de gerenciamento de logs, permitindo que os usuários capacitados possam visualizar e pesquisar logs de atividades na aplicação.

- Implementar um sistema de gerenciamento de tarefas, permitindo que os usuários possam criar, atribuir e acompanhar o progresso de tarefas dentro da aplicação (planejamento estratégico de projetos)

- Implementar sistema de exportação de arquivos gerados nos relatórios para formatos mais convencionais como PDF, XLSX e XML
