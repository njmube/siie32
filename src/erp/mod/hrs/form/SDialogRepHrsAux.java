/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.client.SClientInterface;
import erp.mbps.data.SDataBizPartner;
import erp.mod.SModConsts;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import sa.lib.SLibConsts;
import sa.lib.SLibTimeUtils;
import sa.lib.SLibUtils;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiParams;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanDialogReport;
import sa.lib.gui.bean.SBeanFieldRadio;

/**
 *
 * @author Juan Barajas
 */
public class SDialogRepHrsAux extends SBeanDialogReport implements ChangeListener, ItemListener {
    
    protected SPanelHrsDepartaments moPanelHrsDepartaments;
    
    /**
     * Creates new form SDialogRepHrsAux
     * @param client
     * @param title
     */
    public SDialogRepHrsAux(SGuiClient client, String title) {
        setFormSettings(client, SModConsts.HRSR_PAY_AUX, SLibConsts.UNDEFINED, title);
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

        moGroupReportType = new javax.swing.ButtonGroup();
        moGroupFilterType = new javax.swing.ButtonGroup();
        moGroupOrderByEmployee = new javax.swing.ButtonGroup();
        moGroupOrderByDepartament = new javax.swing.ButtonGroup();
        moGroupFilterTypeEarDed = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jlRepType = new javax.swing.JLabel();
        moRadReportTypeAux = new sa.lib.gui.bean.SBeanFieldRadio();
        moRadReportTypeEarDed = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlRepType1 = new javax.swing.JLabel();
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
        jPanel13 = new javax.swing.JPanel();
        jlEmployee = new javax.swing.JLabel();
        moKeyEmployee = new sa.lib.gui.bean.SBeanFieldKey();
        jtbEmployeeActive = new javax.swing.JToggleButton();
        jPanel21 = new javax.swing.JPanel();
        moRadShowEarDed = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel15 = new javax.swing.JPanel();
        moRadShowEar = new sa.lib.gui.bean.SBeanFieldRadio();
        moKeyEarning = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel17 = new javax.swing.JPanel();
        moRadShowDed = new sa.lib.gui.bean.SBeanFieldRadio();
        moKeyDeduction = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel14 = new javax.swing.JPanel();
        jlPaymentType = new javax.swing.JLabel();
        moKeyPaymentType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        moRadOrderByNumEmployee = new sa.lib.gui.bean.SBeanFieldRadio();
        moRadOrderByNameEmployee = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        moRadOrderByNumDepartament = new sa.lib.gui.bean.SBeanFieldRadio();
        moRadOrderByNameDepartament = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        moBoolIsDetail = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBoolShowEmployees = new sa.lib.gui.bean.SBeanFieldBoolean();
        jPanel3 = new javax.swing.JPanel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros del reporte:"));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlRepType.setText("Tipo reporte:");
        jlRepType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel18.add(jlRepType);

        moGroupReportType.add(moRadReportTypeAux);
        moRadReportTypeAux.setText("Auxiliares de nóminas");
        moRadReportTypeAux.setEditable(false);
        moRadReportTypeAux.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel18.add(moRadReportTypeAux);

        moGroupReportType.add(moRadReportTypeEarDed);
        moRadReportTypeEarDed.setSelected(true);
        moRadReportTypeEarDed.setText("Percepciones y deducciones");
        moRadReportTypeEarDed.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel18.add(moRadReportTypeEarDed);

        jPanel16.add(jPanel18, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.GridLayout(11, 1));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlRepType1.setText("Tipo periodo fechas:");
        jlRepType1.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlRepType1);

        moGroupFilterType.add(moRadFilterTypePeriod);
        moRadFilterTypePeriod.setText("Por periodo");
        moRadFilterTypePeriod.setPreferredSize(new java.awt.Dimension(175, 23));
        jPanel4.add(moRadFilterTypePeriod);

        moGroupFilterType.add(moRadFilterTypeDate);
        moRadFilterTypeDate.setText("Por rango de fechas");
        moRadFilterTypeDate.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel4.add(moRadFilterTypeDate);

        jPanel5.add(jPanel4);

        jPanel35.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlYear.setText("Ejercicio:*");
        jlYear.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel35.add(jlYear);
        jPanel35.add(moIntPeriodYear);

