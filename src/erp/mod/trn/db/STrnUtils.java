/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.trn.db;

import erp.data.SDataConstantsSys;
import erp.lib.SLibConstants;
import erp.mod.SModConsts;
import erp.mod.SModSysConsts;
import java.sql.ResultSet;
import java.util.Date;
import sa.gui.util.SUtilConsts;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.gui.SGuiSession;

/**
 *
 * @author Sergio Flores
 */
public abstract class STrnUtils {

    public static String getDpsCategoryName(final int idCategory, final int number) {
        String name = "";

        switch (idCategory) {
            case SModSysConsts.TRNS_CT_DPS_PUR:
                name = number == SUtilConsts.NUM_SNG ? "Compra" : "Compras";
                break;
            case SModSysConsts.TRNS_CT_DPS_SAL:
                name = number == SUtilConsts.NUM_SNG ? "Venta" : "Ventas";
                break;
            default:
        }

        return name;
    }

    public static int getBizPartnerCategoryId(final int idDpsCategory) {
        int idCategory = SLibConsts.UNDEFINED;

        switch (idDpsCategory) {
            case SModSysConsts.TRNS_CT_DPS_PUR:
                idCategory = SModSysConsts.BPSS_CT_BP_SUP;
                break;
            case SModSysConsts.TRNS_CT_DPS_SAL:
                idCategory = SModSysConsts.BPSS_CT_BP_CUS;
                break;
            default:
        }

        return idCategory;
    }

    public static double obtainLastPriceForSupplierItem(final SGuiSession session, final int nDpsCategory, final int pnItemId,
            final String psBizPartnersIds) throws java.lang.Exception {
        double dItemDiscountUnitaryCur = 0;
        String sql = "";
        ResultSet resultSet = null;

        sql = "SELECT d.fid_bp_r, d.dt_doc, de.price_u_cur, de.disc_u_cur " +
            "FROM trn_dps AS d " +
            "INNER JOIN trn_dps_ety AS de ON d.id_year = " + session.getCurrentYear() + " AND d.b_del = FALSE AND de.b_del = FALSE AND d.id_year = de.id_year AND " +
            "d.id_doc = de.id_doc AND d.fid_bp_r IN (" + psBizPartnersIds + ") AND de.fid_item = " + pnItemId + " AND " +
            (nDpsCategory == SModSysConsts.TRNS_CT_DPS_PUR ? "d.fid_ct_dps = " + SDataConstantsSys.TRNU_TP_DPS_PUR_ORD[0] + " AND " + "d.fid_cl_dps = " + SDataConstantsSys.TRNU_TP_DPS_PUR_ORD[1] + " AND " +
            "d.fid_tp_dps = " + SDataConstantsSys.TRNU_TP_DPS_PUR_ORD[2] : "d.fid_ct_dps = " + SDataConstantsSys.TRNU_TP_DPS_SAL_ORD[0] + " AND " +
            "d.fid_cl_dps = " + SDataConstantsSys.TRNU_TP_DPS_SAL_ORD[1] + " AND " +
            "d.fid_tp_dps = " + SDataConstantsSys.TRNU_TP_DPS_SAL_ORD[2]) + " " +
            " AND d.fid_st_dps = " + SDataConstantsSys.TRNS_ST_DPS_EMITED + " " +
            "GROUP BY d.id_year, d.id_doc " +
            "ORDER BY de.tot_r ASC, d.dt_doc DESC ";

        resultSet = session.getStatement().executeQuery(sql);
        if (resultSet.next()) {
            dItemDiscountUnitaryCur = resultSet.getObject(1) == null ? 0d : resultSet.getDouble(1);
        }

        return dItemDiscountUnitaryCur;
    }

    public static int obtainNextNumberForDps(SGuiSession session, String series, int[] docClassTypeKey) throws java.lang.Exception {
        int number = 0;
        String sql = "";
        ResultSet resultSet = null;

        sql = "SELECT MAX(CONVERT(num, UNSIGNED INTEGER)) + 1 AS f_num FROM trn_dps " +
                "WHERE fid_ct_dps = " + ((int[]) docClassTypeKey)[0] + " AND fid_cl_dps = " + ((int[]) docClassTypeKey)[1] + " AND " +
                (((int[]) docClassTypeKey).length <= 2 ? "" : "fid_tp_dps = " + ((int[]) docClassTypeKey)[2] + " AND ") +
                "num_ser = '" + series + "' AND b_del = 0 ";

        resultSet = session.getStatement().executeQuery(sql);
        if (resultSet.next()) {
            if (resultSet.getObject("f_num") != null) {
                number = resultSet.getInt("f_num");
            }
        }

        return number;
    }

