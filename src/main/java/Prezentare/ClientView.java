package Prezentare;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author Costea Paula
 * @since Aprilie, 2021
 */
public class ClientView extends JFrame {
    private JPanel contentPane;
    private JButton addC;
    private JButton editC;
    private JButton editC1;
    private JButton deleteC;
    private JButton listC;
    private JTextField idClientT;
    private JTextField numeClientT;
    private JTextField adresaClientT;
    private JLabel idClientL;
    private JLabel numeClientL;
    private JLabel adresaClientL;
    private JButton closeButton;

    public ClientView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1800, 850);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(195, 215, 185));

        addC = new JButton("Add new client");
        addC.setBackground(new Color(255, 255, 255));
        addC.setFont(new Font("Ink Free", Font.BOLD, 16));
        addC.setBounds(100, 100, 200, 40);
        contentPane.add(addC);

        editC = new JButton("Edit client(name)");
        editC.setBackground(new Color(255, 255, 255));
        editC.setFont(new Font("Ink Free", Font.BOLD, 16));
        editC.setBounds(300, 100, 200, 40);
        contentPane.add(editC);

        deleteC = new JButton("Delete client");
        deleteC.setBackground(new Color(255, 255, 255));
        deleteC.setFont(new Font("Ink Free", Font.BOLD, 16));
        deleteC.setBounds(500, 100, 200, 40);
        contentPane.add(deleteC);

        listC = new JButton("View all clients");
        listC.setBackground(new Color(255, 255, 255));
        listC.setFont(new Font("Ink Free", Font.BOLD, 16));
        listC.setBounds(700, 100, 200, 40);
        contentPane.add(listC);

        editC1 = new JButton("Edit client(address)");
        editC1.setBackground(new Color(255, 255, 255));
        editC1.setFont(new Font("Ink Free", Font.BOLD, 16));
        editC1.setBounds(900, 100, 200, 40);
        contentPane.add(editC1);

        idClientT = new JTextField();
        idClientT.setBackground(new Color(200, 220, 230));
        idClientT.setBounds(300, 200, 400, 20);
        contentPane.add(idClientT);
        idClientT.setColumns(10);

        numeClientT = new JTextField();
        numeClientT.setBackground(new Color(200, 220, 230));
        numeClientT.setBounds(300, 250, 400, 20);
        contentPane.add(numeClientT);
        numeClientT.setColumns(10);

        adresaClientT = new JTextField();
        adresaClientT.setBackground(new Color(200, 220, 230));
        adresaClientT.setBounds(300, 300, 400, 20);
        contentPane.add(adresaClientT);
        adresaClientT.setColumns(10);

        idClientL = new JLabel("idClient:");
        idClientL.setFont(new Font("Ink Free", Font.BOLD, 16));
        idClientL.setBounds(100, 200, 200, 20);
        contentPane.add(idClientL);

        numeClientL = new JLabel("numeClient:");
        numeClientL.setFont(new Font("Ink Free", Font.BOLD, 16));
        numeClientL.setBounds(100, 250, 200, 20);
        contentPane.add(numeClientL);

        adresaClientL = new JLabel("adresaClient:");
        adresaClientL.setFont(new Font("Ink Free", Font.BOLD, 16));
        adresaClientL.setBounds(100, 300, 200, 20);
        contentPane.add(adresaClientL);

        closeButton = new JButton("Close");
        closeButton.setBackground(new Color(255, 255, 255));
        closeButton.setFont(new Font("Ink Free", Font.BOLD, 16));
        closeButton.setBounds(1300, 750, 200, 40);
        contentPane.add(closeButton);

    }

    public String getUserInput1() {
        return this.idClientT.getText();
    }

    public String getUserInput2() {
        return this.numeClientT.getText();
    }

    public String getUserInput3() {
        return this.adresaClientT.getText();
    }

    public void addInsertListener(ActionListener actionListener) {
        this.addC.addActionListener(actionListener);
    }

    public void addDeleteListener(ActionListener actionListener) {
        this.deleteC.addActionListener(actionListener);
    }

    public void addUpdateNumeListener(ActionListener actionListener) {
        this.editC.addActionListener(actionListener);
    }

    public void addUpdateAdresaListener(ActionListener actionListener) {
        this.editC1.addActionListener(actionListener);
    }

    public void addViewAllListener(ActionListener actionListener) {
        this.listC.addActionListener(actionListener);
    }

    public void addCloseListener(ActionListener actionListener) {
        this.closeButton.addActionListener(actionListener);
    }

}
