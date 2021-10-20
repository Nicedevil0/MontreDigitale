package sourcesTP2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class Affichage extends JFrame {

    public Montre getMontre() {
        return montre;
    }

    private final Montre montre;
    private JLabel clock;

    public Affichage(Montre m) {
        super("Horloge");
        setSize(800, 300);
        try {
            this.setIconImage(ImageIO.read(new File("C:/Users/Epulapp/IdeaProjects/APO/src/sourcesTP2/images/icone.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.montre = m;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                super.windowClosing(arg0);
                System.exit(0);
            }
        });
        this.build();
        this.setVisible(true);
    }

    public void popup(){
        int input = JOptionPane.showConfirmDialog(this, "Il est l'heure de se réveiller.", "Alarme", JOptionPane.OK_OPTION);
        if(input == JOptionPane.OK_OPTION)
        {
            this.montre.arreter();
        }else{
            ((Reveil)this.montre).pause(10);
        }
    }

    private void build() {
        this.clock = new JLabel(this.montre.getHoraire().toString(),SwingConstants.CENTER);
        this.clock.setFont(new Font("Serif", Font.PLAIN, 40));
        getContentPane( ).add(clock, BorderLayout.CENTER);
    }

    public void update() {
        this.clock.setText(this.montre.getHoraire().toString());
    }
}
