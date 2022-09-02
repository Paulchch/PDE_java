package pruebas;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View {
    private JButton agregar;
    private JButton borrar;

    private JPanel panel;

    public JPanel getPanel() {
        return panel;
    }

    //listener va en el view

    public View() {
        ButtonMouseListener bml = new ButtonMouseListener();
        //agregar.addMouseListener(bml);
        //borrar.addMouseListener(bml);
        //se deberia hacer agregarMouseListener y borrarMouseListener por aparte para que hagan cosas diferentes

        //llave luego de new-->subclase de MouseAdapter
        agregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Agregar! New");
            }
        });
        borrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Borrar! New");
            }
        });
    }
}
