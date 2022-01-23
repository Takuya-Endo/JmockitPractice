package jp.co.sample.User;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleUserTest {

	private SampleUser sut = new SampleUser();
	private SampleUser compared = new SampleUser();
	
	@BeforeEach
	void setUp() throws Exception {
		this.compared.setId("id");
		this.compared.setName("name");
		this.compared.setAge("age");
	}

	
	@Test
	void testEquals等値() {
		boolean actual = this.sut.equals(this.sut);
		boolean expected = true;
		assertThat(actual, is(expected));
	}
	@Test
	void testEquals型違い() {
		boolean actual = this.sut.equals(new Object());
		boolean expected = false;
		assertThat(actual, is(expected));
	}
	
	@Test
	void testEquals_01() {
		this.sut.setId("id");
		this.sut.setName("name");
		this.sut.setAge("age");
		boolean actual = this.sut.equals(this.compared);
		boolean expected = true;
		assertThat(actual, is(expected));
	}
	@Test
	void testEquals_02() {
		this.sut.setId("id");
		this.sut.setName("name");
		this.sut.setAge("age");
		boolean actual = this.sut.equals(this.compared);
		boolean expected = true;
		assertThat(actual, is(expected));
	}
	
	
	
	
	@Test
	void testGetId() {
		this.sut.setId("test");
		String actual = this.sut.getId();
		String expected = "test";
		Assert.assertThat(actual, is(expected));
	}
	@Test
	void testGetName() {
		this.sut.setName("test");
		String actual = this.sut.getName();
		String expected = "test";
		Assert.assertThat(actual, is(expected));
	}
	@Test
	void testGetAge() {
		this.sut.setAge("test");
		String actual = this.sut.getAge();
		String expected = "test";
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	void testToString() {
		String actual = this.sut.toString();
		String expected = "jp.co.sample.User.SampleUser@485e36bc";
//		Assert.assertThat(actual, is(expected));
	}

	@Test
	void testHashCodeNull() {
		int actual = this.sut.hashCode();
		int expected = 1520267010;
		Assert.assertThat(actual, is(expected));
	}
	@Test
	void testHashCode() {
		this.sut.setId("id");
		this.sut.setName("name");
		this.sut.setAge("age");
		int actual = this.sut.hashCode();
		int expected = 712627377;
//		Assert.assertThat(actual, is(expected));
	}
	
}
