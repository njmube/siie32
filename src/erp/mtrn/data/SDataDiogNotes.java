/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.mtrn.data;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import erp.data.SDataConstants;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;

/**
 *
 * @author Sergio Flores
 */
public class SDataDiogNotes extends erp.lib.data.SDataRegistry implements java.io.Serializable {

    protected int mnPkYearId;
    protected int mnPkDocId;
    protected int mnPkNotesId;
    protected java.lang.String msNotes;
    protected boolean mbIsPrintable;
    protected boolean mbIsDeleted;
    protected int mnFkUserNewId;
    protected int mnFkUserEditId;
    protected int mnFkUserDeleteId;
    protected java.util.Date mtUserNewTs;
    protected java.util.Date mtUserEditTs;
    protected java.util.Date mtUserDeleteTs;

    protected java.lang.String msDbmsUserNew;
    protected java.lang.String msDbmsUserEdit;
    protected java.lang.String msDbmsUserDelete;

    public SDataDiogNotes() {
        super(SDataConstants.TRN_DIOG_NTS);
        reset();
    }

    public void setPkYearId(int n) { mnPkYearId = n; }
    public void setPkDocId(int n) { mnPkDocId = n; }
    public void setPkNotesId(int n) { mnPkNotesId = n; }
    public void setNotes(java.lang.String s) { msNotes = s; }
    public void setIsPrintable(boolean b) { mbIsPrintable = b; }
    public void setIsDeleted(boolean b) { mbIsDeleted = b; }
    public void setFkUserNewId(int n) { mnFkUserNewId = n; }
    public void setFkUserEditId(int n) { mnFkUserEditId = n; }
    public void setFkUserDeleteId(int n) { mnFkUserDeleteId = n; }
    public void setUserNewTs(java.util.Date t) { mtUserNewTs = t; }
    public void setUserEditTs(java.util.Date t) { mtUserEditTs = t; }
    public void setUserDeleteTs(java.util.Date t) { mtUserDeleteTs = t; }

    public int getPkYearId() { return mnPkYearId; }
    public int getPkDocId() { return mnPkDocId; }
    public int getPkNotesId() { return mnPkNotesId; }
    public java.lang.String getNotes() { return msNotes; }
    public boolean getIsPrintable() { return mbIsPrintable; }
    public boolean getIsDeleted() { return mbIsDeleted; }
    public int getFkUserNewId() { return mnFkUserNewId; }
    public int getFkUserEditId() { return mnFkUserEditId; }
    public int getFkUserDeleteId() { return mnFkUserDeleteId; }
    public java.util.Date getUserNewTs() { return mtUserNewTs; }
    public java.util.Date getUserEditTs() { return mtUserEditTs; }
    public java.util.Date getUserDeleteTs() { return mtUserDeleteTs; }

    public void setDbmsUserNew(java.lang.String s) { msDbmsUserNew = s; }
    public void setDbmsUserEdit(java.lang.String s) { msDbmsUserEdit = s; }
    public void setDbmsUserDelete(java.lang.String s) { msDbmsUserDelete = s; }

    public java.lang.String getDbmsUserNew() { return msDbmsUserNew; }
    public java.lang.String getDbmsUserEdit() { return msDbmsUserEdit; }
    public java.lang.String getDbmsUserDelete() { return msDbmsUserDelete; }

    @Override
    public void setPrimaryKey(java.lang.Object pk) {
        mnPkYearId = ((int[]) pk)[0];
        mnPkDocId = ((int[]) pk)[1];
        mnPkNotesId = ((int[]) pk)[2];
    }

    @Override
    public java.lang.Object getPrimaryKey() {
        return new int[] { mnPkYearId, mnPkDocId, mnPkNotesId };
    }

    @Override
    public void reset() {
        super.resetRegistry();

        mnPkYearId = 0;
        mnPkDocId = 0;
        mnPkNotesId = 0;
        msNotes = "";
        mbIsPrintable = false;
        mbIsDeleted = false;
        mnFkUserNewId = 0;
        mnFkUserEditId = 0;
        mnFkUserDeleteId = 0;
        mtUserNewTs = null;
        mtUserEditTs = null;
        mtUserDeleteTs = null;

        msDbmsUserNew = "";
        msDbmsUserEdit = "";
        msDbmsUserDelete = "";
    }

