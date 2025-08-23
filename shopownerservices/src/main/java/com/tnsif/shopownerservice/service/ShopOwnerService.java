package com.tnsif.shopownerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.tnsif.shopownerservice.entity.ShopOwner;
import com.tnsif.shopownerservice.repository.ShopOwnerRepository;

@Service
public class ShopOwnerService {
	@Autowired
    private ShopOwnerRepository repository;

    public List<ShopOwner> getAllShopOwners() {
        return repository.findAll();
    }

    public ShopOwner getShopOwnerById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public ShopOwner addShopOwner(ShopOwner shopOwner) {
        return repository.save(shopOwner);
    }

    public ShopOwner updateShopOwner(Long id, ShopOwner shopOwner) {
        ShopOwner existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setOwnerName(shopOwner.getOwnerName());
            existing.setShopName(shopOwner.getShopName());
            existing.setEmail(shopOwner.getEmail());
            existing.setPhone(shopOwner.getPhone());
            existing.setMallName(shopOwner.getMallName());
            existing.setShopCategory(shopOwner.getShopCategory());
            return repository.save(existing);
        }
        return null;
    }

    public void deleteShopOwner(Long id) {
        repository.deleteById(id);
    }
}