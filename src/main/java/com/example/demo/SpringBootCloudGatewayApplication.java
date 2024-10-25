package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudGatewayApplication.class, args);
	}
	//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(r -> r.path("/posts/**")
//						.filters(f -> f
//							.prefixPath("/api")
//							.addResponseHeader("X-Powered-By","DanSON Gateway Service")
//						)
//						.uri("http://localhost:8081")
//				)
//				.route(r -> r.path("/comments/**")
//						.filters(f -> f
//								.prefixPath("/api")
//								.addResponseHeader("X-Powered-By","DanSON Gateway Service")
//						)
//						.uri("http://localhost:8082")
//				)
//				.build();
//	}

}
