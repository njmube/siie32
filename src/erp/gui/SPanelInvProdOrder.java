/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SPanelInvProdOrder.java
 *
 * Created on 23/04/2012, 05:12:21 PM
 */

package erp.gui;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.lib.SLibConstants;
import erp.lib.table.STableSetting;
import erp.lib.table.STableTabInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;

/**
 *
 * @author Sergio Flores
 */
public class SPanelInvProdOrder extends javax.swing.JPanel implements STableTabInterface, ActionListener {

    int mnPanelType;
    private erp.client.SClientInterface miClient;

    /** Creates new form SPanelInvProdOrder */
    public SPanelInvProdOrder(erp.client.SClientInterface client) {
        mnPanelType = SDataConstants.TRNX_MFG_ORD;
        miClient = client;

        initComponents();
        initComponentsExtra();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlStockMoves = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbRmAssign = new javax.swing.JButton();
        jbRmReturn = new javax.swing.JButton();
        jbWpAssign = new javax.swing.JButton();
        jbWpReturn = new javax.swing.JButton();
        jbFgAssign = new javax.swing.JButton();
        jbFgReturn = new javax.swing.JButton();
        jlWarehouseRm = new javax.swing.JLabel();
        jlWarehouseWp = new javax.swing.JLabel();
        jlWarehouseFg = new javax.swing.JLabel();
        jbPoAssign = new javax.swing.JButton();
        jbPoAssignDet = new javax.swing.JButton();
        jbPoAssigned = new javax.swing.JButton();
        jbPoAssignedDet = new javax.swing.JButton();
        jbPoFinish = new javax.swing.JButton();
        jbPoFinishDet = new javax.swing.JButton();
        jbPoFinished = new javax.swing.JButton();
        jbPoFinishedDet = new javax.swing.JButton();
        jbPoConsume = new javax.swing.JButton();
        jbPoConsumeDet = new javax.swing.JButton();
        jbPoConsumed = new javax.swing.JButton();
        jbPoConsumedDet = new javax.swing.JButton();

        jlStockMoves.setFont(new java.awt.Font("Tahoma", 1, 24));
        jlStockMoves.setText("Movimientos producción");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asignación de MP");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Terminación de productos");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbRmAssign.setText("Entregar MP");

        jbRmReturn.setText("Devolver MP");

        jbWpAssign.setText("Entregar PP");

        jbWpReturn.setText("Devolver PP");

        jbFgAssign.setText("Entregar PT");

        jbFgReturn.setText("Devolver PT");

        jlWarehouseRm.setBackground(new java.awt.Color(153, 204, 255));
        jlWarehouseRm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlWarehouseRm.setText("Materia prima (MP)");
        jlWarehouseRm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jlWarehouseRm.setOpaque(true);

        jlWarehouseWp.setBackground(new java.awt.Color(153, 204, 255));
        jlWarehouseWp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlWarehouseWp.setText("Producto en proceso (PP)");
        jlWarehouseWp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jlWarehouseWp.setOpaque(true);

        jlWarehouseFg.setBackground(new java.awt.Color(153, 204, 255));
        jlWarehouseFg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlWarehouseFg.setText("Producto terminado (PT)");
        jlWarehouseFg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jlWarehouseFg.setOpaque(true);

        jbPoAssign.setText("OP x asignar");

        jbPoAssignDet.setText("OP x asignar (det.)");

        jbPoAssigned.setText("OP asignadas");

        jbPoAssignedDet.setText("OP asignadas (det.)");

        jbPoFinish.setText("OP x terminar");

        jbPoFinishDet.setText("OP x terminar (det.)");

        jbPoFinished.setText("OP terminadas");

        jbPoFinishedDet.setText("OP terminadas (det.)");

        jbPoConsume.setText("MP x consumir");

        jbPoConsumeDet.setText("MP x consumir (det.)");

        jbPoConsumed.setText("MP consumida");

