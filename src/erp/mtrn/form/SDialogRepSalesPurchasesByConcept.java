/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SDialogRepSalesPurchasesByConcept.java
 *
 * Created on 5/06/2010, 11:09:39 AM
 */

package erp.mtrn.form;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.data.SDataUtilities;
import erp.lib.SLibConstants;
import erp.lib.SLibTimeUtilities;
import erp.lib.SLibUtilities;
import erp.lib.form.SFormComponentItem;
import erp.lib.form.SFormField;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.Vector;
import javax.swing.AbstractAction;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author Alfonso Flores
 */
public class SDialogRepSalesPurchasesByConcept extends javax.swing.JDialog implements erp.lib.form.SFormInterface, java.awt.event.ActionListener {

    private int mnFormType;
    private int mnFormResult;
    private int mnFormStatus;
    private boolean mbFirstTime;
    private boolean mbResetingForm;
    private java.util.Vector<erp.lib.form.SFormField> mvFields;
    private erp.client.SClientInterface miClient;

    private erp.lib.form.SFormField moFieldDateInitial;
    private erp.lib.form.SFormField moFieldDateEnd;
    private erp.lib.form.SFormField moFieldConcept;
    private erp.lib.form.SFormField moFieldCrossWith;
    private erp.lib.form.SFormField moFieldCompanyBranch;
    private erp.lib.form.SFormField moFieldTaxBase;

    private boolean mbParamIsSupplier;
    private boolean mbResetingComboBixCrossWith;

    /** Creates new form SDialogRepSalesPurchasesByConcept */
    public SDialogRepSalesPurchasesByConcept(erp.client.SClientInterface client) {
        super(client.getFrame(), true);
        miClient =  client;

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

        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlDateInitial = new javax.swing.JLabel();
        jftDateInitial = new javax.swing.JFormattedTextField();
        jbDateInitial = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jlDateEnd = new javax.swing.JLabel();
        jftDateEnd = new javax.swing.JFormattedTextField();
        jbDateEnd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jlConcept = new javax.swing.JLabel();
        jcbConcept = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel7 = new javax.swing.JPanel();
        jlCrossWith = new javax.swing.JLabel();
        jcbCrossWith = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel8 = new javax.swing.JPanel();
        jlCompanyBranch = new javax.swing.JLabel();
        jcbCompanyBranch = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel9 = new javax.swing.JPanel();
        jlTaxBase = new javax.swing.JLabel();
        jcbTaxBase = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jckWithoutRelatedParty = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jbPrint = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de compras netas por concepto");
        setPreferredSize(new java.awt.Dimension(480, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración del reporte:"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Período:"));
        jPanel10.setPreferredSize(new java.awt.Dimension(100, 77));
        jPanel10.setLayout(new java.awt.GridLayout(2, 1, 0, 1));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateInitial.setText("Fecha inicial: *");
        jlDateInitial.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlDateInitial);

        jftDateInitial.setText("dd/mm/yyyy");
        jftDateInitial.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel4.add(jftDateInitial);

        jbDateInitial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_day.gif"))); // NOI18N
        jbDateInitial.setToolTipText("Seleccionar fecha inicial");
        jbDateInitial.setFocusable(false);
        jbDateInitial.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel4.add(jbDateInitial);

