package com.guoyw.framework.base.repository;

import com.guoyw.framework.base.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * @author: guoyw
 * create: 2019-12-20 16:07
 **/
@NoRepositoryBean
public interface BaseRepository<E extends BaseEntity, ID> extends JpaRepository<E, ID>, CrudRepository<E, ID>, JpaSpecificationExecutor<E>{
  
  List<E> findAllByOrderByCreatedAtAsc();
  
  List<E> findAllByOrderByCreatedAtDesc();
}
