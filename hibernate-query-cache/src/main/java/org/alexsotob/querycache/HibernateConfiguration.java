package org.alexsotob.querycache;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

@Configuration
public class HibernateConfiguration {

	@Value("#{dataSource}")
	private DataSource dataSource;

	@Bean
	public AnnotationSessionFactoryBean sessionFactoryBean() {
		Properties props = new Properties();
		props.put("hibernate.dialect", EnhancedMySQL5HibernateDialect.class.getName());
		props.put("hibernate.format_sql", "true");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.cache.provider_class", "org.hibernate.cache.EhCacheProvider");
		props.put("hibernate.cache.use_structured_entries", "true");
		props.put("hibernate.cache.use_query_cache", "true");
		props.put("hibernate.cache.use_second_level_cache", "true");
		props.put("hibernate.hbm2ddl.auto", "validate");
		
		AnnotationSessionFactoryBean bean = new AnnotationSessionFactoryBean();
		bean.setAnnotatedClasses(new Class[]{Dna.class});		
		bean.setHibernateProperties(props);
		bean.setDataSource(this.dataSource);
		bean.setSchemaUpdate(true);
		return bean;
	}

}
