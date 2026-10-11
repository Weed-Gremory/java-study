import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        System.out.printf("Config loaded: %b\n", GameConfig.isConfigLoaded());
        System.out.printf("Max level: %d\n", GameConfig.getMaxLevel());
        System.out.printf("Level %d threshold: %d\n", level, GameConfig.getThreshold(level));
        System.out.printf("Level 1 threshold: %d", GameConfig.getThreshold(1));

        scanner.close();

        // TODO: Acesse GameConfig para demonstrar a execução do bloco estático
        // Os blocos estáticos em GameConfig serão executados automaticamente quando você acessar a classe pela primeira vez
        
        // TODO: Imprima se a configuração está carregada
        // Formato: "Config loaded: true" ou "Config loaded: false"
        
        // TODO: Imprima o nível máximo
        // Formato: "Max level: [maxLevel]"
        
        // TODO: Imprima o limite (threshold) para o nível de entrada
        // Formato: "Level [level] threshold: [threshold]"
        
        // TODO: Imprima o limite (threshold) para o nível 1
        // Formato: "Level 1 threshold: [threshold]"
    }
}
