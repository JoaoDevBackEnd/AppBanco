import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ListaCliente {
    Random random=new Random();
     private int cliente_conta;
     private String nome_conta;
     private String doc_conta;
     private float saldo;
      //Criação de uma Array para cadastrar todos os clientes e armazenar na Array
    public List<CadastroCliente> listacliente=new ArrayList<CadastroCliente>();


    //Para chamar a Classe pode ser atráves de um Construtor vazio para chamar os Metodos
    public ListaCliente(){

         listacliente.add(new CadastroCliente(1700, "kaun Gabriel", "17012205581", 7840.0f));
        listacliente.add(new CadastroCliente(1100, "Joao Victor de Souza", "11947742201", 1140.0f));
         
       
    }
    // Construtor Para cadastrar novos clientes Dentro da array
    public void cadastrarCliente(int num_conta, String nome,String doc,float saldo){
       this.listacliente=new ArrayList<>();
       listacliente.add(new CadastroCliente(num_conta,nome,doc,saldo)); 
    }
    //Metodo Para vascular a Array e afim de encontrar um valor 
    public void encontra_cliente(int num_conta){
        boolean encontrado=false;
        for(CadastroCliente c:listacliente){
            if(c.get_numConta()==num_conta){
                System.out.println("\n LOGADO COM SUCESSO");
                cliente_conta=c.get_numConta();
                nome_conta=c.get_nome();
                doc_conta=c.get_doc();
                saldo=c.get_saldo();
                encontrado=true;
                break;
            }
            if(!encontrado){
                System.out.println("Cliente não encontrado !");
            }           
        }
                 
    }
    public int GeradorNumConta(){  
        int y;
        boolean unico;
    
        do {
            y = random.nextInt(1000, 9999);
            unico = true;
    
            for (CadastroCliente c : listacliente) {
                if (y == c.get_numConta()) {
                    unico = false;
                    break; // Saia do loop se encontrar um número duplicado.
                }
            }
            System.out.println("Número gerado: " + y); // Adicione esta linha para verificar os números gerados.

        } while (!unico);
    
        return y;
    }

    public int get_conta_login(){
      return cliente_conta;
    }
    public String get_nome_login(){
        return nome_conta;
    }
    public String get_doc_login(){
        return doc_conta;
    }
    public float get_saldo_login(){
        return saldo;
    }
    
}
