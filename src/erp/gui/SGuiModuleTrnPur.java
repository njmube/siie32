/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.gui;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import erp.mfin.data.SDataCostCenterItem;
import erp.mfin.form.SDialogRepBizPartnerAccountingMoves;
import erp.mfin.form.SDialogRepBizPartnerAuxMoves;
import erp.mfin.form.SDialogRepBizPartnerBalance;
import erp.mfin.form.SDialogRepBizPartnerBalanceDps;
import erp.mfin.form.SDialogRepBizPartnerStatements;
import erp.mfin.form.SFormCostCenterItem;
import erp.mod.SModConsts;
import erp.mod.trn.form.SDialogRepContractStatus;
import erp.mtrn.data.SDataBizPartnerBlocking;
import erp.mtrn.data.SDataDiogDncDocumentNumberSeries;
import erp.mtrn.data.SDataDps;
import erp.mtrn.data.SDataDpsDncDocumentNumberSeries;
import erp.mtrn.data.SDataDsm;
import erp.mtrn.form.SDialogRepBizPartnerBalanceAging;
import erp.mtrn.form.SDialogRepContractStock;
import erp.mtrn.form.SDialogRepDpsBizPartner;
import erp.mtrn.form.SDialogRepDpsList;
import erp.mtrn.form.SDialogRepDpsWithBalance;
import erp.mtrn.form.SDialogRepPurchasesUnitaryCost;
import erp.mtrn.form.SDialogRepSalesPurchases;
import erp.mtrn.form.SDialogRepSalesPurchasesByConcept;
import erp.mtrn.form.SDialogRepSalesPurchasesByLocality;
import erp.mtrn.form.SDialogRepSalesPurchasesComparative;
import erp.mtrn.form.SDialogRepSalesPurchasesDetailByBizPartner;
import erp.mtrn.form.SDialogRepSalesPurchasesDiary;
import erp.mtrn.form.SDialogRepSalesPurchasesFile;
import erp.mtrn.form.SDialogRepSalesPurchasesNet;
import erp.mtrn.form.SDialogRepSalesPurchasesPriceUnitary;
import erp.mtrn.form.SFormBizPartnerBlocking;
import erp.mtrn.form.SFormDncDocumentNumberSeries;
import erp.mtrn.form.SFormDps;
import erp.mtrn.form.SFormDsm;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import sa.gui.util.SUtilConsts;
import sa.lib.gui.SGuiParams;

/**
 *
 * @author Sergio Flores
 */
public class SGuiModuleTrnPur extends erp.lib.gui.SGuiModule implements java.awt.event.ActionListener {

    private javax.swing.JMenu jmCat;
    private javax.swing.JMenuItem jmiCatDpsDncDocumentNumberSeries;
    private javax.swing.JMenuItem jmiCatDiogDncDocumentNumberSeries;
    private javax.swing.JMenuItem jmiCatBizPartnerBlocking;
    private javax.swing.JMenu jmCatCfg;
    private javax.swing.JMenuItem jmiCatCfgCostCenterItem;
    private javax.swing.JMenu jmEst;
    private javax.swing.JMenuItem jmiEstimates;
    private javax.swing.JMenuItem jmiEstimatesLinkPend;
    private javax.swing.JMenuItem jmiEstimatesLinkPendEntry;
    private javax.swing.JMenuItem jmiEstimatesLinked;
    private javax.swing.JMenuItem jmiEstimatesLinkedEntry;
    private javax.swing.JMenuItem jmiEstimatesLinks;
    private javax.swing.JMenu jmCon;
    private javax.swing.JMenuItem jmiContracts;
    private javax.swing.JMenuItem jmiContractsLinkPend;
    private javax.swing.JMenuItem jmiContractsLinkPendEntry;
    private javax.swing.JMenuItem jmiContractsLinked;
    private javax.swing.JMenuItem jmiContractsLinkedEntry;
    private javax.swing.JMenuItem jmiContractsLinks;
    private javax.swing.JMenuItem jmiContractsLinkPendEntryPrice;
    private javax.swing.JMenuItem jmiContractsLinkedEntryPrice;
    private javax.swing.JMenu jmOrd;
    private javax.swing.JMenuItem jmiOrders;
    private javax.swing.JMenuItem jmiOrdersLinkPend;
    private javax.swing.JMenuItem jmiOrdersLinkPendEntry;
    private javax.swing.JMenuItem jmiOrdersLinked;
    private javax.swing.JMenuItem jmiOrdersLinkedEntry;
    private javax.swing.JMenuItem jmiOrdersLinksSource;
    private javax.swing.JMenuItem jmiOrdersLinksDestiny;
    private javax.swing.JMenuItem jmiOrdersAutorizedPending;
    private javax.swing.JMenuItem jmiOrdersAutorizedAutorized;
    private javax.swing.JMenuItem jmiOrdersAutorizedRejected;
    private javax.swing.JMenuItem jmiOrdersPriceHistory;
    private javax.swing.JMenuItem jmiOrdersPrice;
    private javax.swing.JMenu jmDps;
    private javax.swing.JMenuItem jmiDps;
    private javax.swing.JMenuItem jmiDpsEntry;
    private javax.swing.JMenuItem jmiDpsAnnuled;
    private javax.swing.JMenuItem jmiDpsReissued;
    private javax.swing.JMenuItem jmiDpsReplaced;
    private javax.swing.JMenuItem jmiDpsLinksDestiny;
    private javax.swing.JMenuItem jmiDpsLinksTrace;
    private javax.swing.JMenuItem jmiDpsAutorizedPending;
    private javax.swing.JMenuItem jmiDpsAutorizedAutorized;
    private javax.swing.JMenuItem jmiDpsAutorizedReject;
    private javax.swing.JMenuItem jmiDpsAuditPending;
    private javax.swing.JMenuItem jmiDpsAudited;
    private javax.swing.JMenuItem jmiDpsPriceHistory;
    private javax.swing.JMenuItem jmiDpsPrice;
    private javax.swing.JMenu jmDpsAdj;
    private javax.swing.JMenuItem jmiDpsAdjustments;
    private javax.swing.JMenuItem jmiDpsAdjustmentsAnnuled;
    private javax.swing.JMenuItem jmiDpsAdjustmentsReissued;
    private javax.swing.JMenuItem jmiDpsAdjustmentsReplaced;
    private javax.swing.JMenu jmStkSup;
    private javax.swing.JMenuItem jmiStockSupplyPend;
    private javax.swing.JMenuItem jmiStockSupplyPendEntry;
    private javax.swing.JMenuItem jmiStockSupplied;
    private javax.swing.JMenuItem jmiStockSuppliedEntry;
    private javax.swing.JMenuItem jmiStockSupplyDiog;
    private javax.swing.JMenuItem jmiStatisticsConsume;
    private javax.swing.JMenu jmStkRet;
    private javax.swing.JMenuItem jmiStockReturnPend;
    private javax.swing.JMenuItem jmiStockReturnPendEntry;
    private javax.swing.JMenuItem jmiStockReturned;
    private javax.swing.JMenuItem jmiStockReturnedEntry;
    private javax.swing.JMenuItem jmiStockReturnDiog;
    private javax.swing.JMenu jmReports;
    private javax.swing.JMenu jmReportsStatistics;
    private javax.swing.JMenu jmReportsBackorder;
    private javax.swing.JMenuItem jmiReportsTrnGlobal;
    private javax.swing.JMenuItem jmiReportsTrnByMonth;
    private javax.swing.JMenuItem jmiReportsTrnByItemGeneric;
    private javax.swing.JMenuItem jmiReportsTrnByItemGenericBizPartner;
    private javax.swing.JMenuItem jmiReportsTrnByItem;
    private javax.swing.JMenuItem jmiReportsTrnByItemBizPartner;
    private javax.swing.JMenuItem jmiReportsTrnByBizPartner;
    private javax.swing.JMenuItem jmiReportsTrnByBizPartnerItem;
    private javax.swing.JMenuItem jmiReportsTrnByBizPartnerType;
    private javax.swing.JMenuItem jmiReportsTrnByBizPartnerTypeBizPartner;
    private javax.swing.JMenuItem jmiReportsTrnDpsByItemBizPartner;
    private javax.swing.JMenuItem jmiReportsBackorderContract;
    private javax.swing.JMenuItem jmiReportsBackorderContractByItem;
    private javax.swing.JMenuItem jmiReportsBackorderContractByItemBizPartner;
    private javax.swing.JMenuItem jmiReportsBackorderContractByItemBizPartnerBra;
    private javax.swing.JMenuItem jmiReportsBackorderOrder;
    private javax.swing.JMenuItem jmiReportsBackorderOrderByItem;
    private javax.swing.JMenuItem jmiReportsBackorderOrderByItemBizPartner;
    private javax.swing.JMenuItem jmiReportsBackorderOrderByItemBizPartnerBra;
    private javax.swing.JMenuItem jmiReportsBizPartnerBalanceAgingView;
    private javax.swing.JMenuItem jmiReportsBizPartnerBalance;
    private javax.swing.JMenuItem jmiReportsBizPartnerBalanceDps;
    private javax.swing.JMenuItem jmiReportsBizPartnerBalanceAging;
    private javax.swing.JMenuItem jmiReportsAccountStatements;
    private javax.swing.JMenuItem jmiReportsAccountStatementsDps;
    private javax.swing.JMenuItem jmiReportsBizPartnerAccountingMoves;
    private javax.swing.JMenuItem jmiReportsBizPartnerAccountingMovesDays;
    private javax.swing.JMenuItem jmiReportsBizPartnerAuxMoves;
    private javax.swing.JMenuItem jmiReportsDpsList;
    private javax.swing.JMenuItem jmiReportsDpsBizPartner;
    private javax.swing.JMenuItem jmiReportsDpsWithBalance;
    private javax.swing.JMenuItem jmiReportsTrn;
    private javax.swing.JMenuItem jmiReportsTrnConcept;
    private javax.swing.JMenuItem jmiReportsTrnLocality;
    private javax.swing.JMenuItem jmiReportsTrnComparative;
    private javax.swing.JMenuItem jmiReportsTrnDpsDetailBizPartner;
    private javax.swing.JMenuItem jmiReportsTrnNetTotals;
    private javax.swing.JMenuItem jmiReportsTrnNet;
    private javax.swing.JMenuItem jmiReportsTrnFile;
    private javax.swing.JMenuItem jmiReportsTrnDiary;
    private javax.swing.JMenuItem jmiReportsTrnItemUnitaryPrice;
    private javax.swing.JMenuItem jmiReportsTrnUnitaryCosts;
    private javax.swing.JMenuItem jmiReportsTrnContractStock;
    private javax.swing.JMenuItem jmiReportsTrnContractStatus;

