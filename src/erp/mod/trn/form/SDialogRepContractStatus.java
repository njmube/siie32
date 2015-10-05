/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.trn.form;

import erp.data.SDataConstantsSys;
import erp.mod.SModConsts;
import erp.mod.SModSysConsts;
import java.util.Date;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import sa.lib.SLibConsts;
import sa.lib.SLibTimeUtils;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiFieldKeyGroup;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanDialogReport;

/**
 *
 * @author Juan Barajas
 */
public class SDialogRepContractStatus extends SBeanDialogReport implements ChangeListener {
    private SGuiFieldKeyGroup moFieldKeyGroup;
    
    /**
     * Creates new form SDialogRepContractStatus
     * @param client
     * @param formSubtype
     * @param title
     */
    public SDialogRepContractStatus(SGuiClient client, int formSubtype, String title) {
        setFormSettings(client, SModConsts.TRNR_CON_STA, formSubtype, title);
        initComponents();
        initComponentsCustom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        moRadioContractStatus = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel4 = new javax.swing.JPanel();
        moRadioContractStatusByBp = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel15 = new javax.swing.JPanel();
        moRadioMonthlyDeliveryProgram = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel16 = new javax.swing.JPanel();
        moRadioDpsByContractByPeriod = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel17 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jlDateStart = new javax.swing.JLabel();
        moDateStart = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel9 = new javax.swing.JPanel();
        jlDateEnd = new javax.swing.JLabel();
        moDateEnd = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jlBizPartner = new javax.swing.JLabel();
        moKeyBizPartner = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel5 = new javax.swing.JPanel();
        jlIGen = new javax.swing.JLabel();
        moKeyIGen = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel11 = new javax.swing.JPanel();
        jlItem = new javax.swing.JLabel();
        moKeyItem = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel12 = new javax.swing.JPanel();
        moBooleanShowPrices = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBooleanAmountPending = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBooleanShowDetailsContract = new sa.lib.gui.bean.SBeanFieldBoolean();

        jPanel1.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte:"));
        jPanel14.setLayout(new java.awt.GridLayout(4, 0, 0, 2));

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        buttonGroup1.add(moRadioContractStatus);
        moRadioContractStatus.setSelected(true);
        moRadioContractStatus.setText("Estatus de contratos");
        moRadioContractStatus.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel3.add(moRadioContractStatus);

        jPanel14.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        buttonGroup1.add(moRadioContractStatusByBp);
        moRadioContractStatusByBp.setText("Estatus de facturación de contratos por cliente");
        moRadioContractStatusByBp.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel4.add(moRadioContractStatusByBp);

        jPanel14.add(jPanel4);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        buttonGroup1.add(moRadioMonthlyDeliveryProgram);
        moRadioMonthlyDeliveryProgram.setText("Programa de entregas mensuales");
        moRadioMonthlyDeliveryProgram.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel15.add(moRadioMonthlyDeliveryProgram);

        jPanel14.add(jPanel15);

        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        buttonGroup1.add(moRadioDpsByContractByPeriod);
        moRadioDpsByContractByPeriod.setText("Ventas por contrato por periodo");
        moRadioDpsByContractByPeriod.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel16.add(moRadioDpsByContractByPeriod);

        jPanel14.add(jPanel16);

        jPanel1.add(jPanel14, java.awt.BorderLayout.NORTH);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros:"));
        jPanel17.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel6.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel7.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateStart.setText("Fecha inicial:");
        jlDateStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jlDateStart);
        jPanel8.add(moDateStart);

        jPanel7.add(jPanel8);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateEnd.setText("Fecha final:");
        jlDateEnd.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel9.add(jlDateEnd);
        jPanel9.add(moDateEnd);

        jPanel7.add(jPanel9);

        jPanel6.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel17.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel10.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlBizPartner.setText("Cliente:");
        jlBizPartner.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel13.add(jlBizPartner);

        moKeyBizPartner.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel13.add(moKeyBizPartner);

