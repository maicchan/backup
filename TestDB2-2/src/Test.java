
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        TestUserDAO dao = new TestUserDAO();
        dao.select("tako","321");
        dao.selectAll();
        dao.selectByName("tako");
        dao.selectByPassword("654");
        dao.updateUserNameByUserName("tako","doburo");
        dao.insert(4, "shiro", "012");
        dao.delete("shiro");
	}

}
