package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application extends Frame {

    public static void main(String[] args) {
        new Application();
    }

    public Application() {
        super();

        Modèle modl = new Modèle();
        Contrôleur ctrl = new Contrôleur(modl);
        Vue vue = new Vue();
        modl.addObserver(vue);
        vue.addActionListener(ctrl);

        this.setTitle("tutoriel git one");

        this.add(vue);
        this.pack();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        }
        );
        this.setLocationRelativeTo(null);
    }

}
