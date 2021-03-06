/*
 * Zzt_if_main.java
 *
 * Created on __DATE__, __TIME__
 */

package zzt.view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.beans.PropertyVetoException;

import ggc.view.GGC_JIF_Building;
import ggc.view.GGC_JIF_Classroom;
import ggc.view.GGC_JIF_Office;
import global.dao.Teacheraccess;
import global.model.Buliding;
import global.model.Classinformation;
import global.model.Classroom;
import global.model.Course;
import global.model.Curriculum;
import global.model.Department;
import global.model.Major;
import global.model.Office;
import global.model.Schoolyear;
import global.model.Teacher;
import global.model.Teachingplan;
import global.model.Teachingtask;
import global.model.View_classinformation;
import global.model.View_classroom;
import global.model.View_course;
import global.model.View_teacher;
import global.model.View_teachingplan;
import global.model.View_teachingtask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import czy.view.CZY_jif_Experimentalenvironment;
import czy.view.CZY_jif_courselaboratory;
import czy.view.CZY_jif_curriculum;
import czy.view.CZY_jif_teachingtask;

import zzt.model.Classroomtype;
import zzt.model.Zzt_Teacher_login;

/**
 *
 * @author  __USER__
 */
public class Zzt_if_main extends javax.swing.JFrame {

	private static final View_teacher View_teacher = null;
	//	private static final Teacher Teacher = null;
	private global.model.View_teacher teacher;

	/** Creates new form Zzt_if_main 
	 * @param u */
	public Zzt_if_main() {
		initComponents();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public Zzt_if_main(View_teacher u) {
		teacher = u;
		initComponents();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jDesktopPane1 = new javax.swing.JDesktopPane();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenuItem11 = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JSeparator();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem15 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem13 = new javax.swing.JMenuItem();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenuItem12 = new javax.swing.JMenuItem();
		jMenuItem14 = new javax.swing.JMenuItem();
		jMenu6 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem10 = new javax.swing.JMenuItem();
		jMenuItem16 = new javax.swing.JMenuItem();
		jMenuItem17 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u4fe1\u606f\u5b66\u9662\u6392\u8bfe\u7cfb\u7edf");

		jMenu1.setText("\u7cfb\u7edf\u7ba1\u7406");

		jMenuItem1.setText("\u4fee\u6539\u5bc6\u7801");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuItem3.setText("\u9000\u51fa");
		jMenu1.add(jMenuItem3);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u57fa\u7840\u7ba1\u7406");

		jMenuItem5.setText("\u90e8\u95e8\u7ba1\u7406");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem5);

		jMenuItem7.setText("\u79d1\u5ba4\u7ba1\u7406");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem7);

