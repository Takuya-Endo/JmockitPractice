package jp.co.sample.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.Model;

import jp.co.sample.entity.TblMember;
import jp.co.sample.mapper.MstPlaceMapper;
import jp.co.sample.mapper.MstPositionMapper;
import jp.co.sample.mapper.TblMemberMapper;
import jp.co.sample.service.TblMemberService;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;
import mockit.Verifications;

@ExtendWith(SpringExtension.class)
//@ContextConfiguration(locations = {"file:src/test/ApplicationContext.xml"})
public class TblMemberControllerTest {

	
	//※記述の順番に注意　注入されるクラスを上に書く
	@Tested  //DI - 注入されたテスト対象クラス（自作のため）
	private TblMemberService tblMemberService;
	
	//※記述の順番に注意　呼び出す側のクラスは下に書く
	@Tested(fullyInitialized = true) //SUT - テスト対象システム
	//どちらの書き方でも動く
//	@Tested //SUT - テスト対象システム
	private TblMemberController sut;

	
	@Injectable
	private TblMemberMapper tblMemberMapper;
	@Injectable
	private MstPositionMapper mstPositionMapper;
	@Injectable
	private MstPlaceMapper mstPlaceMapper;
	
	
	@Injectable //@Mocked
	private Model model;
	
	@Disabled
	@Test
	public void testList() {
		fail("まだ実装されていません");
	}

	@Test
	public void testDetail() {
		
		//SetUp - 事前処理
		new Expectations() {{
			tblMemberMapper.findById("1");
			TblMember tblMember = new TblMember();
			tblMember.setMemberId("1");
			tblMember.setMemberName("TestUser");
			result = tblMember;
		}};

//		//Mapperがインターフェースのため失敗するものの、動作自体は上のnew Expectations()と同じになる。
//		//SetUp - 事前処理
//		new MockUp<TblMemberMapper>() {
//			@Mock
//			TblMember findById(String id) {
//				TblMember tblMember = new TblMember();
//				tblMember.setMemberId(id);
//				tblMember.setMemberName("TestUser");
//				return tblMember;
//			}
//		};
		
		//Execute - テスト実行
		String actualString = this.sut.detail("1", this.model);
			//@Autowiredでもテスト対象の為。この呼び出しによって、Verifications()のtimesが変わる点には注意。
			TblMember actualTblMember = this.tblMemberService.findById("1");
		
		
		//Verify - モック記録（findById呼出回数チェック）
		new Verifications() {{
//			tblMemberMapper.findById("5"); //テスト失敗
//			tblMemberMapper.findById("1"); //テスト成功
			tblMemberMapper.findById(anyString); //テスト成功
//			times = 1; //テスト失敗
			minTimes = 2; //テスト成功
		}};
		
		//Verify - 実体Serviceクラスが正しいObjectを返しているか
		assertThat(actualTblMember, is(notNullValue()));
		assertThat(actualTblMember.getMemberId(), is("1"));
		assertThat(actualTblMember.getMemberName(), is("TestUser"));
		
		
		//Verify - 表示するhtmlファイル検証
		String expectedString = "tblMember/detail";
		assertThat(actualString, is(expectedString));
		
	}

	@Disabled
	@Test
	public void testEdit() {
		fail("まだ実装されていません");
	}

	@Disabled
	@Test
	public void testEditConf() {
		fail("まだ実装されていません");
	}

	@Disabled
	@Test
	public void testUpdate() {
		fail("まだ実装されていません");
	}

	@Disabled
	@Test
	public void testCreate() {
		fail("まだ実装されていません");
	}

	@Disabled
	@Test
	public void testCreateConf() {
		fail("まだ実装されていません");
	}

	@Disabled
	@Test
	public void testInsert() {
		fail("まだ実装されていません");
	}

	@Disabled
	@Test
	public void testDelete() {
		fail("まだ実装されていません");
	}

	@Disabled
	@Test
	public void testSearch() {
		fail("まだ実装されていません");
	}

}
