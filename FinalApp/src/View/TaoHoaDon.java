package View;

import Controller.HoaDonDAO;
import Controller.HoaDonDetailDAO;
import Controller.KhachHangDAO;
import Controller.NhanVienDAO;
import Controller.SanPhamDAO;
import Model.HoaDon;
import Model.HoaDonDetail;
import Model.SanPham;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class TaoHoaDon extends javax.swing.JDialog {
    private int index_tbl_HD;
    private DefaultTableModel tableModel;
    private QuanLy_UI quanli_ui;
    public int maHD_sql;

    public TaoHoaDon(JFrame parent, DefaultTableModel tableModel) {
        super(parent, "Thêm Hóa Đơn", true);
        this.tableModel = tableModel;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        quanli_ui = (QuanLy_UI) parent;
        
         DSKH();
         DSNV();
         
         //        Sự kiện khi chọn 1 hàng trong bảng Sản phẩm
        ListSelectionModel selectionModel = tbl_SanPhamHD.getSelectionModel();
        DefaultTableModel model_SPHD = (DefaultTableModel)tbl_SanPhamHD.getModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Lấy chỉ mục hàng được chọn
                    index_tbl_HD = tbl_SanPhamHD.getSelectedRow();
                    Object value = tbl_SanPhamHD.getValueAt(index_tbl_HD, 1); 
                    int maxSL = (int)tbl_SanPhamHD.getValueAt(index_tbl_HD, 4); 
                    
                    SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, maxSL, 1);
                    SoLuong.setModel(spinnerModel);
                    txt_TenSP.setText((String)value);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SoLuong = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        Them = new javax.swing.JButton();
        txt_TenSP = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SanPhamHD = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_tong = new javax.swing.JLabel();
        txt_khuyenmai = new javax.swing.JLabel();
        txt_tongdon = new javax.swing.JLabel();
        DsMuaSP = new javax.swing.JScrollPane();
        DS_SPHD = new javax.swing.JTable();
        Them1 = new javax.swing.JButton();
        Huy1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_tenKH = new javax.swing.JComboBox<>();
        cb_tenNV = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(475, 550));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TẠO HÓA ĐƠN");

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("SL");

        SoLuong.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel7.setText("Tên SP:");

        Them.setBackground(new java.awt.Color(153, 255, 153));
        Them.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Them.setText("Thêm");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Them, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Them, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 255, 255));

        tbl_SanPhamHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Loại SP", "Giá", "Số lượng còn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_SanPhamHD);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setForeground(new java.awt.Color(255, 255, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 550));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("HÓA ĐƠN");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setText("Tổng ");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setText("Khuyến mãi");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel38.setText("Tổng đơn");

        txt_tong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_tong.setText("0");

        txt_khuyenmai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txt_tongdon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_tongdon.setText("0");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_tongdon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(txt_tong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_khuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_tong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(txt_khuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(txt_tongdon))
                .addGap(35, 35, 35))
        );

        DsMuaSP.setBackground(new java.awt.Color(255, 255, 255));
        DsMuaSP.setBorder(null);
        DsMuaSP.setForeground(new java.awt.Color(255, 255, 255));
        DsMuaSP.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        DS_SPHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "SL", "Giá", "Thành Tiền", "MaSP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DsMuaSP.setViewportView(DS_SPHD);
        if (DS_SPHD.getColumnModel().getColumnCount() > 0) {
            DS_SPHD.getColumnModel().getColumn(0).setMinWidth(100);
            DS_SPHD.getColumnModel().getColumn(0).setPreferredWidth(100);
            DS_SPHD.getColumnModel().getColumn(1).setPreferredWidth(40);
            DS_SPHD.getColumnModel().getColumn(4).setMinWidth(0);
            DS_SPHD.getColumnModel().getColumn(4).setPreferredWidth(0);
            DS_SPHD.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        Them1.setBackground(new java.awt.Color(153, 255, 153));
        Them1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Them1.setText("Tạo hóa đơn");
        Them1.setMaximumSize(new java.awt.Dimension(95, 30));
        Them1.setMinimumSize(new java.awt.Dimension(95, 30));
        Them1.setPreferredSize(new java.awt.Dimension(95, 30));
        Them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Them1ActionPerformed(evt);
            }
        });

        Huy1.setBackground(new java.awt.Color(255, 102, 102));
        Huy1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Huy1.setText("Hủy");
        Huy1.setMaximumSize(new java.awt.Dimension(90, 30));
        Huy1.setMinimumSize(new java.awt.Dimension(90, 30));
        Huy1.setPreferredSize(new java.awt.Dimension(90, 30));
        Huy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Huy1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Khách hàng");

        cb_tenKH.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cb_tenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tenKHActionPerformed(evt);
            }
        });

        cb_tenNV.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cb_tenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tenNVActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Nhân Viên");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Them1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Huy1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DsMuaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_tenNV, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_tenKH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DsMuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Them1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(Huy1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Them1ActionPerformed
        String tenKH = (String) cb_tenKH.getSelectedItem();
        String tenNV = (String) cb_tenNV.getSelectedItem();
        
        int maNV = NhanVienDAO.GetMaByTen(tenNV);
        int maKH = KhachHangDAO.GetMaByTen(tenKH);
        
        int GTHD = Integer.parseInt(txt_tongdon.getText());
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String NgayTao = currentDate.format(formatter);
        
        HoaDon HD = new HoaDon(maNV, maKH, GTHD, NgayTao);
        maHD_sql = HoaDonDAO.ThemHD(HD);
        
        DefaultTableModel model_SPHD = (DefaultTableModel)DS_SPHD.getModel(); 
        
        for (int i = 0; i < model_SPHD.getRowCount(); i++) {
                int maSP = (int)model_SPHD.getValueAt(i, 4);
                int sol = (int)model_SPHD.getValueAt(i, 1);    
                int gia = (int)model_SPHD.getValueAt(i, 2);    
                HoaDonDetail HDT = new HoaDonDetail( maSP,maHD_sql, sol, gia);
                    int a = HoaDonDetailDAO.ThemSPHD(HDT);
                
                boolean update = SanPhamDAO.updateSoLuong(sol, maSP);
            }
        
        if(maHD_sql > 0){
            addHD(HD);
            JOptionPane.showMessageDialog(null, "Hóa Đơn đã được thêm!","Thêm Thành Công", JOptionPane.OK_OPTION);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Hóa đơn chưa được thêm, Kiểm tra lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_Them1ActionPerformed

    private void addHD(HoaDon HD) {
        Object[] rowData = {maHD_sql, HD.getMaNV(), HD.getMaKH(), HD.getGTHD(), HD.getNgayTao()};
        tableModel.addRow(rowData);
    }
    
    private void Huy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Huy1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_Huy1ActionPerformed
    public static boolean isMaSPInList(int maSP) {
        List<Object[]> listSPGGed = SanPhamDAO.ListSPGGed();
        for (Object[] sp : listSPGGed) {
            if ((int) sp[0] == maSP) {
                return true; // Mã SP có trong danh sách
            }
        }
        return false; // Mã SP không có trong danh sách
    }
    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        ListSelectionModel selectionModel = tbl_SanPhamHD.getSelectionModel();
        DefaultTableModel model_SP = (DefaultTableModel)tbl_SanPhamHD.getModel(); 
        DefaultTableModel model_SPHD = (DefaultTableModel)DS_SPHD.getModel();         
        
//        Lấy các giá trị từ bảng khi thay đổi chọn
        int ma = (int)tbl_SanPhamHD.getValueAt(index_tbl_HD, 0);
        Object ten = tbl_SanPhamHD.getValueAt(index_tbl_HD, 1); 
        int gia = (int)tbl_SanPhamHD.getValueAt(index_tbl_HD, 3); 
        
        boolean giam = isMaSPInList(ma);
        if(giam){
            gia -= gia*0.1;
        }
        
        int sl = (int)SoLuong.getValue(); 
        int tien = gia*sl;
        
        if(sl != 0){
            boolean SLTrung = false;
            int sl_sp = (int)model_SP.getValueAt(index_tbl_HD, 4);
            sl_sp -= sl;
            model_SP.setValueAt(sl_sp, index_tbl_HD, 4);
            SoLuong.setValue(0);
            SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, sl_sp, 1);
            SoLuong.setModel(spinnerModel);
    //        Thêm vào bảng hóa đơn
            int TT = 0;
            for (int i = 0; i < model_SPHD.getRowCount(); i++) {
                int maHDValue = (int)model_SPHD.getValueAt(i, 4); // Cột MaHD có chỉ số 0
                int sol = (int)model_SPHD.getValueAt(i, 1);    
                int tien_mua = (int)model_SPHD.getValueAt(i, 3);    
                if (maHDValue == ma) {
                    sol += sl;
                    tien_mua += tien;
                    model_SPHD.setValueAt(sol, i, 1);
                    model_SPHD.setValueAt(tien_mua, i, 3);
                    SLTrung = true;
                    break;
                }
            }
            if(!SLTrung){
                Object[] rowData = {ten, sl, gia, tien, ma};
                model_SPHD.addRow(rowData);
            }

            for (int i = 0; i < model_SPHD.getRowCount(); i++) {
                int tien_mua = (int)model_SPHD.getValueAt(i, 3);  
                TT += tien_mua;
            }
            txt_tong.setText(String.valueOf(TT));
            int voucher = 0;
          
            String loaiKH = (String) cb_tenKH.getSelectedItem();
            boolean isVIP = KhachHangDAO.isKHVIP(loaiKH);
            if(isVIP){
                voucher = 10;
                txt_khuyenmai.setText("10%");
                TT -= TT*0.1;
            }else{
                txt_khuyenmai.setText("0%");
            }
            txt_tongdon.setText(String.valueOf(TT));
        }
    }//GEN-LAST:event_ThemActionPerformed
    public void DSKH() {
        List<Object[]> dataList = KhachHangDAO.ListKH(); 
        List<String> DSKH_name = new ArrayList<>();
        DSKH_name.add("Chưa có");
        for (Object[] data : dataList) {
            if (data.length > 1 && data[1] != null) {
                DSKH_name.add((String) data[1]);
            }
        }        
        // Sử dụng phương thức toArray(T[] a) với kiểu mảng cụ thể
        String[] list = DSKH_name.toArray(new String[0]);

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(list);
        cb_tenKH.setModel(comboBoxModel);
    }
    
    public void DSNV() {
        List<Object[]> dataList = NhanVienDAO.ListNV(); 
        List<String> DSKH_name = new ArrayList<>();
        for (Object[] data : dataList) {
            if (data.length > 1 && data[1] != null) {
                DSKH_name.add((String) data[1]);
            }
        }        
        // Sử dụng phương thức toArray(T[] a) với kiểu mảng cụ thể
        String[] list = DSKH_name.toArray(new String[0]);

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(list);
        cb_tenNV.setModel(comboBoxModel);
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DSSP();
    }//GEN-LAST:event_formComponentShown

    private void cb_tenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tenKHActionPerformed
        String loaiKH = (String) cb_tenKH.getSelectedItem();
        boolean isVIP = KhachHangDAO.isKHVIP(loaiKH);
        int TT = 0;
        DefaultTableModel model_SPHD = (DefaultTableModel)DS_SPHD.getModel();
        for (int i = 0; i < model_SPHD.getRowCount(); i++) {
                int tien_mua = (int)model_SPHD.getValueAt(i, 3);  
                TT += tien_mua;
        }
        if(isVIP){
                txt_khuyenmai.setText("10%");
                TT -= TT*0.1;
        }else{
            txt_khuyenmai.setText("0%");
        }
            txt_tongdon.setText(String.valueOf(TT));
    }//GEN-LAST:event_cb_tenKHActionPerformed

    private void cb_tenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tenNVActionPerformed
    public void DSSP(){
        DefaultTableModel model = (DefaultTableModel)tbl_SanPhamHD.getModel();
        
        List<Object[]> DSSP = SanPhamDAO.ListSP();
        
        for(Object[] x : DSSP){
            model.addRow(x);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DS_SPHD;
    private javax.swing.JScrollPane DsMuaSP;
    private javax.swing.JButton Huy1;
    private javax.swing.JSpinner SoLuong;
    private javax.swing.JButton Them;
    private javax.swing.JButton Them1;
    private javax.swing.JComboBox<String> cb_tenKH;
    private javax.swing.JComboBox<String> cb_tenNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_SanPhamHD;
    private javax.swing.JLabel txt_TenSP;
    private javax.swing.JLabel txt_khuyenmai;
    private javax.swing.JLabel txt_tong;
    private javax.swing.JLabel txt_tongdon;
    // End of variables declaration//GEN-END:variables
}