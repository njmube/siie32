/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * Created on 10/11/2009
 */

package erp.mmkt.form;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.lib.SLibConstants;
import erp.lib.form.SFormComponentItem;
import erp.lib.form.SFormField;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import erp.mmkt.data.SDataPriceListBizPartnerLink;
import erp.mod.SModSysConsts;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.AbstractAction;

/**
 *
 * @author Néstor Ávalos
 */
public class SFormPriceListBizPartnerLink extends javax.swing.JDialog implements erp.lib.form.SFormInterface, java.awt.event.ActionListener {

    private int mnFormType;
    private int mnFormResult;
    private int mnFormStatus;
    private boolean mbFirstTime;
    private boolean mbResetingForm;
    private java.util.Vector<erp.lib.form.SFormField> mvFields;
    private erp.client.SClientInterface miClient;

    private erp.mmkt.data.SDataPriceListBizPartnerLink moPriceListBizPartnerLink;
    private erp.lib.form.SFormField moFieldPkLinkTypeId;
    private erp.lib.form.SFormField moFieldPkDateStartId;
    private erp.lib.form.SFormField moFieldPercentage;
    private erp.lib.form.SFormField moFieldIsDeleted;
    private erp.lib.form.SFormField moFieldFkPriceListId;
    private erp.lib.form.SFormField moFieldFkDiscountApplicationTypeId;

    private int mnParamPkLinkId;
    private int mnParamBizPartnerCategory;

