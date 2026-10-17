class MessageFormatter {
    
    public String format (String message){
        return "[" + message + "]";
    }

    public String format (String message, int repeatCount){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < repeatCount; i++){
            if (i > 0){
                result.append(" ");
            }
            result.append(message);
        }

        return result.toString();
    }

    public String format (String message, String prefix){
        return prefix + ": " + message;
    }

    public String format (String message, String prefix, String suffix){
        return prefix + ": " + message + " (" + suffix + ")";
    }
    // TODO: Criar o método format que recebe apenas uma message
    // Deve retornar a message envolvida em colchetes: [message]
    
    // TODO: Criar o método format que recebe uma message e repeatCount
    // Deve retornar a message repetida repeatCount vezes, separada por espaços
    
    // TODO: Criar o método format que recebe uma message e prefix
    // Deve retornar: prefix: message
    
    // TODO: Criar o método format que recebe uma message, prefix, e suffix
    // Deve retornar: prefix: message (suffix)
    
}
