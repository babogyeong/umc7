package com.example.daegil_umc_7.repository.StoreRepository;

import com.example.daegil_umc_7.domain.Store;

import java.util.List;

public interface StoreRepositoryCustom {
    List<Store> dynamicQueryWithBooleanBuilder(String name, Float score);
}
