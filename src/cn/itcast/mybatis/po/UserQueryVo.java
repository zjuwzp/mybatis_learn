package cn.itcast.mybatis.po;

import java.util.List;

/**
 * 
 * <p>Title: UserQueryVo</p>
 * <p>Description:��װ���� </p>
 * <p>Company: www.itcast.com</p> 
 * @author	����.����
 * @date	2015-4-22����4:24:44
 * @version 1.0
 */
public class UserQueryVo {
	
	//������id
	private List<Integer> ids;
	
	
	//�������װ����Ҫ�Ĳ�ѯ����
	
	//�û���ѯ����
	private UserCustom userCustom;

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
	//���԰�װ�����Ĳ�ѯ��������������Ʒ
	//....
}
