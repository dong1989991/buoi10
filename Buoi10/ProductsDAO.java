package Buoi10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductsDAO {
    //lay taon bo ra thong tin cua san pham
    public List<Products> getAll()
    {
        List<Products> productsList=new ArrayList<>();
        // buoc 1: yao ket noi
        //buoc 2: thuc thi cau lenh.
        //Buoc 3:Thuc thi
        //Buoc 4: Dong ket noi
        try{
            //nuoc 1: Tao ket nooi
            Connection conn=MyConnection.getConnection();
            final String sql="SELECT id,product_name,product_price,product_color FROM products ";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                Products p=new Products();
              //  p.setId(rs.getInt("id"));
                p.setProduct_name(rs.getString("product_name"));
                p.setProduct_price(rs.getString("product_price"));
                p.setProduct_color(rs.getString("product_color"));

                productsList.add(p);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return productsList;
    }
}
