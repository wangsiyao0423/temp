/*
 * Zzt_JIF_Classroomtype.java
 *
 * Created on __DATE__, __TIME__
 */

package zzt.view;

import ggc.dao.GGC_ClassroomtypeAddTable;
import ggc.dao.GGC_OfficeAddTable;
import ggc.view.throw_classroomtype;
import ggc.view.throw_office;
import global.dao.Classrommtypeaccess;
import global.dao.Databaseconnection;
import global.dao.Departmentaccess;
import global.dao.ExcelFileFilter;
import global.dao.Fileselection;
import global.dao.Viewofficeaccess;
import global.model.Department;
import global.model.View_office;
import global.model.View_teacher;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import czy.model.Tools;

import zxx.dao.PrintObjectExcel;
import zzt.model.Classroomtype;

/**
 *
 * @author  zzt
 */
public class Zzt_JIF_Classroomtype extends javax.swing.JInternalFrame {

	private View_teacher ct;
	private int ct_id;
	private int d_id_int;

	/** Creates new form Zzt_JIF_Classroomtype */
	public Zzt_JIF_Classroomtype() {
		//��ʼ������
		initComponents();
	}

	public Zzt_JIF_Classroomtype(View_teacher ct) {
		//��ʼ������
		initComponents();
		//�����ݵĲ�������¼�û�����ͼ�����ݸ���Ķ�Ӧ�����ֶ�
		this.ct = ct;
		fillroomtype();
		// ���ú�����ʼ��ѧԺ�����б�
	}

