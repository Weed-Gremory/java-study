class TextProcessor{
    
    private StringTransformer st1;

    public TextProcessor (StringTransformer recievedST1){
        st1 = recievedST1;
    }

    public String process (String text){
        return st1.transform(text);
    }
}

// TODO: Criar uma classe chamada TextProcessor
// TODO: Adicionar um campo para conter um StringTransformer
// TODO: Criar um construtor que recebe um StringTransformer e inicializa o campo
// TODO: Criar um método chamado process(String text) que:
//       - aplica o transformador ao texto
//       - retorna o resultado transformado
