package io.sajeewa.productservice.repository;

import io.sajeewa.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductReository  extends MongoRepository<Product,String> {


}
