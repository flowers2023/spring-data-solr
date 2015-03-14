package com.github.drunk2013.solr.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName="morphlines_test")
public class CollectionMorphlines {
	@Id
	@Indexed
	public String KEY;
	
	@Indexed("ID")
	public String ID;

	@Override
	public String toString() {
		return "CollectionMorphlines [KEY=" + KEY + ", ID=" + ID + "]";
	}

}
