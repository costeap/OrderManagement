package Bll;

import Dao.ProductDao;
import Model.Client;
import Model.Product;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Costea Paula, grupa 302210
 * @since Aprilie, 2021
 */
public class ProductBll {
    private ProductDao productDao;

    public ProductBll() {
        this.productDao = new ProductDao();
    }

    /**
     * Aceasta metoda apeleaza metoda din ProductDao pentru cautarea unui produs din baza de date prin intermediul atributului productDao.
     */
    public Product findProductById(int idProduct) {
        Product st = productDao.findById(idProduct);
        if (st == null) {
            throw new NoSuchElementException("The product with id =" + idProduct + " was not found!");
        }
        return st;
    }

    /**
     * Se apeleaza metoda din ProductDao pentru inserarea unui produs in baza de date prin intermediul atributului productDao.
     */
    public void insertProductB(Product product) {
        productDao.insert(product);
    }

    /**
     * Se apeleaza metoda din ProductDao pentru stergerea unui produs din baza de date prin intermediul atributului productDao.
     */
    public void deleteProductB(int idProduct) {
        productDao.delete(idProduct);
    }

    /**
     * Se apeleaza metoda din ProductDao pentru editarea numelui unui produs din baza de date prin intermediul atributului productDao.
     */
    public void updateProductB(int idProduct, String numeProduct) {
        productDao.update(numeProduct, idProduct);
    }

    /**
     * Se apeleaza metoda din ProductDao pentru editarea cantitatii unui produs din baza de date prin intermediul atributului productDao.
     */
    public void updateProductCantitateB(int idProduct, int cantitate) {
        productDao.updateCantitate(cantitate, idProduct);
    }

    /**
     * Se apeleaza metoda din ProductDao pentru editarea pretului unui produs din baza de date prin intermediul atributului productDao.
     */
    public void updateProductPretB(int idProduct, int pret) {
        productDao.updatePret(pret, idProduct);
    }

    /**
     * Se apeleaza metoda din ProductDao pentru cautarea tuturor produselor din baza de date prin intermediul atributului productDao.
     */
    public List<Product> viewAllProductsB() {
        return productDao.viewAll();
    }

}