	public void fillroomtype() {
		//���ȸ�ct_id������Ϊ��ʼ0
		int ct_id = 0;
		//����DefaultTableModel �õ�jtble1�����ϵ�ģ��
		DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
		//���ñ����������0��ʼ����
		dtm.setRowCount(0);
		//��ʼ��ArrayList�б���ͨ��ct_id������ѯclassroomtype�����ű���
		ArrayList<Classroomtype> alist = Classrommtypeaccess
				.getClassroomtypes(ct_id);
		// ������ʦ���͵������б�
		for (int i = 0; i < alist.size(); i++) {
			// ȡ����Ӧ�ֶ���Ϣ
			int ct_id_zzt = alist.get(i).getCt_id();
			String ct_name = alist.get(i).getCt_name();
			// �����������ͱ���
			Vector v = new Vector();
			v.add(ct_id_zzt);
			v.add(ct_name);
			// ���������ӵ�������
			dtm.addRow(v);
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton7 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();

		jButton7.setText("jButton7");

		setTitle("\u6559\u5ba4\u7c7b\u578b");

		jLabel1.setText("\u6559\u5ba4\u7c7b\u578b\u7f16\u53f7\uff1a");

		jTextField1.setEditable(false);

		jLabel2.setText("\u6559\u5ba4\u7c7b\u578b\u540d\u79f0\uff1a");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "�������ͱ��", "������������" }) {
			boolean[] canEdit = new boolean[] { false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jButton1.setText("\u6dfb\u52a0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u4fee\u6539");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u5220\u9664");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u9000\u51fa");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setText("\u6570\u636e\u5bfc\u51fa");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setText("\u5bfc\u5165");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton8.setText("\u5bfc\u5165\u683c\u5f0f\u5bfc\u51fa");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		169,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextField2,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		281,
																		Short.MAX_VALUE))
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														633, Short.MAX_VALUE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		73,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		69,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		68,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton4,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		71,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(44, 44,
																		44)
																.addComponent(
																		jButton6,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		71,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(12, 12,
																		12)
																.addComponent(
																		jButton5,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		92,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton8)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(29, 29, 29)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(jLabel2)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										230,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jButton4,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		38,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jButton3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		38,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		39,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		39,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jButton6,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		37,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jButton5,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		37,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jButton8,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		36,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(33, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//���õ����������ļ���·�������tabletwo������
		File Filename = Fileselection.exportselect();
		File filenametow = new File(Filename + ".xls");
		String filetable = filenametow.toString();
		//		 System.out.println(Filename+".xls");
		int ct_id =  0;
		//ʵ���������б����Ѳ�����Ϣ�����calist������
		ArrayList<Classroomtype> caList =Classrommtypeaccess.getClassroomtypes(ct_id);
		List<Classroomtype> list = new ArrayList<Classroomtype>();
		//����excel��ͷ��Ϣ
		String[] header = { "�������ͱ��", "������������"};
		//		 File Filename =new File() ;
		//		 System.out.println(Filename);
		//		
		JFileChooser fDialog = new JFileChooser();
		if (Filename == null) {
			//			 System.out.println("�ļ���Ϊnull");
			return;
		}
		//��ô�õ�����֮����ļ���
		if (filenametow.exists()) {
			System.out.println(filenametow.exists());
			int overwriteSelect = JOptionPane.showConfirmDialog(this,
					"<html><font size=3>�ļ�" + filenametow.getName()
							+ "�Ѵ��ڣ��Ƿ񸲸�?</font><html>", "�Ƿ񸲸�?",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			System.out.println(overwriteSelect);
			if (overwriteSelect == JOptionPane.YES_OPTION) {

				List<String> aList = PrintObjectExcel.printExcel(caList,
						filetable, header);
				if (aList.size() == 0) {
					JOptionPane.showMessageDialog(this, "�����ɹ�", "��ʾ��Ϣ",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					String str = "";
					for (String item : aList) {
						str += item + "\n";
					}
					JOptionPane.showMessageDialog(this, str, "������Ϣ",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				return;
			}
		}
		List<String> aList = PrintObjectExcel.printExcel(caList, filetable,
				header);
		if (aList.size() == 0) {
			JOptionPane.showMessageDialog(this, "�����ɹ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			String str = "";
			for (String item : aList) {
				str += item + "\n";
			}
			JOptionPane.showMessageDialog(this, str, "������Ϣ",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//���õ����������ļ���·�������tabletwo������
		File Filename = Fileselection.exportselect();
		File filenametow = new File(Filename + ".xls");
		String filetable = filenametow.toString();
		//		 System.out.println(Filename+".xls");
		int ct_id = 0;
		//ʵ���������б����Ѳ�����Ϣ�����calist������
		ArrayList<Classroomtype> caList = Classrommtypeaccess
				.getClassroomtypes(ct_id);
		List<Classroomtype> list = new ArrayList<Classroomtype>();
		//����excel��ͷ��Ϣ
		String[] header = { "�������ͱ��", "������������" };
		//		 File Filename =new File() ;
		//		 System.out.println(Filename);
		//		
		JFileChooser fDialog = new JFileChooser();
		if (Filename == null) {
			//			 System.out.println("�ļ���Ϊnull");
			return;
		}
		//��ô�õ�����֮����ļ���
		if (filenametow.exists()) {
			System.out.println(filenametow.exists());
			int overwriteSelect = JOptionPane.showConfirmDialog(this,
					"<html><font size=3>�ļ�" + filenametow.getName()
							+ "�Ѵ��ڣ��Ƿ񸲸�?</font><html>", "�Ƿ񸲸�?",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			System.out.println(overwriteSelect);
			if (overwriteSelect == JOptionPane.YES_OPTION) {

				List<String> aList = PrintObjectExcel.printExcel(caList,
						filetable, header);
				if (aList.size() == 0) {
					JOptionPane.showMessageDialog(this, "�����ɹ�", "��ʾ��Ϣ",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					String str = "";
					for (String item : aList) {
						str += item + "\n";
					}
					JOptionPane.showMessageDialog(this, str, "������Ϣ",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				return;
			}
		}
		List<String> aList = PrintObjectExcel.printExcel(caList, filetable,
				header);
		if (aList.size() == 0) {
			JOptionPane.showMessageDialog(this, "�����ɹ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			String str = "";
			for (String item : aList) {
				str += item + "\n";
			}
			JOptionPane.showMessageDialog(this, str, "������Ϣ",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		JFileChooser fDialog = new JFileChooser();
		// ��ʼ��ExcelFileFilter�ļ����͹�����
		ExcelFileFilter excelFilter = new ExcelFileFilter();
		// �����ı�������
		fDialog.addChoosableFileFilter(excelFilter);
		// �����ļ�ѡ���ı���
		fDialog.setFileFilter(excelFilter);
		// ����ļ�
		fDialog.setDialogTitle("��ѡ���ļ�");
		// ����ѡ���
		int returnVal = fDialog.showOpenDialog(null);
		// ����table���������洢Ҫ����ļ���·��
		String table = fDialog.getSelectedFile().toString();
		//		System.out.println(table);
		// ��ʼ��office_List����,���ж��Ĵ�����Ϣ����office_List�����б���
		List<String> classroomtype_List = GGC_ClassroomtypeAddTable.getClassroomtypeThrow(table);
		//		System.out.println(department_List);
		// �ж�office_List�Ĵ�����Ϣ����,���Ϊ������ɹ�,ˢ��ҳ��
		if (classroomtype_List.size() == 0 || classroomtype_List == null) {
			JOptionPane.showMessageDialog(this, "����ɹ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			fillroomtype();
		} else {
			// ���ȶ���һ���ַ�������Ϊstr
			String str = "";
			// ���������б�������Ϣ
			for (String item : classroomtype_List) {
				// �ѱ������Ĵ�����Ϣ,��ŵ�str��������
				str += item + "\n";
			}
			// ��ʾ��Ϣ���Ѵ�����Ϣ�����ǰ̨ҳ�浱�У�
			//			JOptionPane.showMessageDialog(this, str, "��ʾ��Ϣ",
			//					JOptionPane.ERROR_MESSAGE);
			throw_classroomtype th = new throw_classroomtype(null, true);
			th.infomation(str);
			th.setVisible(true);
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// TODO add your handling code here:
		// ��¼jtble1����ǰ����
		int i = jTable1.getSelectedRow();
		// ���i==-1��˵��û��ѡ����
		if (i == -1) {
			// ��ʾ��Ϣ����ѡ��Ҫ�޸ĵļ�¼
			JOptionPane.showMessageDialog(this, "��ѡ��Ҫ�޸ĵļ�¼", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		// �����ʦ���ͱ���ı�����û����������
		if (jTextField1.getText().equals("")) {
			// ��ʾ��Ϣ:�����벿�ű��
			JOptionPane.showMessageDialog(this, "������������ͱ�ţ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField1.requestFocus();
			return;
		}

		// �����ʦ���������ı�����û����������
		if (jTextField2.getText().equals("")) {
			// ��ʾ��Ϣ:�����벿������
			JOptionPane.showMessageDialog(this, "����������������ƣ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField2.requestFocus();
			return;
		}
		// ����һ�����������jtable1�ĵ�i�е�0�е��ַ���
		int ct_id = (Integer) jTable1.getValueAt(i, 0);
		// ����һ�����������jtable1�ĵ�i�е�1�е��ַ���
		String ct_name = (String) jTable1.getValueAt(i, 1);
		// ����һ��d_id_zzt���������õ����ͱ���ı��������
		int ct_id_zzt = Integer.parseInt(jTextField1.getText());
		// ����һ��d_name_zzt�����õ����������ı��������
		String ct_name_zzt = jTextField2.getText();
		// �������ݿ�Ϊ��
		Connection con = null;
		try {
			// �������ݿ�����
			con = Databaseconnection.getconnection();
			//�������ݿ���Զ��ύ��ʽΪfalse
			con.setAutoCommit(false);
			// �����ǰ���ı�������ݺ�ѡ�еĶ�Ӧ���е�ֵ��ƥ���ʱ,˵���û�Ҫ�޸���Ϣ��
			if (!(ct_id_zzt == ct_id)) {
				// �������ݿ��ѯ���ű���ֶ�ֵ,�����ǰ���ݿ��Ӧ���ֶ������ֵ�����û���ǰ�Ѿ������ֵ�������
				if (Classrommtypeaccess.findid(con, ct_id_zzt)) {
					// ��ʾ��Ϣ�����ͱ���Ѿ�����
					JOptionPane.showMessageDialog(this, "�������ͱ���Ѿ���������������",
							"������Ϣ", JOptionPane.ERROR_MESSAGE);
					// ���ͱ���ı����ý���
					jTextField1.requestFocus();
					// ���������ı���ȫѡ
					jTextField1.selectAll();
					return;
				}
			}
			if (!(ct_name_zzt.equals(ct_name))) {
				if (Classrommtypeaccess.findname(con, ct_name_zzt)) {
					// ��ʾ��Ϣ�����������Ѿ�����
					JOptionPane.showMessageDialog(this, "�������������Ѿ���������������",
							"������Ϣ", JOptionPane.ERROR_MESSAGE);
					// jTextField1�ı����ý���
					jTextField2.requestFocus();
					// jtexfField1�ı���ȫѡ
					jTextField2.selectAll();
					return;
				}
			}
			// �ж���ǰ����������ͱ�ź��������������ݿ�������Ƿ��ظ�,����ظ�����ʾ��Ϣ
			if ((ct_id_zzt == ct_id) && (ct_name_zzt.equals(ct_name))) {
				// ��ʾ��Ϣ:��������Ҫ�޸ĵ���Ϣ��
				JOptionPane.showMessageDialog(this, "��������Ҫ�޸ĵ���Ϣ��", "��ʾ��Ϣ",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			// ����һ������r�����洢update�������صĽ����
			int r = Classrommtypeaccess.update(con, ct_id, new Classroomtype(
					ct_id_zzt, jTextField2.getText()));
			// ������������0�Ļ�
			if (r > 0) {
				// ��ʾ��Ϣ�޸ĳɹ�
				JOptionPane.showMessageDialog(this, "�޸ĳɹ�", "��ʾ��Ϣ",
						JOptionPane.INFORMATION_MESSAGE);
				jTextField1.setText("");
				jTextField2.setText("");
				//�������ݿ��ֶ��ύ��ʽ
				con.commit();
				// ����fillroomtype��������ʵʱˢ�±���
				fillroomtype();
			} else {
				// ������ʾ��Ϣ���޸�ʧ������ϵ����Ա
				JOptionPane.showMessageDialog(this, "�޸�ʧ������ϵ����Ա", "��ʾ��Ϣ",
						JOptionPane.ERROR_MESSAGE);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				//������ݿ�����쳣,��ع�
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//��¼jtble1��嵱ǰ������
		int i = jTable1.getSelectedRow();
		jTable1.setRowSelectionAllowed(true);
		String zztString = "";
		String zzt = "";
		int ct_id = 0;
		int number = 0;
		//���i==-1��˵��û��ѡ����
		if (i == -1) {
			//��ʾ��Ϣ����ѡ��Ҫ�޸ĵļ�¼
			JOptionPane.showMessageDialog(this, "��ѡ��Ҫɾ���ļ�¼", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		} else {
			//����һ���������row��ŵ�ǰѡ�е�������
			int[] row = jTable1.getSelectedRows();
			//����һ��count�����������
			int count = row.length;
			//��������
			for (int a = 0; a < count; a++) {
				//����һ����������Ų��ű�ŵĵ�row[a]�е�0��
				ct_id = (Integer) jTable1.getValueAt(row[a], 0);
				//����һ�����ַ�������st
				String st = ",";
				zzt = "(" + (zztString += ct_id + (st)) + ")";
				//�����������ɾ���������Ҫ���sql���
				if (zzt.endsWith(")")) {
					zzt = zzt.substring(0, zzt.length() - 2) + ")";
				}
			}

			//��ʾ��Ϣ,ȷ��Ҫɾ����ǰ��¼�,���ȷ������ɾ����ǰѡ�еļ�¼
			int r = JOptionPane.showConfirmDialog(this, "ȷ��Ҫɾ����ǰ��¼�", "ȷ����Ϣ",
					JOptionPane.OK_CANCEL_OPTION);
			if (r == 0) {
				Connection con = null;
				try {
					//�������ݿ�����
					con = Databaseconnection.getconnection();
					//�������ݿ����ӵ��Զ��ύΪ(false)
					con.setAutoCommit(false);
					//����һ�����ͱ���re����Ž����
					int re;
					//��re����¼ɾ�����ű�ŵķ����Ľ����
					re = Classrommtypeaccess.Delete(con, zzt);
					//��������  > 0 ��ɾ���ɹ�
					if (re > 0) {
						JOptionPane.showMessageDialog(this, "ɾ����¼�ɹ���", "ȷ����Ϣ",
								JOptionPane.INFORMATION_MESSAGE);
						//�������ݿ���ֶ��ύ
						con.commit();
						//ʵʱˢ��jtble1��������
						fillroomtype();
						jTextField1.setText("");
						jTextField2.setText("");
					} else {
						JOptionPane.showMessageDialog(this,
								"ɾ��ʧ�ܣ�����ϵ����Ա������ز�����", "������Ϣ",
								JOptionPane.ERROR_MESSAGE);
					}

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					//��������쳣������д���,����һ��str����,������ŷ���sql�������״ֵ̬
					String str = "23000";
					//�����ǰ���ʵ�״ֵ̬����str,����ʾ��Ӧ��Ϣ
					if (e.getSQLState().equals(str)) {
						JOptionPane.showMessageDialog(this,
								"���ڴ˱�������Լ��Ӱ��,��ʱ����ɾ����", "��ʾ��Ϣ",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String ct_name = jTextField2.getText();
		// �����ʦ���������ı�������Ϊ��
		if (ct_name.equals("")) {
			// ��ʾ��Ϣ����ʦ�������Ʋ���Ϊ�գ�
			JOptionPane.showMessageDialog(this, "�������Ʋ���Ϊ�գ�");
			jTextField2.requestFocus();
			return;
		}

		Connection con = null;
		int zhujian = 0;
		int ct_int = 0;
		try {
			// �������ݿ�����
			con = Databaseconnection.getconnection();
			//�Ѳ�ѯ��ʦ���ͱ�ŵ����ֵ����max�Ľ����
			ResultSet max = Classrommtypeaccess.findmax(con);
			//��������������������ҵ����ֵ��ֵ��zhujian����
			while (max.next()) {
				zhujian = max.getInt("ct_id");
			}
			//������ű��û������,������һ�����Ϊ��01��������
			if (zhujian == 0) {
				ct_int = 1;
			} else {
				//����һ�����α���,������ŵ�ǰ���ű����������ֵ��һ
				ct_int = (zhujian) + 1;
				//�ڰ��Ѿ��ӹ�һ�����α���ת��Ϊ�ַ�������d_str������
			}
			//ʵ������ʦ���͵Ĺ��췽��
			Classroomtype cy = new Classroomtype(ct_int, ct_name);
			// �������ݿ���Զ��ύ��ʽΪfalse
			con.setAutoCommit(false);
			// �������ݿ��ѯ��ʦ���������ֶ�ֵ,�����ǰ���ݿ��Ӧ�Ľ�ʦ���������ֶ������ֵ�����û���ǰ�Ѿ������ֵ�������
			if (Classrommtypeaccess.findname(con, ct_name)) {
				// ��ʾ��Ϣ�����������Ѿ�����
				JOptionPane.showMessageDialog(this, "���������Ѿ���������������", "������Ϣ",
						JOptionPane.ERROR_MESSAGE);
				// ��ʦ���������ı����ý���
				jTextField2.requestFocus();
				// ��ʦ���������ı���ȫѡ
				jTextField2.selectAll();
				return;
			}
			// ����r������Ž����
			int r = Classrommtypeaccess.insert(con, cy);
			// ���r>=1
			if (r >= 1) {
				// ����ʾ��Ϣ�����ӳɹ���
				JOptionPane.showMessageDialog(this, "���ӳɹ���");
				// ��ʼ���ݿ���ֶ��ύ��ʽ
				con.commit();
				fillroomtype();
				jTextField1.setText("");
				jTextField2.setText("");
			}
			// ���r����1����ʾ��Ϣ���ű�Ų���ʧ�ܣ�����ϵϵͳ����Ա��
			if (r < 1) {

				Tools.connectionroolback(con, "���ű�Ų���ʧ�ܣ�����ϵϵͳ����Ա��");
				return;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
		} finally {
			try {
				con.rollback();
				if (!con.isClosed())
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int row = jTable1.getSelectedRow();
		jTextField1.setText(jTable1.getValueAt(row, 0).toString());
		jTextField2.setText((String) jTable1.getValueAt(row, 1));
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}