/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class DanhGia_GV extends javax.swing.JInternalFrame {

    /**
     * Creates new form DanhGia_GV
     */
    public DanhGia_GV() {
        initComponents();
        connet();
        filltoComboBox();
        filltoTable();
    }
    Connection con;
    int index = -1;

    protected void connet() {

        String uername = "tuanmayman";
        String password = "vutuan040599";
        String hosting = " sql.freeasphost.net\\MSSQL2016";
        String dbname = "databaseName=tuanmayman_Du_An_1";
//        String url = "jdbc:sqlserver://localhost:1433;databaseName=quan_ly_sach";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://" + hosting + ";" + dbname, uername, password);
//            JOptionPane.showMessageDialog(this, "Kết nối database thành công !");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ko có driver");

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMaDanhGia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCau1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCau2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCau3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblMaHocSinh = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cboDanhGia = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhGia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Đánh Giá ");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã đánh giá");

        lblMaDanhGia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaDanhGia.setText("                               ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Câu 1: Đề thi có sát với chương trình học không ?");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Câu 1: Đề thi có sát với chương trình học không ?");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Câu 1: Đề thi có sát với chương trình học không ?");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nội dung");

        txtNoiDung.setColumns(20);
        txtNoiDung.setRows(5);
        jScrollPane1.setViewportView(txtNoiDung);

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã học sinh:");

        lblMaHocSinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaHocSinh.setText("                               ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(txtCau3)
                        .addComponent(jLabel5)
                        .addComponent(txtCau2)
                        .addComponent(jLabel4)
                        .addComponent(txtCau1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMaDanhGia)
                                .addComponent(lblMaHocSinh))
                            .addGap(95, 95, 95))))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrev});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblMaDanhGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblMaHocSinh))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCau2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCau3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addGap(38, 38, 38))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrev});

        tabs.addTab("CHI TIẾT", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Đánh Giá Theo Tháng");

        cboDanhGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboDanhGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDanhGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDanhGiaActionPerformed(evt);
            }
        });

        tblDanhGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Đánh Giá", "Mã Học Sinh", "Nội Dung"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhGiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhGia);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(cboDanhGia, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboDanhGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tổng Hợp Đánh Giá");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(197, 197, 197))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhGiaMouseClicked
        if (evt.getClickCount() == 2) {
            index = tblDanhGia.getSelectedRow();
            filltoForm();
            hamDisable();
            tabs.setSelectedIndex(0);
        }
    }//GEN-LAST:event_tblDanhGiaMouseClicked

    private void cboDanhGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDanhGiaActionPerformed
     if(cboDanhGia.getSelectedItem()!=null){
         filltoTable();
        }

    }//GEN-LAST:event_cboDanhGiaActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        index=0;
        filltoForm();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if(index>0){
            index--;
        }
        else if (index == 0) {
            index = tblDanhGia.getRowCount() - 1;
        }
        filltoForm();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       if(index<tblDanhGia.getRowCount()-1){
            index++;
        }else if(index==tblDanhGia.getRowCount()-1){
            index=0;
        }
        filltoForm();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
       index=tblDanhGia.getRowCount()-1;
       filltoForm();
    }//GEN-LAST:event_btnLastActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JComboBox<String> cboDanhGia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMaDanhGia;
    private javax.swing.JLabel lblMaHocSinh;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhGia;
    private javax.swing.JTextField txtCau1;
    private javax.swing.JTextField txtCau2;
    private javax.swing.JTextField txtCau3;
    private javax.swing.JTextArea txtNoiDung;
    // End of variables declaration//GEN-END:variables

    private void filltoTable() {
        try {
            String query = "Select * from danhGia where MONTH(NgayDG) "
                    + "like N'%" + cboDanhGia.getSelectedItem() + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel) tblDanhGia.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                String maHocSinh = rs.getString("Ma_HocSinh");
                String noiDung = rs.getString("NoiDungDanhGia");
                String maDanhGia = rs.getString("Ma_DanhGia");
                model.addRow(new Object[]{maDanhGia,maHocSinh, noiDung});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void filltoComboBox() {
        try {
            String query = "Select distinct MONTH(NgayDG)as Thang from danhGia order by Thang asc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            DefaultComboBoxModel model = (DefaultComboBoxModel) cboDanhGia.getModel();
            model.removeAllElements();
            while (rs.next()) {
                String thang = rs.getString("Thang");
                model.addElement(thang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void filltoForm() {

        try {
            String query = "Select * from DANHGIA where  Ma_DanhGia like N'%"+tblDanhGia.getValueAt(index,0)+"%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String maHocSinh = rs.getString("Ma_HocSinh");
                String noiDung = rs.getString("NoiDungDanhGia");
                String cau1 = rs.getString("Cau1");
                String cau2 = rs.getString("Cau2");
                String cau3 = rs.getString("Cau3");
                String maDanhGia = rs.getString("Ma_DanhGia");
                lblMaHocSinh.setText(maHocSinh);
                txtNoiDung.setText(noiDung);
                txtCau1.setText(cau1);
                txtCau2.setText(cau2);
                txtCau3.setText(cau3);
                lblMaDanhGia.setText(maDanhGia);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void hamDisable() {
        txtNoiDung.setEditable(false);
        txtCau1.setEditable(false);
        txtCau2.setEditable(false);
        txtCau3.setEditable(false);

    }
}
