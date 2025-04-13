@import com.ads.sustancia.dto.request.CoordenadorDTO
@import java.util.List;
@param List<CoordenadorDTO> coordenadores = null

@template.layout.main(content = @`

    @if(coordenadores!= null && !coordenadores.isEmpty())
    <div class="cards">
        <!-- Card exemplo -->
        @for(CoordenadorDTO c: coordenadores)
            <article class="card">
                <div class="card-header">
                    <img src="/assets/icons/portrait.svg" alt="Entrevistador" class="foto-entrevistador">
                    <div class="info-entrevista">
                        <h4>${c.getNome()}</h4>
                        <p>${c.getEmail()}</p>
                    </div>
                </div>


            </article>
        @endfor
     @endif
    </div>
    </section>
`)
