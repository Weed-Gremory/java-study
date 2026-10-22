// TODO: Faça esta classe implementar a interface Cloneable
class Document implements Cloneable{

    private String title;
    private String author;
    private int version;

    public Document (String receivedTitle, String receivedAuthor, int receivedVersion){
        title = receivedTitle;
        author = receivedAuthor;
        version = receivedVersion;
    }

    public String getTitle (){
        return title;
    }

    public String getAuthor (){
        return author;
    }

    public int getVersion (){
        return version;
    }

    public void setVersion (int receivedVersion){
        version = receivedVersion;
    }

    @Override
    public Document clone (){
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString (){
        return String.format("Document[title=%s, author=%s, version=%d]", title, author, version);
    }
    // TODO: Declare os campos privados: title (String), author (String), version (int)
    
    // TODO: Crie um construtor que inicialize todos os três campos
    
    // TODO: Crie métodos getter para title, author e version
    
    // TODO: Crie o método setVersion(int version) para atualizar a versão
    
    // TODO: Sobrescreva o método clone()
    // - O tipo de retorno deve ser Document
    // - Chame super.clone() e faça o cast para Document
    // - Trate CloneNotSupportedException envolvendo-a em uma RuntimeException
    
    // TODO: Sobrescreva toString() para retornar:
    // Document[title=X, author=Y, version=Z]
    
}