/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mtrn.form;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.data.SDataUtilities;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import erp.lib.form.SFormUtilities;
import erp.lib.table.STableColumnForm;
import erp.lib.table.STableConstants;
import erp.lib.table.STablePane;
import erp.lib.table.STableRowCustom;
import erp.lib.table.STableUtilities;
import erp.mitm.data.SDataItem;
import erp.mitm.data.SDataUnit;
import erp.mmfg.data.SDataProductionOrder;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Sergio Flores
 */
public class SDialogStockCardexProdOrder extends javax.swing.JDialog implements java.awt.event.ActionListener {

    private boolean mbFirstTime;
    private erp.client.SClientInterface miClient;
    private erp.lib.table.STablePane moPaneStockMoves;

    private int[] manParamProdOrderKey;
    private erp.mmfg.data.SDataProductionOrder moParamProdOrder;

    /** Creates new form SDialogStockCardexProdOrder */
    public SDialogStockCardexProdOrder(erp.client.SClientInterface client) {
        super(client.getFrame(), true);
        miClient = client;
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

        jpParams = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlProdOrder = new javax.swing.JLabel();
        jtfProdOrderNumber = new javax.swing.JTextField();
        jtfProdOrderType = new javax.swing.JTextField();
        jlProdOrderDate = new javax.swing.JLabel();
        jtfProdOrderDate = new javax.swing.JTextField();
        jlProdOrderDateDelivery = new javax.swing.JLabel();
        jtfProdOrderDateDelivery = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jlItem = new javax.swing.JLabel();
        jtfItemCode = new javax.swing.JTextField();
        jtfItem = new javax.swing.JTextField();
        jlQuantity = new javax.swing.JLabel();
        jtfQuantity = new javax.swing.JTextField();
        jtfQuantityUnit = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jlDebit = new javax.swing.JLabel();
        jtfDebit = new javax.swing.JTextField();
        jtfCurrencyKeyDebit = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jlCredit = new javax.swing.JLabel();
        jtfCredit = new javax.swing.JTextField();
        jtfCurrencyKeyCredit = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jlBalance = new javax.swing.JLabel();
        jtfBalance = new javax.swing.JTextField();
        jtfCurrencyKeyBalance = new javax.swing.JTextField();
        jpStockMoves = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jtfSeek = new javax.swing.JTextField();
        jbSeek = new javax.swing.JButton();
        jbExportCsv = new javax.swing.JButton();
        jbRefresh = new javax.swing.JButton();
        jpControls = new javax.swing.JPanel();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tarjeta auxiliar de almacén");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpParams.setLayout(new java.awt.BorderLayout(5, 0));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden de producción:"));
        jPanel4.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlProdOrder.setText("Ord. prod.:");
        jlProdOrder.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel5.add(jlProdOrder);

        jtfProdOrderNumber.setEditable(false);
        jtfProdOrderNumber.setText("TEXT");
        jtfProdOrderNumber.setFocusable(false);
        jtfProdOrderNumber.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jtfProdOrderNumber);

        jtfProdOrderType.setEditable(false);
        jtfProdOrderType.setText("TEXT");
        jtfProdOrderType.setFocusable(false);
        jtfProdOrderType.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel5.add(jtfProdOrderType);

        jlProdOrderDate.setText("Fecha orden:");
        jlProdOrderDate.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel5.add(jlProdOrderDate);

        jtfProdOrderDate.setEditable(false);
        jtfProdOrderDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfProdOrderDate.setText("00/00/0000");
        jtfProdOrderDate.setFocusable(false);
        jtfProdOrderDate.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel5.add(jtfProdOrderDate);

        jlProdOrderDateDelivery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlProdOrderDateDelivery.setText("Fecha entrega:");
        jlProdOrderDateDelivery.setPreferredSize(new java.awt.Dimension(90, 23));
        jPanel5.add(jlProdOrderDateDelivery);

        jtfProdOrderDateDelivery.setEditable(false);
        jtfProdOrderDateDelivery.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfProdOrderDateDelivery.setText("00/00/0000");
        jtfProdOrderDateDelivery.setFocusable(false);
        jtfProdOrderDateDelivery.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel5.add(jtfProdOrderDateDelivery);

        jPanel4.add(jPanel5);

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlItem.setText("Producto:");
        jlItem.setFocusable(false);
        jlItem.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel10.add(jlItem);

        jtfItemCode.setEditable(false);
        jtfItemCode.setText("TEXT");
        jtfItemCode.setFocusable(false);
        jtfItemCode.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel10.add(jtfItemCode);

        jtfItem.setEditable(false);
        jtfItem.setText("TEXT");
        jtfItem.setFocusable(false);
        jtfItem.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel10.add(jtfItem);

        jlQuantity.setText("Cant. orden:");
        jlQuantity.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel10.add(jlQuantity);

        jtfQuantity.setEditable(false);
        jtfQuantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfQuantity.setText("0.000");
        jtfQuantity.setFocusable(false);
        jtfQuantity.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel10.add(jtfQuantity);

        jtfQuantityUnit.setEditable(false);
        jtfQuantityUnit.setText("UNIT");
        jtfQuantityUnit.setFocusable(false);
        jtfQuantityUnit.setPreferredSize(new java.awt.Dimension(35, 23));
        jPanel10.add(jtfQuantityUnit);

        jPanel4.add(jPanel10);

        jpParams.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo de la orden de producción:"));
        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlDebit.setText("Cargos:");
        jlDebit.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel15.add(jlDebit);

        jtfDebit.setEditable(false);
        jtfDebit.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfDebit.setText("0.00");
        jtfDebit.setFocusable(false);
        jtfDebit.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel15.add(jtfDebit);

        jtfCurrencyKeyDebit.setEditable(false);
        jtfCurrencyKeyDebit.setText("CUR");
        jtfCurrencyKeyDebit.setFocusable(false);
        jtfCurrencyKeyDebit.setPreferredSize(new java.awt.Dimension(35, 23));
        jPanel15.add(jtfCurrencyKeyDebit);

        jPanel1.add(jPanel15);

        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlCredit.setText("Abonos:");
        jlCredit.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel16.add(jlCredit);

        jtfCredit.setEditable(false);
        jtfCredit.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfCredit.setText("0.00");
        jtfCredit.setFocusable(false);
        jtfCredit.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel16.add(jtfCredit);

        jtfCurrencyKeyCredit.setEditable(false);
        jtfCurrencyKeyCredit.setText("CUR");
        jtfCurrencyKeyCredit.setFocusable(false);
        jtfCurrencyKeyCredit.setPreferredSize(new java.awt.Dimension(35, 23));
        jPanel16.add(jtfCurrencyKeyCredit);

        jPanel1.add(jPanel16);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlBalance.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlBalance.setText("Saldo:");
        jlBalance.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel17.add(jlBalance);

        jtfBalance.setEditable(false);
        jtfBalance.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfBalance.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfBalance.setText("0.00");
        jtfBalance.setFocusable(false);
        jtfBalance.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel17.add(jtfBalance);

        jtfCurrencyKeyBalance.setEditable(false);
        jtfCurrencyKeyBalance.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfCurrencyKeyBalance.setText("CUR");
        jtfCurrencyKeyBalance.setFocusable(false);
        jtfCurrencyKeyBalance.setPreferredSize(new java.awt.Dimension(35, 23));
        jPanel17.add(jtfCurrencyKeyBalance);

        jPanel1.add(jPanel17);

        jpParams.add(jPanel1, java.awt.BorderLayout.EAST);

        getContentPane().add(jpParams, java.awt.BorderLayout.NORTH);

        jpStockMoves.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos de inventarios:"));
        jpStockMoves.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 3, 0));

        jtfSeek.setText("Seek");
        jtfSeek.setToolTipText("Texto a buscar [Ctrl+B]");
        jtfSeek.setEnabled(false);
        jtfSeek.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel3.add(jtfSeek);

        jbSeek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_seek.gif"))); // NOI18N
        jbSeek.setToolTipText("Buscar");
        jbSeek.setEnabled(false);
        jbSeek.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel3.add(jbSeek);

        jbExportCsv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_file_csv.gif"))); // NOI18N
        jbExportCsv.setToolTipText("Exportar CSV [Ctrl+E]");
        jbExportCsv.setEnabled(false);
        jbExportCsv.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel3.add(jbExportCsv);

        jbRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_reload.gif"))); // NOI18N
        jbRefresh.setToolTipText("Refrescar [Ctrl+R]");
        jbRefresh.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel3.add(jbRefresh);

        jpStockMoves.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jpStockMoves, java.awt.BorderLayout.CENTER);

        jpControls.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbClose.setText("Cerrar");
        jbClose.setPreferredSize(new java.awt.Dimension(75, 23));
        jpControls.add(jbClose);

        getContentPane().add(jpControls, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-968)/2, (screenSize.height-634)/2, 968, 634);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void initComponentsExtra() {
        int col = 0;
        STableColumnForm[] columns = null;

        columns = new STableColumnForm[21];
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_INTEGER, "#", STableConstants.WIDTH_NUM_SMALLINT);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE, "Fecha doc. ES", STableConstants.WIDTH_DATE);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Folio doc. ES", STableConstants.WIDTH_DOC_NUM);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Sucursal empresa", STableConstants.WIDTH_CODE_COB);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Almacén", STableConstants.WIDTH_CODE_COB_ENT);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Código tipo movimiento", STableConstants.WIDTH_CODE_DOC);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Tipo movimiento", 125);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Ítem", STableConstants.WIDTH_ITEM);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Lote", 75);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE, "Caducidad", STableConstants.WIDTH_DATE);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_BOOLEAN, "Bloqueado", STableConstants.WIDTH_BOOLEAN);
        columns[col] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Entradas", STableConstants.WIDTH_QUANTITY_2X);
        columns[col++].setCellRenderer(miClient.getSessionXXX().getFormatters().getTableCellRendererQuantity());
        columns[col] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Salidas", STableConstants.WIDTH_QUANTITY_2X);
        columns[col++].setCellRenderer(miClient.getSessionXXX().getFormatters().getTableCellRendererQuantity());
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Unidad", STableConstants.WIDTH_UNIT_SYMBOL);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Cargos $", STableConstants.WIDTH_VALUE_2X);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Abonos $", STableConstants.WIDTH_VALUE_2X);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Saldo $", STableConstants.WIDTH_VALUE_2X);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Usr. creación", STableConstants.WIDTH_USER);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE_TIME, "Creación", STableConstants.WIDTH_DATE_TIME);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Usr. modificación", STableConstants.WIDTH_USER);
        columns[col++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE_TIME, "Modificación", STableConstants.WIDTH_DATE_TIME);

        moPaneStockMoves = new STablePane(miClient);
        jpStockMoves.add(moPaneStockMoves, BorderLayout.CENTER);

        for (STableColumnForm column : columns) {
            moPaneStockMoves.addTableColumn(column);
        }

        moPaneStockMoves.createTable();
        moPaneStockMoves.getTable().getTableHeader().setReorderingAllowed(false);

        jtfCurrencyKeyDebit.setText(miClient.getSessionXXX().getParamsErp().getDbmsDataCurrency().getKey());
        jtfCurrencyKeyCredit.setText(miClient.getSessionXXX().getParamsErp().getDbmsDataCurrency().getKey());
        jtfCurrencyKeyBalance.setText(miClient.getSessionXXX().getParamsErp().getDbmsDataCurrency().getKey());

        jtfCurrencyKeyDebit.setCaretPosition(0);
        jtfCurrencyKeyCredit.setCaretPosition(0);
        jtfCurrencyKeyBalance.setCaretPosition(0);

        jbClose.addActionListener(this);
        jbSeek.addActionListener(this);
        jbRefresh.addActionListener(this);
        jbExportCsv.addActionListener(this);
        jtfSeek.addActionListener(this);

        SFormUtilities.createActionMap(getRootPane(), this, "actionClose", "close", KeyEvent.VK_ESCAPE, SLibConstants.UNDEFINED);
        SFormUtilities.createActionMap(getRootPane(), this, "focusSeek", "seek", KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK);
        SFormUtilities.createActionMap(getRootPane(), this, "actionExportCsv", "exportCsv", KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
        SFormUtilities.createActionMap(getRootPane(), this, "actionRefresh", "refresh", KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK);
    }

    private void windowActivated() {
        if (mbFirstTime) {
            mbFirstTime = false;
            jbClose.requestFocus();
        }
    }

    private void renderProdOrder() {
        SDataItem item = null;
        SDataUnit unit = null;

        if (manParamProdOrderKey == null) {
            moParamProdOrder = null;

            jtfProdOrderNumber.setText("");
            jtfProdOrderType.setText("");
            jtfProdOrderDate.setText("");
            jtfProdOrderDateDelivery.setText("");
            jtfItemCode.setText("");
            jtfItem.setText("");
            jtfQuantity.setText("");
            jtfQuantityUnit.setText("");
        }
        else {
            moParamProdOrder = (SDataProductionOrder) SDataUtilities.readRegistry(miClient, SDataConstants.MFG_ORD, manParamProdOrderKey, SLibConstants.EXEC_MODE_VERBOSE);
            item = (SDataItem) SDataUtilities.readRegistry(miClient, SDataConstants.ITMU_ITEM, new int[] { moParamProdOrder.getFkItemId_r() }, SLibConstants.EXEC_MODE_VERBOSE);
            unit = (SDataUnit) SDataUtilities.readRegistry(miClient, SDataConstants.ITMU_UNIT, new int[] { moParamProdOrder.getFkUnitId_r() }, SLibConstants.EXEC_MODE_VERBOSE);

            jtfProdOrderNumber.setText(moParamProdOrder.getDbmsNumber());
            jtfProdOrderType.setText(moParamProdOrder.getDbmsProductionOrderType());
            jtfProdOrderDate.setText(miClient.getSessionXXX().getFormatters().getDateFormat().format(moParamProdOrder.getDate()));
            jtfProdOrderDateDelivery.setText(miClient.getSessionXXX().getFormatters().getDateFormat().format(moParamProdOrder.getDateDelivery()));
            jtfItemCode.setText(item.getKey());
            jtfItem.setText(item.getItem());
            jtfQuantity.setText(miClient.getSessionXXX().getFormatters().getDecimalsQuantityFormat().format(moParamProdOrder.getQuantity()));
            jtfQuantityUnit.setText(unit.getSymbol());

            jtfProdOrderNumber.setCaretPosition(0);
            jtfProdOrderType.setCaretPosition(0);
            jtfProdOrderDate.setCaretPosition(0);
            jtfProdOrderDateDelivery.setCaretPosition(0);
            jtfItemCode.setCaretPosition(0);
            jtfItem.setCaretPosition(0);
            jtfQuantity.setCaretPosition(0);
            jtfQuantityUnit.setCaretPosition(0);
        }
    }

    @SuppressWarnings("unchecked")
    private void renderStockMoves() {
        int col = 0;
        int row = 0;
        double debit = 0;
        double debitSum = 0;
        double credit = 0;
        double creditSum = 0;
        double balance = 0;
        String sql = "";
        ResultSet resulSet = null;

        moPaneStockMoves.clearTableRows();
        moPaneStockMoves.createTable();
        moPaneStockMoves.getTable().getTableHeader().setReorderingAllowed(false);

        try {
            sql = "SELECT s.id_year, s.id_item, s.id_unit, s.id_lot, s.id_cob, s.id_wh, s.id_mov, " +   // 06
                    "iog.dt, CONCAT(iog.num_ser, IF(length(iog.num_ser) = 0, '', '-'), erp.lib_fix_int(iog.num, " + SDataConstantsSys.NUM_LEN_IOG + ")) AS f_iog_num, " +   // 08
                    "cob.code, ent.code, st.code, st.tp_iog, i.item, l.lot, l.dt_exp_n, l.b_block, " +  // 16
                    "s.mov_in, s.mov_out, u.symbol, s.debit, s.credit, " +                              // 21
                    "un.usr, iog.ts_new, ue.usr, iog.ts_edit " +                                        // 25
                    "FROM trn_stk AS s " +
                    "INNER JOIN erp.itmu_item AS i ON s.id_item = i.id_item " +
                    "INNER JOIN erp.itmu_unit AS u ON s.id_unit = u.id_unit " +
                    "INNER JOIN trn_lot AS l ON s.id_item = l.id_item AND s.id_unit = l.id_unit AND s.id_lot = l.id_lot " +
                    "INNER JOIN erp.bpsu_bpb AS cob ON s.id_cob = cob.id_bpb " +
                    "INNER JOIN erp.cfgu_cob_ent AS ent ON s.id_cob = ent.id_cob AND s.id_wh = ent.id_ent " +
                    "INNER JOIN erp.trns_tp_iog AS st ON s.fid_ct_iog = st.id_ct_iog AND s.fid_cl_iog = st.id_cl_iog AND s.fid_tp_iog = st.id_tp_iog " +
                    "INNER JOIN trn_diog AS iog ON s.fid_diog_year = iog.id_year AND s.fid_diog_doc = iog.id_doc AND " +
                    "iog.fid_mfg_year_n = " + manParamProdOrderKey[0] + " AND iog.fid_mfg_ord_n = " + manParamProdOrderKey[1] + " " +
                    "INNER JOIN erp.usru_usr AS un ON iog.fid_usr_new = un.id_usr " +
                    "INNER JOIN erp.usru_usr AS ue ON iog.fid_usr_edit = ue.id_usr " +
                    "WHERE s.b_del = 0 " +
                    "ORDER BY iog.dt, iog.num_ser, erp.lib_fix_int(iog.num, " + SDataConstantsSys.NUM_LEN_IOG + "), st.code, st.tp_iog, " +
                    "l.lot, s.id_year, s.id_item, s.id_unit, s.id_lot, s.id_cob, s.id_wh, s.id_mov ";

            resulSet = miClient.getSession().getStatement().executeQuery(sql);
            while (resulSet.next()) {
                STableRowCustom rowCustom = new STableRowCustom();

                col = 8;
                rowCustom.getValues().add(++row);
                rowCustom.getValues().add(resulSet.getDate(col++));
                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getDate(col++));
                rowCustom.getValues().add(resulSet.getBoolean(col++));
                rowCustom.getValues().add(resulSet.getDouble(col++));
                rowCustom.getValues().add(resulSet.getDouble(col++));
                rowCustom.getValues().add(resulSet.getString(col++));

                debitSum += debit = resulSet.getDouble(col++);
                creditSum += credit = resulSet.getDouble(col++);
                balance += (debit - credit);

                rowCustom.getValues().add(debit);
                rowCustom.getValues().add(credit);
                rowCustom.getValues().add(balance);

                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getTimestamp(col++));
                rowCustom.getValues().add(resulSet.getString(col++));
                rowCustom.getValues().add(resulSet.getTimestamp(col++));

                moPaneStockMoves.addTableRow(rowCustom);
            }

            moPaneStockMoves.renderTableRows();
            moPaneStockMoves.setTableRowSelection(0);

            if (moPaneStockMoves.getTableGuiRowCount() == 0) {
                jtfSeek.setEnabled(false);
                jbSeek.setEnabled(false);
                jbExportCsv.setEnabled(false);
            }
            else {
                jtfSeek.setEnabled(true);
                jbSeek.setEnabled(true);
                jbExportCsv.setEnabled(true);
            }
        }
        catch (Exception e) {
            debitSum = 0;
            creditSum = 0;
            SLibUtilities.renderException(this, e);
        }

        jtfDebit.setText(miClient.getSessionXXX().getFormatters().getDecimalsValueFormat().format(debitSum));
        jtfCredit.setText(miClient.getSessionXXX().getFormatters().getDecimalsValueFormat().format(creditSum));
        jtfBalance.setText(miClient.getSessionXXX().getFormatters().getDecimalsValueFormat().format(debitSum - creditSum));
    }

    public void actionClose() {
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbExportCsv;
    private javax.swing.JButton jbRefresh;
    private javax.swing.JButton jbSeek;
    private javax.swing.JLabel jlBalance;
    private javax.swing.JLabel jlCredit;
    private javax.swing.JLabel jlDebit;
    private javax.swing.JLabel jlItem;
    private javax.swing.JLabel jlProdOrder;
    private javax.swing.JLabel jlProdOrderDate;
    private javax.swing.JLabel jlProdOrderDateDelivery;
    private javax.swing.JLabel jlQuantity;
    private javax.swing.JPanel jpControls;
    private javax.swing.JPanel jpParams;
    private javax.swing.JPanel jpStockMoves;
    private javax.swing.JTextField jtfBalance;
    private javax.swing.JTextField jtfCredit;
    private javax.swing.JTextField jtfCurrencyKeyBalance;
    private javax.swing.JTextField jtfCurrencyKeyCredit;
    private javax.swing.JTextField jtfCurrencyKeyDebit;
    private javax.swing.JTextField jtfDebit;
    private javax.swing.JTextField jtfItem;
    private javax.swing.JTextField jtfItemCode;
    private javax.swing.JTextField jtfProdOrderDate;
    private javax.swing.JTextField jtfProdOrderDateDelivery;
    private javax.swing.JTextField jtfProdOrderNumber;
    private javax.swing.JTextField jtfProdOrderType;
    private javax.swing.JTextField jtfQuantity;
    private javax.swing.JTextField jtfQuantityUnit;
    private javax.swing.JTextField jtfSeek;
    // End of variables declaration//GEN-END:variables

    public void focusSeek() {
        if (jtfSeek.isEnabled()) {
            jtfSeek.requestFocus();
        }
    }

    public void actionSeek() {
        if (jbSeek.isEnabled()) {
            STableUtilities.actionSeek(miClient, moPaneStockMoves, jtfSeek.getText().trim());
        }
    }

    public void actionExportCsv() {
        if (jbExportCsv.isEnabled()) {
            STableUtilities.actionExportCsv(miClient, moPaneStockMoves, getTitle());
        }
    }

    public void actionRefresh() {
        renderStockMoves();
    }

    public void setFormParams(final int[] prodOrderKey) {
        manParamProdOrderKey = prodOrderKey;

        renderProdOrder();
        renderStockMoves();
    }

    public void formReset() {
        mbFirstTime = true;

        jtfSeek.setText("");
        jtfSeek.setEnabled(false);
        jbSeek.setEnabled(false);
        jbExportCsv.setEnabled(false);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            JButton button = (JButton) e.getSource();

            if (button == jbClose) {
                actionClose();
            }
            else if (button == jbSeek) {
                actionSeek();
            }
            else if (button == jbExportCsv) {
                actionExportCsv();
            }
            else if (button == jbRefresh) {
                actionRefresh();
            }
        }
        else if (e.getSource() instanceof javax.swing.JTextField) {
            JTextField textField = (JTextField) e.getSource();

            if (textField == jtfSeek) {
                actionSeek();
            }
        }
    }
}
