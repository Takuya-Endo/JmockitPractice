package jp.co.sample.entity;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mockit.Tested;

@ExtendWith(SpringExtension.class)
class TblMemberTest {

	@Tested
	private TblMember sut = new TblMember();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testHashCode() {
		
		boolean actual = this.sut.equals(new Object());
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}

}
