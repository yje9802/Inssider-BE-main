package com.example.webtemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebtemplateApplicationTests {

	@Autowired
	BuildProperties buildProperties;

	@Test
	void contextLoads() {
		// build/resources/main/META-INF/build-info.properties
		LocalDate buildDate = buildProperties.getTime().atZone(ZoneOffset.UTC).toLocalDate();
		LocalDate today = LocalDate.now(ZoneOffset.UTC);

		assertEquals(today, buildDate);
		assertEquals("0.0.10-SNAPSHOT", buildProperties.getVersion());
		assertEquals("webtemplate", buildProperties.getArtifact());
		assertEquals("webtemplate", buildProperties.getName());
		assertEquals("com.example", buildProperties.getGroup());
	}
}
