/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.mfin.data;

import erp.data.SDataConstants;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;

/**
 *
 * @author Sergio Flores
 */
public class SDataAccountItemEntry extends erp.lib.data.SDataRegistry implements java.io.Serializable {

    protected int mnPkAccountItemId;
    protected int mnPkAccountItemTypeId;
    protected int mnPkEntryId;
    protected double mdPercentage;
    protected java.lang.String msFkAccountId_n;
    protected java.lang.String msFkCostCenterId_n;
    protected int mnFkBookkeepingRegistryTypeId;

    protected java.lang.String msDbmsAccountItem;
    protected java.lang.String msDbmsAccountItemType;
    protected java.lang.String msDbmsAccount_n;
    protected java.lang.String msDbmsCostCenter_n;
    protected java.lang.String msDbmsBookkeepingRegistryType;

    public SDataAccountItemEntry() {
        super(SDataConstants.FIN_ACC_ITEM_ETY);
        reset();
    }

    public void setPkAccountItemId(int n) { mnPkAccountItemId = n; }
    public void setPkAccountItemTypeId(int n) { mnPkAccountItemTypeId = n; }
    public void setPkEntryId(int n) { mnPkEntryId = n; }
    public void setPercentage(double d) { mdPercentage = d; }
    public void setFkAccountId_n(java.lang.String s) { msFkAccountId_n = s; }
    public void setFkCostCenterId_n(java.lang.String s) { msFkCostCenterId_n = s; }
    public void setFkBookkeepingRegistryTypeId(int n) { mnFkBookkeepingRegistryTypeId = n; }

    public int getPkAccountItemId() { return mnPkAccountItemId; }
    public int getPkAccountItemTypeId() { return mnPkAccountItemTypeId; }
    public int getPkEntryId() { return mnPkEntryId; }
    public double getPercentage() { return mdPercentage; }
    public java.lang.String getFkAccountId_n() { return msFkAccountId_n; }
    public java.lang.String getFkCostCenterId_n() { return msFkCostCenterId_n; }
    public int getFkBookkeepingRegistryTypeId() { return mnFkBookkeepingRegistryTypeId; }

    public void setDbmsAccountItem(java.lang.String s) { msDbmsAccountItem = s; }
    public void setDbmsAccountItemType(java.lang.String s) { msDbmsAccountItemType = s; }
    public void setDbmsAccount_n(java.lang.String s) { msDbmsAccount_n = s; }
    public void setDbmsCostCenter_n(java.lang.String s) { msDbmsCostCenter_n = s; }
    public void setDbmsBookkeepingRegistryType(java.lang.String s) { msDbmsBookkeepingRegistryType = s; }

    public java.lang.String getDbmsAccountItem() { return msDbmsAccountItem; }
    public java.lang.String getDbmsAccountItemType() { return msDbmsAccountItemType; }
    public java.lang.String getDbmsAccount_n() { return msDbmsAccount_n; }
    public java.lang.String getDbmsCostCenter_n() { return msDbmsCostCenter_n; }
    public java.lang.String getDbmsBookkeepingRegistryType() { return msDbmsBookkeepingRegistryType; }

    @Override
    public void setPrimaryKey(java.lang.Object pk) {
        mnPkAccountItemId = ((int[]) pk)[0];
        mnPkAccountItemTypeId = ((int[]) pk)[1];
        mnPkEntryId = ((int[]) pk)[2];
    }

    @Override
    public java.lang.Object getPrimaryKey() {
        return new int[] { mnPkAccountItemId, mnPkAccountItemTypeId, mnPkEntryId };
    }

    @Override
    public void reset() {
        super.resetRegistry();

        mnPkAccountItemId = 0;
        mnPkAccountItemTypeId = 0;
        mnPkEntryId = 0;
        mdPercentage = 0;
        msFkAccountId_n = "";
        msFkCostCenterId_n = "";
        mnFkBookkeepingRegistryTypeId = 0;

        msDbmsAccountItem = "";
        msDbmsAccountItemType = "";
        msDbmsAccount_n = "";
        msDbmsCostCenter_n = "";
        msDbmsBookkeepingRegistryType = "";
    }

