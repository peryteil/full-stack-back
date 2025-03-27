package com.my.backend.repository;

import com.my.backend.entity.TimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<TimeEntity, Long> {
    // 커스텀 쿼리 작성 가능
}
