class GameConfig {

    private static int[] levelThresholds;
    private static int maxLevel;
    private static boolean configLoaded;

    // TODO: Declarar o array estático privado levelThresholds (int[])
    
    // TODO: Declarar a variável estática privada maxLevel (int)
    
    // TODO: Declarar a variável estática privada configLoaded (boolean)
    
    // TODO: Primeiro bloco estático
    // - Inicializar maxLevel como 5
    // - Imprimir "Initializing game configuration..."
    static {
        maxLevel = 5;
        System.out.println("Initializing game configuration...");
    }
    
    // TODO: Segundo bloco estático
    // - Criar o array levelThresholds com tamanho igual a maxLevel
    // - Preenchê-lo para que cada nível exija level * 100 pontos
    //   (nível 1 precisa de 100, nível 2 precisa de 200, etc.)
    // - Definir configLoaded como true
    static {
        levelThresholds = new int[maxLevel];

        for (int i = 0; i < maxLevel; i++){
            levelThresholds[i] = (i + 1) * 100;
        }
        
        configLoaded = true;
    }
    
    // TODO: Implementar o método getThreshold(int level)
    // Retorna o limite de pontuação para esse nível (níveis começam em 1)
    public static int getThreshold(int level) {
        return levelThresholds[level - 1]; // Substituir pela implementação correta
    }
    
    // TODO: Implementar o método getMaxLevel()
    // Retorna o nível máximo
    public static int getMaxLevel() {
        return maxLevel; // Substituir pela implementação correta
    }
    
    // TODO: Implementar o método isConfigLoaded()
    // Retorna se a configuração foi carregada
    public static boolean isConfigLoaded() {
        return configLoaded; // Substituir pela implementação correta
    }
}
