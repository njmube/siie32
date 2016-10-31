/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SPanelDpsFinder.java
 *
 * Created on 7/09/2010, 07:05:38 PM
 */

package erp.mtrn.form;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.data.SDataReadDescriptions;
import erp.data.SDataUtilities;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import erp.lib.form.SFormField;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import erp.mtrn.data.SDataDps;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.util.Vector;
import javax.swing.JTextField;

/**
 *
 * @author Sergio Flores
 */
public class SPanelDpsFinder extends javax.swing.JPanel implements java.awt.event.ActionListener, java.awt.event.FocusListener {

    private erp.client.SClientInterface miClient;
    private int mnFinderType;
    private java.lang.Object moExternalObject;
    private java.lang.reflect.Method moExternalMethod;

    private erp.mtrn.data.SDataDps moDps;
    private java.util.Vector<SFormField> mvFields;

    private erp.lib.form.SFormField moFieldSearchBizPartnerId;
    private erp.lib.form.SFormField moFieldSearchNumberDps;
    private erp.mtrn.form.SDialogPickerDps moDialogPickerDps;
    private erp.mtrn.form.SPanelDps moPanelDps;
    private int[] manParamDpsClassKey;
    private int mnOptionsBizPartnerType;
    private boolean mbIsBizPartnerRequired;

    /** Creates new form SPanelDpsFinder
     * @param client ERP Client interface.
     * @param finderType Finder type can be:
     * a) SDataConstants.TRNX_DPS_PAY_PEND
     * b) SDataConstants.TRNX_DPS_PEND_LINK
     * c) SDataConstants.TRNX_DPS_PEND_ADJ
     */
    public SPanelDpsFinder(erp.client.SClientInterface client, int finderType) {
        this(client, finderType, null, null);
    }

