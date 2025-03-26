@import com.ads.sustancia.record.FormularioDTO
@import com.ads.sustancia.record.ErrorResponse
@param ErrorResponse error = new ErrorResponse()

<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="../css/formulario.css">
  <title>Ficha de Análise - (In)Segurança Alimentar</title>
</head>

<body>
  <div class="container">
    <h1>Ficha para Análise das Condições de (In)Segurança Alimentar</h1>

    <form action="/formulario/save" method="post">
      <!-- Questionário Socioeconômico -->
      <h2>1. Questionário Socioeconômico</h2>
      @if(error!= null)
      <p>${error.getField()}  ${error.getMessage()}</p>
      @endif
      <div class="form-group">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required>
      </div>

      <div class="form-group">
        <label for="idade">Idade:</label>
        <input type="number" id="idade" name="idade" required>
      </div>

      <div class="form-group">
        <label>Gênero:</label>
        <div class="checkbox-group">
          <label><input type="radio" name="genero" value="Masculino" required> Masculino</label>
          <label><input type="radio" name="genero" value="Feminino"> Feminino</label>
          <label><input type="radio" name="genero" value="Transgênero"> Transgênero</label>
          <label><input type="radio" name="genero" value="Não Binário"> Não Binário</label>
          <label><input type="radio" name="genero" value="Outro"> Outro</label>
        </div>
      </div>

      <div class="form-group">
        <label>Raça/Cor:</label>
        <div class="checkbox-group">
          <label><input type="radio" name="raca" value="Branco" required> Branco</label>
          <label><input type="radio" name="raca" value="Preto"> Preto</label>
          <label><input type="radio" name="raca" value="Pardo"> Pardo</label>
          <label><input type="radio" name="raca" value="Povos Originários"> Povos Originários</label>
        </div>
      </div>

      <div class="form-group">
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

      <div class="form-group">
        <label>Estado Civil:</label>
        <div class="checkbox-group">
          <label><input type="radio" name="estado_civil" value="Casado" required> Casado</label>
          <label><input type="radio" name="estado_civil" value="Viúvo"> Viúvo</label>
          <label><input type="radio" name="estado_civil" value="Divorciado"> Divorciado</label>
          <label><input type="radio" name="estado_civil" value="Separado"> Separado</label>
          <label><input type="radio" name="estado_civil" value="Solteiro"> Solteiro</label>
          <label><input type="radio" name="estado_civil" value="Prefere não dizer"> Prefere não dizer</label>
        </div>
      </div>

      <div class="form-group">
        <label>Emprego:</label>
        <div class="checkbox-group">
          <label><input type="radio" name="emprego" value="Meio período" required> Meio período</label>
          <label><input type="radio" name="emprego" value="Desempregado"> Desempregado</label>
          <label><input type="radio" name="emprego" value="Incapaz de trabalhar"> Incapaz de trabalhar</label>
          <label><input type="radio" name="emprego" value="Aposentado"> Aposentado</label>
          <label><input type="radio" name="emprego" value="Prefere não dizer"> Prefere não dizer</label>
          <label><input type="radio" name="emprego" value="Outro"> Outro</label>
        </div>
      </div>

      <div class="form-group">
        <label for="auxilios">Auxílios:</label>
        <input type="text" id="auxilios" name="auxilios" placeholder="Ex.: Bolsa Família, Outros...">
      </div>

      <div class="form-group">
        <label>Família e Dependentes:</label>
        <div class="checkbox-group">
          <label><input type="radio" name="familia" value="Nenhum" required> Nenhum</label>
          <label><input type="radio" name="familia" value="1"> 1</label>
          <label><input type="radio" name="familia" value="2"> 2</label>
          <label><input type="radio" name="familia" value="3"> 3</label>
          <label><input type="radio" name="familia" value="4"> 4</label>
          <label><input type="radio" name="familia" value="5 ou mais"> 5 ou mais</label>
          <label><input type="radio" name="familia" value="Prefere não dizer"> Prefere não dizer</label>
        </div>
      </div>

      <div class="form-group">
        <label>Religião:</label>
        <div class="checkbox-group">
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

      <!-- Coleta de Marcadores de Consumo Alimentar -->
      <h2>2. Coleta de Marcadores de Consumo Alimentar</h2>
      <div class="form-group">
        <label>Você tem costume de fazer refeições mexendo no computador ou celular?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="refeicoes_com_tecnologia" value="Sim" required> Sim</label>
          <label><input type="radio" name="refeicoes_com_tecnologia" value="Não"> Não</label>
          <label><input type="radio" name="refeicoes_com_tecnologia" value="Não Sei"> Não Sei</label>
        </div>
      </div>

      <div class="form-group">
        <label>Quais refeições você faz ao longo do dia?</label>
        <div class="checkbox-group">
          <label><input type="checkbox" name="refeicoes[]" value="Café da manhã"> Café da manhã</label>
          <label><input type="checkbox" name="refeicoes[]" value="Lanche da manhã"> Lanche da manhã</label>
          <label><input type="checkbox" name="refeicoes[]" value="Almoço"> Almoço</label>
          <label><input type="checkbox" name="refeicoes[]" value="Lanche da tarde"> Lanche da tarde</label>
          <label><input type="checkbox" name="refeicoes[]" value="Jantar"> Jantar</label>
          <label><input type="checkbox" name="refeicoes[]" value="Ceia"> Ceia/Lanche da noite</label>
        </div>
      </div>

      <div class="form-group">
        <label>Ontem, você consumiu:</label>
        <div class="checkbox-group">
          <label><input type="checkbox" name="consumo[]" value="Feijão"> Feijão</label>
          <label><input type="checkbox" name="consumo[]" value="Frutas frescas"> Frutas frescas</label>
          <label><input type="checkbox" name="consumo[]" value="Verduras e legumes"> Verduras e legumes</label>
          <label><input type="checkbox" name="consumo[]" value="Hambúrguer e/ou embutidos"> Hambúrguer e/ou embutidos</label>
          <label><input type="checkbox" name="consumo[]" value="Bebidas adoçadas"> Bebidas adoçadas</label>
          <label><input type="checkbox" name="consumo[]" value="Macarrão instantâneo ou salgadinhos"> Macarrão instantâneo ou salgadinhos</label>
          <label><input type="checkbox" name="consumo[]" value="Biscoitos recheados e doces"> Biscoitos recheados e doces</label>
        </div>
      </div>

      <!-- Escala Brasileira de Insegurança Alimentar (EBIA) -->
      <h2>3. Escala Brasileira de Insegurança Alimentar (EBIA)</h2>
      <p>Nos últimos três meses:</p>
      <div class="form-group">
        <label>1. Os moradores deste domicílio tiveram a preocupação de que os alimentos acabassem antes de poderem comprar ou receber mais comida?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="ebia_1" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_1" value="Não"> Não</label>
          <label><input type="radio" name="ebia_1" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="form-group">
        <label>2. Os alimentos acabaram antes que os moradores deste domicílio tivessem dinheiro para comprar mais comida?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="ebia_2" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_2" value="Não"> Não</label>
          <label><input type="radio" name="ebia_2" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="form-group">
        <label>3. Os moradores deste domicílio ficaram sem dinheiro para ter uma alimentação saudável e variada?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="ebia_3" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_3" value="Não"> Não</label>
          <label><input type="radio" name="ebia_3" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="form-group">
        <label>4. Os moradores deste domicílio comeram apenas alguns poucos tipos de alimentos que ainda tinham, porque o dinheiro acabou?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="ebia_4" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_4" value="Não"> Não</label>
          <label><input type="radio" name="ebia_4" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="form-group">
        <label>5. Algum/a morador/a de 18 anos ou mais deixou de fazer alguma refeição, porque não havia dinheiro para comprar comida?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="ebia_5" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_5" value="Não"> Não</label>
          <label><input type="radio" name="ebia_5" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="form-group">
        <label>6. Algum/a morador/a de 18 anos ou mais comeu menos do que achou que devia, porque não havia dinheiro para comprar comida?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="ebia_6" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_6" value="Não"> Não</label>
          <label><input type="radio" name="ebia_6" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="form-group">
        <label>7. Algum/a morador/a de 18 anos ou mais sentiu fome, mas não comeu, porque não havia dinheiro para comprar comida?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="ebia_7" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_7" value="Não"> Não</label>
          <label><input type="radio" name="ebia_7" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <div class="form-group">
        <label>8. Algum/a morador/a de 18 anos ou mais fez apenas uma refeição ao dia ou ficou um dia inteiro sem comer porque não havia dinheiro para comprar comida?</label>
        <div class="checkbox-group">
          <label><input type="radio" name="ebia_8" value="Sim" required> Sim</label>
          <label><input type="radio" name="ebia_8" value="Não"> Não</label>
          <label><input type="radio" name="ebia_8" value="Não sabe"> Não sabe</label>
        </div>
      </div>

      <button type="submit">Enviar</button>
    </form>  </div>
</body>
</html>
