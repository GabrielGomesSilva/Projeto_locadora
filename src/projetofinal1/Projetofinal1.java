/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal1;

 import java.util.Scanner;
    import java.util.ArrayList;
    import java.util.Date;
    import javax.swing.JOptionPane;
public class Projetofinal1 {


    public static void main(String[] args) {
    ArrayList Cliente = new ArrayList(20);
       ArrayList<Cliente> clientesnovos = new ArrayList(20);
       ArrayList<Cliente> clientealugando = new ArrayList();
       ArrayList<carro> Carrosalugando = new ArrayList();
       ArrayList<carro> carrosDisponiveis = new ArrayList();
        carro fiat = new carro();
            fiat.setKm(50000);
            fiat.setNome("Fiat");
            fiat.setCor("prata");
            fiat.setMotor(1.0);
            fiat.setTipo("Totalflex");
            for(int i=0;i <= 7;i++){ 
            carrosDisponiveis.add(fiat);
            }
            carro hyundai = new carro();
            hyundai.setKm(40000);
            hyundai.setNome("hyundai");
            hyundai.setCor("branco");
            hyundai.setMotor(1.6);
            hyundai.setTipo("Totalflex");
            carrosDisponiveis.add(hyundai);
            carrosDisponiveis.add(hyundai);
            
            carro Volkswagen = new carro();
            Volkswagen.setKm(55000);
            Volkswagen.setNome("Volkswagen");
            Volkswagen.setCor("preto");
            Volkswagen.setMotor(1.0);
            Volkswagen.setTipo("Gasolina");
            for(int b=0;b<=4;b++){
                carrosDisponiveis.add(Volkswagen);
            }
            carro Camaro = new carro();
            Camaro.setKm(7000);
            Camaro.setNome("GM Camaro");
            Camaro.setCor("amarelo");
            Camaro.setMotor(3.0);
            Camaro.setTipo("Totalflex");
            for (int y=0; y<=2; y++){
                carrosDisponiveis.add(Camaro);
            }
            carro fusion=new carro();
            fusion.setKm(15000);
            fusion.setNome("Ford fusion");
            fusion.setCor("preto");
            fusion.setMotor(2.0);
            fusion.setTipo("Totalflex");
            carrosDisponiveis.add(fusion);
            
            carro viper = new carro();
            viper.setKm(5000);
            viper.setNome("Dodge Viper");
            viper.setCor("azul");
            viper.setMotor(8.3);
            viper.setTipo("Gasolina");
            carrosDisponiveis.add(viper);
            
        
        ArrayList<carro> carros = new ArrayList();
            
            fiat.setKm(50000);
            fiat.setNome("Fiat");
            fiat.setCor("prata");
            fiat.setMotor(1.0);
            fiat.setTipo("Totalflex");
            for(int i=0;i <= 7;i++){ 
            carros.add(fiat);
            }
            
            hyundai.setKm(40000);
            hyundai.setNome("hyundai");
            hyundai.setCor("branco");
            hyundai.setMotor(1.6);
            hyundai.setTipo("Totalflex");
            carros.add(hyundai);
            carros.add(hyundai);
            
            
            Volkswagen.setKm(55000);
            Volkswagen.setNome("Volkswagen");
            Volkswagen.setCor("preto");
            Volkswagen.setMotor(1.0);
            Volkswagen.setTipo("Gasolina");
            for(int b=0;b<=4;b++){
                carros.add(Volkswagen);
            }
            
            Camaro.setKm(7000);
            Camaro.setNome("GM Camaro");
            Camaro.setCor("amarelo");
            Camaro.setMotor(3.0);
            Camaro.setTipo("Totalflex");
            for (int y=0; y<=2; y++){
                carros.add(Camaro);
            }
            
            fusion.setKm(15000);
            fusion.setNome("Ford fusion");
            fusion.setCor("preto");
            fusion.setMotor(2.0);
            fusion.setTipo("Totalflex");
            carros.add(fusion);
            
            
            viper.setKm(5000);
            viper.setNome("Dodge Viper");
            viper.setCor("azul");
            viper.setMotor(8.3);
            viper.setTipo("Gasolina");
            carros.add(viper);
        
    
    int menu;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("Bem Vindo! Favor selecionar uma das opções abaixo:" +"\n1-Cadastrar Cliente"+"\n2-Informações de Clientes e Carros:"+"\n3-Devolver carro"+"\n4-Sair"));
           
