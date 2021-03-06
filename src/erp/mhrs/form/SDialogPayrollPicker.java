/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SDialogPayrollPicker.java
 *
 * Created on 7/12/2010, 04:30:30 PM
 * Created copy on 23/04/2015
 */

package erp.mhrs.form;

import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import erp.lib.form.SFormUtilities;
import erp.lib.table.STableColumnForm;
import erp.lib.table.STableConstants;
import erp.lib.table.STablePane;
import erp.lib.table.STableRowCustom;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JDialog;

/**
 *
 * @author Sergio Flores, Juan Barajas
 */
public class SDialogPayrollPicker extends JDialog {

    private int mnFormResult;
    private boolean mbFirstTime;

    private erp.client.SClientInterface miClient;
    private erp.lib.table.STablePane moTablePanePayroll;
    private int[] manPayrollKey;
    private String msPayrollPeriod;
    private String msPayrollNumber;
    private String msPayrollDates;
    private String msPayrollNotes;
    private double mdPayrollNet;

    /** Creates new form SDialogPayrollPicker */
    public SDialogPayrollPicker(erp.client.SClientInterface client) {
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

        jpGrid = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbOk = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Importación de nóminas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpGrid.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar nómina:"));
        jpGrid.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jpGrid, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(2));

        jbOk.setText("Aceptar");
        jbOk.setToolTipText("[Ctrl + Enter]");
        jbOk.setPreferredSize(new java.awt.Dimension(75, 23));
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });
        jPanel2.add(jbOk);

        jbCancel.setText("Cancelar");
        jbCancel.setToolTipText("[Escape]");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });
        jPanel2.add(jbCancel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-600)/2, (screenSize.height-400)/2, 600, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        actionOk();
    }//GEN-LAST:event_jbOkActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        actionCancel();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void initComponentsExtra() {
        int i = 0;
        STableColumnForm[] aoTableColumns = null;

        moTablePanePayroll = new STablePane(miClient);
        moTablePanePayroll.setDoubleClickAction(this, "actionOk");
        jpGrid.add(moTablePanePayroll, BorderLayout.CENTER);

        aoTableColumns = new STableColumnForm[10];
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Período nómina", 50);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Tipo nómina", 50);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_INTEGER, "No. nómina", STableConstants.WIDTH_NUM_SMALLINT);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE, "Fecha inicial", STableConstants.WIDTH_DATE);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE, "Fecha final", STableConstants.WIDTH_DATE);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_BOOLEAN, "Cerrada", STableConstants.WIDTH_BOOLEAN);
        aoTableColumns[i] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Percepciones $", STableConstants.WIDTH_VALUE_2X);
        aoTableColumns[i++].setCellRenderer(miClient.getSessionXXX().getFormatters().getTableCellRendererValue());
        aoTableColumns[i] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Deducciones $", STableConstants.WIDTH_VALUE_2X);
        aoTableColumns[i++].setCellRenderer(miClient.getSessionXXX().getFormatters().getTableCellRendererValue());
        aoTableColumns[i] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Alcance neto $", STableConstants.WIDTH_VALUE_2X);
        aoTableColumns[i++].setCellRenderer(miClient.getSessionXXX().getFormatters().getTableCellRendererValue());
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Notas", 250);

        for (i = 0; i < aoTableColumns.length; i++) {
            moTablePanePayroll.addTableColumn(aoTableColumns[i]);
        }

        SFormUtilities.createActionMap(rootPane, this, "actionOk", "ok", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);
        SFormUtilities.createActionMap(rootPane, this, "actionCancel", "cancel", KeyEvent.VK_ESCAPE, 0);
    }

    private void windowActivated() {
        if (mbFirstTime) {
            mbFirstTime = false;

            if (miClient.getSessionXXX().getCurrentCompanyBranchId() == 0) {
                miClient.showMsgBoxWarning(SLibConstants.MSG_ERR_GUI_SESSION_BRANCH);
                actionCancel();
            }
            else {
                moTablePanePayroll.getTable().requestFocus();
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void populate() {
        String sql = "";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            int id_pay = 0;
            int per_year = 0;
            int per = 0;
            int num = 0;
            Date dt_sta = null;
            Date dt_end = null;
            boolean b_clo = false;
            String nts = "";
            int id_tp_pay = 0;
            String code = "";
            double f_ear = 0;
            double f_ded = 0;

            moTablePanePayroll.createTable();
            moTablePanePayroll.clearTableRows();

            sql = "SELECT p.id_pay, p.per_year, p.per, p.num, p.dt_sta, p.dt_end, " +
                    "p.b_clo, p.nts, tp.id_tp_pay, tp.code, " +
                    "(SELECT COALESCE(SUM(rcp_ear.amt_r), 0) " +
                    "FROM hrs_pay_rcp AS r " +
                    "INNER JOIN hrs_pay_rcp_ear AS rcp_ear ON rcp_ear.id_pay = r.id_pay AND rcp_ear.id_emp = r.id_emp " +
                    "WHERE r.id_pay = p.id_pay AND r.b_del = 0 AND rcp_ear.b_del = 0) AS f_ear, " +
                    "(SELECT COALESCE(SUM(rcp_ded.amt_r), 0) " +
                    "FROM hrs_pay_rcp AS r " +
                    "INNER JOIN hrs_pay_rcp_ded AS rcp_ded ON rcp_ded.id_pay = r.id_pay AND rcp_ded.id_emp = r.id_emp " +
                    "WHERE r.id_pay = p.id_pay AND r.b_del = 0 AND rcp_ded.b_del = 0) AS f_ded, " +
                    //"(SELECT SUM(rcp.ear_r) FROM hrs_pay_rcp AS rcp WHERE rcp.b_del = 0 AND rcp.id_pay = p.id_pay) AS f_ear, " +
                    //"(SELECT SUM(rcp.ded_r) FROM hrs_pay_rcp AS rcp WHERE rcp.b_del = 0 AND rcp.id_pay = p.id_pay) AS f_ded " +
                    "FROM hrs_pay AS p " +
                    "INNER JOIN erp.hrss_tp_pay AS tp ON p.fk_tp_pay = tp.id_tp_pay " +
                    "WHERE p.b_del = 0 " +
                    "ORDER BY p.per_year DESC, p.per DESC, tp.code, p.num, p.id_pay ";

            statement = miClient.getSession().getStatement();
            resultSet = statement.executeQuery(sql);

            /*
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                System.out.println("Catalogue name: " + resultSet.getMetaData().getCatalogName(i));
                System.out.println("Column class name: " + resultSet.getMetaData().getColumnClassName(i));
                System.out.println("Column display size: " + resultSet.getMetaData().getColumnDisplaySize(i));
                System.out.println("Column column label: " + resultSet.getMetaData().getColumnLabel(i));
                System.out.println("Column column name: " + resultSet.getMetaData().getColumnName(i));
                System.out.println("Column column type: " + resultSet.getMetaData().getColumnType(i));
                System.out.println("Column column type name: " + resultSet.getMetaData().getColumnTypeName(i));
            }
            */

            while (resultSet.next()) {
                STableRowCustom row = new STableRowCustom();

                id_pay = resultSet.getInt("id_pay");
                per_year = resultSet.getInt("per_year");
                per = resultSet.getInt("per");
                num = resultSet.getInt("num");
                dt_sta = resultSet.getDate("dt_sta");
                dt_end = resultSet.getDate("dt_end");
                b_clo = resultSet.getBoolean("b_clo");
                nts = resultSet.getString("nts");
                id_tp_pay = resultSet.getShort("id_tp_pay");
                code = resultSet.getString("code");
                f_ear = resultSet.getDouble("f_ear");
                f_ded = resultSet.getDouble("f_ded");

                row.setPrimaryKey(new int[] { id_pay });
                row.getValues().add("" + per_year + "-" + (per >= 10 ? "" : "0") + per);
                row.getValues().add(code.trim());
                row.getValues().add(num);
                row.getValues().add(dt_sta);
                row.getValues().add(dt_end);
                row.getValues().add(b_clo);
                row.getValues().add(f_ear);
                row.getValues().add(f_ded);
                row.getValues().add(f_ear - f_ded);
                row.getValues().add(nts.trim());

                moTablePanePayroll.addTableRow(row);
            }

            moTablePanePayroll.renderTableRows();
            moTablePanePayroll.setTableRowSelection(0);
        }
        catch (Exception e) {
            SLibUtilities.renderException(this, e);
        }
    }

    public void actionOk() {
        STableRowCustom row = (STableRowCustom) moTablePanePayroll.getSelectedTableRow();

        if (row == null) {
            miClient.showMsgBoxWarning("Se debe seleccionar una nomina.");
            moTablePanePayroll.getTable().requestFocus();
        }
        else {
            manPayrollKey = (int[]) row.getPrimaryKey();
            msPayrollPeriod = "" + row.getValues().get(0);
            msPayrollNumber = "" + row.getValues().get(1) + " " + row.getValues().get(2);
            msPayrollDates = miClient.getSessionXXX().getFormatters().getDateFormat().format((java.util.Date) row.getValues().get(3)) + " - " +
                    miClient.getSessionXXX().getFormatters().getDateFormat().format((java.util.Date) row.getValues().get(4));
            msPayrollNotes = (String) row.getValues().get(9);
            mdPayrollNet = (Double) row.getValues().get(8);

            mnFormResult = SLibConstants.FORM_RESULT_OK;
            setVisible(false);
        }
    }

    public void actionCancel() {
        mnFormResult = SLibConstants.FORM_RESULT_CANCEL;
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbOk;
    private javax.swing.JPanel jpGrid;
    // End of variables declaration//GEN-END:variables

    public void resetForm() {
        mnFormResult = SLibConstants.UNDEFINED;
        mbFirstTime = true;

        manPayrollKey = null;
        msPayrollPeriod = "";
        msPayrollNumber = "";
        msPayrollDates = "";
        msPayrollNotes = "";
        mdPayrollNet = 0;

        populate();
    }

    public int getFormResult() {
        return mnFormResult;
    }

    public int[] getPayrollKey() {
        return manPayrollKey;
    }

    public String getPayrollPeriod() {
        return msPayrollPeriod;
    }

    public String getPayrollNumber() {
        return msPayrollNumber;
    }

    public String getPayrollDates() {
        return msPayrollDates;
    }

    public String getPayrollNotes() {
        return msPayrollNotes;
    }

    public double getPayrollNet() {
        return mdPayrollNet;
    }
}
