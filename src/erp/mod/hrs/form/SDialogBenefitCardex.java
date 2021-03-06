/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.SModSysConsts;
import erp.mod.hrs.db.SDbConfig;
import erp.mod.hrs.db.SDbEmployee;
import erp.mod.hrs.db.SHrsConsts;
import erp.mod.hrs.db.SRowBenefitCardex;
import erp.mod.hrs.db.SRowBenefitDetailCardex;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import sa.gui.util.SUtilConsts;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.db.SDbRegistryUser;
import sa.lib.grid.SGridColumnForm;
import sa.lib.grid.SGridConsts;
import sa.lib.grid.SGridPaneForm;
import sa.lib.grid.SGridRow;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFormDialog;

/**
 *
 * @author Juan Barajas
 */
public class SDialogBenefitCardex extends SBeanFormDialog implements ListSelectionListener {
    
    protected SDbEmployee moEmployee;
    protected SDbConfig moConfig;
    protected Date mtDateCut;
    protected int mnAnniversary;
    protected int mnAnniversaryDays;
    protected int mnAnniversaryYear;
    protected int mnBenefitTableId;
    protected double mdPaymentDaily;
    protected SGridPaneForm moGridBenefitSummary;
    protected SGridPaneForm moGridBenefitDetail;

    /**
     * Creates new form SDialogBenefitCardex
     * @param client
     * @param formSubtype
     * @param title
     */
    public SDialogBenefitCardex(SGuiClient client, int formSubtype, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.HRSX_BEN_MOV, formSubtype, title);
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
        jpBenefit = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jlEmployeeName = new javax.swing.JLabel();
        moTextEmployeeName = new sa.lib.gui.bean.SBeanFieldText();
        jPanel2 = new javax.swing.JPanel();
        jlBenefitType = new javax.swing.JLabel();
        moTextBenefitType = new sa.lib.gui.bean.SBeanFieldText();
        jPanel10 = new javax.swing.JPanel();
        jlDateBenefit = new javax.swing.JLabel();
        moTextDateBenefit = new sa.lib.gui.bean.SBeanFieldText();
        jlDummy = new javax.swing.JLabel();
        jlDateCut = new javax.swing.JLabel();
        moTextDateCut = new sa.lib.gui.bean.SBeanFieldText();
        jlSeniority = new javax.swing.JLabel();
        moIntSeniority = new sa.lib.gui.bean.SBeanFieldInteger();
        jlSeniorityYear = new javax.swing.JLabel();
        moIntSeniorityDays = new sa.lib.gui.bean.SBeanFieldInteger();
        jlSeniorityDays = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jpBenefitSummary = new javax.swing.JPanel();
        jpBenefitDetail = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jpBenefit.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Prestación:"));
        jPanel4.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlEmployeeName.setText("Empleado:");
        jlEmployeeName.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel7.add(jlEmployeeName);

        moTextEmployeeName.setText("sBeanFieldText2");
        moTextEmployeeName.setPreferredSize(new java.awt.Dimension(385, 23));
        jPanel7.add(moTextEmployeeName);

        jPanel4.add(jPanel7);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlBenefitType.setText("Tipo prestación:");
        jlBenefitType.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel2.add(jlBenefitType);

        moTextBenefitType.setText("sBeanFieldText1");
        moTextBenefitType.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel2.add(moTextBenefitType);

        jPanel4.add(jPanel2);

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateBenefit.setText("Fecha beneficios:");
        jlDateBenefit.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel10.add(jlDateBenefit);

        moTextDateBenefit.setText("sBeanFieldText7");
        moTextDateBenefit.setPreferredSize(new java.awt.Dimension(65, 23));
        jPanel10.add(moTextDateBenefit);

        jlDummy.setPreferredSize(new java.awt.Dimension(80, 23));
        jPanel10.add(jlDummy);

        jlDateCut.setText("Fecha corte:");
        jlDateCut.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel10.add(jlDateCut);

