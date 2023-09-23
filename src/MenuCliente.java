import java.util.Scanner;
public class MenuCliente {
    Scanner read =new Scanner(System.in);
    ListaCliente listaCliente;

    public MenuCliente(ListaCliente listaCliente) {
        this.listaCliente = listaCliente;
    }

    public void Login(){

        System.out.println("\n Digite o Número da Conta");
        int id_user=read.nextInt();

        listaCliente.encontra_cliente(id_user);

         int num_conta=listaCliente.get_conta_login();
         String nome=listaCliente.get_nome_login();
         String doc=listaCliente.get_doc_login();
         float saldo=listaCliente.get_saldo_login();
        System.out.println("Numero da conta: "+num_conta);
        System.out.println("Nome do Cliente: "+nome);
        System.out.println("Documento cliente: "+doc);
        System.out.println("SALDO: "+saldo);

        System.out.println("\n 1- ADICIONAR DINEHIRO");
        int id_user1=read.nextInt();
        if(id_user1==1){
            System.out.println("\n 1- DIGITE A QUANTIDADE DE DINHEIRO");
            float id_user2=read.nextFloat();
            saldo=Depositar_Dinheiro(saldo,id_user2);
            System.out.println("Numero da conta: "+num_conta);
             System.out.println("Nome do Cliente: "+nome);
             System.out.println("Documento cliente: "+doc);
             System.out.println("SALDO: "+saldo);
            
        }
    }    
    public float Depositar_Dinheiro(float atual,float valor){

        return atual=atual+valor;
    }
    public float Sacar_dinheiro(float atual, float valor){
        return atual=atual-valor;
    }
    public float Tranfer_Dinheiro(float atual,float valor , int touser){
      return -0  ;
    }
}
