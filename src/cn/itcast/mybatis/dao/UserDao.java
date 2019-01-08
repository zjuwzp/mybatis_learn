package cn.itcast.mybatis.dao;

import java.util.List;

import cn.itcast.mybatis.po.User;

/**
 * 
 * <p>Title: UserDao</p>
 * <p>Description: dao�ӿڣ��û�����</p>
 * <p>Company: www.itcast.com</p> 
 * @author	����.����
 * @date	2015-4-22����2:45:12
 * @version 1.0
 */
public interface UserDao {
	
	//����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;			//�����쳣����߽�׳��
	
	//�����û����в�ѯ�û��б�
	public List<User> findUserByName(String name) throws Exception;
	
	//����û���Ϣ
	public void insertUser(User user) throws Exception;
	
	//ɾ���û���Ϣ
	public void deleteUser(int id) throws Exception;
		
}
