package com.github.drunk22013.solr.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.github.drunk2013.solr.conf.SolrContext;
import com.github.drunk2013.solr.entity.CollectionMorphlines;
import com.github.drunk2013.solr.repository.CollectionMorphlinesRepository;

public class Test {
	private static final Log LOG = LogFactory.getLog(Test.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				SolrContext.class);
		CollectionMorphlinesRepository repository = ctx
				.getBean(CollectionMorphlinesRepository.class);
		Page<CollectionMorphlines> page = repository.findByID("shutdown", new PageRequest(
				0, 50));
		for (CollectionMorphlines hourei : page) {
			LOG.info(hourei);
		}
	}
}
