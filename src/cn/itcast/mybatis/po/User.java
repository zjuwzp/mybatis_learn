package cn.itcast.mybatis.po;

import java.util.Date;

/**
 * 
 * <p>Title: User</p>
 * <p>Description:�û�po </p>
 * <p>Company: www.itcast.com</p> 
 * @author	����.����
 * @date	2015-4-22����10:24:16
 * @version 1.0
 */
public class User {
	
	//�����������ݿ����ֶζ�Ӧ
	private int id;
	private String username;// �û�����
	private String sex;// �Ա�
	private Date birthday;// ����
	private String address;// ��ַ
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address + "]";
	}


}
