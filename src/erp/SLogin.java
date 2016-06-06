/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import erp.client.SClientInterface;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import erp.lib.form.SFormComponentItem;
import erp.lib.form.SFormUtilities;
import erp.server.SLoginRequest;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import sa.lib.srv.SSrvCompany;

/**
 *
 * @author Sergio Flores
 */
public class SLogin extends JDialog {

    private SClientInterface miClient;
    private int mnFormResult;
    private boolean mbFirstTime;

    /**
     * Creates new form SLogin
     */
    public SLogin(SClientInterface client) {
        super(client.getFrame(), true);

        miClient = client;

        initComponents();
        initComponentsExtra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDialog = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlUserName = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jlUserPassword = new javax.swing.JLabel();
        jpfUserPassword = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jlCompany = new javax.swing.JLabel();
        jspCompanies = new javax.swing.JScrollPane();
        jltCompanies = new javax.swing.JList<SFormComponentItem>();
        jpControls = new javax.swing.JPanel();
        jbOk = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acceso del usuario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpDialog.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros de acceso:")));
        jpDialog.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlUserName.setText("Usuario:");
        jlUserName.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel2.add(jlUserName);

        jtfUserName.setText("user");
        jtfUserName.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel2.add(jtfUserName);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlUserPassword.setText("Contraseña:");
        jlUserPassword.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel3.add(jlUserPassword);

        jpfUserPassword.setText("12345");
        jpfUserPassword.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel3.add(jpfUserPassword);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCompany.setText("Empresa:");
        jlCompany.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlCompany);

        jPanel1.add(jPanel4);

        jpDialog.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jltCompanies.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jltCompanies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jltCompaniesMouseClicked(evt);
            }
        });
        jspCompanies.setViewportView(jltCompanies);

        jpDialog.add(jspCompanies, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpDialog, java.awt.BorderLayout.CENTER);

        jpControls.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbOk.setText("Aceptar");
        jbOk.setToolTipText("[Ctrl + Enter]");
        jbOk.setPreferredSize(new java.awt.Dimension(75, 23));
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });
        jpControls.add(jbOk);

        jbCancel.setText("Cancelar");
        jbCancel.setToolTipText("[Escape]");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });
        jpControls.add(jbCancel);

        getContentPane().add(jpControls, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-488)/2, (screenSize.height-334)/2, 488, 334);
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        actionOk();
    }//GEN-LAST:event_jbOkActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        actionCancel();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (mbFirstTime) {
            mbFirstTime = false;
            SLibUtilities.requestComponentFocus(jtfUserName);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jltCompaniesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jltCompaniesMouseClicked
        if (evt.getClickCount() == 2) {
            actionOk();
        }
    }//GEN-LAST:event_jltCompaniesMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SLibUtilities.requestComponentFocus(jtfUserName);
    }//GEN-LAST:event_formWindowOpened

    private void initComponentsExtra() {
        AbstractAction actionOk = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionOk();
            }
        };

        SFormUtilities.putActionMap(getRootPane(), actionOk, "ok", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);

        AbstractAction actionCancel = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionCancel();
            }
        };
     
        SFormUtilities.putActionMap(getRootPane(), actionCancel, "cancel", KeyEvent.VK_ESCAPE, 0);
    }

    private void actionOk() {
        if (jtfUserName.getText().length() == 0) {
            miClient.showMsgBoxWarning(SLibConstants.MSG_ERR_GUI_FIELD_EMPTY + "'" + jlUserName.getText() + "'");
            SLibUtilities.requestComponentFocus(jtfUserName);
        }
        else if (jpfUserPassword.getPassword().length == 0) {
            miClient.showMsgBoxWarning(SLibConstants.MSG_ERR_GUI_FIELD_EMPTY + "'" + jlUserPassword.getText() + "'");
            SLibUtilities.requestComponentFocus(jpfUserPassword);
        }
        else if (jltCompanies.getSelectedIndex() == -1) {
            miClient.showMsgBoxWarning(SLibConstants.MSG_ERR_GUI_FIELD_EMPTY + "'" + jlCompany.getText() + "'");
            SLibUtilities.requestComponentFocus(jltCompanies);
        }
        else {
            mnFormResult = SLibConstants.FORM_RESULT_OK;
            setVisible(false);
        }
    }

    private void actionCancel() {
        mnFormResult = SLibConstants.FORM_RESULT_CANCEL;
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbOk;
    private javax.swing.JLabel jlCompany;
    private javax.swing.JLabel jlUserName;
    private javax.swing.JLabel jlUserPassword;
    private javax.swing.JList<SFormComponentItem> jltCompanies;
    private javax.swing.JPanel jpControls;
    private javax.swing.JPanel jpDialog;
    private javax.swing.JPasswordField jpfUserPassword;
    private javax.swing.JScrollPane jspCompanies;
    private javax.swing.JTextField jtfUserName;
    // End of variables declaration//GEN-END:variables

    public void reset() {
        mnFormResult = SLibConstants.UNDEFINED;
        mbFirstTime = true;

        jtfUserName.setText("");
        jpfUserPassword.setText("");

        jltCompanies.setEnabled(jltCompanies.getModel().getSize() > 1);

        if (jltCompanies.getModel().getSize() > 0) {
            jltCompanies.setSelectedIndex(0);
        }
    }

    public void setCompanies(ArrayList<SSrvCompany> companies) {
        Vector<SFormComponentItem> items = new Vector<SFormComponentItem>();

        for (SSrvCompany c : companies) {
            items.add(new SFormComponentItem(new int[]{c.getCompanyId()}, c.getCompany()));
        }

        jltCompanies.setListData(items);
        if (jltCompanies.getModel().getSize() > 0) {
            jltCompanies.setSelectedIndex(0);
        }
    }

    public int getFormResult() {
        return mnFormResult;
    }

    public SLoginRequest getLoginRequest() {
        return new SLoginRequest(jtfUserName.getText(), new String(jpfUserPassword.getPassword()), ((int[]) ((SFormComponentItem) jltCompanies.getModel().getElementAt(jltCompanies.getSelectedIndex())).getPrimaryKey())[0]);
    }
}
