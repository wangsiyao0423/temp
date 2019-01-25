/*
 * Zzt_JIF_Classinfomation.java
 *
 * Created on __DATE__, __TIME__
 */

package zzt.view;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hssf.record.Margin;

import zxx.dao.PrintObjectExcel;

import czy.model.Tools;

import global.dao.Classinformationaccess;
import global.dao.Classinformationtwoaccess;
import global.dao.Databaseconnection;
import global.dao.Departmentaccess;
import global.dao.Fileselection;
import global.dao.Teachingplanaccess;
import global.dao.Viewmajoraccess;
import global.model.Classinformation;
import global.model.Department;
import global.model.Fillcombobox;
import global.model.Level;
import global.model.Major;
import global.model.Office;
import global.model.Teacher;
import global.model.View_classinformation;
import global.model.View_major;
import global.model.View_teacher;

/**
 * 
 * @author __USER__
 */
public class Zzt_JIF_Classinfomation extends javax.swing.JInternalFrame {

	private View_teacher cf;
	private String o_id;
	private String m_id;
	private int l_id;
	private int cla_number;
	private String d_id;

	/** Creates new form Zzt_JIF_Classinfomation */
	public Zzt_JIF_Classinfomation() {
		initComponents();
	}

	public Zzt_JIF_Classinfomation(View_teacher cf) {
		initComponents();
		this.cf = cf;
		Fillcombobox.filldepartmentadd(d_id, jComboBox1);
		jComboBox1.setSelectedItem(null);
		jComboBox2.setSelectedItem(null);
		jComboBox3.setSelectedItem(null);
		jComboBox4.setSelectedItem(null);
		Fillcombobox.filllevel(l_id, jComboBox4);
	}

	public void fillclassinformation() {
		DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
		dtm.setRowCount(0);
		Major mj = (Major) jComboBox3.getSelectedItem();
		if (mj == null)
			return;
		Department dm = (Department) jComboBox1.getSelectedItem();
		if (dm == null)
			return;
		Office of = (Office) jComboBox2.getSelectedItem();
		if (of == null)
			return;

		Level lv = (Level) jComboBox4.getSelectedItem();
		if (lv == null)
			return;
		ArrayList<View_classinformation> alist = Classinformationtwoaccess
				.getView_classinformation(lv.getL_id());
		if (alist.size() == 0)
			return;
		for (int i = 0; i < alist.size(); i++) {
			String d_name = alist.get(i).getD_name();
			String o_name = alist.get(i).getO_name();
			String m_name = alist.get(i).getM_name();
			String cla_id = alist.get(i).getCla_id();
			String cla_name = alist.get(i).getCla_name();
			String l_name = alist.get(i).getL_name();
			String cla_grade = alist.get(i).getCla_grade();
			int cla_number = alist.get(i).getCla_number();
			Vector v = new Vector();
			v.add(d_name);
			v.add(o_name);
			v.add(m_name);
			v.add(cla_id);
			v.add(cla_name);
			v.add(cla_grade);
			v.add(l_name);
			v.add(cla_number);
			dtm.addRow(v);
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

jPanel1 = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
jComboBox1 = new javax.swing.JComboBox();
jLabel2 = new javax.swing.JLabel();
jComboBox2 = new javax.swing.JComboBox();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jComboBox3 = new javax.swing.JComboBox();
jLabel5 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
jTextField4 = new javax.swing.JTextField();
jScrollPane1 = new javax.swing.JScrollPane();
jTable1 = new javax.swing.JTable();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jLabel7 = new javax.swing.JLabel();
jButton5 = new javax.swing.JButton();
jTextField1 = new javax.swing.JTextField();
jTextField2 = new javax.swing.JTextField();
jLabel8 = new javax.swing.JLabel();
jTextField3 = new javax.swing.JTextField();
jComboBox4 = new javax.swing.JComboBox();
jButton7 = new javax.swing.JButton();
jButton8 = new javax.swing.JButton();

setClosable(true);
setIconifiable(true);
setMaximizable(true);
setTitle("\u73ed\u7ea7\u4fe1\u606f\u7ba1\u7406");

jLabel1.setText("\u90e8\u95e8\u540d\u79f0\uff1a");

jComboBox1.addItemListener(new java.awt.event.ItemListener() {
public void itemStateChanged(java.awt.event.ItemEvent evt) {
jComboBox1ItemStateChanged(evt);
}
});

jLabel2.setText("\u79d1\u5ba4\u540d\u79f0\uff1a");

jComboBox2.addItemListener(new java.awt.event.ItemListener() {
public void itemStateChanged(java.awt.event.ItemEvent evt) {
jComboBox2ItemStateChanged(evt);
}
});
jComboBox2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jComboBox2ActionPerformed(evt);
}
});

