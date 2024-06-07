import numpy as np


def gerar_pontos_otimizados(canto1, canto2, n):
    x1, y1, z1 = canto1
    x2, y2, z2 = canto2

    # Calcula o número de pontos em cada dimensão
    num_pontos_por_dimensao = int(round(n ** (1 / 3)))

    # Cria uma grade regular de pontos
    x = np.linspace(x1, x2, num_pontos_por_dimensao)
    y = np.linspace(y1, y2, num_pontos_por_dimensao)
    z = np.linspace(z1, z2, num_pontos_por_dimensao)

    # Gera todas as combinações de pontos na grade
    pontos = [(xi, yi, zi) for xi in x for yi in y for zi in z]

    # Se o número de pontos gerados for maior que n, corta a lista
    if len(pontos) > n:
        pontos = pontos[:n]

    return pontos