/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.fin.form;

import erp.client.SClientInterface;
import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.data.SDataReadDescriptions;
import erp.data.SDataUtilities;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import erp.mfin.data.SDataRecord;
import erp.mfin.form.SDialogRecordPicker;
import erp.mod.SModConsts;
import erp.mod.fin.db.SAbpRegistry;
import erp.mod.fin.db.SBalanceExchangeDiff;
import erp.mod.hrs.db.SHrsConsts;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date; 
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sa.lib.SLibConsts;
import sa.lib.SLibTimeUtils;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFormDialog;

/**
 *
 * @author Juan Barajas, Sergio Flores
 */
public class SDialogUpdateExchangeBal extends SBeanFormDialog implements ActionListener, ItemListener{

    private erp.mfin.form.SDialogRecordPicker moDialogRecordPicker;
    private erp.mfin.data.SDataRecord moCurrentRecord;
    private Date mtDate;
    private HashMap<Integer, Object> moParamsMap;
    
    


    /**
     * Creates new form SDialogAbpEntry
     */
    public SDialogUpdateExchangeBal(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.HRS_EMP_LOG_HIRE, SLibConsts.UNDEFINED, title);
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
        jPanel10 = new javax.swing.JPanel();
        jlYear = new javax.swing.JLabel();
        moCalYear = new sa.lib.gui.bean.SBeanFieldInteger();
        jPanel12 = new javax.swing.JPanel();
        jlPeriod = new javax.swing.JLabel();
        moCalPeriod = new sa.lib.gui.bean.SBeanFieldInteger();
        jPanel13 = new javax.swing.JPanel();
        jlCurrency = new javax.swing.JLabel();
        moKeyCurrency = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel14 = new javax.swing.JPanel();
        jlExchangeRate = new javax.swing.JLabel();
        jtfExchangeRate = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jPanel11 = new javax.swing.JPanel();
        jlRecord = new javax.swing.JLabel();
        jtfRecordDate = new javax.swing.JTextField();
        jtfRecordBranch = new javax.swing.JTextField();
        jtfRecordBkc = new javax.swing.JTextField();
        jtfRecordNumber = new javax.swing.JTextField();
        jbPickRecord = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jPanel10.setMinimumSize(new java.awt.Dimension(211, 20));
        jPanel10.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlYear.setText("Año:*");
        jlYear.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel10.add(jlYear);
        jPanel10.add(moCalYear);

        jPanel2.add(jPanel10);

        jPanel12.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel12.setRequestFocusEnabled(false);
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPeriod.setText("Mes:*");
        jlPeriod.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel12.add(jlPeriod);
        jPanel12.add(moCalPeriod);

        jPanel2.add(jPanel12);

        jPanel13.setMinimumSize(new java.awt.Dimension(211, 25));
        jPanel13.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCurrency.setText("Moneda:*");
        jlCurrency.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel13.add(jlCurrency);
        jPanel13.add(moKeyCurrency);

        jPanel2.add(jPanel13);

