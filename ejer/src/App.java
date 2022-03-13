import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int Numero;

        Numero = Integer.parseInt(JOptionPane.showInputDialog( "Diguite un numero"));

        while(Numero !=0){
            if(Numero %2==0){
                System.out.println("El  Numero-->"+Numero+"es PAR");


            }
            else{
                System.out.println("El numero-->"+Numero+"es IMPAR");
            }
            Numero = Integer.parseInt(JOptionPane.showInputDialog( "Diguite otro numero"));

        }
        
    }
}
