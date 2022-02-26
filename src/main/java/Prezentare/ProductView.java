package Prezentare;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author Costea Paula
 * @since Aprilie, 2021
 */
public class ProductView extends JFrame {
    private JPanel contentPane;
    private JButton addP;
    private JButton editP;
    private JButton editP1;
    private JButton editP2;
    private JButton deleteP;
    private JButton listP;
    private JTextField idProdusT;
    private JTextField numeProdusT;
    private JTextField cantitateT;
    private JTextField pretT;
    private JLabel idProdusL;
    private JLabel numeProdusL;
    private JLabel cantitateL;
    private JLabel pretL;
    private JButton closeButton;


    public ProductView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1800, 850);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(195, 215, 185));

        addP = new JButton("Add new product");
        addP.setBackground(new Color(255, 255, 255));
        addP.setFont(new Font("Ink Free", Font.BOLD, 16));
        addP.setBounds(100, 100, 200, 40);
        contentPane.add(addP);

        editP = new JButton("Edit product(name)");
        editP.setBackground(new Color(255, 255, 255));
        editP.setFont(new Font("Ink Free", Font.BOLD, 16));
        editP.setBounds(300, 100, 200, 40);
        contentPane.add(editP);

        deleteP = new JButton("Delete product");
        deleteP.setBackground(new Color(255, 255, 255));
        deleteP.setFont(new Font("Ink Free", Font.BOLD, 16));
        deleteP.setBounds(500, 100, 200, 40);
        contentPane.add(deleteP);

        listP = new JButton("View all products");
        listP.setBackground(new Color(255, 255, 255));
        listP.setFont(new Font("Ink Free", Font.BOLD, 16));
        listP.setBounds(700, 100, 200, 40);
        contentPane.add(listP);

        idProdusT = new JTextField();
        idProdusT.setBackground(new Color(200, 220, 230));
        idProdusT.setBounds(300, 200, 400, 20);
        contentPane.add(idProdusT);
        idProdusT.setColumns(10);

        numeProdusT = new JTextField();
        numeProdusT.setBackground(new Color(200, 220, 230));
        numeProdusT.setBounds(300, 250, 400, 20);
        contentPane.add(numeProdusT);
        numeProdusT.setColumns(10);

        cantitateT = new JTextField();
        cantitateT.setBackground(new Color(200, 220, 230));
        cantitateT.setBounds(300, 300, 400, 20);
        contentPane.add(cantitateT);
        cantitateT.setColumns(10);

        pretT = new JTextField();
        pretT.setBackground(new Color(200, 220, 230));
        pretT.setBounds(300, 350, 400, 20);
        contentPane.add(pretT);
        pretT.setColumns(10);

        idProdusL = new JLabel("idProdus:");
        idProdusL.setFont(new Font("Ink Free", Font.BOLD, 16));
        idProdusL.setBounds(100, 200, 200, 20);
        contentPane.add(idProdusL);

        numeProdusL = new JLabel("numeProdus:");
        numeProdusL.setFont(new Font("Ink Free", Font.BOLD, 16));
        numeProdusL.setBounds(100, 250, 200, 20);
        contentPane.add(numeProdusL);

        cantitateL = new JLabel("cantitate:");
        cantitateL.setFont(new Font("Ink Free", Font.BOLD, 16));
        cantitateL.setBounds(100, 300, 200, 20);
        contentPane.add(cantitateL);

        pretL = new JLabel("pret:");
        pretL.setFont(new Font("Ink Free", Font.BOLD, 16));
        pretL.setBounds(100, 350, 200, 20);
        contentPane.add(pretL);

        closeButton = new JButton("Close");
        closeButton.setBackground(new Color(255, 255, 255));
        closeButton.setFont(new Font("Ink Free", Font.BOLD, 16));
        closeButton.setBounds(1300, 750, 200, 40);
        contentPane.add(closeButton);

        editP1 = new JButton("Edit product(quantity)");
        editP1.setBackground(new Color(255, 255, 255));
        editP1.setFont(new Font("Ink Free", Font.BOLD, 16));
        editP1.setBounds(900, 100, 200, 40);
        contentPane.add(editP1);

        editP2 = new JButton("Edit product(price)");
        editP2.setBackground(new Color(255, 255, 255));
        editP2.setFont(new Font("Ink Free", Font.BOLD, 16));
        editP2.setBounds(1100, 100, 200, 40);
        contentPane.add(editP2);

    }

    public String getUserI1() {
        return this.idProdusT.getText();
    }

    public String getUserI2() {
        return this.numeProdusT.getText();
    }

    public String getUserI3() {
        return this.cantitateT.getText();
    }

    public String getUserI4() {
        return this.pretT.getText();
    }


    public void addInsertListener(ActionListener actionListener) {
        this.addP.addActionListener(actionListener);
    }

    public void addDeleteListener(ActionListener actionListener) {
        this.deleteP.addActionListener(actionListener);
    }

    public void addUpdateNumeListener(ActionListener actionListener) {
        this.editP.addActionListener(actionListener);
    }

    public void addUpdateCantitateListener(ActionListener actionListener) {
        this.editP1.addActionListener(actionListener);
    }

    public void addUpdatePretListener(ActionListener actionListener) {
        this.editP2.addActionListener(actionListener);
    }

    public void addViewAllListener(ActionListener actionListener) {
        this.listP.addActionListener(actionListener);
    }

    public void addCloseListener(ActionListener actionListener) {
        this.closeButton.addActionListener(actionListener);
    }
}
