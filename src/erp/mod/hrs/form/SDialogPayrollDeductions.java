/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.SModSysConsts;
import erp.mod.hrs.db.SDbDeduction;
import erp.mod.hrs.db.SDbPayrollReceiptDeduction;
import erp.mod.hrs.db.SHrsPayrollReceipt;
import erp.mod.hrs.db.SHrsPayrollReceiptDeduction;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.grid.SGridColumnForm;
import sa.lib.grid.SGridConsts;
import sa.lib.grid.SGridPaneForm;
import sa.lib.grid.SGridPaneFormOwner;
import sa.lib.grid.SGridRow;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiItem;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFormDialog;

/**
 *
 * @author Juan Barajas
 */
public class SDialogPayrollDeductions extends SBeanFormDialog implements SGridPaneFormOwner, ItemListener, ActionListener, CellEditorListener, KeyListener {

    protected static final int COL_BAL = 1;
    protected static final int COL_APP = 4;
    
    protected ArrayList<SHrsPayrollReceipt> maReceipts;
    protected HashMap<Integer, SDbDeduction> moDeductions;
    protected SGridPaneForm moGridEmployeeRow;

    /**
     * Creates new form SDialogPayrollDeductions
     */
    public SDialogPayrollDeductions(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.HRSX_PAY_REC_DED, SLibConsts.UNDEFINED, title);
        initComponents();
        initComponentsCustom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jlDeduction = new javax.swing.JLabel();
        moKeyDeduction = new sa.lib.gui.bean.SBeanFieldKey();
        jpEmployee = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlValue = new javax.swing.JLabel();
        moComDeductionValue = new sa.lib.gui.bean.SBeanCompoundField();
        jbDeductionAdd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbClean = new javax.swing.JButton();
        jbCleanAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        jlDeduction.setText("Deducción:");
        jlDeduction.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel12.add(jlDeduction);

        moKeyDeduction.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel12.add(moKeyDeduction);

        jPanel1.add(jPanel12, java.awt.BorderLayout.NORTH);

        jpEmployee.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jlValue.setText("Valor:");
        jlValue.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel2.add(jlValue);

        moComDeductionValue.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel2.add(moComDeductionValue);

        jbDeductionAdd.setText("Agregar");
        jPanel2.add(jbDeductionAdd);

        jPanel4.add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbClean.setText("Limpiar");
        jbClean.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jbClean.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel3.add(jbClean);

        jbCleanAll.setText("Limpiar todo");
        jbCleanAll.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jbCleanAll.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel3.add(jbCleanAll);

        jPanel4.add(jPanel3, java.awt.BorderLayout.EAST);

        jpEmployee.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel1.add(jpEmployee, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbClean;
    private javax.swing.JButton jbCleanAll;
    private javax.swing.JButton jbDeductionAdd;
    private javax.swing.JLabel jlDeduction;
    private javax.swing.JLabel jlValue;
    private javax.swing.JPanel jpEmployee;
    private sa.lib.gui.bean.SBeanCompoundField moComDeductionValue;
    private sa.lib.gui.bean.SBeanFieldKey moKeyDeduction;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 560, 350);
        
        jbSave.setText("Aceptar");

        moKeyDeduction.setKeySettings(miClient, SGuiUtils.getLabelName(jlDeduction.getText()), false);
        moComDeductionValue.setCompoundFieldSettings(miClient);
        moComDeductionValue.getField().setDecimalSettings("Monto:", SGuiConsts.GUI_TYPE_DEC_QTY, false);
        moComDeductionValue.getField().setValue(0d);
        moComDeductionValue.setCompoundText("");
        
        moFields.addField(moKeyDeduction);
        
        moFields.setFormButton(jbSave);
        
