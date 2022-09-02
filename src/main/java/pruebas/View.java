package pruebas;

import javax.swing.*;

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
        agregar.addMouseListener(bml);
        borrar.addMouseListener(bml);
        //se deberia hacer agregarMouseListener y borrarMouseListener por aparte para que hagan cosas diferentes
    }
}
