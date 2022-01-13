package jp.co.sample.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
import mockit.Delegate;
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
	
//	@Injectable
//	TestPrivateMethod testPrivateMethod;
	
	@Disabled
	@Test
	public void testList() {
		fail("まだ実装されていません");
	}

	@Test
	public void testExperiment3() throws Exception {
		
		TestPrivateMethod testPrivateMethod = new TestPrivateMethod();
		Method returnFailMethod = TestPrivateMethod.class.getDeclaredMethod("returnFail");
		returnFailMethod.setAccessible(true);
		
		//private,staticメソッド対応要検証
		//protectedは可？
		
		//privateメソッドのモック化
		new MockUp<Method>() {
			@Mock
//			public Object invoke(Object obj, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			public Object invoke(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				return "success";
			}
		};
		
		//publicメソッドのモック化
		new Expectations() {{
			testPrivateMethod.returnString();
			Method returnFailMethod = TestPrivateMethod.class.getDeclaredMethod("returnFail");
			returnFailMethod.setAccessible(true);
			result = (String) returnFailMethod.invoke(testPrivateMethod);
		}};
		
		//publicメソッド呼び出しテスト
		String actual1 = testPrivateMethod.returnString();
		String expected1 = "success";
		assertThat(actual1, is(expected1));
		
	}
	
	@Disabled
	@Test
	public void testExperiment2() throws Exception {
		
		//publicメソッド呼び出しテスト
		TestPrivateMethod testPrivateMethod = new TestPrivateMethod();
		String actual1 = testPrivateMethod.returnString();
		String expected1 = "fail";
		assertThat(actual1, is(expected1));
		
		//privateメソッド呼び出しテスト
		Method returnFailMethod = TestPrivateMethod.class.getDeclaredMethod("returnFail");
		returnFailMethod.setAccessible(true);
		String actual2 = (String) returnFailMethod.invoke(testPrivateMethod);
		String expected2 = "fail";
		assertThat(actual2, is(expected2));
		
	}
	
	@Disabled
	@Test
	public void testExperiment1() throws Exception {
		
		//モックによる書き換え
		//Expectations()とMockUp<>()、どちらもprivateメソッドの場合は失敗する。
//		new MockUp<TestPrivateMethod>() {
//			@Mock
//			public String returnFail() {
//				return "success";
//			}
//		};
//		new Expectations() {{
//			testPrivateMethod.returnFail();
//			result = "success";
//		}};
		
		//reflectionを利用してprivateメソッドをスタブ化
//		TestPrivateMethod testPrivateMethod = new TestPrivateMethod();
//		Method returnFailMethod = TestPrivateMethod.class.getDeclaredMethod("returnFail");
//		returnFailMethod.setAccessible(true);
//		new Expectations() {{
//			String testString1 = (String) returnFailMethod.invoke(testPrivateMethod);
//			System.out.println(testString1);
//			result = "success";
//			String testString2 = (String) returnFailMethod.invoke(testPrivateMethod);
//			System.out.println(testString2);
//		}};
		
		
		//Execute - テスト実行
		String actual = this.sut.experiment();
		
		//Verify - 検証
//		String expected = "fail";
		String expected = "success";
		assertThat(actual, is(expected));
	
	}
	
	@Disabled
	@Test
	public void testDetail() {
		
//		//SetUp - 事前処理
//		new Expectations() {{
//			tblMemberMapper.findById("1");
//			TblMember tblMember = new TblMember();
//			tblMember.setMemberId("1");
//			tblMember.setMemberName("TestUser");
//			result = tblMember;
//		}};
		//↑
		//上はモック化したインスタンスのメソッド定義
		//従って、上の場合はフィールドか、テストメソッドの引数に@Mockedか@Injectableが必要。
		//下は実体があるインスタンスのメソッドを上書き
		//↓
		//SetUp - 事前処理
//		new MockUp<TblMemberService>() {
//			@Mock
//			TblMember findById(String id) {
//				TblMember tblMember = new TblMember();
//				tblMember.setMemberId(id);
//				tblMember.setMemberName("TestUser");
//				return tblMember;
//			}
//		};

		
		//SetUp - 事前処理
		new Expectations() {{
			//"1"など特定の値を入れる場合はこれで良い
			//anyString等も可
//			tblMemberMapper.findById("1");
//			TblMember tblMember = new TblMember();
//			tblMember.setMemberId("1");
//			tblMember.setMemberName("TestUser");
//			result = tblMember;
			//↓
			//しかし、実行時に実際受け取った値を使用する時は、
			//下のようにanyStringを使用すると、
			//ランダムな値が入り、受け取った値が使えない。
//			tblMemberMapper.findById(anyString);
//			TblMember tblMember = new TblMember();
//			tblMember.setMemberId(anyString);
//			tblMember.setMemberName("TestUser");
//			result = tblMember;
			//↓
			//そこで、任意の値を入れたい場合は、new Delegate()を使う。
			tblMemberMapper.findById(anyString);
			result = new Delegate() {
//				TblMember dummy(String str) { //Overrideしてるわけではないので、欲しい値を返せば、実際メソッド名は問わない。
				TblMember findById(String str) {
					TblMember tblMember = new TblMember();
					tblMember.setMemberId(str);
					tblMember.setMemberName("TestUser");
					return tblMember;
				}
			};
			
		}};
		
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
