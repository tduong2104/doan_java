/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controller.NhanVienDAO;
import Model.NhanVien;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author trong
 */
public class Sua_Nhan_Vien extends javax.swing.JDialog {
    private int MaNV;
  
    private DefaultTableModel tableModel;
    private QuanLy_UI quanli_ui;
    public void receiveData(int ma){
        this.MaNV = ma;
    };
    public Sua_Nhan_Vien(int ma, JFrame parent, DefaultTableModel tableModel) {
        super(parent, "Sửa Nhân Viên", true);
        this.MaNV = ma;
        this.tableModel = tableModel;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        quanli_ui = (QuanLy_UI) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        info_panel = new javax.swing.JPanel();
        HoTen_label = new javax.swing.JLabel();
        SDT_label = new javax.swing.JLabel();
        Tuoi_label = new javax.swing.JLabel();
        NgayVaoLam_label = new javax.swing.JLabel();
        Luong_label = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtNgayVaoLam = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        cbLoaiNV = new javax.swing.JCheckBox();
        btn_panel = new javax.swing.JPanel();
        btn_Sua = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        form = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sửa");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        HoTen_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HoTen_label.setText("Họ Tên");

        SDT_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SDT_label.setText("Số Điện thoại");

        Tuoi_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Tuoi_label.setText("Tuổi");

        NgayVaoLam_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NgayVaoLam_label.setText("Ngày vào làm");

        Luong_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Luong_label.setText("Lương");

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtTuoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtNgayVaoLam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cbLoaiNV.setText("Full Time");
        cbLoaiNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout info_panelLayout = new javax.swing.GroupLayout(info_panel);
        info_panel.setLayout(info_panelLayout);
        info_panelLayout.setHorizontalGroup(
            info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Luong_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NgayVaoLam_label, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(Tuoi_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SDT_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoTen_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbLoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtNgayVaoLam, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        info_panelLayout.setVerticalGroup(
            info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen)
                    .addComponent(HoTen_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT)
                    .addComponent(SDT_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTuoi)
                    .addComponent(Tuoi_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayVaoLam)
                    .addComponent(NgayVaoLam_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLuong)
                    .addComponent(Luong_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbLoaiNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Sua.setBackground(new java.awt.Color(153, 255, 255));
        btn_Sua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_Sua.setText("Lưu");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Reset.setBackground(new java.awt.Color(255, 0, 0));
        btn_Reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_Reset.setText("Huy");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_panelLayout = new javax.swing.GroupLayout(btn_panel);
        btn_panel.setLayout(btn_panelLayout);
        btn_panelLayout.setHorizontalGroup(
            btn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_panelLayout.setVerticalGroup(
            btn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        form.setText("SỬA THÔNG TIN NHÂN VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 103, Short.MAX_VALUE)
                        .addComponent(form)
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
       String HoTen = txtHoTen.getText();
        if(HoTen == null){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        String SDT = txtSDT.getText();
        
        int tuoi;
        if(txtTuoi.getText().trim().isEmpty()){
            tuoi = 0;
        }else{
            tuoi = Integer.parseInt(txtTuoi.getText());
        }
        String NgayVL = txtNgayVaoLam.getText();
        
        int luong;
        if(txtLuong.getText().trim().isEmpty()){
            luong = 0;
        }else{
            luong = Integer.parseInt(txtLuong.getText());
        }
        
        String loai;
        boolean isSelected = cbLoaiNV.isSelected();
        if(isSelected){
            loai = "FullTime";
        }else {
            loai = "PartTime";
        }
        
        NhanVien NV = new NhanVien(this.MaNV, HoTen, SDT, tuoi, NgayVL, luong, loai);
        
        boolean updated = NhanVienDAO.EditNV(NV);
        if(updated){
            JOptionPane.showMessageDialog(null, "Nhân Viên đã được Cập Nhập!","Thêm Thành Công", JOptionPane.OK_OPTION);
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                int maNhanVien = (int) tableModel.getValueAt(i, 0); 
                if (maNhanVien == this.MaNV) {
                    // Cập nhật thông tin cho hàng tương ứng
                    tableModel.setValueAt(HoTen, i, 1);
                    tableModel.setValueAt(luong, i, 2);
                    tableModel.setValueAt(NgayVL, i, 3);
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void cbLoaiNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiNVActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        EditNVShow();
    }//GEN-LAST:event_formComponentShown
    public void EditNVShow(){
        NhanVien NV = NhanVienDAO.ShowNVbyMa(this.MaNV);
        txtHoTen.setText(NV.getHoten());
        txtTuoi.setText(String.valueOf(NV.getTuoi()));
        txtSDT.setText(NV.getSDT());
        txtNgayVaoLam.setText(NV.getNgVL());
        txtLuong.setText(String.valueOf(NV.getLuong()));
        
        if (!NV.getLoaiNV().equals("FullTime")) {
            cbLoaiNV.setSelected(false);
        } else {
            cbLoaiNV.setSelected(true);
        }
        
        
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HoTen_label;
    private javax.swing.JLabel Luong_label;
    private javax.swing.JLabel NgayVaoLam_label;
    private javax.swing.JLabel SDT_label;
    private javax.swing.JLabel Tuoi_label;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JPanel btn_panel;
    private javax.swing.JCheckBox cbLoaiNV;
    private javax.swing.JLabel form;
    private javax.swing.JPanel info_panel;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtNgayVaoLam;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}