jLabel3.setText("\u73ed\u7ea7\u540d\u79f0\uff1a");

jLabel4.setText("\u73ed\u7ea7\u5c42\u6b21\uff1a");

jComboBox3.addItemListener(new java.awt.event.ItemListener() {
public void itemStateChanged(java.awt.event.ItemEvent evt) {
jComboBox3ItemStateChanged(evt);
}
});

jLabel5.setText("\u73ed\u7ea7\u7ea7\u522b\uff1a");

jLabel6.setText("\u73ed\u7ea7\u4eba\u6570\uff1a");

jTable1.setModel(new javax.swing.table.DefaultTableModel(
	new Object [][] {
		
	},
	new String [] {
		"��������", "��������", "רҵ����", "�༶���", "�༶����", "�༶����", "�༶���", "�༶����"
	}
));
jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
jTable1MouseClicked(evt);
}
public void mouseEntered(java.awt.event.MouseEvent evt) {
jTable1MouseEntered(evt);
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

jLabel7.setText("\u4e13\u4e1a\u540d\u79f0\uff1a");

jButton5.setText("\u5bfc\u5165");

jLabel8.setText("\u73ed\u7ea7\u7f16\u53f7\uff1a");

jComboBox4.addItemListener(new java.awt.event.ItemListener() {
public void itemStateChanged(java.awt.event.ItemEvent evt) {
jComboBox4ItemStateChanged(evt);
}
});

jButton7.setText("\u5bfc\u51fa\u754c\u9762\u683c\u5f0f");
jButton7.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton7ActionPerformed(evt);
}
});

jButton8.setText("\u5bfc\u51fa\u8f93\u5165\u683c\u5f0f");
jButton8.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton8ActionPerformed(evt);
}
});

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(38, 38, 38)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jComboBox1, 0, 219, Short.MAX_VALUE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel4)
.addGroup(jPanel1Layout.createSequentialGroup()
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jLabel5)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
.addComponent(jComboBox4, 0, 219, Short.MAX_VALUE))))
.addGap(43, 43, 43)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabel2)
.addComponent(jLabel8)
.addComponent(jLabel6))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
.addComponent(jComboBox2, 0, 209, Short.MAX_VALUE)
.addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
.addGap(45, 45, 45)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabel7)
.addComponent(jLabel3))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jComboBox3, 0, 208, Short.MAX_VALUE)
.addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
.addGap(16, 16, 16))
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(194, 194, 194)
.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(54, 54, 54)
.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addContainerGap())
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(jLabel2)
.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel7))
.addGap(27, 27, 27)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel4)
.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel8)
.addComponent(jLabel3))
.addGap(28, 28, 28)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addComponent(jLabel6)
.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
.addContainerGap())
);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addContainerGap())
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);

