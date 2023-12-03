package mod5;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Program1 extends javax.swing.JFrame {
    private DefaultTableModel tbl;
    
    public class konektor {
    Connection con;
    public Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/yohanmod5","root","");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Proses Pengoneksian Belum Berhasil");
        }
        return con;
    }
}
    public Program1() {
        initComponents();
        displayout();
        this.setLocationRelativeTo(null);
    }
    
    static boolean pilihan= false;
    
    public static void setPilihan(boolean ok){
        pilihan = ok; 
    }
    public static boolean getPilihan(){
        return pilihan; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jc_pilihjenis = new javax.swing.JComboBox<>();
        jc_pilihtahun = new javax.swing.JComboBox<>();
        bt_hapus = new javax.swing.JButton();
        bt_update = new javax.swing.JButton();
        bt_reset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_datapelanggan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID MEMBER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        tf_id.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 290, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAMA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        tf_nama.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 290, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JENIS MEMBER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jc_pilihjenis.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jc_pilihjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIHAN JENIS", "Gold", "Platinum" }));
        jPanel1.add(jc_pilihjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 120, -1));

        jc_pilihtahun.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jc_pilihtahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIHAN TAHUN", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        jPanel1.add(jc_pilihtahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        bt_hapus.setBackground(new java.awt.Color(255, 255, 255));
        bt_hapus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_hapus.setText("HAPUS");
        bt_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(bt_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        bt_update.setBackground(new java.awt.Color(255, 255, 255));
        bt_update.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_update.setText("SIMPAN");
        bt_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });
        jPanel1.add(bt_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        bt_reset.setBackground(new java.awt.Color(255, 255, 255));
        bt_reset.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_reset.setText("RESET");
        bt_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetActionPerformed(evt);
            }
        });
        jPanel1.add(bt_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORMULIR DAFTAR PELANGGAN");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 560, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TAHUN LAHIR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        tb_datapelanggan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tb_datapelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_datapelanggan.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tb_datapelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_datapelangganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_datapelanggan);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 390, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void bersih(){
        tf_id.setText("");
        tf_nama.setText("");
        jc_pilihtahun.setSelectedIndex(0);
        jc_pilihjenis.setSelectedIndex(0);
        bt_update.setText("Simpan");
        setPilihan(false);
    }
    
    public void displayout(){
        tbl = new DefaultTableModel();
        tb_datapelanggan.setModel(tbl);
        
        tb_datapelanggan.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        tb_datapelanggan.getTableHeader().setForeground(Color.black);
        TableCellRenderer rendererFromHeader = tb_datapelanggan.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        
        tbl.addColumn("NO ID");
        tbl.addColumn("NAMA");
        tbl.addColumn("T_LAHIR");
        tbl.addColumn("JENIS");
        
        try {
            Connection c = new konektor().getConnection();
            Statement st = c.createStatement();
            String sql ="select * from pelanggan";
            ResultSet hasil = st.executeQuery(sql);

            while (hasil.next()){
                    Object [] o = new Object[4];
                    o[0] = hasil.getString("id_member");
                    o[1] = hasil.getString("nama");
                    o[2] = hasil.getString("tahun_lahir");
                    o[3] = hasil.getString("jenis");

                    tbl.addRow(o);
            }
            hasil.close();
            st.close();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Peroses Koneksi Belum Berhasil");
            }
    }
    
    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void bt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bt_resetActionPerformed

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        // TODO add your handling code here:
        String IDMember,nama,tahunlahir,jenis,gantiID="";
        int row = tb_datapelanggan.getSelectedRow();
        IDMember = tf_id.getText();
        nama = tf_nama.getText();
        tahunlahir = String.valueOf(jc_pilihtahun.getSelectedItem());
        jenis = String.valueOf(jc_pilihjenis.getSelectedItem());
        if(getPilihan() == true){
            gantiID = (String)tb_datapelanggan.getValueAt(row, 0);
            try{
                Connection con = new konektor().getConnection();
                String sql = "UPDATE `pelanggan` SET `id_member`='"+IDMember+
                        "',`nama`='"+nama+
                        "',`tahun_lahir`='"+tahunlahir+
                        "',`jenis`='"+jenis+
                        "' WHERE id_member = '"+gantiID+"'";
                Statement st = con.createStatement();
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
                con.close();
                displayout();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Data Tidak Bisa Di Update");
            }
            bersih();
        }
        else{
            try{
                Connection con = new konektor().getConnection();
                String sql = "INSERT INTO pelanggan (`id_member`, `nama`, `tahun_lahir`, `jenis`) VALUES ('"+IDMember+
                        "','"+nama+
                        "','"+tahunlahir+
                        "','"+jenis+"')";
                Statement st = con.createStatement();
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
                con.close();
                displayout();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Data Tidak Bisa Di Simpan");
            }
            bersih();
        }
    }//GEN-LAST:event_bt_updateActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        // TODO add your handling code here:
        String IDMember = tf_id.getText();
        if (getPilihan()== true){
            try{
                Connection con = new konektor().getConnection();
                String sql = "DELETE FROM pelanggan WHERE `pelanggan`.`id_member` = '"+IDMember+"'";

                Statement st = con.createStatement();
                st.executeUpdate(sql);
                bersih();

                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                displayout();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Data Tidak Bisa Dihapus");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Mohon Pilih Data Terlebih Dahulu");
        }
        bersih();
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void tb_datapelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_datapelangganMouseClicked
        // TODO add your handling code here:
        bt_update.setText("Ubah");
        setPilihan(true);
        int row = tb_datapelanggan.getSelectedRow();
        tf_id.setText((String)tb_datapelanggan.getValueAt(row, 0));
        tf_nama.setText((String)tb_datapelanggan.getValueAt(row, 1));
        jc_pilihtahun.setSelectedItem((String)tb_datapelanggan.getValueAt(row, 2));
        jc_pilihjenis.setSelectedItem((String)tb_datapelanggan.getValueAt(row, 3));

    }//GEN-LAST:event_tb_datapelangganMouseClicked

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
            java.util.logging.Logger.getLogger(Program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_reset;
    private javax.swing.JButton bt_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jc_pilihjenis;
    private javax.swing.JComboBox<String> jc_pilihtahun;
    private javax.swing.JTable tb_datapelanggan;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nama;
    // End of variables declaration//GEN-END:variables
}
