package com.project.deliver.utils;

import org.springframework.data.repository.CrudRepository;
import com.project.deliver.ProductOrder;

public interface DataRepository extends CrudRepository<ProductOrder, Long> {

	ProductOrder findById(long id);
}