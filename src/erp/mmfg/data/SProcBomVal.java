/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.mmfg.data;

import erp.data.SProcConstants;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;

/**
 *
 * @author Néstor Ávalos
 */
public class SProcBomVal extends erp.lib.data.SDataProcedure implements java.io.Serializable {

    public SProcBomVal() {
        super(SProcConstants.MFG_BOM_VAL);
    }

    @Override
    public int call(java.sql.Connection connection) {
        int nParam = 1;
        java.sql.CallableStatement callableStatement = null;

        mnLastDbActionResult = SLibConstants.UNDEFINED;

        try {
            callableStatement = connection.prepareCall("{ CALL mfg_bom_val(?, ?, ?) }");
            callableStatement.setInt(nParam, (Integer) mvParamsIn.get(nParam - 1)); nParam++;
            callableStatement.setString(nParam, (String) mvParamsIn.get(nParam - 1)); nParam++;
            callableStatement.registerOutParameter(nParam, java.sql.Types.INTEGER);
            callableStatement.execute();

            mvParamsOut.clear();
            mvParamsOut.add(callableStatement.getInt(nParam));
            mnLastDbActionResult = SLibConstants.DB_PROCEDURE_OK;
        }
        catch (java.sql.SQLException e) {
            mnLastDbActionResult = SLibConstants.DB_PROCEDURE_ERROR;
            SLibUtilities.printOutException(this, e);
        }
        catch (java.lang.Exception e) {
            mnLastDbActionResult = SLibConstants.DB_PROCEDURE_ERROR;
            SLibUtilities.printOutException(this, e);
        }

        return mnLastDbActionResult;
    }
}
