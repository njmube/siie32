/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.hrs.db.SDbConfig;
import erp.mod.hrs.db.SDbEmployee;
import erp.mod.hrs.db.SHrsCalculatedNetGrossAmount;
import erp.mod.hrs.db.SHrsConsts;
import erp.mod.hrs.db.SHrsUtils;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import sa.gui.util.SUtilConsts;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbConsts;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiItem;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFieldKey;
import sa.lib.gui.bean.SBeanFieldRadio;
import sa.lib.gui.bean.SBeanForm;

/**
 *
 * @author Juan Barajas
 */
public class SFormCalculateNetGrossAmount extends SBeanForm implements ItemListener, ChangeListener {

    protected SDbEmployee moEmployee;
    protected SPanelHrsEmployeeInformation moHrsEmployeeInformation;
    
    /**
     * Creates new form SFormCalculateNetGrossAmount
     * @param client
     * @param title
     * @param formType
     */
    public SFormCalculateNetGrossAmount(SGuiClient client, int formType, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, formType, SLibConsts.UNDEFINED, title);
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

        jPanel3 = new javax.swing.JPanel();
        moRadGroupEmployee = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        moRadFilterWithEmployee = new sa.lib.gui.bean.SBeanFieldRadio();
        moRadFilterWithoutEmployee = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jlEmployee = new javax.swing.JLabel();
        moKeyEmployee = new sa.lib.gui.bean.SBeanFieldKey();
        jpEmployeeInformation = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlDate = new javax.swing.JLabel();
        moDateDate = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel22 = new javax.swing.JPanel();
        jlCalculateType = new javax.swing.JLabel();
        moKeyCalculateType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel8 = new javax.swing.JPanel();
        jlGrossAmount = new javax.swing.JLabel();
        moCompGrossAmount = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel15 = new javax.swing.JPanel();
        jlNetAmount = new javax.swing.JLabel();
        moCompNetAmount = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel23 = new javax.swing.JPanel();
        jlTolerance = new javax.swing.JLabel();
        moCompTolerance = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel27 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jlMwzWage = new javax.swing.JLabel();
        moCompMwzWage = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel24 = new javax.swing.JPanel();
        jlAmountMwzWage = new javax.swing.JLabel();
        moCompAmountMwzWage = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel20 = new javax.swing.JPanel();
        jlMwzReferenceWage = new javax.swing.JLabel();
        moCompMwzReferenceWage = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel25 = new javax.swing.JPanel();
        jlAmountMwzReferenceWage = new javax.swing.JLabel();
        moCompAmountMwzReferenceWage = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel2 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jlTax = new javax.swing.JLabel();
        moCompTax = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jLabel1 = new javax.swing.JLabel();
        jlSalary = new javax.swing.JLabel();
        moCompSalary = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel11 = new javax.swing.JPanel();
        jlSsContribution = new javax.swing.JLabel();
        moCompSsContribution = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jLabel2 = new javax.swing.JLabel();
        jlSalarySscBase = new javax.swing.JLabel();
        moCompSalarySscBase = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel9 = new javax.swing.JPanel();
        jlTaxSubsidy = new javax.swing.JLabel();
        moCompTaxSubsidy = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jlGrossAmountCalculated = new javax.swing.JLabel();
        moCompGrossAmountCalculated = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel31 = new javax.swing.JPanel();
        jlNetAmountCalculated = new javax.swing.JLabel();
        moCompNetAmountCalculated = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel13 = new javax.swing.JPanel();
        jlNetAmountWithSubsidy = new javax.swing.JLabel();
        moCompNetAmountWithSubsidy = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel26.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        moRadGroupEmployee.add(moRadFilterWithEmployee);
        moRadFilterWithEmployee.setText("Con un empleado");
        moRadFilterWithEmployee.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel26.add(moRadFilterWithEmployee);

        moRadGroupEmployee.add(moRadFilterWithoutEmployee);
        moRadFilterWithoutEmployee.setSelected(true);
        moRadFilterWithoutEmployee.setText("Sin un empleado");
        moRadFilterWithoutEmployee.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel26.add(moRadFilterWithoutEmployee);

        jPanel4.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado:"));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlEmployee.setText("Empleado:");
        jlEmployee.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel14.add(jlEmployee);

        moKeyEmployee.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel14.add(moKeyEmployee);

