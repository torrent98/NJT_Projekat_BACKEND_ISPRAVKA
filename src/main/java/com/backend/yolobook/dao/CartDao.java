package com.backend.yolobook.dao;

import com.backend.yolobook.entity.Cart;
import com.backend.yolobook.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer > {
    public List<Cart> findByUser(User user);
}
