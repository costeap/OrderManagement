package Prezentare;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author Costea Paula
 * @since Aprilie, 2021
 */
public class View extends JFrame {
    private JPanel contentPane;
    private JButton clientB;
    private JButton productB;
    private JButton orderB;

    public View() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(195, 215, 185));

        clientB = new JButton("Client Operations");
        clientB.setBackground(new Color(255, 255, 255));
        clientB.setFont(new Font("Ink Free", Font.BOLD, 16));
        clientB.setBounds(100, 100, 200, 40);
        contentPane.add(clientB);

        productB = new JButton("Product Operations");
        productB.setBackground(new Color(255, 255, 255));
        productB.setFont(new Font("Ink Free", Font.BOLD, 16));
        productB.setBounds(100, 160, 200, 40);
        contentPane.add(productB);

        orderB = new JButton("Order Operations");
        orderB.setBackground(new Color(255, 255, 255));
        orderB.setFont(new Font("Ink Free", Font.BOLD, 16));
        orderB.setBounds(100, 220, 200, 40);
        contentPane.add(orderB);
    }

    public void clientListener(ActionListener actionListener) {
        this.clientB.addActionListener(actionListener);
    }

    public void productListener(ActionListener actionListener) {
        this.productB.addActionListener(actionListener);
    }

    public void orderListener(ActionListener actionListener) {
        this.orderB.addActionListener(actionListener);
    }

}
