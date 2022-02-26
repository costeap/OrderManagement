package Prezentare;

import Bll.ClientBll;
import Bll.OrderBll;
import Bll.ProductBll;
import Incepe.Main;
import Incepe.Reflection;
import Model.Client;
import Model.Comanda;
import Model.Product;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Costea Paula
 * @since Aprilie, 2021
 */

public class Controller {
    private View db;
    private ClientBll clientBll = new ClientBll();
    private OrderBll orderBll = new OrderBll();
    private ProductBll productBll = new ProductBll();

    protected static final Logger LOGGER = Logger.getLogger(Main.class.getName());


    public Controller(View db) {
        this.db = db;
        this.db.clientListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ClientView cv = new ClientView();
                cv.addCloseListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cv.dispose();
                    }
                });
                cv.addInsertListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru adaugarea unui client in tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        String a = cv.getUserInput1();
                        String b = cv.getUserInput2();
                        String c = cv.getUserInput3();

                        ClientBll clientBll = new ClientBll();
                        Client client1 = new Client();
                        try {
                            client1 = new Client(b, c);
                            clientBll.insertClientB(client1);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                        Reflection.retrieveProperties(client1);
                        JOptionPane.showMessageDialog(cv, "Inserarea a fost facuta cu succes!");

                    }
                });
                cv.addDeleteListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru stergerea unui client din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(cv.getUserInput1());
                        ClientBll clientBll = new ClientBll();
                        try {
                            clientBll.deleteClientB(a);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                        JOptionPane.showMessageDialog(cv, "Stergerea a fost facuta cu succes!");
                    }
                });
                cv.addUpdateNumeListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru editarea numelui unui client din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(cv.getUserInput1());
                        String b = cv.getUserInput2();
                        ClientBll clientBll = new ClientBll();
                        try {
                            clientBll.updateClientB(a, b);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }

                    }
                });
                cv.addUpdateAdresaListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru editarea adresei unui client din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(cv.getUserInput1());
                        String c = cv.getUserInput3();
                        ClientBll clientBll = new ClientBll();
                        try {
                            clientBll.updateClientAdresaB(a, c);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                    }
                });
                cv.addViewAllListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru gasirea tuturor clientilor din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        ClientBll clientBll = new ClientBll();
                        List<Client> listaClienti = clientBll.viewAllClientsB();
                        JFrame tabelClienti = new JFrame("Clients");
                        Client c = new Client();
                        JTable table = Reflection.retrieveProperties1(listaClienti, c);
                        JScrollPane scroll = new JScrollPane(table);
                        tabelClienti.add(scroll);
                        tabelClienti.setBounds(800, 200, 600, 400);
                        tabelClienti.setVisible(true);
                    }
                });
                cv.setVisible(true);
            }
        });

        this.db.productListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProductView pw = new ProductView();
                pw.addCloseListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pw.dispose();
                    }
                });
                pw.addInsertListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru inserarea unui produs in tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        String a = pw.getUserI1();
                        String b = pw.getUserI2();
                        int c = Integer.parseInt(pw.getUserI3());
                        int d = Integer.parseInt(pw.getUserI4());

                        ProductBll productBll = new ProductBll();
                        Product product1 = new Product();
                        try {
                            product1 = new Product(b, c, d);
                            productBll.insertProductB(product1);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                        Reflection.retrieveProperties(product1);
                        JOptionPane.showMessageDialog(pw, "Inserarea a fost facuta cu succes!");

                    }
                });
                pw.addDeleteListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru stergerea unui produs din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(pw.getUserI1());

                        ProductBll productBll = new ProductBll();
                        try {
                            productBll.deleteProductB(a);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                        JOptionPane.showMessageDialog(pw, "Stergerea a fost facuta cu succes!");
                    }
                });
                pw.addUpdateNumeListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru editarea numelui unui produs din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(pw.getUserI1());
                        String b = pw.getUserI2();

                        ProductBll productBll = new ProductBll();
                        Product product1 = new Product();
                        try {
                            productBll.updateProductB(a, b);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                    }
                });
                pw.addUpdateCantitateListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru editarea cantitatii unui produs din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(pw.getUserI1());
                        int c = Integer.parseInt(pw.getUserI3());

                        ProductBll productBll = new ProductBll();
                        Product product1 = new Product();
                        try {
                            productBll.updateProductCantitateB(a, c);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                    }
                });
                pw.addUpdatePretListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru editarea pretului unui produs din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(pw.getUserI1());
                        int d = Integer.parseInt(pw.getUserI4());

                        ProductBll productBll = new ProductBll();
                        Product product1 = new Product();
                        try {
                            productBll.updateProductPretB(a, d);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                    }
                });
                pw.addViewAllListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru gasirea tuturor produselor din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        ProductBll productBll = new ProductBll();
                        List<Product> listaProduse = productBll.viewAllProductsB();
                        JFrame tabelProduse = new JFrame("Produse");
                        Product p = new Product();
                        JTable table = Reflection.retrieveProperties1(listaProduse, p);
                        JScrollPane scroll = new JScrollPane(table);
                        tabelProduse.add(scroll);
                        tabelProduse.setBounds(800, 200, 600, 400);
                        tabelProduse.setVisible(true);
                    }
                });
                pw.setVisible(true);
            }
        });

        this.db.orderListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderView ow = new OrderView();
                ow.addCloseListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ow.dispose();
                    }
                });
                ow.addInsertListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru inserarea unei comenzi in tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int b = Integer.parseInt(ow.getUserIn2());
                        int c = Integer.parseInt(ow.getUserIn3());
                        int d = Integer.parseInt(ow.getUserIn4());

                        OrderBll orderBll = new OrderBll();
                        Comanda order1 = new Comanda();
                        try {
                            order1 = new Comanda(b, c, d);
                            orderBll.insertOrder(c, d, b);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                        Reflection.retrieveProperties(order1);
                        FileWriter fw = null;
                        try {
                            fw = new FileWriter("bill.txt");

                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                        try {
                            fw.write("numeClient: " + clientBll.findClientById(order1.getIdClient()).isNume() + " " + "\n");
                            fw.write("numeProdus: " + productBll.findProductById(order1.getIdProdus()).getNume() + " " + "\n");
                            fw.write("cantitate: " + order1.getCantitate() + "\n");
                            fw.write("pret total: " + order1.getCantitate() * productBll.findProductById(order1.getIdProdus()).getPret());
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                        try {
                            fw.close();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                });
                ow.addDeleteListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru stergerea unei comenzi din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        int a = Integer.parseInt(ow.getUserIn1());

                        OrderBll orderBll = new OrderBll();
                        try {
                            orderBll.deleteOrderB(a);

                        } catch (Exception ex) {
                            LOGGER.log(Level.INFO, ex.getMessage());
                        }
                    }
                });
                ow.addViewAllListener(new ActionListener() {
                    @Override
                    /**
                     * Metoda ascultatoare pentru vizualizarea tuturor comenzilor din tabela.
                     */
                    public void actionPerformed(ActionEvent e) {
                        OrderBll orderBll = new OrderBll();
                        List<Comanda> listaComenzi = orderBll.viewAllOrdersB();
                        JFrame tabelComenzi = new JFrame("Comenzi");
                        Comanda c = new Comanda();
                        JTable table = Reflection.retrieveProperties1(listaComenzi, c);
                        JScrollPane scroll = new JScrollPane(table);
                        tabelComenzi.add(scroll);
                        tabelComenzi.setBounds(800, 200, 600, 400);
                        tabelComenzi.setVisible(true);
                    }
                });
                ow.setVisible(true);
            }
        });
    }
}