           switch (menu) {
               case 1:
                   
                   if (menu == 1){
                       ArrayList<Cliente> clientes = new ArrayList(20);
                       
                       System.out.println("Digite o nome do cliente:");
                       Scanner sc = new Scanner(System.in);
                       String nome = sc.nextLine();
                       Cliente cliente = new Cliente();
                       cliente.setNome(nome);
                       
                       System.out.println();
                       System.out.println("Endereço:");
                       
                       String endereco = sc.nextLine();
                       cliente.setEndereco(endereco);
                       
                       System.out.println();
                       System.out.println("Telefone:");
                       
                       String telefone = sc.next();
                       cliente.setTelefone(telefone);
                       
                       System.out.println();
                       System.out.println("Idade:");
                       
                       int idade = sc.nextInt();
                       cliente.setIdade(idade);
                       
                       if (idade < 18) {
                           System.out.println("Você não tem idade para dirigir!");
                           break;
                       } else {
                           System.out.println("Cliente permitido a dirigir!");
                           
                       }
                       
                       System.out.println("Registro Geral: ");
                       
                       float RG = sc.nextFloat();
                       cliente.setRG(RG);
                       
                       System.out.println("CPF:");
                       
                       float CPF = sc.nextFloat();
                       cliente.setCPF(CPF);
                       
                       System.out.println("Deseja alugar um carro?");
                       System.out.println("1-Sim");
                       System.out.println("2-Não");
                       
                       Scanner Opcao3 = new Scanner(System.in);
                       int d = Opcao3.nextInt();
                       Cliente.add(cliente);
                       
                       if (d==1){
                           
                                                     
                           clientealugando.add(cliente);
                           
                           for(int i=0; i<carrosDisponiveis.size(); i++){
                                   System.out.println( +i+"-"+carrosDisponiveis.get(i).toString());
                                       
                                   }
                                   
                                   Scanner opcao = new Scanner(System.in);
                                   int resposta = opcao.nextInt();
                                   carrosDisponiveis.remove(resposta);
                                   Carrosalugando.add(carrosDisponiveis.get(resposta));
                                   cliente.setCarroalugado(carrosDisponiveis.get(resposta));
                                   
                           
                       }
                       
                       
                       System.out.println();
                       Date dataalug = new Date();
                       System.out.println("Data Aluguel: "+dataalug);
                       System.out.println();
                       
                       
                       
                       
                       System.out.println("");
                   }
               case 2:
                   if (menu == 2) {
                       int menu2;
                       menu2 = Integer.parseInt(JOptionPane.showInputDialog("1-Carros da locadora:"+"\n2-Carros Alugados:"+"\n3-Todos os Clientes:"+"\n4-Clientes Alugando:"));
                       
                       
                       if (menu2 == 1){
                           for(int i=0; i<carros.size(); i++){
                               System.out.println(carros.get(i).toString());
                               
                               
                           }
                           
                           
                       }else if (menu2 == 2){
                           for(int i=0; i<Carrosalugando.size(); i++){
                               System.out.println(Carrosalugando.get(i).toString());
                           }
                       }else if (menu2 == 3){
                           for(int i=0; i<Cliente.size(); i++){
                               System.out.println(Cliente.get(i).toString());   
                           }
                       }else if (menu2 == 4){
                           for(int i=0; i<clientealugando.size(); i++){
                               System.out.println(clientealugando.get(i).toString());
                           }
                           
                       }else{
                           
                           System.out.println("Comando invalido!");
                           break;
                       }
                   }
               case 3:
                   if (menu == 3) {
                       System.out.println("Deseja devolver o carro? ");
                       System.out.println("1-Sim");
                       System.out.println("2-Não");
                       Scanner Opcao2 = new Scanner(System.in);
                       int c = Opcao2.nextInt();
                       Date datadev = new Date();
                       switch (c) {
                           case 1:
                               if (c == 1){
                               if (Carrosalugando.size()==0) {
                                   System.out.println("Comando invalido!");
                                   System.out.println("Para devolver um carro precisa-se cadastrar um primeiro.");
                                   break ;
                               } 
                               if (Carrosalugando.size()!=0){
                                   System.out.println("Qual carro deseja devolver?");
                                   
                                   for(int i=0; i<Carrosalugando.size(); i++){
                                   System.out.println( +i+"-"+Carrosalugando.get(i).toString());
                                       
                                   }
                                   
                                   Scanner opcao = new Scanner(System.in);
                                   int g = opcao.nextInt();
                                   System.out.println("Data Devolução"+datadev);
                                   Carrosalugando.remove(g);
                                   
                           
                                   }
                           
                           
                               }  
                           case 2:
                               if (c ==2){
                               System.out.println("Continuar contagem de dias!");
                               break;
                       }
                           case 3:
                               if (c>2){
                               System.out.println("Comando invalido!");
                               break;
                               }
                       }
                   }
               case 4:
                   if (menu == 4) {
                       JOptionPane.showInputDialog("Obrigado e volte sempre!");
                       System.exit(menu);
                       break;
                       
                       
                       
                   }
           }
        }while (menu != 20);
    }        
}
    

    

