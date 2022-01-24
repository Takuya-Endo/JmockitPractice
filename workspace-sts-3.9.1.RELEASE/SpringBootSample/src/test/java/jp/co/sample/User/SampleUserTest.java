package jp.co.sample.User;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import mockit.Tested;

class SampleUserTest {

	private SampleUser sut = new SampleUser();
	private SampleUser compared = new SampleUser();
	
	@BeforeEach
	void setUp() throws Exception {
		this.compared.setId("id");
		this.compared.setName("name");
		this.compared.setAge("age");
	}
	
//	@Disabled
	@Test
	void testEquals等値() {
		boolean actual = this.sut.equals(this.sut);
		boolean expected = true;
		assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testEquals型違い() {
		boolean actual = this.sut.equals(new Object());
		boolean expected = false;
		assertThat(actual, is(expected));
	}
	
	class Child extends SampleUser {
		private String test;
		@Override
		public boolean equals(final Object obj) {
			if (obj == this) return true;
			return false;
		}
	}
	@Disabled
	@Test
	void testEqualsCanEqual() {
		Object child = new Child();
		Object test = this.sut;
		boolean actual = test.equals(child);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
	@Disabled
	@Test
	void testEquals_1の4() {
		this.compared.setId(null);
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
	@Disabled
	@Test
	void testEquals_2の4() {
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
	@Disabled
	@Test
	void testEquals_3の4() {
		this.sut.setId("id");
		this.compared.setId(null);
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
	@Disabled
	@Test
	void testEquals_4の4() {
		this.sut.setId("id");
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
	

	//各フィールドにつき、上の1の4～4の4が必要
	//ただし、ifがtrueの場合は、処理が先に進んで同時に網羅可能→両方nullと両方同じ値の2パターン
	//うち1パターンをcanEqual検証と同時に行えばさらに減らせ、各フィールド、falseの早期リターンを2パターンで済む
	
	
//	@Disabled
	@Test
	void testEquals_00() {
		this.compared.setId(null);
		this.compared.setName(null);
		this.compared.setAge(null);
		boolean actual = this.sut.equals(this.compared);
		boolean expected = true;
		assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testEquals_01() {
		this.sut.setId("id");
		this.sut.setName("name");
		this.sut.setAge("age");
		boolean actual = this.sut.equals(this.compared);
		boolean expected = true;
		assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testEquals_02() {
		this.sut.setId("id");
		this.sut.setName("name");
		this.sut.setAge(null);
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testEquals_03() {
		this.sut.setId("id");
		this.sut.setName(null);
		this.sut.setAge("age");
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testEquals_04() {
		this.sut.setId("id");
		this.sut.setName(null);
		this.sut.setAge(null);
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testEquals_05() {
		this.sut.setId(null);
		this.sut.setName("name");
		this.sut.setAge("age");
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testEquals_06() {
		this.sut.setId(null);
		this.sut.setName("name");
		this.sut.setAge(null);
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testEquals_07() {
		this.sut.setId(null);
		this.sut.setName(null);
		this.sut.setAge("age");
		boolean actual = this.sut.equals(this.compared);
		boolean expected = false;
		assertThat(actual, is(expected));
	}
	
	
	
	
	@Disabled
	@Test
	void testGetId() {
		this.sut.setId("test");
		String actual = this.sut.getId();
		String expected = "test";
		Assert.assertThat(actual, is(expected));
	}
	@Disabled
	@Test
	void testGetName() {
		this.sut.setName("test");
		String actual = this.sut.getName();
		String expected = "test";
		Assert.assertThat(actual, is(expected));
	}
	@Disabled
	@Test
	void testGetAge() {
		this.sut.setAge("test");
		String actual = this.sut.getAge();
		String expected = "test";
		Assert.assertThat(actual, is(expected));
	}
	
	@Disabled
	@Test
	void testToString() {
		String actual = this.sut.toString();
		String expected = "jp.co.sample.User.SampleUser@485e36bc";
//		Assert.assertThat(actual, is(expected));
	}

	@Disabled
	@Test
	void testHashCodeNull() {
		int actual = this.sut.hashCode();
		int expected = 1520267010;
//		Assert.assertThat(actual, is(expected));
	}
	@Disabled
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
