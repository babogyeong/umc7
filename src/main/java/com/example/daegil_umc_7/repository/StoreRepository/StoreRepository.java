package com.example.daegil_umc_7.repository.StoreRepository;

import com.example.daegil_umc_7.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom{
}
