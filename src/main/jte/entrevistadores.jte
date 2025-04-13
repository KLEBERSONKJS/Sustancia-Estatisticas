@import com.ads.sustancia.dto.request.EntrevistadorDTO
@import java.util.List;
@param List<EntrevistadorDTO> entrevistadores = null

@template.layout.main(content = @`

    @if(entrevistadores!= null && !entrevistadores.isEmpty())
        <div class="cards">
        <!-- Card exemplo -->
        @for(EntrevistadorDTO e: entrevistadores)
            <article class="card">
                <div class="card-header">
                    <img src="/assets/icons/portrait.svg" alt="Entrevistador" class="foto-entrevistador">
                    <div class="info-entrevista">
                        <h4>${e.getNome()}</h4>
                        <p>${e.getEmail()}</p>
                    </div>
                </div>
            </article>
        @endfor
    @endif
    </div>
    </section>

`)
