from pointoptimizer import gerar_pontos_otimizados
from grafico import plotar_pontos_3d
from vetoresdemovimento import plotar_vetores_movimento


canto1_A = (0, 0, 0)
canto2_A = (1000, 1000, 1000)
canto1_B = (2000, 2000, 2000)
canto2_B = (4000, 4000, 4000)
n = 100


pontos_A = gerar_pontos_otimizados(canto1_A, canto2_A, n)
pontos_B = gerar_pontos_otimizados(canto1_B, canto2_B, n)
print(f"Pontos A: {pontos_A}")
print(f"Pontos B: {pontos_B}")

plotar_vetores_movimento(pontos_A, pontos_B)