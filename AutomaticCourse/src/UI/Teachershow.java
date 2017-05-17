/*
 * Teachershow.java
 *
 * Created on __DATE__, __TIME__
 */

package UI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.TableModel;

import JDBC.ArrangeImpl;

/**
 *
 * @author  __USER__
 */
public class Teachershow extends javax.swing.JPanel {

	/** Creates new form Teachershow */
	public Teachershow() {
		initComponents();
		this.fillTeacherName();
	}

	private void fillTeacherName() {
		List<String> teacherNameList = new ArrayList<String>();
		ArrangeImpl ai = new ArrangeImpl();
		teacherNameList = ai.getTeacherName();
		for (String string : teacherNameList) {
			this.jComboBox1.addItem(string);
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

		jScrollPane1 = new javax.swing.JScrollPane();
		clist = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();

		clist.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
				{ "第一节", null, null, null, null, null },
				{ "第二节", null, null, null, null, null },
				{ "第三节", null, null, null, null, null },
				{ "第四节", null, null, null, null, null },
				{ "第五节", null, null, null, null, null },
				{ "第六节", null, null, null, null, null },
				{ "第七节", null, null, null, null, null },
				{ "第八节", null, null, null, null, null },
				{ "第九节", null, null, null, null, null },
				{ "第十节", null, null, null, null, null },
				{ "第十一节", null, null, null, null, null } }, new String[] { "",
				"星期一", "星期二", "星期三", "星期四", "星期五" }) {
			Class[] types = new Class[] { java.lang.Object.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(clist);

		jLabel1.setText("\u6559\u5e08\u540d\u79f0\uff1a");

		jButton1.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\search.png")); // NOI18N
		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\about.png")); // NOI18N
		jButton3.setText("\u6253\u5370");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(
				"..\\AutomaticCourse\\images\\exit.png")); // NOI18N
		jButton2.setText("\u9000\u51fa");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel6.setText("\u6559_\u5e08_\u8bfe_\u8868");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jScrollPane1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						627,
																						Short.MAX_VALUE)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jComboBox1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										255,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jButton1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										98,
																										javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		98,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		98,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(246,
																		246,
																		246)
																.addComponent(
																		jLabel6)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel6)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(jButton1)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										211,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(jButton3))
								.addContainerGap()));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.exit(0);

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String fileName = (String) jComboBox1.getSelectedItem(); //以excel文件保存在当前目录下，同时清空数据库result内的数据
		fileName += "课表.xls";
		ArrangeImpl ai = new ArrangeImpl();
		try {
			TableModel tm = clist.getModel();
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file);
			for (int i = 0; i < tm.getColumnCount(); i++) {
				fw.write(tm.getColumnName(i) + "\t");
			}
			fw.write("\n");
			for (int i = 0; i < tm.getRowCount(); i++) {
				for (int j = 0; j < tm.getColumnCount(); j++) {
					fw.write(tm.getValueAt(i, j) + "\t");
				}
				fw.write("\n");
			}
			fw.close();
			System.out.println(fileName + "打印完成,所在路径: "
					+ file.getAbsolutePath());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		ai.deleteResult();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String tName = (String) jComboBox1.getSelectedItem();
		String courseName = "";
		String className = "";
		String weekNum = "";
		String sectionNum = "";
		String classroomPlace = "";

		for (int a = 0; a < 11; a++) {
			for (int b = 1; b <= 5; b++) {
				clist.setValueAt(null, a, b);
			}
		}

		ArrangeImpl ai = new ArrangeImpl();

		List<String> resultList = ai.getTeacherInfo(tName);
		String item = "";
		System.out.println("itemNum: " + resultList.size() / 5);

		for (int i = 0; i < resultList.size(); i += 5) {
			courseName = resultList.get(i);
			classroomPlace = resultList.get(i + 1);
			weekNum = resultList.get(i + 2);
			sectionNum = resultList.get(i + 3);
			className = resultList.get(i + 4);
			item += courseName;
			item += ",";
			item += classroomPlace;
			item += ",";
			item += className;
			System.out.println("item: " + item);
			clist.setValueAt(item, Integer.valueOf(sectionNum),
					Integer.valueOf(weekNum)); //sectionNum行/weekNum列
			item = "";
		}

		System.out.println("-----------------end-----------------");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTable clist;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JScrollPane jScrollPane1;
	// End of variables declaration//GEN-END:variables

}