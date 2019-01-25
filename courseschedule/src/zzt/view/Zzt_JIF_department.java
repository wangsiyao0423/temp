/*
 * Zzt_JIF_department.java
 *
 * Created on __DATE__, __TIME__
 */

package zzt.view;

import global.dao.Databaseconnection;
import global.dao.Departmentaccess;
import global.dao.ExcelFileFilter;
import global.dao.Fileselection;
import global.dao.Majoraccess;
import global.dao.Teachingtaskaccess;
import global.model.Classroom;
import global.model.Curriculum;
import global.model.Department;
import global.model.Fillcombobox;
import global.model.Major;
import global.model.Office;
import global.model.Schoolyear;
import global.model.Teacher;
import global.model.View_teacher;
import global.model.View_teachingtask;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import czy.model.Tools;
import zxx.dao.DepartmentAddTable;
import zxx.dao.PrintObjectExcel;
import zxx.dao.TestFileChooserUI;

/**
 *���Ź�������
 *		  dt��
 *			Department����
 * @author  zzt
 */
public class Zzt_JIF_department extends javax.swing.JInternalFrame {
	private static final String String = null;
	private static final DepartmentAddTable DeptmentAddTable = null;
	private View_teacher dt;
	private int i1;
	private String file;
	private Connection con;
	private String[] args;
	private char[] department_List;
	private Connection conn;
	private String zhujian;
	private FileInputStream newFilename;

	/** Creates new form Zzt_JIF_department 
	 * @param department */
	public Zzt_JIF_department() {
		//��ʼ������
		initComponents();
	}

	public Zzt_JIF_department(View_teacher dt) {
		// ��ʼ������
		initComponents();
		// �����ݵĲ�������¼�û�����ͼ��Ϣ�����ݸ���Ķ�Ӧ�����ֶ�
		this.dt = dt;
		//���ú����ı����Ŀ���
		setColumnWidth();
		//���ú�����ʾ�û�����ͼ��Ϣ
		departmenttable();
	}

	/**
	 * �������
	 * 
	 * @author zzt
	 * @param vt
	 *            ����¼�û�����ͼ��Ϣ
	 */

	public void departmenttable() {
		//���ȸ�������Ϊ��ֵ
		String d_id = null;
		//����DefaultTableModel �õ�jtble1�����ϵ�ģ��
		DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
		//���ñ����������0��ʼ����
		dtm.setRowCount(0);
		//��ʼ��ArrayList�б���ͨ�����ű��������ѯdepartment�����ű���
		ArrayList<Department> aList = Departmentaccess.getDepartment(d_id);
		// �������ŵ������б�
		for (int i = 0; i < aList.size(); i++) {
			// ȡ����Ӧ�ֶ���Ϣ
			d_id = aList.get(i).getD_id();
			String d_name = aList.get(i).getD_name();
			// �����������ͱ���
			Vector v = new Vector();
			// ��ȡ���������ӵ�������
			v.add(d_id);
			v.add(d_name);
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

		jPanel1 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u90e8\u95e8\u7ba1\u7406");
		setOpaque(true);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.MatteBorder(null),
				"\u90e8\u95e8\u7ba1\u7406"));

		jTextField1.setEditable(false);

		jLabel2.setText("\u90e8\u95e8\u540d\u79f0\uff1a");