    @Override
    public int read(java.lang.Object pk, java.sql.Statement statement) {
        int[] key = (int[]) pk;
        java.lang.String sql = "";
        java.sql.ResultSet resultSet = null;

        mnLastDbActionResult = SLibConstants.UNDEFINED;
        reset();

        try {
            sql = "SELECT e.*, ai.acc_item, ait.tp_acc_item, b.tp_bkr, a.acc, c.cc " +
                    "FROM fin_acc_item_ety AS e " +
                    "INNER JOIN fin_acc_item AS ai ON e.id_acc_item = ai.id_acc_item " +
                    "INNER JOIN erp.fins_tp_acc_item AS ait ON e.id_tp_acc_item = ait.id_tp_acc_item " +
                    "INNER JOIN erp.fins_tp_bkr AS b ON e.fid_tp_bkr = b.id_tp_bkr " +
                    "LEFT OUTER JOIN fin_acc AS a ON e.fid_acc_n = a.id_acc " +
                    "LEFT OUTER JOIN fin_cc AS c ON e.fid_cc_n = c.id_cc " +
                    "WHERE e.id_acc_item = " + key[0] + " AND e.id_tp_acc_item = " + key[1] + " AND e.id_ety = " + key[2] + " ";
            resultSet = statement.executeQuery(sql);
            if (!resultSet.next()) {
                throw new Exception(SLibConstants.MSG_ERR_REG_FOUND_NOT);
            }
            else {
                mnPkAccountItemId = resultSet.getInt("e.id_acc_item");
                mnPkAccountItemTypeId = resultSet.getInt("e.id_tp_acc_item");
                mnPkEntryId = resultSet.getInt("e.id_ety");
                mdPercentage = resultSet.getDouble("e.per");
                msFkAccountId_n = resultSet.getString("e.fid_acc_n");
                if (resultSet.wasNull()) {
                    msFkAccountId_n = "";
                }
                msFkCostCenterId_n = resultSet.getString("e.fid_cc_n");
                if (resultSet.wasNull()) {
                    msFkCostCenterId_n = "";
                }
                mnFkBookkeepingRegistryTypeId = resultSet.getInt("fid_tp_bkr");

                msDbmsAccountItem = resultSet.getString("ai.acc_item");
                msDbmsAccountItemType = resultSet.getString("ait.tp_acc_item");
                msDbmsAccount_n = resultSet.getString("a.acc");
                if (resultSet.wasNull()) {
                    msDbmsAccount_n = "";
                }
                msDbmsCostCenter_n = resultSet.getString("c.cc");
                if (resultSet.wasNull()) {
                    msDbmsCostCenter_n = "";
                }
                msDbmsBookkeepingRegistryType = resultSet.getString("b.tp_bkr");

                mbIsRegistryNew = false;
                mnLastDbActionResult = SLibConstants.DB_ACTION_READ_OK;
            }
        }
        catch (java.sql.SQLException e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_READ_ERROR;
            SLibUtilities.printOutException(this, e);
        }
        catch (java.lang.Exception e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_READ_ERROR;
            SLibUtilities.printOutException(this, e);
        }

        return mnLastDbActionResult;
    }

    @Override
    public int save(java.sql.Connection connection) {
        int nParam = 1;
        java.sql.CallableStatement callableStatement = null;

        mnLastDbActionResult = SLibConstants.UNDEFINED;

        try {
            callableStatement = connection.prepareCall(
                    "{ CALL fin_acc_item_ety_save(" +
                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }");
            callableStatement.setInt(nParam++, mnPkAccountItemId);
            callableStatement.setInt(nParam++, mnPkAccountItemTypeId);
            callableStatement.setInt(nParam++, mnPkEntryId);
            callableStatement.setDouble(nParam++, mdPercentage);
            if (msFkAccountId_n.length() > 0) callableStatement.setString(nParam++, msFkAccountId_n); else callableStatement.setNull(nParam++, java.sql.Types.CHAR);
            if (msFkCostCenterId_n.length() > 0) callableStatement.setString(nParam++, msFkCostCenterId_n); else callableStatement.setNull(nParam++, java.sql.Types.CHAR);
            callableStatement.setInt(nParam++, mnFkBookkeepingRegistryTypeId);
            callableStatement.registerOutParameter(nParam++, java.sql.Types.SMALLINT);
            callableStatement.registerOutParameter(nParam++, java.sql.Types.SMALLINT);
            callableStatement.registerOutParameter(nParam++, java.sql.Types.CHAR);
            callableStatement.execute();

            mnPkEntryId = callableStatement.getInt(nParam - 3);
            mnDbmsErrorId = callableStatement.getInt(nParam - 2);
            msDbmsError = callableStatement.getString(nParam - 1);

            if (mnDbmsErrorId != 0) {
                throw new Exception(msDbmsError);
            }
            else {
                mbIsRegistryNew = false;
                mnLastDbActionResult = SLibConstants.DB_ACTION_SAVE_OK;
            }
        }
        catch (java.sql.SQLException e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_SAVE_ERROR;
            SLibUtilities.printOutException(this, e);
        }
        catch (java.lang.Exception e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_SAVE_ERROR;
            SLibUtilities.printOutException(this, e);
        }

        return mnLastDbActionResult;
    }

    @Override
    public java.util.Date getLastDbUpdate() {
        return null;
    }
}