        jPanel14.setMinimumSize(new java.awt.Dimension(211, 25));
        jPanel14.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlExchangeRate.setText("Tipo cambio:*");
        jlExchangeRate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlExchangeRate);

        jtfExchangeRate.setCompoundText("MXN");
        jPanel14.add(jtfExchangeRate);

        jPanel2.add(jPanel14);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlRecord.setText("Póliza contable:*");
        jlRecord.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jlRecord);

        jtfRecordDate.setEditable(false);
        jtfRecordDate.setText("01/01/2000");
        jtfRecordDate.setToolTipText("Fecha de la póliza contable");
        jtfRecordDate.setFocusable(false);
        jtfRecordDate.setPreferredSize(new java.awt.Dimension(65, 23));
        jPanel11.add(jtfRecordDate);

        jtfRecordBranch.setEditable(false);
        jtfRecordBranch.setText("BRA");
        jtfRecordBranch.setToolTipText("Sucursal de la empresa");
        jtfRecordBranch.setFocusable(false);
        jtfRecordBranch.setPreferredSize(new java.awt.Dimension(32, 23));
        jPanel11.add(jtfRecordBranch);

        jtfRecordBkc.setEditable(false);
        jtfRecordBkc.setText("BKC");
        jtfRecordBkc.setToolTipText("Centro contable");
        jtfRecordBkc.setFocusable(false);
        jtfRecordBkc.setPreferredSize(new java.awt.Dimension(32, 23));
        jPanel11.add(jtfRecordBkc);

        jtfRecordNumber.setEditable(false);
        jtfRecordNumber.setText("TP-000001");
        jtfRecordNumber.setToolTipText("Número de póliza contable");
        jtfRecordNumber.setFocusable(false);
        jtfRecordNumber.setPreferredSize(new java.awt.Dimension(63, 23));
        jPanel11.add(jtfRecordNumber);

        jbPickRecord.setText("...");
        jbPickRecord.setToolTipText("Seleccionar póliza contable");
        jbPickRecord.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel11.add(jbPickRecord);

        jPanel2.add(jPanel11);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbPickRecord;
    private javax.swing.JLabel jlCurrency;
    private javax.swing.JLabel jlExchangeRate;
    private javax.swing.JLabel jlPeriod;
    private javax.swing.JLabel jlRecord;
    private javax.swing.JLabel jlYear;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency jtfExchangeRate;
    private javax.swing.JTextField jtfRecordBkc;
    private javax.swing.JTextField jtfRecordBranch;
    private javax.swing.JTextField jtfRecordDate;
    private javax.swing.JTextField jtfRecordNumber;
    private sa.lib.gui.bean.SBeanFieldInteger moCalPeriod;
    private sa.lib.gui.bean.SBeanFieldInteger moCalYear;
    private sa.lib.gui.bean.SBeanFieldKey moKeyCurrency;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 480, 300);
        
        moDialogRecordPicker = new SDialogRecordPicker((SClientInterface) miClient, SDataConstants.FINX_REC_USER);
        
        moCalYear.setIntegerSettings(SGuiUtils.getLabelName(jlYear.getText()), SGuiConsts.GUI_TYPE_INT_CAL_YEAR, true);
        moCalYear.setMinInteger(2000);
        moCalYear.setMaxInteger(2100);
        
        moCalPeriod.setIntegerSettings(SGuiUtils.getLabelName(jlPeriod.getText()), SGuiConsts.GUI_TYPE_INT_CAL_MONTH, true);
        moCalPeriod.setMaxInteger(SHrsConsts.YEAR_MONTHS);
        jtfExchangeRate.setCompoundFieldSettings(miClient);


        jtfExchangeRate.getField().setDecimalSettings(SGuiUtils.getLabelName(jlExchangeRate.getText()), SGuiConsts.GUI_TYPE_DEC_AMT, true);
        jtfExchangeRate.setCurrencyKey(miClient.getSession().getSessionCustom().getLocalCurrencyKey());
        
        moKeyCurrency.setKeySettings(miClient, SGuiUtils.getLabelName(jlCurrency.getText()), true);

        moFields.addField(moCalYear);
        moFields.addField(moCalPeriod);
        moFields.addField(moKeyCurrency);
        moFields.addField(jtfExchangeRate.getField());
        reloadCatalogues();
        moFields.setFormButton(jbSave);
        
        renderRecord();
        reloadCatalogues();
        addAllListeners();

    }
    
    private void actionChangedCurrencyId() {
        double rate = 0;


        if (moKeyCurrency.getSelectedIndex() > 0) {
            mtDate = SLibTimeUtils.createDate(moCalYear.getValue(), moCalPeriod.getValue());
            mtDate = SLibTimeUtils.getEndOfMonth(mtDate);
            try {
                rate = SDataUtilities.obtainExchangeRate((SClientInterface) miClient, moKeyCurrency.getValue()[0], mtDate);
            }
            catch (Exception e) {
                SLibUtils.printException(this, e);
            }
            jtfExchangeRate.getField().setValue(rate);
        }
        else {
            jtfExchangeRate.getField().setValue(0d);
        }
    }

    private boolean readRecord(Object key) {
        moCurrentRecord = (SDataRecord) SDataUtilities.readRegistry((SClientInterface) miClient, SDataConstants.FIN_REC, key, SLibConstants.EXEC_MODE_VERBOSE);
        return true;
    }
    
    private void renderRecord() {
        if (moCurrentRecord == null) {
            jtfRecordDate.setText("");
            jtfRecordBkc.setText("");
            jtfRecordBranch.setText("");
            jtfRecordNumber.setText("");
        }
        else {
            jtfRecordDate.setText(((SClientInterface) miClient).getSessionXXX().getFormatters().getDateFormat().format(moCurrentRecord.getDate()));
            jtfRecordBkc.setText(SDataReadDescriptions.getCatalogueDescription((SClientInterface) miClient, SDataConstants.FIN_BKC, new int[] { moCurrentRecord.getPkBookkeepingCenterId() }, SLibConstants.DESCRIPTION_CODE));
            jtfRecordBranch.setText(SDataReadDescriptions.getCatalogueDescription((SClientInterface) miClient, SDataConstants.BPSU_BPB, new int[] { moCurrentRecord.getFkCompanyBranchId() }, SLibConstants.DESCRIPTION_CODE));
            jtfRecordNumber.setText(moCurrentRecord.getRecordNumber());
        }
    }
    
    

    
    public void actionPickRecord() {
        Object key = null;
        String message = "";
        mtDate = SLibTimeUtils.createDate(moCalYear.getValue(), moCalPeriod.getValue());
        mtDate = SLibTimeUtils.getEndOfMonth(mtDate);
        moDialogRecordPicker.formReset();
        moParamsMap = new HashMap<Integer, Object>();
        moParamsMap.put(SDataConstants.FINU_TP_REC, SDataConstantsSys.FINU_TP_REC_JOURNAL);
        try{
            moDialogRecordPicker.setFilterKey(mtDate);
            moDialogRecordPicker.setParams(moParamsMap);
            
         
            
            moDialogRecordPicker.formRefreshOptionPane();
            if (moCurrentRecord != null) {
                moDialogRecordPicker.setSelectedPrimaryKey(moCurrentRecord.getPrimaryKey());
            }
            moDialogRecordPicker.setFormVisible(true);
        }
        catch(Exception ex){
            SLibUtilities.renderException(this, ex);
        }
        if (moDialogRecordPicker.getFormResult() == SLibConstants.FORM_RESULT_OK) {
            key = moDialogRecordPicker.getSelectedPrimaryKey();

            // XXX set registry lock to accounting record

            if (readRecord(key)) {
                if (moCurrentRecord != null) {
                    if (moCurrentRecord.getIsSystem()) {
                        message = "No puede seleccionarse esta póliza contable porque es de sistema.";
                    }
                    else if (moCurrentRecord.getIsAudited()) {
                        message = "No puede seleccionarse esta póliza contable porque está auditada.";
                    }
                    else if (moCurrentRecord.getIsAuthorized()) {
                        message = "No puede seleccionarse esta póliza contable porque está autorizada.";
                    }
                    else if (!SDataUtilities.isPeriodOpen((SClientInterface) miClient, moCurrentRecord.getDate())) {
                        message = "No puede seleccionarse esta póliza contable porque su período contable correspondiente está cerrado.";
                    }

                    if (message.length() > 0) {
                        miClient.showMsgBoxWarning(message);
                        moCurrentRecord = null;
                    }
                    else {
                        renderRecord();
                    }
                }
            }
        }
    }
    
    
    @Override
    public void addAllListeners() {
        moKeyCurrency.addItemListener(this);
        jbPickRecord.addActionListener(this);
    }

    @Override
    public void removeAllListeners() {
        moKeyCurrency.removeItemListener(this);
    }

    @Override
    public void reloadCatalogues() {
         miClient.getSession().populateCatalogue(moKeyCurrency, SModConsts.CFGU_CUR, SLibConsts.UNDEFINED, null);
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
      
    }

    @Override
    public SAbpRegistry getRegistry() throws Exception {
        SAbpRegistry registry=null;


        return registry;
    }

    @Override
    public void actionSave() {
        SBalanceExchangeDiff sbe;
                
        if (SGuiUtils.computeValidation(miClient, validateForm()) && miClient.showMsgBoxConfirm("Se realizará la revaluación con los siguientes parametros:" + "\n- Fecha de corte: " + SLibUtils.DateFormatDate.format(mtDate) + "\n- Moneda: " + moKeyCurrency.getSelectedItem().getItem() + "\n- Tipo de cambio: " + jtfExchangeRate.getField().getValue() + "\n- Poliza: " + moCurrentRecord.getRecordPeriod() + "\n" + SGuiConsts.MSG_CNF_CONT) == JOptionPane.YES_OPTION) {
            sbe = new SBalanceExchangeDiff(miClient);
            sbe.setRecYear(moCalYear.getValue());
            sbe.setRecPeriod(moCalPeriod.getValue());
            sbe.setDate(mtDate);
            sbe.setCurrencyId(moKeyCurrency.getValue()[0]);
            sbe.setExchangeRate(jtfExchangeRate.getField().getValue());
            sbe.setRecord(moCurrentRecord);
            try {
                sbe.save();
                miClient.showMsgBoxInformation("El proceso ha terminado.");
                mnFormResult = SGuiConsts.FORM_RESULT_OK;
                dispose();
            }
            catch (Exception ex) {
                Logger.getLogger(SDialogUpdateExchangeBal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    

    @Override
    public SGuiValidation validateForm() {
       
        SGuiValidation validation = moFields.validateFields();
        if (validation.isValid()) {
            if (moCurrentRecord == null) {
                validation.setMessage(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + SGuiUtils.getLabelName(jlRecord.getText()) + "'.");
                validation.setComponent(jbPickRecord);
            }
            else if (moCurrentRecord.getPkYearId() != moCalYear.getValue()){
                validation.setMessage(SGuiConsts.ERR_MSG_FIELD_VAL_ + "'" + SGuiUtils.getLabelName(jlYear.getText()) + "' debe pertenecer al mismo periodo que el campo '" + SGuiUtils.getLabelName(jlRecord.getText() + "'."));
                validation.setComponent(jbPickRecord);
            }
            else if (moCurrentRecord.getPkPeriodId()!= moCalPeriod.getValue()){
                validation.setMessage(SGuiConsts.ERR_MSG_FIELD_VAL_ + "'" + SGuiUtils.getLabelName(jlPeriod.getText()) + "' debe pertenecer al mismo periodo que el campo '" + SGuiUtils.getLabelName(jlRecord.getText() + "'."));
                validation.setComponent(jbPickRecord);
            }
            else  if(moKeyCurrency.getValue()[0] == 1) {
                validation.setMessage("No se puede realizar revaluación con la moneda nacional.");
                validation.setComponent(moKeyCurrency);
            }
          
        }

        return validation;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof javax.swing.JComboBox && e.getStateChange() == ItemEvent.SELECTED) {
            JComboBox comboBox = (JComboBox)  e.getSource();

            if (comboBox == moKeyCurrency) {
                actionChangedCurrencyId();
            }
             
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (button == jbPickRecord) {
                actionPickRecord();
            }
        }
    }
}
