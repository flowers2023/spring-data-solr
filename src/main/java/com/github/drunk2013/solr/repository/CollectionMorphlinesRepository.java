package com.github.drunk2013.solr.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import com.github.drunk2013.solr.entity.CollectionMorphlines;

public interface CollectionMorphlinesRepository extends SolrCrudRepository<CollectionMorphlines, String>{
	
	@Query(value="ID:?0")
	Page<CollectionMorphlines> findByID(String ID,Pageable page);

}
