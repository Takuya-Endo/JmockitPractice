package jp.co.sample.User;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleCreateDaoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		new SampleCreateDao().createDao();
	}

}
