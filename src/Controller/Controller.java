package Controller;

import Model.Model;
import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    View v;
    Model m;
    int choose=0;

    public Controller() {
        v=new View();
        m=new Model();
        v.addListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(choose);
        if(e.getActionCommand().equals("choose")){
           choose= v.getChoose().getSelectedIndex();
            switch (choose){
                case 0: v.bachtobase(); choose=0;break;
                case 1: v.switchBSuche();choose=1;break;
                case 2: v.switchSuche();choose=2;break;
                default:v.bachtobase();break;

            }


        }
        if(e.getActionCommand().equals("search")){
            switch (choose){
                case 0: JOptionPane.showMessageDialog(null,"Ich weiß zwar nicht wie du das hinbekommen hast jedoch hut ab das du es hinbekommst nen Knopf zu drücken wo keiner ist.");break;
                case 1: String tmp=v.getTelnr().getText();
                    int telnrueb=0;
                try {
                    telnrueb=Integer.parseInt(tmp);
                }
                catch (Exception a){
                    JOptionPane.showMessageDialog(null, "Telefonnummern bitte nur mit Nummern und ohne Lehrzeichen angeben");
                }
                v.getResults().setListData(m.bsuche(telnrueb));
                break;
                case 2:
                    v.getResults().setListData(m.suchen(v.getNameText().getText(),v.getPlzoderort().getText()));
                    break;
                default:v.bachtobase();break;

            }
        }
    }
}
