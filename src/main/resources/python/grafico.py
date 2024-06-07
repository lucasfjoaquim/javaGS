import matplotlib.pyplot as plt


def plotar_pontos_3d(pontos):
    """
    Plota pontos em um gráfico 3D.

    Parâmetros:
    pontos (list): Lista de tuplas representando os pontos (x, y, z).
    """
    fig = plt.figure()
    ax = fig.add_subplot(111, projection='3d')

    # Extrai as coordenadas x, y, z dos pontos
    x = [p[0] for p in pontos]
    y = [p[1] for p in pontos]
    z = [p[2] for p in pontos]

    # Plota os pontos
    ax.scatter(x, y, z, c='r', marker='o')

    # Configura os rótulos dos eixos
    ax.set_xlabel('Eixo X')
    ax.set_ylabel('Eixo Y')
    ax.set_zlabel('Eixo Z')

    plt.show()