window.addEventListener('DOMContentLoaded', () => {
    const msg = document.getElementById('msg');
    if (msg) {
        setTimeout(() => {
            msg.style.opacity = '0';
            setTimeout(() => {
                msg.style.display = 'none';
            }, 500); // tempo do fade
        }, 4000); // tempo até desaparecer (4s)
    }
});