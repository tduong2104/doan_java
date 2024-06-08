/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.HoaDonDAO;
import Controller.KhachHangDAO;
import javax.swing.table.DefaultTableModel;
import Controller.NhanVienDAO;
import Controller.SanPhamDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Model.NhanVien;
import Model.SanPham;
import java.awt.Color;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JTable;

/**
 *
 * @author trong
 */
public class QuanLy_UI extends javax.swing.JFrame {

    public int index_tbl_NV, index_tbl_SP, index_tbl_KH, index_tbl_HD, index_tbl_GG = -1, index_tbl_GGed = -1;

    public QuanLy_UI() {
        initComponents();
        setLocationRelativeTo(null);

//        ------------Nhân Viên -----------------
        ListSelectionModel selectionModel = tbl_NhanVien.getSelectionModel();
        DefaultTableModel model_NV = (DefaultTableModel) tbl_NhanVien.getModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Lấy chỉ mục hàng được chọn
                    index_tbl_NV = tbl_NhanVien.getSelectedRow();
                    int colSelected = 0;
                    btnEditNV.setVisible(true);
                    Delete_button3.setVisible(true);
                }
            }
        });
//        ---------------- Sản Phẩm ---------------------
        ListSelectionModel selectionModel_SP = tbl_SanPham.getSelectionModel();
        DefaultTableModel model_SP = (DefaultTableModel) tbl_SanPham.getModel();
        selectionModel_SP.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Lấy chỉ mục hàng được chọn
                    index_tbl_SP = tbl_SanPham.getSelectedRow();
                    int colSelected = 0;
                    btn_editSP.setVisible(true);
                    btn_deleteSP.setVisible(true);
                }
            }
        });
//        --------------- Khách hàng ---------------------
        ListSelectionModel selectionModel_KH = tbl_KhachHang.getSelectionModel();
        DefaultTableModel model_KH = (DefaultTableModel) tbl_KhachHang.getModel();
        selectionModel_KH.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Lấy chỉ mục hàng được chọn
                    index_tbl_KH = tbl_KhachHang.getSelectedRow();
                    int colSelected = 0;
                    btn_EditKH.setVisible(true);
                    btn_DeleteKH.setVisible(true);
                }
            }
        });
//        ------------------- Hóa Đơn ---------------------
        ListSelectionModel selectionModel_HD = tbl_HoaDon.getSelectionModel();
        DefaultTableModel model_HD = (DefaultTableModel) tbl_HoaDon.getModel();
        selectionModel_HD.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Lấy chỉ mục hàng được chọn
                    index_tbl_HD = tbl_HoaDon.getSelectedRow();
                    int colSelected = 0;
                    btn_editHD.setVisible(true);
                    btn_deleteHD.setVisible(true);
                }
            }
        });
