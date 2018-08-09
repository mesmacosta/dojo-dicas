package com.ebotelho.dev.config.ribbonclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

@Configuration
public class RibbonMusicaConfig {
	
	@Bean
	public IRule ribbonRule() {
		return new WeightedResponseTimeRule();
	}
}
