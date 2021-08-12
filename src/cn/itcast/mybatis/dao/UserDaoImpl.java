package cn.itcast.mybatis.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.itcast.mybatis.po.User;

/**
 * 
 * <p>
 * Title: UserDaoImpl
 * </p>
 * <p>
 * Description:dao�ӿ�ʵ����
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author ����.����
 * @date 2015-4-22����2:47:17
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {

	// ��Ҫ��daoʵ������ע��SqlSessionFactory
	// ����ͨ�����췽��ע��
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public User findUserById(int id) throws Exception {
		//SqlSession���̲߳���ȫ�ģ�����Ӧ��д�ں�������
		SqlSession sqlSession = sqlSessionFactory.openSession();

		User user = sqlSession.selectOne("test.findUserById", id);
		//��һ�о�Ȼ�������ⲻ���ڳ���Ա������˵���������Է��ͽ���
		//User user = sqlSession.selectOne("test.findUserById", new Date());    

		// �ͷ���Դ
		sqlSession.close();

		return user;

	}
	
	@Override
	public List<User> findUserByName(String name) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<User> list = sqlSession.selectList("test.findUserByName", name);

		// �ͷ���Դ
		sqlSession.close();

		return list;
	}
	

	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		//ִ�в������
		sqlSession.insert("test.insertUser", user);

		// �ύ����
		sqlSession.commit();

		// �ͷ���Դ
		sqlSession.close();

	}

	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		//ִ�в������
		sqlSession.delete("test.deleteUser", id);

		// �ύ����
		sqlSession.commit();

		// �ͷ���Դ
		sqlSession.close();

	}
}