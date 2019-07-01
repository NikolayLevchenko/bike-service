package com.BikeService.mvp.repository;

import com.BikeService.mvp.model.entity.SearchRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRequestRepository extends JpaRepository<SearchRequest, Long> {

    @Query(value = "SELECT s FROM SearchRequest s WHERE s.user.id = :userId")
    List<SearchRequest> getSearchRequestListByUserId(@Param("userId") Long userId);
}
