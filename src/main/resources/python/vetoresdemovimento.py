import matplotlib.pyplot as plt

def plotar_vetores_movimento(pontos_A, pontos_B):
    """
    Plota os vetores de movimento de pontos de A para B em um gráfico 3D.

    Parâmetros:
    pontos_A (list): Lista de tuplas representando os pontos iniciais (x, y, z).
    pontos_B (list): Lista de tuplas representando os pontos finais (x, y, z).
    """
    fig = plt.figure()
    ax = fig.add_subplot(111, projection='3d')

    # Extrai as coordenadas x, y, z dos pontos iniciais e finais
    xA, yA, zA = zip(*pontos_A)
    xB, yB, zB = zip(*pontos_B)

    # Plota os pontos iniciais
    ax.scatter(xA, yA, zA, c='r', marker='o', label='Pontos A')

    # Plota os pontos finais
    ax.scatter(xB, yB, zB, c='b', marker='^', label='Pontos B')

    # Plota os vetores de movimento
    for i in range(len(pontos_A)):
        ax.quiver(xA[i], yA[i], zA[i], xB[i]-xA[i], yB[i]-yA[i], zB[i]-zA[i], color='g')

    # Configura os rótulos dos eixos
    ax.set_xlabel('Eixo X')
    ax.set_ylabel('Eixo Y')
    ax.set_zlabel('Eixo Z')

    # Adiciona uma legenda
    ax.legend()

    plt.show()