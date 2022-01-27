package jp.co.sample.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mockit.Mocked;

class SampleCreateDaoTest {

	@Mocked private SampleDao sampleDao;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		new SampleCreateDao().createDao();
	}

}
