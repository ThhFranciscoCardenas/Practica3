package Alumnos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FRMAlumnos extends JFrame {
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
    private JPanel Pnlprincipal;
    private BotonGuardarListener botonGuardarListener;


    public FRMAlumnos() {
        setTitle("Alumnos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Pnlprincipal);
        setLocationRelativeTo(null);
        PoblarComboBox();
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarDatos();

            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();

            }
        });
    }
    public void setBotonGuardarListener(BotonGuardarListener listener) {
        this.botonGuardarListener = listener;
    }
    private void enviarDatos(){
        String nombre = TXTnombre.getText();
        String apat = TXTapPat.getText();
        String apmat = TXTapMat.getText();
        String correo = TXTcorreo.getText();
        String numero = TXTnumero.getText();
        String curp = TXTcurp.getText();
        String sexo = Csexo.getSelectedItem().toString();
        Boolean discapacidad = cuentaConDiscapacidadCheckBox.isSelected();

        Alumno dato = new Alumno(nombre,apat,apmat,curp,discapacidad,correo,numero);

        if(botonGuardarListener != null){
            botonGuardarListener.guardando(dato);
        }
        Borrar();
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