//       --------------------- Giảm giá ------------------------
        ListSelectionModel selectionModel_GG = tbl_SanPhamGG.getSelectionModel();
        DefaultTableModel model_GG = (DefaultTableModel) tbl_SanPhamGG.getModel();
        ListSelectionModel selectionModel_GGed = tbl_SanPhamGGed.getSelectionModel();
        DefaultTableModel model_GGed = (DefaultTableModel) tbl_SanPhamGGed.getModel();

        selectionModel_GG.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && tbl_SanPhamGG.getSelectedRow() != -1) {
                    tbl_SanPhamGGed.clearSelection();
                    index_tbl_GG = tbl_SanPhamGG.getSelectedRow();
                    index_tbl_GGed = -1;
                    btn_chuyen.setVisible(true);
                    btn_chuyen.setBackground(Color.green);
                }
            }
        });

        selectionModel_GGed.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && tbl_SanPhamGGed.getSelectedRow() != -1) {
                    tbl_SanPhamGG.clearSelection();
                    index_tbl_GGed = tbl_SanPhamGGed.getSelectedRow();
                    index_tbl_GG = -1;
                    btn_chuyen.setVisible(true);
                    btn_chuyen.setBackground(Color.red);
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        panel_menu = new javax.swing.JPanel();
        btn_dssanpham = new javax.swing.JButton();
        btn_dshoadon = new javax.swing.JButton();
        btn_dskhachhang = new javax.swing.JButton();
        btn_dsgiamgia = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Imagine_label = new javax.swing.JLabel();
        btn_dsnhanvien1 = new javax.swing.JButton();
        Cards_QuanLy = new javax.swing.JPanel();
        card_quanlysanpham = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SanPham = new javax.swing.JTable();
        panel_fillter = new javax.swing.JPanel();
        btn_TKSP = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTKSP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_addSP = new javax.swing.JButton();
        btn_editSP = new javax.swing.JButton();
        btn_deleteSP = new javax.swing.JButton();
        card_quanlynhanvien = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_NhanVien = new javax.swing.JTable();
        panel_fillter2 = new javax.swing.JPanel();
        btnTimKiemNV = new javax.swing.JButton();
        txtTimKiemNV = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Add_button3 = new javax.swing.JButton();
        btnEditNV = new javax.swing.JButton();
        Delete_button3 = new javax.swing.JButton();
        card_quanlykhachhang = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_KhachHang = new javax.swing.JTable();
        panel_fillter1 = new javax.swing.JPanel();
        btn_TKKH = new javax.swing.JButton();
        txt_TKKH = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_AddKH = new javax.swing.JButton();
        btn_EditKH = new javax.swing.JButton();
        btn_DeleteKH = new javax.swing.JButton();
        card_quanlyhoadon = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_HoaDon = new javax.swing.JTable();
        panel_fillter3 = new javax.swing.JPanel();
        btn_TKHD = new javax.swing.JButton();
        txt_TKHD = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        Add_button4 = new javax.swing.JButton();
        btn_editHD = new javax.swing.JButton();
        btn_deleteHD = new javax.swing.JButton();
        card_giamgia = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_SanPhamGGed = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_SanPhamGG = new javax.swing.JTable();
        btn_chuyen = new javax.swing.JButton();
        btn_xoatatca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 200));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jSplitPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(750, 550));

        panel_menu.setBackground(new java.awt.Color(102, 102, 102));
        panel_menu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btn_dssanpham.setBackground(new java.awt.Color(204, 255, 255));
        btn_dssanpham.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_dssanpham.setText("DS Sản Phẩm");
        btn_dssanpham.setBorder(null);
        btn_dssanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dssanphamActionPerformed(evt);
            }
        });

        btn_dshoadon.setBackground(new java.awt.Color(255, 204, 204));
        btn_dshoadon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_dshoadon.setText("DS Hóa Đơn");
        btn_dshoadon.setBorder(null);
        btn_dshoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dshoadonActionPerformed(evt);
            }
        });

        btn_dskhachhang.setBackground(new java.awt.Color(204, 255, 204));
        btn_dskhachhang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_dskhachhang.setText("DS Khách hàng");
        btn_dskhachhang.setBorder(null);
        btn_dskhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dskhachhangActionPerformed(evt);
            }
        });

        btn_dsgiamgia.setBackground(new java.awt.Color(204, 204, 255));
        btn_dsgiamgia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_dsgiamgia.setText("SP Giảm Giá ");
        btn_dsgiamgia.setBorder(null);
        btn_dsgiamgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dsgiamgiaActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(255, 51, 51));
        btn_logout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_logout.setText("Đăng xuất");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        Imagine_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.jpg"))); // NOI18N
        Imagine_label.setMinimumSize(new java.awt.Dimension(100, 100));
        Imagine_label.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Imagine_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Imagine_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_dsnhanvien1.setBackground(new java.awt.Color(255, 255, 204));
        btn_dsnhanvien1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_dsnhanvien1.setText("DS Nhân Viên");
        btn_dsnhanvien1.setBorder(null);
        btn_dsnhanvien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dsnhanvien1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dshoadon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_dssanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_dskhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_dsgiamgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_dsnhanvien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dssanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dshoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dskhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dsnhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dsgiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(panel_menu);

        Cards_QuanLy.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Cards_QuanLyComponentShown(evt);
            }
        });
        Cards_QuanLy.setLayout(new java.awt.CardLayout());

        card_quanlysanpham.setBackground(new java.awt.Color(102, 255, 255));
        card_quanlysanpham.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tbl_SanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản phẩm", "Tên Sản phẩm", "Loại Sản phẩm", "Đơn giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_SanPham);

        panel_fillter.setBackground(new java.awt.Color(102, 255, 255));

        btn_TKSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_icon.png"))); // NOI18N
        btn_TKSP.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_TKSP.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_TKSP.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_TKSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TKSPActionPerformed(evt);
            }
        });

        jButton2.setText("Danh Mục Sản Phẩm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtTKSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTKSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_fillterLayout = new javax.swing.GroupLayout(panel_fillter);
        panel_fillter.setLayout(panel_fillterLayout);
        panel_fillterLayout.setHorizontalGroup(
            panel_fillterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fillterLayout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_TKSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panel_fillterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fillterLayout.createSequentialGroup()
                    .addContainerGap(240, Short.MAX_VALUE)
                    .addComponent(txtTKSP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );
        panel_fillterLayout.setVerticalGroup(
            panel_fillterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fillterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_fillterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_TKSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_fillterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fillterLayout.createSequentialGroup()
                    .addContainerGap(7, Short.MAX_VALUE)
                    .addComponent(txtTKSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        btn_addSP.setBackground(new java.awt.Color(51, 255, 51));
        btn_addSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_icon.png"))); // NOI18N
        btn_addSP.setMaximumSize(new java.awt.Dimension(42, 42));
        btn_addSP.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_addSP.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_addSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSPActionPerformed(evt);
            }
        });

        btn_editSP.setBackground(new java.awt.Color(255, 255, 51));
        btn_editSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_icon.png"))); // NOI18N
        btn_editSP.setMaximumSize(new java.awt.Dimension(42, 42));
        btn_editSP.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_editSP.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_editSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editSPActionPerformed(evt);
            }
        });

        btn_deleteSP.setBackground(new java.awt.Color(255, 51, 51));
        btn_deleteSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_icon.png"))); // NOI18N
        btn_deleteSP.setMaximumSize(new java.awt.Dimension(42, 42));
        btn_deleteSP.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_deleteSP.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_deleteSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_addSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_editSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_deleteSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_deleteSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout card_quanlysanphamLayout = new javax.swing.GroupLayout(card_quanlysanpham);
        card_quanlysanpham.setLayout(card_quanlysanphamLayout);
        card_quanlysanphamLayout.setHorizontalGroup(
            card_quanlysanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_quanlysanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_quanlysanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(panel_fillter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        card_quanlysanphamLayout.setVerticalGroup(
            card_quanlysanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_quanlysanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_fillter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Cards_QuanLy.add(card_quanlysanpham, "card2");

        card_quanlynhanvien.setBackground(new java.awt.Color(255, 255, 204));
        card_quanlynhanvien.setForeground(new java.awt.Color(255, 255, 255));
        card_quanlynhanvien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                card_quanlynhanvienComponentShown(evt);
            }
        });

        tbl_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân viên", "Họ Tên", "Lương", "Ngày vào làm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_NhanVien.setRequestFocusEnabled(false);
        tbl_NhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tbl_NhanVienComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_NhanVien);

        panel_fillter2.setBackground(new java.awt.Color(255, 255, 204));

        btnTimKiemNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_icon.png"))); // NOI18N
        btnTimKiemNV.setMaximumSize(new java.awt.Dimension(30, 30));
        btnTimKiemNV.setMinimumSize(new java.awt.Dimension(20, 20));
        btnTimKiemNV.setPreferredSize(new java.awt.Dimension(30, 30));
        btnTimKiemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_fillter2Layout = new javax.swing.GroupLayout(panel_fillter2);
        panel_fillter2.setLayout(panel_fillter2Layout);
        panel_fillter2Layout.setHorizontalGroup(
            panel_fillter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fillter2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_fillter2Layout.setVerticalGroup(
            panel_fillter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fillter2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_fillter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        Add_button3.setBackground(new java.awt.Color(51, 255, 51));
        Add_button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_icon.png"))); // NOI18N
        Add_button3.setMaximumSize(new java.awt.Dimension(42, 42));
        Add_button3.setMinimumSize(new java.awt.Dimension(20, 20));
        Add_button3.setPreferredSize(new java.awt.Dimension(42, 42));
        Add_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_button3ActionPerformed(evt);
            }
        });

        btnEditNV.setBackground(new java.awt.Color(255, 255, 51));
        btnEditNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_icon.png"))); // NOI18N
        btnEditNV.setMaximumSize(new java.awt.Dimension(42, 42));
        btnEditNV.setMinimumSize(new java.awt.Dimension(20, 20));
        btnEditNV.setPreferredSize(new java.awt.Dimension(42, 42));
        btnEditNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditNVActionPerformed(evt);
            }
        });

        Delete_button3.setBackground(new java.awt.Color(255, 51, 51));
        Delete_button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_icon.png"))); // NOI18N
        Delete_button3.setMaximumSize(new java.awt.Dimension(42, 42));
        Delete_button3.setMinimumSize(new java.awt.Dimension(20, 20));
        Delete_button3.setPreferredSize(new java.awt.Dimension(42, 42));
        Delete_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Delete_button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Delete_button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout card_quanlynhanvienLayout = new javax.swing.GroupLayout(card_quanlynhanvien);
        card_quanlynhanvien.setLayout(card_quanlynhanvienLayout);
        card_quanlynhanvienLayout.setHorizontalGroup(
            card_quanlynhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_quanlynhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_quanlynhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(panel_fillter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        card_quanlynhanvienLayout.setVerticalGroup(
            card_quanlynhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_quanlynhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_fillter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Cards_QuanLy.add(card_quanlynhanvien, "card2");

        card_quanlykhachhang.setBackground(new java.awt.Color(204, 255, 204));
        card_quanlykhachhang.setForeground(new java.awt.Color(255, 255, 255));

        tbl_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách hàng", "Tên khách hàng", "Số điện thoại", "Loại khách hàng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_KhachHang);

        panel_fillter1.setBackground(new java.awt.Color(204, 255, 204));

        btn_TKKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_icon.png"))); // NOI18N
        btn_TKKH.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_TKKH.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_TKKH.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_TKKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TKKHActionPerformed(evt);
            }
        });

        txt_TKKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TKKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_fillter1Layout = new javax.swing.GroupLayout(panel_fillter1);
        panel_fillter1.setLayout(panel_fillter1Layout);
        panel_fillter1Layout.setHorizontalGroup(
            panel_fillter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fillter1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_TKKH, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_TKKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_fillter1Layout.setVerticalGroup(
            panel_fillter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fillter1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(panel_fillter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TKKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TKKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        btn_AddKH.setBackground(new java.awt.Color(51, 255, 51));
        btn_AddKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_icon.png"))); // NOI18N
        btn_AddKH.setMaximumSize(new java.awt.Dimension(42, 42));
        btn_AddKH.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_AddKH.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_AddKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddKHActionPerformed(evt);
            }
        });

        btn_EditKH.setBackground(new java.awt.Color(255, 255, 51));
        btn_EditKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_icon.png"))); // NOI18N
        btn_EditKH.setMaximumSize(new java.awt.Dimension(42, 42));
        btn_EditKH.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_EditKH.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_EditKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditKHActionPerformed(evt);
            }
        });

        btn_DeleteKH.setBackground(new java.awt.Color(255, 51, 51));
        btn_DeleteKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_icon.png"))); // NOI18N
        btn_DeleteKH.setMaximumSize(new java.awt.Dimension(42, 42));
        btn_DeleteKH.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_DeleteKH.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_DeleteKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_AddKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_EditKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_DeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_DeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_AddKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout card_quanlykhachhangLayout = new javax.swing.GroupLayout(card_quanlykhachhang);
        card_quanlykhachhang.setLayout(card_quanlykhachhangLayout);
        card_quanlykhachhangLayout.setHorizontalGroup(
            card_quanlykhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_quanlykhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_quanlykhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(panel_fillter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        card_quanlykhachhangLayout.setVerticalGroup(
            card_quanlykhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_quanlykhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_fillter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Cards_QuanLy.add(card_quanlykhachhang, "card2");

        card_quanlyhoadon.setBackground(new java.awt.Color(255, 204, 204));
        card_quanlyhoadon.setForeground(new java.awt.Color(255, 255, 255));

        tbl_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "MaNV", "MaKH", "Giá trị HĐ", "Ngày tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl_HoaDon);

        panel_fillter3.setBackground(new java.awt.Color(255, 204, 204));

        btn_TKHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_icon.png"))); // NOI18N
        btn_TKHD.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_TKHD.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_TKHD.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_TKHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TKHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_fillter3Layout = new javax.swing.GroupLayout(panel_fillter3);
        panel_fillter3.setLayout(panel_fillter3Layout);
        panel_fillter3Layout.setHorizontalGroup(
            panel_fillter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fillter3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_TKHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panel_fillter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fillter3Layout.createSequentialGroup()
                    .addContainerGap(231, Short.MAX_VALUE)
                    .addComponent(txt_TKHD, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );
        panel_fillter3Layout.setVerticalGroup(
            panel_fillter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fillter3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_TKHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_fillter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fillter3Layout.createSequentialGroup()
                    .addContainerGap(7, Short.MAX_VALUE)
                    .addComponent(txt_TKHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        Add_button4.setBackground(new java.awt.Color(51, 255, 51));
        Add_button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_icon.png"))); // NOI18N
        Add_button4.setMaximumSize(new java.awt.Dimension(42, 42));
        Add_button4.setMinimumSize(new java.awt.Dimension(20, 20));
        Add_button4.setPreferredSize(new java.awt.Dimension(42, 42));
        Add_button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_button4ActionPerformed(evt);
            }
        });

        btn_editHD.setBackground(new java.awt.Color(255, 255, 51));
        btn_editHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_icon.png"))); // NOI18N
        btn_editHD.setMaximumSize(new java.awt.Dimension(42, 42));
        btn_editHD.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_editHD.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_editHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editHDActionPerformed(evt);
            }
        });

        btn_deleteHD.setBackground(new java.awt.Color(255, 51, 51));
        btn_deleteHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_icon.png"))); // NOI18N
        btn_deleteHD.setMaximumSize(new java.awt.Dimension(42, 42));
        btn_deleteHD.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_deleteHD.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_deleteHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_editHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_deleteHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_deleteHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout card_quanlyhoadonLayout = new javax.swing.GroupLayout(card_quanlyhoadon);
        card_quanlyhoadon.setLayout(card_quanlyhoadonLayout);
        card_quanlyhoadonLayout.setHorizontalGroup(
            card_quanlyhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_quanlyhoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_quanlyhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_fillter3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        card_quanlyhoadonLayout.setVerticalGroup(
            card_quanlyhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_quanlyhoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_fillter3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Cards_QuanLy.add(card_quanlyhoadon, "card2");

        card_giamgia.setBackground(new java.awt.Color(204, 204, 255));

        tbl_SanPhamGGed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "áo", "đồ"}
            },
            new String [] {
                "MaSp", "TenSP", "LoaiSP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbl_SanPhamGGed);
        if (tbl_SanPhamGGed.getColumnModel().getColumnCount() > 0) {
            tbl_SanPhamGGed.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_SanPhamGGed.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        tbl_SanPhamGG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(2), "quần", "đồ"}
            },
            new String [] {
                "MaSp", "TenSP", "LoaiSP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tbl_SanPhamGG);
        if (tbl_SanPhamGG.getColumnModel().getColumnCount() > 0) {
            tbl_SanPhamGG.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_SanPhamGG.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        btn_chuyen.setText("Chuyển");
        btn_chuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyenActionPerformed(evt);
            }
        });

        btn_xoatatca.setBackground(new java.awt.Color(255, 0, 0));
        btn_xoatatca.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoatatca.setText("Xóa Tất Cả");
        btn_xoatatca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoatatcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_giamgiaLayout = new javax.swing.GroupLayout(card_giamgia);
        card_giamgia.setLayout(card_giamgiaLayout);
        card_giamgiaLayout.setHorizontalGroup(
            card_giamgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_giamgiaLayout.createSequentialGroup()
                .addGroup(card_giamgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_giamgiaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                    .addGroup(card_giamgiaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_chuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btn_xoatatca, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(card_giamgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card_giamgiaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        card_giamgiaLayout.setVerticalGroup(
            card_giamgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_giamgiaLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(card_giamgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_chuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoatatca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(card_giamgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card_giamgiaLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(342, Short.MAX_VALUE)))
        );

        Cards_QuanLy.add(card_giamgia, "card6");

        jSplitPane1.setRightComponent(Cards_QuanLy);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dssanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dssanphamActionPerformed
        Cards_QuanLy.removeAll();
        Cards_QuanLy.add(card_quanlysanpham);
        btn_editSP.setVisible(false);
        btn_deleteSP.setVisible(false);
        Cards_QuanLy.repaint();
        Cards_QuanLy.revalidate();

        DefaultTableModel model = (DefaultTableModel) tbl_SanPham.getModel();
        model.setRowCount(0);
        DSSP();
    }//GEN-LAST:event_btn_dssanphamActionPerformed

    private void btn_dshoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dshoadonActionPerformed
        Cards_QuanLy.removeAll();
        Cards_QuanLy.add(card_quanlyhoadon);

        btn_editHD.setVisible(false);
        btn_deleteHD.setVisible(false);

        Cards_QuanLy.repaint();
        Cards_QuanLy.revalidate();

        DefaultTableModel model = (DefaultTableModel) tbl_HoaDon.getModel();
        model.setRowCount(0);
        DSHD();
    }//GEN-LAST:event_btn_dshoadonActionPerformed

    private void btn_dskhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dskhachhangActionPerformed
        Cards_QuanLy.removeAll();
        Cards_QuanLy.add(card_quanlykhachhang);
        btn_EditKH.setVisible(false);
        btn_DeleteKH.setVisible(false);
        Cards_QuanLy.repaint();
        Cards_QuanLy.revalidate();
        DefaultTableModel model = (DefaultTableModel) tbl_KhachHang.getModel();
        model.setRowCount(0);
        DSKH();
    }//GEN-LAST:event_btn_dskhachhangActionPerformed

    private void btn_dsgiamgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dsgiamgiaActionPerformed
        Cards_QuanLy.removeAll();
        Cards_QuanLy.add(card_giamgia);
        btn_chuyen.setVisible(false);
        Cards_QuanLy.repaint();
        Cards_QuanLy.revalidate();
        DefaultTableModel model1 = (DefaultTableModel) tbl_SanPhamGG.getModel();
        model1.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) tbl_SanPhamGGed.getModel();
        model2.setRowCount(0);
        DSSPGG();
        DSSPGGed();
    }//GEN-LAST:event_btn_dsgiamgiaActionPerformed

    public void ThemNV(NhanVien NV) {
        DefaultTableModel model = (DefaultTableModel) tbl_NhanVien.getModel();
        Object[] nhanvien = (Object[]) (Object) NV;
        model.addRow(nhanvien);
    }

    public void DSNV() {
        DefaultTableModel model = (DefaultTableModel) tbl_NhanVien.getModel();

        List<Object[]> DSNhanVien = NhanVienDAO.ListNV();

        for (Object[] x : DSNhanVien) {
            model.addRow(x);
        }
    }
    private void btn_deleteSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSPActionPerformed
        DefaultTableModel model_SP = (DefaultTableModel) tbl_SanPham.getModel();
        Object ma = tbl_SanPham.getValueAt(index_tbl_SP, 0);
        boolean success = SanPhamDAO.DeleteSPbyMa((int) ma);
        if (success) {
            JOptionPane.showMessageDialog(null, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            model_SP.removeRow(index_tbl_SP);
        } else {
            JOptionPane.showMessageDialog(null, "Xóa không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteSPActionPerformed

    private void btn_editSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editSPActionPerformed
        DefaultTableModel model_SP = (DefaultTableModel) tbl_SanPham.getModel();
        Object ma = tbl_SanPham.getValueAt(index_tbl_SP, 0);
        Sua_San_Pham EditSP = new Sua_San_Pham((int) ma, QuanLy_UI.this, model_SP);
        EditSP.setVisible(true);
    }//GEN-LAST:event_btn_editSPActionPerformed

    private void btn_TKSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TKSPActionPerformed
        String tukhoa = txtTKSP.getText();
        DefaultTableModel model = (DefaultTableModel) tbl_SanPham.getModel();
        model.setRowCount(0);
        List<Object[]> DSSP = SanPhamDAO.TimKiemSP(tukhoa);
        for (Object[] x : DSSP) {
            model.addRow(x);
        }
        model.fireTableDataChanged();
        tbl_SanPham.revalidate();
        tbl_SanPham.repaint();
    }//GEN-LAST:event_btn_TKSPActionPerformed

    private void btnTimKiemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNVActionPerformed
        String tukhoa = txtTimKiemNV.getText();
        DefaultTableModel model = (DefaultTableModel) tbl_NhanVien.getModel();
        model.setRowCount(0);
        List<Object[]> DSNhanVien = NhanVienDAO.TimKiemNV(tukhoa);
        for (Object[] x : DSNhanVien) {
            model.addRow(x);
        }
        model.fireTableDataChanged();
        tbl_NhanVien.revalidate();
        tbl_NhanVien.repaint();
    }//GEN-LAST:event_btnTimKiemNVActionPerformed

    private void btnEditNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditNVActionPerformed
        DefaultTableModel model_NV = (DefaultTableModel) tbl_NhanVien.getModel();
        Object ma = tbl_NhanVien.getValueAt(index_tbl_NV, 0);
        Sua_Nhan_Vien EditNV = new Sua_Nhan_Vien((int) ma, QuanLy_UI.this, model_NV);
        EditNV.setVisible(true);
    }//GEN-LAST:event_btnEditNVActionPerformed

    private void Delete_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_button3ActionPerformed
        DefaultTableModel model_NV = (DefaultTableModel) tbl_NhanVien.getModel();
        Object ma = tbl_NhanVien.getValueAt(index_tbl_NV, 0);
        boolean success = NhanVienDAO.DeleteNVbyMa((int) ma);
        if (success) {
            JOptionPane.showMessageDialog(null, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            model_NV.removeRow(index_tbl_NV);
        } else {
            JOptionPane.showMessageDialog(null, "Xóa không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Delete_button3ActionPerformed

    private void btn_TKKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TKKHActionPerformed
        String tukhoa = txt_TKKH.getText();
        DefaultTableModel model = (DefaultTableModel) tbl_KhachHang.getModel();
        model.setRowCount(0);
        List<Object[]> DSKH = KhachHangDAO.TimKiemKH(tukhoa);
        for (Object[] x : DSKH) {
            model.addRow(x);
        }
        model.fireTableDataChanged();
        tbl_KhachHang.revalidate();
        tbl_KhachHang.repaint();
    }//GEN-LAST:event_btn_TKKHActionPerformed

    private void btn_EditKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditKHActionPerformed
        DefaultTableModel model_KH = (DefaultTableModel) tbl_KhachHang.getModel();
        Object ma = tbl_KhachHang.getValueAt(index_tbl_KH, 0);
        Sua_Khach_Hang EditKH = new Sua_Khach_Hang((int) ma, QuanLy_UI.this, model_KH);
        EditKH.setVisible(true);
    }//GEN-LAST:event_btn_EditKHActionPerformed

    private void btn_DeleteKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteKHActionPerformed
        DefaultTableModel model_KH = (DefaultTableModel) tbl_KhachHang.getModel();
        Object ma = tbl_KhachHang.getValueAt(index_tbl_KH, 0);
        boolean success = KhachHangDAO.DeleteKHbyMa((int) ma);
        if (success) {
            JOptionPane.showMessageDialog(null, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            model_KH.removeRow(index_tbl_KH);
        } else {
            JOptionPane.showMessageDialog(null, "Xóa không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_DeleteKHActionPerformed

    private void btn_TKHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TKHDActionPerformed
        String tk = txt_TKHD.getText();
        DefaultTableModel model = (DefaultTableModel) tbl_HoaDon.getModel();
        model.setRowCount(0);
        List<Object[]> DSHD = HoaDonDAO.TimKiemHD(tk);
        for (Object[] x : DSHD) {
            model.addRow(x);
        }
        model.fireTableDataChanged();
        tbl_KhachHang.revalidate();
        tbl_KhachHang.repaint();
    }//GEN-LAST:event_btn_TKHDActionPerformed

    private void btn_editHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editHDActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_HoaDon.getModel();
        int ma = (int)tbl_HoaDon.getValueAt(index_tbl_HD, 0);
        ThongTinHD HDdetail = new ThongTinHD(ma,QuanLy_UI.this, model);
        HDdetail.setVisible(true);
    }//GEN-LAST:event_btn_editHDActionPerformed

    private void btn_deleteHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteHDActionPerformed
        DefaultTableModel model_HD = (DefaultTableModel) tbl_HoaDon.getModel();
        Object ma = tbl_HoaDon.getValueAt(index_tbl_HD, 0);
        boolean success = HoaDonDAO.DeleteHDbyMa((int) ma);
        if (success) {
            JOptionPane.showMessageDialog(null, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            model_HD.removeRow(index_tbl_HD);
        } else {
            JOptionPane.showMessageDialog(null, "Xóa không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteHDActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_addSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSPActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_SanPham.getModel();
        Them_San_Pham addSP = new Them_San_Pham(QuanLy_UI.this, model);
        addSP.setVisible(true);
    }//GEN-LAST:event_btn_addSPActionPerformed

    private void tbl_NhanVienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tbl_NhanVienComponentShown
        DSNV();
    }//GEN-LAST:event_tbl_NhanVienComponentShown

    private void card_quanlynhanvienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_card_quanlynhanvienComponentShown
        btnEditNV.setVisible(false);
        Delete_button3.setVisible(false);
    }//GEN-LAST:event_card_quanlynhanvienComponentShown


    private void Add_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_button3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_NhanVien.getModel();
        Them_Nhan_Vien addNV = new Them_Nhan_Vien(QuanLy_UI.this, model);
        addNV.setVisible(true);
    }//GEN-LAST:event_Add_button3ActionPerformed

    private void Cards_QuanLyComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Cards_QuanLyComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Cards_QuanLyComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DSSP();
    }//GEN-LAST:event_formComponentShown

    private void txtTKSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTKSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTKSPActionPerformed

    private void btn_AddKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddKHActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_KhachHang.getModel();
        Them_khach_hang addKH = new Them_khach_hang(QuanLy_UI.this, model);
        addKH.setVisible(true);
    }//GEN-LAST:event_btn_AddKHActionPerformed

    private void txt_TKKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TKKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TKKHActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Add_button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_button4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_HoaDon.getModel();
        TaoHoaDon addHD = new TaoHoaDon(QuanLy_UI.this, model);
        addHD.setVisible(true);
    }//GEN-LAST:event_Add_button4ActionPerformed

    private void btn_dsnhanvien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dsnhanvien1ActionPerformed
        Cards_QuanLy.removeAll();
        Cards_QuanLy.add(card_quanlynhanvien);
        btnEditNV.setVisible(false);
        Delete_button3.setVisible(false);
        Cards_QuanLy.repaint();
        Cards_QuanLy.revalidate();
        DefaultTableModel model1 = (DefaultTableModel) tbl_NhanVien.getModel();
        model1.setRowCount(0);
        DSNV();
    }//GEN-LAST:event_btn_dsnhanvien1ActionPerformed

    private void btn_xoatatcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoatatcaActionPerformed
        DefaultTableModel model1 = (DefaultTableModel) tbl_SanPhamGGed.getModel();
        model1.setRowCount(0);
        boolean a = SanPhamDAO.XoaAllSPGG();
        DefaultTableModel model2 = (DefaultTableModel) tbl_SanPhamGG.getModel();
        model2.setRowCount(0);
        DSSPGG();
    }//GEN-LAST:event_btn_xoatatcaActionPerformed