        jPanel10.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateEnd.setText("Fecha final: *");
        jlDateEnd.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jlDateEnd);

        jftDateEnd.setText("dd/mm/yyyy");
        jftDateEnd.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel5.add(jftDateEnd);

        jbDateEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_day.gif"))); // NOI18N
        jbDateEnd.setToolTipText("Seleccionar fecha final");
        jbDateEnd.setFocusable(false);
        jbDateEnd.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel5.add(jbDateEnd);

        jPanel10.add(jPanel5);

        jPanel2.add(jPanel10, java.awt.BorderLayout.NORTH);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros del reporte:"));
        jPanel3.setLayout(new java.awt.GridLayout(5, 1, 0, 1));

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlConcept.setText("Concepto:");
        jlConcept.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel6.add(jlConcept);

        jcbConcept.setPreferredSize(new java.awt.Dimension(250, 23));
        jcbConcept.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbConceptItemStateChanged(evt);
            }
        });
        jPanel6.add(jcbConcept);

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCrossWith.setText("Cruce con:");
        jlCrossWith.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel7.add(jlCrossWith);

        jcbCrossWith.setPreferredSize(new java.awt.Dimension(250, 23));
        jcbCrossWith.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCrossWithItemStateChanged(evt);
            }
        });
        jPanel7.add(jcbCrossWith);

        jPanel3.add(jPanel7);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCompanyBranch.setText("Sucursal:");
        jlCompanyBranch.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jlCompanyBranch);

        jcbCompanyBranch.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel8.add(jcbCompanyBranch);

        jPanel3.add(jPanel8);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlTaxBase.setText("Impuesto básico: *");
        jlTaxBase.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel9.add(jlTaxBase);

        jcbTaxBase.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel9.add(jcbTaxBase);

        jPanel3.add(jPanel9);

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));

        jLabel1.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel12.add(jLabel1);

        jckWithoutRelatedParty.setText("Sin partes relacionadas");
        jPanel12.add(jckWithoutRelatedParty);

        jPanel3.add(jPanel12);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(392, 33));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbPrint.setText("Imprimir");
        jbPrint.setToolTipText("[Ctrl + Enter]");
        jbPrint.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel1.add(jbPrint);

        jbExit.setText("Cerrar");
        jbExit.setToolTipText("[Escape]");
        jbExit.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel1.add(jbExit);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(496, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void jcbConceptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbConceptItemStateChanged
        if (!mbResetingForm) {
            itemStateChangedConcept();
        }
    }//GEN-LAST:event_jcbConceptItemStateChanged

    private void jcbCrossWithItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCrossWithItemStateChanged
        if (!mbResetingForm) {
            itemStateChangedCrossWith();
        }
    }//GEN-LAST:event_jcbCrossWithItemStateChanged

    private void initComponentsExtra() {
        mvFields = new Vector<SFormField>();

        moFieldDateInitial = new SFormField(miClient, SLibConstants.DATA_TYPE_DATE, true, jftDateInitial, jlDateInitial);
        moFieldDateInitial.setPickerButton(jbDateInitial);
        moFieldDateEnd = new SFormField(miClient, SLibConstants.DATA_TYPE_DATE, true, jftDateEnd, jlDateEnd);
        moFieldDateEnd.setPickerButton(jbDateEnd);
        moFieldConcept = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbConcept, jlConcept);
        moFieldCrossWith = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbCrossWith, jlCrossWith);
        moFieldCompanyBranch = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbCompanyBranch, jlCompanyBranch);
        moFieldTaxBase = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbTaxBase, jlTaxBase);

        mvFields.add(moFieldDateInitial);
        mvFields.add(moFieldDateEnd);
        mvFields.add(moFieldConcept);
        mvFields.add(moFieldCrossWith);
        mvFields.add(moFieldCompanyBranch);
        mvFields.add(moFieldTaxBase);

        jbPrint.addActionListener(this);
        jbExit.addActionListener(this);
        jbDateInitial.addActionListener(this);
        jbDateEnd.addActionListener(this);

        AbstractAction actionOk = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionPrint(); }
        };

        SFormUtilities.putActionMap(getRootPane(), actionOk, "print", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);

        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionClose(); }
        };

        SFormUtilities.putActionMap(getRootPane(), action, "exit", KeyEvent.VK_ESCAPE, 0);

        setModalityType(ModalityType.MODELESS);
    }

    private void windowActivated() {
        if (mbFirstTime) {
            mbFirstTime = false;
            if (mbParamIsSupplier) {
                setTitle("Reporte de compras netas por concepto");
            }
            else {
                setTitle("Reporte de ventas netas por concepto");
            }
            jftDateInitial.requestFocus();
        }
    }

    private void actionPrint() {
        Cursor cursor = getCursor();
        SFormValidation validation = formValidate();
        Map<String, Object> map = null;
        JasperPrint jasperPrint = null;
        JasperViewer jasperViewer = null;

        if (validation.getIsError()) {
            if (validation.getComponent() != null) {
                validation.getComponent().requestFocus();
            }
            if (validation.getMessage().length() > 0) {
                miClient.showMsgBoxWarning(validation.getMessage());
            }
        }
        else {
            try {
                setCursor(new Cursor(Cursor.WAIT_CURSOR));

                map = miClient.createReportParams();
                map.put("tDtInitial", moFieldDateInitial.getDate());
                map.put("tDtEnd", moFieldDateEnd.getDate());
                map.put("sCompanyBranch", moFieldCompanyBranch.getKeyAsIntArray()[0] == 0 ? "(TODAS)" : jcbCompanyBranch.getSelectedItem().toString());
                map.put("nFidCtDps", mbParamIsSupplier ? SDataConstantsSys.TRNU_TP_DPS_PUR_INV[0] : SDataConstantsSys.TRNU_TP_DPS_SAL_INV[0]);
                map.put("nFidClDps", mbParamIsSupplier ? SDataConstantsSys.TRNU_TP_DPS_PUR_INV[1] : SDataConstantsSys.TRNU_TP_DPS_SAL_INV[1]);
                map.put("nFidTpDps", mbParamIsSupplier ? SDataConstantsSys.TRNU_TP_DPS_PUR_INV[2] : SDataConstantsSys.TRNU_TP_DPS_SAL_INV[2]);
                map.put("nFidStDps", SDataConstantsSys.TRNS_ST_DPS_EMITED);
                map.put("nFidStDpsVal", SDataConstantsSys.TRNS_ST_DPS_VAL_EFF);
                map.put("sSqlWhereCompanyBranch", moFieldCompanyBranch.getKeyAsIntArray()[0] == 0 ? "" : " AND doc.fid_cob = " + moFieldCompanyBranch.getKeyAsIntArray()[0]);
                map.put("sSqlWhereCompanyBranchAdjRet", moFieldCompanyBranch.getKeyAsIntArray()[0] == 0 ? "" : " AND r.fid_cob = " + moFieldCompanyBranch.getKeyAsIntArray()[0]);
                map.put("sSqlWhereCompanyBranchAdjDis", moFieldCompanyBranch.getKeyAsIntArray()[0] == 0 ? "" : " AND d.fid_cob = " + moFieldCompanyBranch.getKeyAsIntArray()[0]);
                map.put("sSqlWhereWithoutRelatedParty", jckWithoutRelatedParty.isSelected() ? " AND bp.b_att_rel_pty = 0 " : "");
                map.put("sSqlGroupBy", (String) createQuerySentenceValues()[0]);
                map.put("sSqlOrderBy", (String) createQuerySentenceValues()[1]);
                map.put("sTitle", mbParamIsSupplier ? "REPORTE DE COMPRAS NETAS" : "REPORTE DE VENTAS NETAS");
                map.put("sDetailConcept", (String) createQuerySentenceValues()[2]);
                map.put("sLocalCurrency", miClient.getSessionXXX().getParamsErp().getDbmsDataCurrency().getCurrency());
                map.put("sFilter", (String) createQuerySentenceValues()[3]);
                map.put("nTpGroup", (Integer) createQuerySentenceValues()[5]);
                map.put("nTpDetail", (Integer) createQuerySentenceValues()[4]);
                map.put("bShowGroup", (Boolean) createQuerySentenceValues()[6]);
                map.put("nFidCtDpsAdj", mbParamIsSupplier ? SDataConstantsSys.TRNU_TP_DPS_PUR_CN[0] : SDataConstantsSys.TRNU_TP_DPS_SAL_CN[0]);
                map.put("nFidClDpsAdj", mbParamIsSupplier ? SDataConstantsSys.TRNU_TP_DPS_PUR_CN[1] : SDataConstantsSys.TRNU_TP_DPS_SAL_CN[1]);
                map.put("nFidTpDpsAdj", mbParamIsSupplier ? SDataConstantsSys.TRNU_TP_DPS_PUR_CN[2] : SDataConstantsSys.TRNU_TP_DPS_SAL_CN[2]);
                map.put("nFidTpAdjRet", SDataConstantsSys.TRNS_TP_DPS_ADJ_RET);
                map.put("nFidTpAdjDis", SDataConstantsSys.TRNS_TP_DPS_ADJ_DISC);
                map.put("nTaxBase", jcbTaxBase.isEnabled() ? moFieldTaxBase.getKeyAsIntArray()[0] : 0);

                jasperPrint = SDataUtilities.fillReport(miClient, SDataConstantsSys.REP_TRN_PS_CON, map);
                jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setTitle("Reporte de " + (mbParamIsSupplier ? "compras " : "ventas") + " netas por concepto");
                jasperViewer.setVisible(true);
            }
            catch(Exception e) {
                SLibUtilities.renderException(this, e);
            }
            finally {
                setCursor(cursor);
            }
        }
    }

    private void actionClose() {
        mnFormResult = SLibConstants.FORM_RESULT_CANCEL;
        setVisible(false);
    }

    private void actionDateInitial() {
        miClient.getGuiDatePickerXXX().formReset();
        miClient.getGuiDatePickerXXX().setDate(moFieldDateInitial.getDate());
        miClient.getGuiDatePickerXXX().setVisible(true);

        if (miClient.getGuiDatePickerXXX().getFormResult() == SLibConstants.FORM_RESULT_OK) {
            moFieldDateInitial.setFieldValue(miClient.getGuiDatePickerXXX().getGuiDate());
            jftDateInitial.requestFocus();
        }
    }

    private void actionDateEnd() {
        miClient.getGuiDatePickerXXX().formReset();
        miClient.getGuiDatePickerXXX().setDate(moFieldDateEnd.getDate());
        miClient.getGuiDatePickerXXX().setVisible(true);

        if (miClient.getGuiDatePickerXXX().getFormResult() == SLibConstants.FORM_RESULT_OK) {
            moFieldDateEnd.setFieldValue(miClient.getGuiDatePickerXXX().getGuiDate());
            jftDateEnd.requestFocus();
        }
    }

    private void populateComboBoxConcept() {
        SFormComponentItem companyBranch = new SFormComponentItem(new int[] { 1 }, "Sucursal de la empresa");
        SFormComponentItem cashCredit = new SFormComponentItem(new int[] { 2 },  "Contado/Crédito");
        SFormComponentItem nationalForeigner = new SFormComponentItem(new int[] { 3 },  "Nacional/Extranjero");
        SFormComponentItem tax = new SFormComponentItem(new int[] { 4 },  "Impuesto");

        jcbConcept.removeAllItems();
        jcbConcept.addItem(companyBranch);
        jcbConcept.addItem(cashCredit);
        jcbConcept.addItem(nationalForeigner);
        jcbConcept.addItem(tax);

        moFieldConcept.setFieldValue(new int[] { 1 });
        populateComboBoxCrossWith();
    }

    private void populateComboBoxCrossWith() {
        SFormComponentItem companyBranch = new SFormComponentItem(new int[] { 1 }, "Sucursal de la empresa");
        SFormComponentItem cashCredit = new SFormComponentItem(new int[] { 2 },  "Contado/Crédito");
        SFormComponentItem nationalForeigner = new SFormComponentItem(new int[] { 3 },  "Nacional/Extranjero");
        SFormComponentItem tax = new SFormComponentItem(new int[] { 4 },  "Impuesto");

        mbResetingComboBixCrossWith = true;
        jcbCrossWith.removeAllItems();
        jcbCrossWith.addItem(new SFormComponentItem(new int[] { 0 }, "(Seleccionar una opción)"));

        if (moFieldConcept.getKeyAsIntArray()[0] == 1) {
            jcbCrossWith.addItem(cashCredit);
            jcbCrossWith.addItem(nationalForeigner);
            jcbCrossWith.addItem(tax);
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 2) {
            jcbCrossWith.addItem(companyBranch);
            jcbCrossWith.addItem(nationalForeigner);
            jcbCrossWith.addItem(tax);
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 3) {
            jcbCrossWith.addItem(companyBranch);
            jcbCrossWith.addItem(cashCredit);
            jcbCrossWith.addItem(tax);
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 4) {
            jcbCrossWith.addItem(companyBranch);
            jcbCrossWith.addItem(cashCredit);
            jcbCrossWith.addItem(nationalForeigner);
        }

        mbResetingComboBixCrossWith = false;
    }

    private java.lang.Object[] createQuerySentenceValues() {
        String orderBy = "";
        String groupBy = "";
        String detailColumn = "";
        String filter = "";
        int tpDetail = 0;
        int tpGroup = 0;
        boolean showGroup = false;

        // Company branch options:

        if (moFieldConcept.getKeyAsIntArray()[0] == 1 && moFieldCrossWith.getKeyAsIntArray()[0] == 0) {
            groupBy = " GROUP BY bpb ";
            orderBy = " ORDER BY bpb ";
            detailColumn = "SUCURSAL EMPRESA";
            filter = "POR SUCURSAL EMPRESA";
            tpDetail = 1;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 1 && moFieldCrossWith.getKeyAsIntArray()[0] == 2) {
            groupBy = " GROUP BY bpb, tp_pay ";
            orderBy = " ORDER BY bpb, tp_pay ";
            detailColumn = "TIPO DE PAGO";
            filter = "POR SUCURSAL EMPRESA - TIPO DE PAGO";
            tpDetail = 2;
            tpGroup = 1;
            showGroup = true;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 1 && moFieldCrossWith.getKeyAsIntArray()[0] == 3) {
            groupBy = " GROUP BY bpb, f_dest ";
            orderBy = " ORDER BY bpb, f_dest ";
            detailColumn = "PAÍS";
            filter = "POR SUCURSAL EMPRESA - DESTINO";
            tpDetail = 3;
            tpGroup = 1;
            showGroup = true;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 1 && moFieldCrossWith.getKeyAsIntArray()[0] == 4) {
            groupBy = " GROUP BY bpb, tax ";
            orderBy = " ORDER BY bpb, tax ";
            detailColumn = "IMPUESTO";
            filter = "POR SUCURSAL EMPRESA - IMPUESTO";
            tpDetail = 4;
            tpGroup = 1;
            showGroup = true;
        }

        // Type of payment options:

        else if (moFieldConcept.getKeyAsIntArray()[0] == 2 && moFieldCrossWith.getKeyAsIntArray()[0] == 0) {
            groupBy = " GROUP BY tp_pay ";
            orderBy = " ORDER BY tp_pay ";
            detailColumn = "TIPO DE PAGO";
            filter = "POR TIPO DE PAGO";
            tpDetail = 2;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 2 && moFieldCrossWith.getKeyAsIntArray()[0] == 1) {
            groupBy = " GROUP BY tp_pay, bpb ";
            orderBy = " ORDER BY tp_pay, bpb ";
            detailColumn = "SUCURSAL EMPRESA";
            filter = "POR TIPO DE PAGO - SUCURSAL EMPRESA";
            tpDetail = 1;
            tpGroup = 2;
            showGroup = true;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 2 && moFieldCrossWith.getKeyAsIntArray()[0] == 3) {
            groupBy = " GROUP BY tp_pay, f_dest ";
            orderBy = " ORDER BY tp_pay, f_dest ";
            detailColumn = "PAÍS";
            filter = "POR TIPO DE PAGO - DESTINO";
            tpDetail = 3;
            tpGroup = 2;
            showGroup = true;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 2 && moFieldCrossWith.getKeyAsIntArray()[0] == 4) {
            groupBy = " GROUP BY tp_pay, tax ";
            orderBy = " ORDER BY tp_pay, tax ";
            detailColumn = "IMPUESTO";
            filter = "POR TIPO DE PAGO - IMPUESTO";
            tpDetail = 4;
            tpGroup = 2;
            showGroup = true;
        }

        // Country options:

        else if (moFieldConcept.getKeyAsIntArray()[0] == 3 && moFieldCrossWith.getKeyAsIntArray()[0] == 0) {
            groupBy = " GROUP BY f_dest ";
            orderBy = " ORDER BY f_dest ";
            detailColumn = "PAÍS";
            filter = "POR PAÍS";
            tpDetail = 3;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 3 && moFieldCrossWith.getKeyAsIntArray()[0] == 1) {
            groupBy = " GROUP BY f_dest, bpb ";
            orderBy = " ORDER BY f_dest, bpb ";
            detailColumn = "SUCURSAL EMPRESA";
            filter = "POR DESTINO - SUCURSAL EMPRESA";
            tpDetail = 1;
            tpGroup = 3;
            showGroup = true;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 3 && moFieldCrossWith.getKeyAsIntArray()[0] == 2) {
            groupBy = " GROUP BY f_dest, tp_pay ";
            orderBy = " ORDER BY f_dest, tp_pay ";
            detailColumn = "TIPO DE PAGO";
            filter = "POR DESTINO - TIPO DE PAGO";
            tpDetail = 2;
            tpGroup = 3;
            showGroup = true;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 3 && moFieldCrossWith.getKeyAsIntArray()[0] == 4) {
            groupBy = " GROUP BY f_dest, tax ";
            orderBy = " ORDER BY f_dest, tax ";
            detailColumn = "IMPUESTO";
            filter = "POR DESTINO - IMPUESTO";
            tpDetail = 4;
            tpGroup = 3;
            showGroup = true;
        }

        // Tax options:

        else if (moFieldConcept.getKeyAsIntArray()[0] == 4 && moFieldCrossWith.getKeyAsIntArray()[0] == 0) {
            groupBy = " GROUP BY tax ";
            orderBy = " ORDER BY tax ";
            detailColumn = "IMPUESTO";
            filter = "POR IMPUESTO";
            tpDetail = 4;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 4 && moFieldCrossWith.getKeyAsIntArray()[0] == 1) {
            groupBy = " GROUP BY tax, bpb ";
            orderBy = " ORDER BY tax, bpb ";
            detailColumn = "SUCURSAL EMPRESA";
            filter = "POR IMPUESTO - SUCURSAL EMPRESA";
            tpDetail = 1;
            tpGroup = 4;
            showGroup = true;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 4 && moFieldCrossWith.getKeyAsIntArray()[0] == 2) {
            groupBy = " GROUP BY tax, tp_pay ";
            orderBy = " ORDER BY tax, tp_pay ";
            detailColumn = "TIPO DE PAGO";
            filter = "POR IMPUESTO - TIPO DE PAGO";
            tpDetail = 2;
            tpGroup = 4;
            showGroup = true;
        }
        else if (moFieldConcept.getKeyAsIntArray()[0] == 4 && moFieldCrossWith.getKeyAsIntArray()[0] == 3) {
            groupBy = " GROUP BY tax, f_dest ";
            orderBy = " ORDER BY tax, f_dest ";
            detailColumn = "PAÍS";
            filter = "POR IMPUESTO - DESTINO";
            tpDetail = 3;
            tpGroup = 4;
            showGroup = true;
        }

        return new Object[] { groupBy, orderBy, detailColumn, filter, tpDetail, tpGroup, showGroup };
    }

    private void renderComboBoxTax() {
        if (moFieldConcept.getKeyAsIntArray()[0] == 4 || (!mbResetingComboBixCrossWith && moFieldCrossWith.getKeyAsIntArray()[0] == 4)) {
            jcbTaxBase.setEnabled(true);
        }
        else {
            jcbTaxBase.setEnabled(false);
        }
    }

    private void itemStateChangedConcept() {
        populateComboBoxCrossWith();
        renderComboBoxTax();
    }

    private void itemStateChangedCrossWith() {
        renderComboBoxTax();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbDateEnd;
    private javax.swing.JButton jbDateInitial;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbPrint;
    private javax.swing.JComboBox<SFormComponentItem> jcbCompanyBranch;
    private javax.swing.JComboBox<SFormComponentItem> jcbConcept;
    private javax.swing.JComboBox<SFormComponentItem> jcbCrossWith;
    private javax.swing.JComboBox<SFormComponentItem> jcbTaxBase;
    private javax.swing.JCheckBox jckWithoutRelatedParty;
    private javax.swing.JFormattedTextField jftDateEnd;
    private javax.swing.JFormattedTextField jftDateInitial;
    private javax.swing.JLabel jlCompanyBranch;
    private javax.swing.JLabel jlConcept;
    private javax.swing.JLabel jlCrossWith;
    private javax.swing.JLabel jlDateEnd;
    private javax.swing.JLabel jlDateInitial;
    private javax.swing.JLabel jlTaxBase;
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

        for (int i = 0; i < mvFields.size(); i++) {
            ((erp.lib.form.SFormField) mvFields.get(i)).resetField();
        }

        moFieldDateInitial.setFieldValue(SLibTimeUtilities.getBeginOfMonth(miClient.getSessionXXX().getWorkingDate()));
        moFieldDateEnd.setFieldValue(SLibTimeUtilities.getEndOfMonth(miClient.getSessionXXX().getWorkingDate()));
        jckWithoutRelatedParty.setSelected(false);
        populateComboBoxConcept();
        renderComboBoxTax();
        mbResetingForm = false;
    }

    @Override
    public void formRefreshCatalogues() {
        mbResetingForm = true;
        SFormUtilities.populateComboBox(miClient, jcbTaxBase, SDataConstants.FINU_TAX_BAS);
        SFormUtilities.populateComboBox(miClient, jcbCompanyBranch, SDataConstants.BPSU_BPB, new int[] { miClient.getSessionXXX().getCompany().getPkCompanyId() });
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

        if (!validation.getIsError()) {
            if (moFieldDateEnd.getDate().compareTo(moFieldDateInitial.getDate()) < 0) {
                validation.setMessage("La fecha final debe ser mayor o igual a la fecha inicial.");
                validation.setComponent(jftDateEnd);
            }
            else if ((moFieldConcept.getKeyAsIntArray()[0] == 4 || moFieldCrossWith.getKeyAsIntArray()[0] == 4) && moFieldTaxBase.getKeyAsIntArray()[0] == 0) {
                validation.setMessage("Se debe seleccionar una opción para el campo '" + jlTaxBase.getText() + "'.");
                validation.setComponent(jcbTaxBase);
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public erp.lib.data.SDataRegistry getRegistry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValue(int type, java.lang.Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.lang.Object getValue(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public javax.swing.JLabel getTimeoutLabel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();

            if (button == jbPrint) {
                actionPrint();
            }
            else if (button == jbExit) {
                actionClose();
            }
            else if (button == jbDateInitial) {
                actionDateInitial();
            }
            else if (button == jbDateEnd) {
                actionDateEnd();
            }
        }
    }

    public void setParamIsSupplier(boolean b) { mbParamIsSupplier = b; }
}
