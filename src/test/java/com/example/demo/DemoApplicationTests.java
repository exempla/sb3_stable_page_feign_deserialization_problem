package com.example.demo;

import static com.example.demo.Controller.PAGE;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DemoApplicationTests {
	@Autowired Client client;

	@Test
	void pageMetadataIsCorrectlyParsed() {
		Page<Integer> page = client.page();
		assertEquals(PAGE.getContent(), page.getContent());
		assertEquals(PAGE.getTotalElements(), page.getTotalElements());
		assertEquals(PAGE.getTotalPages(), page.getTotalPages());
	}

}
