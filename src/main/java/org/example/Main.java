package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe Ponto
class Ponto {
    private double x;
    private double y;
    private double z;

    public Ponto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}

// Classe Area
class Area {
    private Ponto canto1;
    private Ponto canto2;

    public Area(Ponto canto1, Ponto canto2) {
        this.canto1 = canto1;
        this.canto2 = canto2;
    }

    public Ponto getCanto1() {
        return canto1;
    }

    public void setCanto1(Ponto canto1) {
        this.canto1 = canto1;
    }

    public Ponto getCanto2() {
        return canto2;
    }

    public void setCanto2(Ponto canto2) {
        this.canto2 = canto2;
    }
}

// Classe Sensor (herda de Ponto)
class Sensor extends Ponto {
    private int id;
    private String status;

    public Sensor(int id, double x, double y, double z, String status) {
        super(x, y, z);
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// Classe GerenciadorSensores
class GerenciadorSensores {
    private List<Sensor> listaSensores;

    public GerenciadorSensores() {
        listaSensores = new ArrayList<>();
    }

    public void adicionarSensor(Sensor sensor) {
        listaSensores.add(sensor);
    }


    public void plotarVetoresMovimento(List<Ponto> pontosA, List<Ponto> pontosB) {
        PythonExecutor.Exec();
        System.out.println("Plotando vetores de movimento entre os pontos A e B...");
        // Código de plotagem de vetores aqui
    }

    public void analisarDados() {
        // Implementação da análise de dados
        System.out.println("Analisando dados dos sensores...");
        // Código de análise de dados aqui
    }

    public void exibirSensores() {
        for (Sensor sensor : listaSensores) {
            System.out.println("ID: " + sensor.getId() + ", Status: " + sensor.getStatus() +
                    ", Coordenadas: (" + sensor.getX() + ", " + sensor.getY() + ", " + sensor.getZ() + ")");
        }
    }
}

// Classe Principal para Interação com o Usuário
public class Main {
    public static void main(String[] args) {
        GerenciadorSensores gerenciador = new GerenciadorSensores();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Gerenciamento de Sensores:");
            System.out.println("1. Adicionar Sensor");
            System.out.println("2. Exibir Sensores");
            System.out.println("3. Plotar Vetores de Movimento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do Sensor: ");
                    int id = scanner.nextInt();
                    System.out.print("Digite a coordenada X: ");
                    double x = scanner.nextDouble();
                    System.out.print("Digite a coordenada Y: ");
                    double y = scanner.nextDouble();
                    System.out.print("Digite a coordenada Z: ");
                    double z = scanner.nextDouble();
                    scanner.nextLine();  // Consome a nova linha
                    System.out.print("Digite o status do Sensor: ");
                    String status = scanner.nextLine();
                    Sensor sensor = new Sensor(id, x, y, z, status);
                    gerenciador.adicionarSensor(sensor);
                    System.out.println("Sensor adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de Sensores:");
                    gerenciador.exibirSensores();
                    break;


                case 3:
                    // Exemplos de pontos para a plotagem de vetores
                    List<Ponto> pontosA = new ArrayList<>();
                    List<Ponto> pontosB = new ArrayList<>();
                    pontosA.add(new Ponto(0, 0, 0));
                    pontosB.add(new Ponto(5, 5, 5));
                    gerenciador.plotarVetoresMovimento(pontosA, pontosB);
                    break;

                case 4:
                    gerenciador.analisarDados();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}