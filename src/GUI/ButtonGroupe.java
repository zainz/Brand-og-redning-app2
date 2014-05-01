/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.util.ArrayList;
import javax.swing.JRadioButton;

/**
 *
 * @author Nicolai
 */
public class ButtonGroupe extends javax.swing.ButtonGroup {
    ArrayList<JRadioButton> buttons;


    public ButtonGroupe(){
    super();
    buttons = new ArrayList();

}
    public void addRadioButton(JRadioButton btn){
        buttons.add(btn);
        super.add(btn);
    }
    
   public JRadioButton getSelectedButton(){
        JRadioButton btn = null;
        for(JRadioButton thisButton: buttons){
            if(thisButton.isSelected()){
                return thisButton;
                
            }
        }
        
        return btn; 
    
    
}
}