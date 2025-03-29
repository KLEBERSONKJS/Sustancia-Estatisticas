<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="/css/filtro.css">
    <title>Filtro</title>
</head>

<body>

    <main>
        <header class="cabecalho">
            <div class="container-filtro">
                <div class="dropdown">
                    <div class="dropdown-bar">
                        <button class="toggle-dropdown" id="toggleDropdown"><i class='bx bx-chevron-down'></i></button>
                        <ul class="selected-items" id="selectedItems"></ul>
                    </div>
                    <ul class="dropdown-menu" id="dropdownMenu">
                        <li class="dropdown-item" data-value="Item 1">Lorem ipsum dolor sit.</li>
                        <li class="dropdown-item" data-value="Item 2">Lorem ipsum dolor sit.</li>
                        <li class="dropdown-item" data-value="Item 3">Lorem ipsum dolor sit.</li>
                        <li class="dropdown-item" data-value="Item 4">Lorem ipsum dolor sit.</li>
                    </ul>
                </div>
                <button class="filter-btn" id="filterBtn">Filtrar</button>
            </div>
        </header>
    </main>

    <script>
        document.addEventListener("DOMContentLoaded", function () {
            const toggleDropdown = document.getElementById("toggleDropdown");
            const dropdownMenu = document.getElementById("dropdownMenu");
            const selectedItemsContainer = document.getElementById("selectedItems");
            const filterBtn = document.getElementById("filterBtn");
            let isDropdownOpen = false;

            toggleDropdown.addEventListener("click", function () {
                dropdownMenu.classList.toggle("active");
                isDropdownOpen = !isDropdownOpen;
            });

            dropdownMenu.addEventListener("click", function (event) {
                if (event.target.classList.contains("dropdown-item")) {
                    const itemValue = event.target.dataset.value;
                    event.target.style.display = "none";

                    const selectedItem = document.createElement("li");
                    selectedItem.classList.add("selected-item");
                    selectedItem.innerHTML = `<span>${itemValue}</span> <button class="remove-item">X</button>`;

                    selectedItem.querySelector(".remove-item").addEventListener("click", function () {
                        selectedItem.remove();
                        event.target.style.display = "block";
                    });

                    selectedItemsContainer.appendChild(selectedItem);
                }
            });

            filterBtn.addEventListener("click", function () {
                selectedItemsContainer.innerHTML = "";
                dropdownMenu.querySelectorAll(".dropdown-item").forEach(item => {
                    item.style.display = "block";
                });
            });
        });
    </script>
</body>

</html>