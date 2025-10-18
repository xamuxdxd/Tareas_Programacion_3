import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ventana {
    private JPanel principal;
    private JButton btnRegistar;
    private JTextArea txtListar;
    private JButton btnAtender;
    private JSpinner spiPrioridad;
    private JTextField txtNombre;
    private JComboBox cboEnfermedad;
    private JLabel lblNombre;
    private JLabel lblPrioridad;
    private JLabel lblEmfermedad;

    Clinica lista = new Clinica();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {
        btnRegistar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p = Integer.parseInt(spiPrioridad.getValue().toString());
                String nombre = txtNombre.getText();
                String enfermedad = cboEnfermedad.getSelectedItem().toString();
                Paciente enfermo= new Paciente(p,nombre,enfermedad);
                //---------------------------------------------
                lista.encolar(enfermo);
                List<Paciente> resultado = lista.listarPacientes();
                Collections.sort(resultado);
                txtListar.setText(""); //limpiar
                //------------------------------------------
                for(Paciente paciente : resultado){
                    txtListar.append(paciente.toString());
                }


            }
        });

        btnAtender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Paciente paciente = lista.desencolar();
                    txtListar.setText("");
                    List<Paciente>resultado = lista.listarPacientes();

                    Collections.sort(resultado);

                    for(Paciente p : lista.listarPacientes()){
                        txtListar.append(p.toString());
                    }
                    JOptionPane.showMessageDialog(null,paciente.toString() + "Fue atendido");// elemento padre que no deja que interacute con otras ventanas

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());
                }
            }
        });


    }
}
