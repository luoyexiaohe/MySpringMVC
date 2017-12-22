package hfy.model.books;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.stereotype.Service;

import hyf.model.init.BaseFacade;

@Service(value="books.booksFacade")
public class BooksFacade extends BaseFacade{

	public BooksFacade() {
		System.out.println("BooksFacade had Init !");
	}
	/**
	 * ��ȡbook��Ϣ
	 * @author John
	 * @return
	 * @throws SQLException
	 * 2017��10��15�� ����9:53:03
	 */
	public Map getBook() throws SQLException{
		Map resultMap = this.Dao.query("select * from book");
		return resultMap;
	}
	
	public void addBook() throws Exception{
		this.Dao.update("update book set bookId = '456' where id='123'");
	}
}
