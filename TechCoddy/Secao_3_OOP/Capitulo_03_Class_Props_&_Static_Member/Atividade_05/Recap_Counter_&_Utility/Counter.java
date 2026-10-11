class Counter {

    private static int totalCount;
    private int id;

    public Counter (int count){
        id = count;
        totalCount++;
    }

    public int getId (){
        return id;
    }

    public static int getTotalCount (){
        return totalCount;
    }


    // TODO: Crie uma variável estática privada para rastrear o total de instâncias
    
    // TODO: Crie uma variável de instância privada 'id' para um identificador único
    
    // TODO: Crie um construtor que:
    // - Incremente a contagem total
    // - Atribua a contagem atual como o id desta instância
    
    // TODO: Crie um método getId() que retorne o id único deste contador
    
    // TODO: Crie um método estático getTotalCount() que retorne o total de objetos Counter criados
}