        moGridEmployeeRow = new SGridPaneForm(miClient, SModConsts.HRSX_PAY_REC_DED, SLibConsts.UNDEFINED, "Empleados") {
            @Override
            public void initGrid() {
                setRowButtonsEnabled(false, false, false);
            }

            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                SGridColumnForm columnForm = null;
                ArrayList<SGridColumnForm> gridColumnsForm = new ArrayList<SGridColumnForm>();

                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_BPR_S, "Empleado"));
                columnForm = new SGridColumnForm(SGridConsts.COL_TYPE_DEC_QTY, "Valor", moGridEmployeeRow.getTable().getDefaultEditor(Double.class));
                columnForm.setEditable(true);
                gridColumnsForm.add(columnForm);
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_CODE_UNT, "Unidad"));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_QTY, "Monto $"));
                columnForm = new SGridColumnForm(SGridConsts.COL_TYPE_BOOL_S, "Pago", moGridEmployeeRow.getTable().getDefaultEditor(Boolean.class));
                columnForm.setEditable(true);
                gridColumnsForm.add(columnForm);
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_CAT_M, "Crédito/Préstamo"));
                
                moGridEmployeeRow.getTable().getDefaultEditor(Boolean.class).addCellEditorListener(SDialogPayrollDeductions.this);
                moGridEmployeeRow.getTable().getDefaultEditor(Double.class).addCellEditorListener(SDialogPayrollDeductions.this);
                
                return gridColumnsForm;
            }
        };

        moGridEmployeeRow.setForm(null);
        moGridEmployeeRow.setPaneFormOwner(this);
        jpEmployee.add(moGridEmployeeRow, BorderLayout.CENTER);
        //mvFormGrids.add(moGridAutomaticRow);

        reloadCatalogues();
        addAllListeners();
        
        enableFields(false);
    }
    
    private void enableFields(final boolean enable) {
        moComDeductionValue.getField().setEditable(enable);
        jbDeductionAdd.setEnabled(enable);
    }
    
    private void processEditingAppPayment() {
        moGridEmployeeRow.renderGridRows();
    }
    
    private SDbPayrollReceiptDeduction createReceipDeduction(SHrsPayrollReceipt payrollReceipt, SHrsPayrollReceiptDeduction row) {
        SDbPayrollReceiptDeduction receiptDeduction = null;
        
        receiptDeduction = new SDbPayrollReceiptDeduction();
        
        receiptDeduction.setPkPayrollId(payrollReceipt.getReceipt().getPkPayrollId());
        receiptDeduction.setPkEmployeeId(payrollReceipt.getHrsEmployee().getEmployee().getPkEmployeeId());
        receiptDeduction.setPkMoveId(row.getPkMoveId());
        receiptDeduction.setAutomatic(false);
        receiptDeduction.setAmountUnitary(row.getXtaValue());
        receiptDeduction.setAmount_r(row.getXtaAmount());
        receiptDeduction.setFkDeductionTypeId(row.getDeduction().getFkDeductionTypeId());
        receiptDeduction.setFkDeductionId(row.getDeduction().getPkDeductionId());
        receiptDeduction.setFkBenefitTypeId(row.getDeduction().getFkBenefitTypeId());
        
        return receiptDeduction;
    }
    
    private void initEmployee() {
        SHrsPayrollReceiptDeduction hrsReceiptDeductionRow = null;
        
        for (SGridRow row : moGridEmployeeRow.getModel().getGridRows()) { // read grid
            hrsReceiptDeductionRow = (SHrsPayrollReceiptDeduction) row;
            
            hrsReceiptDeductionRow.setXtaValue(0d);
            hrsReceiptDeductionRow.setXtaValue(0d);
            hrsReceiptDeductionRow.setPayment(false);
            hrsReceiptDeductionRow.getReceiptDeduction().setAmountUnitary(0d);
            hrsReceiptDeductionRow.computeDeduction();
                
            hrsReceiptDeductionRow.getReceiptDeduction().setFkLoanEmployeeId_n(SLibConsts.UNDEFINED);
            hrsReceiptDeductionRow.getReceiptDeduction().setFkLoanLoanId_n(SLibConsts.UNDEFINED);
            hrsReceiptDeductionRow.getReceiptDeduction().setFkLoanTypeId_n(SLibConsts.UNDEFINED);
        }
    }

    private void updateReceiptsDeductionRows(final boolean addAll) {
        boolean found = false;
        SHrsPayrollReceiptDeduction hrsReceiptDeductionRow = null;
        
        for (SGridRow row : moGridEmployeeRow.getModel().getGridRows()) { // read grid
            hrsReceiptDeductionRow = (SHrsPayrollReceiptDeduction) row;
            
            hrsReceiptDeductionRow.setDeduction(moDeductions.get(hrsReceiptDeductionRow.getRowPrimaryKey()[0]));
            
            /* Unnecessary upgrade can not change the loan
            if (hrsReceiptDeduction.getReceiptDeduction() != null && hrsReceiptDeduction.getReceiptDeduction().getFkLoanEmployeeId_n() != SLibConsts.UNDEFINED) {
                hrsReceiptDeduction.setXtaLoan(hrsReceiptDeduction.getHrsReceipt().getHrsEmployee().getLoanIdentificator(hrsReceiptDeduction.getReceiptDeduction().getFkLoanLoanId_n()).getLoanIdentificator());
            }
            */
            
            for (SHrsPayrollReceipt hrsReceipt : maReceipts) { // read receipt
                found = false;
                
                if (addAll) {
                    hrsReceiptDeductionRow.setXtaValue(moComDeductionValue.getField().getValue());
                }
                
                if (SLibUtils.compareKeys(new int[] { hrsReceipt.getHrsEmployee().getEmployee().getPkEmployeeId() }, new int[] { hrsReceiptDeductionRow.getHrsReceipt().getHrsEmployee().getEmployee().getPkEmployeeId() })) { // recibo del empleado en el grid
                    hrsReceiptDeductionRow.setHrsReceipt(hrsReceipt);

                    for (SHrsPayrollReceiptDeduction deductionRow : hrsReceipt.getHrsDeductions()) { // read array list ear/ded
                        found = true;

                        if (SLibUtils.compareKeys(deductionRow.getRowPrimaryKey(), hrsReceiptDeductionRow.getRowPrimaryKey())) {  // exists ear/ded
                            deductionRow.setXtaValue(hrsReceiptDeductionRow.getXtaValue());  // update value
                            deductionRow.setPayment(hrsReceiptDeductionRow.isPayment());
                            
                            if (addAll) {
                                deductionRow.getReceiptDeduction().setAmountUnitary(hrsReceiptDeductionRow.getXtaValue());
                                deductionRow.getReceiptDeduction().setAmount_r(hrsReceiptDeductionRow.getXtaValue());
                            }
                            
                            hrsReceipt.replaceDeduction(deductionRow.getPkMoveId(), hrsReceiptDeductionRow);
                            
                            if (!deductionRow.getReceiptDeduction().isAutomatic() && deductionRow.getXtaValue() == 0) { 
                                hrsReceipt.removeDeduction(deductionRow.getPkMoveId());
                            }
                            break;
                        }
                        else {
                            found = false;
                        }
                    }

                    if (!found) { // not exists
                        if (hrsReceiptDeductionRow.getXtaValue() != 0) {  // not is 0 o nulo
                            if (addAll) {
                                hrsReceiptDeductionRow.setReceiptDeduction(createReceipDeduction(hrsReceipt, hrsReceiptDeductionRow));
                            }
                            hrsReceipt.addDeduction(hrsReceiptDeductionRow); // add ear/ded to array list
                        }
                    }
                }
            }
        }
    }
    
    private void itemStateDeduction() {
        boolean found = false;
        SHrsPayrollReceiptDeduction hrsReceiptDeductionRow = null;
        Vector<SGridRow> rows = new Vector<SGridRow>();
        
        updateReceiptsDeductionRows(false);
        
        moGridEmployeeRow.getModel().clearGridRows();
        moGridEmployeeRow.getModel().clearGrid();
        
        if (moKeyDeduction.getValue()[0] > 0) { // read ear/ded
            //moComDeductionValue.setCompoundText((String) miClient.getSession().readField(SModConsts.HRSS_TP_EAR_COMP, new int[] { SModSysConsts.HRSS_TP_EAR_COMP_AMT }, SDbRegistry.FIELD_CODE)); XXX (jbarajas, 2016-04-20) new field for computation type
            moComDeductionValue.setCompoundText((String) miClient.getSession().readField(SModConsts.HRSS_TP_DED_COMP, new int[] { (int) moKeyDeduction.getSelectedItem().getComplement() }, SDbRegistry.FIELD_CODE));
            
            for (SHrsPayrollReceipt hrsReceipt : maReceipts) { // read receipt
                found = false;
                
                for (SHrsPayrollReceiptDeduction deduction : hrsReceipt.getHrsDeductions()) { // read array list ear/ded
                    if (SLibUtils.compareKeys(deduction.getHrsReceipt().getHrsEmployee().getEmployee().getPrimaryKey(), hrsReceipt.getHrsEmployee().getEmployee().getPrimaryKey())) {
                        if (SLibUtils.compareKeys(new int[] { deduction.getDeduction().getPkDeductionId() }, new int[] { moKeyDeduction.getValue()[0] })) {  // exists ear/ded
                            hrsReceiptDeductionRow = new SHrsPayrollReceiptDeduction();

                            hrsReceiptDeductionRow.setDeduction(deduction.getDeduction());
                            hrsReceiptDeductionRow.setHrsReceipt(hrsReceipt);
                            hrsReceiptDeductionRow.setReceiptDeduction(deduction.getReceiptDeduction());
                            hrsReceiptDeductionRow.setRowType(SHrsPayrollReceiptDeduction.BY_DED);
                            hrsReceiptDeductionRow.setPkMoveId(deduction.getPkMoveId());
                            hrsReceiptDeductionRow.setXtaEmployee(hrsReceipt.getHrsEmployee().getEmployee().getAuxEmployee());
                            hrsReceiptDeductionRow.setXtaValue(deduction.getReceiptDeduction().getAmountUnitary());
                            //hrsReceiptDeductionRow.setXtaUnit((String) miClient.getSession().readField(SModConsts.HRSS_TP_EAR_COMP, new int[] { SModSysConsts.HRSS_TP_EAR_COMP_AMT }, SDbRegistry.FIELD_CODE)); XXX (jbarajas, 2016-04-20) new field for computation type
                            hrsReceiptDeductionRow.setXtaUnit((String) miClient.getSession().readField(SModConsts.HRSS_TP_DED_COMP, new int[] { deduction.getDeduction().getFkDeductionComputationTypeId() }, SDbRegistry.FIELD_CODE));

                            if (deduction.getReceiptDeduction() != null && deduction.getReceiptDeduction().getFkLoanEmployeeId_n() != SLibConsts.UNDEFINED) {
                                hrsReceiptDeductionRow.setXtaLoan(deduction.getHrsReceipt().getHrsEmployee().getLoan(deduction.getReceiptDeduction().getFkLoanLoanId_n()).getLoanIdentificator());
                            }
                            rows.add(hrsReceiptDeductionRow);
                            found = true;
                        }
                    }
                }

                if (!found) { // not exists
                    if (moDeductions.get(moKeyDeduction.getValue()[0]).getFkLoanTypeId() == SModSysConsts.HRSS_TP_LOAN_NON) {  // not is of loan type
                        hrsReceiptDeductionRow = new SHrsPayrollReceiptDeduction();

                        hrsReceiptDeductionRow.setDeduction(moDeductions.get(moKeyDeduction.getValue()[0]));
                        hrsReceiptDeductionRow.setHrsReceipt(hrsReceipt);

                        hrsReceiptDeductionRow.setRowType(SHrsPayrollReceiptDeduction.BY_DED);
                        hrsReceiptDeductionRow.setPkMoveId(hrsReceipt.getHrsDeductions().size() + 1);
                        hrsReceiptDeductionRow.setXtaEmployee(hrsReceipt.getHrsEmployee().getEmployee().getAuxEmployee());
                        hrsReceiptDeductionRow.setXtaValue(0d);
                        //hrsReceiptDeductionRow.setXtaUnit((String) miClient.getSession().readField(SModConsts.HRSS_TP_EAR_COMP, new int[] { SModSysConsts.HRSS_TP_EAR_COMP_AMT }, SDbRegistry.FIELD_CODE)); XXX (jbarajas, 2016-04-20) new field for computation type
                        hrsReceiptDeductionRow.setXtaUnit((String) miClient.getSession().readField(SModConsts.HRSS_TP_DED_COMP, new int[] { moDeductions.get(moKeyDeduction.getValue()[0]).getFkDeductionComputationTypeId() }, SDbRegistry.FIELD_CODE));
                        hrsReceiptDeductionRow.setPayment(false);
                        hrsReceiptDeductionRow.setXtaLoan("");
                        hrsReceiptDeductionRow.setReceiptDeduction(createReceipDeduction(hrsReceipt, hrsReceiptDeductionRow));

                        rows.add(hrsReceiptDeductionRow);
                    }
                }
            }
        }
        enableFields(rows.size() > 0);
        
        moGridEmployeeRow.populateGrid(rows);
        moGridEmployeeRow.clearSortKeys();
        moGridEmployeeRow.setSelectedGridRow(0);
    }
    
    private void actionDeductionAdd() {
        if (moComDeductionValue.getField().getValue() <= 0) {
            miClient.showMsgBoxWarning(SGuiConsts.ERR_MSG_FIELD_DIF + "'" + SGuiUtils.getLabelName(jlValue) + "'.");
            moComDeductionValue.getField().getComponent().requestFocus();
        }
        else {
            updateReceiptsDeductionRows(true);
            itemStateDeduction();
            moComDeductionValue.getField().setValue(0d);            
        }
    }
    
    public void actionClean() {
        SHrsPayrollReceiptDeduction hrsReceiptDeductionRow = null;
        
        if (jbClean.isEnabled()) {
            if (moGridEmployeeRow.getTable().getSelectedRowCount() == 1) {
                SGridRow gridRow = moGridEmployeeRow.getSelectedGridRow();

                hrsReceiptDeductionRow = (SHrsPayrollReceiptDeduction) gridRow;
                
                hrsReceiptDeductionRow.setXtaValue(0d);
                hrsReceiptDeductionRow.setPayment(false);
                hrsReceiptDeductionRow.getReceiptDeduction().setAmountUnitary(0d);
                
                hrsReceiptDeductionRow.getReceiptDeduction().setFkLoanEmployeeId_n(SLibConsts.UNDEFINED);
                hrsReceiptDeductionRow.getReceiptDeduction().setFkLoanLoanId_n(SLibConsts.UNDEFINED);
                hrsReceiptDeductionRow.getReceiptDeduction().setFkLoanTypeId_n(SLibConsts.UNDEFINED);
                
                hrsReceiptDeductionRow.computeDeduction();
                
                moGridEmployeeRow.renderGridRows();
                moGridEmployeeRow.setSelectedGridRow(moGridEmployeeRow.getModel().getGridRows().indexOf(gridRow));
            }
        }
    }

    public void actionCleanAll() {
        if (jbCleanAll.isEnabled()) {
            if (moGridEmployeeRow.getTable().getRowCount() > 0) {
                if (miClient.showMsgBoxConfirm("¿Está seguro que desea limpiar todas las capturas?") == JOptionPane.YES_OPTION) {
                    initEmployee();

                    moGridEmployeeRow.renderGridRows();
                    moGridEmployeeRow.getTable().requestFocus();
                    moGridEmployeeRow.setSelectedGridRow(0);
                }
            }
        }
    }
    
    private void populateDeductions(ArrayList<SDbDeduction> deductions) {
        Vector<SGuiItem> items = new Vector<SGuiItem>();
        
        try {
            items.add(new SGuiItem(new int[] { 0 }, "- Deducción -"));

            for (SDbDeduction deduction : deductions) {
                items.add(new SGuiItem(deduction.getPrimaryKey(), (deduction.getCode() + " - " + deduction.getName()), deduction.getFkDeductionComputationTypeId()));
            }
            
            moKeyDeduction.removeAllItems();
            for (SGuiItem item : items) {
                moKeyDeduction.addItem(item);
            }
        }
        catch (Exception e) {
            SLibUtils.showException(this, e);
        }
        
    }
    
    @Override
    public void addAllListeners() {
        moKeyDeduction.addItemListener(this);
        moComDeductionValue.getField().getComponent().addKeyListener(this);
        jbDeductionAdd.addActionListener(this);
        jbClean.addActionListener(this);
        jbCleanAll.addActionListener(this);
    }

    @Override
    public void removeAllListeners() {
        moKeyDeduction.removeItemListener(this);
        moComDeductionValue.getField().getComponent().removeKeyListener(this);
        jbDeductionAdd.removeActionListener(this);
        jbClean.removeActionListener(this);
        jbCleanAll.removeActionListener(this);
    }

    @Override
    public void reloadCatalogues() {
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
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
    public void setValue(final int type, final Object value) {
        try {
            switch (type) {
                case SModConsts.HRS_PAY_RCP:
                    maReceipts = (ArrayList<SHrsPayrollReceipt>) value;
                    break;
                case SModConsts.HRS_DED:
                    moDeductions = new HashMap<Integer, SDbDeduction>();
                    populateDeductions((ArrayList<SDbDeduction>) value);

                    for (SDbDeduction ded : (ArrayList<SDbDeduction>) value) {
                        moDeductions.put(ded.getPkDeductionId(), ded);
                    }
                    break;
                default:
                    break;
            }
        }
        catch (Exception e ) {
            SLibUtils.printException(this, e);
        }
    }

    @Override
    public Object getValue(final int type) {
        Object value = null;
        
        switch (type) {
            case SModConsts.HRS_PAY_RCP:
                value = maReceipts;
                break;
            default:
                break;
        }

        return value;
    }
    
    @Override
    public void actionSave() {
        updateReceiptsDeductionRows(false);
        super.actionSave();
    }

    @Override
    public void notifyRowNew(int gridType, int gridSubtype, int row, SGridRow gridRow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void notifyRowEdit(int gridType, int gridSubtype, int row, SGridRow gridRow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void notifyRowDelete(int gridType, int gridSubtype, int row, SGridRow gridRow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JComboBox && e.getStateChange() == ItemEvent.SELECTED) {
            JComboBox comboBox = (JComboBox)  e.getSource();

            if (comboBox == moKeyDeduction) {
                itemStateDeduction();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            if (button == jbClean) {
                actionClean();
            }
            else if (button == jbCleanAll) {
                actionCleanAll();
            }
            else if (button == jbDeductionAdd) {
                actionDeductionAdd();
            }
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        switch (moGridEmployeeRow.getTable().getSelectedColumn()) {
            case COL_BAL:
            case COL_APP:
                processEditingAppPayment();
                break;
            default:
                break;
        }
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (evt.getSource() instanceof JTextField) {
            JTextField textField = (JTextField) evt.getSource();

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                if (textField == moComDeductionValue.getField().getComponent()) {
                    jbDeductionAdd.requestFocus();
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