        moTextDateCut.setText("sBeanFieldText7");
        moTextDateCut.setPreferredSize(new java.awt.Dimension(65, 23));
        jPanel10.add(moTextDateCut);

        jlSeniority.setText("Antigüedad:");
        jlSeniority.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel10.add(jlSeniority);

        moIntSeniority.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel10.add(moIntSeniority);

        jlSeniorityYear.setText("años");
        jlSeniorityYear.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel10.add(jlSeniorityYear);

        moIntSeniorityDays.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel10.add(moIntSeniorityDays);

        jlSeniorityDays.setText("días");
        jlSeniorityDays.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel10.add(jlSeniorityDays);

        jPanel4.add(jPanel10);

        jpBenefit.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jpBenefit, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jpBenefitSummary.setBorder(javax.swing.BorderFactory.createTitledBorder("Prestación por aniversario:"));
        jpBenefitSummary.setPreferredSize(new java.awt.Dimension(100, 200));
        jpBenefitSummary.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jpBenefitSummary, java.awt.BorderLayout.NORTH);

        jpBenefitDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("Prestación detalle:"));
        jpBenefitDetail.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jpBenefitDetail, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
       actionSave();
    }//GEN-LAST:event_closeDialog
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jlBenefitType;
    private javax.swing.JLabel jlDateBenefit;
    private javax.swing.JLabel jlDateCut;
    private javax.swing.JLabel jlDummy;
    private javax.swing.JLabel jlEmployeeName;
    private javax.swing.JLabel jlSeniority;
    private javax.swing.JLabel jlSeniorityDays;
    private javax.swing.JLabel jlSeniorityYear;
    private javax.swing.JPanel jpBenefit;
    private javax.swing.JPanel jpBenefitDetail;
    private javax.swing.JPanel jpBenefitSummary;
    private sa.lib.gui.bean.SBeanFieldInteger moIntSeniority;
    private sa.lib.gui.bean.SBeanFieldInteger moIntSeniorityDays;
    private sa.lib.gui.bean.SBeanFieldText moTextBenefitType;
    private sa.lib.gui.bean.SBeanFieldText moTextDateBenefit;
    private sa.lib.gui.bean.SBeanFieldText moTextDateCut;
    private sa.lib.gui.bean.SBeanFieldText moTextEmployeeName;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 960, 600);
        
        jbSave.setText("Cerrar");
        jbCancel.setEnabled(false);

        moTextEmployeeName.setTextSettings(SGuiUtils.getLabelName(jlEmployeeName), 150);
        moTextBenefitType.setTextSettings(SGuiUtils.getLabelName(jlBenefitType), 150);
        moTextDateBenefit.setTextSettings(SGuiUtils.getLabelName(jlDateBenefit.getText()), 25);
        moTextDateCut.setTextSettings(SGuiUtils.getLabelName(jlDateCut.getText()), 25);
        moIntSeniority.setIntegerSettings(SGuiUtils.getLabelName(jlSeniority), SGuiConsts.GUI_TYPE_INT, false);
        moIntSeniorityDays.setIntegerSettings(SGuiUtils.getLabelName(jlSeniority), SGuiConsts.GUI_TYPE_INT, false);
        
        /*
        moFields.addField(moTextEmployeeName);
        moFields.addField(moTextBenefitType);
        moFields.addField(moTextDateBenefit);
        moFields.addField(moTextDateStart);
        moFields.addField(moTextDateCut);
        moFields.addField(moIntSeniority);
        moFields.addField(moIntSeniorityDays);
        */

        moGridBenefitSummary = new SGridPaneForm(miClient, SModConsts.HRSX_BEN_SUM, SLibConsts.UNDEFINED, "Prestación por aniversario") {
            @Override
            public void initGrid() {
                setRowButtonsEnabled(false);
            }

            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                ArrayList<SGridColumnForm> gridColumnsForm = new ArrayList<SGridColumnForm>();

                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_2B, "Aniversario", 50));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_CAL_YEAR, "Aniversario año", 50));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_2B, "Días"));
                if (mnFormSubtype == SModSysConsts.HRSS_TP_BEN_VAC_BON) {
                    gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_PER_2D, "Prima"));
                }
                if (mnFormSubtype == SModSysConsts.HRSS_TP_BEN_VAC) {
                    gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_4D, "Días pagados"));
                    gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_4D, "Días por pagar"));
                }
                if (mnFormSubtype != SModSysConsts.HRSS_TP_BEN_VAC) {
                    gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_AMT, "Monto $"));
                    gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_AMT, "Pagado $"));
                    gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_AMT, "Por pagar $"));
                }

                return gridColumnsForm;
            }
        };

        jpBenefitSummary.add(moGridBenefitSummary, BorderLayout.CENTER);
        
        moGridBenefitDetail = new SGridPaneForm(miClient, SModConsts.HRSX_BEN_DET, SLibConsts.UNDEFINED, "Detalle prestación") {
            @Override
            public void initGrid() {
                setRowButtonsEnabled(false);
            }

            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                ArrayList<SGridColumnForm> gridColumnsForm = new ArrayList<SGridColumnForm>();

                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DATE, "Fecha"));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_CAL_YEAR, "Ejercicio", 50));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_CAL_MONTH, "Período", 50));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_CAT_M, "Tipo nómina", 75));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_CAT_S, "No. nómina", 50));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DATE, "Fecha inicial"));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DATE, "Fecha final"));
                if (mnFormSubtype != SModSysConsts.HRSS_TP_BEN_VAC_BON) {
                    gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_4D, "Días"));
                }
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_AMT, "Monto $"));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_USR, "Usr nvo"));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DATE_DATETIME, "Usr TS nvo"));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_USR, "Usr mod"));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_DATE_DATETIME, "Usr TS mod"));

                return gridColumnsForm;
            }
        };

        jpBenefitDetail.add(moGridBenefitDetail, BorderLayout.CENTER);
        
        moTextEmployeeName.setEditable(false);
        moTextBenefitType.setEditable(false);
        moTextDateBenefit.setEditable(false);
        moTextDateCut.setEditable(false);
        moIntSeniority.setEditable(false);
        moIntSeniorityDays.setEditable(false);
        
        reloadCatalogues();
        addAllListeners();
    }
    
    private int getBenefitBonificationDays(int anniversary) {
        int days = 0;
        String sql = "";
        ResultSet resultSet = null;
        
        try {
            sql = "SELECT br.ben_day " +
                    "FROM hrs_ben AS b " +
                    "INNER JOIN hrs_ben_row AS br ON br.id_ben = b.id_ben " +
                    "WHERE fk_tp_ben = " + SModSysConsts.HRSS_TP_BEN_VAC + " AND dt_sta <= '" + SLibUtils.DbmsDateFormatDate.format(mtDateCut) + "' AND br.id_row = (" +
                    "SELECT br.id_row " +
                    "FROM hrs_ben AS b " +
                    "INNER JOIN hrs_ben_row AS br ON b.id_ben = br.id_ben " +
                    "WHERE fk_tp_ben = " + SModSysConsts.HRSS_TP_BEN_VAC + " AND dt_sta <= '" + SLibUtils.DbmsDateFormatDate.format(mtDateCut) + "' AND " +
                    "mon >= " + (anniversary == 0 ? 1 : anniversary) + " * " + SHrsConsts.YEAR_MONTHS + " " +
                    "ORDER BY dt_sta DESC, b.id_ben LIMIT 1) " +
                    "ORDER BY dt_sta DESC, b.id_ben LIMIT 1";

            resultSet = miClient.getSession().getStatement().getConnection().createStatement().executeQuery(sql);

            if (resultSet.next()) {
                days = resultSet.getInt("br.ben_day");
            }
        }
        catch (Exception e) {
            SLibUtils.showException(this, e);
        }
        return days;
    }
    
    private void loadAbsenceSelected() {
        SRowBenefitCardex benefitCardex = null;
        
        benefitCardex = (SRowBenefitCardex) moGridBenefitSummary.getSelectedGridRow();

        if (benefitCardex != null) {
            showBenefitDetail(benefitCardex);
        }
    }

    @SuppressWarnings("unchecked")
    private void showBenefitsMoves() {
        double benefitBonPer = 0;
        int days = 0;
        double amount = 0;
        double daysPayed = 0;
        double amountPayed = 0;
        double daysToPaid = 0;
        double amountToPaid = 0;
        Vector<SGridRow> rows = new Vector<>();
        String sql = "";
        ResultSet resultSet = null;

        try {
            for (int i = (mnAnniversary == 0 ? 0 : mnAnniversary); i >= (mnAnniversary == 0 ? 0 : 1); i--) {
                sql = "SELECT f_ann, " +
                        "IF((ear.ben_year) IS NULL, IF(YEAR(ADDDATE('" + SLibUtils.DbmsDateFormatDate.format(moEmployee.getDateBenefits()) + "', INTERVAL " + i + " YEAR)) > YEAR('" + SLibUtils.DbmsDateFormatDate.format(moEmployee.getDateBenefits()) + "'), YEAR(ADDDATE('" + SLibUtils.DbmsDateFormatDate.format(moEmployee.getDateBenefits()) + "', INTERVAL " + i + " YEAR)) - 1, YEAR('" + SLibUtils.DbmsDateFormatDate.format(moEmployee.getDateBenefits()) + "')), ear.ben_year) AS f_ann_ano, " +
                        "ben_day, id_row, f_bon_per, " +
                        "COALESCE(SUM(ear.unt_all), 0) AS f_payed_unt, " +
                        "COALESCE(SUM(ear.amt_r), 0)  AS f_payed_amt " +
                        "FROM( " +
                        "SELECT " + (i == 0 ? 1 : i) + " AS f_ann, " +
                        "vr.mon, vr.ben_day, vr.id_row, IF(vr.ben_bon_per = 0, 1, vr.ben_bon_per) AS f_bon_per " +
                        "FROM hrs_ben AS v " +
                        "INNER JOIN hrs_ben_row AS vr ON v.id_ben = vr.id_ben " +
                        "WHERE fk_tp_ben = " + mnFormSubtype + " AND v.id_ben = " + mnBenefitTableId + " AND " +
                        "vr.id_row = ( " +
                        "SELECT br.id_row " +
                        "FROM hrs_ben_row AS br " +
                        "WHERE br.id_ben = " + mnBenefitTableId + " AND mon >= " + (i == 0 ? 1 : i) + " * " + SHrsConsts.YEAR_MONTHS + " LIMIT 1)) AS t " +
                        "LEFT OUTER JOIN hrs_pay_rcp AS rcp ON rcp.id_emp = " + moEmployee.getPkEmployeeId() + " AND rcp.b_del = 0 " +
                        "LEFT OUTER JOIN hrs_pay_rcp_ear AS ear ON ear.id_pay = rcp.id_pay AND ear.id_emp = rcp.id_emp AND ear.b_del = 0 AND ear.fk_tp_ben = " + mnFormSubtype + " AND ear.ben_ann = " + (i == 0 ? 1 : i) + " " +
                        "GROUP BY f_ann, f_ann_ano ";

                resultSet = miClient.getSession().getStatement().executeQuery(sql);

                while (resultSet.next()) {
                    SRowBenefitCardex row = new SRowBenefitCardex(mnFormSubtype);
                    
                    row.setAnn(resultSet.getInt("f_ann"));
                    row.setAnnYear(resultSet.getInt("f_ann_ano"));
                    
                    if (mnFormSubtype == SModSysConsts.HRSS_TP_BEN_VAC_BON) {
                        days = getBenefitBonificationDays(i);
                    }
                    else {
                        days = resultSet.getInt("ben_day");
                    }
                    benefitBonPer = resultSet.getDouble("f_bon_per");
                    amount = days * benefitBonPer * mdPaymentDaily;
                    daysPayed = resultSet.getDouble("f_payed_unt");
                    amountPayed = resultSet.getDouble("f_payed_amt");
                    daysToPaid = days - daysPayed;
                    amountToPaid = amount - amountPayed;
                    
                    row.setDays(days);
                    row.setBenefitBonPer(benefitBonPer);
                    row.setDaysPayed(daysPayed);
                    row.setAmount(amount);
                    row.setAmountPayed(amountPayed);
                    row.setDaysToPaid(daysToPaid);
                    row.setAmountToPaid(amountToPaid);

                    rows.add(row);
                }
            }

            moGridBenefitSummary.populateGrid(rows, this);
            moGridBenefitSummary.clearSortKeys();
            moGridBenefitSummary.setSelectedGridRow(0);
        }
        catch (Exception e) {
            SLibUtils.showException(this, e);
        }
    }
    
    private void showBenefitDetail(SRowBenefitCardex rowBenefit) {
        Vector<SGridRow> rows = new Vector<>();
        String sql = "";
        ResultSet resultSet = null;

        try {
            sql = "SELECT IF(p.id_pay = 0,rcp_ear_cmp.dt, p.dt_end) f_dt, p.per_year, p.per AS f_period, IF(p.id_pay = 0,'', tp_pay.name) AS f_tp_pay, p.num AS f_num, IF(p.id_pay = 0,NULL, p.dt_sta) AS f_dt_sta, IF(p.id_pay = 0,NULL, p.dt_end) AS f_dt_end, rcp_ear.id_pay, rcp_ear.id_emp, rcp_ear.id_mov, rcp_ear.unt_all AS f_unt, rcp_ear.amt_r AS f_amt, " +
                    "rcp_ear.ts_usr_ins AS ts_usr_ins, rcp_ear.ts_usr_upd AS ts_usr_upd, ui.usr AS f_usr_ins, uu.usr AS f_usr_upd " +
                    "FROM " + SModConsts.TablesMap.get(SModConsts.HRS_PAY) + " AS p " +
                    "INNER JOIN " + SModConsts.TablesMap.get(SModConsts.HRS_PAY_RCP) + " AS rcp ON rcp.id_pay = p.id_pay " +
                    "INNER JOIN " + SModConsts.TablesMap.get(SModConsts.HRS_PAY_RCP_EAR) + " AS rcp_ear ON rcp_ear.id_pay = rcp.id_pay AND rcp_ear.id_emp = rcp.id_emp AND rcp_ear.b_del = 0 " +
                    "INNER JOIN " + SModConsts.TablesMap.get(SModConsts.HRSS_TP_PAY) + " AS tp_pay ON tp_pay.id_tp_pay = p.fk_tp_pay " +
                    "INNER JOIN " + SModConsts.TablesMap.get(SModConsts.USRU_USR) + " AS ui ON rcp_ear.fk_usr_ins = ui.id_usr " +
                    "INNER JOIN " + SModConsts.TablesMap.get(SModConsts.USRU_USR) + " AS uu ON rcp_ear.fk_usr_upd = uu.id_usr " +
                    "LEFT OUTER JOIN " + SModConsts.TablesMap.get(SModConsts.HRS_PAY_RCP_EAR_CMP) + " AS rcp_ear_cmp ON rcp_ear_cmp.id_pay = rcp_ear.id_pay AND rcp_ear_cmp.id_emp = rcp_ear.id_emp AND rcp_ear_cmp.id_mov = rcp_ear.id_mov " +
                    "WHERE (p.id_pay = 0 OR p.b_del = 0) AND rcp_ear.id_emp = " + moEmployee.getPkEmployeeId() + " AND rcp.b_del = 0 AND rcp_ear.fk_tp_ben = " + mnFormSubtype + " AND rcp_ear.ben_ann = " + rowBenefit.getAnn() + " AND " +
                    "rcp_ear.ben_year = " + rowBenefit.getAnnYear() + " " +
                    "ORDER BY f_dt, per_year, f_period, f_tp_pay, f_num, f_dt_sta, f_dt_end, rcp_ear.id_pay, rcp_ear.id_emp, rcp_ear.id_mov ";

            resultSet = miClient.getSession().getStatement().executeQuery(sql);

            while (resultSet.next()) {
                SRowBenefitDetailCardex row = new SRowBenefitDetailCardex(mnFormSubtype);
                row.setDate(resultSet.getDate("f_dt"));
                row.setYear(resultSet.getInt("per_year"));
                row.setPeriod(resultSet.getInt("f_period"));
                row.setPayrollType(resultSet.getString("f_tp_pay"));
                row.setNumber(resultSet.getString("f_num"));
                row.setDateStart(resultSet.getDate("f_dt_sta"));
                row.setDateEnd(resultSet.getDate("f_dt_end"));

                row.setDays(resultSet.getDouble("f_unt"));
                row.setAmount(resultSet.getDouble("f_amt"));
                row.setUserInsert(resultSet.getString("f_usr_ins"));
                row.setDateUserInsert(resultSet.getTimestamp("ts_usr_ins"));
                row.setUserUpdate(resultSet.getString("f_usr_upd"));
                row.setDateUserUpdate(resultSet.getTimestamp("ts_usr_upd"));

                rows.add(row);
            }

            moGridBenefitDetail.populateGrid(rows);
            moGridBenefitDetail.clearSortKeys();
            moGridBenefitDetail.setSelectedGridRow(0);
        }
        catch (Exception e) {
            SLibUtils.showException(this, e);
        }
    }
    
    private void initBenefit() {
        moTextEmployeeName.setValue(moEmployee.getAuxEmployee());
        moTextBenefitType.setValue(miClient.getSession().readField(SModConsts.HRSS_TP_BEN, new int[] { mnFormSubtype }, SDbRegistryUser.FIELD_NAME));
        moTextDateBenefit.setValue(SLibUtils.DateFormatDate.format(moEmployee.getDateBenefits()));
        moTextDateCut.setValue(SLibUtils.DateFormatDate.format(mtDateCut));
        moIntSeniority.setValue(mnAnniversary);
        moIntSeniorityDays.setValue(mnAnniversaryDays);
        //moIntSeniorityDays.setValue(mn);
        
        showBenefitsMoves();
    }
    
    public void setFormParams(final int employeeId, final int anniversary, final int anniversaryDays, final int benefitTableId, final Date dateCut) {
        moEmployee = (SDbEmployee) miClient.getSession().readRegistry(SModConsts.HRSU_EMP, new int[] { employeeId });
        moConfig = (SDbConfig) miClient.getSession().readRegistry(SModConsts.HRS_CFG, new int[] { SUtilConsts.BPR_CO_ID });
        
        mdPaymentDaily = moEmployee.getFkPaymentTypeId() == SModSysConsts.HRSS_TP_PAY_WEE ? moEmployee.getSalary() :
                (moConfig.isFornightStandard() ? ((moEmployee.getWage() * SHrsConsts.YEAR_MONTHS) / (SHrsConsts.FORNIGHT_FIXED_DAYS * SHrsConsts.YEAR_FORNIGHTS)) :
                ((moEmployee.getWage() * SHrsConsts.YEAR_MONTHS) / SHrsConsts.YEAR_DAYS));
        
        mnAnniversary = anniversary;
        mnAnniversaryDays = anniversaryDays;
        mnAnniversaryYear = anniversary;
        mnBenefitTableId = benefitTableId;
        mtDateCut = dateCut;
        
        initBenefit();
    }
    
    @Override
    public void addAllListeners() {
    }

    @Override
    public void removeAllListeners() {
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
    }

    @Override
    public Object getValue(final int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            if (moGridBenefitSummary.getTable().getSelectedRowCount() != -1) {
                loadAbsenceSelected();
            }
        }
    }
}
