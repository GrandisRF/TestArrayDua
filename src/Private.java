/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkomm
 */
public class Private extends javax.swing.JFrame {

    /**
     * Creates new form Cupcakes
     */
    public Private() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        pilih = new javax.swing.JComboBox<>();
        usia = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        goldar = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        negara = new javax.swing.JTextField();
        waktu = new javax.swing.JTextField();
        Tarif = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 130, 130, 30);

        jLabel2.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 36)); // NOI18N
        jLabel2.setText("Pemilihan Guru Private");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 320, 60);

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 170, 130, 30);

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel4.setText("Usia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 210, 130, 30);

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 250, 130, 30);

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel6.setText("Golongan Darah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 290, 130, 30);

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel7.setText("Status");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 330, 130, 30);

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel8.setText("Kewarganegaraan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 370, 130, 30);

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel9.setText("Waktu Mengajar");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 410, 130, 30);

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel10.setText("Tarif ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 490, 130, 30);

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel11.setText("Pilih Guru");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 90, 130, 30);

        alamat.setEditable(false);
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat);
        alamat.setBounds(160, 170, 210, 30);

        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih salah satu --", "Abyaz Arzu, S.T", "Anita Fauziah, S.Pd", "Hamzah Zulfikar Ali F. S.Pd", "Nada Alifah, S.Kom" }));
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        getContentPane().add(pilih);
        pilih.setBounds(160, 90, 210, 30);

        usia.setEditable(false);
        usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usiaActionPerformed(evt);
            }
        });
        getContentPane().add(usia);
        usia.setBounds(160, 210, 210, 30);

        jenis.setEditable(false);
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        getContentPane().add(jenis);
        jenis.setBounds(160, 250, 210, 30);

        goldar.setEditable(false);
        goldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldarActionPerformed(evt);
            }
        });
        getContentPane().add(goldar);
        goldar.setBounds(160, 290, 210, 30);

        status.setEditable(false);
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status);
        status.setBounds(160, 330, 210, 30);

        negara.setEditable(false);
        negara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negaraActionPerformed(evt);
            }
        });
        getContentPane().add(negara);
        negara.setBounds(160, 370, 210, 30);

        waktu.setEditable(false);
        waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuActionPerformed(evt);
            }
        });
        getContentPane().add(waktu);
        waktu.setBounds(160, 410, 210, 30);

        Tarif.setEditable(false);
        Tarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarifActionPerformed(evt);
            }
        });
        getContentPane().add(Tarif);
        Tarif.setBounds(160, 490, 210, 30);

        nama.setEditable(false);
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(160, 130, 210, 30);

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel12.setText("Pemilihan Pelajaran");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 450, 130, 30);

        PP.setEditable(false);
        PP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPActionPerformed(evt);
            }
        });
        getContentPane().add(PP);
        PP.setBounds(160, 450, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed

        // TODO add your handling code here:
        if(pilih.getSelectedItem().equals("Abyaz Arzu, S.T")){
            nama.setText("Abyaz Arzu ");
            alamat.setText("Jl. Sidomulyo 17, Kepanjen");
            usia.setText("20 Tahun");
            jenis.setText("Laki-Laki");
            goldar.setText("A");
            status.setText("Belum Menikah ");
            negara.setText("Indonesia");
            waktu.setText(" Pagi (07.00-08.30)");
            PP.setText("Guru Pemrograman Desktop");
            Tarif.setText("Rp. 150.000");

        }else
        if(pilih.getSelectedItem().equals("Anita Fauziah S.Pd ")){
            nama.setText("Anita Fauziah");
            alamat.setText("Jl. Kelengkeng, Kepanjen");
            usia.setText("20 Tahun");
            jenis.setText("Perempuan");
            goldar.setText("O");
            status.setText("Belum Menikah");
            negara.setText("Indonesia");
            waktu.setText(" Sore (15.00-16.30)");
            PP.setText("Guru Matematika");
            Tarif.setText("Rp. 85.000");

        }else
        if(pilih.getSelectedItem().equals("Hamzah Zulfikar Ali F. S,Pd. ")){
            nama.setText("Hamzah Zulfikar Ali F.");
            alamat.setText("Jl. Jakarta 08, Kepanjen");
            usia.setText("20 Tahun");
            jenis.setText("Laki-Laki");
            goldar.setText("B");
            status.setText("Belum Menikah");
            negara.setText("Indonesia");
            waktu.setText(" Malam (18.30-21.00)");
            PP.setText("Guru Bahasa Inggris");
            Tarif.setText("Rp. 80.000");
            
        }else
        if(pilih.getSelectedItem().equals("Nada Alifah, S.Kom. ")){
            nama.setText("Nada Alifah");
            alamat.setText("Jl. Panji 12, Kepanjen");
            usia.setText("20 Tahun");
            jenis.setText("Perempuan");
            goldar.setText("B");
            status.setText("Belum Menikah");
            negara.setText("Indonesia");
            waktu.setText(" Siang (14.00-15.30)");
            PP.setText("Guru Design Grafis ");
            Tarif.setText("Rp. 100.000");

        }         // TODO add your handling code here:
    }//GEN-LAST:event_pilihActionPerformed

    private void usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usiaActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

    private void goldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goldarActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void negaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_negaraActionPerformed

    private void waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktuActionPerformed

    private void TarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TarifActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void PPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPActionPerformed

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
            java.util.logging.Logger.getLogger(Private.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Private.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Private.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Private.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Private().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PP;
    private javax.swing.JTextField Tarif;
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField goldar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField negara;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}
