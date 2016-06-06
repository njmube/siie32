/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.SModSysConsts;
import erp.mod.hrs.db.SDbEarning;
import erp.mod.hrs.db.SDbEmployee;
import erp.mod.hrs.db.SDbPayrollReceiptEarning;
import erp.mod.hrs.db.SDbPayrollReceiptEarningComplement;
import erp.mod.hrs.db.SHrsUtils;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import sa.lib.SLibConsts;
import sa.lib.SLibTimeUtils;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFieldKey;
import sa.lib.gui.bean.SBeanForm;

/**
 *
 * @author Juan Barajas
 */
public class SFormBenefitAdjustmentEarning extends SBeanForm implements ItemListener, ChangeListener {

    private SDbPayrollReceiptEarning moRegistry;
    protected SDbEmployee moEmployee;

    /**
     * Creates new form SFormBenefitAdjustmentEarning
     * @param client
     * @param title
     */
    public SFormBenefitAdjustmentEarning(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.HRS_PAY_RCP_EAR, SLibConsts.UNDEFINED, title);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jlEmployee = new javax.swing.JLabel();
        moKeyEmployee = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel7 = new javax.swing.JPanel();
        jlBenefitType = new javax.swing.JLabel();
        moKeyBenefitType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel11 = new javax.swing.JPanel();
        jlBenefitAnniversary = new javax.swing.JLabel();
        jsAnniversary = new javax.swing.JSpinner();
        moIntBenefitYear = new sa.lib.gui.bean.SBeanFieldInteger();
        jPanel4 = new javax.swing.JPanel();
        jlDate = new javax.swing.JLabel();
        moDateDate = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel15 = new javax.swing.JPanel();
        jlDaysToPaid = new javax.swing.JLabel();
        moDecDaysToPaid = new sa.lib.gui.bean.SBeanFieldDecimal();
        jPanel8 = new javax.swing.JPanel();
        jlTotalAmount = new javax.swing.JLabel();
        moCurPayment = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel14 = new javax.swing.JPanel();
        jlNotes = new javax.swing.JLabel();
        moTextNotes = new sa.lib.gui.bean.SBeanFieldText();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(8, 1, 0, 5));

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlEmployee.setForeground(new java.awt.Color(0, 0, 255));
        jlEmployee.setText("Empleado:*");
        jlEmployee.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel13.add(jlEmployee);

        moKeyEmployee.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel13.add(moKeyEmployee);

        jPanel2.add(jPanel13);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlBenefitType.setText("Tipo prestación:*");
        jlBenefitType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel7.add(jlBenefitType);

        moKeyBenefitType.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel7.add(moKeyBenefitType);

        jPanel2.add(jPanel7);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlBenefitAnniversary.setText("Aniversario:*");
        jlBenefitAnniversary.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jlBenefitAnniversary);

        jsAnniversary.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jsAnniversary);

        moIntBenefitYear.setToolTipText("Año aniversario");
        moIntBenefitYear.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel11.add(moIntBenefitYear);

        jPanel2.add(jPanel11);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDate.setText("Fecha:*");
        jlDate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlDate);

        moDateDate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(moDateDate);

        jPanel2.add(jPanel4);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDaysToPaid.setText("Días:*");
        jlDaysToPaid.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel15.add(jlDaysToPaid);
        jPanel15.add(moDecDaysToPaid);

        jPanel2.add(jPanel15);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlTotalAmount.setText("Monto:");
        jlTotalAmount.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jlTotalAmount);
        jPanel8.add(moCurPayment);

        jPanel2.add(jPanel8);

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlNotes.setText("Notas:");
        jlNotes.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlNotes);

        moTextNotes.setText("sBeanFieldText1");
        moTextNotes.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel14.add(moTextNotes);

        jPanel2.add(jPanel14);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jlBenefitAnniversary;
    private javax.swing.JLabel jlBenefitType;
    private javax.swing.JLabel jlDate;
    private javax.swing.JLabel jlDaysToPaid;
    private javax.swing.JLabel jlEmployee;
    private javax.swing.JLabel jlNotes;
    private javax.swing.JLabel jlTotalAmount;
    private javax.swing.JSpinner jsAnniversary;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCurPayment;
    private sa.lib.gui.bean.SBeanFieldDate moDateDate;
    private sa.lib.gui.bean.SBeanFieldDecimal moDecDaysToPaid;
    private sa.lib.gui.bean.SBeanFieldInteger moIntBenefitYear;
    private sa.lib.gui.bean.SBeanFieldKey moKeyBenefitType;
    private sa.lib.gui.bean.SBeanFieldKey moKeyEmployee;
    private sa.lib.gui.bean.SBeanFieldText moTextNotes;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 560, 350);

        moKeyEmployee.setKeySettings(miClient, SGuiUtils.getLabelName(jlEmployee.getText()), true);
        moKeyBenefitType.setKeySettings(miClient, SGuiUtils.getLabelName(jlBenefitType.getText()), true);
        jsAnniversary.setModel(new SpinnerNumberModel(1, 1, 100, 1));
        moIntBenefitYear.setIntegerSettings(SGuiUtils.getLabelName(jlBenefitAnniversary.getText()), SGuiConsts.GUI_TYPE_INT_CAL_YEAR, true);
        moDateDate.setDateSettings(miClient, SGuiUtils.getLabelName(jlDate.getText()), true);
        moDecDaysToPaid.setDecimalSettings(SGuiUtils.getLabelName(jlDaysToPaid.getText()), SGuiConsts.GUI_TYPE_DEC_QTY, true);
        moCurPayment.setCompoundFieldSettings(miClient);
        moCurPayment.getField().setDecimalSettings(SGuiUtils.getLabelName(jlTotalAmount.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moTextNotes.setTextSettings(SGuiUtils.getLabelName(jlTotalAmount.getText()), 255, 0);

        moFields.addField(moKeyEmployee);
        moFields.addField(moKeyBenefitType);
        moFields.addField(moIntBenefitYear);
        moFields.addField(moDateDate);
        moFields.addField(moDecDaysToPaid);
        moFields.addField(moCurPayment.getField());
        moFields.addField(moTextNotes);

        moFields.setFormButton(jbSave);
    }

    private void itemStateEmployee() {
        if (moKeyEmployee.getSelectedIndex() <= 0) {
            moEmployee = null;
            jsAnniversary.setEnabled(false);
            moIntBenefitYear.setEditable(false);
        }
        else {
            moEmployee = (SDbEmployee) miClient.getSession().readRegistry(SModConsts.HRSU_EMP, new int[] { moKeyEmployee.getValue()[0] });
            jsAnniversary.setEnabled(true);
            moIntBenefitYear.setEditable(true);
            actionStateChangeAnniversary();
        }
    }
    
    private void actionStateChangeAnniversary() {
        if (jsAnniversary.isEnabled()) {
            moIntBenefitYear.setValue(SLibTimeUtils.digestYear(SLibTimeUtils.addDate(moEmployee.getDateBenefits(), (Integer) jsAnniversary.getValue() - 1, 0, 0))[0]);
        }
        else {
            moIntBenefitYear.setValue(0);
        }
    }
    
    @Override
    public void addAllListeners() {
        moKeyEmployee.addItemListener(this);
        jsAnniversary.addChangeListener(this);
    }

    @Override
    public void removeAllListeners() {
        moKeyEmployee.removeItemListener(this);
        jsAnniversary.removeChangeListener(this);
    }

    @Override
    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeyEmployee, SModConsts.HRSU_EMP, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyBenefitType, SModConsts.HRSS_TP_BEN, SModConsts.HRS_BEN, null);
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        int idEmployee = SLibConsts.UNDEFINED;
        SDbPayrollReceiptEarningComplement earningComplement = null;
        moRegistry = (SDbPayrollReceiptEarning) registry;

        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        earningComplement = moRegistry.getChildEarningComplement();
        
        removeAllListeners();
        reloadCatalogues();

        idEmployee = moRegistry.getPkEmployeeId();

        if (moRegistry.isRegistryNew()) {
            moRegistry.initPrimaryKey();
            
            earningComplement = new SDbPayrollReceiptEarningComplement();
            earningComplement.setDate(miClient.getSession().getCurrentDate());
            
            moRegistry.setChildEarningComplement(earningComplement);
            jtfRegistryKey.setText("");
        }
        else {
            jtfRegistryKey.setText(SLibUtils.textKey(moRegistry.getPrimaryKey()));
        }

        moKeyEmployee.setValue(new int[] { idEmployee });
        moKeyBenefitType.setValue(new int[] { moRegistry.getFkBenefitTypeId() });
        jsAnniversary.setValue((Integer) moRegistry.getBenefitAniversary() == 0 ? (Integer) 1 : (Integer) moRegistry.getBenefitAniversary());
        moIntBenefitYear.setValue(moRegistry.getBenefitYear());
        moDateDate.setValue(earningComplement.getDate());
        moDecDaysToPaid.setValue(moRegistry.getUnitsAlleged());
        moCurPayment.getField().setValue(moRegistry.getAmount_r());
        moTextNotes.setValue(earningComplement.getNotes());

        setFormEditable(true);
        
        if (!moRegistry.isRegistryNew()) {
            moKeyEmployee.setEnabled(false);
        }
        itemStateEmployee();

        addAllListeners();
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        SDbPayrollReceiptEarning registry = moRegistry.clone();
        SDbEarning earning = SHrsUtils.getEarningByType(miClient, SModConsts.HRSS_TP_BEN, moKeyBenefitType.getValue()[0]);

        if (registry.isRegistryNew()) {}

        registry.setPkPayrollId(SLibConsts.UNDEFINED);
        registry.setPkEmployeeId(moKeyEmployee.getValue()[0]);
        registry.setUnitsAlleged(moDecDaysToPaid.getValue());
        registry.setUnits(moDecDaysToPaid.getValue());
        registry.setAmountUnitary(moCurPayment.getField().getValue());
        registry.setAmount_r(moCurPayment.getField().getValue());
        registry.setAutomatic(true);
        registry.setAlternativeTaxCalculation(earning.isAlternativeTaxCalculation());// XXX (jbarajas, 2016-04-06) articule 174 RLISR
        registry.setBenefitAniversary((Integer) jsAnniversary.getValue());
        registry.setBenefitYear(moIntBenefitYear.getValue());
        registry.setFkEarningTypeId(earning.getFkEarningTypeId());
        registry.setFkEarningId(earning.getPkEarningId());
        registry.setFkBenefitTypeId(earning.getFkBenefitTypeId());
        registry.setFkLoanTypeId_n(SLibConsts.UNDEFINED);
        registry.setFkLoanEmployeeId_n(SLibConsts.UNDEFINED);
        registry.setFkLoanLoanId_n(SLibConsts.UNDEFINED);
        
        // registry earning complement:
        
        registry.getChildEarningComplement().setDate(moDateDate.getValue());
        registry.getChildEarningComplement().setNotes(moTextNotes.getValue());

        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            if (moKeyBenefitType.getValue()[0] != SModSysConsts.HRSS_TP_BEN_VAC && moCurPayment.getField().getValue() == 0) {
                validation.setMessage(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + (SGuiUtils.getLabelName(jlTotalAmount)) + "'.");
                validation.setComponent(moCurPayment.getField().getComponent());
            }
        }
        
        return validation;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof SBeanFieldKey) {
            SBeanFieldKey field = (SBeanFieldKey) e.getSource();

            if (field == moKeyEmployee) {
                itemStateEmployee();
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() instanceof JSpinner) {
            JSpinner spinner = (JSpinner) e.getSource();

            if (spinner == jsAnniversary) {
                actionStateChangeAnniversary();
            }
        }
    }
}
