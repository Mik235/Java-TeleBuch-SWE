package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class View extends JFrame {
    JPanel all=new JPanel();
    JPanel r1=new JPanel();
    JPanel r2=new JPanel();
    JPanel r3s=new JPanel();
    JPanel r3b=new JPanel();
    JPanel r4=new JPanel();
    JPanel r5=new JPanel();

    JTextField telnr=new JTextField(10);
    JTextField name=new JTextField(10);
    JTextField plzoderort=new JTextField(10);
    String[] boxcontent={"Bitte Auswählen","Rückwärtssuche","Suche"};
    JButton suchen=new JButton("Suchen");
    JList results=new JList();
    JComboBox<String> choose= new JComboBox<String>(boxcontent);



    public View() {
        JScrollPane sc=new JScrollPane(results);
        results.setVisibleRowCount(5);
        r1.add(new JLabel("Das Telefonbuch:"));
        r2.add(new JLabel("Welche suche soll verwendet werden: "),BorderLayout.WEST);
        r2.add(choose);
        all.add(r1);
        all.add(r2);
        r3b.add(new JLabel("TelNR"));
        r3b.add(telnr);
        r3s.add(new JLabel("Name:"));
        r3s.add(name);
        r3s.add(new JLabel("PLZ/Ort:"));
        r3s.add(plzoderort);
        r4.add(sc);
        r5.add(suchen);
        all.add(r3s);
        all.add(r3b);
        all.add(r4);
        all.add(r5);
        add(all);
        r4.setVisible(false);
        r5.setVisible(false);
        r3s.setVisible(false);
       r3b.setVisible(false);
        choose.setActionCommand("choose");
        suchen.setActionCommand("search");


        setTitle("Suche?");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(420,120));
        setVisible(true);
        setMaximumSize(new Dimension(420,120));
        setResizable(false);



    }
    public void addListener(Controller l){
        choose.addActionListener(l);
        suchen.addActionListener(l);
    }
    public void switchBSuche(){
        telnr.setText("");
        r3s.setVisible(false);
        r3b.setVisible(true);
        r4.setVisible(true);
        r5.setVisible(true);
        setTitle("Rückwärtssuche");
        setMinimumSize(new Dimension(420,320));
        setMaximumSize(new Dimension(420,320));
        setVisible(true);

    }
    public void switchSuche(){
        plzoderort.setText("");
        name.setText("");
        r3s.setVisible(true);
        r3b.setVisible(false);
        r4.setVisible(true);
        r5.setVisible(true);
        setTitle("Suche");
        setMinimumSize(new Dimension(420,320));
        setMaximumSize(new Dimension(420,320));
        setVisible(true);

    }
    public void bachtobase(){
        r4.setVisible(false);
        r5.setVisible(false);
        r3s.setVisible(false);
        r3b.setVisible(false);
        setMinimumSize(new Dimension(420,120));
        setMaximumSize(new Dimension(420,120));
        setSize(new Dimension(420,120));
    }

    public JTextField getTelnr() {
        return telnr;
    }


    public JTextField getNameText() {
        return name;
    }

    public JTextField getPlzoderort() {
        return plzoderort;
    }

    public JComboBox<String> getChoose() {
        return choose;
    }

    public JList getResults() {
        return results;
    }
}
