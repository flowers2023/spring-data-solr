package com.github.drunk2013.solr;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@PropertySource("application.properties")
@EnableSolrRepositories(basePackages={"com.github.drunk2013.solr"},multicoreSupport=true)
public class Example {
	static final String SOLR_HOST = "solr.host";

	  @Resource
	  private Environment environment;

	  @Bean
	  public SolrServer solrServer() {
	    String solrHost = environment.getProperty(SOLR_HOST);
	    return new HttpSolrServer(solrHost);
	  }
}