		jMenuItem11.setText("\u4e13\u4e1a\u7ba1\u7406");
		jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem11ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem11);
		jMenu2.add(jSeparator1);

		jMenuItem6.setText("\u6559\u5b66\u697c\u7ba1\u7406");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem6);

		jMenuItem4.setText("\u6559\u5ba4\u7ba1\u7406");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem4);

		jMenuItem15.setText("\u6559\u5e08\u7c7b\u578b\u7ba1\u7406");
		jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem15ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem15);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("\u6559\u5b66\u5143\u7d20\u7ba1\u7406");

		jMenuItem13.setText("\u73ed\u7ea7\u4fe1\u606f\u7ba1\u7406");
		jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem13ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem13);

		jMenuItem8.setText("\u6559\u5e08\u4fe1\u606f\u7ba1\u7406");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem8);

		jMenuBar1.add(jMenu3);

		jMenu5.setText("\u6559\u5b66\u8ba1\u5212\u7ba1\u7406");

		jMenuItem9.setText("\u6559\u5b66\u65b9\u6848\u7ba1\u7406");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem9);

		jMenuItem12.setText("\u8bfe\u7a0b\u65b9\u6848\u7ba1\u7406");
		jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem12ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem12);

		jMenuItem14.setText("\u6559\u5b66\u8ba1\u5212");
		jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem14ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem14);

		jMenuBar1.add(jMenu5);

		jMenu6.setText("\u6559\u5b66\u7ba1\u7406");

		jMenuItem2.setText("\u6559\u5b66\u4efb\u52a1\u7ba1\u7406");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem2);

		jMenuItem10.setText("\u6392\u8bfe\u7ba1\u7406");
		jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem10ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem10);

		jMenuItem16.setText("\u5b9e\u9a8c\u73af\u5883\u7ba1\u7406");
		jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem16ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem16);

		jMenuItem17.setText("\u5b9e\u9a8c\u5ba4\u5206\u914d");
		jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem17ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem17);

		jMenuBar1.add(jMenu6);

		jMenu4.setText("\u5e2e\u52a9");
		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jDesktopPane1));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Zzt_JIF_course zc = new Zzt_JIF_course(teacher);
		zc.setVisible(true);
		jDesktopPane1.add(zc);
	}

	private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		teachingplangrade tg = new teachingplangrade(teacher);
		//		System.out.println(tg);
		tg.setVisible(true);
		jDesktopPane1.add(tg);
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Zzt_JIF_Changepassword zc = new Zzt_JIF_Changepassword(teacher);
		zc.setVisible(true);
		jDesktopPane1.add(zc);
	}

	private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		CZY_jif_courselaboratory cl = new CZY_jif_courselaboratory(teacher);
		cl.setVisible(true);
		jDesktopPane1.add(cl);
		Container contentPane = this.getContentPane();
		// 注意只有窗口显示后getLocationOnScreen才可以调用，否则出错
		Point contentPos = contentPane.getLocationOnScreen();// 在屏幕的坐标
		Dimension size = contentPane.getSize();
		cl.setMaximumSize(size);
		try {
			cl.setMaximizable(true);
			cl.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		CZY_jif_Experimentalenvironment ev = new CZY_jif_Experimentalenvironment(
				teacher);
		ev.setVisible(true);
		jDesktopPane1.add(ev);
		Container contentPane = this.getContentPane();
		// 注意只有窗口显示后getLocationOnScreen才可以调用，否则出错
		Point contentPos = contentPane.getLocationOnScreen();// 在屏幕的坐标
		Dimension size = contentPane.getSize();
		ev.setMaximumSize(size);
		try {
			ev.setMaximizable(true);
			ev.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Container contentPane = this.getContentPane();
		CZY_jif_curriculum cc = new CZY_jif_curriculum(teacher);
		cc.setVisible(true);
		jDesktopPane1.add(cc);
		// 注意只有窗口显示后getLocationOnScreen才可以调用，否则出错
		Point contentPos = contentPane.getLocationOnScreen();// 在屏幕的坐标
		Dimension size = contentPane.getSize();
		cc.setMaximumSize(size);
		try {
			cc.setMaximizable(true);
			cc.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Zzt_JIF_Classroomtype zc = new Zzt_JIF_Classroomtype(teacher);
		zc.setVisible(true);
		jDesktopPane1.add(zc);
	}

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Zzt_JIF_teachingplan zt = new Zzt_JIF_teachingplan(teacher);
		zt.setVisible(true);
		jDesktopPane1.add(zt);
	}

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		GGC_JIF_Building bu = new GGC_JIF_Building(teacher);
		bu.setVisible(true);
		jDesktopPane1.add(bu);
	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		GGC_JIF_Office of = new GGC_JIF_Office(teacher);
		of.setVisible(true);
		jDesktopPane1.add(of);
	}

	private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Zzt_JIF_Classinfomation cf = new Zzt_JIF_Classinfomation(teacher);
		cf.setVisible(true);
		jDesktopPane1.add(cf);
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Zzt_JIF_teacher vt = new Zzt_JIF_teacher(teacher);
		vt.setVisible(true);
		jDesktopPane1.add(vt);
	}

	private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Zzt_JIF_major maj = new Zzt_JIF_major(teacher);
		maj.setVisible(true);
		jDesktopPane1.add(maj);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		CZY_jif_teachingtask tt = new CZY_jif_teachingtask(teacher);
		//		CZY_jif_teachingtask tt = new CZY_jif_teachingtask(new View_teacher(
		//				"09", "信息工程学院", "0903", "计算机科学与技术系", "090007", "陈志勇", "123456",
		//				"系部排课", "1234567890"));
		//		System.out.println(tt);
		tt.setVisible(true);
		jDesktopPane1.add(tt);
		Container contentPane = this.getContentPane();
		// 注意只有窗口显示后getLocationOnScreen才可以调用，否则出错
		Point contentPos = contentPane.getLocationOnScreen();// 在屏幕的坐标
		Dimension size = contentPane.getSize();
		tt.setMaximumSize(size);
		try {
			tt.setMaximizable(true);
			tt.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Zzt_JIF_department zzt = new Zzt_JIF_department(teacher);
		zzt.setVisible(true);
		jDesktopPane1.add(zzt);
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		GGC_JIF_Classroom cl = new GGC_JIF_Classroom(teacher);
		cl.setVisible(true);
		jDesktopPane1.add(cl);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Zzt_if_main().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JMenuItem jMenuItem12;
	private javax.swing.JMenuItem jMenuItem13;
	private javax.swing.JMenuItem jMenuItem14;
	private javax.swing.JMenuItem jMenuItem15;
	private javax.swing.JMenuItem jMenuItem16;
	private javax.swing.JMenuItem jMenuItem17;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JSeparator jSeparator1;
	// End of variables declaration//GEN-END:variables

}