    public static double obtainExchangeRate(SGuiSession session, int currencyId, Date date) throws java.lang.Exception {
        double rate = 0;
        String sql = "";
        ResultSet resultSet = null;

        sql = "SELECT exc_rate FROM fin_exc_rate WHERE id_cur = " + currencyId + " AND " +
                "id_dt = '" + SLibUtils.DbmsDateFormatDate.format(date) + "' AND b_del = FALSE ";

        resultSet = session.getStatement().executeQuery(sql);
        if (resultSet.next()) {
            rate = resultSet.getDouble("exc_rate");
        }

        return rate;
    }

    public static java.lang.String obtainCostCenterItem(SGuiSession session, int nItemId) throws java.lang.Exception {
        String sql = "";
        ResultSet resultSet = null;
        String costCenter = "";

        sql = "SELECT cci.id_tp_link, cci.fid_cc " +
                "FROM fin_cc_item AS cci WHERE cci.b_del = 0 AND (" +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_ITEM + " AND cci.id_ref = " + nItemId + ") OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_MFR + " AND cci.id_ref IN (SELECT i.fid_mfr FROM erp.itmu_item AS i WHERE i.id_item = " + nItemId + ")) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_BRD + " AND cci.id_ref IN (SELECT i.fid_brd FROM erp.itmu_item AS i WHERE i.id_item = " + nItemId + ")) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_LINE + " AND cci.id_ref IN (SELECT i.fid_line_n FROM erp.itmu_item AS i WHERE i.id_item = " + nItemId + ")) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_IGEN + " AND cci.id_ref IN (SELECT i.fid_igen FROM erp.itmu_item AS i WHERE i.id_item = " + nItemId + ")) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_IGRP + " AND cci.id_ref IN (SELECT igen.fid_igrp FROM erp.itmu_igen AS igen INNER JOIN erp.itmu_item AS i ON igen.id_igen = i.fid_igen AND i.id_item = " + nItemId + ")) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_IFAM + " AND cci.id_ref IN (SELECT igrp.fid_ifam FROM erp.itmu_igrp AS igrp INNER JOIN erp.itmu_igen AS igen ON igrp.id_igrp = igen.fid_igrp INNER JOIN erp.itmu_item AS i ON igen.id_igen = i.fid_igen AND i.id_item = " + nItemId + ")) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_TP_ITEM + " AND cci.id_ref IN (SELECT itp.tp_idx FROM erp.itmu_igen AS igen INNER JOIN erp.itmu_item AS i ON igen.id_igen = i.fid_igen AND i.id_item = " + nItemId + " INNER JOIN erp.itms_tp_item AS itp ON igen.fid_ct_item = itp.id_ct_item AND igen.fid_cl_item = itp.id_cl_item AND igen.fid_tp_item = itp.id_tp_item)) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_CL_ITEM + " AND cci.id_ref IN (SELECT icl.cl_idx FROM erp.itmu_igen AS igen INNER JOIN erp.itmu_item AS i ON igen.id_igen = i.fid_igen AND i.id_item = " + nItemId + " INNER JOIN erp.itms_cl_item AS icl ON igen.fid_ct_item = icl.id_ct_item AND igen.fid_cl_item = icl.id_cl_item)) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_CT_ITEM + " AND cci.id_ref IN (SELECT ict.ct_idx FROM erp.itmu_igen AS igen INNER JOIN erp.itmu_item AS i ON igen.id_igen = i.fid_igen AND i.id_item = " + nItemId + " INNER JOIN erp.itms_ct_item AS ict ON igen.fid_ct_item = ict.id_ct_item)) OR " +
                "(cci.id_tp_link = " + SDataConstantsSys.TRNS_TP_LINK_ALL + " AND cci.id_ref = " + SLibConstants.UNDEFINED + ")) " +
                "ORDER BY cci.id_tp_link DESC ";

        resultSet = session.getStatement().executeQuery(sql);
        if (resultSet.next()) {
            costCenter = resultSet.getString("cci.fid_cc");
        }

        return costCenter;
    }

    public static int[] getDpsKey(final SGuiSession session, final int idDpsCategory, final int[] keyBizPartner, final String series, final String number) {
        int[] key = null;
        String sql = "";
        ResultSet resultSet = null;

        try {
            sql = "SELECT id_year, id_doc "
                    + "FROM " + SModConsts.TablesMap.get(SModConsts.TRN_DPS) + " "
                    + "WHERE fid_ct_dps = " + idDpsCategory + " AND fid_bp_r = " + keyBizPartner[0] + " AND b_del = 0 AND "
                    + "num_ser = '" + series + "' AND num = '" + number + "' ";
            resultSet = session.getStatement().executeQuery(sql);
            if (resultSet.next()) {
                key = new int[] { resultSet.getInt(1), resultSet.getInt(2) };
            }
        }
        catch (Exception e) {
            SLibUtils.showException(STrnUtils.class.getName(), e);
        }

        return key;
    }
}