private boolean isValidRow(int rowIndex, JTable table) {
    return rowIndex >= 0 && rowIndex < table.getRowCount();
}
    private void btn_chuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyenActionPerformed
        DefaultTableModel model_GG = (DefaultTableModel) tbl_SanPhamGG.getModel();
        DefaultTableModel model_GGed = (DefaultTableModel) tbl_SanPhamGGed.getModel();
        if (index_tbl_GG != -1) {
            int ma = (int) tbl_SanPhamGG.getValueAt(index_tbl_GG, 0);
            String ten = (String) tbl_SanPhamGG.getValueAt(index_tbl_GG, 1);
             String loai = (String) tbl_SanPhamGG.getValueAt(index_tbl_GG, 2);

            // ... kiểm tra trước khi thực hiện thao tác
            if (isValidRow(index_tbl_GG, tbl_SanPhamGG)) {
                Object[] rowData = {ma, ten, loai};
                model_GGed.addRow(rowData);
                index_tbl_GGed = -1;
                model_GG.removeRow(index_tbl_GG);

                SanPham SP = new SanPham(ma, ten, loai);
                int maSPGG_sql = SanPhamDAO.ThemSPGG(SP);
            }
        }

        if (index_tbl_GGed != -1) {
            // ... kiểm tra trước khi thực hiện thao tác
            if (isValidRow(index_tbl_GGed, tbl_SanPhamGGed)) {
                index_tbl_GG = -1;
                int ma = (int) tbl_SanPhamGGed.getValueAt(index_tbl_GGed, 0);
                String ten = (String) tbl_SanPhamGGed.getValueAt(index_tbl_GGed, 1);
                String loai = (String) tbl_SanPhamGGed.getValueAt(index_tbl_GGed, 2);
                Object[] rowData = {ma, ten, loai};
                model_GG.addRow(rowData);
                model_GGed.removeRow(index_tbl_GGed);

                boolean isdelete = SanPhamDAO.XoaSPGG(ma);
            }
        }


    }//GEN-LAST:event_btn_chuyenActionPerformed
    public void DSSP() {
        DefaultTableModel model = (DefaultTableModel) tbl_SanPham.getModel();

        List<Object[]> DSSP = SanPhamDAO.ListSP();

        for (Object[] x : DSSP) {
            model.addRow(x);
        }
    }

    public void DSSPGG() {
        DefaultTableModel model = (DefaultTableModel) tbl_SanPhamGG.getModel();

        List<Object[]> DSSP = SanPhamDAO.ListSPGG();

        for (Object[] x : DSSP) {
            model.addRow(x);
        }
    }

    public void DSSPGGed() {
        DefaultTableModel model = (DefaultTableModel) tbl_SanPhamGGed.getModel();

        List<Object[]> DSSP = SanPhamDAO.ListSPGGed();

        for (Object[] x : DSSP) {
            model.addRow(x);
        }
    }

    public void DSHD() {
        DefaultTableModel model = (DefaultTableModel) tbl_HoaDon.getModel();

        List<Object[]> DSHD = HoaDonDAO.ListHD();

        for (Object[] x : DSHD) {
            model.addRow(x);
        }
    }

    public void DSKH() {
        DefaultTableModel model = (DefaultTableModel) tbl_KhachHang.getModel();

        List<Object[]> DSKH = KhachHangDAO.ListKH();

        for (Object[] x : DSKH) {
            model.addRow(x);
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_button3;
    private javax.swing.JButton Add_button4;
    private javax.swing.JPanel Cards_QuanLy;
    private javax.swing.JButton Delete_button3;
    private javax.swing.JLabel Imagine_label;
    private javax.swing.JButton btnEditNV;
    private javax.swing.JButton btnTimKiemNV;
    private javax.swing.JButton btn_AddKH;
    private javax.swing.JButton btn_DeleteKH;
    private javax.swing.JButton btn_EditKH;
    private javax.swing.JButton btn_TKHD;
    private javax.swing.JButton btn_TKKH;
    private javax.swing.JButton btn_TKSP;
    private javax.swing.JButton btn_addSP;
    private javax.swing.JButton btn_chuyen;
    private javax.swing.JButton btn_deleteHD;
    private javax.swing.JButton btn_deleteSP;
    private javax.swing.JButton btn_dsgiamgia;
    private javax.swing.JButton btn_dshoadon;
    private javax.swing.JButton btn_dskhachhang;
    private javax.swing.JButton btn_dsnhanvien1;
    private javax.swing.JButton btn_dssanpham;
    private javax.swing.JButton btn_editHD;
    private javax.swing.JButton btn_editSP;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_xoatatca;
    private javax.swing.JPanel card_giamgia;
    private javax.swing.JPanel card_quanlyhoadon;
    private javax.swing.JPanel card_quanlykhachhang;
    private javax.swing.JPanel card_quanlynhanvien;
    private javax.swing.JPanel card_quanlysanpham;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel panel_fillter;
    private javax.swing.JPanel panel_fillter1;
    private javax.swing.JPanel panel_fillter2;
    private javax.swing.JPanel panel_fillter3;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JTable tbl_HoaDon;
    private javax.swing.JTable tbl_KhachHang;
    private javax.swing.JTable tbl_NhanVien;
    private javax.swing.JTable tbl_SanPham;
    private javax.swing.JTable tbl_SanPhamGG;
    private javax.swing.JTable tbl_SanPhamGGed;
    private javax.swing.JTextField txtTKSP;
    private javax.swing.JTextField txtTimKiemNV;
    private javax.swing.JTextField txt_TKHD;
    private javax.swing.JTextField txt_TKKH;
    // End of variables declaration//GEN-END:variables
}
