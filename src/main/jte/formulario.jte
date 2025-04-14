@import com.ads.sustancia.dto.request.PessoaDTO
@import com.ads.sustancia.dto.response.ErrorResponse
@param ErrorResponse error = new ErrorResponse()
@param String mensagem

<!DOCTYPE html>
<html lang="pt-BR">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="/css/formulario.css" />
  <title>Ficha de Análise - (In)Segurança Alimentar</title>
</head>

<body>
<main class="formulario">
  <h1 class="formulario-titulo">Ficha para Análise das Condições de (In)Segurança Alimentar</h1>

  <form action="/formulario/save" method="post" class="formulario-corpo">

    <!-- 1. Questionário Socioeconômico -->
    <fieldset class="formulario-secao">
      <legend class="formulario-legenda">1. Questionário Socioeconômico</legend>
      @if(error!= null)
        <p>${error.getField()} ${error.getMessage()}</p>
      @endif
      @if(mensagem!= null)
        <p style="color:red ">${mensagem}</p>
      @endif
      <div class="campo campo-texto">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required />
      </div>

      <div class="campo campo-numero">
        <label for="idade">Idade:</label>
        <input type="number" id="idade" name="idade" required />
      </div>

      <div class="campo campo-radio">
        <span class="campo-label">Gênero:</span>
        <div class="grupo-opcoes">
          <label><input type="radio" name="genero" value="Masculino" required> Masculino</label>
          <label><input type="radio" name="genero" value="Feminino"> Feminino</label>
          <label><input type="radio" name="genero" value="Transgênero"> Transgênero</label>
          <label><input type="radio" name="genero" value="Não Binário"> Não Binário</label>
          <label><input type="radio" name="genero" value="Outro"> Outro</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <span class="campo-label">Raça/Cor:</span>
        <div class="grupo-opcoes">
          <label><input type="radio" name="raca" value="Branco" required> Branco</label>
          <label><input type="radio" name="raca" value="Preto"> Preto</label>
          <label><input type="radio" name="raca" value="Pardo"> Pardo</label>
          <label><input type="radio" name="raca" value="Povos Originários"> Povos Originários</label>
        </div>
      </div>

      <div class="campo campo-select">
        <label for="escolaridade">Escolaridade:</label>
        <select id="escolaridade" name="escolaridade">
          <option value="Ensino Fundamental Incompleto">Ensino Fundamental Incompleto</option>
          <option value="Ensino Fundamental Completo">Ensino Fundamental Completo</option>
          <option value="Ensino Médio Incompleto">Ensino Médio Incompleto</option>
          <option value="Ensino Médio Completo">Ensino Médio Completo</option>
          <option value="Graduação Incompleta">Graduação Incompleta</option>
          <option value="Graduação Completa">Graduação Completa</option>
          <option value="Prefere não dizer">Prefere não dizer</option>
        </select>
      </div>

      <div class="campo campo-radio">
        <span class="campo-label">Estado Civil:</span>
        <div class="grupo-opcoes">

          <label><input type="radio" name="estado_civil" value="Casado" required> Casado</label>
          <label><input type="radio" name="estado_civil" value="Viúvo"> Viúvo</label>
          <label><input type="radio" name="estado_civil" value="Divorciado"> Divorciado</label>
          <label><input type="radio" name="estado_civil" value="Separado"> Separado</label>
          <label><input type="radio" name="estado_civil" value="Solteiro"> Solteiro</label>
          <label><input type="radio" name="estado_civil" value="Prefere não dizer"> Prefere não dizer</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <span class="campo-label">Emprego:</span>
        <div class="grupo-opcoes">
          <label><input type="radio" name="emprego" value="Meio período" required> Meio período</label>
          <label><input type="radio" name="emprego" value="Desempregado"> Desempregado</label>
          <label><input type="radio" name="emprego" value="Incapaz de trabalhar"> Incapaz de trabalhar</label>
          <label><input type="radio" name="emprego" value="Aposentado"> Aposentado</label>
          <label><input type="radio" name="emprego" value="Prefere não dizer"> Prefere não dizer</label>
          <label><input type="radio" name="emprego" value="Outro"> Outro</label>
        </div>
      </div>

      <div class="campo campo-checkbox">
        <label for="auxilios">Auxílios:</label>
        <label><input type="checkbox" name="auxilios" value="Nenhum"> Nenhum</label>
        <label><input type="checkbox" name="auxilios" value="Bolsa familia"> Bolsa Familia</label>
        <label><input type="checkbox" name="auxilios" value="Beneficio de Prestação Continuada"> Beneficio de Prestação Continuada</label>
        <label><input type="checkbox" name="auxilios" value="Seguro Desemprego"> Seguro Desemprego</label>
        <label><input type="checkbox" name="auxilios" value="Auxilio Gas"> Auxílio Gás</label>
        <label><input type="checkbox" name="auxilios" value="Outros"> Outros</label>
      </div>

      <div class="campo campo-radio">
        <span class="campo-label">Família e Dependentes:</span>
        <div class="grupo-opcoes">
          <label><input type="radio" name="familia" value="Nenhum" required> Nenhum</label>
          <label><input type="radio" name="familia" value="1"> 1</label>
          <label><input type="radio" name="familia" value="2"> 2</label>
          <label><input type="radio" name="familia" value="3"> 3</label>
          <label><input type="radio" name="familia" value="4"> 4</label>
          <label><input type="radio" name="familia" value="5 ou mais"> 5 ou mais</label>
          <label><input type="radio" name="familia" value="Prefere não dizer"> Prefere não dizer</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <span class="campo-label">Religião:</span>
        <div class="grupo-opcoes">
          <label><input type="radio" name="religiao" value="Católico" required> Católico</label>
          <label><input type="radio" name="religiao" value="Evangélico"> Evangélico</label>
          <label><input type="radio" name="religiao" value="Candomblé"> Candomblé</label>
          <label><input type="radio" name="religiao" value="Umbanda"> Umbanda</label>
          <label><input type="radio" name="religiao" value="Espirita"> Espírita</label>
          <label><input type="radio" name="religiao" value="Nenhum"> Nenhum</label>
          <label><input type="radio" name="religiao" value="Prefere não dizer"> Prefere não dizer</label>
          <label><input type="radio" name="religiao" value="Outro"> Outro</label>
        </div>
      </div>
    </fieldset>

    <!-- 2. Coleta de Marcadores de Consumo Alimentar -->
    <fieldset class="formulario-secao">
      <legend class="formulario-legenda">2. Coleta de Marcadores de Consumo Alimentar</legend>

      <div class="campo campo-radio">
        <label>Você tem costume de fazer refeições mexendo no computador ou celular?</label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="refeicoes_com_tecnologia" value="Sim" required> Sim</label>
          <label><input type="radio" name="refeicoes_com_tecnologia" value="Não"> Não</label>
          <label><input type="radio" name="refeicoes_com_tecnologia" value="Não Sei"> Não Sei</label>
        </div>
      </div>

      <div class="campo campo-checkbox">
        <label>Quais refeições você faz ao longo do dia?</label>
        <div class="grupo-opcoes">
          <label><input type="checkbox" name="refeicoes" value="Café da manhã"> Café da manhã</label>
          <label><input type="checkbox" name="refeicoes" value="Lanche da manhã"> Lanche da manhã</label>
          <label><input type="checkbox" name="refeicoes" value="Almoço"> Almoço</label>
          <label><input type="checkbox" name="refeicoes" value="Lanche da tarde"> Lanche da tarde</label>
          <label><input type="checkbox" name="refeicoes" value="Jantar"> Jantar</label>
          <label><input type="checkbox" name="refeicoes" value="Ceia"> Ceia/Lanche da noite</label>
        </div>
      </div>

      <div class="campo campo-checkbox">
        <label>Ontem, você consumiu:</label>
        <div class="grupo-opcoes">
          <label><input type="checkbox" name="consumo" value="Feijão" /> Feijão</label>
          <label><input type="checkbox" name="consumo" value="Frutas frescas" /> Frutas frescas <strong>(não
              considerar suco de frutas)</strong></label>
          <label><input type="checkbox" name="consumo" value="Verduras e legumes" /> Verduras e legumes <strong>(não
              considerar batata,
              mandioca, aipim, macaxeira, cará e inhame)</strong></label>
          <label><input type="checkbox" name="consumo" value="Hambúrguer e/ou embutidos" /> Hambúrguer e/ou embutidos
            <strong>(presunto, mortadela,
              salame, linguiça, salsicha)</strong>
          </label>
          <label><input type="checkbox" name="consumo" value="Bebidas adoçadas" /> Bebidas adoçadas
            <strong>(refrigerante. suco de caixinha,
              suco em pó, água de coco de caixinha, xaropes
              de guaraná/groselha, suco de fruta com adição
              de açúcar)</strong>
          </label>
          <label><input type="checkbox" name="consumo" value="Macarrão instantâneo ou salgadinhos" /> Macarrão
            instantâneo ou salgadinhos</label>
          <label><input type="checkbox" name="consumo" value="Biscoitos recheados e doces" /> Biscoitos recheados e
            doces <strong>(balas,
              pirulitos, chiclete, caramelo, gelatina)</strong></label>
        </div>
      </div>
    </fieldset>

    <!-- 3. Escala Brasileira de Insegurança Alimentar -->
    <fieldset class="formulario-secao">
      <legend class="formulario-legenda">3. Escala Brasileira de Insegurança Alimentar (EBIA)</legend>
      <p class="formulario-instrucoes">Nos últimos três meses:</p>

      <!-- EBIA perguntas (1 a 8) -->
      <div class="campo campo-radio">
        <label>1. Os moradores deste domicílio tiveram a <strong>preocupação de que os alimentos acabassem </strong>
          antes de poderem comprar ou receber mais comida?</label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="ebia_1" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_1" value="Não"> Não</label>
          <label><input type="radio" name="ebia_1" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <label>2. Nos últimos três meses, <strong>os alimentos acabaram</strong>
          antes que os moradores deste domicílio tivessem
          dinheiro para comprar mais comida?</label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="ebia_2" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_2" value="Não"> Não</label>
          <label><input type="radio" name="ebia_2" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <label>3. Nos últimos três meses, os moradores deste
          domicílio ficaram <strong>sem dinheiro</strong> para ter uma
          alimentação saudável e variada?</label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="ebia_3" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_3" value="Não"> Não</label>
          <label><input type="radio" name="ebia_3" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <label>4. Nos últimos três meses, os moradores deste
          domicílio comeram <strong>apenas alguns poucos
            tipos de alimentos</strong> que ainda tinham, porque o
          dinheiro acabou?
        </label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="ebia_4" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_4" value="Não"> Não</label>
          <label><input type="radio" name="ebia_4" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <label>5. Nos últimos três meses, algum/a <strong>morador/a de
            18 anos ou mais de idade deixou de fazer
            alguma refeição</strong>, porque não havia dinheiro para
          comprar comida?
        </label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="ebia_5" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_5" value="Não"> Não</label>
          <label><input type="radio" name="ebia_5" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <label>6. Nos últimos três meses, algum/a morador/a de 18
          anos ou mais de idade, alguma vez, <strong>comeu
            menos do que achou que devia</strong>, porque não
          havia dinheiro para comprar comida?</label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="ebia_6" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_6" value="Não"> Não</label>
          <label><input type="radio" name="ebia_6" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <label>7. Nos últimos três meses, algum/a morador/a de 18
          anos ou mais de idade, alguma vez, <strong>sentiu
            fome, mas não comeu</strong>, porque não havia
          dinheiro para comprar comida?
        </label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="ebia_7" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_7" value="Não"> Não</label>
          <label><input type="radio" name="ebia_7" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="campo campo-radio">
        <label>8. Nos últimos três meses, algum/a morador/a de 18
          anos ou mais de idade, alguma vez, fez <strong>apenas
            uma refeição ao dia ou ficou um dia inteiro
            sem comer</strong> porque não havia dinheiro para
          comprar comida?</label>
        <div class="grupo-opcoes">
          <label><input type="radio" name="ebia_8" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_8" value="Não"> Não</label>
          <label><input type="radio" name="ebia_8" value="Não sabe"> Não sabe</label>
        </div>
      </div>
      <!-- Último botão -->
      <div class="formulario-rodape">
        <button type="submit" class="botao botao-principal">Enviar</button>
        <a href="/home"  class="botao botao principal">Retorne a página anterior</a>
      </div>
    </fieldset>
  </form>
</main>
</body>

</html>