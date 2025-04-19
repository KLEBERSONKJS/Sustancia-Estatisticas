# Nomenclatura Para Construção e Versionamento Do Projeto  

Adoção de um sistema de Nomenclatura para versionamento de projeto à fim de diferenciar as mudanças implementadas para agregação de monitoriamento e um padrão de Nomenclatura para seguir à fim de clarear as informações ali contidas, favorecendo a manutenabilidade e o entendimento do codigo como um todo.  

## 1. Nomenclatura de Classes  

### Front-End  

Para criação de classes nas _tags_ do Front-End, assim como o seu uso para o CSS, adota-se um padrão de Nomenclatura, em português, para referenciar o componente (objeto), a função que irá exercer dentro do documento (página) e o seu estado.  

#### Formato Geral  
  
```[componente]-[funcao]-[estado]```  

Exemplo:  

```botao-principal-ativo``` → Botão principal no estado ativo.  

```cartao-cabecalho-titulo``` → Título do cabeçalho de um card.  

```formulario-grupo-erro``` → Grupo de formulário com erro.  
>
> - Excetuam-se casos onde o nome da classe já é autoexplicativo, de uso único e absoluto, como elementos dinâmicos ou contextuais
>
> - Exemplo: ```cartao-cliente``` pode ser utilizado para designar um _card_ que suporta informações dos clientes desde que seu uso seja **único**, **não reutilizável** e **absoluto**, ou para classes **dinâmicas** (que seu estado altera de acordo com a execução de uma função.)  
>
>**Ex.: botões do tipo interruptores (_toggle_), cartões que servirão como _hovers_**, entre outros.
>

---

### Back-End  

Para criação de ```Classes```, adota-se um padrão de Nomenclatura, para referenciar a entidade (objeto), a ação lógica que executará e o detalhe (se necessário).  

#### Padrão de Nomenclatura de Classes (_Java_)

```[entidade][ação][detalhe]```  

Exemplo:  

```UsuarioService``` → Serviço relacionado à entidade Usuario.  

```RelatorioController``` → Controlador para gerenciar relatórios.  

```EntrevistadorDTO``` → Objeto de transferência de dados para entrevistadores.  

>**Observação:** O uso de letras maiúsculas para separar palavras é uma prática comum em Java, conhecida como CamelCase.

#### **Objetos (Classes)**

- Use **CamelCase**.
- O nome deve ser um substantivo que represente claramente a entidade ou responsabilidade da classe.
- Exemplo:
  - `Usuario`
  - `RelatorioController`
  - `EntrevistadorDTO`
  - `PessoaRepository`
  - `DatabaseConfig`

#### **Métodos**

- Use **camelCase**.
- O nome deve ser um verbo ou uma frase verbal que indique claramente a ação realizada.
- Seja descritivo e evite abreviações desnecessárias.
- Exemplo:
  - `criarUsuario()`
  - `buscarPorId(Long id)`
  - `atualizarRelatorio(Relatorio relatorio)`
  - `removerEntrevistador(Long id)`
  - `listarTodos()`

#### **Atributos**

- Use **camelCase**.
- O nome deve ser um substantivo ou frase curta que represente claramente o dado armazenado.
- Prefira nomes descritivos e evite abreviações.
- Exemplo:
  - `nome`
  - `dataNascimento`
  - `emailUsuario`
  - `statusAtivo`
  - `listaEntrevistadores`

> **Observação:**  
>
> - Constantes devem ser nomeadas em **CAIXA_ALTA** com palavras separadas por underline, ex: `VALOR_MAXIMO`.
> - Variáveis temporárias ou de escopo reduzido podem ter nomes mais curtos, mas sempre claros quanto ao seu propósito.
>
---

## 2. Nomenclatura para Versionamento  

Formato Geral:  

```[MAJOR].[MINOR].[PATCH]-[TAG]```  

```MAJOR```: Alterações que quebram compatibilidade com versões anteriores.  

```MINOR```: Novas funcionalidades que não quebram compatibilidade.  

```PATCH```: Correções de bugs ou melhorias pequenas.  

```TAG```: Identifica o estágio do projeto.  

Para mapeamento do ciclo de vida do software assim como de suas mudanças ao longo do desenvolvimento, é adotado o seguinte parametro:  

```[MAJOR].[MINOR].[PATCH]-[TAG]+[build]```  

os Builds serão utilizados para mapear a versão da resolução da Tag atribuida.  
Ex.: 1.0.0-stable+20250419  

> OBS: o versionamento da build não tem padrão fixo adotado ainda, se será crescente ou datado, acima, é apenas um exemplo comum

---

### Categorias de Tags de Versionamento

#### Ciclo de Vida da Versão

