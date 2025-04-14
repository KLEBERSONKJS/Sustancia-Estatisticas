function createChart(canvasId, title, labels, data, tipo = 'pie', index = 0) {
    const ctx = document.getElementById(canvasId).getContext('2d');

    const baseColors = [
        '#36A2EB', '#FF6384', '#FFCE56', '#4BC0C0', '#9966FF',
        '#FF9F40', '#8AC24A', '#607D8B', '#E91E63', '#9C27B0'
    ];
    const rotatedColors = [...baseColors.slice(index % baseColors.length), ...baseColors.slice(0, index % baseColors.length)];

    const optionsBase = {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
            title: {
                display: !!title,
                text: title,
                font: {
                    size: 16,
                    weight: 'bold'
                },
                padding: {
                    top: 10,
                    bottom: 10
                }
            },
            legend: {
                display: true,
                labels: {
                    font: {
                        size: 12
                    }
                }
            },
            tooltip: {
                callbacks: {
                    label: function (context) {
                        const total = context.dataset.data.reduce((a, b) => a + b, 0);
                        const percentage = total > 0 ? Math.round(context.raw * 100 / total) : 0;
                        return tipo === 'pie' || tipo === 'doughnut'
                            ? `${context.label}: ${context.raw} (${percentage}%)`
                            : `${context.label}: ${context.raw}`;
                    }
                }
            }
        },
        layout: {
            padding: 10
        }
    };

    // Adiciona escalas só se for gráfico de barra
    if (tipo === 'bar') {
        optionsBase.scales = {
            x: {
                ticks: {
                    font: { size: 10 },
                    maxRotation: 30,
                    minRotation: 0
                }
            },
            y: {
                beginAtZero: true,
                ticks: {
                    font: { size: 10 }
                }
            }
        };
    }

    new Chart(ctx, {
        type: tipo,
        data: {
            labels: labels,
            datasets: [{
                data: data,
                backgroundColor: rotatedColors,
                hoverOffset: 20,
                label: title
            }]
        },
        options: optionsBase
    });
}