    private erp.mtrn.form.SFormDps moFormDps;
    private erp.mtrn.form.SFormDps moFormDpsRo;
    private erp.mtrn.form.SFormDsm moFormDsm;
    private erp.mtrn.form.SFormBizPartnerBlocking moFormBizPartnerBlocking;
    private erp.mtrn.form.SFormDncDocumentNumberSeries moFormDncDocumentNumberSeriesDps;
    private erp.mtrn.form.SFormDncDocumentNumberSeries moFormDncDocumentNumberSeriesDiog;
    private erp.mfin.form.SFormCostCenterItem moFormCostCenterItem;
    private erp.mtrn.form.SDialogRepDpsList moDialogRepDpsList;
    private erp.mtrn.form.SDialogRepDpsBizPartner moDialogRepDpsBizPartner;
    private erp.mtrn.form.SDialogRepDpsWithBalance moDialogRepDpsWithBalance;
    private erp.mtrn.form.SDialogRepSalesPurchases moDialogRepSalesPurchases;
    private erp.mtrn.form.SDialogRepSalesPurchasesByConcept moDialogRepSalesPurchasesByConcept;
    private erp.mtrn.form.SDialogRepSalesPurchasesByLocality moDialogRepSalesPurchasesByLocality;
    private erp.mtrn.form.SDialogRepSalesPurchasesComparative moDialogRepSalesPurchasesComparative;
    private erp.mtrn.form.SDialogRepSalesPurchasesDetailByBizPartner moDialogRepSalesPurchasesDetailByBizPartner;
    private erp.mtrn.form.SDialogRepSalesPurchasesNet moDialogRepSalesPurchasesNet;
    private erp.mtrn.form.SDialogRepSalesPurchasesFile moDialogRepSalesPurchasesFile;
    private erp.mtrn.form.SDialogRepSalesPurchasesDiary moDialogRepSalesPurchasesDiary;
    private erp.mtrn.form.SDialogRepPurchasesUnitaryCost moDialogRepPurchasesUnitaryCost;
    private erp.mtrn.form.SDialogRepContractStock moDialogRepContractStock;
    private erp.mtrn.form.SDialogRepSalesPurchasesPriceUnitary moDialogRepSalesPurchasesItemUnitaryPrice;

    public SGuiModuleTrnPur(erp.client.SClientInterface client) {
        super(client, SDataConstants.MOD_PUR);
        initComponents();
    }