        jbPoConsumedDet.setText("MP consumida (det.)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbRmAssign, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbWpAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbFgAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbPoAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPoAssignDet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPoAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPoAssignedDet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlWarehouseRm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbRmReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbFgReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbPoFinish, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbPoFinishDet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbPoFinishedDet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbPoFinished, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jbPoConsumedDet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jbPoConsumed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jbPoConsume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jbPoConsumeDet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jbWpReturn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jlWarehouseWp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlWarehouseFg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jlStockMoves, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlStockMoves, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRmAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbWpAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFgAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlWarehouseRm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbRmReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbFgReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbWpReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlWarehouseWp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlWarehouseFg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbPoConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbPoConsumeDet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jbPoConsumed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbPoConsumedDet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbPoAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbPoAssignDet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jbPoAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbPoAssignedDet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbPoFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbPoFinishDet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jbPoFinished, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbPoFinishedDet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(204, 204, 204))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbFgAssign;
    private javax.swing.JButton jbFgReturn;
    private javax.swing.JButton jbPoAssign;
    private javax.swing.JButton jbPoAssignDet;
    private javax.swing.JButton jbPoAssigned;
    private javax.swing.JButton jbPoAssignedDet;
    private javax.swing.JButton jbPoConsume;
    private javax.swing.JButton jbPoConsumeDet;
    private javax.swing.JButton jbPoConsumed;
    private javax.swing.JButton jbPoConsumedDet;
    private javax.swing.JButton jbPoFinish;
    private javax.swing.JButton jbPoFinishDet;
    private javax.swing.JButton jbPoFinished;
    private javax.swing.JButton jbPoFinishedDet;
    private javax.swing.JButton jbRmAssign;
    private javax.swing.JButton jbRmReturn;
    private javax.swing.JButton jbWpAssign;
    private javax.swing.JButton jbWpReturn;
    private javax.swing.JLabel jlStockMoves;
    private javax.swing.JLabel jlWarehouseFg;
    private javax.swing.JLabel jlWarehouseRm;
    private javax.swing.JLabel jlWarehouseWp;
    // End of variables declaration//GEN-END:variables

    /*
     * Private methods
     */

    private void initComponentsExtra() {
        boolean hasRightMfgRmAsg = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_MFG_RM_ASG).HasRight;
        boolean hasRightMfgRmRet = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_MFG_RM_DEV).HasRight;
        boolean hasRightMfgWpAsg = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_MFG_WP_ASG).HasRight;
        boolean hasRightMfgWpRet = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_MFG_WP_DEV).HasRight;
        boolean hasRightMfgFgAsg = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_MFG_FG_ASG).HasRight;
        boolean hasRightMfgFgRet = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_MFG_FG_DEV).HasRight;

        jbRmAssign.setEnabled(hasRightMfgRmAsg);
        jbRmReturn.setEnabled(hasRightMfgRmRet);
        jbWpAssign.setEnabled(hasRightMfgWpAsg);
        jbWpReturn.setEnabled(hasRightMfgWpRet);
        jbFgAssign.setEnabled(hasRightMfgFgAsg);
        jbFgReturn.setEnabled(hasRightMfgFgRet);
        jbPoAssign.setEnabled(hasRightMfgRmAsg || hasRightMfgRmRet);
        jbPoAssignDet.setEnabled(hasRightMfgRmAsg || hasRightMfgRmRet);
        jbPoAssigned.setEnabled(hasRightMfgRmAsg || hasRightMfgRmRet);
        jbPoAssignedDet.setEnabled(hasRightMfgRmAsg || hasRightMfgRmRet);
        jbPoFinish.setEnabled(hasRightMfgWpAsg || hasRightMfgWpRet || hasRightMfgFgAsg || hasRightMfgFgRet);
        jbPoFinishDet.setEnabled(hasRightMfgWpAsg || hasRightMfgWpRet || hasRightMfgFgAsg || hasRightMfgFgRet);
        jbPoFinishDet.setEnabled(false);    // not implemented yet
        jbPoFinished.setEnabled(hasRightMfgWpAsg || hasRightMfgWpRet || hasRightMfgFgAsg || hasRightMfgFgRet);
        jbPoFinishedDet.setEnabled(hasRightMfgWpAsg || hasRightMfgWpRet || hasRightMfgFgAsg || hasRightMfgFgRet);
        jbPoFinishedDet.setEnabled(false);  // not implemented yet
        jbPoConsume.setEnabled(hasRightMfgRmAsg || hasRightMfgRmRet);
        jbPoConsumeDet.setEnabled(hasRightMfgRmAsg || hasRightMfgRmRet);
        jbPoConsumed.setEnabled(hasRightMfgRmAsg || hasRightMfgRmRet);
        jbPoConsumedDet.setEnabled(hasRightMfgRmAsg || hasRightMfgRmRet);

        jbRmAssign.addActionListener(this);
        jbRmReturn.addActionListener(this);
        jbWpAssign.addActionListener(this);
        jbWpReturn.addActionListener(this);
        jbFgAssign.addActionListener(this);
        jbFgReturn.addActionListener(this);
        jbPoAssign.addActionListener(this);
        jbPoAssignDet.addActionListener(this);
        jbPoAssigned.addActionListener(this);
        jbPoAssignedDet.addActionListener(this);
        jbPoFinish.addActionListener(this);
        jbPoFinishDet.addActionListener(this);
        jbPoFinished.addActionListener(this);
        jbPoFinishedDet.addActionListener(this);
        jbPoConsume.addActionListener(this);
        jbPoConsumeDet.addActionListener(this);
        jbPoConsumed.addActionListener(this);
        jbPoConsumedDet.addActionListener(this);
    }

    /*
     * Public methods
     */

    /*
     * Overriden methods
     */

    @Override
    public int getTabType() {
        return mnPanelType;
    }

    @Override
    public int getTabTypeAux01() {
        return SLibConstants.UNDEFINED;
    }

    @Override
    public int getTabTypeAux02() {
        return SLibConstants.UNDEFINED;
    }

    @Override
    public Vector<Integer> getSuscriptors() {
        return new Vector<Integer>();
    }

    @Override
    public Vector<STableSetting> getTableSettings() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addSetting(STableSetting setting) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateSetting(STableSetting setting) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionRefresh(int mode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            if (button == jbRmAssign) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DIOG_MFG, SDataConstants.TRNX_DIOG_MFG_RM, SDataConstants.TRNX_DIOG_MFG_MOVE_ASG);
            }
            else if (button == jbRmReturn) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DIOG_MFG, SDataConstants.TRNX_DIOG_MFG_RM, SDataConstants.TRNX_DIOG_MFG_MOVE_RET);
            }
            else if (button == jbWpAssign) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DIOG_MFG, SDataConstants.TRNX_DIOG_MFG_WP, SDataConstants.TRNX_DIOG_MFG_MOVE_ASG);
            }
            else if (button == jbWpReturn) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DIOG_MFG, SDataConstants.TRNX_DIOG_MFG_WP, SDataConstants.TRNX_DIOG_MFG_MOVE_RET);
            }
            else if (button == jbFgAssign) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DIOG_MFG, SDataConstants.TRNX_DIOG_MFG_FG, SDataConstants.TRNX_DIOG_MFG_MOVE_ASG);
            }
            else if (button == jbFgReturn) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DIOG_MFG, SDataConstants.TRNX_DIOG_MFG_FG, SDataConstants.TRNX_DIOG_MFG_MOVE_RET);
            }
            else if (button == jbPoAssign) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_ASSIGN_PEND);
            }
            else if (button == jbPoAssignDet) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_ASSIGN_PEND_ETY);
            }
            else if (button == jbPoAssigned) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_ASSIGNED);
            }
            else if (button == jbPoAssignedDet) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_ASSIGNED_ETY);
            }
            else if (button == jbPoFinish) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_FINISH_PEND);
            }
            else if (button == jbPoFinishDet) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_FINISH_PEND_ETY);
            }
            else if (button == jbPoFinished) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_FINISHED);
            }
            else if (button == jbPoFinishedDet) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_FINISHED_ETY);
            }
            else if (button == jbPoConsume) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_CONSUME_PEND);
            }
            else if (button == jbPoConsumeDet) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_CONSUME_PEND_ETY);
            }
            else if (button == jbPoConsumed) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_CONSUMED);
            }
            else if (button == jbPoConsumedDet) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_MFG_ORD, SDataConstants.TRNX_MFG_ORD_CONSUMED_ETY);
            }
        }
    }
}
