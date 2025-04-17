# Nomeclatura Para Versionamento Do Projeto  

Adoção de um sistema de nomeclatura para versionamento de projeto.  

## 1. Nomenclatura de Classes  

### Front-End  

Para criação de classes no Front-End, adota-se um padrão de nomeclatura, em português, para referenciar o componente (objeto), a função que irá exercer dentro do documento (página) e o seu estado.  

```[componente]-[funcao]-[estado]```  

Exemplo:  

```btn-principal-ativo``` → Botão principal no estado ativo.  

```cartao-cabecalho-titulo``` → Título do cabeçalho de um card.  

```form-group-error``` → Grupo de formulário com erro.  
>Salvo exceções para auto-explicação explicita e sem estado de uso único e especifico, **absoluto**
>
>Exemplo: ```cartao-cliente``` pode ser utilizado para designar um _card_ que suporta informações dos clientes desde que seu uso seja **único**, **não reutilizável** e **absoluto**, ou para classes **dinâmicas** (que seu estado altera de acordo com a execução de uma função.)  
>
>**Ex.: botões do tipo interruptores (_toggle_), cartões que servirão como _hovers_**
### Back-End  

[entidade][ação][detalhe]
Exemplo:
UsuarioService → Serviço relacionado à entidade Usuario.
RelatorioController → Controlador para gerenciar relatórios.
EntrevistadorDTO → Objeto de transferência de dados para entrevistadores.
2. Nomenclatura para Versionamento
Formato Geral:
[MAJOR].[MINOR].[PATCH]-[TAG]
MAJOR: Alterações que quebram compatibilidade com versões anteriores.
MINOR: Novas funcionalidades que não quebram compatibilidade.
PATCH: Correções de bugs ou melhorias pequenas.
TAG: Identifica o estágio do projeto.
Tags para Estágios do Projeto:
-prototype → Protótipo inicial, usado para validação de ideias.
-alpha → Versão inicial com funcionalidades básicas, sujeita a erros.
-beta → Versão com funcionalidades completas, mas ainda em testes.
-rc → Release Candidate, versão quase final, pronta para validação.
-final → Versão estável e pronta para produção.
-patch → Atualização para corrigir bugs ou melhorar a versão final.
Exemplo de Versionamento:
1.0.0-prototype → Primeira versão do protótipo.
1.1.0-alpha → Versão alfa com novas funcionalidades.
1.2.0-beta → Versão beta com funcionalidades completas.
1.2.1-patch → Correção de bugs na versão beta.
2.0.0-final → Versão final estável.
3. Tags para Separação de Estágios
Protótipo: prototype
Usado para validação inicial de ideias.
Alfa: alpha
Funcionalidades básicas implementadas, mas sujeitas a erros.
Beta: beta
Funcionalidades completas, mas ainda em testes.
Final: final
Versão estável e pronta para uso em produção.
Patch: patch
Atualizações menores para corrigir bugs ou melhorar a versão final.
Resumo
Este glossário define padrões claros para nomeclatura de classes no front-end e back-end, além de um sistema de versionamento que inclui tags para identificar o estágio do projeto. Isso facilita a organização, manutenção e evolução do projeto.
