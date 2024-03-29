
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    String[] candidatos;
    int nmesas = 0;
    int ncandidatos = 0;
    int[][] votaciones;

    public Menu() {
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
        Iniciar = new javax.swing.JButton();
        Ganador = new javax.swing.JButton();
        mesaMasVotada = new javax.swing.JButton();
        mesaMenosVotada = new javax.swing.JButton();
        votosCandidatos = new javax.swing.JButton();
        votosBlanco = new javax.swing.JButton();
        votosAnulados = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Elecciones Personero 2023");

        Iniciar.setBackground(new java.awt.Color(255, 27, 14));
        Iniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        Iniciar.setText("Iniciar Conteo");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        Ganador.setText("Ganador");
        Ganador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GanadorActionPerformed(evt);
            }
        });

        mesaMasVotada.setText("Mesa mas votada");
        mesaMasVotada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaMasVotadaActionPerformed(evt);
            }
        });

        mesaMenosVotada.setText("Mesa menos votada");
        mesaMenosVotada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaMenosVotadaActionPerformed(evt);
            }
        });

        votosCandidatos.setText("Votos por candiadatos");
        votosCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votosCandidatosActionPerformed(evt);
            }
        });

        votosBlanco.setText("Votos en blanco");
        votosBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votosBlancoActionPerformed(evt);
            }
        });

        votosAnulados.setText("Votos anulados");
        votosAnulados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votosAnuladosActionPerformed(evt);
            }
        });

        Crear.setText("Candidatos y mesas");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Candidato mas votado");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(votosAnulados)
                            .addComponent(Ganador)
                            .addComponent(votosBlanco)
                            .addComponent(votosCandidatos)
                            .addComponent(mesaMasVotada)
                            .addComponent(mesaMenosVotada))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1)
                            .addComponent(Crear))
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crear)
                    .addComponent(Iniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(36, 36, 36)
                .addComponent(Ganador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(votosAnulados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(votosBlanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(votosCandidatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaMasVotada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaMenosVotada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void votosBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votosBlancoActionPerformed
        int votosBlanco = 0;
        
        for (int c = 0; c < nmesas; c++) {
            int votos = Integer.parseInt(JOptionPane.showInputDialog("Diga los votos en blanco obtenidos en la mesa " + (c + 1)));
            votosBlanco += votos;
        }
        JOptionPane.showMessageDialog(this, "El número de votos en blanco es " + votosBlanco);

    }//GEN-LAST:event_votosBlancoActionPerformed

    private void GanadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GanadorActionPerformed
        int ganador = 0;
        int maxVotos = 0;

        for (int i = 0; i < ncandidatos; i++) {
            int totalVotos = 0;

            for (int c = 0; c < nmesas; c++) {
                totalVotos += votaciones[i][c];
            }
            if (totalVotos > maxVotos) {
                maxVotos = totalVotos;
                ganador = i;
            }
        }

        JOptionPane.showMessageDialog(this, "El ganador es " + candidatos[ganador]);


    }//GEN-LAST:event_GanadorActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        ncandidatos = Integer.parseInt(JOptionPane.showInputDialog(this, "Diga el numero de candidatos"));
        candidatos = new String[ncandidatos];

        for (int i = 0; i < ncandidatos; i++) {
            candidatos[i] = JOptionPane.showInputDialog(this, "Diga el nombre del candidato ");

        }

        nmesas = Integer.parseInt(JOptionPane.showInputDialog(this, "Diga el numero de mesas"));

    }//GEN-LAST:event_CrearActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        votaciones = new int[ncandidatos][nmesas];

        for (int i = 0; i < candidatos.length; i++) {

            JOptionPane.showMessageDialog(this, "Diga los votos obtenidos por el candidato " + candidatos[i]);

            for (int c = 0; c < nmesas; c++) {
                votaciones[i][c] = Integer.parseInt(JOptionPane.showInputDialog("Diga los votos obtenidos en la mesa " + (c + 1)));

            }
        }
    }//GEN-LAST:event_IniciarActionPerformed

    private void mesaMasVotadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaMasVotadaActionPerformed
        int mesaMasVotada = 0;
        int maxVotos = 0;

        for (int c = 0; c < nmesas; c++) {
            int totalVotos = 0;

            for (int i = 0; i < ncandidatos; i++) {
                totalVotos += votaciones[i][c];
            }

            if (totalVotos > maxVotos) {
                maxVotos = totalVotos;
                mesaMasVotada = c;
            }
        }

        JOptionPane.showMessageDialog(this, "La mesa mas votada es la mesa " + (mesaMasVotada + 1) + " con un total de " + maxVotos + " votos");


    }//GEN-LAST:event_mesaMasVotadaActionPerformed

    private void mesaMenosVotadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaMenosVotadaActionPerformed
        int mesaMenosVotada = 0;
        int minVotos = 10000;

        for (int c = 0; c < nmesas; c++) {
            int totalVotosMesa = 0;
            for (int i = 0; i < ncandidatos; i++) {
                totalVotosMesa += votaciones[i][c];
            }
            if (totalVotosMesa < minVotos) {
                minVotos = totalVotosMesa;
                mesaMenosVotada = c;
            }
        }

        JOptionPane.showMessageDialog(this, "La mesa menos votada es la número " + (mesaMenosVotada + 1) + " con " + minVotos + " votos totales.");

    }//GEN-LAST:event_mesaMenosVotadaActionPerformed

    private void votosCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votosCandidatosActionPerformed
        String mensaje = "";
        for (int i = 0; i < ncandidatos; i++) {
            int totalVotos = 0;
            for (int c = 0; c < nmesas; c++) {
                totalVotos += votaciones[i][c];
            }
            mensaje += "El candidato " + candidatos[i] + " obtuvo " + totalVotos + " votos.\n";
        }
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_votosCandidatosActionPerformed

    private void votosAnuladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votosAnuladosActionPerformed
        int votosAnulados = 0;
        
        for (int c = 0; c < nmesas; c++) {
            int votos = Integer.parseInt(JOptionPane.showInputDialog("Diga los votos anulados obtenidos en la mesa " + (c + 1)));
            votosAnulados += votos;
        }
        JOptionPane.showMessageDialog(this, "El número de votos anulados es " + votosAnulados);
        
    }//GEN-LAST:event_votosAnuladosActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String nombre = JOptionPane.showInputDialog("Escriba el nombre del candidato mas votado");
        int masVotoMesa = 0;
        int candidato = 0;
        int numMesa = 0;
        for (int i = 0; i < ncandidatos; i++) {
            if (nombre.equals(candidatos[i])) {
                candidato = i;
                break;
            }
        }
        
        for (int j = 0; j < nmesas; j++) {
            if (masVotoMesa < votaciones[candidato][j]) {
                masVotoMesa = votaciones[candidato][j];
                numMesa = j+1;
            }
        }
        JOptionPane.showMessageDialog(rootPane,"El candidato "+ candidatos[candidato]+"tuvo mas votos en la mesa "+ numMesa);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private javax.swing.JButton Ganador;
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton mesaMasVotada;
    private javax.swing.JButton mesaMenosVotada;
    private javax.swing.JButton votosAnulados;
    private javax.swing.JButton votosBlanco;
    private javax.swing.JButton votosCandidatos;
    // End of variables declaration//GEN-END:variables
}
