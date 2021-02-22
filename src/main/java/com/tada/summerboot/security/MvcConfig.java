package com.tada.summerboot.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	public void addViewControllers(ViewControllerRegistry registry) {
		//Map the browser's URL to a specific View (HTML) inside resources/templates directory
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/error").setViewName("error");
		registry.addViewController("/product").setViewName("product");
		registry.addViewController("/every").setViewName("shop_all");
		registry.addViewController("/about").setViewName("about");
		registry.addViewController("/contact").setViewName("contact");
		registry.addViewController("/delivery").setViewName("delivery");
		registry.addViewController("/advertising").setViewName("advertising");
		registry.addViewController("/affiliates").setViewName("affiliates");
		registry.addViewController("/checkout_success").setViewName("checkout_success");
		registry.addViewController("/exchanges_returns").setViewName("exchanges_returns");
		registry.addViewController("/faq").setViewName("faq");
		registry.addViewController("/payment").setViewName("payment");
		registry.addViewController("/privacy_policy").setViewName("privacy_policy");
		registry.addViewController("/shopping_cart").setViewName("shopping_cart");
		registry.addViewController("/terms_and_conditions").setViewName("terms_and_conditions");


		//Just to demo fragments
		registry.addViewController("/fragment1").setViewName("fragment1");
		registry.addViewController("/fragment2").setViewName("fragment2");

		registry.addViewController("/cart").setViewName("cart");
		registry.addViewController("/view-cart").setViewName("view-cart");

	}
}

