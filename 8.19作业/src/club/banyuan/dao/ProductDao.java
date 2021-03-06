package club.banyuan.dao;

import club.banyuan.entity.Product;
import java.util.List;

public interface ProductDao extends IBaseDao{
    public List<Product> getProductByKeyWords(String keyWords) throws Exception;
    public Product getProductById(int id) throws Exception;
}
