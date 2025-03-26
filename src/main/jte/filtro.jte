<!-- filtro.jte -->
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Filtrar Pessoas</title>
</head>
<body>
    <h2>Filtrar Pessoas</h2>
    <form action="/formulario/filtro/resultado" method="get">
        <label for="idade">Idade:</label>
        <input type="number" name="idade" id="idade" placeholder="Idade" /><br>

        <label for="genero">Gênero:</label>
        <input type="text" name="genero" id="genero" placeholder="Gênero" /><br>

        <label for="raca">Raça:</label>
        <input type="text" name="raca" id="raca" placeholder="Raça" /><br>

        <label for="escolariadade">Escolaridade:</label>
        <input type="text" name="escolariadade" id="escolariadade" placeholder="Escolaridade" /><br>

        <label for="estadoCivil">Estado Civil:</label>
        <input type="text" name="estadoCivil" id="estadoCivil" placeholder="Estado Civil" /><br>

        <label for="emprego">Emprego:</label>
        <input type="text" name="emprego" id="emprego" placeholder="Emprego" /><br>

        <label for="auxilio">Auxílio:</label>
        <input type="text" name="auxilio" id="auxilio" placeholder="Auxílio" /><br>

        <label for="dependentes">Dependentes:</label>
        <input type="text" name="dependentes" id="dependentes" placeholder="Dependentes" /><br>

        <label for="religiao">Religião:</label>
        <input type="text" name="religiao" id="religiao" placeholder="Religião" /><br>

        <button type="submit">Filtrar</button>
    </form>
</body>
</html>