    private void initComponents() {
        boolean hasRightDnsDps = false;
        boolean hasRightDnsDiog = false;
        boolean hasRightDocEstimate = false;
        boolean hasRightDocOrder = false;
        boolean hasRightDocOrderAuthorize = false;
        boolean hasRightDocTransaction = false;
        boolean hasRightDocTransactionAdjust = false;
        boolean hasRightBizPartnerBlocking = false;
        boolean hasRightInventoryIn = false;
        boolean hasRightInventoryOut = false;
        boolean hasRightReports = false;
        boolean hasRightItemConfig = false;
        int levelRightDocOrder = SDataConstantsSys.UNDEFINED;
        int levelRightDocTransaction = SDataConstantsSys.UNDEFINED;

        jmCat = new JMenu("Catálogos");
        jmiCatDpsDncDocumentNumberSeries = new JMenuItem("Folios de docs. de compras");
        jmiCatDiogDncDocumentNumberSeries = new JMenuItem("Folios de docs. de inventarios");
        jmiCatBizPartnerBlocking = new JMenuItem("Bloqueo de proveedores");
        jmCatCfg = new JMenu("Contabilización automática");
        jmiCatCfgCostCenterItem = new JMenuItem("Configuración de centros de costo vs. ítems");
        jmCatCfg.add(jmiCatCfgCostCenterItem);
        jmCat.add(jmiCatDpsDncDocumentNumberSeries);
        jmCat.add(jmiCatDiogDncDocumentNumberSeries);
        jmCat.addSeparator();
        jmCat.add(jmiCatBizPartnerBlocking);
        jmCat.addSeparator();
        jmCat.add(jmCatCfg);
        
        jmEst = new JMenu("Cotizaciones");
        jmiEstimates = new JMenuItem("Cotizaciones de compras");
        jmiEstimatesLinkPend = new JMenuItem("Cotizaciones por procesar");
        jmiEstimatesLinkPendEntry = new JMenuItem("Cotizaciones por procesar a detalle");
        jmiEstimatesLinked = new JMenuItem("Cotizaciones procesadas");
        jmiEstimatesLinkedEntry = new JMenuItem("Cotizaciones procesadas a detalle");
        jmiEstimatesLinks = new JMenuItem("Vínculos de cotizaciones como origen");
        jmEst.add(jmiEstimates);
        jmEst.addSeparator();
        jmEst.add(jmiEstimatesLinkPend);
        jmEst.add(jmiEstimatesLinkPendEntry);
        jmEst.addSeparator();
        jmEst.add(jmiEstimatesLinked);
        jmEst.add(jmiEstimatesLinkedEntry);
        jmEst.addSeparator();
        jmEst.add(jmiEstimatesLinks);

        jmCon = new JMenu("Contratos");
        jmiContracts = new JMenuItem("Contratos de compras");
        jmiContractsLinkPend = new JMenuItem("Contratos por procesar");
        jmiContractsLinkPendEntry = new JMenuItem("Contratos por procesar a detalle");
        jmiContractsLinked = new JMenuItem("Contratos procesados");
        jmiContractsLinkedEntry = new JMenuItem("Contratos procesados a detalle");
        jmiContractsLinks = new JMenuItem("Vínculos de contratos como origen");
        jmiContractsLinkPendEntryPrice = new JMenuItem("Entregas mensuales de contratos por procesar");
        jmiContractsLinkedEntryPrice = new JMenuItem("Entregas mensuales de contratos procesados");
        jmCon.add(jmiContracts);
        jmCon.addSeparator();
        jmCon.add(jmiContractsLinkPend);
        jmCon.add(jmiContractsLinkPendEntry);
        jmCon.addSeparator();
        jmCon.add(jmiContractsLinked);
        jmCon.add(jmiContractsLinkedEntry);
        jmCon.addSeparator();
        jmCon.add(jmiContractsLinks);
        jmCon.addSeparator();
        jmCon.add(jmiContractsLinkPendEntryPrice);
        jmCon.add(jmiContractsLinkedEntryPrice);

        jmOrd = new JMenu("Pedidos");
        jmiOrders = new JMenuItem("Pedidos de compras");
        jmiOrdersLinkPend = new JMenuItem("Pedidos por procesar");
        jmiOrdersLinkPendEntry = new JMenuItem("Pedidos por procesar a detalle");
        jmiOrdersLinked = new JMenuItem("Pedidos procesados");
        jmiOrdersLinkedEntry = new JMenuItem("Pedidos procesados a detalle");
        jmiOrdersLinksSource = new JMenuItem("Vínculos de pedidos como origen");
        jmiOrdersLinksDestiny = new JMenuItem("Vínculos de pedidos como destino");
        jmiOrdersAutorizedPending = new JMenuItem("Pedidos por autorizar");
        jmiOrdersAutorizedAutorized = new JMenuItem("Pedidos autorizados");
        jmiOrdersAutorizedRejected = new JMenuItem("Pedidos rechazados");
        jmiOrdersPriceHistory = new JMenuItem("Historial de precios de compras");
        jmiOrdersPrice = new JMenuItem("Precios de compras");
        jmOrd.add(jmiOrders);
        jmOrd.addSeparator();
        jmOrd.add(jmiOrdersLinkPend);
        jmOrd.add(jmiOrdersLinkPendEntry);
        jmOrd.addSeparator();
        jmOrd.add(jmiOrdersLinked);
        jmOrd.add(jmiOrdersLinkedEntry);
        jmOrd.addSeparator();
        jmOrd.add(jmiOrdersLinksSource);
        jmOrd.add(jmiOrdersLinksDestiny);
        jmOrd.addSeparator();
        jmOrd.add(jmiOrdersAutorizedPending);
        jmOrd.add(jmiOrdersAutorizedAutorized);
        jmOrd.add(jmiOrdersAutorizedRejected);
        jmOrd.addSeparator();
        jmOrd.add(jmiOrdersPriceHistory);
        jmOrd.add(jmiOrdersPrice);

        jmDps = new JMenu("Compras");
        jmiDps = new JMenuItem("Facturas de compras");
        jmiDpsEntry = new JMenuItem("Facturas de compras a detalle");
        jmiDpsAnnuled = new JMenuItem("Anulación de facturas");
        jmiDpsReissued = new JMenuItem("Reimpresión de facturas");
        jmiDpsReplaced = new JMenuItem("Sustitución de facturas");
        jmiDpsLinksDestiny = new JMenuItem("Vínculos de facturas como destino");
        jmiDpsLinksTrace = new JMenuItem("Rastreo de vínculos de facturas");
        jmiDpsAutorizedPending = new JMenuItem("Facturas por autorizar");
        jmiDpsAutorizedAutorized = new JMenuItem("Facturas autorizadas");
        jmiDpsAutorizedReject = new JMenuItem("Facturas rechazadas");
        jmiDpsAuditPending = new JMenuItem("Facturas por auditar");
        jmiDpsAudited = new JMenuItem("Facturas auditadas");
        jmiDpsPriceHistory = new JMenuItem("Historial de precios de compras");
        jmiDpsPrice = new JMenuItem("Precios de compras");
        jmDps.add(jmiDps);
        jmDps.add(jmiDpsEntry);
        jmDps.addSeparator();
        jmDps.add(jmiDpsAnnuled);
        jmDps.add(jmiDpsReissued);
        jmDps.add(jmiDpsReplaced);
        jmDps.addSeparator();
        jmDps.add(jmiDpsLinksDestiny);
        jmDps.add(jmiDpsLinksTrace);
        jmDps.addSeparator();
        jmDps.add(jmiDpsAutorizedPending);
        jmDps.add(jmiDpsAutorizedAutorized);
        jmDps.add(jmiDpsAutorizedReject);
        jmDps.addSeparator();
        jmDps.add(jmiDpsAuditPending);
        jmDps.add(jmiDpsAudited);
        jmDps.addSeparator();
        jmDps.add(jmiDpsPriceHistory);

        jmDpsAdj = new JMenu("Ajustes compras");
        jmiDpsAdjustments = new JMenuItem("Notas de crédito de compras");
        jmiDpsAdjustmentsAnnuled = new JMenuItem("Anulación de notas de crédito");
        jmiDpsAdjustmentsReissued = new JMenuItem("Reimpresión de notas de crédito");
        jmiDpsAdjustmentsReplaced = new JMenuItem("Sustitución de notas de crédito");
        jmDpsAdj.add(jmiDpsAdjustments);
        jmDpsAdj.addSeparator();
        jmDpsAdj.add(jmiDpsAdjustmentsAnnuled);
        jmDpsAdj.add(jmiDpsAdjustmentsReissued);
        jmDpsAdj.add(jmiDpsAdjustmentsReplaced);

        jmStkSup = new JMenu("Surtidos");
        jmiStockSupplyPend = new JMenuItem("Compras por surtir");
        jmiStockSupplyPendEntry = new JMenuItem("Compras por surtir a detalle");
        jmiStockSupplied = new JMenuItem("Compras surtidas");
        jmiStockSuppliedEntry = new JMenuItem("Compras surtidas a detalle");
        jmiStockSupplyDiog = new JMenuItem("Documentos de surtidos de compras");
        jmiStatisticsConsume = new JMenuItem("Estadísticas de consumo de compras");
        jmStkSup.add(jmiStockSupplyPend);
        jmStkSup.add(jmiStockSupplyPendEntry);
        jmStkSup.addSeparator();
        jmStkSup.add(jmiStockSupplied);
        jmStkSup.add(jmiStockSuppliedEntry);
        jmStkSup.addSeparator();
        jmStkSup.add(jmiStockSupplyDiog);
        jmStkSup.addSeparator();
        jmStkSup.add(jmiStatisticsConsume);

        jmStkRet = new JMenu("Devoluciones");
        jmiStockReturnPend = new JMenuItem("Compras por devolver");
        jmiStockReturnPendEntry = new JMenuItem("Compras por devolver a detalle");
        jmiStockReturned = new JMenuItem("Compras devueltas");
        jmiStockReturnedEntry = new JMenuItem("Compras devueltas a detalle");
        jmiStockReturnDiog = new JMenuItem("Documentos de devoluciones de compras");
        jmStkRet.add(jmiStockReturnPend);
        jmStkRet.add(jmiStockReturnPendEntry);
        jmStkRet.addSeparator();
        jmStkRet.add(jmiStockReturned);
        jmStkRet.add(jmiStockReturnedEntry);
        jmStkRet.addSeparator();
        jmStkRet.add(jmiStockReturnDiog);

        jmReports = new JMenu("Reportes");
        jmReportsStatistics = new JMenu("Estadísticas de compras");
        jmReportsBackorder = new JMenu("Backorder");
        jmiReportsTrnGlobal = new JMenuItem("Compras globales");
        jmiReportsTrnByMonth = new JMenuItem("Compras globales por mes");
        jmiReportsTrnByItemGeneric = new JMenuItem("Compras por ítem genérico");
        jmiReportsTrnByItemGenericBizPartner = new JMenuItem("Compras por ítem genérico-proveedor");
        jmiReportsTrnByItem = new JMenuItem("Compras por ítem");
        jmiReportsTrnByItemBizPartner = new JMenuItem("Compras por ítem-proveedor");
        jmiReportsTrnByBizPartner = new JMenuItem("Compras por proveedor");
        jmiReportsTrnByBizPartnerItem = new JMenuItem("Compras por proveedor-ítem");
        jmiReportsTrnByBizPartnerType = new JMenuItem("Compras por tipo de proveedor");
        jmiReportsTrnByBizPartnerTypeBizPartner = new JMenuItem("Compras por tipo de proveedor-proveedor");
        jmiReportsTrnDpsByItemBizPartner = new JMenuItem("Documentos de compras por ítem-proveedor");
        jmiReportsBackorderContract = new JMenuItem("Backorder de contratos");
        jmiReportsBackorderContractByItem = new JMenuItem("Backorder de contratos por ítem");
        jmiReportsBackorderContractByItemBizPartner = new JMenuItem("Backorder de contratos por ítem-cliente");
        jmiReportsBackorderContractByItemBizPartnerBra = new JMenuItem("Backorder de contratos por ítem-cliente sucursal");
        jmiReportsBackorderOrder = new JMenuItem("Backorder de pedidos");
        jmiReportsBackorderOrderByItem = new JMenuItem("Backorder de pedidos por ítem");
        jmiReportsBackorderOrderByItemBizPartner = new JMenuItem("Backorder de pedidos por ítem-cliente");
        jmiReportsBackorderOrderByItemBizPartnerBra = new JMenuItem("Backorder de pedidos por ítem-cliente sucursal");
        jmiReportsBizPartnerBalanceAgingView = new JMenuItem("Antigüedad de saldos de proveedores");
        jmiReportsBizPartnerBalance = new JMenuItem("Reporte de saldos proveedores...");
        jmiReportsBizPartnerBalanceDps = new JMenuItem("Reporte de saldos proveedores por documento...");
        jmiReportsBizPartnerBalanceAging = new JMenuItem("Reporte de antigüedad de saldos de proveedores...");
        jmiReportsAccountStatements = new JMenuItem("Estados de cuenta de proveedores...");
        jmiReportsAccountStatementsDps = new JMenuItem("Estados de cuenta de proveedores por documento...");
        jmiReportsBizPartnerAccountingMoves = new JMenuItem("Movimientos contables de proveedores...");
        jmiReportsBizPartnerAccountingMovesDays = new JMenuItem("Movimientos contables de proveedores con días de pago...");
        jmiReportsBizPartnerAuxMoves = new JMenuItem("Reporte auxiliar de movimientos contables de proveedores...");
        jmiReportsDpsList = new JMenuItem("Listado de facturas por período...");
        jmiReportsDpsBizPartner = new JMenuItem("Reporte de facturas de proveedores...");
        jmiReportsDpsWithBalance = new JMenuItem("Reporte de facturas con saldo de proveedores...");
        jmiReportsTrn = new JMenuItem("Reporte de compras netas...");
        jmiReportsTrnConcept = new JMenuItem("Reporte de compras netas por concepto...");
        jmiReportsTrnLocality = new JMenuItem("Reporte de compras netas por zona geográfica...");
        jmiReportsTrnComparative = new JMenuItem("Reporte comparativo de compras netas...");
        jmiReportsTrnDpsDetailBizPartner = new JMenuItem("Reporte detallado de compras por proveedor...");
        jmiReportsTrnNetTotals = new JMenuItem("Relación de compras netas por período...");
        jmiReportsTrnNet = new JMenuItem("Relación de compras, devoluciones y descuentos por período...");
        jmiReportsTrnFile = new JMenuItem("Archivo de exportación de compras netas por período...");
        jmiReportsTrnDiary = new JMenuItem("Reporte de diario de compras...");
        jmiReportsTrnItemUnitaryPrice = new JMenuItem("Reporte de precios unitarios de compras...");
        jmiReportsTrnUnitaryCosts = new JMenuItem("Reporte de costos unitarios de compras...");
        jmiReportsTrnContractStock = new JMenuItem("Reporte backorder contratos de compras vs. existencias...");
        jmiReportsTrnContractStatus = new JMenuItem("Reporte de estatus de contratos...");
        
        jmReportsStatistics.add(jmiReportsTrnGlobal);
        jmReportsStatistics.add(jmiReportsTrnByMonth);
        jmReportsStatistics.add(jmiReportsTrnByItemGeneric);
        jmReportsStatistics.add(jmiReportsTrnByItemGenericBizPartner);
        jmReportsStatistics.add(jmiReportsTrnByItem);
        jmReportsStatistics.add(jmiReportsTrnByItemBizPartner);
        jmReportsStatistics.add(jmiReportsTrnByBizPartner);
        jmReportsStatistics.add(jmiReportsTrnByBizPartnerItem);
        jmReportsStatistics.add(jmiReportsTrnByBizPartnerType);
        jmReportsStatistics.add(jmiReportsTrnByBizPartnerTypeBizPartner);
        jmReportsStatistics.addSeparator();
        jmReportsStatistics.add(jmiReportsTrnDpsByItemBizPartner);
        jmReportsBackorder.add(jmiReportsBackorderContract);
        jmReportsBackorder.add(jmiReportsBackorderContractByItem);
        jmReportsBackorder.add(jmiReportsBackorderContractByItemBizPartner);
        jmReportsBackorder.add(jmiReportsBackorderContractByItemBizPartnerBra);
        jmReportsBackorder.addSeparator();
        jmReportsBackorder.add(jmiReportsBackorderOrder);
        jmReportsBackorder.add(jmiReportsBackorderOrderByItem);
        jmReportsBackorder.add(jmiReportsBackorderOrderByItemBizPartner);
        jmReportsBackorder.add(jmiReportsBackorderOrderByItemBizPartnerBra);

        jmReports.add(jmReportsStatistics);
        jmReports.add(jmReportsBackorder);
        jmReports.add(jmiReportsBizPartnerBalanceAgingView);
        jmReports.addSeparator();
        jmReports.add(jmiReportsBizPartnerBalance);
        jmReports.add(jmiReportsBizPartnerBalanceDps);
        jmReports.add(jmiReportsBizPartnerBalanceAging);
        jmReports.addSeparator();
        jmReports.add(jmiReportsAccountStatements);
        jmReports.add(jmiReportsAccountStatementsDps);
        jmReports.addSeparator();
        jmReports.add(jmiReportsBizPartnerAccountingMoves);
        jmReports.add(jmiReportsBizPartnerAccountingMovesDays);
        jmReports.add(jmiReportsBizPartnerAuxMoves);
        jmReports.addSeparator();
        jmReports.add(jmiReportsDpsList);
        jmReports.add(jmiReportsDpsBizPartner);
        jmReports.add(jmiReportsDpsWithBalance);
        jmReports.addSeparator();
        jmReports.add(jmiReportsTrn);
        jmReports.add(jmiReportsTrnConcept);
        jmReports.add(jmiReportsTrnLocality);
        jmReports.add(jmiReportsTrnComparative);
        jmReports.add(jmiReportsTrnDpsDetailBizPartner);
        jmReports.add(jmiReportsTrnNetTotals);
        jmReports.add(jmiReportsTrnNet);
        jmReports.add(jmiReportsTrnFile);
        jmReports.addSeparator();
        jmReports.add(jmiReportsTrnDiary);
        jmReports.add(jmiReportsTrnItemUnitaryPrice);
        jmReports.addSeparator();
        jmReports.add(jmiReportsTrnUnitaryCosts);
        jmReports.addSeparator();
        jmReports.add(jmiReportsTrnContractStock);
        jmReports.addSeparator();
        jmReports.add(jmiReportsTrnContractStatus);
        
        moFormDps = null;
        moFormDpsRo = null;
        moFormDsm = null;
        moFormBizPartnerBlocking = null;
        moFormDncDocumentNumberSeriesDps = null;
        moFormDncDocumentNumberSeriesDiog = null;
        moDialogRepDpsList = new SDialogRepDpsList(miClient);
        moDialogRepDpsBizPartner = new SDialogRepDpsBizPartner(miClient);
        moDialogRepDpsWithBalance = new SDialogRepDpsWithBalance(miClient);
        moDialogRepSalesPurchases = new SDialogRepSalesPurchases(miClient);
        moDialogRepSalesPurchasesByConcept = new SDialogRepSalesPurchasesByConcept(miClient);
        moDialogRepSalesPurchasesByLocality = new SDialogRepSalesPurchasesByLocality(miClient);
        moDialogRepSalesPurchasesComparative = new SDialogRepSalesPurchasesComparative(miClient, SDataConstantsSys.TRNS_CT_DPS_PUR);
        moDialogRepSalesPurchasesDetailByBizPartner = new SDialogRepSalesPurchasesDetailByBizPartner(miClient);
        moDialogRepSalesPurchasesNet = new SDialogRepSalesPurchasesNet(miClient);
        moDialogRepSalesPurchasesFile = new SDialogRepSalesPurchasesFile(miClient, SDataConstantsSys.TRNS_CT_DPS_PUR);
        moDialogRepSalesPurchasesDiary = new SDialogRepSalesPurchasesDiary(miClient);
        moDialogRepSalesPurchasesItemUnitaryPrice = new SDialogRepSalesPurchasesPriceUnitary(miClient);
        moDialogRepPurchasesUnitaryCost = new SDialogRepPurchasesUnitaryCost(miClient);
        moDialogRepContractStock = new SDialogRepContractStock(miClient);

        jmiCatDpsDncDocumentNumberSeries.addActionListener(this);
        jmiCatDiogDncDocumentNumberSeries.addActionListener(this);
        jmiCatBizPartnerBlocking.addActionListener(this);
        jmiCatCfgCostCenterItem.addActionListener(this);
        jmiEstimates.addActionListener(this);
        jmiEstimatesLinkPend.addActionListener(this);
        jmiEstimatesLinked.addActionListener(this);
        jmiEstimatesLinkPendEntry.addActionListener(this);
        jmiEstimatesLinkedEntry.addActionListener(this);
        jmiEstimatesLinks.addActionListener(this);
        jmiContracts.addActionListener(this);
        jmiContractsLinkPend.addActionListener(this);
        jmiContractsLinked.addActionListener(this);
        jmiContractsLinkPendEntry.addActionListener(this);
        jmiContractsLinkedEntry.addActionListener(this);
        jmiContractsLinks.addActionListener(this);
        jmiContractsLinkPendEntryPrice.addActionListener(this);
        jmiContractsLinkedEntryPrice.addActionListener(this);
        jmiOrders.addActionListener(this);
        jmiOrdersLinkPend.addActionListener(this);
        jmiOrdersLinked.addActionListener(this);
        jmiOrdersLinkPendEntry.addActionListener(this);
        jmiOrdersLinkedEntry.addActionListener(this);
        jmiOrdersLinksSource.addActionListener(this);
        jmiOrdersLinksDestiny.addActionListener(this);
        jmiOrdersAutorizedPending.addActionListener(this);
        jmiOrdersAutorizedAutorized.addActionListener(this);
        jmiOrdersAutorizedRejected.addActionListener(this);
        jmiOrdersPriceHistory.addActionListener(this);
        jmiOrdersPrice.addActionListener(this);
        jmiDps.addActionListener(this);
        jmiDpsEntry.addActionListener(this);
        jmiDpsAnnuled.addActionListener(this);
        jmiDpsReissued.addActionListener(this);
        jmiDpsReplaced.addActionListener(this);
        jmiDpsLinksDestiny.addActionListener(this);
        jmiDpsLinksTrace.addActionListener(this);
        jmiDpsAutorizedPending.addActionListener(this);
        jmiDpsAutorizedAutorized.addActionListener(this);
        jmiDpsAutorizedReject.addActionListener(this);
        jmiDpsAuditPending.addActionListener(this);
        jmiDpsAudited.addActionListener(this);
        jmiDpsPriceHistory.addActionListener(this);
        jmiDpsPrice.addActionListener(this);
        jmiDpsAdjustments.addActionListener(this);
        jmiDpsAdjustmentsAnnuled.addActionListener(this);
        jmiDpsAdjustmentsReissued.addActionListener(this);
        jmiDpsAdjustmentsReplaced.addActionListener(this);
        jmiStockSupplyPend.addActionListener(this);
        jmiStockSupplied.addActionListener(this);
        jmiStockSupplyPendEntry.addActionListener(this);
        jmiStockSuppliedEntry.addActionListener(this);
        jmiStockSupplyDiog.addActionListener(this);
        jmiStatisticsConsume.addActionListener(this);
        jmiStockReturnPend.addActionListener(this);
        jmiStockReturned.addActionListener(this);
        jmiStockReturnPendEntry.addActionListener(this);
        jmiStockReturnedEntry.addActionListener(this);
        jmiStockReturnDiog.addActionListener(this);
        jmiReportsTrnGlobal.addActionListener(this);
        jmiReportsTrnByMonth.addActionListener(this);
        jmiReportsTrnByItemGeneric.addActionListener(this);
        jmiReportsTrnByItemGenericBizPartner.addActionListener(this);
        jmiReportsTrnByItem.addActionListener(this);
        jmiReportsTrnByItemBizPartner.addActionListener(this);
        jmiReportsTrnByBizPartner.addActionListener(this);
        jmiReportsTrnByBizPartnerItem.addActionListener(this);
        jmiReportsTrnByBizPartnerType.addActionListener(this);
        jmiReportsTrnByBizPartnerTypeBizPartner.addActionListener(this);
        jmiReportsTrnDpsByItemBizPartner.addActionListener(this);
        jmiReportsBackorderContract.addActionListener(this);
        jmiReportsBackorderContractByItem.addActionListener(this);
        jmiReportsBackorderContractByItemBizPartner.addActionListener(this);
        jmiReportsBackorderContractByItemBizPartnerBra.addActionListener(this);
        jmiReportsBackorderOrder.addActionListener(this);
        jmiReportsBackorderOrderByItem.addActionListener(this);
        jmiReportsBackorderOrderByItemBizPartner.addActionListener(this);
        jmiReportsBackorderOrderByItemBizPartnerBra.addActionListener(this);
        jmiReportsBizPartnerBalanceAgingView.addActionListener(this);
        jmiReportsBizPartnerBalance.addActionListener(this);
        jmiReportsBizPartnerBalanceDps.addActionListener(this);
        jmiReportsBizPartnerBalanceAging.addActionListener(this);
        jmiReportsAccountStatements.addActionListener(this);
        jmiReportsAccountStatementsDps.addActionListener(this);
        jmiReportsBizPartnerAccountingMoves.addActionListener(this);
        jmiReportsBizPartnerAccountingMovesDays.addActionListener(this);
        jmiReportsBizPartnerAuxMoves.addActionListener(this);
        jmiReportsDpsList.addActionListener(this);
        jmiReportsDpsBizPartner.addActionListener(this);
        jmiReportsDpsWithBalance.addActionListener(this);
        jmiReportsTrn.addActionListener(this);
        jmiReportsTrnConcept.addActionListener(this);
        jmiReportsTrnLocality.addActionListener(this);
        jmiReportsTrnComparative.addActionListener(this);
        jmiReportsTrnDpsDetailBizPartner.addActionListener(this);
        jmiReportsTrnNetTotals.addActionListener(this);
        jmiReportsTrnNet.addActionListener(this);
        jmiReportsTrnFile.addActionListener(this);
        jmiReportsTrnDiary.addActionListener(this);
        jmiReportsTrnItemUnitaryPrice.addActionListener(this);
        jmiReportsTrnUnitaryCosts.addActionListener(this);
        jmiReportsTrnContractStock.addActionListener(this);
        jmiReportsTrnContractStatus.addActionListener(this);

        hasRightDnsDps = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DPS_DNS).HasRight;
        hasRightDnsDiog = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_DIOG_CFG).HasRight;
        hasRightDocEstimate = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_EST).HasRight;
        hasRightDocOrder = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_ORD).HasRight;
        hasRightDocOrderAuthorize = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_ORD_AUTHORN).HasRight ||
                miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_ORD_REJECT_OWN).HasRight;
        hasRightDocTransaction = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_TRN).HasRight;
        hasRightDocTransactionAdjust = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_TRN_ADJ).HasRight;
        hasRightBizPartnerBlocking = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_BP_BLOCK).HasRight;
        hasRightInventoryIn = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_IN_PUR).HasRight ||
                miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DIOG_IN).HasRight;
        hasRightInventoryOut = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_INV_OUT_PUR).HasRight ||
                miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DIOG_OUT).HasRight;
        hasRightReports = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_REP).HasRight;
        hasRightItemConfig =
                hasRightDocOrder && miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_ORD).Level == SUtilConsts.LEV_MANAGER ||
                hasRightDocTransaction && miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_TRN).Level == SUtilConsts.LEV_MANAGER;
        levelRightDocOrder = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_ORD).Level;
        levelRightDocTransaction = miClient.getSessionXXX().getUser().hasRight(miClient, SDataConstantsSys.PRV_PUR_DOC_TRN).Level;

        jmCat.setEnabled(hasRightDnsDps || hasRightDnsDiog || hasRightBizPartnerBlocking || hasRightItemConfig);
        jmiCatDpsDncDocumentNumberSeries.setEnabled(hasRightDnsDps);
        jmiCatDiogDncDocumentNumberSeries.setEnabled(hasRightDnsDiog);
        jmiCatBizPartnerBlocking.setEnabled(hasRightBizPartnerBlocking);
        jmCatCfg.setEnabled(hasRightItemConfig);
        jmEst.setEnabled(hasRightDocEstimate);

        jmCon.setEnabled(hasRightDocEstimate);

        jmOrd.setEnabled(hasRightDocOrder || hasRightDocOrderAuthorize);
        jmiOrdersPriceHistory.setEnabled(hasRightDocOrder && levelRightDocOrder >= SUtilConsts.LEV_AUTHOR);
        jmiOrdersPrice.setEnabled(hasRightDocOrder && levelRightDocOrder >= SUtilConsts.LEV_AUTHOR);

        jmDps.setEnabled(hasRightDocTransaction);
        jmiDps.setEnabled(hasRightDocTransaction);
        jmiDpsEntry.setEnabled(hasRightDocTransaction);
        jmiDpsAnnuled.setEnabled(false);
        jmiDpsReissued.setEnabled(false);
        jmiDpsReplaced.setEnabled(false);
        jmiDpsLinksDestiny.setEnabled(hasRightDocTransaction);
        jmiDpsLinksTrace.setEnabled(hasRightDocTransaction);
        jmiDpsAuditPending.setEnabled(hasRightDocTransaction && levelRightDocTransaction == SUtilConsts.LEV_MANAGER);
        jmiDpsAudited.setEnabled(hasRightDocTransaction && levelRightDocTransaction == SUtilConsts.LEV_MANAGER);
        jmiDpsPriceHistory.setEnabled(hasRightDocTransaction && levelRightDocTransaction >= SUtilConsts.LEV_AUTHOR);
        jmiDpsPrice.setEnabled(hasRightDocTransaction && levelRightDocTransaction >= SUtilConsts.LEV_AUTHOR);

        jmDpsAdj.setEnabled(hasRightDocTransactionAdjust);
        jmiDpsAdjustments.setEnabled(hasRightDocTransactionAdjust);
        jmiDpsAdjustmentsAnnuled.setEnabled(false);
        jmiDpsAdjustmentsReissued.setEnabled(false);
        jmiDpsAdjustmentsReplaced.setEnabled(false);

        jmStkSup.setEnabled(hasRightInventoryIn);
        jmiStockSupplyPend.setEnabled(hasRightInventoryIn);
        jmiStockSupplied.setEnabled(hasRightInventoryIn);
        jmiStockSupplyPendEntry.setEnabled(hasRightInventoryIn);
        jmiStockSuppliedEntry.setEnabled(hasRightInventoryIn);
        jmiStockSupplyDiog.setEnabled(hasRightInventoryIn);
        jmiStatisticsConsume.setEnabled(hasRightInventoryIn);

        jmStkRet.setEnabled(hasRightInventoryOut);
        jmiStockReturnPend.setEnabled(hasRightInventoryOut);
        jmiStockReturned.setEnabled(hasRightInventoryOut);
        jmiStockReturnPendEntry.setEnabled(hasRightInventoryOut);
        jmiStockReturnedEntry.setEnabled(hasRightInventoryOut);
        jmiStockReturnDiog.setEnabled(hasRightInventoryOut);

        jmReports.setEnabled(hasRightReports);
    }

    private java.lang.String getViewTitle(int type) {
        String viewTitle = "" ;

        switch (type) {
            case SDataConstantsSys.TRNX_DPS_PUR_ORD_AUT_PEND:
                viewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_ORD) + " x autorizar";
                break;
            case SDataConstantsSys.TRNX_DPS_PUR_ORD_AUT_AUT:
                viewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_ORD) + " autorizad@s";
                break;
            case SDataConstantsSys.TRNX_DPS_PUR_ORD_AUT_REJ:
                viewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_ORD) + " rechazad@s";
                break;
            case SDataConstantsSys.TRNX_DPS_PUR_DOC_AUT_PEND:
                viewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_DOC) + " x autorizar";
                break;
            case SDataConstantsSys.TRNX_DPS_PUR_DOC_AUT_AUT:
                viewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_DOC) + " autorizad@s";
                break;
            case SDataConstantsSys.TRNX_DPS_PUR_DOC_AUT_REJ:
                viewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_DOC) + " rechazad@s";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT:
                viewTitle = "Compras globales";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_MONTH:
                viewTitle = "Compras globales x mes";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_BY_BP:
                viewTitle = "Compras x proveedor";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_BY_BP_ITEM:
                viewTitle = "Compras x proveedor-ítem";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_BY_IGEN:
                viewTitle = "Compras x ítem genérico";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_BY_IGEN_BP:
                viewTitle = "Compras x ítem genérico-proveedor";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_BY_ITEM:
                viewTitle = "Compras x ítem";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_BY_ITEM_BP:
                viewTitle = "Compras x ítem-proveedor";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_BY_TP_BP:
                viewTitle = "Compras x tipo proveedor";
                break;
            case SDataConstantsSys.TRNX_PUR_TOT_BY_TP_BP_BP:
                viewTitle = "Compras x tipo proveedor-proveedor";
                break;
           case SDataConstantsSys.TRNX_PUR_DPS_BY_ITEM_BP_FIL:
                viewTitle = "Compras docs. x ítem-proveedor";
                break;
            default:
        }

        return viewTitle;
    }

    private int showForm(int formType, int auxType, java.lang.Object pk, boolean isCopy) {
        int result = SLibConstants.UNDEFINED;

        try {
            clearFormMembers();
            setFrameWaitCursor();

            switch (formType) {
                case SDataConstants.TRN_DNC_DPS_DNS:
                    if (moFormDncDocumentNumberSeriesDps == null) {
                        moFormDncDocumentNumberSeriesDps = new SFormDncDocumentNumberSeries(miClient, formType);
                    }
                    if (pk != null) {
                        moRegistry = new SDataDpsDncDocumentNumberSeries();
                    }
                    miForm = moFormDncDocumentNumberSeriesDps;
                    miForm.setValue(SDataConstantsSys.VALUE_IS_PUR, true);
                    break;
                case SDataConstants.TRN_DNC_DIOG_DNS:
                    if (moFormDncDocumentNumberSeriesDiog == null) {
                        moFormDncDocumentNumberSeriesDiog = new SFormDncDocumentNumberSeries(miClient, formType);
                    }
                    if (pk != null) {
                        moRegistry = new SDataDiogDncDocumentNumberSeries();
                    }
                    miForm = moFormDncDocumentNumberSeriesDiog;
                    miForm.setValue(SDataConstantsSys.VALUE_IS_PUR, true);
                    break;
                case SDataConstants.TRN_BP_BLOCK:
                    if (moFormBizPartnerBlocking == null) {
                        moFormBizPartnerBlocking = new SFormBizPartnerBlocking(miClient);
                    }
                    miForm = moFormBizPartnerBlocking;
                    if (pk != null) {
                        moRegistry = new SDataBizPartnerBlocking();
                    }
                    miForm.setValue(1, SDataConstantsSys.BPSS_CT_BP_SUP);
                    break;
                case SDataConstants.TRN_DPS:
                    if (moFormDps == null) {
                        moFormDps = new SFormDps(miClient, SDataConstantsSys.TRNS_CT_DPS_PUR);
                    }
                    miForm = moFormDps;
                    if (pk != null) {
                        moRegistry = new SDataDps();
                    }
                    break;
                case SDataConstants.TRNX_DPS_RO:
                    if (moFormDpsRo == null) {
                        moFormDpsRo = new SFormDps(miClient, SDataConstantsSys.TRNS_CT_DPS_PUR);
                    }
                    miForm = moFormDpsRo;
                    if (pk != null) {
                        moRegistry = new SDataDps();
                    }
                    break;
                case SDataConstants.TRN_DSM:
                    if (moFormDsm == null) {
                        moFormDsm = new SFormDsm(miClient);
                    }
                    if (pk != null) {
                        moRegistry = new SDataDsm();
                    }
                    miForm = moFormDsm;
                    miForm.setValue(1, auxType);
                    break;
                case SDataConstants.FIN_CC_ITEM:
                    if (moFormCostCenterItem == null) {
                        moFormCostCenterItem = new SFormCostCenterItem(miClient);
                    }
                    if (pk != null) {
                        moRegistry = new SDataCostCenterItem();
                    }
                    miForm = moFormCostCenterItem;
                    break;
                default:
                    throw new Exception(SLibConstants.MSG_ERR_UTIL_UNKNOWN_FORM);
            }

            // Additional configuration, if applies:

            switch (formType) {
                case SDataConstants.TRN_DPS:
                    miForm.setValue(SDataConstants.USRS_TP_LEV, mnCurrentUserPrivilegeLevel);

                    if (moFormComplement != null) {
                        if (moFormComplement instanceof int[]) {
                            // Complement has document type:

                            miForm.setValue(SLibConstants.VALUE_TYPE, moFormComplement);
                            miForm.setValue(SLibConstants.VALUE_STATUS, false);     // editable status
                            miForm.setValue(SLibConstants.VALUE_CURRENCY_LOCAL, false);     // convert local currency DPS
                        }
                        else if (moFormComplement instanceof Object[]) {
                            // Complement has document type and a reference document to import entries:

                            miForm.setValue(SLibConstants.VALUE_TYPE, ((Object[]) moFormComplement)[0]);    // int[]

                            if (((Object[]) moFormComplement).length >= 2) {
                                if (((Object[]) moFormComplement)[1] instanceof Boolean) {
                                    miForm.setValue(SLibConstants.VALUE_STATUS, ((Object[]) moFormComplement)[1]);
                                }
                                else if (((Object[]) moFormComplement)[1] instanceof SDataDps) {
                                    if (SLibUtilities.compareKeys(((Object[]) moFormComplement)[0], SDataConstantsSys.TRNU_TP_DPS_PUR_ORD)) {
                                        miForm.setValue(SDataConstantsSys.TRNX_TP_DPS_EST, ((Object[]) moFormComplement)[1]);
                                    }
                                    else if (SLibUtilities.compareKeys(((Object[]) moFormComplement)[0], SDataConstantsSys.TRNU_TP_DPS_PUR_INV)) {
                                        miForm.setValue(SDataConstantsSys.TRNX_TP_DPS_ORD, ((Object[]) moFormComplement)[1]);
                                    }
                                    else if (SLibUtilities.compareKeys(((Object[]) moFormComplement)[0], SDataConstantsSys.TRNU_TP_DPS_PUR_CN)) {
                                        miForm.setValue(SDataConstantsSys.TRNX_TP_DPS_DOC, ((Object[]) moFormComplement)[1]);
                                    }
                                }
                            }

                            if (((Object[]) moFormComplement).length >= 3 && ((Object[]) moFormComplement)[2] != null) {
                                miForm.setValue(SDataConstants.TRNS_STP_DPS_ADJ, ((Object[]) moFormComplement)[2]);
                            }

                            if (((Object[]) moFormComplement).length >= 4) {
                                miForm.setValue(SLibConstants.VALUE_CURRENCY_LOCAL, ((Object[]) moFormComplement)[3]);
                            }
                        }
                    }
                    break;

                case SDataConstants.TRNX_DPS_RO:
                    miForm.setValue(SLibConstants.VALUE_TYPE, moFormComplement);    // int[] document type
                    miForm.setValue(SLibConstants.VALUE_STATUS, true);              // editable status
                    break;

                default:
            }

            result = processForm(pk, isCopy);
            clearFormComplement();
        }
        catch (java.lang.Exception e) {
            SLibUtilities.renderException(this, e);
        }
        finally {
            restoreFrameCursor();
        }

        return result;
    }

    @Override
    public void showView(int viewType) {
        showView(viewType, 0, 0);
    }

    @Override
    public void showView(int viewType, int auxType) {
        showView(viewType, auxType, 0);
    }

    @Override
    public void showView(int viewType, int auxType01, int auxType02) {
        java.lang.String sViewTitle = "";
        java.lang.Class oViewClass = null;

        try {
            setFrameWaitCursor();

            switch (viewType) {
                case SDataConstants.TRN_DNC_DPS_DNS:
                case SDataConstants.TRN_DNC_DIOG_DNS:
                    oViewClass = erp.mtrn.view.SViewDncDocumentNumberSeries.class;
                    switch(viewType) {
                        case SDataConstants.TRN_DNC_DPS_DNS:
                            sViewTitle = "Folios docs. compras";
                            break;
                        case SDataConstants.TRN_DNC_DIOG_DNS:
                            sViewTitle = "Folios docs. mercancías";
                            break;
                        default:
                            throw new Exception(SLibConstants.MSG_ERR_UTIL_UNKNOWN_VIEW);
                    }
                    auxType02 = auxType01;
                    auxType01 = viewType;
                    break;

                case SDataConstants.TRN_BP_BLOCK:
                    oViewClass = erp.mtrn.view.SViewBizPartnerBlocking.class;
                    sViewTitle = "Bloqueo proveedores";
                    break;

                case SDataConstants.FIN_CC_ITEM:
                    oViewClass = erp.mfin.view.SViewCostCenterItem.class;
                    sViewTitle = "Config. centros costo ítems";
                    break;

                case SDataConstants.TRN_DPS:
                    oViewClass = erp.mtrn.view.SViewDps.class;
                    switch (auxType02) {
                        case SDataConstantsSys.TRNX_TP_DPS_EST_EST:
                        case SDataConstantsSys.TRNX_TP_DPS_EST_CON:
                        case SDataConstantsSys.TRNX_TP_DPS_ORD:
                        case SDataConstantsSys.TRNX_TP_DPS_DOC:
                        case SDataConstantsSys.TRNX_TP_DPS_ADJ:
                            sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(auxType02);
                            break;
                        case SDataConstantsSys.TRNX_TP_DPS_DOC + SDataConstantsSys.TRNX_DPS_DOC_ANNUL:
                            sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_DOC) + " anulación";
                            break;
                        case SDataConstantsSys.TRNX_TP_DPS_DOC + SDataConstantsSys.TRNX_DPS_DOC_RISS:
                            sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_DOC) + " reimpresión";
                            break;
                        case SDataConstantsSys.TRNX_TP_DPS_DOC + SDataConstantsSys.TRNX_DPS_DOC_REPL:
                            sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_DOC) + " sustitución";
                            break;
                        case SDataConstantsSys.TRNX_TP_DPS_ADJ + SDataConstantsSys.TRNX_DPS_DOC_ANNUL:
                            sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_ADJ) + " anulación";
                            break;
                        case SDataConstantsSys.TRNX_TP_DPS_ADJ + SDataConstantsSys.TRNX_DPS_DOC_RISS:
                            sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_ADJ) + " reimpresión";
                            break;
                        case SDataConstantsSys.TRNX_TP_DPS_ADJ + SDataConstantsSys.TRNX_DPS_DOC_REPL:
                            sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(SDataConstantsSys.TRNX_TP_DPS_ADJ) + " sustitución";
                            break;
                        default:
                            throw new Exception(SLibConstants.MSG_ERR_UTIL_UNKNOWN_VIEW);
                    }
                    break;

                case SDataConstants.TRNX_DPS_LINK_PEND:
                    oViewClass = erp.mtrn.view.SViewDpsLink.class;
                    sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(auxType02) + " x procesar";
                    break;

                case SDataConstants.TRNX_DPS_LINK_PEND_ETY:
                    oViewClass = erp.mtrn.view.SViewDpsLink.class;
                    sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(auxType02) + " x procesar (detalle)";
                    break;

                case SDataConstants.TRNX_DPS_LINKED:
                    oViewClass = erp.mtrn.view.SViewDpsLink.class;
                    sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(auxType02) + " procesd@s";
                    break;

                case SDataConstants.TRNX_DPS_LINKED_ETY:
                    oViewClass = erp.mtrn.view.SViewDpsLink.class;
                    sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(auxType02) + " procesd@s (detalle)";
                    break;

                case SDataConstants.TRNX_DPS_LINKS:
                    oViewClass = erp.mtrn.view.SViewDpsLinksQuery.class;
                    sViewTitle = "CPA - Vínculos " + SDataConstantsSys.getLinkNamePlr(auxType02).toLowerCase();
                    break;

                case SDataConstants.TRNX_DPS_LINKS_TRACE:
                    oViewClass = erp.mtrn.view.SViewDpsLinksQueryTrace.class;
                    sViewTitle = "CPA - Rastreo vínculos " + SDataConstantsSys.getDpsTypeNamePlr(auxType01).toLowerCase();
                    break;

                case SDataConstants.TRNX_DPS_AUTHORIZE_PEND:
                    oViewClass = erp.mtrn.view.SViewDpsPendAuthorized.class;
                    sViewTitle = getViewTitle(auxType01);
                    break;

                case SDataConstants.TRNX_DPS_AUDIT_PEND:
                    oViewClass = erp.mtrn.view.SViewDpsAudit.class;
                    sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(auxType02) + " x auditar";
                    break;

                case SDataConstants.TRNX_DPS_AUDITED:
                    oViewClass = erp.mtrn.view.SViewDpsAudit.class;
                    sViewTitle = "CPA - " + SDataConstantsSys.getDpsTypeNamePlr(auxType02) + " auditad@s";
                    break;

                case SDataConstants.TRNX_PRICE_HIST:
                    oViewClass = erp.mtrn.view.SViewPriceHistory.class;
                    sViewTitle = "CPA - Historial precios";
                    break;
                case SDataConstants.MKT_PLIST_ITEM:
                    oViewClass = erp.mmkt.view.SViewPriceListItem.class;
                    sViewTitle = "CPA - Precios de ítems";
                    break;

                case SDataConstants.TRNX_DPS_BACKORDER:
                    switch (auxType01) {
                        case SDataConstantsSys.TRNX_PUR_BACKORDER_CON:
                        case SDataConstantsSys.TRNX_PUR_BACKORDER_ORD:
                            oViewClass = erp.mtrn.view.SViewBackorder.class;
                            if (auxType02 == SDataConstantsSys.TRNS_CL_DPS_PUR_EST[1]) {
                                sViewTitle = "CPA - BO contratos";
                            }
                            else {
                                sViewTitle = "CPA - BO pedidos";
                            }
                            break;

                        case SDataConstantsSys.TRNX_PUR_BACKORDER_CON_ITEM:
                        case SDataConstantsSys.TRNX_PUR_BACKORDER_ORD_ITEM:
                            oViewClass = erp.mtrn.view.SViewBackorder.class;
                            if (auxType02 == SDataConstantsSys.TRNS_CL_DPS_PUR_EST[1]) {
                                sViewTitle = "CPA - BO contratos x ítem";
                            }
                            else {
                                sViewTitle = "CPA - BO pedidos x ítem";
                            }
                            break;

                        case SDataConstantsSys.TRNX_PUR_BACKORDER_CON_ITEM_BP:
                        case SDataConstantsSys.TRNX_PUR_BACKORDER_ORD_ITEM_BP:
                            oViewClass = erp.mtrn.view.SViewBackorder.class;
                            if (auxType02 == SDataConstantsSys.TRNS_CL_DPS_PUR_EST[1]) {
                                sViewTitle = "CPA - BO contratos x ítem-cliente";
                            }
                            else {
                                sViewTitle = "CPA - BO pedidos x ítem-cliente";
                            }
                            break;
                            
                        case SDataConstantsSys.TRNX_PUR_BACKORDER_CON_ITEM_BP_BRA:
                        case SDataConstantsSys.TRNX_PUR_BACKORDER_ORD_ITEM_BP_BRA:
                            oViewClass = erp.mtrn.view.SViewBackorder.class;
                            if (auxType02 == SDataConstantsSys.TRNS_CL_DPS_PUR_EST[1]) {
                                sViewTitle = "CPA - BO contratos x ítem-cliente suc.";
                            }
                            else {
                                sViewTitle = "CPA - BO pedidos x ítem-cliente suc.";
                            }
                            break;
                            
                        default:
                    }
                    break;

                case SDataConstants.TRNX_DPS_BAL_AGING:
                    oViewClass = erp.mtrn.view.SViewDpsBalanceAging.class;
                    sViewTitle = "Antigüedad saldos proveedores";
                    break;

                case SDataConstants.TRNX_DPS_PAY_PEND:
                    oViewClass = erp.mtrn.view.SViewDpsPay.class;
                    sViewTitle = "Cuentas x pagar";
                    break;

                case SDataConstants.TRNX_DPS_PAYED:
                    oViewClass = erp.mtrn.view.SViewDpsPay.class;
                    sViewTitle = "Cuentas pagadas";
                    break;

                case SDataConstants.TRN_DSM:
                    oViewClass = erp.mtrn.view.SViewDsm.class;
                    sViewTitle = "Movimientos proveedores";
                    break;

                case SDataConstants.TRNX_DPS_QRY:
                    switch (auxType01) {
                        case SDataConstantsSys.TRNX_PUR_TOT:
                            oViewClass = erp.mtrn.view.SViewQueryGlobal.class;
                            sViewTitle = getViewTitle(auxType01);
                            break;
                        case SDataConstantsSys.TRNX_PUR_TOT_MONTH:
                            oViewClass = erp.mtrn.view.SViewQueryGlobalByMonth.class;
                            sViewTitle = getViewTitle(auxType01);
                            break;
                        case SDataConstantsSys.TRNX_PUR_TOT_BY_BP:
                        case SDataConstantsSys.TRNX_PUR_TOT_BY_BP_ITEM:
                        case SDataConstantsSys.TRNX_PUR_TOT_BY_IGEN:
                        case SDataConstantsSys.TRNX_PUR_TOT_BY_IGEN_BP:
                        case SDataConstantsSys.TRNX_PUR_TOT_BY_ITEM:
                        case SDataConstantsSys.TRNX_PUR_TOT_BY_ITEM_BP:
                        case SDataConstantsSys.TRNX_PUR_TOT_BY_TP_BP:
                        case SDataConstantsSys.TRNX_PUR_TOT_BY_TP_BP_BP:
                            oViewClass = erp.mtrn.view.SViewQueryTotal.class;
                            sViewTitle = getViewTitle(auxType01);
                            break;
                       case SDataConstantsSys.TRNX_PUR_DPS_BY_ITEM_BP_ALL:
                       case SDataConstantsSys.TRNX_PUR_DPS_BY_ITEM_BP_FIL:
                            oViewClass = erp.mtrn.view.SViewQueryDpsByItemBizPartner.class;
                            
                            if (auxType01 == SDataConstantsSys.TRNX_PUR_DPS_BY_ITEM_BP_ALL) {
                                sViewTitle = "CPA - Facturas (detalle)";
                            }
                            else {
                                sViewTitle = getViewTitle(auxType01);
                            }
                            break;
                        default:
                            throw new Exception(SLibConstants.MSG_ERR_UTIL_UNKNOWN_VIEW);
                    }
                    break;

                default:
                    throw new Exception(SLibConstants.MSG_ERR_UTIL_UNKNOWN_VIEW);
            }

            processView(oViewClass, sViewTitle, viewType, auxType01, auxType02);
        }
        catch (java.lang.Exception e) {
            SLibUtilities.renderException(this, e);
        }
        finally {
            restoreFrameCursor();
        }
    }

    @Override
    public int showForm(int formType, java.lang.Object pk) {
        return showForm(formType, SDataConstants.UNDEFINED, pk, false);
    }

    @Override
    public int showForm(int formType, int auxType, Object pk) {
        return showForm(formType, auxType, pk, false);
    }

    @Override
    public int showFormForCopy(int formType, java.lang.Object pk) {
        return showForm(formType, SDataConstants.UNDEFINED, pk, true);
    }

    @Override
    public erp.lib.form.SFormOptionPickerInterface getOptionPicker(int optionType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int annulRegistry(int registryType, java.lang.Object pk, sa.lib.gui.SGuiParams params) {
        int result = SLibConstants.UNDEFINED;

        try {
            switch (registryType) {
                case SDataConstants.TRN_DPS:
                    moRegistry = new SDataDps();
                    break;
                default:
                    throw new Exception(SLibConstants.MSG_ERR_UTIL_UNKNOWN_OPTION);
            }

            result = processActionAnnul(pk, true);
        }
        catch (Exception e) {
            SLibUtilities.renderException(this, e);
        }

        return result;
    }

    @Override
    public int deleteRegistry(int registryType, java.lang.Object pk) {
        int result = SLibConstants.UNDEFINED;

        try {
            switch (registryType) {
                case SDataConstants.TRN_DPS:
                    moRegistry = new SDataDps();
                    break;
                default:
                    throw new Exception(SLibConstants.MSG_ERR_UTIL_UNKNOWN_OPTION);
            }

            result = processActionDelete(pk, true);
        }
        catch (Exception e) {
            SLibUtilities.renderException(this, e);
        }

        return result;
    }

    @Override
    public javax.swing.JMenu[] getMenues() {
        return new JMenu[] { jmCat, jmEst, jmCon, jmOrd, jmDps, jmDpsAdj, jmStkSup, jmStkRet, jmReports };
    }

    @Override
    public javax.swing.JMenu[] getMenuesForModule(int moduleType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JMenuItem) {
            javax.swing.JMenuItem item = (javax.swing.JMenuItem) e.getSource();

            if (item == jmiCatDpsDncDocumentNumberSeries) {
                showView(SDataConstants.TRN_DNC_DPS_DNS, SDataConstantsSys.TRNS_CT_DPS_PUR);
            }
            else if (item == jmiCatDiogDncDocumentNumberSeries) {
                showView(SDataConstants.TRN_DNC_DIOG_DNS, SDataConstantsSys.TRNS_CT_IOG_IN);
            }
            else if (item == jmiCatBizPartnerBlocking) {
                showView(SDataConstants.TRN_BP_BLOCK, SDataConstantsSys.BPSS_CT_BP_SUP);
            }
            else if (item == jmiCatCfgCostCenterItem) {
                showView(SDataConstants.FIN_CC_ITEM);
            }
            else if (item == jmiEstimates) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_EST);
            }
            else if (item == jmiEstimatesLinkPend) {
                showView(SDataConstants.TRNX_DPS_LINK_PEND, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_EST);
            }
            else if (item == jmiEstimatesLinkPendEntry) {
                showView(SDataConstants.TRNX_DPS_LINK_PEND_ETY, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_EST);
            }
            else if (item == jmiEstimatesLinked) {
                showView(SDataConstants.TRNX_DPS_LINKED, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_EST);
            }
            else if (item == jmiEstimatesLinkedEntry) {
                showView(SDataConstants.TRNX_DPS_LINKED_ETY, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_EST);
            }
            else if (item == jmiEstimatesLinks) {
                showView(SDataConstants.TRNX_DPS_LINKS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_LINK_EST_EST_SRC);
            }
            else if (item == jmiContracts) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_CON);
            }
            else if (item == jmiContractsLinkPend) {
                showView(SDataConstants.TRNX_DPS_LINK_PEND, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_CON);
            }
            else if (item == jmiContractsLinkPendEntry) {
                showView(SDataConstants.TRNX_DPS_LINK_PEND_ETY, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_CON);
            }
            else if (item == jmiContractsLinked) {
                showView(SDataConstants.TRNX_DPS_LINKED, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_CON);
            }
            else if (item == jmiContractsLinkedEntry) {
                showView(SDataConstants.TRNX_DPS_LINKED_ETY, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_EST_CON);
            }
            else if (item == jmiContractsLinks) {
                showView(SDataConstants.TRNX_DPS_LINKS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_LINK_EST_CON_SRC);
            }
            else if (item == jmiContractsLinkPendEntryPrice) {
                miClient.getSession().showView(SModConsts.TRN_DPS_ETY_PRC, SModConsts.MOD_TRN_PUR_N, new SGuiParams(SModConsts.VIEW_ST_PEND));
            }
            else if (item == jmiContractsLinkedEntryPrice) {
                miClient.getSession().showView(SModConsts.TRN_DPS_ETY_PRC, SModConsts.MOD_TRN_PUR_N, new SGuiParams(SModConsts.VIEW_ST_DONE));
            }
            else if (item == jmiOrders) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ORD);
            }
            else if (item == jmiOrdersLinkPend) {
                showView(SDataConstants.TRNX_DPS_LINK_PEND, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ORD);
            }
            else if (item == jmiOrdersLinkPendEntry) {
                showView(SDataConstants.TRNX_DPS_LINK_PEND_ETY, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ORD);
            }
            else if (item == jmiOrdersLinked) {
                showView(SDataConstants.TRNX_DPS_LINKED, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ORD);
            }
            else if (item == jmiOrdersLinkedEntry) {
                showView(SDataConstants.TRNX_DPS_LINKED_ETY, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ORD);
            }
            else if (item == jmiOrdersLinksSource) {
                showView(SDataConstants.TRNX_DPS_LINKS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_LINK_ORD_SRC);
            }
            else if (item == jmiOrdersLinksDestiny) {
                showView(SDataConstants.TRNX_DPS_LINKS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_LINK_ORD_DES);
            }
            else if (item == jmiOrdersAutorizedPending) {
                showView(SDataConstants.TRNX_DPS_AUTHORIZE_PEND, SDataConstantsSys.TRNX_DPS_PUR_ORD_AUT_PEND);
            }
            else if (item == jmiOrdersAutorizedAutorized) {
                showView(SDataConstants.TRNX_DPS_AUTHORIZE_PEND, SDataConstantsSys.TRNX_DPS_PUR_ORD_AUT_AUT);
            }
            else if (item == jmiOrdersAutorizedRejected) {
                showView(SDataConstants.TRNX_DPS_AUTHORIZE_PEND, SDataConstantsSys.TRNX_DPS_PUR_ORD_AUT_REJ);
            }
            else if (item == jmiDps) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_DOC);
            }
            else if (item == jmiDpsEntry) {
               showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_DPS_BY_ITEM_BP_ALL);
            }
            else if (item == jmiDpsAnnuled) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_DOC + SDataConstantsSys.TRNX_DPS_DOC_ANNUL);
            }
            else if (item == jmiDpsReissued) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_DOC + SDataConstantsSys.TRNX_DPS_DOC_RISS);
            }
            else if (item == jmiDpsReplaced) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_DOC + SDataConstantsSys.TRNX_DPS_DOC_REPL);
            }
            else if (item == jmiDpsLinksDestiny) {
                showView(SDataConstants.TRNX_DPS_LINKS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_LINK_DOC_DES);
            }
            else if (item == jmiDpsLinksTrace) {
                showView(SDataConstants.TRNX_DPS_LINKS_TRACE, SDataConstantsSys.TRNS_CT_DPS_PUR);
            }
            else if (item == jmiDpsAutorizedPending) {
                showView(SDataConstants.TRNX_DPS_AUTHORIZE_PEND, SDataConstantsSys.TRNX_DPS_PUR_DOC_AUT_PEND);
            }
            else if (item == jmiDpsAutorizedAutorized) {
                showView(SDataConstants.TRNX_DPS_AUTHORIZE_PEND, SDataConstantsSys.TRNX_DPS_PUR_DOC_AUT_AUT);
            }
            else if (item == jmiDpsAutorizedReject) {
                showView(SDataConstants.TRNX_DPS_AUTHORIZE_PEND, SDataConstantsSys.TRNX_DPS_PUR_DOC_AUT_REJ);
            }
            else if (item == jmiDpsAuditPending) {
                showView(SDataConstants.TRNX_DPS_AUDIT_PEND, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_DOC);
            }
            else if (item == jmiDpsAudited) {
                showView(SDataConstants.TRNX_DPS_AUDITED, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_DOC);
            }
            else if (item == jmiDpsPriceHistory || item == jmiOrdersPriceHistory) {
                showView(SDataConstants.TRNX_PRICE_HIST, SDataConstantsSys.TRNS_CT_DPS_PUR);
            }
            else if (item == jmiOrdersPrice) {
                showView(SDataConstants.MKT_PLIST_ITEM, SDataConstantsSys.TRNS_CT_DPS_PUR);
            }
            else if (item == jmiDpsAdjustments) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ADJ);
            }
            else if (item == jmiDpsAdjustmentsAnnuled) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ADJ + SDataConstantsSys.TRNX_DPS_DOC_ANNUL);
            }
            else if (item == jmiDpsAdjustmentsReissued) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ADJ + SDataConstantsSys.TRNX_DPS_DOC_RISS);
            }
            else if (item == jmiDpsAdjustmentsReplaced) {
                showView(SDataConstants.TRN_DPS, SDataConstantsSys.TRNS_CT_DPS_PUR, SDataConstantsSys.TRNX_TP_DPS_ADJ + SDataConstantsSys.TRNX_DPS_DOC_REPL);
            }
            else if (item == jmiStockSupplyPend) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DPS_SUPPLY_PEND, SDataConstantsSys.TRNS_CL_DPS_PUR_DOC[0], SDataConstantsSys.TRNS_CL_DPS_PUR_DOC[1]);
            }
            else if (item == jmiStockSupplyPendEntry) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DPS_SUPPLY_PEND_ETY, SDataConstantsSys.TRNS_CL_DPS_PUR_DOC[0], SDataConstantsSys.TRNS_CL_DPS_PUR_DOC[1]);
            }
            else if (item == jmiStockSupplied) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DPS_SUPPLIED, SDataConstantsSys.TRNS_CL_DPS_PUR_DOC[0], SDataConstantsSys.TRNS_CL_DPS_PUR_DOC[1]);
            }
            else if (item == jmiStockSuppliedEntry) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DPS_SUPPLIED_ETY, SDataConstantsSys.TRNS_CL_DPS_PUR_DOC[0], SDataConstantsSys.TRNS_CL_DPS_PUR_DOC[1]);
            }
            else if (item == jmiStockSupplyDiog) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRN_DIOG, SDataConstantsSys.TRNS_CL_IOG_IN_PUR[0], SDataConstantsSys.TRNS_CL_IOG_IN_PUR[1]);
            }
            else if (item == jmiStatisticsConsume) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_STK_COMSUME, SDataConstantsSys.TRNS_CT_DPS_PUR);
            }
            else if (item == jmiStockReturnPend) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DPS_RETURN_PEND, SDataConstantsSys.TRNS_CL_DPS_PUR_ADJ[0], SDataConstantsSys.TRNS_CL_DPS_PUR_ADJ[1]);
            }
            else if (item == jmiStockReturnPendEntry) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DPS_RETURN_PEND_ETY, SDataConstantsSys.TRNS_CL_DPS_PUR_ADJ[0], SDataConstantsSys.TRNS_CL_DPS_PUR_ADJ[1]);
            }
            else if (item == jmiStockReturned) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DPS_RETURNED, SDataConstantsSys.TRNS_CL_DPS_PUR_ADJ[0], SDataConstantsSys.TRNS_CL_DPS_PUR_ADJ[1]);
            }
            else if (item == jmiStockReturnedEntry) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRNX_DPS_RETURNED_ETY, SDataConstantsSys.TRNS_CL_DPS_PUR_ADJ[0], SDataConstantsSys.TRNS_CL_DPS_PUR_ADJ[1]);
            }
            else if (item == jmiStockReturnDiog) {
                miClient.getGuiModule(SDataConstants.MOD_INV).showView(SDataConstants.TRN_DIOG, SDataConstantsSys.TRNS_CL_IOG_OUT_PUR[0], SDataConstantsSys.TRNS_CL_IOG_OUT_PUR[1]);
            }
            else if (item == jmiReportsTrnGlobal) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT);
            }
            else if (item == jmiReportsTrnByMonth) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_MONTH);
            }
            else if (item == jmiReportsTrnByItemGeneric) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_BY_IGEN);
            }
            else if (item == jmiReportsTrnByItemGenericBizPartner) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_BY_IGEN_BP);
            }
            else if (item == jmiReportsTrnByItem) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_BY_ITEM);
            }
            else if (item == jmiReportsTrnByItemBizPartner) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_BY_ITEM_BP);
            }
            else if (item == jmiReportsTrnByBizPartner) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_BY_BP);
            }
            else if (item == jmiReportsTrnByBizPartnerItem) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_BY_BP_ITEM);
            }
            else if (item == jmiReportsTrnByBizPartnerType) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_BY_TP_BP);
            }
            else if (item == jmiReportsTrnByBizPartnerTypeBizPartner) {
                showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_TOT_BY_TP_BP_BP);
            }
            else if (item == jmiReportsTrnDpsByItemBizPartner) {
               showView(SDataConstants.TRNX_DPS_QRY, SDataConstantsSys.TRNX_PUR_DPS_BY_ITEM_BP_FIL);
            }
            else if (item == jmiReportsBackorderContract) {
                showView(SDataConstants.TRNX_DPS_BACKORDER, SDataConstantsSys.TRNX_PUR_BACKORDER_CON, SDataConstantsSys.TRNS_CL_DPS_PUR_EST[1]);
            }
            else if (item == jmiReportsBackorderContractByItem) {
                showView(SDataConstants.TRNX_DPS_BACKORDER, SDataConstantsSys.TRNX_PUR_BACKORDER_CON_ITEM, SDataConstantsSys.TRNS_CL_DPS_PUR_EST[1]);
            }
            else if (item == jmiReportsBackorderContractByItemBizPartner) {
                showView(SDataConstants.TRNX_DPS_BACKORDER, SDataConstantsSys.TRNX_PUR_BACKORDER_CON_ITEM_BP, SDataConstantsSys.TRNS_CL_DPS_PUR_EST[1]);
            }
            else if (item == jmiReportsBackorderContractByItemBizPartnerBra) {
                showView(SDataConstants.TRNX_DPS_BACKORDER, SDataConstantsSys.TRNX_PUR_BACKORDER_CON_ITEM_BP_BRA, SDataConstantsSys.TRNS_CL_DPS_PUR_EST[1]);
            }
            else if (item == jmiReportsBackorderOrder) {
                showView(SDataConstants.TRNX_DPS_BACKORDER, SDataConstantsSys.TRNX_PUR_BACKORDER_ORD, SDataConstantsSys.TRNS_CL_DPS_PUR_ORD[1]);
            }
            else if (item == jmiReportsBackorderOrderByItem) {
                showView(SDataConstants.TRNX_DPS_BACKORDER, SDataConstantsSys.TRNX_PUR_BACKORDER_ORD_ITEM, SDataConstantsSys.TRNS_CL_DPS_PUR_ORD[1]);
            }
            else if (item == jmiReportsBackorderOrderByItemBizPartner) {
                showView(SDataConstants.TRNX_DPS_BACKORDER, SDataConstantsSys.TRNX_PUR_BACKORDER_ORD_ITEM_BP, SDataConstantsSys.TRNS_CL_DPS_PUR_ORD[1]);
            }
            else if (item == jmiReportsBackorderOrderByItemBizPartnerBra) {
                showView(SDataConstants.TRNX_DPS_BACKORDER, SDataConstantsSys.TRNX_PUR_BACKORDER_ORD_ITEM_BP_BRA, SDataConstantsSys.TRNS_CL_DPS_PUR_ORD[1]);
            }
            else if (item == jmiReportsBizPartnerBalanceAgingView) {
                showView(SDataConstants.TRNX_DPS_BAL_AGING, SDataConstantsSys.TRNS_CT_DPS_PUR);
            }
            else if (item == jmiReportsBizPartnerBalance) {
                new SDialogRepBizPartnerBalance(miClient, SDataConstantsSys.BPSS_CT_BP_SUP).setVisible(true);
            }
            else if (item == jmiReportsBizPartnerBalanceDps) {
                new SDialogRepBizPartnerBalanceDps(miClient, SDataConstantsSys.BPSS_CT_BP_SUP).setVisible(true);
            }
            else if (item == jmiReportsBizPartnerBalanceAging) {
                new SDialogRepBizPartnerBalanceAging(miClient, SDataConstantsSys.FINS_TP_SYS_MOV_BPS_SUP).setVisible(true);
            }
            else if (item == jmiReportsAccountStatements) {
                new SDialogRepBizPartnerStatements(miClient, SDataConstantsSys.BPSS_CT_BP_SUP, false).setVisible(true);
            }
            else if (item == jmiReportsAccountStatementsDps) {
                new SDialogRepBizPartnerStatements(miClient, SDataConstantsSys.BPSS_CT_BP_SUP, true).setVisible(true);
            }
            else if (item == jmiReportsBizPartnerAccountingMoves) {
                new SDialogRepBizPartnerAccountingMoves(miClient, SDataConstantsSys.BPSS_CT_BP_SUP).setVisible(true);
            }
            else if (item == jmiReportsBizPartnerAccountingMovesDays) {
                new SDialogRepBizPartnerAccountingMoves(miClient, SDataConstantsSys.BPSS_CT_BP_SUP, true).setVisible(true);
            }
            else if (item == jmiReportsBizPartnerAuxMoves) {
                new SDialogRepBizPartnerAuxMoves(miClient, SDataConstantsSys.BPSS_CT_BP_SUP).setVisible(true);
            }
            else if (item == jmiReportsDpsList) {
                moDialogRepDpsList.setParamIsSupplier(true);
                moDialogRepDpsList.formRefreshCatalogues();
                moDialogRepDpsList.formReset();
                moDialogRepDpsList.setFormVisible(true);
            }
            else if (item == jmiReportsDpsBizPartner) {
                moDialogRepDpsBizPartner.setParamIsSupplier(true);
                moDialogRepDpsBizPartner.formRefreshCatalogues();
                moDialogRepDpsBizPartner.formReset();
                moDialogRepDpsBizPartner.setFormVisible(true);
            }
            else if (item == jmiReportsDpsWithBalance) {
                moDialogRepDpsWithBalance.setParamIsSupplier(true);
                moDialogRepDpsWithBalance.formRefreshCatalogues();
                moDialogRepDpsWithBalance.formReset();
                moDialogRepDpsWithBalance.setFormVisible(true);
            }
            else if (item == jmiReportsTrn) {
                moDialogRepSalesPurchases.setParamIsSupplier(true);
                moDialogRepSalesPurchases.formRefreshCatalogues();
                moDialogRepSalesPurchases.formReset();
                moDialogRepSalesPurchases.setFormVisible(true);
            }
            else if (item == jmiReportsTrnConcept) {
                moDialogRepSalesPurchasesByConcept.formRefreshCatalogues();
                moDialogRepSalesPurchasesByConcept.formReset();
                moDialogRepSalesPurchasesByConcept.setParamIsSupplier(true);
                moDialogRepSalesPurchasesByConcept.setFormVisible(true);
            }
            else if (item == jmiReportsTrnLocality) {
                moDialogRepSalesPurchasesByLocality.formRefreshCatalogues();
                moDialogRepSalesPurchasesByLocality.formReset();
                moDialogRepSalesPurchasesByLocality.setParamIsSupplier(true);
                moDialogRepSalesPurchasesByLocality.setFormVisible(true);
            }
            else if (item == jmiReportsTrnComparative) {
                moDialogRepSalesPurchasesComparative.formReset();
                moDialogRepSalesPurchasesComparative.setFormVisible(true);
            }
            else if (item == jmiReportsTrnDpsDetailBizPartner) {
                moDialogRepSalesPurchasesDetailByBizPartner.formRefreshCatalogues();
                moDialogRepSalesPurchasesDetailByBizPartner.formReset();
                moDialogRepSalesPurchasesDetailByBizPartner.setParamIsSupplier(true);
                moDialogRepSalesPurchasesDetailByBizPartner.setFormVisible(true);
            }
            else if (item == jmiReportsTrnNetTotals) {
                moDialogRepSalesPurchasesNet.formRefreshCatalogues();
                moDialogRepSalesPurchasesNet.formReset();
                moDialogRepSalesPurchasesNet.setParamIsSupplier(true);
                moDialogRepSalesPurchasesNet.setParamIsNet(true);
                moDialogRepSalesPurchasesNet.setFormVisible(true);
            }
            else if (item == jmiReportsTrnNet) {
                moDialogRepSalesPurchasesNet.formRefreshCatalogues();
                moDialogRepSalesPurchasesNet.formReset();
                moDialogRepSalesPurchasesNet.setParamIsSupplier(true);
                moDialogRepSalesPurchasesNet.setParamIsNet(false);
                moDialogRepSalesPurchasesNet.setFormVisible(true);
            }
            else if (item == jmiReportsTrnFile) {
                moDialogRepSalesPurchasesFile.formReset();
                moDialogRepSalesPurchasesFile.setFormVisible(true);
            }
            else if (item == jmiReportsTrnDiary) {
                moDialogRepSalesPurchasesDiary.formRefreshCatalogues();
                moDialogRepSalesPurchasesDiary.formReset();
                moDialogRepSalesPurchasesDiary.setParamIsSupplier(true);
                moDialogRepSalesPurchasesDiary.setFormVisible(true);
            }
            else if (item == jmiReportsTrnItemUnitaryPrice) {
                moDialogRepSalesPurchasesItemUnitaryPrice.formRefreshCatalogues();
                moDialogRepSalesPurchasesItemUnitaryPrice.formReset();
                moDialogRepSalesPurchasesItemUnitaryPrice.setParamIsSupplier(true);
                moDialogRepSalesPurchasesItemUnitaryPrice.setFormVisible(true);
            }
            else if (item == jmiReportsTrnUnitaryCosts) {
                moDialogRepPurchasesUnitaryCost.formRefreshCatalogues();
                moDialogRepPurchasesUnitaryCost.formReset();
                moDialogRepPurchasesUnitaryCost.setFormVisible(true);
            }
            else if (item == jmiReportsTrnContractStock) {
                moDialogRepContractStock.formRefreshCatalogues();
                moDialogRepContractStock.formReset();
                moDialogRepContractStock.setParamIsSupplier(true);
                moDialogRepContractStock.setFormVisible(true);
            }
            else if (item == jmiReportsTrnContractStatus) {
                new SDialogRepContractStatus(miClient.getSession().getClient(), SDataConstantsSys.BPSS_CT_BP_SUP, "Reporte de estatus de contratos").setVisible(true);
            }
        }
    }
}