function createPieChart(canvasId, title, labels, data, index = 0) {
    const ctx = document.getElementById(canvasId).getContext('2d');
    
    // Cores base para os gráficos (rotaciona com base no índice)
    const baseColors = [
        '#36A2EB', '#FF6384', '#FFCE56', '#4BC0C0', '#9966FF',
        '#FF9F40', '#8AC24A', '#607D8B', '#E91E63', '#9C27B0'
    ];
    
    // Rotaciona as cores para gráficos diferentes
    const rotatedColors = [...baseColors.slice(index % baseColors.length), ...baseColors.slice(0, index % baseColors.length)];
    
    new Chart(ctx, {
        type: 'pie',
        data: {
            labels: labels,
            datasets: [{
                data: data,
                backgroundColor: rotatedColors,
                hoverOffset: 20
            }]
        },
        options: {
            responsive: true,
            plugins: {
                title: {
                    display: true,
                    text: title,
                    font: {
                        size: 18,
                        weight: 'bold'
                    },
                    padding: {
                        top: 10,
                        bottom: 20
                    }
                },
                tooltip: {
                    callbacks: {
                        label: function(context) {
                            const total = context.dataset.data.reduce((a, b) => a + b, 0);
                            const percentage = total > 0 ? Math.round(context.raw * 100 / total) : 0;
                            return `${context.label}: ${context.raw} (${percentage}%)`;
                        }
                    }
                }
            }
        }
    });
}