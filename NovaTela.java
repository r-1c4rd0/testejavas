 import javax.swing.*;  
public class NovaTela extends JPanel{  
  
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
    JPanel TelaPanel;  
    JLabel idNome, idEnd, idCidade, idEstado, idCEP, idEmail, idDadosPag, idNomeTit, idNrCard, idCodSeg, idValidCard;  
    JTextField Nome, Endereço, Cidade, Estado, CEP, Email, DadosPag, NomeTitular, NrCard, CodSeg, ValidCard;  
      
    public NovaTela  ()  
    {  
         setLayout (null);  
          
         idNome = new JLabel("Nome Completo:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idNome.setBounds(15,20,300,20);  
         add(idNome);  
         Nome = new JTextField();  
         Nome.setBounds(110,20,300,20); // 1º posicao do text field ->  
         add(Nome);  
           
         idEnd= new JLabel("Endereço:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idEnd.setBounds(15,50,70,20);  
         add(idEnd);  
         Endereço = new JTextField();  
         Endereço.setBounds(80,50,300,20);  
         add(Endereço);  
           
         idCidade = new JLabel("Cidade:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idCidade.setBounds(15,80,70,20);//coordenada de 2, coordenada de y, larguar e altura  
         add(idCidade);  
         Cidade = new JTextField();  
         Cidade.setBounds(65,80,350,20);  
         add(Cidade);  
           
         idEstado = new JLabel("Estado:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idEstado.setBounds(15,110,70,20);  
         add(idEstado);  
         Estado = new JTextField();  
         Estado.setBounds(60,110,23,20);  
         add(Estado);  
           
         idCEP = new JLabel("CEP:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idCEP.setBounds(15,140,70,20);  
         add(idCEP);  
         CEP = new JTextField();  
         CEP.setBounds(45,140,200,20);  
         add(CEP);  
           
         idEmail = new JLabel("Email:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idEmail.setBounds(15,170,70,20);  
         add(idEmail);  
         Email = new JTextField();  
         Email.setBounds(55,170,340,20);  
         add(Email);  
           
         idDadosPag = new JLabel("DADOS DO PAGAMENTO COM CARTAO"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idDadosPag.setBounds(15,200,300,20);  
         add(idDadosPag);  
           
         idNomeTit = new JLabel("Nome do titular como no cartão:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idNomeTit.setBounds(15,230,300,20);  
         add(idNomeTit);  
         NomeTitular = new JTextField();  
         NomeTitular.setBounds(200,230,320,20);  
         add(NomeTitular);  
           
         idNrCard = new JLabel("Número do cartão:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idNrCard.setBounds(15,260,250,20);  
         add(idNrCard);  
         NrCard = new JTextField();  
         NrCard.setBounds(123,260,170,20);// 3º tamanho dos campos  
         add(NrCard);  
           
         idCodSeg = new JLabel("Cód.Segurança:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idCodSeg.setBounds(15,290,250,20);  
         add(idCodSeg);  
         CodSeg = new JTextField();  
         CodSeg.setBounds(110,290,40,20);// 1º AJUSTA O FIELD -->  
         add(CodSeg);  
           
         idValidCard = new JLabel("Validade do cartão:"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
         idValidCard.setBounds(15,320,250,20);// 3º AJUSTA O NOME DO JLABEL -->  
         add(idValidCard);  
         ValidCard = new JTextField();  
         ValidCard.setBounds(125,320,60,20);  
         add(ValidCard);   
    }  
}  
  
  
  
import java.awt.BorderLayout;  
import java.awt.Container;  
  
import javax.swing.*;  
  
public class TelaPanel extends JFrame{  
      
      
      
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
    NovaTela mostraTela;  
  
    public TelaPanel(){ // ja havia sido declarada dentro da classe NOVA TELA  
        setTitle("Cadastro de cliente"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
        Container tela = getContentPane(); // verificar essa funcionalidade de container  
        mostraTela = new NovaTela(); // mostra tela eh um atributo da classe jah criada NOVA TELA    
        setSize(550,330);  
        tela.setLayout(new BorderLayout());  
        tela.add(mostraTela,BorderLayout.CENTER);  
    }  
      
    @SuppressWarnings("deprecation"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">  
    public static void main(String args[])  
    {  
            new TelaPanel().show();  
            }  
  
  
import javax.swing.*;  
import java.awt.*;  
  
  
public class BotaoPanel extends JPanel{  
      
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
    private JButton EnviarPag;  
      
    public BotaoPanel ( NovaTela a)  
    {  
        setLayout(new GridLayout(1,5));  
          
        EnviarPag = new JButton("Enviar para pagagmento"<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
        add(EnviarPag);  
          
    }  
      
  
} 