import javax.swing.JOptionPane;

public class EntradaDado2 {

    public static void main(String args[])  {

        String nome;

        nome = JOptionPane.showInputDialog(null,
                                               "Digite seu nome",
                                         "Cadastro cliente",
                                      1);

        JOptionPane.showMessageDialog(null, "O usuario digitou: " + nome);






}

}