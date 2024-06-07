import math


def calcular_distancia(ponto1, ponto2):
    x1, y1, z1 = ponto1
    x2, y2, z2 = ponto2
    distancia = math.sqrt((x2 - x1)**2 + (y2 - y1)**2 + (z2 - z1)**2)
    return distancia
