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
                        <h4>${c.getEmail()}</h4>
                        <p>${c.getEmail()}</p>
                    </div>
                </div>

                <div class="card-acoes">
                    <form method="get" action="/entrevistador/editar/1">
                        <button type="submit" class="btn-editar">Editar</button>
                    </form>
                    <form method="post" action="/entrevistador/excluir/1">
                        <button type="submit" class="btn-excluir">Excluir</button>
                    </form>
                </div>
            </article>
        @endfor
     @endif
    </div>
    </section>
`)
