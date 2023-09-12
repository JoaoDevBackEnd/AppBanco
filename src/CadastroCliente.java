public class CadastroCliente {
    int num_conta;
    String nome;
    String doc;
    float saldo;

    //CONSTRUTOR 
    public CadastroCliente(int num_conta,String nome,String doc,float saldo){
        this.num_conta=num_conta;
        this.nome=nome;
        this.doc=doc;
        this.saldo=saldo;
    }

    // Metodos GET para retornar os valores, caso for chamado!
    public int get_numConta(){
        return num_conta;
    }
    public String get_nome(){
        return nome;
    }
    public String get_doc(){
        return doc;
    }
    public float get_saldo(){
        return saldo;
    }
}
