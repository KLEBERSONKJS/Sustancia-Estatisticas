# Arquitetura e Hierarquia de Arquivos

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
│   ├── Documento-Inicial.md
│   ├── Propostas.md
│   ├── Arquitetura.md
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
- **/static**: Contém arquivos estáticos, como CSS, JavaScript e imagens.
- **/jte**: Contém templates JTE (Java Template Engine) utilizados para renderização dinâmica de páginas HTML.
- **/resources**: Contém arquivos de configuração e recursos do projeto, como o arquivo `application.properties` e scripts SQL de inicialização.
- **/test**: Contém os testes do projeto, incluindo classes de teste e recursos relacionados.
- **/repository**: Contém as interfaces de repositório para acesso a dados.
- **/service**: Contém as interfaces e implementações dos serviços do projeto.
- **/controller**: Contém os controladores responsáveis por gerenciar as requisições HTTP e a lógica de negócios.
- **/dto**: Contém os objetos de transferência de dados (DTOs) utilizados para comunicação entre camadas.
- **/model**: Contém as classes de modelo que representam as entidades do domínio.
- **/config**: Contém as classes de configuração do projeto, como segurança e inicialização.
- **/util**: Contém classes utilitárias que fornecem funcionalidades auxiliares.
- **/enums**: Contém as definições de enums utilizados no projeto.
- **/mapping**: Contém as classes responsáveis pela conversão entre entidades e DTOs.
