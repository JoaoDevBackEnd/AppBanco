import java.util.ArrayList;
import java.util.List;
public class ListaCliente {
      //Criação de uma Array para cadastrar todos os clientes e armazenar na Array
    public List<CadastroCliente> listacliente=new ArrayList<CadastroCliente>();


    //Para chamar a Classe pode ser atráves de um Construtor vazio para chamar os Metodos
    public ListaCliente(){

    }
    // Construtor Para cadastrar novos clientes Dentro da array
    public ListaCliente(int num_conta, String nome,String doc,float saldo){
        listacliente.add(new CadastroCliente(1700, "kaun Gabriel", "17012205581", 7840.0f));
        listacliente.add(new CadastroCliente(1100, "Joao Victor de Souza", "11947742201", 1140.0f));
        listacliente.add(new CadastroCliente(num_conta,nome,doc,saldo));
    }

    //Metodo Para vascular a Array e afim de encontrar um valor 
    public void encontra_cliente(int num_conta){
       boolean encontrado=false;
        for(CadastroCliente c:listacliente){
            if(c.get_numConta()==num_conta){
                System.out.println("\n LOGADO COM SUCESSO");
                System.out.println("Número de Conta: " + c.get_numConta());
                System.out.println("Nome: " + c.get_nome());
                System.out.println("Documento: " + c.get_doc());
                System.out.println("Saldo: R$ " + c.get_saldo());
                encontrado=true;
                break;
            }
            if(!encontrado){
                System.out.println("Cliente não encontrado !");
            }           
            }
            
        }
        
}
