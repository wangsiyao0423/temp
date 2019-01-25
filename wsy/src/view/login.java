/*
 * login.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.View_Teacher;
import util.TeacherAccess;
import util.jdutil;
import util.login_access;

/**
 *view��
 * @author  __USER__
 */
public class login extends javax.swing.JFrame {

	/** Creates new form login */
	public login() {
		initComponents();
		setResizable(false);
		setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		label1 = new java.awt.Label();
		label2 = new java.awt.Label();
		textField1 = new java.awt.TextField();
		button1 = new java.awt.Button();
		button2 = new java.awt.Button();
		jPasswordField1 = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		label1.setText("\u7528\u6237");

		label2.setName("\u5bc6\u7801");
		label2.setText("\u5bc6\u7801");

		button1.setLabel("\u767b\u9646");
		button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button1ActionPerformed(evt);
			}
		});

		button2.setLabel("\u9000\u51fa");
		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button2ActionPerformed(evt);
			}
		});

		jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jPasswordField1KeyPressed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(82, 82,
																		82)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						label1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						label2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(36, 36,
																		36)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						textField1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jPasswordField1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						127,
																						Short.MAX_VALUE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(100,
																		100,
																		100)
																.addComponent(
																		button1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(76, 76,
																		76)
																.addComponent(
																		button2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(127, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(99, 99, 99)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														label1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														textField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(33, 33, 33)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														label2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jPasswordField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(31, 31, 31)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														button1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														button2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(67, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
		if (evt.getKeyChar()==evt.VK_ENTER) {
		String tname = textField1.getText();//ȡ�˺ſ�����
		String tpasswd = String.valueOf(jPasswordField1.getPassword());//ȡ���������
		try {
			Connection con = jdutil.getCon();//����������ݿ�
			if (con == null) {//������ݿ�����ʧ�����˳�
				return;
			}
			int re = login_access.T_login(con, tname, tpasswd);
			if (re == 1) {
				ArrayList<View_Teacher> teachers = TeacherAccess
						.getView_teacher(tname);//���÷�����view_teacher����ѯ���û�ȫ������
				View_Teacher teacher = teachers.get(0);//�����û����ݴ洢��teacher��
				new main(teacher).setVisible(true);//��teacher����main�����ﲢʹ����ʾ
				this.dispose();//�رյ�ǰ����
			} else if (re == 2) {
				JOptionPane.showMessageDialog(this, "�������");
				jPasswordField1.requestFocus();
				jPasswordField1.selectAll();
			} else if (re == -1) {
				JOptionPane.showMessageDialog(this, "�˺Ŵ���");
				textField1.requestFocus();
				textField1.selectAll();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}}
	}

	private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String tname = textField1.getText();//ȡ�˺ſ�����
		String tpasswd = String.valueOf(jPasswordField1.getPassword());//ȡ���������
		try {
			Connection con = jdutil.getCon();//����������ݿ�
			if (con == null) {//������ݿ�����ʧ�����˳�
				return;
			}
			int re = login_access.T_login(con, tname, tpasswd);
			if (re == 1) {
				ArrayList<View_Teacher> teachers = TeacherAccess
						.getView_teacher(tname);//���÷�����view_teacher����ѯ���û�ȫ������
				View_Teacher teacher = teachers.get(0);//�����û����ݴ洢��teacher��
				new main(teacher).setVisible(true);//��teacher����main�����ﲢʹ����ʾ
				this.dispose();//�رյ�ǰ����
			} else if (re == 2) {
				JOptionPane.showMessageDialog(this, "�������");
				jPasswordField1.requestFocus();
				jPasswordField1.selectAll();
			} else if (re == -1) {
				JOptionPane.showMessageDialog(this, "�˺Ŵ���");
				textField1.requestFocus();
				textField1.selectAll();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new login().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private java.awt.Button button1;
	private java.awt.Button button2;
	private javax.swing.JPasswordField jPasswordField1;
	private java.awt.Label label1;
	private java.awt.Label label2;
	private java.awt.TextField textField1;
	// End of variables declaration//GEN-END:variables

}