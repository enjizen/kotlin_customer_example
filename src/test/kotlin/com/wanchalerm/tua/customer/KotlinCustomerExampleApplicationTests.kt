package com.wanchalerm.tua.customer

import com.wanchalerm.tua.customer.constant.ResponseEnum
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinCustomerExampleApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun tttt(){
		val r = ResponseEnum.getByCode("40220")
		println(r.code)
	}

}
