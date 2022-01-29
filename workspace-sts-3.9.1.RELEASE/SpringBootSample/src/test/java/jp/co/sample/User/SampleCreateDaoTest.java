package jp.co.sample.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

class SampleCreateDaoTest {

	@Mocked private SampleDao sampleDao;
	
	@BeforeEach
	void setUp() throws Exception {
		
		new MockUp<SampleCreateDao>() {
			@Mock
			public Object createDao() {
				return sampleDao;
			}
		};
		
	}

	@Test
	void test() {
		new SampleCreateDao().createDao();
	}

}
