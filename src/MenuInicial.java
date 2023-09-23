import java.util.Scanner;

public class MenuInicial {

    int x;
    //CLASSE CRIADA PARA CRIAR O MENU DO BANCO
    ListaCliente lista=new ListaCliente();
    Scanner read=new Scanner(System.in);

    // PRIMEIRA TELA DO MENU 
    public void MenuInicial(){
        MenuCliente menuCliente = new MenuCliente(lista);
         System.out.println("\n 1 - Logar Como Cliente");
         System.out.println(" 2 - Logar como Banco");
         System.out.println(" 3 - Criar Conta \n");
         int x= read.nextInt();
           switch (x) {
            case 1:               
                menuCliente.Login();
                break;
        
            case 2:
                break;

            case 3:
                MenuInicialCriarConta();
                MenuInicial();
                break;
        }
    }
    //SWITCH CASE DE LOGAR CLIENTE,LOGAR COMO BANCO OU CRIAR UMA CONTA  É CHAMADO A PARTIR DO METODO MenuInicial
    public void MenuInicialCriarConta(){
      
            System.out.println("Digite o Nome");
            String y = read.next();
            System.out.println("Digite o Documento");
            String c = read.next();
            int x = lista.GeradorNumConta();
        
            // Cria uma nova conta e adiciona à lista
            lista.cadastrarCliente(x, y, c, 0f);
        
            System.out.println("\nConta de Número: " + x + " Criada com SUCESSO");
        }
        
    }



