/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.hrs.db.SRowDepartamentPanel;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JCheckBox;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.grid.SGridColumnForm;
import sa.lib.grid.SGridConsts;
import sa.lib.grid.SGridPaneForm;
import sa.lib.grid.SGridRow;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanPanel;

/**
 *
 * @author JBarajas
 */
public class SPanelHrsDepartaments extends SBeanPanel implements ItemListener {

    protected SGridPaneForm moGridDepartamentsRow;
    protected JCheckBox mjchSelectAll;
    protected int mnNumberDepartamentsSelects;
    protected boolean mbIsSelectedAll;
    protected String msDepartamentsSelectedsId;
    protected String msDepartamentsSelectedsName;
    
    /**
     * Creates new form SPanelHrsDepartaments
     */
    public SPanelHrsDepartaments(final SGuiClient client) {
        setPanelSettings(client);
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

        jpDepartaments = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jpDepartaments.setLayout(new java.awt.BorderLayout());
        add(jpDepartaments, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsCustom() {
        mjchSelectAll = new JCheckBox("Todos");
        mjchSelectAll.addItemListener(this);
        mnNumberDepartamentsSelects = 0;
        mbIsSelectedAll = false;
        msDepartamentsSelectedsId = "";
        msDepartamentsSelectedsName = "";
        
        moGridDepartamentsRow = new SGridPaneForm(miClient, SModConsts.HRSX_PAY_REC_EAR, SLibConsts.UNDEFINED, "Departamentos") {
            @Override
            public void initGrid() {
                setRowButtonsEnabled(false, false, false);
            }

            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                SGridColumnForm columnForm = null;
                ArrayList<SGridColumnForm> gridColumnsForm = new ArrayList<SGridColumnForm>();

                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_CODE_CAT, "Código departamento"));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_CAT_L, "Departamento"));
                columnForm = new SGridColumnForm(SGridConsts.COL_TYPE_BOOL_S, "Seleccionado", moGridDepartamentsRow.getTable().getDefaultEditor(Boolean.class));
                columnForm.setEditable(true);
                gridColumnsForm.add(columnForm);
                
                //moGridEmployeeRow.getTable().getDefaultEditor(Boolean.class).addCellEditorListener(SDialogPayrollEarnings.this);
                
                return gridColumnsForm;
            }
        };
        moGridDepartamentsRow.getPanelCommandsSys(SGuiConsts.PANEL_RIGHT).add(mjchSelectAll, 0);
        
        moGridDepartamentsRow.setForm(null);
        moGridDepartamentsRow.setPaneFormOwner(null);
        jpDepartaments.add(moGridDepartamentsRow, BorderLayout.CENTER);
        //mvFormGrids.add(moGridDepartamentsRow);
        
        populateDepartaments();
    }
    
    private void getDepartaments() {
        SRowDepartamentPanel payRow = null;
        msDepartamentsSelectedsId = "";
        msDepartamentsSelectedsName = "";
        mnNumberDepartamentsSelects = 0;
        mbIsSelectedAll = false;
        
        for (SGridRow row : moGridDepartamentsRow.getModel().getGridRows()) {
            payRow = (SRowDepartamentPanel) row;
            
            if (payRow.isSelected()) {
                msDepartamentsSelectedsId += (msDepartamentsSelectedsId.length() == 0 ? "" : ", ") + payRow.getDepartamentId();
                msDepartamentsSelectedsName += (msDepartamentsSelectedsName.length() == 0 ? "" : ", ") + payRow.getDepartamentName();
                mnNumberDepartamentsSelects++;
            }
        }
        
        mbIsSelectedAll = mnNumberDepartamentsSelects == moGridDepartamentsRow.getModel().getRowCount();
    }
    
    private void itemStateChangedSelectAll() {
        SRowDepartamentPanel payRow = null;
        
        for (SGridRow row : moGridDepartamentsRow.getModel().getGridRows()) {
            payRow = (SRowDepartamentPanel) row;
            payRow.setIsSelected(mjchSelectAll.isSelected());
        }
        moGridDepartamentsRow.renderGridRows();
        moGridDepartamentsRow.setSelectedGridRow(0);
    }
    
    private void populateDepartaments() {
        String sql = "";
        ResultSet resultSet = null;
        Vector<SGridRow> rows = new Vector<SGridRow>();
        SRowDepartamentPanel departament = null;
        
        moGridDepartamentsRow.getModel().clearGridRows();
        moGridDepartamentsRow.getModel().clearGrid();
        
        try {
            sql = "SELECT id_dep, code, name "
                    + "FROM " + SModConsts.TablesMap.get(SModConsts.HRSU_DEP) + " "
                    + "WHERE b_del = 0 "
                    + "ORDER BY code, name, id_dep ";

            resultSet = miClient.getSession().getStatement().getConnection().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                departament = new SRowDepartamentPanel(resultSet.getInt("id_dep"));

                departament.setDepartamentCode(resultSet.getString("code"));
                departament.setDepartamentName(resultSet.getString("name"));

                rows.add(departament);
            }
        }
        catch (Exception e) {
            SLibUtils.printException(this, e);
        }
        
        moGridDepartamentsRow.populateGrid(rows);
        moGridDepartamentsRow.clearSortKeys();
        moGridDepartamentsRow.setSelectedGridRow(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpDepartaments;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addAllListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reloadCatalogues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SGuiValidation validatePanel() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            getDepartaments();

            if (mnNumberDepartamentsSelects == 0) {
                validation.setMessage("Aún no se ha especificado ningún departamento.");
                validation.setComponent(mjchSelectAll);
            }
        }
        
        return validation;
    }
    
    @Override
    public Object getValue(int type) {
        Object value = null;
        
        switch(type) {
            case SGuiConsts.PARAM_KEY:
                value = msDepartamentsSelectedsId;
                break;
            case SGuiConsts.PARAM_ITEM:
                value = msDepartamentsSelectedsName;
                break;
            case SGuiConsts.PARAM_ROWS:
                value = mbIsSelectedAll;
                break;
            default:
                break;
        }
        
        return value;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JCheckBox) {
            JCheckBox button = (JCheckBox) e.getSource();

            if (button == mjchSelectAll) {
                itemStateChangedSelectAll();
            }
        }
    }
}
