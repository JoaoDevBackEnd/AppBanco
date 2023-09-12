import java.util.Scanner;
public class Menu {

    //CLASSE CRIADA PARA CRIAR O MENU DO BANCO
    ListaCliente lista=new ListaCliente();
    Scanner read=new Scanner(System.in);

    // PRIMEIRA TELA DO MENU 
    public void MenuInicial(){
         System.out.println("\n 1 - Logar Como Cliente");
         System.out.println(" 2 - Logar como Banco");
         System.out.println(" 3 - Criar Conta \n");
         int x= read.nextInt();
         Switch_Menu_Inicial(x);
    }
    //SWITCH CASE DE LOGAR CLIENTE,LOGAR COMO BANCO OU CRIAR UMA CONTA  É CHAMADO A PARTIR DO METODO MenuInicial
    public void Switch_Menu_Inicial(int x){
        switch (x) {
            case 1: 
                System.out.println("\n Digite o Número da Conta");
                int id_user=read.nextInt();
                lista.encontra_cliente(id_user);
                break;
        
            case 2:
                break;

            case 3:
                MenuInicialCriarConta();
                MenuInicial();
                break;
        }
    }
    public void MenuInicialCriarConta(){
        System.out.println("Digite o ID");
        int x=read.nextInt();
        System.out.println("Digite o Nome");
        String y=read.next();
        System.out.println("Digite o Documento");
        String c=read.next();
        
        lista=new ListaCliente(x, y, c, 0f);
        System.out.println("\n Conta criada com SUCESSO");
    }

}

