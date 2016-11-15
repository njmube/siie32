/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.fin.form;


import erp.client.SClientInterface;
import erp.data.SDataConstantsSys;
import erp.gui.account.SAccountConsts;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFormDialog;

/**
 *
 * @author Juan Barajas
 */
public class SDialogRepMovsFileCvs extends SBeanFormDialog implements ActionListener {
  /**
     * Creates new form SFormAccountingDeduction
     */
    public SDialogRepMovsFileCvs(SGuiClient client, int formType, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, formType, SLibConsts.UNDEFINED, title);
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
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jlStartDate = new javax.swing.JLabel();
        moDateStartDate = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel4 = new javax.swing.JPanel();
        jlEndDate = new javax.swing.JLabel();
        moDateEndDate = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        moPanelStartAccount = new erp.gui.account.SBeanPanelAccount();
        jPanel3 = new javax.swing.JPanel();
        moPanelEndAccount = new erp.gui.account.SBeanPanelAccount();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlStartDate.setText("Fecha inicial:");
        jlStartDate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel6.add(jlStartDate);
        jPanel6.add(moDateStartDate);

        jPanel12.add(jPanel6);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlEndDate.setText("Fecha final:");
        jlEndDate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlEndDate);
        jPanel4.add(moDateEndDate);

        jPanel12.add(jPanel4);

        jPanel9.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel13.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        jPanel8.setLayout(new java.awt.BorderLayout());

        moPanelStartAccount.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta contable inicial :"));
        jPanel8.add(moPanelStartAccount, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel8);

        jPanel3.setLayout(new java.awt.BorderLayout());

        moPanelEndAccount.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta contable final :"));
        jPanel3.add(moPanelEndAccount, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel3);

        jPanel10.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel14.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));
        jPanel14.add(jPanel5);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));
        jPanel14.add(jPanel7);

        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));
        jPanel14.add(jPanel19);

        jPanel11.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel11, java.awt.BorderLayout.SOUTH);

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
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlEndDate;
    private javax.swing.JLabel jlStartDate;
    private sa.lib.gui.bean.SBeanFieldDate moDateEndDate;
    private sa.lib.gui.bean.SBeanFieldDate moDateStartDate;
    private erp.gui.account.SBeanPanelAccount moPanelEndAccount;
    private erp.gui.account.SBeanPanelAccount moPanelStartAccount;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 560, 350);

        moDateStartDate.setDateSettings(miClient, SGuiUtils.getLabelName(jlStartDate.getText()), true);
        moDateEndDate.setDateSettings(miClient, SGuiUtils.getLabelName(jlEndDate.getText()), true);
        moPanelStartAccount.setPanelSettings((SGuiClient) miClient, SAccountConsts.TYPE_ACCOUNT, true, true, false);
        moPanelEndAccount.setPanelSettings((SGuiClient) miClient, SAccountConsts.TYPE_ACCOUNT, true, true, false);
        
        moPanelStartAccount.setAccountNameWidth(275);
        moPanelEndAccount.setAccountNameWidth(275);

        moPanelStartAccount.resetPanel();
        moPanelEndAccount.resetPanel();
        
        moDateStartDate.setValue(new Date());
        moDateEndDate.setValue(new Date());
        
        moFields.addField(moDateStartDate);
        moFields.addField(moDateEndDate);
        moFields.addField(moPanelStartAccount.getTextNumberFirst());
        
        moPanelStartAccount.setComponentPrevious(moDateEndDate);
        moPanelStartAccount.setComponentNext(moPanelEndAccount.getTextNumberFirst());
        moPanelEndAccount.setComponentPrevious(moPanelStartAccount.getTextNumberFirst());
        
        moFields.setFormButton(jbSave);
    }
    
    @Override
    protected void windowActivated() {
        if (mbFirstActivation) {
            mbFirstActivation = false;
            moPanelStartAccount.getTextNumberFirst().requestFocus();
        }
    }

    @Override
    public void addAllListeners() {
       
    }

    @Override
    public void removeAllListeners() {
        
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        addAllListeners();
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            validation = moPanelStartAccount.validatePanel();

            if (validation.isValid()) {
                validation = moPanelEndAccount.validatePanel();
                
                if (validation.isValid()) {
                    if (moPanelStartAccount.getSelectedAccount().getCodeStd().compareTo(moPanelEndAccount.getSelectedAccount().getCodeStd()) > 1) {
                        validation.setComponent(moPanelEndAccount);
                        validation.setMessage("El valor de la cuenta contable final debe ser mayor o igual al valor de la cuenta contable inicial.");
                    }
                    else if (moDateEndDate.getValue().compareTo(moDateStartDate.getValue()) < 0) {
                        validation.setMessage("La fecha final debe ser mayor o igual a la fecha inicial.");
                        validation.setComponent(moDateEndDate);
                    }
                }
            }
        }

        return validation;
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
      
    }

    @Override
    public void reloadCatalogues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void actionSave(){
        String sql = "";
        ResultSet resulSet = null;
        String buffer = "";
        Cursor cursor = getCursor();
        
         if (SGuiUtils.computeValidation(miClient, validateForm())) {
            try {
                miClient.getFileChooser().setSelectedFile(new File((mnFormType == SDataConstantsSys.TRNS_CT_DPS_SAL ? "Archivo CSV de ingresos contables " : "Archivo CSV de egresos contables " )  + ((SClientInterface) miClient).getSessionXXX().getFormatters().getFileNameDatetimeFormat().format(new java.util.Date()) + ".csv"));
                if (miClient.getFileChooser().showSaveDialog(miClient.getFrame()) == JFileChooser.APPROVE_OPTION) {
                    setCursor(new Cursor(Cursor.WAIT_CURSOR));

                    File file = new File(miClient.getFileChooser().getSelectedFile().getAbsolutePath());
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));

                    buffer = "\"EJERCICIO\",\"PERÍODO\",\"CLAVE \",\"CLIENTE\",\"SUCURSAL \",\"DOMICILIO OPERACIONES\",\"ID CANAL\",\"CANAL\"," +
                        "\"ID SEGMENTO\",\"SEGMENTO\",\"ID SUBSEGMENTO\",\"SUBSEGMENTO\",\"FECHA\",\"ENTREGA PROGRAMADA\",\"FOLIO DOC.\",\"REFERENCIA DOC.\",\"DOC. AFECTADO\",\"PARTIDA\",\"CÓDIGO ÍTEM GENÉRICO\",\"ÍTEM GENÉRICO\",\"CLAVE ÍTEM\",\"ÍTEM\"," +
                        "\"CANTIDAD NETA\",\"UNIDAD CANTIDAD\",\"PRECIO UNITARIO\",\"IMPORTE NETO\",\" MASA NETO(A)\",\"UNIDAD MASA \"," +
                        "\"ID AGENTE\",\"AGENTE\",\"ID RUTA\",\"RUTA\"," +
                        "\"ID PAÍS\",\"PAÍS\",\"PAÍS ABR\",\"ESTADO\",\"MUNICIPIO\",\"LOCALIDAD\"";

                    bw.write(SLibUtilities.textToAscii(buffer));
                 
                    sql += "SELECT YEAR(r.dt) AS f_year, MONTH(r.dt) AS f_month, cb.bp_key, b.bp, bb.bpb, bba.street, bba.street_num_ext, bba.neighborhood, bba.zip_code, " +
                        "bba.locality, bba.state  , ds.id_dist_chan, ds.dist_chan, mss.id_mkt_segm, ms.mkt_segm, mss.id_mkt_sub, mss.mkt_segm_sub, r.dt, d.dt_doc_delivery_n, " +
                        "IF ((COALESCE(re.fid_dps_adj_year_n, 0) = 0) AND (COALESCE(re.fid_dps_adj_doc_n, 0) = 0), CONCAT(d.num_ser, IF(length(d.num_ser) = 0, '', '-'), d.num), " +
                        "CONCAT(dd.num_ser, IF(length(dd.num_ser) = 0, '', '-'), dd.num) ) AS f_num, d.num_ref, re.sort_pos, ig.code, ig.igen, i.item_key, i.item, de.orig_qty AS f_qty, " +
                        "u.symbol,  de.price_u_cur AS price_u, " + (mnFormType == SDataConstantsSys.TRNS_CT_DPS_SAL ? "IF(re.credit > 0, re.credit , - re.debit)"  : "IF(re.debit > 0, re.debit , - re.credit)" ) + " as f_amt, " +
                        "SUM(IF(d.fid_cl_dps = 5, 0, de.mass)) AS f_unt, " +
                        " 'kg' AS f_unt_symbol, sa.id_bp AS f_sa_id, sa.bp AS f_sa, sr.id_sal_route, sr.sal_route, " +
                        "COALESCE(cty.id_cty, 1) AS f_id_cty, COALESCE(cty.cty, 'MÉXICO') AS f_cty, COALESCE(cty.cty_abbr, 'MX') AS f_cty_abbr, bba.state, bba.county, bba.locality, " +
                        "IF ((COALESCE(re.fid_dps_adj_year_n, 0) = 0) AND (COALESCE(re.fid_dps_adj_doc_n, 0) = 0), '', CONCAT(d.num_ser, IF(length(d.num_ser) = 0, '', '-'), d.num) ) AS f_num_afec " +
                        "FROM fin_rec AS r " +
                        "INNER JOIN fin_rec_ety AS re ON r.id_year = re.id_year and r.id_per = re.id_per and r.id_bkc = re.id_bkc and r.id_tp_rec=re.id_tp_rec and r.id_num = re.id_num " +
                        "INNER JOIN fin_acc AS a ON a.pk_acc = re.fk_acc " +
                        "LEFT OUTER JOIN erp.bpsu_bp AS b ON re.fid_bp_nr = b.id_bp " +
                        "LEFT OUTER JOIN erp.bpsu_bpb AS bb ON re.fid_bpb_n = bb.id_bpb " +
                        "LEFT OUTER JOIN erp.bpsu_bpb_add AS bba ON re.fid_bpb_n = bba.id_bpb " +
                        "LEFT OUTER JOIN erp.bpsu_bp_ct AS cb ON re.fid_bp_nr = cb.id_bp " +
                        "LEFT OUTER JOIN erp.itmu_item AS i ON re.fid_item_n = i.id_item " +
                        "LEFT OUTER JOIN erp.itmu_unit AS u ON re.fid_unit_n = u.id_unit " +
                        "LEFT OUTER JOIN erp.itmu_igen AS ig ON i.fid_igen = ig.id_igen " +
                        "LEFT OUTER JOIN erp.locu_cty AS cty ON bba.fid_cty_n = cty.id_cty " +
                        "LEFT OUTER JOIN mkt_cfg_cus AS cc ON b.id_bp = cc.id_cus " +
                        "LEFT OUTER JOIN mkt_cfg_cusb AS ccb ON bb.id_bpb = ccb.id_cusb " +
                        "LEFT OUTER JOIN mktu_tp_cus AS tc ON cc.fid_tp_cus = tc.id_tp_cus " +
                        "LEFT OUTER JOIN mktu_mkt_segm AS ms ON cc.fid_mkt_segm = ms.id_mkt_segm " +
                        "LEFT OUTER JOIN mktu_mkt_segm_sub AS mss ON cc.fid_mkt_segm = mss.id_mkt_segm AND cc.fid_mkt_sub = mss.id_mkt_sub " +
                        "LEFT OUTER JOIN mktu_dist_chan AS ds ON cc.fid_dist_chan = ds.id_dist_chan " +
                        "LEFT OUTER JOIN mktu_sal_route AS sr ON ccb.fid_sal_route = sr.id_sal_route " +
                        "LEFT OUTER JOIN erp.bpsu_bp AS sa ON cc.fid_sal_agt_n = sa.id_bp " +
                        "LEFT OUTER JOIN trn_dps AS d ON d.id_year = re.fid_dps_year_n and d.id_doc = re.fid_dps_doc_n " +
                        "LEFT OUTER JOIN trn_dps_ety AS de ON d.id_year = de.id_year AND d.id_doc = de.id_doc " +
                        "LEFT OUTER JOIN trn_dps AS dd ON dd.id_year = re.fid_dps_adj_year_n AND dd.id_doc = re.fid_dps_adj_doc_n " +
                        "WHERE r.dt BETWEEN '" + SLibUtils.DbmsDateFormatDate.format(moDateStartDate.getValue()) + "' AND '" + SLibUtils.DbmsDateFormatDate.format(moDateEndDate.getValue()) + "' AND r.b_del = 0 AND re.b_del = 0 AND " +
                        "a.code >= '" + moPanelStartAccount.getSelectedAccount().getCodeStd() + "' AND " +
                        "a.code <= '" + moPanelEndAccount.getSelectedAccount().getCodeStd() + "' " +    
                        "GROUP BY YEAR(r.dt), MONTH(r.dt),  b.bp, bb.bpb, bba.street, bba.street_num_ext, bba.neighborhood, bba.zip_code, " +
                        "bba.locality, bba.state, ds.id_dist_chan, ds.dist_chan, mss.id_mkt_segm, ms.mkt_segm, mss.id_mkt_sub, mss.mkt_segm_sub, r.dt, " +
                        "d.dt_doc_delivery_n, d.num_ser, d.num, d.num_ref, re.sort_pos, ig.code, ig.igen, i.item_key, i.item, u.symbol, re.debit_cur, " +
                        "sa.id_bp, sa.bp, sr.id_sal_route, sr.sal_route, cty.id_cty, cty.cty, cty.cty_abbr, bba.state, bba.county, bba.locality " +
                        "ORDER BY f_year,f_month, bp_key, bp, bpb, item_key, item, symbol, f_num, sort_pos ";
                    
                    resulSet = miClient.getSession().getStatement().executeQuery(sql);
                    
                    while (resulSet.next()) {
                        buffer = "";

                        buffer += resulSet.getString("f_year").replace("\"", "'") + ",";
                        buffer += resulSet.getString("f_month").replace("\"", "'") + ",";
                        buffer += resulSet.getString("bp_key") == null ? "," :"\"" + resulSet.getString("bp_key").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("bp") == null ? "," : "\"" + resulSet.getString("bp").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("bpb") == null ? "," : "\"" + resulSet.getString("bpb").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("street") == null ? "," : "\"" + resulSet.getString("street").replace("\"", "'") + ", " + resulSet.getString("street_num_ext").replace("\"", "'") + ", " + resulSet.getString("neighborhood").replace("\"", "'") + ", " + resulSet.getString("zip_code").replace("\"", "'") + ", " + resulSet.getString("locality").replace("\"", "'") + ", " + resulSet.getString("state").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("id_dist_chan") == null ? ",," : resulSet.getString("id_dist_chan").replace("\"", "'") + ",\"" + resulSet.getString("dist_chan").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("id_mkt_segm") == null ? ",," : resulSet.getString("id_mkt_segm").replace("\"", "'") + ",\"" + resulSet.getString("mkt_segm").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("id_mkt_sub") == null ? ",," : resulSet.getString("id_mkt_sub").replace("\"", "'") + ",\"" + resulSet.getString("mkt_segm_sub").replace("\"", "'") + "\",";
                        buffer += "\"" + resulSet.getDate("dt") + "\",";
                        buffer += resulSet.getString("dt_doc_delivery_n") == null ? "," : "\"" + resulSet.getString("dt_doc_delivery_n").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("f_num") == null ? "," : "\"" + resulSet.getString("f_num").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("num_ref") == null ? "," : "\"" + resulSet.getString("num_ref").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("f_num_afec") == null ? "," : "\"" + resulSet.getString("f_num_afec").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("sort_pos") == null ? "," : "\"" + resulSet.getString("sort_pos").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("code") == null ? "," : "\"" + resulSet.getString("code").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("igen") == null ? "," : "\"" + resulSet.getString("igen").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("item_key") == null ? "," : "\"" + resulSet.getString("item_key").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("item") == null ? "," : "\"" + resulSet.getString("item").replace("\"", "'") + "\",";
                        buffer += resulSet.getDouble("f_qty") + ",";
                        buffer += resulSet.getString("symbol") == null ? "," : "\"" + resulSet.getString("symbol").replace("\"", "'") + "\",";
                        buffer += resulSet.getDouble("price_u") + ",";
                        buffer += resulSet.getDouble("f_amt") + ","; 
                        buffer += resulSet.getDouble("f_unt") + ",";
                        buffer += resulSet.getString("f_unt_symbol") == null ? "," : "\"" + resulSet.getString("f_unt_symbol") + "\",";
                        buffer += resulSet.getString("f_sa_id") == null ? ",," : resulSet.getString("f_sa_id").replace("\"", "'") + ",\"" + resulSet.getString("f_sa").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("id_sal_route") == null ? ",," : resulSet.getString("id_sal_route").replace("\"", "'") + ",\"" + resulSet.getString("sal_route").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("f_id_cty").replace("\"", "'") + ",";
                        buffer += resulSet.getString("f_cty") == null ? "," : "\"" + resulSet.getString("f_cty").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("f_cty_abbr") == null ? "," : "\"" + resulSet.getString("f_cty_abbr").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("state") == null ? "," : "\"" + resulSet.getString("state").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("county") == null ? "," : "\"" + resulSet.getString("county").replace("\"", "'") + "\",";
                        buffer += resulSet.getString("locality") == null ? "," : "\"" + resulSet.getString("locality").replace("\"", "'") + "\"";

                        bw.write("\n");
                        bw.write(SLibUtilities.textToAscii(buffer));
                    }

                    bw.flush();
                    bw.close();

                    if (miClient.showMsgBoxConfirm(SLibConstants.MSG_INF_FILE_CREATE + file.getPath() + "\n" + SLibConstants.MSG_CNF_FILE_OPEN) == JOptionPane.YES_OPTION) {
                        SLibUtilities.launchFile(file.getPath());
                    }
                }
            
                dispose();
            }
            catch(HeadlessException | IOException | SQLException e) {
                SLibUtilities.renderException(this, e);
            }
            finally {
                setCursor(cursor);
            }
        }
    }
}