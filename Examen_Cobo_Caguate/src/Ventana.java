import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ventana {
    private JPanel principal;
    private JTextField txtid;
    private JTextField txtNombre;
    private JTextField txtUniverso;
    private JTextField txtNivel;
    private JComboBox cboHabilidad;
    private JLabel lblid;
    private JTextArea textArea1;
    private JButton AGREGARButton;
    private JComboBox cboUniverso;
    private JButton sumaButton;
    private JLabel lblResultado;
    private JLabel lblSuma;
    private JButton btnVer;
    private JTextArea txtResultado;

    ColaSuperHeroe lista = new ColaSuperHeroe();
    public Ventana() {
        AGREGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SuperHeroe p1 = new SuperHeroe(34,"Superman","DC", 100,"Vuelo");
                SuperHeroe p2 = new SuperHeroe(54,"Flash","DC", 50,"Velocidad");
                SuperHeroe p3 = new SuperHeroe(36,"IroMan","Marvel", 99,"Vuelo");
                SuperHeroe p4 = new SuperHeroe(85,"SpiderMan","Marvel", 85,"Fuerza");
                SuperHeroe p5 = new SuperHeroe(12,"Batman","DC", 80,"Fuerza");

                lista.encolar(p1);
                lista.encolar(p2);
                lista.encolar(p3);
                lista.encolar(p4);
                lista.encolar(p5);
                List<SuperHeroe> resultado = lista.listaHeroes();
                Collections.sort(resultado);
                textArea1.setText("");


                for(SuperHeroe s : resultado){
                    textArea1.append(s.toString());
                }
            }
        });

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<SuperHeroe> resultado = new ArrayList<>();
                for (SuperHeroe heroe : lista.listaHeroes()) {
                    if (cboUniverso.getSelectedItem().equals("Marvel")) {  // Puedes modificar este valor
                        heroe.setNivelPoder((int) (heroe.getNivelPoder() * 0.15) + heroe.getNivelPoder());
                        resultado.add(heroe);
                    } else if (cboUniverso.getSelectedItem().equals("DC")) {
                        heroe.setNivelPoder((int) (heroe.getNivelPoder() * 0.20) + heroe.getNivelPoder());
                        resultado.add(heroe);
                    }

                    lblResultado.setText(heroe.toString());
                }



            }

        });


        btnVer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

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
