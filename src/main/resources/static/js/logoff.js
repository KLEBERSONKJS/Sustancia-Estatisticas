document.addEventListener('DOMContentLoaded', function() {
    const btn_sair = document.getElementById('btn_sair');

    btn_sair.addEventListener('click', function() {

        if(confirm('Tem certeza que deseja desconectar?'))
            //lugar de limpar dados como token e dados

            window.location.href = 'auth';
    })
})