        jPanel10.add(jPanel13);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlIGen.setText("Ítem genérico:");
        jlIGen.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jlIGen);

        moKeyIGen.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel5.add(moKeyIGen);

        jPanel10.add(jPanel5);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlItem.setText("Ítem:");
        jlItem.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jlItem);

        moKeyItem.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel11.add(moKeyItem);

        jPanel10.add(jPanel11);

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        moBooleanShowPrices.setSelected(true);
        moBooleanShowPrices.setText("Con entregas mensuales");
        moBooleanShowPrices.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel12.add(moBooleanShowPrices);

        moBooleanAmountPending.setSelected(true);
        moBooleanAmountPending.setText("Total pendiente");
        moBooleanAmountPending.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel12.add(moBooleanAmountPending);

        moBooleanShowDetailsContract.setSelected(true);
        moBooleanShowDetailsContract.setText("Con detalle de contratos");
        moBooleanShowDetailsContract.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel12.add(moBooleanShowDetailsContract);

        jPanel10.add(jPanel12);

        jPanel2.add(jPanel10, java.awt.BorderLayout.NORTH);

        jPanel17.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel17, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlBizPartner;
    private javax.swing.JLabel jlDateEnd;
    private javax.swing.JLabel jlDateStart;
    private javax.swing.JLabel jlIGen;
    private javax.swing.JLabel jlItem;
    private sa.lib.gui.bean.SBeanFieldBoolean moBooleanAmountPending;
    private sa.lib.gui.bean.SBeanFieldBoolean moBooleanShowDetailsContract;
    private sa.lib.gui.bean.SBeanFieldBoolean moBooleanShowPrices;
    private sa.lib.gui.bean.SBeanFieldDate moDateEnd;
    private sa.lib.gui.bean.SBeanFieldDate moDateStart;
    private sa.lib.gui.bean.SBeanFieldKey moKeyBizPartner;
    private sa.lib.gui.bean.SBeanFieldKey moKeyIGen;
    private sa.lib.gui.bean.SBeanFieldKey moKeyItem;
    private sa.lib.gui.bean.SBeanFieldRadio moRadioContractStatus;
    private sa.lib.gui.bean.SBeanFieldRadio moRadioContractStatusByBp;
    private sa.lib.gui.bean.SBeanFieldRadio moRadioDpsByContractByPeriod;
    private sa.lib.gui.bean.SBeanFieldRadio moRadioMonthlyDeliveryProgram;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 720, 450);
        moFieldKeyGroup = new SGuiFieldKeyGroup(miClient);
        moRadioContractStatus.setBooleanSettings(SGuiUtils.getLabelName(moRadioContractStatus.getText()), true);
        moRadioContractStatusByBp.setBooleanSettings(SGuiUtils.getLabelName(moRadioContractStatusByBp.getText()), false);
        moRadioMonthlyDeliveryProgram.setBooleanSettings(SGuiUtils.getLabelName(moRadioMonthlyDeliveryProgram.getText()), false);
        moRadioDpsByContractByPeriod.setBooleanSettings(SGuiUtils.getLabelName(moRadioDpsByContractByPeriod.getText()), false);
        
        moDateStart.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateStart.getText()), true);
        moDateEnd.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateEnd.getText()), true);
        
        moKeyBizPartner.setKeySettings(miClient, SGuiUtils.getLabelName(jlBizPartner.getText()), false);
        moKeyIGen.setKeySettings(miClient, SGuiUtils.getLabelName(jlIGen.getText()), false);
        moKeyItem.setKeySettings(miClient, SGuiUtils.getLabelName(jlItem.getText()), false);
        moBooleanShowPrices.setBooleanSettings(SGuiUtils.getLabelName(moBooleanShowPrices.getText()), true);
        moBooleanAmountPending.setBooleanSettings(SGuiUtils.getLabelName(moBooleanAmountPending.getText()), true);
        moBooleanShowDetailsContract.setBooleanSettings(SGuiUtils.getLabelName(moBooleanShowDetailsContract.getText()), true);
        
        moFields.addField(moRadioContractStatus);
        moFields.addField(moRadioContractStatusByBp);
        moFields.addField(moRadioMonthlyDeliveryProgram);
        moFields.addField(moRadioDpsByContractByPeriod);
        
        moFields.addField(moDateStart);
        moFields.addField(moDateEnd);
        
        moFields.addField(moKeyBizPartner);
        moFields.addField(moKeyIGen);
        moFields.addField(moKeyItem);
        moFields.addField(moBooleanShowPrices);
        moFields.addField(moBooleanAmountPending);
        moFields.addField(moBooleanShowDetailsContract);
        moFields.setFormButton(jbPrint);
        
        moRadioContractStatus.addChangeListener(this);
        moRadioContractStatusByBp.addChangeListener(this);
        moRadioMonthlyDeliveryProgram.addChangeListener(this);
        moRadioDpsByContractByPeriod.addChangeListener(this);
        
        moDateStart.setValue(SLibTimeUtils.getBeginOfMonth(miClient.getSession().getCurrentDate()));
        moDateEnd.setValue(SLibTimeUtils.getEndOfMonth(miClient.getSession().getCurrentDate()));
        
        reloadCatalogues();
        actionEnableFields();
    }
    
    public void actionEnableFields() {
        if (moRadioContractStatus.isSelected()) {
            moKeyBizPartner.setEnabled(true);
            moKeyIGen.setEnabled(true);    
            moKeyItem.setEnabled(false);    
            moBooleanShowPrices.setEnabled(true);
            moBooleanAmountPending.setEnabled(true);
            moBooleanShowDetailsContract.setEnabled(false);
            
            moDateStart.setEnabled(false);
            moDateEnd.setEnabled(true);
            
            if (moDateStart.getValue() != null) {
                moDateEnd.setValue(SLibTimeUtils.getEndOfMonth(moDateStart.getValue()));
            }
            moDateStart.setValue(null);
        }
        if (moRadioContractStatusByBp.isSelected()) {
            moKeyBizPartner.setEnabled(true);
            moKeyIGen.setEnabled(true);
            moBooleanShowPrices.setEnabled(false);
            moBooleanAmountPending.setEnabled(false);
            moBooleanShowDetailsContract.setEnabled(false);
            
            moDateStart.setEnabled(false);
            moDateEnd.setEnabled(true);
            
            if (moDateStart.getValue() != null) {
                moDateEnd.setValue(SLibTimeUtils.getEndOfMonth(moDateStart.getValue()));
            }
            moDateStart.setValue(null);
        }
        if (moRadioMonthlyDeliveryProgram.isSelected()) {
            moKeyBizPartner.setEnabled(true);
            moKeyIGen.setEnabled(false);
            moBooleanShowPrices.setEnabled(false);
            moBooleanAmountPending.setEnabled(false);
            moBooleanShowDetailsContract.setEnabled(true);
            
            moDateStart.setEnabled(true);
            moDateEnd.setEnabled(false);
            
            if (moDateEnd.getValue() != null) {
                moDateStart.setValue(SLibTimeUtils.getBeginOfMonth(moDateEnd.getValue()));
            }
            moDateEnd.setValue(null);

        }
        if (moRadioDpsByContractByPeriod.isSelected()) {
            moKeyBizPartner.setEnabled(true);
            moKeyIGen.setEnabled(true);
            moBooleanShowPrices.setEnabled(false);
            moBooleanAmountPending.setEnabled(false);
            moBooleanShowDetailsContract.setEnabled(false);
            
            if (moDateStart.isEnabled()) {
                moDateEnd.setValue(SLibTimeUtils.getEndOfMonth(moDateStart.getValue()));
            }
            else {
                moDateStart.setValue(SLibTimeUtils.getBeginOfMonth(moDateEnd.getValue()));
            }
            
            moDateStart.setEnabled(true);
            moDateEnd.setEnabled(true);
        }
        if (moKeyIGen.isEnabled() && moKeyIGen.getSelectedIndex() > 0) {
            moKeyItem.setEnabled(true);
        } 
        else {
            moKeyItem.setEnabled(false);
        }
    }
    
    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeyBizPartner, SModConsts.BPSU_BP, mnFormSubtype, null);
        
        moFieldKeyGroup.initGroup();
        moFieldKeyGroup.addFieldKey(moKeyIGen, SModConsts.ITMU_IGEN, SLibConsts.UNDEFINED, null);
        moFieldKeyGroup.addFieldKey(moKeyItem, SModConsts.ITMU_ITEM, SLibConsts.UNDEFINED, null);
        moFieldKeyGroup.populateCatalogues();
        
        miClient.getSession().populateCatalogue(moKeyIGen, SModConsts.ITMU_IGEN, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyItem, SModConsts.ITMU_ITEM, SLibConsts.UNDEFINED, null);
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            if (moRadioContractStatusByBp.isSelected()) {
                if (moKeyBizPartner.getSelectedIndex() <= 0){
                    validation.setComponent(moKeyBizPartner);
                    validation.setMessage("El valor para el campo '" + SGuiUtils.getLabelName(jlBizPartner) + "' es requerido.'");
                }
            } 
            if (moRadioDpsByContractByPeriod.isSelected()) {
                 if (validation.isValid()) {
                    if (moDateStart.getValue().compareTo(moDateEnd.getValue()) > 0) {
                        validation.setComponent(moDateStart);
                        validation.setMessage(SGuiConsts.ERR_MSG_FIELD_DATE_  + "'" +SGuiUtils.getLabelName(jlDateStart) + "'" + SGuiConsts.ERR_MSG_FIELD_DATE_LESS_EQUAL + "la '" + SGuiUtils.getLabelName(jlDateEnd) + "'.");

                    }
                }

            }
        }
        
        return validation;
    }

    @Override
    public void createParamsMap() {
        int nIdCatDps = 0;
        int nIdClaDps = 0;
        int nIdTypDps = 0;
        int nIdStDps = 0;
        int nIdCatBp = 0;
        String sTitle = "";
        String sTitleSingular = "";
        String sBpName = "(TODOS)";
        String sIGen = "(TODOS)";
        String sItem = "(TODOS)";
        String sSqlWhere = "";
        Date tDateStart = null;
        Date tDateEnd = null;
        
         if (jbPrint.isEnabled()) {
            if (SGuiUtils.computeValidation(miClient, validateForm())) {
                moParamsMap = miClient.createReportParams();

                if (mnFormSubtype == SDataConstantsSys.BPSS_CT_BP_CUS) {
                        sTitle = "CLIENTE" + (moRadioContractStatus.isSelected() ? "S" : "");
                        sTitleSingular = "CLIENTE";
                        nIdCatDps = SModSysConsts.TRNU_TP_DPS_SAL_CON[0];
                        nIdClaDps = SModSysConsts.TRNU_TP_DPS_SAL_CON[1];
                        nIdTypDps = SModSysConsts.TRNU_TP_DPS_SAL_CON[2];
                        nIdCatBp = SDataConstantsSys.BPSS_CT_BP_CUS;
                    }
                    else {
                        sTitle = "PROVEEDOR";
                        sTitleSingular = "PROVEEDOR";
                        nIdCatDps = SModSysConsts.TRNU_TP_DPS_PUR_CON[0];
                        nIdClaDps = SModSysConsts.TRNU_TP_DPS_PUR_CON[1];
                        nIdTypDps = SModSysConsts.TRNU_TP_DPS_PUR_CON[2];
                        nIdCatBp = SDataConstantsSys.BPSS_CT_BP_SUP;
                    }

                nIdStDps = SDataConstantsSys.TRNS_ST_DPS_EMITED;
                
                tDateStart = moDateStart.getValue();
                tDateEnd = moDateEnd.getValue();
                
                if (moRadioContractStatus.isSelected()) {

                    if (moKeyBizPartner.getSelectedIndex() > 0) {
                        sSqlWhere += " AND d.fid_bp_r = " + moKeyBizPartner.getValue()[0];
                        sBpName = moKeyBizPartner.getSelectedItem().getItem();
                    }
                    if (moKeyIGen.getSelectedIndex() > 0) {
                        sSqlWhere += " AND i.fid_igen = " + moKeyIGen.getValue()[0];
                        sIGen = moKeyIGen.getSelectedItem().getItem();
                    }
                    if (moKeyItem.getSelectedIndex() > 0) {
                        sSqlWhere += " AND i.id_item = " + moKeyItem.getValue()[0];
                        sItem = moKeyItem.getSelectedItem().getItem();
                    }

                    moParamsMap.put("nIdCatDps", nIdCatDps);
                    moParamsMap.put("nIdClaDps", nIdClaDps);
                    moParamsMap.put("nIdTypDps", nIdTypDps);
                    moParamsMap.put("nIdCatBp", nIdCatBp);
                    //moParamsMap.put("nIdCob", nIdCob);
                    moParamsMap.put("nIdStDps", nIdStDps);
                    moParamsMap.put("sSqlWhere", sSqlWhere);
                    moParamsMap.put("bShowPrices", moBooleanShowPrices.isSelected());
                    moParamsMap.put("sTitle", sTitle);
                    moParamsMap.put("sTitleSingular", sTitleSingular);
                    moParamsMap.put("sBpName", sBpName);
                    moParamsMap.put("sIGen", sIGen);
                    moParamsMap.put("sItem", sItem);
                    moParamsMap.put("tDateCut", tDateEnd);
                    moParamsMap.put("bIsAmountPending", moBooleanAmountPending.isSelected());
                }
                else if (moRadioContractStatusByBp.isSelected()) {
                    sSqlWhere += " AND b.id_bp = " + moKeyBizPartner.getValue()[0];
                    sBpName = moKeyBizPartner.getSelectedItem().getItem();
                    
                    if (moKeyIGen.getSelectedIndex() > 0) {
                        sSqlWhere += " AND i.fid_igen = " + moKeyIGen.getValue()[0];
                        sIGen = moKeyIGen.getSelectedItem().getItem();
                    }
                    if (moKeyItem.getSelectedIndex() > 0) {
                        sSqlWhere += " AND i.id_item = " + moKeyItem.getValue()[0];
                        sItem = moKeyItem.getSelectedItem().getItem();
                    }

                    moParamsMap.put("nIdCatDps", nIdCatDps);
                    moParamsMap.put("nIdClaDps", nIdClaDps);
                    moParamsMap.put("nIdTypDps", nIdTypDps);
                    moParamsMap.put("nIdCatBp", nIdCatBp);
                    //moParamsMap.put("nIdCob", nIdCob);
                    moParamsMap.put("nIdStDps", nIdStDps);
                    moParamsMap.put("sSqlWhere", sSqlWhere);
                    moParamsMap.put("sTitle", sTitle);
                    moParamsMap.put("sTitleSingular", sTitleSingular);
                    moParamsMap.put("sBpName", sBpName);
                    moParamsMap.put("sIGen", sIGen);
                    moParamsMap.put("sItem", sItem);
                    moParamsMap.put("tDateCut", tDateEnd);
                }
                else if (moRadioMonthlyDeliveryProgram.isSelected()) {
                    if (moKeyBizPartner.getSelectedIndex() > 0) {
                        sSqlWhere += " AND d.fid_bp_r = " + moKeyBizPartner.getValue()[0];
                        sBpName = moKeyBizPartner.getSelectedItem().getItem();
                    }
                    
                    moParamsMap.put("nIdCatDps", nIdCatDps);
                    moParamsMap.put("nIdClaDps", nIdClaDps);
                    moParamsMap.put("nIdTypDps", nIdTypDps);
                    moParamsMap.put("tBaseDate", tDateStart);
                    moParamsMap.put("sSqlWhere", sSqlWhere);
                    moParamsMap.put("sBpName", sBpName);
                    moParamsMap.put("sIGen", sIGen);
                    moParamsMap.put("sItem", sItem);
                    moParamsMap.put("bShowDetailsContract", moBooleanShowDetailsContract.isSelected());
                
                }
                else if (moRadioDpsByContractByPeriod.isSelected()) {
                    //nIdCob = miClient.getSession().getConfigBranch().getBranchId();
                    if (mnFormSubtype == SDataConstantsSys.BPSS_CT_BP_CUS) {
                        sTitle = "VENTAS";
                    }
                    else {
                        sTitle = "COMPRAS";
                    }

                    if(moKeyBizPartner.getSelectedIndex() > 0) {
                        sSqlWhere += " AND d.fid_bp_r = " + moKeyBizPartner.getValue()[0];
                        sBpName = moKeyBizPartner.getSelectedItem().getItem();
                    }
                    if(moKeyIGen.getSelectedIndex() > 0) {
                        sSqlWhere += " AND i.fid_igen = " + moKeyIGen.getValue()[0];
                        sIGen = moKeyIGen.getSelectedItem().getItem();
                    }
                    if(moKeyItem.getSelectedIndex() > 0) {
                        sSqlWhere += " AND i.id_item = " + moKeyItem.getValue()[0];
                        sItem = moKeyItem.getSelectedItem().getItem();
                    }

                    moParamsMap.put("nIdCatDps", nIdCatDps);
                    moParamsMap.put("nIdClaDps", nIdClaDps);
                    moParamsMap.put("nIdTypDps", nIdTypDps);
                    moParamsMap.put("nIdCatBp", nIdCatBp);
                    //moParamsMap.put("nIdCob", nIdCob);
                    moParamsMap.put("nIdStDps", nIdStDps);
                    moParamsMap.put("sSqlWhere", sSqlWhere);
                    moParamsMap.put("sTitle", sTitle);
                    moParamsMap.put("sTitleSingular", sTitleSingular);
                    moParamsMap.put("sBpName", sBpName);
                    moParamsMap.put("sIGen", sIGen);
                    moParamsMap.put("sItem", sItem);
                    moParamsMap.put("tDateCut", tDateStart);
                    moParamsMap.put("tDateEnd", tDateEnd);
                }
            }
        }
    }
    
    @Override
    protected void windowActivated() {
        if (mnFormSubtype == SDataConstantsSys.BPSS_CT_BP_CUS) {
            moRadioDpsByContractByPeriod.setText("Ventas por contrato por periodo");
            moRadioContractStatusByBp.setText("Estatus de facturación de contratos por cliente");
            jlBizPartner.setText("Cliente:");
        }
        else {
            moRadioDpsByContractByPeriod.setText("Compras por contrato por periodo");
            moRadioContractStatusByBp.setText("Estatus de facturación de contratos por proveedor");
            jlBizPartner.setText("Proveedor:");
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() instanceof JRadioButton) {
            if ((JRadioButton) e.getSource() == moRadioContractStatus) {
                if (moRadioContractStatus.isSelected()) {
                    mnFormType = SModConsts.TRNR_CON_STA;
                }
            }
            else if ((JRadioButton) e.getSource() == moRadioContractStatusByBp) {
                if (moRadioContractStatusByBp.isSelected()) {
                    mnFormType = SModConsts.TRNR_CON_STA_BP;
                }
            }
            else if ((JRadioButton) e.getSource() == moRadioMonthlyDeliveryProgram) {
                if (moRadioMonthlyDeliveryProgram.isSelected()) {
                    mnFormType = SModConsts.TRNR_MON_DVY_PROG;
                }
            }
            else if ((JRadioButton) e.getSource() == moRadioDpsByContractByPeriod) {
                if (moRadioDpsByContractByPeriod.isSelected()) {
                    mnFormType = SModConsts.TRNR_DPS_CON;
                }
            }
            actionEnableFields();
        }
    }
}