    /** Creates new form SPanelDpsFinder
     * @param client ERP Client interface.
     * @param finderType Finder type can be:
     * a) SDataConstants.TRNX_DPS_PAY_PEND
     * b) SDataConstants.TRNX_DPS_PEND_LINK
     * c) SDataConstants.TRNX_DPS_PEND_ADJ
     * @param externalObject Object that needs to be aware when a DPS is found.
     * @param externalMethod Method for external object member to take action when a DPS is found.
     */
    public SPanelDpsFinder(erp.client.SClientInterface client, int finderType, java.lang.Object externalObject, java.lang.reflect.Method externalMethod) {
        miClient = client;
        mnFinderType = finderType;
        moExternalObject = externalObject;
        moExternalMethod = externalMethod;
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

        jpDpsFinder = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlSearchDpsClass = new javax.swing.JLabel();
        jtfSearchDpsClass = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jlSearchBizPartnerId = new javax.swing.JLabel();
        jcbSearchBizPartnerId = new javax.swing.JComboBox();
        jbSearchBizPartnerId = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlSearchNumber = new javax.swing.JLabel();
        jtfSearchNumberSeries = new javax.swing.JTextField();
        jbSearchDps = new javax.swing.JButton();
        jbDeleteDps = new javax.swing.JButton();
        jlDummy = new javax.swing.JLabel();
        jckIsLocalCurrency = new javax.swing.JCheckBox();
        jlPanelDps = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jpDpsFinder.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros de búsqueda del documento:"));
        jpDpsFinder.setLayout(new java.awt.GridLayout(3, 1, 0, 1));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlSearchDpsClass.setText("Clase de documento:");
        jlSearchDpsClass.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel1.add(jlSearchDpsClass);

        jtfSearchDpsClass.setEditable(false);
        jtfSearchDpsClass.setText("DOCUMENT CLASS");
        jtfSearchDpsClass.setFocusable(false);
        jtfSearchDpsClass.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel1.add(jtfSearchDpsClass);

        jpDpsFinder.add(jPanel1);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlSearchBizPartnerId.setText("Asociado de negocios:");
        jlSearchBizPartnerId.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel3.add(jlSearchBizPartnerId);

        jcbSearchBizPartnerId.setMaximumRowCount(12);
        jcbSearchBizPartnerId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbSearchBizPartnerId.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel3.add(jcbSearchBizPartnerId);

        jbSearchBizPartnerId.setText("...");
        jbSearchBizPartnerId.setToolTipText("Buscar asociado de negocios");
        jbSearchBizPartnerId.setFocusable(false);
        jbSearchBizPartnerId.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel3.add(jbSearchBizPartnerId);

        jpDpsFinder.add(jPanel3);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlSearchNumber.setText("Serie y folio documento:");
        jlSearchNumber.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel2.add(jlSearchNumber);

        jtfSearchNumberSeries.setText("SERIES");
        jtfSearchNumberSeries.setToolTipText("Formato: Serie-Folio");
        jtfSearchNumberSeries.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel2.add(jtfSearchNumberSeries);

        jbSearchDps.setText("...");
        jbSearchDps.setToolTipText("Buscar documento");
        jbSearchDps.setFocusable(false);
        jbSearchDps.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel2.add(jbSearchDps);

        jbDeleteDps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_std_delete.gif"))); // NOI18N
        jbDeleteDps.setToolTipText("Limpiar");
        jbDeleteDps.setFocusable(false);
        jbDeleteDps.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel2.add(jbDeleteDps);

        jlDummy.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlDummy.setPreferredSize(new java.awt.Dimension(193, 23));
        jPanel2.add(jlDummy);

        jckIsLocalCurrency.setText("Convertir a moneda local");
        jPanel2.add(jckIsLocalCurrency);

        jpDpsFinder.add(jPanel2);

        add(jpDpsFinder, java.awt.BorderLayout.NORTH);

        jlPanelDps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlPanelDps.setText("[Panel de documento de compras-ventas]");
        jlPanelDps.setPreferredSize(new java.awt.Dimension(100, 200));
        add(jlPanelDps, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsExtra() {
        switch (mnFinderType) {
            case SDataConstants.TRNX_DPS_PAY_PEND:
            case SDataConstants.TRNX_DPS_PEND_LINK:
            case SDataConstants.TRNX_DPS_PEND_ADJ:
            case SDataConstants.TRNX_DPS_SHIP_PEND_LINK:    
                break;

            default:
                miClient.showMsgBoxWarning(SLibConstants.MSG_ERR_UTIL_UNKNOWN_OPTION);
        }

        moFieldSearchBizPartnerId = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbSearchBizPartnerId, jlSearchBizPartnerId);
        moFieldSearchBizPartnerId.setPickerButton(jbSearchBizPartnerId);
        moFieldSearchNumberDps = new SFormField(miClient, SLibConstants.DATA_TYPE_STRING, false, jtfSearchNumberSeries, jlSearchNumber);
        moFieldSearchNumberDps.setLengthMax(15);
        moFieldSearchNumberDps.setPickerButton(jbSearchDps);

        mvFields = new Vector<>();
        mvFields.add(moFieldSearchBizPartnerId);
        mvFields.add(moFieldSearchNumberDps);

        moDialogPickerDps = new SDialogPickerDps(miClient, mnFinderType);

        moPanelDps = new SPanelDps(miClient, "encontrado");
        remove(jlPanelDps);
        add(moPanelDps, BorderLayout.CENTER);

        jbSearchBizPartnerId.addActionListener(this);
        jbSearchDps.addActionListener(this);
        jbDeleteDps.addActionListener(this);
        jcbSearchBizPartnerId.addActionListener(this);

        jtfSearchNumberSeries.addFocusListener(this);
    }

    private void searchDps() {
        int[] key = null;
        String[] asNumberDps = null;
        String sNumberSeries = "";
        String sNumber = "";

        moDps = null;
        moPanelDps.setDps(null, null);

        try {
            if (moFieldSearchNumberDps.getString().length() > 0) {
                asNumberDps = SLibUtilities.textExplode(moFieldSearchNumberDps.getString(), "-");

                if (asNumberDps.length > 1) {
                    sNumberSeries = asNumberDps[0];
                    sNumber = asNumberDps[1];
                }
                else {
                    sNumber = asNumberDps[0];
                }

                if (mbIsBizPartnerRequired) {
                    if (jcbSearchBizPartnerId.getSelectedIndex() > 0) {
                        key = SDataUtilities.obtainDpsKeyForBizPartner(miClient, sNumberSeries, sNumber, manParamDpsClassKey, moFieldSearchBizPartnerId.getKeyAsIntArray());
                    }
                }
                else {
                    key = SDataUtilities.obtainDpsKey(miClient, sNumberSeries, sNumber, manParamDpsClassKey);
                }

                if (key != null) {
                    moDps = (SDataDps) SDataUtilities.readRegistry(miClient, SDataConstants.TRN_DPS, key, SLibConstants.EXEC_MODE_VERBOSE);
                    moPanelDps.setDps(moDps, null);

                    if (moExternalMethod != null) {
                        moExternalMethod.invoke(moExternalObject);
                    }
                }
            }
            updateCheckLocalCurrencyStatus();
        }
        catch (Exception e) {
            SLibUtilities.renderException(this, e);
        }
    }

    private void updateCheckLocalCurrencyStatus() {
        jckIsLocalCurrency.setSelected(false);

        if (moDps == null) {
            jckIsLocalCurrency.setEnabled(false);
        }
        else {
            if (!SLibUtilities.belongsTo(manParamDpsClassKey, new int[][] { SDataConstantsSys.TRNS_CL_DPS_PUR_DOC, SDataConstantsSys.TRNS_CL_DPS_SAL_DOC })) {
                jckIsLocalCurrency.setEnabled(moDps.getFkCurrencyId() != miClient.getSessionXXX().getParamsErp().getFkCurrencyId());
            }
        }
    }

    private void updateFormBizPartnerStatus() {
        if (!mbIsBizPartnerRequired) { 
            jlSearchBizPartnerId.setEnabled(false);
            jcbSearchBizPartnerId.setEnabled(false);
            jbSearchBizPartnerId.setEnabled(false);
            jcbSearchBizPartnerId.removeAllItems();
        }
        else {
            jlSearchBizPartnerId.setEnabled(true);
            jcbSearchBizPartnerId.setEnabled(true);
            jbSearchBizPartnerId.setEnabled(true);
        }
        SFormUtilities.populateComboBox(miClient, jcbSearchBizPartnerId, mnOptionsBizPartnerType);
    }

    private void actionSearchBizPartner() {
        if (mnOptionsBizPartnerType == SDataConstants.BPSX_BP_SUP) {
            miClient.pickOption(SDataConstants.BPSX_BP_SUP, moFieldSearchBizPartnerId, null);
        }
        else if (mnOptionsBizPartnerType == SDataConstants.BPSX_BP_CUS) {
            miClient.pickOption(SDataConstants.BPSX_BP_CUS, moFieldSearchBizPartnerId, null);
        }
    }
    
    private void actionSearchDps() {
        Object[] filterKey = null;

        moDps = null;

        switch (mnFinderType) {
            case SDataConstants.TRNX_DPS_PAY_PEND:
            case SDataConstants.TRNX_DPS_SHIP_PEND_LINK:    
                if (mbIsBizPartnerRequired && jcbSearchBizPartnerId.getSelectedIndex() > 0) {
                    filterKey = new Object[] { miClient.getSessionXXX().getWorkingYear(), manParamDpsClassKey, moFieldSearchBizPartnerId.getKeyAsIntArray() };
                }
                else {
                    filterKey = new Object[] { miClient.getSessionXXX().getWorkingYear(), manParamDpsClassKey };
                }
                break;

            case SDataConstants.TRNX_DPS_PEND_LINK:
            case SDataConstants.TRNX_DPS_PEND_ADJ:
                if (mbIsBizPartnerRequired && jcbSearchBizPartnerId.getSelectedIndex() > 0) {
                    filterKey = new Object[] { manParamDpsClassKey, moFieldSearchBizPartnerId.getKeyAsIntArray() };
                }
                else {
                    filterKey = new Object[] { manParamDpsClassKey };
                }
                break;

            default:
        }

        moDialogPickerDps.formReset();
        moDialogPickerDps.setFilterKey(filterKey);
        moDialogPickerDps.formRefreshOptionPane();
        moDialogPickerDps.setFormVisible(true);

        if (moDialogPickerDps.getFormResult() == SLibConstants.FORM_RESULT_OK) {
            moDps = (SDataDps) SDataUtilities.readRegistry(miClient, SDataConstants.TRN_DPS, moDialogPickerDps.getSelectedPrimaryKey(), SLibConstants.EXEC_MODE_VERBOSE);
            moPanelDps.setDps(moDps, null);

            if (mbIsBizPartnerRequired) {
                moFieldSearchBizPartnerId.setFieldValue(new int[] { moDps.getFkBizPartnerId_r() });
            }
            moFieldSearchNumberDps.setFieldValue(moDps.getNumberSeries() + (moDps.getNumberSeries().length() > 0 ? "-" : "") + moDps.getNumber());

            if (moExternalMethod != null) {
                try {
                    moExternalMethod.invoke(moExternalObject);
                }
                catch (Exception e) {
                    SLibUtilities.renderException(this, e);
                }
            }
            updateCheckLocalCurrencyStatus();
        }
    }

    private void actionRefreshDps() {
        if (moDps != null) {
            if (((int[]) moFieldSearchBizPartnerId.getFieldValue())[0] != moDps.getFkBizPartnerId_r()) {
                actionDeleteDps();
            }
        }    
    }
    
    private void actionDeleteDps() {
        moDps = null;
        moPanelDps.setDps(moDps, null);
        moFieldSearchNumberDps.setFieldValue("");

        moFieldSearchNumberDps.getComponent().requestFocus();

        if (moExternalMethod != null) {
            try {
                moExternalMethod.invoke(moExternalObject);
            }
            catch (Exception e) {
                SLibUtilities.renderException(this, e);
            }
        }
        updateCheckLocalCurrencyStatus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbDeleteDps;
    private javax.swing.JButton jbSearchBizPartnerId;
    private javax.swing.JButton jbSearchDps;
    private javax.swing.JComboBox jcbSearchBizPartnerId;
    private javax.swing.JCheckBox jckIsLocalCurrency;
    private javax.swing.JLabel jlDummy;
    private javax.swing.JLabel jlPanelDps;
    private javax.swing.JLabel jlSearchBizPartnerId;
    private javax.swing.JLabel jlSearchDpsClass;
    private javax.swing.JLabel jlSearchNumber;
    private javax.swing.JPanel jpDpsFinder;
    private javax.swing.JTextField jtfSearchDpsClass;
    private javax.swing.JTextField jtfSearchNumberSeries;
    // End of variables declaration//GEN-END:variables

    public void windowActivated() {
        if (jcbSearchBizPartnerId.isEnabled()) {
            jcbSearchBizPartnerId.requestFocus();
        }
        else {
            jtfSearchNumberSeries.requestFocus();
        }
    }

    public void resetPanel() {
        moDps = null;
        moPanelDps.setDps(moDps, null);
        manParamDpsClassKey = null;
        mnOptionsBizPartnerType = SLibConstants.UNDEFINED;
        mbIsBizPartnerRequired = false;
        updateFormBizPartnerStatus();
        updateCheckLocalCurrencyStatus();

        for (SFormField field : mvFields) {
            field.resetField();
        }

        jtfSearchDpsClass.setText("");
    }

    public erp.lib.form.SFormValidation validatePanel() {
        SFormValidation validation = new SFormValidation();

        for (int i = 0; i < mvFields.size(); i++) {
            if (!((erp.lib.form.SFormField) mvFields.get(i)).validateField()) {
                validation.setIsError(true);
                validation.setComponent(mvFields.get(i).getComponent());
                break;
            }
        }

        if (!validation.getIsError()) {
            if (moDps == null) {
                validation.setMessage("No se ha especificado un documento válido.");
                validation.setComponent(jtfSearchNumberSeries);
            }
            else if (moDps.getFkDpsStatusId() != SDataConstantsSys.TRNS_ST_DPS_EMITED) {
                validation.setMessage("El estatus del documento debe ser '" + SDataReadDescriptions.getCatalogueDescription(miClient, SDataConstants.TRNS_ST_DPS, new int[] { SDataConstantsSys.TRNS_ST_DPS_EMITED }) + "'.");
                validation.setComponent(jtfSearchNumberSeries);
            }
            else {
                if (mnFinderType == SDataConstants.TRNX_DPS_PEND_LINK && moDps.getIsLinked()) {
                    validation.setMessage("El documento ya está cerrado para vinculación.");
                    validation.setComponent(jtfSearchNumberSeries);
                }
            }
        }

        return validation;
    }

    public void setDpsClassKey(int[] key) {
        manParamDpsClassKey = key;

        jtfSearchDpsClass.setText(SDataReadDescriptions.getCatalogueDescription(miClient, SDataConstants.TRNS_CL_DPS, manParamDpsClassKey));
        jtfSearchDpsClass.setCaretPosition(0);

        if (SLibUtilities.compareKeys(manParamDpsClassKey, SDataConstantsSys.TRNS_CL_DPS_PUR_DOC)) {
            mnOptionsBizPartnerType = SDataConstants.BPSX_BP_SUP;
            mbIsBizPartnerRequired = true;
            updateFormBizPartnerStatus();
        }
        else if (SLibUtilities.compareKeys(manParamDpsClassKey, SDataConstantsSys.TRNS_CL_DPS_SAL_DOC)) {
                mnOptionsBizPartnerType = SDataConstants.BPSX_BP_CUS;
                mbIsBizPartnerRequired = true;
                updateFormBizPartnerStatus();
            }
            else {
                mnOptionsBizPartnerType = SLibConstants.UNDEFINED;
                mbIsBizPartnerRequired = false;
                updateFormBizPartnerStatus();
            }
    }
    
    public boolean getIsLocalCurrency() {
        return jckIsLocalCurrency.isSelected();
    }

    public erp.mtrn.data.SDataDps getDps() {
        return moDps;
    }

    public double[] getDpsBalance() {
        return moPanelDps.getDpsBalance();
    }

    public void requestFocusPanel() {
        if (jcbSearchBizPartnerId.isEnabled()) {
            jcbSearchBizPartnerId.requestFocus();
        }
        else {
            jtfSearchNumberSeries.requestFocus();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();

            if (button == jbSearchBizPartnerId) {
                actionSearchBizPartner();
            }
            else if (button == jbSearchDps) {
                actionSearchDps();
            }
            else if (button == jbDeleteDps) {
                actionDeleteDps();
            }
        }
        if (e.getSource() instanceof javax.swing.JComboBox) {
                javax.swing.JComboBox comboBox = (javax.swing.JComboBox) e.getSource();
            
                if (comboBox == jcbSearchBizPartnerId) {
                    actionRefreshDps();
                }
        }
    }
 
    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() instanceof JTextField) {
            JTextField textField = (JTextField) e.getSource();

            if (textField == jtfSearchNumberSeries) {
                searchDps();
            }
        }
    }

    public void setBizPartnerEnable(boolean enable) {
        jlSearchBizPartnerId.setEnabled(enable);
        jcbSearchBizPartnerId.setEnabled(enable);
        jbSearchBizPartnerId.setEnabled(enable);
    }
}
