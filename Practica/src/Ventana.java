import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class Ventana {
    private JPanel principal;
    private JButton btnTransformer;
    private JButton btnAtaque;
    private JTextArea txtDatos1;
    private JComboBox cboFacciones;
    private JButton btnCopia;
    private JTextArea txtDatos2;
    

    private ColaRobot colaRobot;

    public Ventana() {
        colaRobot = new ColaRobot();

        btnTransformer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDatos1.setText("");
                for (Robot robot : colaRobot.cola) {
                    txtDatos1.append(robot.toString() + "\n");
                }
            }
        });

        btnAtaque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder resultado = new StringBuilder();

                for (Robot robot : colaRobot.cola) {
                    int valorAtaque = robot.getPoder();
                    if (robot.getFaccion().equals("Autobot")) {
                        valorAtaque += valorAtaque * 0.25;
                    } else if (robot.getFaccion().equals("Decepticon")) {
                        valorAtaque += valorAtaque * 0.10;
                    }
                    resultado.append(robot.toString()).append(" -> Valor de ataque: ").append(valorAtaque).append("\n");
                }

                txtDatos2.setText(resultado.toString());
            }
        });

        btnCopia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String funcionSeleccionada = (String) cboFacciones.getSelectedItem();
                Queue<Robot> nuevaCola = colaRobot.copiarCola(funcionSeleccionada);

                txtDatos2.setText("");
                for (Robot robot : nuevaCola) {
                    txtDatos2.append(robot.toString() + "\n");
                }

                txtDatos1.setText("");
                for (Robot robot : colaRobot.cola) {
                    txtDatos1.append(robot.toString() + "\n");
                }
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
}
