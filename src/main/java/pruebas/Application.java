package pruebas;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception ex){
            System.out.println("Ex:" + ex);
        }

        View view = new View();//tocar sobre la clase y darle import
        JFrame window = new JFrame();//se le suele llamar frame
        window.setSize(500,300);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Buttons");
        window.setContentPane(view.getPanel());
        window.setVisible(true);
    }
}