    /** Creates new form SFormElement */
    public SFormPriceListBizPartnerLink(erp.client.SClientInterface client) {
        super(client.getFrame(), true);
        miClient =  client;
        mnFormType = SDataConstants.MKT_PLIST_BP_LINK;

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

        jPanel1 = new javax.swing.JPanel();
        jbOK = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jlPkLinkTypeId = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jcbPkLinkTypeId = new javax.swing.JComboBox<SFormComponentItem>();
        jbPkLinkTypeId = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jlPkDateStartId = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jtfPkDateStartId = new javax.swing.JFormattedTextField();
        jbPkDateStartId = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jlFkPriceListId = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jcbFkPriceListId = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel20 = new javax.swing.JPanel();
        jbFkPriceListId = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jlFkDiscountApplicationTypeId = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jcbFkDiscountApplicationTypeId = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel23 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jlPercentage = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jtfPercentage = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jckIsDeleted = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de precios por cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 33));
        jPanel1.setLayout(new java.awt.FlowLayout(2));

        jbOK.setText("Aceptar");
        jbOK.setToolTipText("[Ctrl + Enter]");
        jbOK.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel1.add(jbOK);

        jbCancel.setText("Cancelar");
        jbCancel.setToolTipText("[Escape]");
        jPanel1.add(jbCancel);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel9.setLayout(new java.awt.GridLayout(6, 1, 5, 5));

        jPanel10.setLayout(new java.awt.BorderLayout());

        jlPkLinkTypeId.setForeground(java.awt.Color.blue);
        jlPkLinkTypeId.setText("Cliente: *");
        jlPkLinkTypeId.setPreferredSize(new java.awt.Dimension(120, 14));
        jPanel10.add(jlPkLinkTypeId, java.awt.BorderLayout.WEST);

        jPanel8.setLayout(new java.awt.BorderLayout(5, 5));

        jcbPkLinkTypeId.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel8.add(jcbPkLinkTypeId, java.awt.BorderLayout.CENTER);

        jbPkLinkTypeId.setText("...");
        jbPkLinkTypeId.setToolTipText("Seleccionar cliente");
        jbPkLinkTypeId.setFocusable(false);
        jbPkLinkTypeId.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel8.add(jbPkLinkTypeId, java.awt.BorderLayout.EAST);

        jPanel10.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jlPkDateStartId.setForeground(java.awt.Color.blue);
        jlPkDateStartId.setText("Fecha inicial vigencia: *");
        jlPkDateStartId.setPreferredSize(new java.awt.Dimension(120, 14));
        jPanel11.add(jlPkDateStartId, java.awt.BorderLayout.WEST);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

        jPanel16.setLayout(new java.awt.BorderLayout(5, 0));

        jtfPkDateStartId.setText("START DATE");
        jtfPkDateStartId.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel16.add(jtfPkDateStartId, java.awt.BorderLayout.CENTER);

        jbPkDateStartId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_cal.gif"))); // NOI18N
        jbPkDateStartId.setToolTipText("Seleccionar fecha inicial vigencia");
        jbPkDateStartId.setFocusable(false);
        jbPkDateStartId.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel16.add(jbPkDateStartId, java.awt.BorderLayout.EAST);

        jPanel4.add(jPanel16);
        jPanel4.add(jLabel1);
        jPanel4.add(jPanel17);

        jPanel6.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jlFkPriceListId.setText("Lista de precios: *");
        jlFkPriceListId.setPreferredSize(new java.awt.Dimension(120, 14));
        jPanel12.add(jlFkPriceListId, java.awt.BorderLayout.WEST);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel18.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        jPanel19.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel19.add(jcbFkPriceListId, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel19);

        jPanel20.setLayout(new java.awt.BorderLayout(5, 5));

        jbFkPriceListId.setText("...");
        jbFkPriceListId.setToolTipText("Seleccionar lista de precios");
        jbFkPriceListId.setFocusable(false);
        jbFkPriceListId.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel20.add(jbFkPriceListId, java.awt.BorderLayout.WEST);

        jPanel18.add(jPanel20);

        jPanel5.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel12.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel12);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jlFkDiscountApplicationTypeId.setText("Tipo de descuento: *");
        jlFkDiscountApplicationTypeId.setPreferredSize(new java.awt.Dimension(120, 14));
        jPanel13.add(jlFkDiscountApplicationTypeId, java.awt.BorderLayout.WEST);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel21.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        jPanel22.setLayout(new java.awt.BorderLayout());

        jcbFkDiscountApplicationTypeId.setPreferredSize(new java.awt.Dimension(56, 23));
        jcbFkDiscountApplicationTypeId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFkDiscountApplicationTypeIdItemStateChanged(evt);
            }
        });
        jPanel22.add(jcbFkDiscountApplicationTypeId, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());
        jPanel21.add(jPanel23);

        jPanel7.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel13.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel13);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jlPercentage.setText("Descuento: *");
        jlPercentage.setPreferredSize(new java.awt.Dimension(120, 14));
        jPanel14.add(jlPercentage, java.awt.BorderLayout.WEST);

        jPanel24.setLayout(new java.awt.GridLayout(1, 6));

        jtfPercentage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfPercentage.setText("PERCENTAGE");
        jtfPercentage.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel24.add(jtfPercentage);
        jPanel24.add(jPanel25);
        jPanel24.add(jPanel26);
        jPanel24.add(jPanel27);
        jPanel24.add(jPanel28);
        jPanel24.add(jPanel29);

        jPanel14.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel14);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jckIsDeleted.setText("Registro eliminado");
        jPanel15.add(jckIsDeleted, java.awt.BorderLayout.WEST);

        jPanel9.add(jPanel15);

        jPanel3.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-551)/2, (screenSize.height-261)/2, 551, 261);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void jcbFkDiscountApplicationTypeIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFkDiscountApplicationTypeIdItemStateChanged
        itemStateChangedFkDiscountApplicationTypeId();
    }//GEN-LAST:event_jcbFkDiscountApplicationTypeIdItemStateChanged

    private void initComponentsExtra() {
        mvFields = new Vector<SFormField>();

        mnParamPkLinkId = SLibConstants.UNDEFINED;
        mnParamBizPartnerCategory = SLibConstants.UNDEFINED;

        moFieldPkLinkTypeId = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbPkLinkTypeId, jlPkLinkTypeId);
        moFieldPkDateStartId = new SFormField(miClient, SLibConstants.DATA_TYPE_DATE, true, jtfPkDateStartId, jlPkDateStartId);
        moFieldPercentage = new SFormField(miClient, SLibConstants.DATA_TYPE_FLOAT, true, jtfPercentage, jlPercentage);
        moFieldPercentage.setDecimalFormat(miClient.getSessionXXX().getFormatters().getDecimalsPercentageFormat());
        moFieldPercentage.setIsPercent(true);
        moFieldPercentage.setFloatMin(0);
        moFieldPercentage.setMinInclusive(true);
        moFieldPercentage.setFloatMax(1);
        moFieldPercentage.setMaxInclusive(true);
        moFieldIsDeleted = new SFormField(miClient, SLibConstants.DATA_TYPE_BOOLEAN, false, jckIsDeleted);
        moFieldFkPriceListId = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbFkPriceListId, jlFkPriceListId);
        moFieldFkDiscountApplicationTypeId = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbFkDiscountApplicationTypeId, jlFkDiscountApplicationTypeId);

        mvFields.add(moFieldPkLinkTypeId);
        mvFields.add(moFieldPkDateStartId);
        mvFields.add(moFieldFkPriceListId);
        mvFields.add(moFieldFkDiscountApplicationTypeId);
        mvFields.add(moFieldPercentage);
        mvFields.add(moFieldIsDeleted);

        jbOK.addActionListener(this);
        jbCancel.addActionListener(this);
        jbPkLinkTypeId.addActionListener(this);
        jbPkDateStartId.addActionListener(this);
        jbFkPriceListId.addActionListener(this);

        AbstractAction actionOk = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionOk(); }
        };

        SFormUtilities.putActionMap(getRootPane(), actionOk, "ok", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);

        AbstractAction actionCancel = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionCancel(); }
        };

        SFormUtilities.putActionMap(getRootPane(), actionCancel, "cancel", KeyEvent.VK_ESCAPE, 0);
    }

    private void windowActivated() {
        if (mbFirstTime) {
            mbFirstTime = false;
            if (jcbPkLinkTypeId.isEnabled()) jcbPkLinkTypeId.requestFocus(); else jcbFkPriceListId.requestFocus();
        }
    }

    private void itemStateChangedFkDiscountApplicationTypeId() {
        if (jcbFkDiscountApplicationTypeId.getSelectedIndex() > 0 &&
                moFieldFkDiscountApplicationTypeId.getKeyAsIntArray()[0] == SDataConstantsSys.MKTS_TP_DISC_APP_NA) {
            jtfPercentage.setEnabled(false);
            jtfPercentage.setFocusable(false);
        } else {
            jtfPercentage.setEnabled(true);
            jtfPercentage.setFocusable(true);
        }
    }

    private void actionPkLinkTypeId() {

        miClient.pickOption(
            mnParamPkLinkId == SModSysConsts.BPSS_LINK_CUS_MKT_TP ? SDataConstants.MKTU_TP_CUS :
            mnParamPkLinkId == SModSysConsts.BPSS_LINK_BP_TP ? SDataConstants.BPSU_TP_BP :
            mnParamPkLinkId == SModSysConsts.BPSS_LINK_BP ? SDataConstants.BPSX_BP_CUS : SLibConstants.UNDEFINED, moFieldPkLinkTypeId, null);
    }

    private void actionSetPkDateStartId() {
        miClient.getGuiDatePickerXXX().formReset();
        miClient.getGuiDatePickerXXX().setDate(moFieldPkDateStartId.getDate());
        miClient.getGuiDatePickerXXX().setVisible(true);

        if (miClient.getGuiDatePickerXXX().getFormResult() == SLibConstants.FORM_RESULT_OK) {
            moFieldPkDateStartId.setDate(miClient.getGuiDatePickerXXX().getGuiDate());
            jtfPkDateStartId.requestFocus();
        }
    }

    private void actionFkPriceListId() {
        miClient.pickOption(SDataConstants.MKT_PLIST, moFieldFkPriceListId, mnParamBizPartnerCategory);
    }

    private void renderLabelLink() {
        switch(mnParamPkLinkId) {
            case SModSysConsts.BPSS_LINK_BP:
                jlPkLinkTypeId.setText(mnParamBizPartnerCategory == SDataConstantsSys.BPSS_CT_BP_CUS ?  "Cliente:*" : "Proveedor:*");
                this.setTitle("Lista de precios por " + (mnParamBizPartnerCategory == SDataConstantsSys.BPSS_CT_BP_CUS ?  "cliente" : "proveedor"));
                break;
            case SModSysConsts.BPSS_LINK_CUS_MKT_TP:
                jlPkLinkTypeId.setText("Tipo cliente:*");
                this.setTitle("Lista de precios por tipo de cliente");
                break;
            case SModSysConsts.BPSS_LINK_BP_TP:
                jlPkLinkTypeId.setText("Tipo asoc. negocios:*");
                this.setTitle("Lista de precios por tipo asoc. negocios");
                break;
            default:
        }
    }

    private void actionOk() {
        SFormValidation validation = formValidate();

        if (validation.getIsError()) {
            if (validation.getComponent() != null) {
                validation.getComponent().requestFocus();
            }
            if (validation.getMessage().length() > 0) {
                miClient.showMsgBoxWarning(validation.getMessage());
            }
        }
        else {
            mnFormResult = SLibConstants.FORM_RESULT_OK;
            setVisible(false);
        }
    }

    private void actionCancel() {
        mnFormResult = SLibConstants.FORM_RESULT_CANCEL;
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbFkPriceListId;
    private javax.swing.JButton jbOK;
    private javax.swing.JButton jbPkDateStartId;
    private javax.swing.JButton jbPkLinkTypeId;
    private javax.swing.JComboBox<SFormComponentItem> jcbFkDiscountApplicationTypeId;
    private javax.swing.JComboBox<SFormComponentItem> jcbFkPriceListId;
    private javax.swing.JComboBox<SFormComponentItem> jcbPkLinkTypeId;
    private javax.swing.JCheckBox jckIsDeleted;
    private javax.swing.JLabel jlFkDiscountApplicationTypeId;
    private javax.swing.JLabel jlFkPriceListId;
    private javax.swing.JLabel jlPercentage;
    private javax.swing.JLabel jlPkDateStartId;
    private javax.swing.JLabel jlPkLinkTypeId;
    private javax.swing.JTextField jtfPercentage;
    private javax.swing.JFormattedTextField jtfPkDateStartId;
    // End of variables declaration//GEN-END:variables

    @Override
    public void formClearRegistry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void formReset() {
        mnFormResult = SLibConstants.UNDEFINED;
        mnFormStatus = SLibConstants.UNDEFINED;
        mbFirstTime = true;

        moPriceListBizPartnerLink = null;

        for (int i = 0; i < mvFields.size(); i++) {
            ((erp.lib.form.SFormField) mvFields.get(i)).resetField();
        }

        moFieldPkDateStartId.setFieldValue(miClient.getSessionXXX().getWorkingDate());

        jcbPkLinkTypeId.setEnabled(true);
        jcbPkLinkTypeId.setFocusable(true);

        jbPkLinkTypeId.setEnabled(true);
        jbPkLinkTypeId.setFocusable(true);

        jtfPkDateStartId.setEnabled(true);
        jtfPkDateStartId.setFocusable(true);

        jbPkDateStartId.setEnabled(true);
        jbPkDateStartId.setFocusable(true);

        jtfPercentage.setEnabled(false);
        jtfPercentage.setFocusable(false);

        jckIsDeleted.setEnabled(false);
    }

    @Override
    public void formRefreshCatalogues() {
        SFormUtilities.populateComboBox(miClient, jcbPkLinkTypeId,
            mnParamPkLinkId == SModSysConsts.BPSS_LINK_CUS_MKT_TP ? SDataConstants.MKTU_TP_CUS :
            mnParamPkLinkId == SModSysConsts.BPSS_LINK_BP_TP ? SDataConstants.BPSU_TP_BP :
            mnParamPkLinkId == SModSysConsts.BPSS_LINK_BP ?
            (mnParamBizPartnerCategory == SDataConstantsSys.BPSS_CT_BP_CUS ?  SDataConstants.BPSX_BP_CUS : SDataConstants.BPSX_BP_SUP) :
            SLibConstants.UNDEFINED);
        SFormUtilities.populateComboBox(miClient, jcbFkPriceListId, SDataConstants.MKT_PLIST, mnParamBizPartnerCategory);
        SFormUtilities.populateComboBox(miClient, jcbFkDiscountApplicationTypeId, SDataConstants.MKTS_TP_DISC_APP);
    }

    @Override
    public erp.lib.form.SFormValidation formValidate() {
        SFormValidation validation = new SFormValidation();

        for (int i = 0; i < mvFields.size(); i++) {
            if (!((erp.lib.form.SFormField) mvFields.get(i)).validateField()) {
                validation.setIsError(true);
                validation.setComponent(((erp.lib.form.SFormField) mvFields.get(i)).getComponent());
                break;
            }
        }

        return validation;
    }

    @Override
    public void setFormStatus(int status) {
        mnFormStatus = status;
    }

    @Override
    public void setFormVisible(boolean visible) {
        setVisible(visible);
    }

    @Override
    public int getFormStatus() {
        return mnFormStatus;
    }

    @Override
    public int getFormResult() {
        return mnFormResult;
    }

    @Override
    public void setRegistry(erp.lib.data.SDataRegistry registry) {
        int i = 0;
        moPriceListBizPartnerLink = (SDataPriceListBizPartnerLink) registry;

        if (mnParamPkLinkId == SModSysConsts.BPSS_LINK_BP_TP) {
            moFieldPkLinkTypeId.setKey(new int[] { moPriceListBizPartnerLink.getPkReference1Id(), moPriceListBizPartnerLink.getPkReference2Id() });
        }
        else {
            moFieldPkLinkTypeId.setKey(new int[] { moPriceListBizPartnerLink.getPkReference1Id() });
        }

        moFieldPkDateStartId.setDate(moPriceListBizPartnerLink.getPkDateStartId());
        moFieldPercentage.setDouble(moPriceListBizPartnerLink.getDiscountPercentage());
        moFieldIsDeleted.setBoolean(moPriceListBizPartnerLink.getIsDeleted());
        moFieldFkPriceListId.setKey(new int[] { moPriceListBizPartnerLink.getFkPriceListId() });
        moFieldFkDiscountApplicationTypeId.setKey(new int[] { moPriceListBizPartnerLink.getFkDiscountApplicationTypeId() } );

        jcbPkLinkTypeId.setEnabled(false);
        jcbPkLinkTypeId.setFocusable(false);

        jbPkLinkTypeId.setEnabled(false);
        jbPkLinkTypeId.setFocusable(false);

        jtfPkDateStartId.setEnabled(false);
        jtfPkDateStartId.setFocusable(false);

        jbPkDateStartId.setEnabled(false);
        jbPkDateStartId.setFocusable(false);

        itemStateChangedFkDiscountApplicationTypeId();

        jckIsDeleted.setEnabled(true);
    }

    @Override
    public erp.lib.data.SDataRegistry getRegistry() {
        if (moPriceListBizPartnerLink == null) {

            moPriceListBizPartnerLink = new SDataPriceListBizPartnerLink();
            moPriceListBizPartnerLink.setPkLinkId(mnParamPkLinkId);
            moPriceListBizPartnerLink.setPkReference1Id(moFieldPkLinkTypeId.getKeyAsIntArray()[0]);

            if (mnParamPkLinkId == SModSysConsts.BPSS_LINK_BP_TP) {
                moPriceListBizPartnerLink.setPkReference2Id(moFieldPkLinkTypeId.getKeyAsIntArray()[1]);
            }

            moPriceListBizPartnerLink.setPkDateStartId(moFieldPkDateStartId.getDate());
            moPriceListBizPartnerLink.setFkUserNewId(miClient.getSession().getUser().getPkUserId());
        } else {

            moPriceListBizPartnerLink.setFkUserEditId(miClient.getSession().getUser().getPkUserId());
        }

        moPriceListBizPartnerLink.setIsDeleted(moFieldIsDeleted.getBoolean());
        moPriceListBizPartnerLink.setFkPriceListId(moFieldFkPriceListId.getKeyAsIntArray()[0]);
        moPriceListBizPartnerLink.setFkDiscountApplicationTypeId(moFieldFkDiscountApplicationTypeId.getKeyAsIntArray()[0]);
        if (moFieldFkDiscountApplicationTypeId.getKeyAsIntArray()[0] == SDataConstantsSys.MKTS_TP_DISC_APP_NA) {
            moPriceListBizPartnerLink.setDiscountPercentage(0d);
        } else {
            moPriceListBizPartnerLink.setDiscountPercentage(moFieldPercentage.getDouble());
        }

        return moPriceListBizPartnerLink;
    }

    @Override
    public void setValue(int type, Object value) {
         switch (type) {
            case SModSysConsts.BPSS_LINK_ALL: // All
            case SModSysConsts.BPSS_LINK_CUS_MKT_TP: // Type customer mkt
            case SModSysConsts.BPSS_LINK_BP_TP: // Type bizPartner
            case SModSysConsts.BPSS_LINK_BP: // BizPartner

                mnParamPkLinkId = (Integer) value;
                formRefreshCatalogues();
                renderLabelLink();
                break;
            case 5:

                mnParamBizPartnerCategory = (Integer) value;
                break;
            default:
        }
    }

    @Override
    public Object getValue(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public javax.swing.JLabel getTimeoutLabel() {
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();

            if (button == jbOK) {
                actionOk();
            }
            else if (button == jbCancel) {
                actionCancel();
            }
            else if (button == jbPkLinkTypeId) {
                actionPkLinkTypeId();
            }
            else if (button == jbPkDateStartId) {
                actionSetPkDateStartId();
            }
            else if (button == jbFkPriceListId) {
                actionFkPriceListId();
            }
        }
    }
}