| Tag             | Descrição                                                        |
|-----------------|------------------------------------------------------------------|
| `-prototype`    | Protótipo inicial, usado para validação de ideias.               |
| `-alpha`        | Versão inicial com funcionalidades básicas, sujeita a erros.     |
| `-beta`         | Versão com funcionalidades completas, mas ainda em testes.       |
| `-beta-test`    | Versão beta destinada a testes externos.                         |
| `-rc`           | Release Candidate, versão quase final, pronta para validação.    |
| `-pre-release`  | Versão pré-lançamento, destinada a testes.                       |
| `-final`        | Versão estável e pronta para produção.                           |
| `-stable`       | Versão estável, pronta para uso em produção.                     |
| `-legacy`       | Versão antiga, mantida por compatibilidade.                      |

---

#### Desenvolvimento e Testes

| Tag           | Descrição                                                          |
|---------------|--------------------------------------------------------------------|
| `-dev`        | Versão de desenvolvimento, não estável.                            |
| `-snapshot`   | Versão em desenvolvimento, não estável.                            |
| `-test`       | Versão destinada a testes, não recomendada para produção.          |
| `-demo`       | Versão de demonstração, com funcionalidades limitadas.             |
| `-internal`   | Versão destinada ao uso interno, não pública.                      |
| `-staging`    | Versão de pré-produção, destinada a testes finais.                 |
| `-canary`     | Versão experimental, destinada a testes em produção.               |

---

#### Atualizações e Manutenção

| Tag             | Descrição                                                        |
|-----------------|------------------------------------------------------------------|
| `-patch`        | Atualização para corrigir bugs ou melhorar a versão final.       |
| `-hotfix`       | Correção urgente de um bug crítico.                              |
| `-rollback`     | Versão anterior, usada para reverter mudanças.                   |
| `-upgrade`      | Atualização de versão, destinada a atualizar dependências ou bibliotecas. |
| `-migration`    | Atualização de migração, destinada a migrar dados ou funcionalidades.     |
| `-cleanup`      | Atualização de limpeza, destinada a remover código obsoleto.     |
| `-refactor`     | Atualização de refatoração, destinada a melhorar o código.       |

---

#### Funcionalidades Especiais e Estado

| Tag               | Descrição                                                      |
|-------------------|----------------------------------------------------------------|
| `-experimental`   | Versão com novas funcionalidades em teste, não recomendada para produção. |
| `-unstable`       | Versão instável, sujeita a mudanças frequentes.                |
| `-deprecated`     | Funcionalidade obsoleta, mas ainda disponível.                 |

---

#### Melhorias Específicas

| Tag                    | Descrição                                                 |
|------------------------|-----------------------------------------------------------|
| `-security`            | Atualização de segurança, destinada a corrigir vulnerabilidades.          |
| `-performance`         | Atualização de desempenho, destinada a melhorar a performance.            |
| `-localization`        | Atualização de localização, destinada a melhorar a tradução.              |
| `-internationalization`| Atualização de internacionalização, destinada a melhorar o suporte a idiomas. |
| `-accessibility`       | Atualização de acessibilidade, destinada a melhorar o suporte a usuários com deficiência. |
| `-usability`           | Atualização de usabilidade, destinada a melhorar a experiência do usuário. |

---

### Exemplo de Versionamento  

```1.0.0-prototype``` → Versão inicial do protótipo.  

```1.1.0-alpha``` → Versão alfa com novas funcionalidades.  

```1.2.0-beta``` → Versão beta com funcionalidades completas.  

```1.2.1-patch``` → Correção de bugs na versão beta.  

```2.0.0-final``` → Versão final estável.  

---

## 3. Nomenclatura de Diretórios e Arquivos

Para criação de diretórios e arquivos, adota-se um padrão de Nomenclatura, em português, para referenciar o tipo de arquivo e a sua função.

Formato Geral:  

```[tipo]-[funcao]```  

Exemplo:  

```controller-usuario``` → Controlador para gerenciar usuários.  

```service-relatorio``` → Serviço para gerar relatórios.  

```repository-pessoa``` → Repositório para acessar dados de pessoas.  

```dto-entrevistador``` → Objeto de transferência de dados para entrevistadores.
  
```config-database``` → Configuração do banco de dados.  
>
>Use “em minúsculas e com hífen” para indicar como o nome deve ser escrito (pois isso não está explícito).
>
>- Ex: controller-usuario, service-relatorio → “em minúsculas e separados por hífen.

---

## Conclusão

A adoção de um padrão de Nomenclatura e versionamento é essencial para garantir a clareza, organização e manutenibilidade do projeto. Seguir essas diretrizes ajudará a equipe a trabalhar de forma mais eficiente e colaborativa, facilitando a compreensão do código e a identificação de problemas.

O documento acima é um prototipo inicial e pode ser atualizado conforme necessário. A equipe deve revisar e ajustar as diretrizes conforme o projeto evolui e novas necessidades surgem.

---
> Versão 1.0.0  
> 19 de Abril de 2025
