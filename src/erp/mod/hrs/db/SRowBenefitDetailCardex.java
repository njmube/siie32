/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.mod.hrs.db;

import erp.mod.SModSysConsts;
import java.util.Date;
import sa.lib.grid.SGridRow;

/**
 *
 * @author Juan Barajas
 */
public class SRowBenefitDetailCardex implements SGridRow {

    protected Date mtDate;
    protected int mnRowType;
    protected int mnYear;
    protected int mnPeriod;
    protected String msPayrollType;
    protected String msNumber;
    protected Date mtDateStart;
    protected Date mtDateEnd;
    protected double mdDays;
    protected double mdAmount;
    protected String msUserInsert;
    protected Date mtDateUserInsert;
    protected String msUserUpdate;
    protected Date mtDateUserUpdate;

    public SRowBenefitDetailCardex(int rowType) {
        mtDate = null;
        mnRowType = rowType;
        mnYear = 0;
        mnPeriod = 0;
        msPayrollType = "";
        msNumber = "";
        mtDateStart = null;
        mtDateEnd = null;
        mdDays = 0;
        mdAmount = 0;
        msUserInsert = "";
        mtDateUserInsert = null;
        msUserUpdate = "";
        mtDateUserUpdate = null;
    }

    public void setDate(Date t) { mtDate = t; }
    public void setRowType(int n) { mnRowType = n; }
    public void setYear(int n) { mnYear = n; }
    public void setPeriod(int n) { mnPeriod = n; }
    public void setPayrollType(String s) { msPayrollType = s; }
    public void setNumber(String s) { msNumber = s; }
    public void setDateStart(Date t) { mtDateStart = t; }
    public void setDateEnd(Date t) { mtDateEnd = t; }
    public void setDays(double d) { mdDays = d; }
    public void setAmount(double d) { mdAmount = d; }
    public void setUserInsert(String s) { msUserInsert = s; }
    public void setDateUserInsert(Date t) { mtDateUserInsert = t; }
    public void setUserUpdate(String s) { msUserUpdate = s; }
    public void setDateUserUpdate(Date t) { mtDateUserUpdate = t; }

    public Date getDate() { return mtDate; }
    public int getRowType() { return mnRowType; }
    public int getYear() { return mnYear; }
    public int getPeriod() { return mnPeriod; }
    public String getPayrollType() { return msPayrollType; }
    public String getNumber() { return msNumber; }
    public Date getDateStart() { return mtDateStart; }
    public Date getDateEnd() { return mtDateEnd; }
    public double getDays() { return mdDays; }
    public double getAmount() { return mdAmount; }
    public String getUserInsert() { return msUserInsert; }
    public Date getDateUserInsert() { return mtDateUserInsert; }
    public String getUserUpdate() { return msUserUpdate; }
    public Date getDateUserUpdate() { return mtDateUserUpdate; }

    @Override
    public int[] getRowPrimaryKey() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getRowCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getRowName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isRowSystem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isRowDeletable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isRowEdited() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRowEdited(final boolean edited) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getRowValueAt(int row) {
        Object value = null;

        if (mnRowType == SModSysConsts.HRSS_TP_BEN_VAC_BON) {
            switch(row) {
                case 0:
                    value = mtDate;
                    break;
                case 1:
                    value = mnYear;
                    break;
                case 2:
                    value = mnPeriod;
                    break;
                case 3:
                    value = msPayrollType;
                    break;
                case 4:
                    value = msNumber;
                    break;
                case 5:
                    value = mtDateStart;
                    break;
                case 6:
                    value = mtDateEnd;
                    break;
                case 7:
                    value = mdAmount;
                    break;
                case 8:
                    value = msUserInsert;
                    break;
                case 9:
                    value = mtDateUserInsert;
                    break;
                case 10:
                    value = msUserUpdate;
                    break;
                case 11:
                    value = mtDateUserUpdate;
                    break;
                default:
            }
        }
        else { 
            switch(row) {
                case 0:
                    value = mtDate;
                    break;
                case 1:
                    value = mnYear;
                    break;
                case 2:
                    value = mnPeriod;
                    break;
                case 3:
                    value = msPayrollType;
                    break;
                case 4:
                    value = msNumber;
                    break;
                case 5:
                    value = mtDateStart;
                    break;
                case 6:
                    value = mtDateEnd;
                    break;
                case 7:
                    value = mdDays;
                    break;
                case 8:
                    value = mdAmount;
                    break;
                case 9:
                    value = msUserInsert;
                    break;
                case 10:
                    value = mtDateUserInsert;
                    break;
                case 11:
                    value = msUserUpdate;
                    break;
                case 12:
                    value = mtDateUserUpdate;
                    break;
                default:
            }
        }

        return value;
    }

    @Override
    public void setRowValueAt(Object o, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
