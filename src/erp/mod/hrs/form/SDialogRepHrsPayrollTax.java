/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.hrs.db.SDbConfig;
import java.awt.BorderLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import sa.gui.util.SUtilConsts;
import sa.lib.SLibConsts;
import sa.lib.SLibTimeUtils;
import sa.lib.SLibUtils;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanDialogReport;
import sa.lib.gui.bean.SBeanFieldRadio;

/**
 *
 * @author Juan Barajas
 */
public class SDialogRepHrsPayrollTax extends SBeanDialogReport implements ChangeListener {
    
    protected SPanelHrsDepartaments moPanelHrsDepartaments;
    
    /**
     * Creates new form SDialogRepHrsPayrollTax
     * @param client
     * @param title
     */
    public SDialogRepHrsPayrollTax(SGuiClient client, String title) {
        setFormSettings(client, SModConsts.HRSR_PAY_TAX, SLibConsts.UNDEFINED, title);
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

        moRadGroupFilterType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        moRadFilterTypePeriod = new sa.lib.gui.bean.SBeanFieldRadio();
        moRadFilterTypeDate = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel35 = new javax.swing.JPanel();
        jlYear = new javax.swing.JLabel();
        moIntPeriodYear = new sa.lib.gui.bean.SBeanFieldCalendarYear();
        jPanel36 = new javax.swing.JPanel();
        jlPeriodStart = new javax.swing.JLabel();
        moIntPeriodStart = new sa.lib.gui.bean.SBeanFieldCalendarMonth();
        jPanel37 = new javax.swing.JPanel();
        jlPeriodEnd = new javax.swing.JLabel();
        moIntPeriodEnd = new sa.lib.gui.bean.SBeanFieldCalendarMonth();
        jPanel11 = new javax.swing.JPanel();
        jlDateStart = new javax.swing.JLabel();
        moDateDateStart = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel12 = new javax.swing.JPanel();
        jlDateEnd = new javax.swing.JLabel();
        moDateDateEnd = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel14 = new javax.swing.JPanel();
        jlPaymentType = new javax.swing.JLabel();
        moKeyPaymentType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel4 = new javax.swing.JPanel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros del reporte:"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(7, 1, 0, 5));

        jPanel3.setLayout(new java.awt.BorderLayout());

        moRadGroupFilterType.add(moRadFilterTypePeriod);
        moRadFilterTypePeriod.setText("Por periodo");
        jPanel3.add(moRadFilterTypePeriod, java.awt.BorderLayout.WEST);

        moRadGroupFilterType.add(moRadFilterTypeDate);
        moRadFilterTypeDate.setText("Por rango de fechas");
        jPanel3.add(moRadFilterTypeDate, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel35.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlYear.setText("Ejercicio:*");
        jlYear.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel35.add(jlYear);
        jPanel35.add(moIntPeriodYear);

        jPanel2.add(jPanel35);

        jPanel36.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPeriodStart.setText("Período inicial:*");
        jlPeriodStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel36.add(jlPeriodStart);
        jPanel36.add(moIntPeriodStart);

        jPanel2.add(jPanel36);

        jPanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPeriodEnd.setText("Período final:*");
        jlPeriodEnd.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel37.add(jlPeriodEnd);
        jPanel37.add(moIntPeriodEnd);

        jPanel2.add(jPanel37);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateStart.setText("Fecha inicial:*");
        jlDateStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jlDateStart);
        jPanel11.add(moDateDateStart);

        jPanel2.add(jPanel11);

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateEnd.setText("Fecha final:*");
        jlDateEnd.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel12.add(jlDateEnd);
        jPanel12.add(moDateDateEnd);

        jPanel2.add(jPanel12);

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPaymentType.setText("Periodo pago:");
        jlPaymentType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlPaymentType);

        moKeyPaymentType.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel14.add(moKeyPaymentType);

