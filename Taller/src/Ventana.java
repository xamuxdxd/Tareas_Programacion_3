import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Ventana {
    private JPanel principal;
    private JComboBox cboNombrePeli;
    private JTextField txtCedula;
    private JSpinner spiNumEntradas;
    private JButton btnCompra;
    private JLabel lblPelicula;
    private JLabel lblDatosPeli;
    private JLabel lblCedula;
    private JLabel lblEntrada;
    private JTextArea txtFactura;
    private JButton btnInformacion;
    private JTextArea txtNaruto;
    private JTextArea txtPiratas;
    private JTextArea txtAntman;


    Stack<Cliente> clientes = new Stack<>();

    Naruto naruto = new Naruto();
    Piratas piratas = new Piratas();
    Antman antman = new Antman();

    public Ventana() {
        spiNumEntradas.setModel(new SpinnerNumberModel(1, 1, 5, 1));

        btnCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pelicula = cboNombrePeli.getSelectedItem().toString();
                String cedula = txtCedula.getText();
                int entradas = Integer.parseInt(spiNumEntradas.getValue().toString());

                if(compararCedulas(cedula)){
                    clientes.push(new Cliente(cedula,entradas,pelicula));
                    if (pelicula.contains("Naruto")){
                        try {
                            naruto.agregarCliente(clientes.peek());
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }
                    if (pelicula.contains("Piratas")){
                        try {
                            piratas.agregarCliente(clientes.peek());
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }
                    if (pelicula.contains("Antman")){
                        try {
                            antman.agregarCliente(clientes.peek());
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }

                    txtFactura.setText(clientes.peek().toString());

                }else{
                    JOptionPane.showMessageDialog(null, "La cédula ingresada ya fue utilizada");
                }



            }
        });



        cboNombrePeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cboNombrePeli.getSelectedItem().equals("Naruto")){
                    lblDatosPeli.setText("Precio 5 dolares");
                }else if(cboNombrePeli.getSelectedItem().equals("Piratas")){
                    lblDatosPeli.setText("Precio 5 dolares");
                }else if(cboNombrePeli.getSelectedItem().equals("Antman")){
                    lblDatosPeli.setText("Precio 5 dolares");
                }
            }
        });
        btnInformacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNaruto.setText(naruto.toString());
                txtPiratas.setText(piratas.toString());
                txtAntman.setText(antman.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public boolean compararCedulas(String id){
        for(Cliente c: clientes){
            if(id.contains(c.getCedula())){
                return false;
            }
        }
        return true;
    }


}