        jPanel5.add(jPanel35);

        jPanel36.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPeriodStart.setText("Período inicial:*");
        jlPeriodStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel36.add(jlPeriodStart);
        jPanel36.add(moIntPeriodStart);

        jPanel5.add(jPanel36);

        jPanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPeriodEnd.setText("Período final:*");
        jlPeriodEnd.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel37.add(jlPeriodEnd);
        jPanel37.add(moIntPeriodEnd);

        jPanel5.add(jPanel37);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateStart.setText("Fecha inicial:*");
        jlDateStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jlDateStart);
        jPanel11.add(moDateDateStart);

        jPanel5.add(jPanel11);

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateEnd.setText("Fecha final:*");
        jlDateEnd.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel12.add(jlDateEnd);
        jPanel12.add(moDateDateEnd);

        jPanel5.add(jPanel12);

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlEmployee.setText("Empleado:");
        jlEmployee.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel13.add(jlEmployee);

        moKeyEmployee.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel13.add(moKeyEmployee);

        jtbEmployeeActive.setIcon(new javax.swing.ImageIcon("C:\\Users\\JBarajas\\Documents\\NetBeansProjects_8\\sa-lib-10\\src\\sa\\lib\\img\\swi_filter_on.gif")); // NOI18N
        jtbEmployeeActive.setToolTipText("Filtrar eliminados");
        jtbEmployeeActive.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel13.add(jtbEmployeeActive);

        jPanel5.add(jPanel13);

        jPanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2));

        moGroupFilterTypeEarDed.add(moRadShowEarDed);
        moRadShowEarDed.setText("Percepciones y deducciones");
        moRadShowEarDed.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel21.add(moRadShowEarDed);

        jPanel5.add(jPanel21);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2));

        moGroupFilterTypeEarDed.add(moRadShowEar);
        moRadShowEar.setText("Percepciones");
        jPanel15.add(moRadShowEar);

        moKeyEarning.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel15.add(moKeyEarning);

        jPanel5.add(jPanel15);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2));

        moGroupFilterTypeEarDed.add(moRadShowDed);
        moRadShowDed.setText("Deducciones");
        jPanel17.add(moRadShowDed);

        moKeyDeduction.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel17.add(moKeyDeduction);

        jPanel5.add(jPanel17);

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPaymentType.setText("Periodo pago:");
        jlPaymentType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlPaymentType);

        moKeyPaymentType.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel14.add(moKeyPaymentType);

        jPanel5.add(jPanel14);

        jPanel16.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16, java.awt.BorderLayout.WEST);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenamiento empleado:"));
        jPanel10.setLayout(new java.awt.GridLayout(2, 1));

        moGroupOrderByEmployee.add(moRadOrderByNumEmployee);
        moRadOrderByNumEmployee.setText("Número del empleado");
        jPanel10.add(moRadOrderByNumEmployee);

        moGroupOrderByEmployee.add(moRadOrderByNameEmployee);
        moRadOrderByNameEmployee.setText("Nombre del empleado");
        jPanel10.add(moRadOrderByNameEmployee);

        jPanel6.add(jPanel10, java.awt.BorderLayout.NORTH);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenamiento departamento:"));
        jPanel20.setLayout(new java.awt.GridLayout(2, 1));

        moGroupOrderByDepartament.add(moRadOrderByNumDepartament);
        moRadOrderByNumDepartament.setText("Número del departamento");
        jPanel20.add(moRadOrderByNumDepartament);

        moGroupOrderByDepartament.add(moRadOrderByNameDepartament);
        moRadOrderByNameDepartament.setText("Nombre del departamento");
        jPanel20.add(moRadOrderByNameDepartament);

        jPanel19.add(jPanel20, java.awt.BorderLayout.NORTH);

        jPanel6.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel8.setLayout(new java.awt.GridLayout(2, 1));

        moBoolIsDetail.setText("Detalle");
        jPanel8.add(moBoolIsDetail);

        moBoolShowEmployees.setText("Ver empleados");
        jPanel8.add(moBoolShowEmployees);

        jPanel9.add(jPanel8, java.awt.BorderLayout.NORTH);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlDateEnd;
    private javax.swing.JLabel jlDateStart;
    private javax.swing.JLabel jlEmployee;
    private javax.swing.JLabel jlPaymentType;
    private javax.swing.JLabel jlPeriodEnd;
    private javax.swing.JLabel jlPeriodStart;
    private javax.swing.JLabel jlRepType;
    private javax.swing.JLabel jlRepType1;
    private javax.swing.JLabel jlYear;
    private javax.swing.JToggleButton jtbEmployeeActive;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolIsDetail;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolShowEmployees;
    private sa.lib.gui.bean.SBeanFieldDate moDateDateEnd;
    private sa.lib.gui.bean.SBeanFieldDate moDateDateStart;
    private javax.swing.ButtonGroup moGroupFilterType;
    private javax.swing.ButtonGroup moGroupFilterTypeEarDed;
    private javax.swing.ButtonGroup moGroupOrderByDepartament;
    private javax.swing.ButtonGroup moGroupOrderByEmployee;
    private javax.swing.ButtonGroup moGroupReportType;
    private sa.lib.gui.bean.SBeanFieldCalendarMonth moIntPeriodEnd;
    private sa.lib.gui.bean.SBeanFieldCalendarMonth moIntPeriodStart;
    private sa.lib.gui.bean.SBeanFieldCalendarYear moIntPeriodYear;
    private sa.lib.gui.bean.SBeanFieldKey moKeyDeduction;
    private sa.lib.gui.bean.SBeanFieldKey moKeyEarning;
    private sa.lib.gui.bean.SBeanFieldKey moKeyEmployee;
    private sa.lib.gui.bean.SBeanFieldKey moKeyPaymentType;
    private sa.lib.gui.bean.SBeanFieldRadio moRadFilterTypeDate;
    private sa.lib.gui.bean.SBeanFieldRadio moRadFilterTypePeriod;
    private sa.lib.gui.bean.SBeanFieldRadio moRadOrderByNameDepartament;
    private sa.lib.gui.bean.SBeanFieldRadio moRadOrderByNameEmployee;
    private sa.lib.gui.bean.SBeanFieldRadio moRadOrderByNumDepartament;
    private sa.lib.gui.bean.SBeanFieldRadio moRadOrderByNumEmployee;
    private sa.lib.gui.bean.SBeanFieldRadio moRadReportTypeAux;
    private sa.lib.gui.bean.SBeanFieldRadio moRadReportTypeEarDed;
    private sa.lib.gui.bean.SBeanFieldRadio moRadShowDed;
    private sa.lib.gui.bean.SBeanFieldRadio moRadShowEar;
    private sa.lib.gui.bean.SBeanFieldRadio moRadShowEarDed;
    // End of variables declaration//GEN-END:variables

    private void actionEmpStatusStateChange() {
        if (jtbEmployeeActive.isSelected()) {
            jtbEmployeeActive.setSelectedIcon(new ImageIcon(getClass().getResource("/sa/lib/img/swi_filter_off.gif")));
        }
        else {
            jtbEmployeeActive.setSelectedIcon(new ImageIcon(getClass().getResource("/sa/lib/img/swi_filter_on.gif")));
        }
        populateEmployee();
    }
    
    private void actionEnableFieldsDates() {
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
    
    private void actionEnableFieldsEarDed() {
        moKeyEarning.setEnabled(moRadShowEarDed.isSelected() || moRadShowEar.isSelected());
        moKeyDeduction.setEnabled(moRadShowEarDed.isSelected() || moRadShowDed.isSelected());
    }
    
    private String getOrderBy() {
        String orderBy = "";
        
        orderBy = "ORDER BY f_tp_ear_ded, f_ear_ded, f_ear_ded_id, ";
        
        if (moRadOrderByNumDepartament.isSelected()) {
            orderBy += "f_dep_code, id_dep, ";
        }
        else if (moRadOrderByNameDepartament.isSelected()) {
            orderBy += "f_dep_name, id_dep, ";
        }
        
        if (moRadOrderByNumEmployee.isSelected()) {
            orderBy += "CAST(f_emp_num AS UNSIGNED INTEGER), id_bp, ";
        }
        else if (moRadOrderByNameEmployee.isSelected()) {
            orderBy += "bp, id_bp, ";
        }
        orderBy += "f_pay, f_pay_id; ";
        
        return orderBy;
    }
    
    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 960, 600);
        
        moPanelHrsDepartaments = new SPanelHrsDepartaments(miClient);

        moRadReportTypeAux.setBooleanSettings(SGuiUtils.getLabelName(moRadReportTypeAux.getText()), true);
        moRadReportTypeEarDed.setBooleanSettings(SGuiUtils.getLabelName(moRadReportTypeEarDed.getText()), true);
        moRadFilterTypePeriod.setBooleanSettings(SGuiUtils.getLabelName(moRadFilterTypePeriod.getText()), true);
        moRadFilterTypeDate.setBooleanSettings(SGuiUtils.getLabelName(moRadFilterTypeDate.getText()), false);
        moIntPeriodYear.setCalendarSettings(SGuiUtils.getLabelName(jlYear.getText()));
        moIntPeriodStart.setCalendarSettings(SGuiUtils.getLabelName(jlPeriodStart.getText()));
        moIntPeriodEnd.setCalendarSettings(SGuiUtils.getLabelName(jlPeriodEnd.getText()));
        moDateDateStart.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateStart.getText()), true);
        moDateDateEnd.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateEnd.getText()), true);
        moKeyEmployee.setKeySettings(miClient, SGuiUtils.getLabelName(jlEmployee.getText()), false);
        moRadShowEarDed.setBooleanSettings(SGuiUtils.getLabelName(moRadShowEarDed.getText()), true);
        moRadShowEar.setBooleanSettings(SGuiUtils.getLabelName(moRadShowEar.getText()), false);
        moKeyEarning.setKeySettings(miClient, SGuiUtils.getLabelName(moRadShowEar.getText()), false);
        moRadShowDed.setBooleanSettings(SGuiUtils.getLabelName(moRadShowDed.getText()), false);
        moKeyDeduction.setKeySettings(miClient, SGuiUtils.getLabelName(moRadShowDed.getText()), false);
        moKeyPaymentType.setKeySettings(miClient, SGuiUtils.getLabelName(jlPaymentType.getText()), false);

        jPanel3.add(moPanelHrsDepartaments, BorderLayout.CENTER);

        moFields.addField(moRadReportTypeAux);
        moFields.addField(moRadReportTypeEarDed);
        moFields.addField(moRadFilterTypePeriod);
        moFields.addField(moRadFilterTypeDate);
        moFields.addField(moIntPeriodYear);
        moFields.addField(moIntPeriodStart);
        moFields.addField(moIntPeriodEnd);
        moFields.addField(moDateDateStart);
        moFields.addField(moDateDateEnd);
        moFields.addField(moKeyEmployee);
        moFields.addField(moRadShowEarDed);
        moFields.addField(moRadShowEar);
        moFields.addField(moKeyEarning);
        moFields.addField(moRadShowDed);
        moFields.addField(moKeyDeduction);
        moFields.addField(moKeyPaymentType);

        moFields.setFormButton(jbPrint);

        moRadReportTypeAux.addChangeListener(this);
        moRadReportTypeEarDed.addChangeListener(this);
        moRadFilterTypePeriod.addChangeListener(this);
        moRadFilterTypeDate.addChangeListener(this);
        
        moRadShowEarDed.addChangeListener(this);
        moRadShowEar.addChangeListener(this);
        moRadShowDed.addChangeListener(this);
        
        jtbEmployeeActive.addItemListener(this);
        
        moRadShowEarDed.setSelected(true);
        moRadOrderByNameEmployee.setSelected(true);
        moRadOrderByNameDepartament.setSelected(true);
        moRadFilterTypePeriod.setSelected(true);
        moIntPeriodYear.setValue(miClient.getSession().getCurrentYear());
        moIntPeriodStart.setValue(SLibTimeUtils.digestMonth(miClient.getSession().getCurrentDate())[1]);
        moIntPeriodEnd.setValue(SLibTimeUtils.digestMonth(miClient.getSession().getCurrentDate())[1]);
        moDateDateStart.setValue(SLibTimeUtils.getBeginOfYear(miClient.getSession().getCurrentDate()));
        moDateDateEnd.setValue(SLibTimeUtils.getEndOfYear(miClient.getSession().getCurrentDate()));
        
        jtbEmployeeActive.setSelected(false);
        
        moBoolIsDetail.setSelected(true);
        
        reloadCatalogues();
        actionEnableFieldsDates();
        actionEnableFieldsEarDed();
    }

    private void populateEmployee() {
        if (jtbEmployeeActive.isSelected()) {
            miClient.getSession().populateCatalogue(moKeyEmployee, erp.mod.SModConsts.HRSU_EMP, SLibConsts.UNDEFINED, new SGuiParams(SGuiConsts.PARAM_REGS_ACT));
        }
        else {
            miClient.getSession().populateCatalogue(moKeyEmployee, erp.mod.SModConsts.HRSU_EMP, SLibConsts.UNDEFINED, null);
        }
    }

    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeyEmployee, erp.mod.SModConsts.HRSU_EMP, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyEarning, SModConsts.HRS_EAR, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyDeduction, SModConsts.HRS_DED, SLibConsts.UNDEFINED, null);
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
            
            if (validation.isValid()) {
                if (moBoolShowEmployees.isSelected() && !moBoolIsDetail.isSelected()) {
                    validation.setMessage(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + SGuiUtils.getLabelName(moBoolIsDetail.getText()) + "'.");
                    validation.setComponent(moBoolIsDetail);
                }
            }
        }

        return validation;
    }

    @Override
    public void createParamsMap() {
        SDataBizPartner bizPartnerCompany = null;
        String sSqlWhere = "";
        String sDepartamentsId = "";
        String sDepartamentsName = "";

        bizPartnerCompany = new SDataBizPartner();
        bizPartnerCompany.read(new int[] { ((SClientInterface) miClient).getSessionXXX().getCompany().getPkCompanyId() }, miClient.getSession().getStatement());
        
        sDepartamentsId = (String) moPanelHrsDepartaments.getValue(SGuiConsts.PARAM_KEY);
        sDepartamentsName = (String) moPanelHrsDepartaments.getValue(SGuiConsts.PARAM_ITEM);
        
        if (moRadReportTypeAux.isSelected()) {
            mnFormType = SModConsts.HRSR_PAY_AUX;
        }
        else {
            mnFormType = SModConsts.HRSR_PAY_AUX_EAR_DED;            
        }
        
        moParamsMap = miClient.createReportParams();
        
        sSqlWhere += moKeyEmployee.getSelectedIndex() > 0 ? " AND emp.id_emp = " + moKeyEmployee.getValue()[0] : "";
        sSqlWhere += moKeyPaymentType.getSelectedIndex() > 0 ? " AND p.fk_tp_pay = " +  moKeyPaymentType.getValue()[0] : "";
        sSqlWhere += sDepartamentsId.isEmpty() ? "" : " AND dep.id_dep IN(" + sDepartamentsId + ") ";
        
        moParamsMap.put("sTitle", moRadReportTypeAux.isSelected() ? "REPORTE DE AUXILIARES DE NÓMINAS" : "REPORTE DE PERCEPCIONES Y DEDUCCIONES");
        
        if (moRadFilterTypePeriod.isSelected()) {
            moParamsMap.put("bByPeriod", true);
            moParamsMap.put("nPeriodYear", moIntPeriodYear.getValue());
            moParamsMap.put("nPeriodStart", moIntPeriodStart.getValue());
            moParamsMap.put("nPeriodEnd", moIntPeriodEnd.getValue());
            sSqlWhere += " AND p.per_year = " + moIntPeriodYear.getValue() + " AND p.per BETWEEN " + moIntPeriodStart.getValue() + " AND " + moIntPeriodEnd.getValue() + " ";
        }
        else if (moRadFilterTypeDate.isSelected()) {
            moParamsMap.put("bByPeriod", false);
            moParamsMap.put("tDateStart", moDateDateStart.getValue());
            moParamsMap.put("tDateEnd", moDateDateEnd.getValue());
            sSqlWhere += " AND p.dt_sta >= '" + SLibUtils.DbmsDateFormatDate.format(moDateDateStart.getValue()) + "' AND p.dt_end <= '" + SLibUtils.DbmsDateFormatDate.format(moDateDateEnd.getValue()) + "' ";
        }
        moParamsMap.put("bIsSummary", !moBoolIsDetail.isSelected());
        moParamsMap.put("bShowEmployees", moBoolShowEmployees.isSelected());
        moParamsMap.put("RegistroPatronal", ((SClientInterface) miClient).getSessionXXX().getParamsCompany().getRegistrySs());
        moParamsMap.put("sEmiRfc", bizPartnerCompany.getFiscalId());
        
        moParamsMap.put("sEmployee", moKeyEmployee.getSelectedIndex() > 0 ? moKeyEmployee.getSelectedItem() : "(TODOS)");
        moParamsMap.put("sEarning", moKeyEarning.getSelectedIndex() > 0 ? moKeyEarning.getSelectedItem() : "(TODAS)");
        moParamsMap.put("sDeduction", moKeyDeduction.getSelectedIndex() > 0 ? moKeyDeduction.getSelectedItem() : "(TODAS)");
        moParamsMap.put("sPaymentType", moKeyPaymentType.getSelectedIndex() > 0 ? moKeyPaymentType.getSelectedItem() : "(TODOS)");
        moParamsMap.put("sDepartaments", sDepartamentsName.isEmpty() || (boolean) moPanelHrsDepartaments.getValue(SGuiConsts.PARAM_ROWS) ? "(TODOS)" : sDepartamentsName + " ");
        
        moParamsMap.put("sSqlWhere", sSqlWhere);
        
        if (moRadShowEarDed.isSelected()) {
            moParamsMap.put("sSqlWhereEarning", moKeyEarning.getSelectedIndex() > 0 ? " AND ear.id_ear = " + moKeyEarning.getValue()[0] : "");
            moParamsMap.put("sSqlWhereDeduction", moKeyDeduction.getSelectedIndex() > 0 ? " AND ded.id_ded = " + moKeyDeduction.getValue()[0] : "");
        }
        else {
            moParamsMap.put("sSqlWhereEarning", !moKeyEarning.isEnabled() ? " AND ear.id_ear = 0 " : moKeyEarning.getSelectedIndex() > 0 ? " AND ear.id_ear = " + moKeyEarning.getValue()[0] : "");
            moParamsMap.put("sSqlWhereDeduction", !moKeyDeduction.isEnabled() ? " AND ded.id_ded = 0 " : moKeyDeduction.getSelectedIndex() > 0 ? " AND ded.id_ded = " + moKeyDeduction.getValue()[0] : "");
        }
        /*
        moParamsMap.put("sSqlWhereEarning", !moKeyEarning.isEnabled() ? " AND ear.id_ear = 0 " : (moKeyEarning.getSelectedIndex() > 0 ? " AND ear.id_ear = " + moKeyEarning.getValue()[0] : ""));
        moParamsMap.put("sSqlWhereDeduction", !moKeyDeduction.isEnabled() ? " AND ded.id_ded = 0 " : (moKeyDeduction.getSelectedIndex() > 0 ? " AND ded.id_ded = " + moKeyDeduction.getValue()[0] : ""));
        */
        
        moParamsMap.put("sSqlOrderBy", mnFormType == SModConsts.HRSR_PAY_AUX_EAR_DED ? getOrderBy() : "");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() instanceof SBeanFieldRadio) {
            if ((SBeanFieldRadio) e.getSource() == moRadFilterTypePeriod ||
                    (SBeanFieldRadio) e.getSource() == moRadFilterTypeDate) {
                actionEnableFieldsDates();
            }
            else if ((SBeanFieldRadio) e.getSource() == moRadShowEarDed ||
                    (SBeanFieldRadio) e.getSource() == moRadShowEar ||
                    (SBeanFieldRadio) e.getSource() == moRadShowDed) {
                actionEnableFieldsEarDed();
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JToggleButton) {
            JToggleButton toggleButton = (JToggleButton) e.getSource();

            if (toggleButton == jtbEmployeeActive) {
                actionEmpStatusStateChange();
            }
        }
    }
}
