package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {
	public static void main(String[] args) {
		
		String path = "c:\\temp";
		String fileName = "stream.txt";
		
		OutputStream os = null;
		try {
			// ��Ʈ�� ����
//			os = new FileOutputStream(path + "\\"+ fileName);
			os = new FileOutputStream(path +System.getProperty("file.separator")+ fileName);
			
			String data = "abc\n�ѱ�\n1234";
			byte[] datas = data.getBytes();
			
			//����
			os.write(datas, 0, datas.length);
			//���ۿ� ���� ������ ��� ���
			os.flush();
			
//			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		saveTxt("����� ���� �ȶ��ϳ�");

		
	}
	static void saveTxt(String data) {
		String path = "c:\\temp";
		String fileName = "stream2.txt";
		// try-with-resources
		// close�� �ڵ����� ����
		try(OutputStream os = new FileOutputStream(path +System.getProperty("file.separator")+ fileName);){
			
			byte[] datas = data.getBytes();
			
			//����
			os.write(datas, 0, datas.length);
			//���ۿ� ���� ������ ��� ���
			os.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}




}