pack();
}// </editor-fold>

	//GEN-END:initComponents
	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// TODO add your handling code here:
				// TODO add your handling code here:
						File Filename = Fileselection.exportselect();
						File filenametow = new File(Filename + ".xls");
						String filetable = filenametow.toString();
						int l_id = 0;
						//ʵ���������б����Ѳ�����Ϣ�����calist������
						ArrayList<Classinformation> caList = Classinformationaccess.Classinformationss(l_id);
						List<Classinformation> list = new ArrayList<Classinformation>();
						//����excel��ͷ��Ϣ
						String[] header = { "�༶���","רҵ���","�༶����","�༶����","�༶��α��","�༶����" };
						JFileChooser fDialog = new JFileChooser();
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

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// TODO add your handling code here:
				File Filename = Fileselection.exportselect();
				File filenametow = new File(Filename + ".xls");
				String filetable = filenametow.toString();
				int l_id = 0;
				//ʵ���������б����Ѳ�����Ϣ�����calist������
				ArrayList<View_classinformation> caList = Classinformationtwoaccess.getView_classinformation(l_id);
				List<View_classinformation> list = new ArrayList<View_classinformation>();
				//����excel��ͷ��Ϣ
				String[] header = { "���ű��","��������","���ұ��","��������","רҵ���","רҵ����","�༶���","�༶����","�༶����","�༶��α��","�༶���","�༶����" };
				JFileChooser fDialog = new JFileChooser();
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

	private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
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

		String cla_id = jTextField1.getText();
		Major m_id = (Major) jComboBox3.getSelectedItem();
		String mmm_id = m_id.getM_id();
		String cla_name = jTextField2.getText();
		String cla_grade = jTextField3.getText();
		Level lcLevel = (Level) jComboBox4.getSelectedItem();
		// int l_id = lcLevel.getL_id();
		int l_id = 1;
		int cla_number = Integer.parseInt(jTextField4.getText().toString());
		// ����һ�����������jtable1�ĵ�i�е�0�е��ַ���
		String cla_id_zzt = (String) jTable1.getValueAt(i, 3);
		// ����һ�����������jtable1�ĵ�i�е�1�е��ַ���
		String cla_name_zzt = (String) jTable1.getValueAt(i, 4);
		// ����һ��d_id_zzt���������õ�jTextField1�ı��������
		String cla_grade_zzt = (String) jTable1.getValueAt(i, 5);
		int cla_number_zzt = (Integer) jTable1.getValueAt(i, 6);

		// �������ݿ�Ϊ��
		Connection con = null;
		try {
			// �������ݿ�����
			con = Databaseconnection.getconnection();
			// �������ݿ���Զ��ύ��ʽΪfalse
			con.setAutoCommit(false);
			// �����ǰ���ı�������ݺ�ѡ�еĶ�Ӧ���е�ֵ��ƥ���ʱ,˵���û�Ҫ�޸���Ϣ��
			// if (!(cla_id.equals(cla_id_zzt))) {
			// // �������ݿ��ѯ���ű���ֶ�ֵ,�����ǰ���ݿ��Ӧ���ֶ������ֵ�����û���ǰ�Ѿ������ֵ�������
			// if (Departmentaccess.findid(con, cla_id)) {
			// // ��ʾ��Ϣ�����ͱ���Ѿ�����
			// JOptionPane.showMessageDialog(this, "���ű���Ѿ���������������",
			// "������Ϣ", JOptionPane.ERROR_MESSAGE);
			// // jTextField1�ı����ý���
			// jTextField1.requestFocus();
			// // jtexfField1�ı���ȫѡ
			// jTextField1.selectAll();
			// return;
			// }
			// }
			// if (!(cla_name.equals(cla_name_zzt))) {
			// if (Departmentaccess.findname(con, cla_name)) {
			// // ��ʾ��Ϣ�����������Ѿ�����
			// JOptionPane.showMessageDialog(this, "���������Ѿ���������������",
			// "������Ϣ", JOptionPane.ERROR_MESSAGE);
			// // jTextField1�ı����ý���
			// jTextField2.requestFocus();
			// // jtexfField1�ı���ȫѡ
			// jTextField2.selectAll();
			// return;
			// }
			// }
			// �ж���ǰ�������d_id��d_name�����ݿ������d_id��d_name�Ƿ��ظ�,����ظ�����ʾ��Ϣ
			if ((cla_id.equals(cla_id_zzt))
					&& (cla_name.equals(cla_name_zzt) && (cla_grade_zzt
							.equals(cla_grade) && (cla_number_zzt == cla_number_zzt)))) {
				// ��ʾ��Ϣ:��������Ҫ�޸ĵ���Ϣ��
				JOptionPane.showMessageDialog(this, "��������Ҫ�޸ĵ���Ϣ��", "��ʾ��Ϣ",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			// ����һ������r�����洢update�������صĽ����
			int r = Classinformationtwoaccess.update(con, cla_id,
					new Classinformation(cla_id, mmm_id, cla_name, cla_grade,
							l_id, cla_number));
			// ������������0�Ļ�
			if (r > 0) {
				// ��ʾ��Ϣ�޸ĳɹ�
				JOptionPane.showMessageDialog(this, "�޸ĳɹ�", "��ʾ��Ϣ",
						JOptionPane.INFORMATION_MESSAGE);
				jTextField1.setText("");
				jTextField2.setText("");
				// �������ݿ��ֶ��ύ��ʽ
				con.commit();
				// ����departmenttable��������ʵʱˢ�±���
				fillclassinformation();
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
				// ������ݿ�����쳣,��ع�
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO add your handling code here:
		fillclassinformation();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String cla_id = jTextField1.getText();
		Major m_id = (Major) jComboBox3.getSelectedItem();
		String mmm_id = m_id.getM_id();
		String cla_name = jTextField2.getText();
		String cla_grade = jTextField3.getText();
		Level lcLevel = (Level) jComboBox4.getSelectedItem();
		int l_id = lcLevel.getL_id();
		int cla_number = Integer.parseInt((String) jTextField4.getText());
		// �����ǰ���ı�������Ϊ��
		if (cla_id.equals("")) {
			// ��ʾ��Ϣ�����ű�Ų���Ϊ�գ�
			JOptionPane.showMessageDialog(this, "������༶��ţ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField1.requestFocus();
			return;
		}
		if (mmm_id.equals("")) {
			JOptionPane.showMessageDialog(this, "������ѡ��רҵ��", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField1.requestFocus();
			return;
		}
		// ������������ı�������Ϊ��
		if (cla_name.equals("")) {
			// ��ʾ��Ϣ���������Ʋ���Ϊ�գ�
			JOptionPane.showMessageDialog(this, "������༶���ƣ�", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField2.requestFocus();
			return;
		}
		if (cla_grade.equals("")) {
			// ��ʾ��Ϣ���������Ʋ���Ϊ�գ�
			JOptionPane.showMessageDialog(this, "������༶�ȼ���", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField3.requestFocus();
			return;
		}
		if (cla_number == 0) {
			// ��ʾ��Ϣ���������Ʋ���Ϊ�գ�
			JOptionPane.showMessageDialog(this, "������༶������", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			jTextField4.requestFocus();
			return;
		}
		Connection con = null;
		try {
			con = Databaseconnection.getconnection();
			// ʵ�������ŵĹ��췽��
			Classinformation Cf = new Classinformation(cla_id, mmm_id,
					cla_name, cla_grade, l_id, cla_number);
			// �������ݿ�����
			// �������ݿ���Զ��ύ��ʽΪfalse
			// con.setAutoCommit(false);
			// �������ݿ��ѯ���ű���ֶ�ֵ,�����ǰ���ݿ��Ӧ���ֶ������ֵ�����û���ǰ�Ѿ������ֵ�������
			if (Classinformationtwoaccess.findid(con, cla_id)) {
				// ��ʾ��Ϣ�����ͱ���Ѿ�����
				JOptionPane.showMessageDialog(this, "�༶����Ѿ���������������", "������Ϣ",
						JOptionPane.ERROR_MESSAGE);
				// jTextField1�ı����ý���
				jTextField1.requestFocus();
				// jtexfField1�ı���ȫѡ
				jTextField1.selectAll();
				return;
			}
			// �������ݿ��ѯd_name�ֶ�ֵ,�����ǰ���ݿ��Ӧ��d_name�ֶ������ֵ�����û���ǰ�Ѿ������ֵ�������
			if (Classinformationtwoaccess.findname(con, cla_name)) {
				// ��ʾ��Ϣ�����������Ѿ�����
				JOptionPane.showMessageDialog(this, "�༶�����Ѿ���������������", "������Ϣ",
						JOptionPane.ERROR_MESSAGE);
				// jTextField1�ı����ý���
				jTextField2.requestFocus();
				// jtexfField1�ı���ȫѡ
				jTextField2.selectAll();
				return;
			}
			// ����r������Ž����
			int r = Classinformationaccess.insert(con, Cf);
			// ���r>=1
			if (r >= 1) {
				// ����ʾ��Ϣ�����ӳɹ���
				JOptionPane.showMessageDialog(this, "���ӳɹ���");
				// ��ʼ���ݿ���ֶ��ύ��ʽ
				// con.commit();
				fillclassinformation();
				jTextField4.setText("");
				jTextField1.setText("");
			}
			// ���r<1
			if (r < 1) {
				// ����ʾ��Ϣ���ű�Ų���ʧ�ܣ�����ϵϵͳ����Ա��
				Tools.connectionroolback(con, "���ű�Ų���ʧ�ܣ�����ϵϵͳ����Ա��");
				return;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
		} finally {
			try {
				// con.rollback();
				if (!con.isClosed())
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// TODO add your handling code here:
		// TODO add your handling code here:
		// TODO add your handling code here:
		// ��¼jtble1��嵱ǰ������
		int i = jTable1.getSelectedRow();
		jTable1.setRowSelectionAllowed(true);
		String zztString = "";
		String zzt = "";
		// ���i==-1��˵��û��ѡ����
		if (i == -1) {
			// ��ʾ��Ϣ����ѡ��Ҫ�޸ĵļ�¼
			JOptionPane.showMessageDialog(this, "��ѡ��Ҫɾ���ļ�¼", "��ʾ��Ϣ",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		} else {
			// ����һ���������row��ŵ�ǰѡ�е�������
			int[] row = jTable1.getSelectedRows();
			// ����һ��count�����������
			int count = row.length;
			// ��������
			for (int a = 0; a < count; a++) {
				// ����һ����������Ų��ű�ŵĵ�row[a]�е�0��
				String t_id = (String) jTable1.getValueAt(row[a], 3);
				// ����һ�����ַ�������st
				String st = ",";
				// �����������ɾ���������Ҫ���sql���
				zzt = "(" + (zztString += "'" + t_id + "'" + (st)) + ")";
				// ���sql�������һ���ַ��ǡ�)����ɾ�������λ�ַ��ڼ���һ����)��
				if (zzt.endsWith(")")) {
					zzt = zzt.substring(0, zzt.length() - 2) + ")";
				}
			}
			// ��ʾ��Ϣ,ȷ��Ҫɾ����ǰ��¼�,���ȷ������ɾ����ǰѡ�еļ�¼
			int r = JOptionPane.showConfirmDialog(this, "ȷ��Ҫɾ����ǰ��¼�", "ȷ����Ϣ",
					JOptionPane.OK_CANCEL_OPTION);
			if (r == 0) {
				Connection con = null;
				try {
					// �������ݿ�����
					con = Databaseconnection.getconnection();
					// �������ݿ����ӵ��Զ��ύΪ(false)
					con.setAutoCommit(false);
					// ����һ�����ͱ���re����Ž����
					int re;
					// ��re����¼ɾ�����ű�ŵķ����Ľ����
					re = Classinformationaccess.Delete(con, zzt);
					// �������� > 0 ��ɾ���ɹ�
					if (re > 0) {
						JOptionPane.showMessageDialog(this, "ɾ����¼�ɹ���", "ȷ����Ϣ",
								JOptionPane.INFORMATION_MESSAGE);
						// �������ݿ���ֶ��ύ
						con.commit();
						// ʵʱˢ��jtble1��������
						fillclassinformation();
						jTextField4.setText("");
						jTextField1.setText("");
						jTextField2.setText("");
						jTextField4.setText("");
						jTextField3.setText("");
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
					// ��������쳣������д���,����һ��str����,������ŷ���sql�������״ֵ̬
					String str = "23000";
					// �����ǰ���ʵ�״ֵ̬����str,����ʾ��Ӧ��Ϣ
					if (e.getSQLState().equals(str)) {
						JOptionPane.showMessageDialog(this,
								"���ڴ˱�������Լ��Ӱ��,��ʱ����ɾ����", "��ʾ��Ϣ",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		}

	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int row = jTable1.getSelectedRow();
		jTextField1.setText((String) jTable1.getValueAt(row, 3));
		jTextField2.setText((String) jTable1.getValueAt(row, 4));
		jTextField3.setText((String) jTable1.getValueAt(row, 5));
		jTextField4.setText(jTable1.getValueAt(row, 7).toString());
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO add your handling code here:

		//		 Major mj = (Major) jComboBox3.getSelectedItem();
		//		 String m_id = mj.getM_id();
		//
		//		 if (mj == null) {
		//		 return;
		//		 }

		// Fillcombobox.filllevel(m_id, jComboBox4);
		// String m_id = mj.getM_id();
		// int cc=Integer.parseInt(m_id);
		// Fillcombobox.filllevel(cc,jComboBox4);
		// Fillcombobox.filllevel(cc, jComboBox4);
	}

	private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO add your handling code here:
		Office of = (Office) jComboBox2.getSelectedItem();
		if (of == null)
			return;
		String o_id = of.getO_id();
		Fillcombobox.fillmajor(o_id, jComboBox3);

	}

	private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO add your handling code here:
		Department dm = (Department) jComboBox1.getSelectedItem();
		if (dm == null)
			return;
		String d_id = dm.getD_id();
		//		System.out.println(d_id);
		Fillcombobox.filloffice(d_id, jComboBox2);
	}

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JComboBox jComboBox4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}