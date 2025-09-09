package com.mycompany.janela;

import javax.swing.*;

public class Principal extends Win {
    private JLabel labelId, labelNome, labelSexo, labelTelefone;
    private JTextField id, nome, telefone;
    private JRadioButton pessoa, empresa;
    private JComboBox sexo;
    private JCheckBox amigo, inimigo;
    private JButton inserir, cancelar;
    public Principal() {
        super("Principal", 200, 50, 500, 400, JFrame.EXIT_ON_CLOSE);
    }
    protected void setupComponents() {
        setLayout(null);
        labelId = new JLabel ("Id");
        labelNome = new JLabel("Nome");
        labelSexo = new JLabel("Sexo");
        labelTelefone = new JLabel("Telefone");
        id = new JTextField("5");
        nome = new JTextField(30);
        telefone = new JTextField(15);
        pessoa = new JRadioButton("Pessoa", true);
        empresa = new JRadioButton("Empresa");
        ButtonGroup groupTipo = new ButtonGroup();
        groupTipo.add(pessoa);
        groupTipo.add(empresa);
        sexo = new JComboBox(new String[] {
            "Masculino", "Feminino", "Sempre rs"
        });
        amigo = new JCheckBox("Amigo");
        inimigo = new JCheckBox("Inimigo");
        inserir = new JButton("Inserir");
        cancelar = new JButton("Cancelar");
        x = y = gap = 8;
        addRow(labelId, id, pessoa, empresa);
        addRow(labelNome, nome);
        addRow(labelSexo, sexo, labelTelefone, telefone);
        addRow(amigo);
        addRow(inimigo);
        addRow(inserir, cancelar);
    }
    
}
