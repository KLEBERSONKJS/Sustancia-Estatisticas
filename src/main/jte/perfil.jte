@import com.ads.sustancia.model.Usuario
@import java.time.format.DateTimeFormatter
@param Usuario user
@template.layout.main(content = @`
    <div class="profile-card">
        <div class="card-header">
            <h3>Dados Pessoais</h3>
        </div>
        <div class="card-body">
            <div class="profile-field">
                <span class="field-label">Nome:</span>
                <span class="field-value" id="profileName">${user.getNome()}</span>
                 <input class="field-input" type="text" id="editName" value="${user.getNome()}" style="display: none;">
                <button onclick="toggleEdit('Name')">✏️</button>
            </div>
            <div class="profile-field">
                <span class="field-label">Email:</span>
                <span class="field-value" id="profileEmail">${user.getEmail()}</span>
                 <input class="field-input" type="email" id="editEmail" value="${user.getEmail()}" style="display: none;">
                <button onclick="toggleEdit('Email')">✏️</button>
            </div>
            <div class="profile-field">
                <span class="field-label">Senha:</span>
                <span class="field-value" id="profilePassword">••••••••</span>
                <input class="field-input" type="password" id="editPassword" value="${user.getSenha()}" style="display: none;">
                <button onclick="toggleVisibility('Password')">👁️</button>
            </div>
            <div class="profile-field">
                <span class="field-label">Nascimento:</span>
                <span class="field-value" id="profileBirthdate">${user.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}</span>
                
            </div>
        </div>
    </div>
     <script>
        function toggleVisibility(field) {
            const span = document.getElementById("profile" + field);
            const input = document.getElementById("edit" + field);
            if (span.innerText === "••••••••" || span.innerText === "*********") {
                span.innerText = input.value;
            } else {
                span.innerText = field === "Password" ? "••••••••" : "*********";
            }
        }

        function toggleEdit(field) {
            const span = document.getElementById("profile" + field);
            const input = document.getElementById("edit" + field);
            const isEditing = input.style.display === "inline";

            if (isEditing) {
                span.innerText = input.value;
                input.style.display = "none";
                span.style.display = "inline";
            } else {
                input.style.display = "inline";
                span.style.display = "none";
            }
        }
    </script>
`)
