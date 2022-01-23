package jp.co.sample.entity;

import static org.hamcrest.CoreMatchers.is;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;

@ExtendWith(SpringExtension.class)
class TblMemberTest {

	@Tested
	private TblMember sut = new TblMember();
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.compared.setSearchMemberName("");
		this.compared.setAgeLower(1);
		this.compared.setAgeUpper(1);
		this.compared.setSearchPositionId("");
		this.compared.setSearchPlaceId("");
		this.compared.setMemberId("");
		this.compared.setMemberName("");
		this.compared.setAge("");
		this.compared.setSexFlg(1);
		this.compared.setAddress("");
		this.compared.setTelephone("");
		this.compared.setMail("");
		this.compared.setPositionId("");
		this.compared.setPositionName("");
		this.compared.setPlaceId("");
		this.compared.setPlaceName("");
		this.compared.setRegistDate(new Date("2021/10/10"));
		this.compared.setUpdateDate(new Date("2020/10/10"));
		this.compared.setDeleteFlg(1);
		
	}

	@Test
	void testGetter() {
		this.sut.getSearchMemberName();
		this.sut.getAgeLower();
		this.sut.getAgeUpper();
		this.sut.getSearchPositionId();
		this.sut.getSearchPlaceId();
		this.sut.getMemberId();
		this.sut.getMemberName();
		this.sut.getAge();
		this.sut.getSexFlg();
		this.sut.getAddress();
		this.sut.getTelephone();
		this.sut.getMail();
		this.sut.getPositionId();
		this.sut.getPositionName();
		this.sut.getPlaceId();
		this.sut.getPlaceName();
		this.sut.getRegistDate();
		this.sut.getUpdateDate();
		this.sut.getDeleteFlg();
		this.sut.setSexFlg(0);
		this.sut.getSexType();
		this.sut.setDeleteFlg(0);
		this.sut.getDeleteType();
		this.sut.setSexFlg(1);
		this.sut.getSexType();
		this.sut.setDeleteFlg(1);
		this.sut.getDeleteType();
	}
	
	@Test
	void testToString() {
		String actual = this.sut.toString();
		String expected = "TblMember(searchMemberName=null, ageLower=null, ageUpper=null, searchPositionId=null, searchPlaceId=null, memberId=null, memberName=null, age=null, sexFlg=null, address=null, telephone=null, mail=null, positionId=null, positionName=null, placeId=null, placeName=null, registDate=null, updateDate=null, deleteFlg=null)";
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	void testHashCode_01() {
		int actual = this.sut.hashCode();
		int expected = -961347670;
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	void testHashCode_02() {
		this.sut.setSearchMemberName("");
		this.sut.setAgeLower(1);
		this.sut.setAgeUpper(1);
		this.sut.setSearchPositionId("");
		this.sut.setSearchPlaceId("");
		this.sut.setMemberId("");
		this.sut.setMemberName("");
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2021/10/10"));
		this.sut.setDeleteFlg(1);
		int actual = this.sut.hashCode();
		int expected = 551060827;
		Assert.assertThat(actual, is(expected));
	}
	
	
	@Test
	void testEquals等値() {
		boolean actual = this.sut.equals(this.sut);
		boolean expected = true;
		Assert.assertThat(actual, is(expected));
	}
	
	@Test
	void testEquals型違い() {
		boolean actual = this.sut.equals(new Object());
		boolean expected = false;
		Assert.assertThat(actual, is(expected));
	}
	
	private TblMember compared = new TblMember();
	
	@Test
	void testEquals等価_00() {
		
		this.sut.setSearchMemberName("");
		this.sut.setAgeLower(1);
		this.sut.setAgeUpper(1);
		this.sut.setSearchPositionId("");
		this.sut.setSearchPlaceId("");
		this.sut.setMemberId("");
		this.sut.setMemberName("");
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = true;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_01() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(1);
		this.sut.setAgeUpper(1);
		this.sut.setSearchPositionId("");
		this.sut.setSearchPlaceId("");
		this.sut.setMemberId("");
		this.sut.setMemberName("");
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_02() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(1);
		this.sut.setSearchPositionId("");
		this.sut.setSearchPlaceId("");
		this.sut.setMemberId("");
		this.sut.setMemberName("");
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_03() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId("");
		this.sut.setSearchPlaceId("");
		this.sut.setMemberId("");
		this.sut.setMemberName("");
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_04() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId("");
		this.sut.setMemberId("");
		this.sut.setMemberName("");
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_05() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId("");
		this.sut.setMemberName("");
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_06() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName("");
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_07() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge("");
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_08() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(1);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_09() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress("");
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_10() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone("");
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_11() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail("");
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_12() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail(null);
		this.sut.setPositionId("");
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_13() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail(null);
		this.sut.setPositionId(null);
		this.sut.setPositionName("");
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_14() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail(null);
		this.sut.setPositionId(null);
		this.sut.setPositionName(null);
		this.sut.setPlaceId("");
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_15() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail(null);
		this.sut.setPositionId(null);
		this.sut.setPositionName(null);
		this.sut.setPlaceId(null);
		this.sut.setPlaceName("");
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_16() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail(null);
		this.sut.setPositionId(null);
		this.sut.setPositionName(null);
		this.sut.setPlaceId(null);
		this.sut.setPlaceName(null);
		this.sut.setRegistDate(new Date("2021/10/10"));
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_17() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail(null);
		this.sut.setPositionId(null);
		this.sut.setPositionName(null);
		this.sut.setPlaceId(null);
		this.sut.setPlaceName(null);
		this.sut.setRegistDate(null);
		this.sut.setUpdateDate(new Date("2020/10/10"));
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_18() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail(null);
		this.sut.setPositionId(null);
		this.sut.setPositionName(null);
		this.sut.setPlaceId(null);
		this.sut.setPlaceName(null);
		this.sut.setRegistDate(null);
		this.sut.setUpdateDate(null);
		this.sut.setDeleteFlg(1);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	
	@Test
	void testEquals等価_19() {
		
		this.sut.setSearchMemberName(null);
		this.sut.setAgeLower(null);
		this.sut.setAgeUpper(null);
		this.sut.setSearchPositionId(null);
		this.sut.setSearchPlaceId(null);
		this.sut.setMemberId(null);
		this.sut.setMemberName(null);
		this.sut.setAge(null);
		this.sut.setSexFlg(null);
		this.sut.setAddress(null);
		this.sut.setTelephone(null);
		this.sut.setMail(null);
		this.sut.setPositionId(null);
		this.sut.setPositionName(null);
		this.sut.setPlaceId(null);
		this.sut.setPlaceName(null);
		this.sut.setRegistDate(null);
		this.sut.setUpdateDate(null);
		this.sut.setDeleteFlg(null);
		
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
		
	}
	

	@Test
	void testEqualsCanEqual() {
		new MockUp<TblMember>() {
			@Mock
			public boolean canEqual(final Object other) {
				return false;
			}
		};
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		
		Assert.assertThat(actual, is(expected));
	}
	@Test
	void testCanEqual() {
		boolean actual = this.sut.canEqual(new Object());
		boolean expected = false;
		Assert.assertThat(actual, is(expected));
	}

	
//	@Disabled
	@Test
	void testTblMember238行目_01() {
		this.sut.setAgeLower(null);	
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		Assert.assertThat(actual, is(expected));
	}
//	@Disabled
	@Test
	void testTblMember238行目_02() {
		this.sut.setAgeLower(null);	
		this.compared.setAgeLower(null);
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		Assert.assertThat(actual, is(expected));
	}
	@Disabled
	@Test
	void testTblMember238行目_03() {
		this.sut.setAgeLower(1);	
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		Assert.assertThat(actual, is(expected));
	}
	@Disabled
	@Test
	void testTblMember238行目_04() {
		this.sut.setAgeLower(2);	
		boolean actual = this.sut.equals(compared);
		boolean expected = false;
		Assert.assertThat(actual, is(expected));
	}
	
}