    @Override
    public int read(java.lang.Object pk, java.sql.Statement statement) {
        int[] key = (int[]) pk;
        String sql = "";
        ResultSet resultSet = null;

        mnLastDbActionResult = SLibConstants.UNDEFINED;
        reset();

        try {
            sql = "SELECT n.*, un.usr, ue.usr, ud.usr " +
                    "FROM trn_diog_nts AS n " +
                    "INNER JOIN erp.usru_usr AS un ON " +
                    "n.fid_usr_new = un.id_usr " +
                    "INNER JOIN erp.usru_usr AS ue ON " +
                    "n.fid_usr_edit = ue.id_usr " +
                    "INNER JOIN erp.usru_usr AS ud ON " +
                    "n.fid_usr_del = ud.id_usr " +
                    "WHERE n.id_year = " + key[0] + " AND n.id_doc = " + key[1] + " AND n.id_nts = " + key[2] +  " ";
            resultSet = statement.executeQuery(sql);
            if (!resultSet.next()) {
                throw new Exception(SLibConstants.MSG_ERR_REG_FOUND_NOT);
            }
            else {
                mnPkYearId = resultSet.getInt("n.id_year");
                mnPkDocId = resultSet.getInt("n.id_doc");
                mnPkNotesId = resultSet.getInt("n.id_nts");
                msNotes = resultSet.getString("n.nts");
                mbIsPrintable = resultSet.getBoolean("n.b_prt");
                mbIsDeleted = resultSet.getBoolean("n.b_del");
                mnFkUserNewId = resultSet.getInt("n.fid_usr_new");
                mnFkUserEditId = resultSet.getInt("n.fid_usr_edit");
                mnFkUserDeleteId = resultSet.getInt("n.fid_usr_del");
                mtUserNewTs = resultSet.getTimestamp("n.ts_new");
                mtUserEditTs = resultSet.getTimestamp("n.ts_edit");
                mtUserDeleteTs = resultSet.getTimestamp("n.ts_del");

                msDbmsUserNew = resultSet.getString("un.usr");
                msDbmsUserEdit = resultSet.getString("ue.usr");
                msDbmsUserDelete = resultSet.getString("ud.usr");

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
        CallableStatement callableStatement = null;

        mnLastDbActionResult = SLibConstants.UNDEFINED;

        try {
            callableStatement = connection.prepareCall(
                    "{ CALL trn_diog_nts_save(" +
                    "?, ?, ?, ?, ?, ?, ?, ?, ?) }");
            callableStatement.setInt(nParam++, mnPkYearId);
            callableStatement.setInt(nParam++, mnPkDocId);
            callableStatement.setInt(nParam++, mnPkNotesId);
            callableStatement.setString(nParam++, msNotes);
            callableStatement.setBoolean(nParam++, mbIsPrintable);
            callableStatement.setBoolean(nParam++, mbIsDeleted);
            callableStatement.setInt(nParam++, mbIsRegistryNew ? mnFkUserNewId : mnFkUserEditId);
            callableStatement.registerOutParameter(nParam++, java.sql.Types.SMALLINT);
            callableStatement.registerOutParameter(nParam++, java.sql.Types.VARCHAR);
            callableStatement.execute();

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
        catch (java.lang.Exception e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_SAVE_ERROR;
            SLibUtilities.printOutException(this, e);
        }

        return mnLastDbActionResult;
    }

    @Override
    public java.util.Date getLastDbUpdate() {
        return mtUserEditTs;
    }

    @Override
    public SDataDiogNotes clone() throws CloneNotSupportedException {
        SDataDiogNotes registry = new SDataDiogNotes();

        registry.setPkYearId(this.getPkYearId());
        registry.setPkDocId(this.getPkDocId());
        registry.setPkNotesId(this.getPkNotesId());
        registry.setNotes(this.getNotes());
        registry.setIsPrintable(this.getIsPrintable());
        registry.setIsDeleted(this.getIsDeleted());
        registry.setFkUserNewId(this.getFkUserNewId());
        registry.setFkUserEditId(this.getFkUserEditId());
        registry.setFkUserDeleteId(this.getFkUserDeleteId());
        registry.setUserNewTs(this.getUserNewTs());
        registry.setUserEditTs(this.getUserEditTs());
        registry.setUserDeleteTs(this.getUserDeleteTs());

        registry.setDbmsUserNew(this.getDbmsUserNew());
        registry.setDbmsUserEdit(this.getDbmsUserEdit());
        registry.setDbmsUserDelete(this.getDbmsUserDelete());

        return registry;
    }
}
