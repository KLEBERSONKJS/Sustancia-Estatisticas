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
            </div>
            <div class="profile-field">
                <span class="field-label">Email:</span>
                <span class="field-value" id="profileEmail">${user.getEmail()}</span>
            </div>
            <div class="profile-field">
                <span class="field-label">Senha:</span>
                <span class="field-value" id="profilePassword">••••••••</span>
            </div>
            <div class="profile-field">
                <span class="field-label">Nascimento:</span>
                <span class="field-value" id="profileBirthdate">${user.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}</span>
            </div>
        </div>
    </div>
`)
