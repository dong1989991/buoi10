package Buoi10;

import java.util.List;

public class main {
    public static void main(String[] args) {
        ProductsDAO productsDAO=new ProductsDAO();
        List<Products> products=productsDAO.getAll();

    }
}
