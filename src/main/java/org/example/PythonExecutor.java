package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PythonExecutor {
    public static void Exec() {
        // Defina o caminho para o script Python
        String scriptPath = "C:\\Users\\Lucas\\IdeaProjects\\javaGS\\src\\main\\resources\\python\\app.py";

        // Defina os parâmetros


        // Crie a lista de comandos
        List<String> command = new ArrayList<>();
        command.add("python"); // ou "python3" dependendo da sua instalação
        command.add(scriptPath);


        // Execute o comando
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.redirectErrorStream(true);

        try {
            Process process = processBuilder.start();

            // Leia a saída do script Python
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Espere o processo terminar
            int exitCode = process.waitFor();
            System.out.println("Exited with code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