        jPanel2.add(jPanel14);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlDateEnd;
    private javax.swing.JLabel jlDateStart;
    private javax.swing.JLabel jlPaymentType;
    private javax.swing.JLabel jlPeriodEnd;
    private javax.swing.JLabel jlPeriodStart;
    private javax.swing.JLabel jlYear;
    private sa.lib.gui.bean.SBeanFieldDate moDateDateEnd;
    private sa.lib.gui.bean.SBeanFieldDate moDateDateStart;
    private sa.lib.gui.bean.SBeanFieldCalendarMonth moIntPeriodEnd;
    private sa.lib.gui.bean.SBeanFieldCalendarMonth moIntPeriodStart;
    private sa.lib.gui.bean.SBeanFieldCalendarYear moIntPeriodYear;
    private sa.lib.gui.bean.SBeanFieldKey moKeyPaymentType;
    private sa.lib.gui.bean.SBeanFieldRadio moRadFilterTypeDate;
    private sa.lib.gui.bean.SBeanFieldRadio moRadFilterTypePeriod;
    private javax.swing.ButtonGroup moRadGroupFilterType;
    // End of variables declaration//GEN-END:variables

    public void actionEnableFields() {
        if (moRadFilterTypePeriod.isSelected()) {
            moIntPeriodYear.setEnabled(true);
            moIntPeriodStart.setEnabled(true);    
            moIntPeriodEnd.setEnabled(true);
            moDateDateStart.setEnabled(false);
            moDateDateEnd.setEnabled(false);
        }
        else if (moRadFilterTypeDate.isSelected()) {
            moIntPeriodYear.setEnabled(false);
            moIntPeriodStart.setEnabled(false);    
            moIntPeriodEnd.setEnabled(false);
            moDateDateStart.setEnabled(true);
            moDateDateEnd.setEnabled(true);
        }
    }
    
    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 720, 450);
        
        moPanelHrsDepartaments = new SPanelHrsDepartaments(miClient);

        moRadFilterTypePeriod.setBooleanSettings(SGuiUtils.getLabelName(moRadFilterTypePeriod.getText()), true);
        moRadFilterTypeDate.setBooleanSettings(SGuiUtils.getLabelName(moRadFilterTypeDate.getText()), false);
        moIntPeriodYear.setCalendarSettings(SGuiUtils.getLabelName(jlYear.getText()));
        moIntPeriodStart.setCalendarSettings(SGuiUtils.getLabelName(jlPeriodStart.getText()));
        moIntPeriodEnd.setCalendarSettings(SGuiUtils.getLabelName(jlPeriodEnd.getText()));
        moDateDateStart.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateStart.getText()), true);
        moDateDateEnd.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateEnd.getText()), true);
        moKeyPaymentType.setKeySettings(miClient, SGuiUtils.getLabelName(jlPaymentType.getText()), false);

        jPanel4.add(moPanelHrsDepartaments, BorderLayout.CENTER);
        
        moFields.addField(moRadFilterTypePeriod);
        moFields.addField(moRadFilterTypeDate);
        
        moFields.addField(moIntPeriodYear);
        moFields.addField(moIntPeriodStart);
        moFields.addField(moIntPeriodEnd);
        moFields.addField(moDateDateStart);
        moFields.addField(moDateDateEnd);
        moFields.addField(moKeyPaymentType);
        
        moFields.setFormButton(jbPrint);
        
        moRadFilterTypePeriod.addChangeListener(this);
        moRadFilterTypeDate.addChangeListener(this);
        
        moRadFilterTypePeriod.setSelected(true);
        moIntPeriodYear.setValue(miClient.getSession().getCurrentYear());
        moIntPeriodStart.setValue(SLibTimeUtils.digestMonth(miClient.getSession().getCurrentDate())[1]);
        moIntPeriodEnd.setValue(SLibTimeUtils.digestMonth(miClient.getSession().getCurrentDate())[1]);
        moDateDateStart.setValue(SLibTimeUtils.getBeginOfYear(miClient.getSession().getCurrentDate()));
        moDateDateEnd.setValue(SLibTimeUtils.getEndOfYear(miClient.getSession().getCurrentDate()));
        
        reloadCatalogues();
        actionEnableFields();
    }

    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeyPaymentType, SModConsts.HRSS_TP_PAY, SLibConsts.UNDEFINED, null);
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            if (moRadFilterTypePeriod.isSelected()) {
                if (moIntPeriodStart.getValue() > moIntPeriodEnd.getValue()) {
                    validation.setMessage(SGuiConsts.ERR_MSG_FIELD_VAL_ + "'" + SGuiUtils.getLabelName(jlPeriodEnd.getText()) + "'" + SGuiConsts.ERR_MSG_FIELD_VAL_GREAT_EQUAL + "'" + SGuiUtils.getLabelName(jlPeriodStart.getText()) + "'.");
                    validation.setComponent(moIntPeriodEnd);
                }
            }
            else if (moRadFilterTypeDate.isSelected()) {
                validation = SGuiUtils.validateDateRange(moDateDateStart, moDateDateEnd);
            }
            
            if (validation.isValid()) {
                validation = moPanelHrsDepartaments.validatePanel();
            }
        }
                
        
        return validation;
    }

    @Override
    public void createParamsMap() {
        SDbConfig config = null;
        String sDepartamentsId = "";
        String sDepartamentsName = "";
        
        moParamsMap = miClient.createReportParams();
        config = (SDbConfig) miClient.getSession().readRegistry(SModConsts.HRS_CFG, new int[] { SUtilConsts.BPR_CO_ID });

        moParamsMap.put("dPayrollTaxRate", config.getPayrollTaxRate());
        
        sDepartamentsId = (String) moPanelHrsDepartaments.getValue(SGuiConsts.PARAM_KEY);
        sDepartamentsName = (String) moPanelHrsDepartaments.getValue(SGuiConsts.PARAM_ITEM);
        moParamsMap.put("sSqlWhereDepartaments", sDepartamentsId.isEmpty() ? "" : " AND rcp.fk_dep IN(" + sDepartamentsId + ") ");
        moParamsMap.put("sDepartaments", sDepartamentsName.isEmpty() || (boolean) moPanelHrsDepartaments.getValue(SGuiConsts.PARAM_ROWS) ? "(TODOS)" : sDepartamentsName + " ");
        
        if (moRadFilterTypePeriod.isSelected()) {
            moParamsMap.put("bByPeriod", true);
            moParamsMap.put("nPeriodYear", moIntPeriodYear.getValue());
            moParamsMap.put("nPeriodStart", moIntPeriodStart.getValue());
            moParamsMap.put("nPeriodEnd", moIntPeriodEnd.getValue());
            moParamsMap.put("sSqlWhere", " AND p.per_year = " + moIntPeriodYear.getValue() + " AND p.per BETWEEN " + moIntPeriodStart.getValue() + " AND " + moIntPeriodEnd.getValue() + " ");
        }
        else if (moRadFilterTypeDate.isSelected()) {
            moParamsMap.put("bByPeriod", false);
            moParamsMap.put("tDateStart", moDateDateStart.getValue());
            moParamsMap.put("tDateEnd", moDateDateEnd.getValue());
            moParamsMap.put("sSqlWhere", " AND p.dt_sta >= '" + SLibUtils.DbmsDateFormatDate.format(moDateDateStart.getValue()) + "' AND p.dt_end <= '" + SLibUtils.DbmsDateFormatDate.format(moDateDateEnd.getValue()) + "' ");
        }
        
        moParamsMap.put("sSqlWherePaymentType", moKeyPaymentType.getSelectedIndex() > 0 ? " AND p.fk_tp_pay = " + moKeyPaymentType.getValue()[0] : "");
        moParamsMap.put("sPaymentType", moKeyPaymentType.getSelectedIndex() > 0 ? moKeyPaymentType.getSelectedItem() : "(TODOS)");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() instanceof SBeanFieldRadio) {
            if ((SBeanFieldRadio) e.getSource() == moRadFilterTypePeriod ||
                    (SBeanFieldRadio) e.getSource() == moRadFilterTypeDate) {
                actionEnableFields();
            }
            
        }
    }
}
