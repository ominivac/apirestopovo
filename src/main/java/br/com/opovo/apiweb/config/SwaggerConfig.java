package br.com.opovo.apiweb.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	/**
	 * Retorna um Docket para a configuração inicial do Swagger, bem como o caminho inicial.
	 *
	 * @param  Nenhum
	 * @return Docket - Retorna um Docket para a configuração inicial.
	 * @author Roberto Sousa
	 */
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.opovo.apiweb"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }
	
	
	

	/**
	 * Salva uma notícia pela api
	 *
	 * @param  Nenhum
	 * @return Retorna a info para a home do swagger.
	 * @author Roberto Sousa
	 */
    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Notícias API REST",
                "API REST de Notícias.",
                "1.0",
                "Terms of Service",
                new Contact("Roberto Sousa", "https://github.com/ominivac/apirestopovo.git",
                        "robertokbs@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }


}