		jLabel1.setText("\u90e8\u95e8\u7f16\u53f7\uff1a");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												111,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												209,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "���ű��", "��������" }) {
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

		jButton2.setText("\u5220\u9664");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u4fee\u6539");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton5.setText("\u6570\u636e\u5bfc\u5165");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton4.setText("\u9000\u51fa");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton6.setText("\u5bfc\u51fa\u6570\u636e\u8f93\u5165\u683c\u5f0f");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("\u5bfc\u51fa\u6570\u636e\u754c\u9762\u683c\u5f0f");

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
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														558, Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		94,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		88,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jButton3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		90,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(12, 12,
																		12)
																.addComponent(
																		jButton4,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		93,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(36, 36,
																		36)
																.addComponent(
																		jButton5,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		115,
																		Short.MAX_VALUE)))
								.addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addGap(53, 53, 53)
								.addComponent(jButton7,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										229, Short.MAX_VALUE)
								.addGap(36, 36, 36)
								.addComponent(jButton6,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										224,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(46, 46, 46)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										246,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														34,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton6,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														35, Short.MAX_VALUE))
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * �������Ź�����Ϣ,��������Ϣ�����str��������
	 * 
	 * @author zzt
	 */
	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//���õ����������ļ���·�������tabletwo������
		File Filename = Fileselection.exportselect();
		File filenametow = new File(Filename + ".xls");
		String filetable = filenametow.toString();System.out.println(filetable);
		String d_id = null;
		//ʵ���������б����Ѳ�����Ϣ�����calist������
		ArrayList<Department> caList = Departmentaccess.getDepartment(d_id);
		//����excel��ͷ��Ϣ
		String[] header = { "���ű��", "��������" };
		if (Filename == null) {
			return;
		}
		//��ô�õ�����֮����ļ���
		if (filenametow.exists()) {
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

	/**
	 * ���벿�Ź�����Ϣ,��������Ϣ�����str��������
	 * 
	 * @author zzt
	 * 
	 */
	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		String table = TestFileChooserUI.main(String);
		List<String> department_List = DepartmentAddTable
				.getDepartmentThrow(table);
		// �ж�department_List�Ĵ�����Ϣ����,���Ϊ������ɹ�,ˢ��ҳ��
		if (department_List.size() == 0 || department_List == null) {
			JOptionPane.showMessageDialog(this, "����ɹ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			departmenttable();

		} else {
			// ���ȶ���һ���ַ�������Ϊstr
			String str = "";
			// ���������б�������Ϣ
			for (String item : department_List) {
				// �ѱ������Ĵ�����Ϣ,��ŵ�str��������
				str += item + "\n";
			}
			// ��ʾ��Ϣ���Ѵ�����Ϣ�����ǰ̨ҳ�浱�У�
			throw_ok th = new throw_ok(null, true);
			th.infomation(str);
			th.setVisible(true);
		}
	}

	/**
	 * ɾ�����Ź�����Ϣ
	 * 
	 * @author zzt
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		//��¼jtble1��嵱ǰ������
		int i = jTable1.getSelectedRow();
		jTable1.setRowSelectionAllowed(true);
		String zztString = "";
		String zzt = "";
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
				String d_id = (String) jTable1.getValueAt(row[a], 0);
				//����һ�����ַ�������st
				String st = ",";
				//�����������ɾ���������Ҫ���sql���
				zzt = "(" + (zztString += "'" + d_id + "'" + (st)) + ")";
				//���sql�������һ���ַ��ǡ�)����ɾ�������λ�ַ��ڼ���һ����)��
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
					re = Departmentaccess.Delete(con, zzt);
					//��������  > 0 ��ɾ���ɹ�
					if (re > 0) {
						JOptionPane.showMessageDialog(this, "ɾ����¼�ɹ���", "ȷ����Ϣ",
								JOptionPane.INFORMATION_MESSAGE);
						//�������ݿ���ֶ��ύ
						con.commit();
						//ʵʱˢ��jtble1��������
						departmenttable();
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

	/**
	 * ���ñ���Ŀ���
	 * 
	 * @author zzt
	 */
	private void setColumnWidth() {
		TableColumn Column;
		// ���ý�ѧ���������п���
		Column = jTable1.getColumnModel().getColumn(0);
		Column.setPreferredWidth(50);
		Column = jTable1.getColumnModel().getColumn(1);
		Column.setPreferredWidth(250);
	}

	/**
	 * �޸Ĳ��Ź�����Ϣ
	 * 
	 * @author zzt
	 */
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
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
		// ���jTextField1�ı�����û����������
		if (jTextField1.getText().equals("")) {
			// ��ʾ��Ϣ:�����벿�ű��
			JOptionPane.showMessageDialog(this, "�����벿�ű�ţ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField1.requestFocus();
			return;
		}

		// ���jTextField2�ı�����û����������
		if (jTextField2.getText().equals("")) {
			// ��ʾ��Ϣ:�����벿������
			JOptionPane.showMessageDialog(this, "�����벿�����ƣ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField2.requestFocus();
			return;
		}
		// ����һ�����������jtable1�ĵ�i�е�0�е��ַ���
		String d_id = (String) jTable1.getValueAt(i, 0);
		// ����һ�����������jtable1�ĵ�i�е�1�е��ַ���
		String d_name = (String) jTable1.getValueAt(i, 1);
		// ����һ��d_id_zzt���������õ�jTextField1�ı��������
		String d_id_zzt = jTextField1.getText();
		// ����һ��d_name_zzt�����õ�jTextField2�ı��������
		String d_name_zzt = jTextField2.getText();
		// �������ݿ�Ϊ��
		Connection con = null;
		try {
			// �������ݿ�����
			con = Databaseconnection.getconnection();
			//�������ݿ���Զ��ύ��ʽΪfalse
			con.setAutoCommit(false);
			// �����ǰ���ı�������ݺ�ѡ�еĶ�Ӧ���е�ֵ��ƥ���ʱ,˵���û�Ҫ�޸���Ϣ��
			if (!(d_id_zzt.equals(d_id))) {
				// �������ݿ��ѯ���ű���ֶ�ֵ,�����ǰ���ݿ��Ӧ���ֶ������ֵ�����û���ǰ�Ѿ������ֵ�������
				if (Departmentaccess.findid(con, d_id_zzt)) {
					// ��ʾ��Ϣ�����ͱ���Ѿ�����
					JOptionPane.showMessageDialog(this, "���ű���Ѿ���������������",
							"������Ϣ", JOptionPane.ERROR_MESSAGE);
					// jTextField1�ı����ý���
					jTextField1.requestFocus();
					// jtexfField1�ı���ȫѡ
					jTextField1.selectAll();
					return;
				}
			}
			if (!(d_name_zzt.equals(d_name))) {
				if (Departmentaccess.findname(con, d_name_zzt)) {
					// ��ʾ��Ϣ�����������Ѿ�����
					JOptionPane.showMessageDialog(this, "���������Ѿ���������������",
							"������Ϣ", JOptionPane.ERROR_MESSAGE);
					// jTextField1�ı����ý���
					jTextField2.requestFocus();
					// jtexfField1�ı���ȫѡ
					jTextField2.selectAll();
					return;
				}
			}
			// �ж���ǰ�������d_id��d_name�����ݿ������d_id��d_name�Ƿ��ظ�,����ظ�����ʾ��Ϣ
			if ((d_id_zzt.equals(d_id)) && (d_name_zzt.equals(d_name))) {
				// ��ʾ��Ϣ:��������Ҫ�޸ĵ���Ϣ��
				JOptionPane.showMessageDialog(this, "��������Ҫ�޸ĵ���Ϣ��", "��ʾ��Ϣ",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			// ����һ������r�����洢update�������صĽ����
			int r = Departmentaccess.update(con, d_id, new Department(d_id_zzt,
					jTextField2.getText()));
			// ������������0�Ļ�
			if (r > 0) {
				// ��ʾ��Ϣ�޸ĳɹ�
				JOptionPane.showMessageDialog(this, "�޸ĳɹ�", "��ʾ��Ϣ",
						JOptionPane.INFORMATION_MESSAGE);
				jTextField1.setText("");
				jTextField2.setText("");
				//�������ݿ��ֶ��ύ��ʽ
				con.commit();
				// ����departmenttable��������ʵʱˢ�±���
				departmenttable();
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

	/**
	 * ���Ӳ��Ź�����Ϣ
	 * 
	 * @author zzt
	 */

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//�õ��������Ƶ��ı���
		String d_name_zzt = jTextField2.getText();
		if (d_name_zzt.equals("")) {
			//��ʾ��Ϣ���������Ʋ���Ϊ�գ�
			JOptionPane.showMessageDialog(this, "�������Ʋ���Ϊ�գ�");
			jTextField2.requestFocus();
			return;
		}
		Connection con = null;
		String zhujian = null;
		String d_str = "";
		try {
			con = Databaseconnection.getconnection();
			//�Ѳ�ѯ���ű�ŵ����ֵ����max�Ľ����
			ResultSet max = Departmentaccess.findmax(con);
			//��������������������ҵ����ֵ��ֵ��zhujian����
			while (max.next()) {
				zhujian = max.getString("d_id");
			}
			//������ű��û������,������һ�����Ϊ��01��������
			if (zhujian == null) {
				d_str = "01";
			} else {
				//����һ�����α���,������ŵ�ǰ���ű����������ֵ��һ
				int d_id_int = Integer.parseInt(zhujian) + 1;
				//�ڰ��Ѿ��ӹ�һ�����α���ת��Ϊ�ַ�������d_str������
				d_str = Integer.toString(d_id_int);
				//ʵ�������ŵĹ��췽��
			}
			//ʵ�������ŵĹ��췽��
			Department dt = new Department(d_str, d_name_zzt);
			// �������ݿ�����
			// �������ݿ���Զ��ύ��ʽΪfalse
			con.setAutoCommit(false);
			// �������ݿ��ѯd_name�ֶ�ֵ,�����ǰ���ݿ��Ӧ��d_name�ֶ������ֵ�����û���ǰ�Ѿ������ֵ�������
			if (Departmentaccess.findname(con, d_name_zzt)) {
				// ��ʾ��Ϣ�����������Ѿ�����
				JOptionPane.showMessageDialog(this, "���������Ѿ���������������", "������Ϣ",
						JOptionPane.ERROR_MESSAGE);
				// ���ű���ı����ý���
				jTextField2.requestFocus();
				// ���������ı���ȫѡ
				jTextField2.selectAll();
				return;
			}
			// ����r������Ž����
			int r = Departmentaccess.insert(con, dt);
			// ���r>=1
			if (r >= 1) {
				// ����ʾ��Ϣ�����ӳɹ���
				JOptionPane.showMessageDialog(this, "���ӳɹ���");
				// ��ʼ���ݿ���ֶ��ύ��ʽ
				con.commit();
				departmenttable();
				jTextField1.setText("");
				jTextField2.setText("");
			}
			// ���r<1����ʾ��Ϣ���ű�Ų���ʧ�ܣ�����ϵϵͳ����Ա��
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
				//������ݿ�����쳣,��ع�
				con.rollback();
				if (!con.isClosed())
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int row = jTable1.getSelectedRow();
		jTextField1.setText((String) jTable1.getValueAt(row, 0));
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
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}