        jPanel7.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jpEmployeeInformation.setLayout(new java.awt.BorderLayout());
        jPanel7.add(jpEmployeeInformation, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros para cálculo:"));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel18.setLayout(new java.awt.GridLayout(6, 1, 0, 5));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDate.setText("Fecha corte:*");
        jlDate.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel5.add(jlDate);
        jPanel5.add(moDateDate);

        jPanel18.add(jPanel5);

        jPanel22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCalculateType.setText("Tipo de cálculo:");
        jlCalculateType.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel22.add(jlCalculateType);

        moKeyCalculateType.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel22.add(moKeyCalculateType);

        jPanel18.add(jPanel22);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlGrossAmount.setText("Importe bruto mensual:");
        jlGrossAmount.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel8.add(jlGrossAmount);
        jPanel8.add(moCompGrossAmount);

        jPanel18.add(jPanel8);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlNetAmount.setText("Importe neto mensual:");
        jlNetAmount.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel15.add(jlNetAmount);
        jPanel15.add(moCompNetAmount);

        jPanel18.add(jPanel15);

        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlTolerance.setText("Tolerancia:");
        jlTolerance.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel23.add(jlTolerance);

        moCompTolerance.setEditable(false);
        jPanel23.add(moCompTolerance);

        jPanel18.add(jPanel23);

        jPanel27.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));
        jPanel18.add(jPanel27);

        jPanel16.add(jPanel18, java.awt.BorderLayout.NORTH);

        jPanel12.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Salarios mínimos:"));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel21.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlMwzWage.setText("Salario mín. área geo.:");
        jlMwzWage.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel19.add(jlMwzWage);

        moCompMwzWage.setEditable(false);
        jPanel19.add(moCompMwzWage);

        jPanel21.add(jPanel19);

        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlAmountMwzWage.setText("Ingreso men. mín. área geo.:");
        jlAmountMwzWage.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel24.add(jlAmountMwzWage);

        moCompAmountMwzWage.setEditable(false);
        jPanel24.add(moCompAmountMwzWage);

        jPanel21.add(jPanel24);

        jPanel20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlMwzReferenceWage.setText("Salario mín. área geo. ref.:");
        jlMwzReferenceWage.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel20.add(jlMwzReferenceWage);

        moCompMwzReferenceWage.setEditable(false);
        jPanel20.add(moCompMwzReferenceWage);

        jPanel21.add(jPanel20);

        jPanel25.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlAmountMwzReferenceWage.setText("Ingreso men. mín. área geo. ref.:");
        jlAmountMwzReferenceWage.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel25.add(jlAmountMwzReferenceWage);

        moCompAmountMwzReferenceWage.setEditable(false);
        jPanel25.add(moCompAmountMwzReferenceWage);

        jPanel21.add(jPanel25);

        jPanel17.add(jPanel21, java.awt.BorderLayout.NORTH);

        jPanel12.add(jPanel17, java.awt.BorderLayout.EAST);

        jPanel6.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cálculo:"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel28.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlTax.setText("ISR:");
        jlTax.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel10.add(jlTax);
        jPanel10.add(moCompTax);

        jLabel1.setPreferredSize(new java.awt.Dimension(30, 23));
        jPanel10.add(jLabel1);

        jlSalary.setText("SD:");
        jlSalary.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel10.add(jlSalary);

        moCompSalary.setEditable(false);
        jPanel10.add(moCompSalary);

        jPanel28.add(jPanel10);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlSsContribution.setText("SS:");
        jlSsContribution.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel11.add(jlSsContribution);
        jPanel11.add(moCompSsContribution);

        jLabel2.setPreferredSize(new java.awt.Dimension(30, 23));
        jPanel11.add(jLabel2);

        jlSalarySscBase.setText("SBC:");
        jlSalarySscBase.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel11.add(jlSalarySscBase);

        moCompSalarySscBase.setEditable(false);
        jPanel11.add(moCompSalarySscBase);

        jPanel28.add(jPanel11);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlTaxSubsidy.setText("Subsidio:");
        jlTaxSubsidy.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel9.add(jlTaxSubsidy);
        jPanel9.add(moCompTaxSubsidy);

        jPanel28.add(jPanel9);

        jPanel2.add(jPanel28, java.awt.BorderLayout.CENTER);

        jPanel29.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        jPanel30.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlGrossAmountCalculated.setText("Importe bruto mensual calculado:");
        jlGrossAmountCalculated.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel30.add(jlGrossAmountCalculated);
        jPanel30.add(moCompGrossAmountCalculated);

        jPanel29.add(jPanel30);

        jPanel31.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlNetAmountCalculated.setText("Importe neto mensual calculado:");
        jlNetAmountCalculated.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel31.add(jlNetAmountCalculated);
        jPanel31.add(moCompNetAmountCalculated);

        jPanel29.add(jPanel31);

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlNetAmountWithSubsidy.setText("Importe neto + subsidio:");
        jlNetAmountWithSubsidy.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel13.add(jlNetAmountWithSubsidy);
        jPanel13.add(moCompNetAmountWithSubsidy);

        jPanel29.add(jPanel13);

        jPanel2.add(jPanel29, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlAmountMwzReferenceWage;
    private javax.swing.JLabel jlAmountMwzWage;
    private javax.swing.JLabel jlCalculateType;
    private javax.swing.JLabel jlDate;
    private javax.swing.JLabel jlEmployee;
    private javax.swing.JLabel jlGrossAmount;
    private javax.swing.JLabel jlGrossAmountCalculated;
    private javax.swing.JLabel jlMwzReferenceWage;
    private javax.swing.JLabel jlMwzWage;
    private javax.swing.JLabel jlNetAmount;
    private javax.swing.JLabel jlNetAmountCalculated;
    private javax.swing.JLabel jlNetAmountWithSubsidy;
    private javax.swing.JLabel jlSalary;
    private javax.swing.JLabel jlSalarySscBase;
    private javax.swing.JLabel jlSsContribution;
    private javax.swing.JLabel jlTax;
    private javax.swing.JLabel jlTaxSubsidy;
    private javax.swing.JLabel jlTolerance;
    private javax.swing.JPanel jpEmployeeInformation;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompAmountMwzReferenceWage;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompAmountMwzWage;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompGrossAmount;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompGrossAmountCalculated;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompMwzReferenceWage;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompMwzWage;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompNetAmount;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompNetAmountCalculated;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompNetAmountWithSubsidy;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompSalary;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompSalarySscBase;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompSsContribution;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompTax;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompTaxSubsidy;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCompTolerance;
    private sa.lib.gui.bean.SBeanFieldDate moDateDate;
    private sa.lib.gui.bean.SBeanFieldKey moKeyCalculateType;
    private sa.lib.gui.bean.SBeanFieldKey moKeyEmployee;
    private sa.lib.gui.bean.SBeanFieldRadio moRadFilterWithEmployee;
    private sa.lib.gui.bean.SBeanFieldRadio moRadFilterWithoutEmployee;
    private javax.swing.ButtonGroup moRadGroupEmployee;
    // End of variables declaration//GEN-END:variables

    /*
     * Private methods
     */
    
    public void actionEnableFields() {
        if (moRadFilterWithEmployee.isSelected()) {
            moKeyEmployee.setEnabled(true);
        }
        else if (moRadFilterWithoutEmployee.isSelected()) {
            moKeyEmployee.setSelectedIndex(0);
            moKeyEmployee.setEnabled(false);
        }
    }
    
    private void computeMwzWage() {
        SDbConfig config = null;
        double dMwzWage = 0;
        double dMwzReferenceWage = 0;
        
        try {
            config = (SDbConfig) miClient.getSession().readRegistry(SModConsts.HRS_CFG, new int[] { SUtilConsts.BPR_CO_ID });
            dMwzWage = SHrsUtils.getRecentMwz(miClient.getSession(), config.getFkMwzTypeId(), moDateDate.getValue());
            dMwzReferenceWage = SHrsUtils.getRecentMwz(miClient.getSession(), config.getFkMwzReferenceTypeId(), moDateDate.getValue());
            
            moCompMwzWage.getField().setValue(dMwzWage);
            moCompMwzReferenceWage.getField().setValue(dMwzReferenceWage);
            
            moCompAmountMwzWage.getField().setValue(dMwzWage * SHrsConsts.YEAR_DAYS / SHrsConsts.YEAR_MONTHS);
            moCompAmountMwzReferenceWage.getField().setValue(dMwzReferenceWage * SHrsConsts.YEAR_DAYS / SHrsConsts.YEAR_MONTHS);
        }
        catch (Exception e) {
            SLibUtils.printException(this, e);
        }
        
    }
    
    private void itemStateEmployee() {
        if (mnFormType == SHrsConsts.CAL_NET_AMT_TYPE) {
            moCompNetAmount.getField().setValue(0d);
            moCompNetAmountWithSubsidy.getField().setValue(0d);
        }
        else if (mnFormType == SHrsConsts.CAL_GROSS_AMT_TYPE) {
            moCompGrossAmount.getField().setValue(0d);
        }
        moCompTax.getField().setValue(0d);
        moCompTaxSubsidy.getField().setValue(0d);
        moCompSsContribution.getField().setValue(0d);
        
        if (moKeyEmployee.getSelectedIndex() > 0) {
            moEmployee =  (SDbEmployee) miClient.getSession().readRegistry(SModConsts.HRSU_EMP, moKeyEmployee.getSelectedItem().getPrimaryKey(), SDbConsts.MODE_VERBOSE);
        }
        else {
            moEmployee = null;
        }
        moHrsEmployeeInformation.setValue(SGuiConsts.PARAM_BPR, moEmployee);
    }
    
    private void itemStateCalculatedType() {
        if (moKeyCalculateType.getSelectedIndex() > 0) {
            if (moKeyCalculateType.getSelectedItem().getPrimaryKey()[0] == SHrsConsts.CAL_NET_AMT_TYPE) {
                mnFormType = SHrsConsts.CAL_NET_AMT_TYPE;
                moCompGrossAmount.setEditable(true);
                moCompNetAmount.getField().setValue(0d);
                moCompNetAmount.setEditable(false);
            }
            else if (moKeyCalculateType.getSelectedItem().getPrimaryKey()[0] == SHrsConsts.CAL_GROSS_AMT_TYPE) {
                mnFormType = SHrsConsts.CAL_GROSS_AMT_TYPE;
                moCompGrossAmount.getField().setValue(0d);
                moCompGrossAmount.setEditable(false);
                moCompNetAmount.setEditable(true);
            }
        }
        else {
            moCompGrossAmount.setEditable(false);
            moCompNetAmount.setEditable(false);
        }
    }
    
    private void populateCalculateType() {
        Vector<SGuiItem> type = new Vector<SGuiItem>();

        type.add(new SGuiItem(new int[] { SLibConsts.UNDEFINED }, "(" + SUtilConsts.TXT_SELECT + " tipo cálculo)"));
        type.add(new SGuiItem(new int[] { SHrsConsts.CAL_NET_AMT_TYPE }, SHrsConsts.TXT_CAL_NET_AMT_TYPE));
        type.add(new SGuiItem(new int[] { SHrsConsts.CAL_GROSS_AMT_TYPE }, SHrsConsts.TXT_CAL_GROSS_AMT_TYPE));
        
        moKeyCalculateType.removeAllItems();
        for (int i = 0; i < type.size(); i++) {
            moKeyCalculateType.addItem(type.get(i));
        }
    }
    
    private void actionCalculated() {
        double dSalaryDiary = 0;
        double dSalarySscBase = 0;
        SHrsCalculatedNetGrossAmount netGrossAmount = null;
        
        try {
            /*
            if (mnFormType == SHrsConsts.CAL_NET_AMT_TYPE) {
                dSalaryDiary = moCompGrossAmount.getField().getValue() * SHrsConsts.YEAR_MONTHS / SHrsConsts.YEAR_DAYS;
            }
            else if (mnFormType == SHrsConsts.CAL_GROSS_AMT_TYPE) {
                dSalaryDiary = moCompNetAmount.getField().getValue() * SHrsConsts.YEAR_MONTHS / SHrsConsts.YEAR_DAYS; // XXX el calculo del SD es incorrecto
            }
            dSalarySscBase = dSalaryDiary * SHrsUtils.getIntegrationFactorSbc(miClient.getSession(), (moEmployee == null ? null : moEmployee.getDateBenefits()), moDateDate.getValue());
            moCompSalarySscBase.getField().setValue(dSalarySscBase);
            */
            
            if (mnFormType == SHrsConsts.CAL_NET_AMT_TYPE) {
                netGrossAmount = SHrsUtils.computeNetAmountPayment(miClient.getSession(), moCompGrossAmount.getField().getValue(), moDateDate.getValue(), (moEmployee == null ? null : moEmployee.getDateBenefits()));

                moCompNetAmountCalculated.getField().setValue(netGrossAmount.getNetAmount());
                moCompGrossAmountCalculated.getField().setValue(0d);
                moCompNetAmountWithSubsidy.getField().setValue(netGrossAmount.getNetAmountWithSubsidy());
            }
            else if (mnFormType == SHrsConsts.CAL_GROSS_AMT_TYPE) {
                netGrossAmount = SHrsUtils.computeGrossAmountPayment(miClient.getSession(), moCompNetAmount.getField().getValue(), moDateDate.getValue(), moCompTolerance.getField().getValue(), (moEmployee == null ? null : moEmployee.getDateBenefits()));                    

                moCompNetAmountCalculated.getField().setValue(0d);
                moCompGrossAmountCalculated.getField().setValue(netGrossAmount.getGrossAmount());
                moCompNetAmountWithSubsidy.getField().setValue(0d);
            }

            moCompTax.getField().setValue(netGrossAmount.getTaxAmount());
            moCompTaxSubsidy.getField().setValue(netGrossAmount.getTaxSubsidyAmount());
            moCompSsContribution.getField().setValue(netGrossAmount.getSsContributionAmount());
            moCompSalary.getField().setValue(netGrossAmount.getSalary());
            moCompSalarySscBase.getField().setValue(netGrossAmount.getSalarySs());
        }
        catch (Exception e) {
            SLibUtils.printException(this, e);
        }
    }

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 1024, 640);
        mnFormType = SLibConsts.UNDEFINED;
        
        jbSave.setText("Calcular");

        moRadFilterWithEmployee.setBooleanSettings(SGuiUtils.getLabelName(moRadFilterWithEmployee.getText()), false);
        moRadFilterWithoutEmployee.setBooleanSettings(SGuiUtils.getLabelName(moRadFilterWithoutEmployee.getText()), true);
        moKeyEmployee.setKeySettings(miClient, SGuiUtils.getLabelName(jlEmployee.getText()), true);
        moDateDate.setDateSettings(miClient, SGuiUtils.getLabelName(jlDate.getText()), true);
        moKeyCalculateType.setKeySettings(miClient, SGuiUtils.getLabelName(jlCalculateType.getText()), true);
        moCompGrossAmount.setCompoundFieldSettings(miClient);
        moCompGrossAmount.getField().setDecimalSettings(SGuiUtils.getLabelName(jlGrossAmount.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, true);
        moCompNetAmount.setCompoundFieldSettings(miClient);
        moCompNetAmount.getField().setDecimalSettings(SGuiUtils.getLabelName(jlNetAmount.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, true);
        moCompTolerance.setCompoundFieldSettings(miClient);
        moCompTolerance.getField().setDecimalSettings(SGuiUtils.getLabelName(jlTolerance.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompSalary.setCompoundFieldSettings(miClient);
        moCompSalary.getField().setDecimalSettings(SGuiUtils.getLabelName(jlSalary.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, true);
        moCompSalarySscBase.setCompoundFieldSettings(miClient);
        moCompSalarySscBase.getField().setDecimalSettings(SGuiUtils.getLabelName(jlSalarySscBase.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, true);
        moCompMwzWage.setCompoundFieldSettings(miClient);
        moCompMwzWage.getField().setDecimalSettings(SGuiUtils.getLabelName(jlMwzWage.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompAmountMwzWage.setCompoundFieldSettings(miClient);
        moCompAmountMwzWage.getField().setDecimalSettings(SGuiUtils.getLabelName(jlAmountMwzWage.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompMwzReferenceWage.setCompoundFieldSettings(miClient);
        moCompMwzReferenceWage.getField().setDecimalSettings(SGuiUtils.getLabelName(jlMwzReferenceWage.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompAmountMwzReferenceWage.setCompoundFieldSettings(miClient);
        moCompAmountMwzReferenceWage.getField().setDecimalSettings(SGuiUtils.getLabelName(jlAmountMwzReferenceWage.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompTax.setCompoundFieldSettings(miClient);
        moCompTax.getField().setDecimalSettings(SGuiUtils.getLabelName(jlTax.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompSsContribution.setCompoundFieldSettings(miClient);
        moCompSsContribution.getField().setDecimalSettings(SGuiUtils.getLabelName(jlSsContribution.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompTaxSubsidy.setCompoundFieldSettings(miClient);
        moCompTaxSubsidy.getField().setDecimalSettings(SGuiUtils.getLabelName(jlTaxSubsidy.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompNetAmountCalculated.setCompoundFieldSettings(miClient);
        moCompNetAmountCalculated.getField().setDecimalSettings(SGuiUtils.getLabelName(jlNetAmountCalculated.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompGrossAmountCalculated.setCompoundFieldSettings(miClient);
        moCompGrossAmountCalculated.getField().setDecimalSettings(SGuiUtils.getLabelName(jlGrossAmountCalculated.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCompNetAmountWithSubsidy.setCompoundFieldSettings(miClient);
        moCompNetAmountWithSubsidy.getField().setDecimalSettings(SGuiUtils.getLabelName(jlNetAmountWithSubsidy.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        
        moHrsEmployeeInformation = new SPanelHrsEmployeeInformation(miClient);
        
        /*
        moFields.addField(moRadFilterWithEmployee);
        moFields.addField(moRadFilterWithoutEmployee);
        */
        moFields.addField(moKeyEmployee);
        moFields.addField(moDateDate);
        moFields.addField(moKeyCalculateType);
        moFields.addField(moCompGrossAmount.getField());
        moFields.addField(moCompNetAmount.getField());
        //moFields.addField(moCompTolerance);
        /*
        moFields.addField(moCompMwzWage.getField());
        moFields.addField(moCompAmountMwzWage.getField());
        moFields.addField(moCompMwzReferenceWage.getField());
        moFields.addField(moCompAmountMwzReferenceWage.getField());
        moFields.addField(moCompTax.getField());
        moFields.addField(moCompSsContribution.getField());
        moFields.addField(moCompTaxSubsidy.getField());
        */
        moFields.addField(moCompSalary.getField());
        moFields.addField(moCompSalarySscBase.getField());
        /*
        moFields.addField(moCompNetAmountCalculated.getField());
        moFields.addField(moCompGrossAmountCalculated.getField());
        moFields.addField(moCompNetAmountWithSubsidy.getField());
        */
        
        setFormEditable(true);
        
        moCompGrossAmount.setEditable(false);
        moCompNetAmount.setEditable(false);
        moCompTolerance.setEditable(false);
        moCompTax.setEditable(false);
        moCompSsContribution.setEditable(false);
        moCompTaxSubsidy.setEditable(false);
        moCompSalary.setEditable(false);
        moCompSalarySscBase.setEditable(false);
        moCompNetAmountCalculated.setEditable(false);
        moCompGrossAmountCalculated.setEditable(false);
        moCompNetAmountWithSubsidy.setEditable(false);

        moFields.setFormButton(jbSave);
        
        jpEmployeeInformation.add(moHrsEmployeeInformation, BorderLayout.CENTER);
        moRadFilterWithoutEmployee.setSelected(true);
        jtfRegistryKey.setText("");
        
        moDateDate.setValue(miClient.getSession().getCurrentDate());
        moCompTolerance.getField().setValue(0.10);
        computeMwzWage();
                
        removeAllListeners();
        reloadCatalogues();
        addAllListeners();
        actionEnableFields();
    }

    /*
     * Public methods
     */

    /*
     * Overriden methods
     */

    @Override
    public void addAllListeners() {
        moRadFilterWithEmployee.addChangeListener(this);
        moRadFilterWithoutEmployee.addChangeListener(this);
        moKeyEmployee.addItemListener(this);
        moKeyCalculateType.addItemListener(this);
    }

    @Override
    public void removeAllListeners() {
        moRadFilterWithEmployee.removeChangeListener(this);
        moRadFilterWithoutEmployee.removeChangeListener(this);
        moKeyEmployee.removeItemListener(this);
        moKeyCalculateType.removeItemListener(this);
    }

    @Override
    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeyEmployee, SModConsts.HRSU_EMP, SLibConsts.UNDEFINED, null);
        populateCalculateType();
        itemStateCalculatedType();
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        return validation;
    }
    
    @Override
    public void actionSave() {
        if (jbSave.isEnabled()) {
            if (SGuiUtils.computeValidation(miClient, validateForm())) {
                actionCalculated();
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof SBeanFieldKey) {
            SBeanFieldKey field = (SBeanFieldKey) e.getSource();

            if (field == moKeyEmployee) {
                itemStateEmployee();
            }
            else if (field == moKeyCalculateType) {
                itemStateCalculatedType();
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() instanceof SBeanFieldRadio) {
            if ((SBeanFieldRadio) e.getSource() == moRadFilterWithEmployee ||
                    (SBeanFieldRadio) e.getSource() == moRadFilterWithoutEmployee) {
                actionEnableFields();
            }
            
        }
    }
}
