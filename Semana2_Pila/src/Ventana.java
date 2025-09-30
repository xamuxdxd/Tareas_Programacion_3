import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtCodigo;
    private JTextField txtTitulo;
    private JTextArea txtMensaje;
    private JButton btnRegistrar;
    private JTextArea txtListar;

    Pila pila = new Pila();//crea un objeto q almacena todas las txt

    public Ventana() {
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo= Integer.parseInt(txtCodigo.getText()); //tranformacion a int de string( Integer.parseInt() )
                String titulo= txtTitulo.getText();
                String mensaje= txtMensaje.getText();
                Publicaciones p = new Publicaciones(codigo,titulo,mensaje); //crea un objeto y ya no existe el anterior
                pila.push(p);
                /*----------------------------------------------------
                Pila pila = new Pila();
                pila.push(p);// solo puedes agregar un objeto en la pila
                -------------------------------------------------------*/

                txtListar.setText(pila.toString());
            }
        });
    }
    //fuera del contructor

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}