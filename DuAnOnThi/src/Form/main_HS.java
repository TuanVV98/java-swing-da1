/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Entity.Auth;
import Entity.BieuDo;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Hello Kiên
 */
public class main_HS extends javax.swing.JFrame {

    /**
     * Creates new form main_HS
     */
    ArrayList<BieuDo> listTK;
    Connection con;
    public main_HS() {
        initComponents();
        setLocationRelativeTo(null);
        //run trang chu
        TrangChu_HS tc = new TrangChu_HS();
        jDesktopPaneHS.add(tc);
        tc.setLocation((jDesktopPaneHS.getWidth() - tc.getWidth()) / 2, (jDesktopPaneHS.getHeight() - tc.getHeight()) / 2);
        tc.setVisible(true);
        setDongHo();
        connet();
        fillCombobox();
        this.listTK = new ArrayList<>();
        this.listTK = this.fillToList();
        createChart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneHS = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        cboMonHoc = new javax.swing.JComboBox<>();
        pnChart = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniBangDiem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniDanhFia = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        mniContact = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mniThoat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ thống ôn thi THPT");

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        lblDongHo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("                          ");

        cboMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMonHocActionPerformed(evt);
            }
        });

        pnChart.setBackground(new java.awt.Color(255, 255, 255));
        pnChart.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("*x/y:đề thì/stt");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("*stt(1->5) trong đó 1 là đề mới nhât,5 là đề cũ nhất");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(322, 322, 322)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addComponent(pnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(pnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addContainerGap())
        );

        jDesktopPaneHS.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneHSLayout = new javax.swing.GroupLayout(jDesktopPaneHS);
        jDesktopPaneHS.setLayout(jDesktopPaneHSLayout);
        jDesktopPaneHSLayout.setHorizontalGroup(
            jDesktopPaneHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPaneHSLayout.setVerticalGroup(
            jDesktopPaneHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("TRANG CHỦ");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/Home.png"))); // NOI18N
        jMenuItem1.setText("Bắt đầu thi");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("KẾT QUẢ");

        mniBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/Statistics.png"))); // NOI18N
        mniBangDiem.setText("Bảng Điểm");
        mniBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangDiemActionPerformed(evt);
            }
        });
        jMenu2.add(mniBangDiem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("ĐÁNH GIÁ");

        mniDanhFia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/Favourites.png"))); // NOI18N
        mniDanhFia.setText("Đánh Giá");
        mniDanhFia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDanhFiaActionPerformed(evt);
            }
        });
        jMenu3.add(mniDanhFia);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("TRỢ GIÚP");

        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/Help.png"))); // NOI18N
        mniHuongDan.setText("Hướng dẫn sử dụng ");
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        jMenu4.add(mniHuongDan);

        mniContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/Mail.png"))); // NOI18N
        mniContact.setText("Liên hệ admin");
        mniContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniContactActionPerformed(evt);
            }
        });
        jMenu4.add(mniContact);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("TÀI KHOẢN");

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        jMenu5.add(mniDoiMatKhau);

        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/Log out.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        jMenu5.add(mniDangXuat);

        mniThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TienIch/Icon/exitot.png"))); // NOI18N
        mniThoat.setText("Thoát");
        mniThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThoatActionPerformed(evt);
            }
        });
        jMenu5.add(mniThoat);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneHS)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneHS)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void connet() {

        String uername = "tuanmayman";
        String password = "vutuan040599";
        String hosting = " sql.freeasphost.net\\MSSQL2016";
        String dbname = "databaseName=tuanmayman_Du_An_1";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://" + hosting + ";" + dbname, uername, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ko có driver");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
    }
    

    protected void fillCombobox() {
        try {
            Statement st = con.createStatement();
            String query = "select TenMonHoc from MonHoc";
            ResultSet rs = st.executeQuery(query);
            DefaultComboBoxModel model = (DefaultComboBoxModel) cboMonHoc.getModel();
            model.removeAllElements();
            while (rs.next()) {
                String mon = rs.getString("TenMonHoc");
                model.addElement(mon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //hàm tạo biểu đồ
      protected void createChart() {
        JFreeChart lineChart = ChartFactory.createBarChart("Top 5 Đề Thi Đã Làm Gần Đây", "Đề Thi", "Điểm", createDataset(),
                PlotOrientation.VERTICAL, true, true, false);
        //set color
        CategoryPlot plot = (CategoryPlot) lineChart.getPlot();
        plot.getRenderer().setSeriesPaint(0, Color.BLUE);
        plot.setBackgroundPaint(java.awt.Color.WHITE);
        plot.getRenderer().setSeriesStroke(0, new BasicStroke(5.0f));
        //set duong vien
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);
        lineChart.getLegend().setFrame(BlockBorder.NONE);
                
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(850,370));
//        pnChart.setSize(600, 400);
        pnChart.removeAll();
        pnChart.add(chartPanel);
        pnChart.validate();

    }
      //set thông tin cho biểu đồ
      protected CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int i=0;
        for (BieuDo bd : listTK) {
            i++;
            dataset.addValue(bd.getDiem(), "Điểm", bd.getMaDeThi()+"/"+i);
              System.out.println("điêm" + bd.getDiem() + " MaDe" + bd.getMaDeThi()+"/"+bd.getNgayTao());
        }

        return dataset;
    }
      
      protected ArrayList<BieuDo> fillToList() {
        ArrayList<BieuDo> list = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            String query = "select top 5 kq.Diem as diem,kq.Ma_DeThi as maDe,NgayThi\n"
                    + "from KETQUA kq inner join DETHI dt \n"
                    + "on kq.Ma_DeThi=dt.Ma_DeThi \n"
                    + "inner join MONHOC mh on mh.Ma_MonHoc=dt.Ma_MonHoc\n"
                    + "where mh.TenMonHoc like N'%" + cboMonHoc.getSelectedItem() + "%'"
                    + " and kq.Ma_HocSinh like N'%"+Auth.user.getMaDN()+"%'\n"
                    +"order by NgayThi desc ";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                float diem = rs.getFloat("diem");
                String ma = rs.getString("maDe");
                Date ngay=rs.getDate("NgayThi");
                list.add(new BieuDo(ma,ngay,diem));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        for (JInternalFrame jif : jDesktopPaneHS.getAllFrames()) {
            jif.dispose();
        }
        TrangChu_HS tc = new TrangChu_HS();
        jDesktopPaneHS.add(tc);
        tc.setLocation((jDesktopPaneHS.getWidth() - tc.getWidth()) / 2, (jDesktopPaneHS.getHeight() - tc.getHeight()) / 2);
        tc.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất?");
        if (a != JOptionPane.YES_OPTION) {
            return;
        }
        Auth.clear();
        main_Run chao = new main_Run();
        chao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThoatActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát?");
        if (a != JOptionPane.YES_OPTION) {
            return;
        }
        this.dispose();
    }//GEN-LAST:event_mniThoatActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        for (JInternalFrame jif : jDesktopPaneHS.getAllFrames()) {
            jif.dispose();
        }
        DoiMatKhau mk = new DoiMatKhau();
        jDesktopPaneHS.add(mk);
        mk.setLocation((jDesktopPaneHS.getWidth() - mk.getWidth()) / 2, (jDesktopPaneHS.getHeight() - mk.getHeight()) / 2);
        mk.setVisible(true);
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniDanhFiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDanhFiaActionPerformed
        for (JInternalFrame jif : jDesktopPaneHS.getAllFrames()) {
            jif.dispose();
        }
        DanhGia_HS ql = new DanhGia_HS();
        jDesktopPaneHS.add(ql);
        ql.setLocation((jDesktopPaneHS.getWidth() - ql.getWidth()) / 2,
                (jDesktopPaneHS.getHeight() - ql.getHeight()) / 2);
        ql.setVisible(true);
    }//GEN-LAST:event_mniDanhFiaActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://docs.google.com/document"
                    + "/d/1DJLJ5IlexBruMWYqKhWhJuUg6aOKbhlIYX4-0u3MgZw/edit?usp=sharing"));
        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không tìm thấy đường dẫn");
        }
    }//GEN-LAST:event_mniHuongDanActionPerformed

    private void mniContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniContactActionPerformed
        try {
            Desktop.getDesktop().mail(new URI("mailto:datntph11793@fpt.edu.vn?subject=TEST"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mniContactActionPerformed

    private void mniBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangDiemActionPerformed
       for (JInternalFrame jif : jDesktopPaneHS.getAllFrames()) {
            jif.dispose();
        }
        BangDiemHS ql = new BangDiemHS();
        jDesktopPaneHS.add(ql);
        ql.setLocation((jDesktopPaneHS.getWidth() - ql.getWidth()) / 2,
                (jDesktopPaneHS.getHeight() - ql.getHeight()) / 2);
        ql.setVisible(true);
    }//GEN-LAST:event_mniBangDiemActionPerformed

    private void cboMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMonHocActionPerformed
        this.listTK = fillToList();
        createChart();
    }//GEN-LAST:event_cboMonHocActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main_HS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_HS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_HS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_HS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_HS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMonHoc;
    public static javax.swing.JDesktopPane jDesktopPaneHS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    public static javax.swing.JMenu jMenu3;
    public static javax.swing.JMenu jMenu4;
    public static javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenuItem mniBangDiem;
    private javax.swing.JMenuItem mniContact;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDanhFia;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniThoat;
    private javax.swing.JPanel pnChart;
    // End of variables declaration//GEN-END:variables

    private void setDongHo() {
        new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date tg= new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                String date =sdf.format(tg);
                lblDongHo.setText(date);
            }
        }).start();
    }
}
