package Alumnos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FRMAlumnos {
    private JTextField TXTnombre;
    private JTextField TXTapPat;
    private JTextField TXTapMat;
    private JTextField TXTcorreo;
    private JTextField TXTnumero;
    private JComboBox Csexo;
    private JCheckBox cuentaConDiscapacidadCheckBox;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JTextField TXTcurp;


    public FRMAlumnos() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();

            }
        });
    }
    private void Borrar(){
        TXTnombre.setText("");
        TXTapMat.setText("");
        TXTapPat.setText("");
        TXTcorreo.setText("");
        TXTnumero.setText("");
        TXTcurp.setText("");
        Csexo.setSelectedIndex(0);
        cuentaConDiscapacidadCheckBox.setSelected(false);
    }
    private void PoblarComboBox(){
        DefaultComboBoxModel <genero> comboBoxModel = (DefaultComboBoxModel<genero>)Csexo.getModel());


        for (genero genero  : genero.values()){
            Csexo.addElement(genero);
        }
    }
}
