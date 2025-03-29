<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Filtros Avançados</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            line-height: 1.6;
        }

        .filter-section {
            background-color: #f5f5f5;
            padding: 20px;
            border-radius: 8px;
            margin-bottom: 20px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        .filter-group {
            margin-bottom: 15px;
        }

        h1 {
            color: #2c3e50;
            text-align: center;
            margin-bottom: 20px;
        }

        h2 {
            margin-top: 0;
            color: #333;
            border-bottom: 1px solid #ddd;
            padding-bottom: 10px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #2c3e50;
        }

        select,
        input[type="number"] {
            padding: 10px;
            width: 100%;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            width: 100%;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #45a049;
        }

        .range-inputs {
            display: flex;
            gap: 10px;
        }

        .range-inputs input {
            flex: 1;
        }

        #results {
            margin-top: 20px;
            padding: 15px;
            background-color: #f9f9f9;
            border-radius: 4px;
        }
    </style>
</head>

<body>
    <h1>Filtros Avançados</h1>

    <form action="/relatorio" method="post">
        <div class="filter-section">
            <h2>Filtrar por:</h2>

            <div class="filter-group">
                <label for="raca">Raça/Cor:</label>
                <select id="raca" name="raca">
                    <option value="all">Todas as raças</option>
                    <option value="Branco">Branco</option>
                    <option value="Preto">Preto</option>
                    <option value="Pardo">Pardo</option>
                </select>
            </div>

            <div class="filter-group">
                <label for="genero">Gênero:</label>
                <select id="genero" name="genero">
                    <option value="">Todos os gêneros</option>
                    <option value="Masculino">Masculino</option>
                    <option value="Feminino">Feminino</option>
                    <option value="Transgênero">Transgênero</option>
                </select>
            </div>


            <button type="submit">Gerar Relatório</button>
        </div>
    </form>

    <div id="results">
        <!-- Os resultados aparecerão aqui -->
    </div>
</body>

</html>