package com.hisoft.DAO;

import java.util.List;

public interface INewsDao {
	//�����û�����ҳ�룬��ѯ����ҳ������
	
	public List getNewsData(int num);
	//���������
	public int getTotalRow();
	
	
}
