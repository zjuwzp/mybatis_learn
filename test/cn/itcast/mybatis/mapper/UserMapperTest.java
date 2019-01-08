package cn.itcast.mybatis.mapper;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.itcast.mybatis.po.User;
import cn.itcast.mybatis.po.UserCustom;
import cn.itcast.mybatis.po.UserQueryVo;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	// �˷�������ִ��testFindUserById֮ǰִ��
	@Before
	public void setUp() throws Exception {
		// ����sqlSessionFactory

		// mybatis�����ļ�
		String resource = "SqlMapConfig.xml";
		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����Ự����������mybatis�������ļ���Ϣ
		sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
	}
	
	//�û���Ϣ���ۺ� ��ѯ
	@Test
	public void testFindUserList() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����UserMapper����mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//������װ�������ò�ѯ����
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("������");
		userQueryVo.setUserCustom(userCustom);
		//����userMapper�ķ���
		
		List<UserCustom> list = userMapper.findUserList(userQueryVo);
		
		System.out.println(list);	
	}
	
	@Test
	public void testFindUserCount() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����UserMapper����mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//������װ�������ò�ѯ����
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("������");
		userQueryVo.setUserCustom(userCustom);
		//����userMapper�ķ���		
		int count = userMapper.findUserCount(userQueryVo);	
		System.out.println(count);				
	}
	
	@Test
	public void testFindUserById() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����UserMapper����mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//����userMapper�ķ���
		
		User user = userMapper.findUserById(1);
		
		System.out.println(user);
		
	}		

}