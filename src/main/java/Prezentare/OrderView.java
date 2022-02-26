package Prezentare;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author Costea Paula
 * @since Aprilie, 2021
 */
public class OrderView extends JFrame {
    private JPanel contentPane;
    private JButton addO;
    private JTextField idOrderT;
    private JTextField cantitateT;
    private JTextField idClientT;
    private JTextField idProdusT;
    private JLabel idOrderL;
    private JLabel cantitateL;
    private JLabel idClientL;
    private JLabel idProdusL;
    private JButton closeButton;
    private JButton deleteO;
    private JButton updateO1;
    private JButton updateO2;
    private JButton updateO3;
    private JButton viewAllO;


    public OrderView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1800, 850);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(195, 215, 185));

        addO = new JButton("Add new order");
        addO.setBackground(new Color(255, 255, 255));
        addO.setFont(new Font("Ink Free", Font.BOLD, 16));
        addO.setBounds(100, 100, 200, 40);
        contentPane.add(addO);

        deleteO = new JButton("Delete order");
        deleteO.setBackground(new Color(255, 255, 255));
        deleteO.setFont(new Font("Ink Free", Font.BOLD, 16));
        deleteO.setBounds(300, 100, 200, 40);
        contentPane.add(deleteO);

        /*updateO1 = new JButton("Update order(quantity)");
        updateO1.setBackground(new Color(255, 255, 255));
        updateO1.setFont(new Font("Ink Free", Font.BOLD, 16));
        updateO1.setBounds(500, 100, 200, 40);
        contentPane.add(updateO1);

        updateO2 = new JButton("Update order(idClient)");
        updateO2.setBackground(new Color(255, 255, 255));
        updateO2.setFont(new Font("Ink Free", Font.BOLD, 16));
        updateO2.setBounds(700, 100, 200, 40);
        contentPane.add(updateO2);

        updateO2 = new JButton("Update order(idCProdus)");
        updateO2.setBackground(new Color(255, 255, 255));
        updateO2.setFont(new Font("Ink Free", Font.BOLD, 16));
        updateO2.setBounds(900, 100, 200, 40);
        contentPane.add(updateO2);*/

        viewAllO = new JButton("View all orders");
        viewAllO.setBackground(new Color(255, 255, 255));
        viewAllO.setFont(new Font("Ink Free", Font.BOLD, 16));
        viewAllO.setBounds(500, 100, 200, 40);
        contentPane.add(viewAllO);

        idOrderT = new JTextField();
        idOrderT.setBackground(new Color(200, 220, 230));
        idOrderT.setBounds(300, 200, 400, 20);
        contentPane.add(idOrderT);
        idOrderT.setColumns(10);

        cantitateT = new JTextField();
        cantitateT.setBackground(new Color(200, 220, 230));
        cantitateT.setBounds(300, 250, 400, 20);
        contentPane.add(cantitateT);
        cantitateT.setColumns(10);

        idClientT = new JTextField();
        idClientT.setBackground(new Color(200, 220, 230));
        idClientT.setBounds(300, 300, 400, 20);
        contentPane.add(idClientT);
        idClientT.setColumns(10);

        idProdusT = new JTextField();
        idProdusT.setBackground(new Color(200, 220, 230));
        idProdusT.setBounds(300, 350, 400, 20);
        contentPane.add(idProdusT);
        idProdusT.setColumns(10);

        idOrderL = new JLabel("idOrder:");
        idOrderL.setFont(new Font("Ink Free", Font.BOLD, 16));
        idOrderL.setBounds(100, 200, 200, 20);
        contentPane.add(idOrderL);

        cantitateL = new JLabel("cantitate:");
        cantitateL.setFont(new Font("Ink Free", Font.BOLD, 16));
        cantitateL.setBounds(100, 250, 200, 20);
        contentPane.add(cantitateL);

        idClientL = new JLabel("idClient:");
        idClientL.setFont(new Font("Ink Free", Font.BOLD, 16));
        idClientL.setBounds(100, 300, 200, 20);
        contentPane.add(idClientL);

        idProdusL = new JLabel("idProdus:");
        idProdusL.setFont(new Font("Ink Free", Font.BOLD, 16));
        idProdusL.setBounds(100, 350, 200, 20);
        contentPane.add(idProdusL);

        closeButton = new JButton("Close");
        closeButton.setBackground(new Color(255, 255, 255));
        closeButton.setFont(new Font("Ink Free", Font.BOLD, 16));
        closeButton.setBounds(1300, 750, 200, 40);
        contentPane.add(closeButton);

    }

    public String getUserIn1() {
        return this.idOrderT.getText();
    }

    public String getUserIn2() {
        return this.cantitateT.getText();
    }

    public String getUserIn3() {
        return this.idClientT.getText();
    }

    public String getUserIn4() {
        return this.idProdusT.getText();
    }

    public void addInsertListener(ActionListener actionListener) {
        this.addO.addActionListener(actionListener);
    }

    public void addDeleteListener(ActionListener actionListener) {
        this.deleteO.addActionListener(actionListener);
    }

    public void addUpdateCantitateListener(ActionListener actionListener) {
        this.updateO1.addActionListener(actionListener);
    }

    public void addUpdateIdClientListener(ActionListener actionListener) {
        this.updateO2.addActionListener(actionListener);
    }

    public void addUpdateIdProdusListener(ActionListener actionListener) {
        this.updateO3.addActionListener(actionListener);
    }


    public void addViewAllListener(ActionListener actionListener) {
        this.viewAllO.addActionListener(actionListener);
    }


    public void addCloseListener(ActionListener actionListener) {
        this.closeButton.addActionListener(actionListener);
    }

}

