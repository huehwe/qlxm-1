/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;


import com.formdev.flatlaf.FlatLightLaf;
import dao.NhaCungCapDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.NhaCungCap;

/**
 *
 * @author Tran Nhat Sinh
 */
public class UpdateNhaCungCap extends javax.swing.JDialog {

    /**
     * Creates new form AddAccount
     */
    private NhaCungCapForm parent;
    public UpdateNhaCungCap(javax.swing.JInternalFrame parent,javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);
        this.parent = (NhaCungCapForm) parent;
        initComponents();
        setLocationRelativeTo(null);
        displayInfo();
    }

    UpdateNhaCungCap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private UpdateNhaCungCap(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void displayInfo() {
        NhaCungCap a = parent.getNhaCungCapSelect();
        txtMaNhaCungCap.setText(a.getMaNhaCungCap());
        txtDiaChi.setText(a.getDiaChi());
        txtTenNhaCungCap.setText(a.getTenNhaCungCap());
        txtphone1.setText(a.getSdt());
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
        jLabel2 = new javax.swing.JLabel();
        txtMaNhaCungCap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNhaCungCap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtphone1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập nhật thông tin");

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        jLabel2.setText("Mã nhà cung cấp");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, -1));

        txtMaNhaCungCap.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        txtMaNhaCungCap.setEnabled(false);
        jPanel1.add(txtMaNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 260, 38));

        jLabel3.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        jLabel3.setText("Tên nhà cung cấp");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, 24));

        txtTenNhaCungCap.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        txtTenNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNhaCungCapActionPerformed(evt);
            }
        });
        jPanel1.add(txtTenNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 260, 38));

        jLabel4.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        jLabel4.setText("Số điện thoại");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        txtDiaChi.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 260, 38));

        jLabel5.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        jLabel5.setText("Địa chỉ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 50, -1));

        jButton1.setBackground(new java.awt.Color(146, 154, 171));
        jButton1.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Lưu thay đổi");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 140, 38));

        jButton2.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        jButton2.setText("Huỷ");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 140, 38));

        jPanel2.setBackground(new java.awt.Color(146, 154, 171));

        jLabel1.setFont(new java.awt.Font("iCiel Gotham Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CẬP NHẬT THÔNG TIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));

        txtphone1.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 12)); // NOI18N
        jPanel1.add(txtphone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 260, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            NhaCungCap ncc = new NhaCungCap();
            ncc.setMaNhaCungCap(txtMaNhaCungCap.getText());
            ncc.setTenNhaCungCap(txtTenNhaCungCap.getText());
            ncc.setSdt(txtphone1.getText());
            ncc.setDiaChi(txtDiaChi.getText());
            NhaCungCapDAO nccDao = new NhaCungCapDAO();
            nccDao.update(ncc);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Sửa thành công !");    
            parent.loadDataToTable(NhaCungCapDAO.getInstance().selectAll());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Thất bại !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTenNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNhaCungCapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateNhaCungCap dialog = new UpdateNhaCungCap(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNhaCungCap;
    private javax.swing.JTextField txtTenNhaCungCap;
    private javax.swing.JTextField txtphone1;
    // End of variables declaration//GEN-END:variables
}