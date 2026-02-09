package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        if (product.getProductId() == null) {
            product.setProductId(UUID.randomUUID().toString());
        }

        productData.add(product);
        return product;
    }

    public Product edit(Product productToEdit) {
        for (int index = 0; index < productData.size(); index++) {
            Product product = productData.get(index);

            if (product.getProductId().equals(productToEdit.getProductId())) {
                productData.set(index, productToEdit);
                return productToEdit;
            }
        }
        return null;
    }

    public Product delete(String id) {
        Product product = findById(id);
        productData.remove(product);
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product findById(String id) {
        for (Product product : productData) {
            if (product.getProductId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}