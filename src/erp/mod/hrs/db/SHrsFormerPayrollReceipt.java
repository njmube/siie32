/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.db;

import cfd.DAttributeOptionCondicionesPago;
import cfd.DAttributeOptionFormaPago;
import cfd.DAttributeOptionTipoComprobante;
import cfd.DElement;
import cfd.ver3.DVer3Utils;
import cfd.ver3.nom11.DElementDeduccion;
import cfd.ver3.nom11.DElementDeducciones;
import cfd.ver3.nom11.DElementPercepcion;
import cfd.ver3.nom11.DElementPercepciones;
import cfd.ver3.nom12.DElementIncapacidad;
import cfd.ver3.nom12.DElementSeparacionIndemnizacion;
import erp.cfd.SCfdConsts;
import erp.cfd.SCfdDataConcepto;
import erp.cfd.SCfdDataImpuesto;
import erp.cfd.SCfdXml;
import erp.client.SClientInterface;
import erp.data.SDataConstantsSys;
import erp.mod.SModConsts;
import erp.mod.SModSysConsts;
import java.util.ArrayList;
import java.util.Date;
import sa.lib.SLibTimeUtils;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;

/**
 *
 * @author Juan Barajas
 * 
 * Maintenance Log
 * 2016-07-11, Sergio Flores:
 *  Deletion of obsolete import sentences.
 * 
 */
public class SHrsFormerPayrollReceipt implements SCfdXml {

    protected SClientInterface miClient;

    protected int mnPkEmpleadoId;
    protected int mnPkSucursalEmpleadoId;
    protected String msRegistroPatronal;
    protected String msNumEmpleado;
    protected String msCurp;
    protected int mnTipoRegimen;
    protected String msTipoRegimen;
    protected String msNumSeguridadSocial;
    protected Date mtFechaPago;
    protected Date mtFechaInicialPago;
    protected Date mtFechaFinalPago;
    protected double mdNumDiasPagados;
    protected String msDepartamento;
    protected String msCuentaBancaria;
    protected int mnBanco;
    protected Date mtFechaInicioRelLaboral;
    protected int mnAntiguedad;
    protected String msPuesto;
    protected String msTipoContrato;
    protected String msSindicalizado;
    protected String msTipoJornada;
    protected String msPeriodicidadPago;
    protected double mdSalarioBaseCotApor;
    protected int mnRiesgoPuesto;
    protected String msRiesgoPuesto;
    protected double mdSalarioDiarioIntegrado;
    protected String msClaveEstado;

    protected double mdTotalPercepciones;
    protected double mdTotalDeducciones;
    protected double mdTotalRetenciones;
    protected double mdTotalNeto;
    protected int mnMetodoPago;
    protected String msMetodoPagoAux;
    protected String msSerie;
    protected int mnFolio;
    protected String msMoneda;
    protected Date mtFechaEdicion;

    protected int mnAuxEmpleadoId;
    protected double mdAuxSueldoMensual;

    protected SHrsFormerPayroll moPayroll;
    protected ArrayList<SHrsFormerPayrollConcept> moChildPayrollConcept;

    public SHrsFormerPayrollReceipt(SHrsFormerPayroll payroll, SClientInterface client) {
        miClient = client;

        mnPkEmpleadoId = 0;
        mnPkSucursalEmpleadoId = 0;
        msRegistroPatronal = "";
        msNumEmpleado = "";
        msCurp = "";
        mnTipoRegimen = 0;
        msTipoRegimen = "";
        msNumSeguridadSocial = "";
        mtFechaPago = null;
        mtFechaInicialPago = null;
        mtFechaFinalPago = null;
        mdNumDiasPagados = 0;
        msDepartamento = "";
        msCuentaBancaria = "";
        mnBanco = 0;
        mtFechaInicioRelLaboral = null;
        mnAntiguedad = 0;
        msPuesto = "";
        msTipoContrato = "";
        msSindicalizado = "";
        msTipoJornada = "";
        msPeriodicidadPago = "";
        mdSalarioBaseCotApor = 0;
        mnRiesgoPuesto = 0;
        msRiesgoPuesto = "";
        mdSalarioDiarioIntegrado = 0;
        msClaveEstado = "";

        mdTotalPercepciones = 0;
        mdTotalDeducciones = 0;
        mdTotalRetenciones = 0;
        mdTotalNeto = 0;
        mnMetodoPago = 0;
        msMetodoPagoAux = "";
        msSerie = "";
        mnFolio = 0;
        msMoneda = "";
        mtFechaEdicion = null;

        mnAuxEmpleadoId = 0;
        mdAuxSueldoMensual = 0;

        moPayroll = payroll;
        moChildPayrollConcept = new ArrayList<SHrsFormerPayrollConcept>();
    }

    public void setPkEmpleadoId(int n) { mnPkEmpleadoId = n; }
    public void setPkSucursalEmpleadoId(int n) { mnPkSucursalEmpleadoId = n; }
    public void setRegistroPatronal(String s) { msRegistroPatronal = s; }
    public void setNumEmpleado(String s) { msNumEmpleado = s; }
    public void setCurp(String s) { msCurp = s; }
    public void setTipoRegimen(int n) { mnTipoRegimen = n; }
    public void setTipoRegimen(String s) { msTipoRegimen = s; }
    public void setNumSeguridadSocial(String s) { msNumSeguridadSocial = s; }
    public void setFechaPago(Date t) { mtFechaPago = t; }
    public void setFechaInicialPago(Date t) { mtFechaInicialPago = t; }
    public void setFechaFinalPago(Date t) { mtFechaFinalPago = t; }
    public void setNumDiasPagados(double d) { mdNumDiasPagados = d; }
    public void setDepartamento(String s) { msDepartamento = s; }
    public void setClabe(String s) { msCuentaBancaria = s; }
    public void setBanco(int n) { mnBanco = n; }
    public void setFechaInicioRelLaboral(Date t) { mtFechaInicioRelLaboral = t; }
    public void setAntiguedad(int n) { mnAntiguedad = n; }
    public void setPuesto(String s) { msPuesto = s; }
    public void setRiesgoPuesto(int n) { mnRiesgoPuesto = n; }
    public void setRiesgoPuesto(String s) { msRiesgoPuesto = s; }
    public void setTipoContrato(String s) { msTipoContrato = s; }
    public void setSindicalizado(String s) { msSindicalizado = s; }
    public void setTipoJornada(String s) { msTipoJornada = s; }
    public void setPeriodicidadPago(String s) { msPeriodicidadPago = s; }
    public void setSalarioBaseCotApor(double d) { mdSalarioBaseCotApor = d; }
    public void setSalarioDiarioIntegrado(double d) { mdSalarioDiarioIntegrado = d; }
    public void setClaveEstado(String s) { msClaveEstado = s; }

    public void setTotalPercepciones(double d) { mdTotalPercepciones = d; }
    public void setTotalDeducciones(double d) { mdTotalDeducciones = d; }
    public void setTotalRetenciones(double d) { mdTotalRetenciones = d; }
    public void setTotalNeto(double d) { mdTotalNeto = d; }
    public void setMetodoPago(int n) { mnMetodoPago = n; }
    public void setMetodoPagoAux(String s) { msMetodoPagoAux = s; }
    public void setSerie(String s) { msSerie = s; }
    public void setFolio(int n) { mnFolio = n; }
    public void setMoneda(String s) { msMoneda = s; }
    public void setFechaEdicion(Date t) { mtFechaEdicion = t; }

    public void setAuxEmpleadoId(int n) { mnAuxEmpleadoId = n; }
    public void setAuxSueldoMensual(double d) { mdAuxSueldoMensual = d; }

    public void setPayroll(SHrsFormerPayroll o) { moPayroll = o; }

    public int getPkEmpleadoId() { return mnPkEmpleadoId; }
    public int getPkSucursalEmpleadoId() { return mnPkSucursalEmpleadoId; }
    public String getRegistroPatronal() { return msRegistroPatronal; }
    public String getNumEmpleado() { return msNumEmpleado; }
    public String getCurp() { return msCurp; }
    public int getTipoRegimen() { return mnTipoRegimen; }
    public String getNumSeguridadSocial() { return msNumSeguridadSocial; }
    public Date getFechaPago() { return mtFechaPago; }
    public Date getFechaInicialPago() { return mtFechaInicialPago; }
    public Date getFechaFinalPago() { return mtFechaFinalPago; }
    public double getNumDiasPagados() { return mdNumDiasPagados; }
    public String getDepartamento() { return msDepartamento; }
    public String getClabe() { return msCuentaBancaria; }
    public int getBanco() { return mnBanco; }
    public Date getFechaInicioRelLaboral() { return mtFechaInicioRelLaboral; }
    public int getAntiguedad() { return mnAntiguedad; }
    public String getPuesto() { return msPuesto; }
    public int getRiesgoPuesto() { return mnRiesgoPuesto; }
    public String getTipoContrato() { return msTipoContrato; }
    public String getSindicalizado() { return msSindicalizado; }
    public String getTipoJornada() { return msTipoJornada; }
    public String getPeriodicidadPago() { return msPeriodicidadPago; }
    public double getSalarioBaseCotApor() { return mdSalarioBaseCotApor; }
    public double getSalarioDiarioIntegrado() { return mdSalarioDiarioIntegrado; }
    public String getClaveEstado() { return msClaveEstado; }

    public double getTotalPercepciones() { return mdTotalPercepciones; }
    public double getTotalDeducciones() { return mdTotalDeducciones; }
    public double getTotalRetenciones() { return mdTotalRetenciones; }
    public double getTotalNeto() { return mdTotalNeto; }
    public int getMetodoPago() { return mnMetodoPago; }
    public String getMetodoPagoAux() { return msMetodoPagoAux; }
    public String getSerie() { return msSerie; }
    public int getFolio() { return mnFolio; }
    public String getMoneda() { return msMoneda; }
    public Date getFechaEdicion() { return mtFechaEdicion; }

    public int getAuxEmpleadoId() { return mnAuxEmpleadoId; }
    public double getAuxSueldoMensual() { return mdAuxSueldoMensual; }
    
    private boolean isTypeContractCommisionLaborLess() {
        return msTipoContrato.compareTo((String) miClient.getSession().readField(SModConsts.HRSS_TP_CON, new int[] { SModSysConsts.HRSS_TP_CON_TME_DET }, SDbRegistry.FIELD_CODE)) >= 0 &&
                msTipoContrato.compareTo((String) miClient.getSession().readField(SModConsts.HRSS_TP_CON, new int[] { SModSysConsts.HRSS_TP_CON_LAB_CMM }, SDbRegistry.FIELD_CODE)) <= 0;
    }
    
    private boolean isRecruitmentSchemePensionersLess() {
        String tipoRegimen = (String) miClient.getSession().readField(SModConsts.HRSS_TP_REC_SCHE, new int[] { mnTipoRegimen }, SDbRegistry.FIELD_CODE);
        
        return tipoRegimen.compareTo((String) miClient.getSession().readField(SModConsts.HRSS_TP_REC_SCHE, new int[] { SModSysConsts.HRSS_TP_REC_SCHE_WAG }, SDbRegistry.FIELD_CODE)) >= 0 &&
                tipoRegimen.compareTo((String) miClient.getSession().readField(SModConsts.HRSS_TP_REC_SCHE, new int[] { SModSysConsts.HRSS_TP_REC_SCHE_PEN }, SDbRegistry.FIELD_CODE)) <= 0;
    }
    
    private cfd.ver3.nom12.DElementDeduccion createDeductionNode(final SHrsFormerPayrollConcept concept) {
        cfd.ver3.nom12.DElementDeduccion deduccion = new cfd.ver3.nom12.DElementDeduccion();

        deduccion.getAttTipoDeduccion().setString((String) miClient.getSession().readField(SModConsts.HRSS_TP_DED, new int[] { concept.getClaveOficial() }, SDbRegistry.FIELD_CODE));
        deduccion.getAttClave().setString(DVer3Utils.formatAttributeValueAsKey(concept.getClaveEmpresa().length() < 3 ? SLibUtils.textRepeat("0", 3 - concept.getClaveEmpresa().length()) + concept.getClaveEmpresa() : concept.getClaveEmpresa()));
        deduccion.getAttConcepto().setString(DVer3Utils.formatAttributeValueAsText(concept.getConcepto()));
        deduccion.getAttImporte().setDouble(concept.getTotalGravado() + concept.getTotalExento());
        
        return deduccion;
    }
    
    private cfd.ver3.nom12.DElementPercepcion createEarningNode(final SHrsFormerPayrollConcept concept) {
        cfd.ver3.nom12.DElementPercepcion percepcion = new cfd.ver3.nom12.DElementPercepcion();

        percepcion.getAttTipoPercepcion().setString((String) miClient.getSession().readField(SModConsts.HRSS_TP_EAR, new int[] { concept.getClaveOficial() }, SDbRegistry.FIELD_CODE));
        percepcion.getAttClave().setString(DVer3Utils.formatAttributeValueAsKey(concept.getClaveEmpresa().length() < 3 ? SLibUtils.textRepeat("0", 3 - concept.getClaveEmpresa().length()) + concept.getClaveEmpresa() : concept.getClaveEmpresa()));
        percepcion.getAttConcepto().setString(DVer3Utils.formatAttributeValueAsText(concept.getConcepto()));
        percepcion.getAttImporteGravado().setDouble(concept.getTotalGravado());
        percepcion.getAttImporteExento().setDouble(concept.getTotalExento());
        
        return percepcion;
    }
    
    private cfd.ver3.nom12.DElementHorasExtra createEarningOverTimeNode(final SHrsFormerPayrollConcept concept) {
        cfd.ver3.nom12.DElementHorasExtra horasExtra = new cfd.ver3.nom12.DElementHorasExtra();

        horasExtra.getAttDias().setInteger((int) concept.getCantidad());
        horasExtra.getAttTipoHoras().setString(concept.getPkSubtipoConcepto() == SCfdConsts.CFDI_PAYROLL_PERCEPTION_EXTRA_TIME_DOUBLE[1] ? SCfdConsts.CFDI_PAYROLL_EXTRA_TIME_TYPE_DOUBLE_COD : SCfdConsts.CFDI_PAYROLL_EXTRA_TIME_TYPE_TRIPLE_COD);
        horasExtra.getAttHorasExtra().setInteger(concept.getHoras_r());
        horasExtra.getAttImportePagado().setDouble(concept.getTotalGravado() + concept.getTotalExento());
        
        return horasExtra;
    }
    
    private cfd.ver3.nom12.DElementSeparacionIndemnizacion createEarningSeparationNode(final double totalGravado, final double totalExento) {
        cfd.ver3.nom12.DElementSeparacionIndemnizacion separacionIndemnizacion = new DElementSeparacionIndemnizacion();
        
        separacionIndemnizacion.getAttTotalPagado().setDouble(totalGravado + totalExento);
        separacionIndemnizacion.getAttNumAñosServicio().setInteger((int) SLibUtils.round(((double) mnAntiguedad / SHrsConsts.YEAR_WEEKS), 0));
        separacionIndemnizacion.getAttUltimoSueldoMensOrd().setDouble(mdAuxSueldoMensual);
        separacionIndemnizacion.getAttIngresoAcumulable().setDouble(totalGravado);
        separacionIndemnizacion.getAttIngresoNoAcumulable().setDouble(totalExento);
        
        return separacionIndemnizacion;
    }
    
    private cfd.ver3.nom12.DElementIncapacidad createEarningDisabilityNode(final SHrsFormerPayrollConcept concept) {
        cfd.ver3.nom12.DElementIncapacidad incapacidad =  new DElementIncapacidad();
        
        incapacidad.getAttDiasIncapacidad().setInteger((int) concept.getCantidad());
        incapacidad.getAttTipoIncapacidad().setString(concept.getClaveIncapacidad());
        incapacidad.getAttImporteMonetario().setDouble(concept.getTotalGravado() + concept.getTotalExento());
        
        return incapacidad;
    }
    
    private cfd.ver3.nom12.DElementOtroPago createEarningOtherPayNode(final SHrsFormerPayrollConcept concept) {
        String otherPaymentKey = "";

        cfd.ver3.nom12.DElementOtroPago otroPago = new cfd.ver3.nom12.DElementOtroPago();
        cfd.ver3.nom12.DElementSubsidioEmpleo subsidioEmpleo = new cfd.ver3.nom12.DElementSubsidioEmpleo();

        // Obtain key for other payment type
        otherPaymentKey = (String) miClient.getSession().readField(SModConsts.HRSS_TP_OTH_PAY, new int[] { SModSysConsts.HRSS_TP_OTH_PAY_TAX_SUB }, SDbRegistry.FIELD_CODE);

        otroPago.getAttTipoOtroPago().setString(otherPaymentKey);
        otroPago.getAttClave().setString(DVer3Utils.formatAttributeValueAsKey(concept.getClaveEmpresa().length() < 3 ? SLibUtils.textRepeat("0", 3 - concept.getClaveEmpresa().length()) + concept.getClaveEmpresa() : concept.getClaveEmpresa()));
        otroPago.getAttConcepto().setString(DVer3Utils.formatAttributeValueAsText(concept.getConcepto()));
        otroPago.getAttImporte().setDouble(concept.getTotalGravado() + concept.getTotalExento());

        subsidioEmpleo.getAttSubsidioCausado().setDouble(concept.getTotalGravado() + concept.getTotalExento());

        otroPago.setEltSubsidioEmpleo(subsidioEmpleo);
        
        return otroPago;
    }
    
    public SHrsFormerPayroll getPayroll() { return moPayroll; }
    public ArrayList<SHrsFormerPayrollConcept> getChildPayrollConcept() { return moChildPayrollConcept; }

    public cfd.DElement createCfdiElementNomina11() throws java.lang.Exception {
        double dTotalTaxedPerceptions = 0;
        double dTotalExemptPerceptions = 0;
        double dTotalTaxedDeductions = 0;
        double dTotalExemptDeductions = 0;
        double dTotalExtraTime = 0;
        double dTotalExtraTimeAux = 0;
        cfd.ver3.nom11.DElementNomina nomina = new cfd.ver3.nom11.DElementNomina();
        cfd.ver3.nom11.DElementPercepciones percepciones = new DElementPercepciones();
        cfd.ver3.nom11.DElementDeducciones deducciones = new DElementDeducciones();
        cfd.ver3.nom11.DElementIncapacidades incapacidades = new cfd.ver3.nom11.DElementIncapacidades();
        cfd.ver3.nom11.DElementHorasExtras horasExtras = new cfd.ver3.nom11.DElementHorasExtras();

        nomina.getAttRegistroPatronal().setString(msRegistroPatronal);
        nomina.getAttNumEmpleado().setString(msNumEmpleado);
        nomina.getAttCurp().setString(msCurp);
        nomina.getAttTipoRegimen().setInteger(mnTipoRegimen);
        nomina.getAttNumSeguridadSocial().setString(msNumSeguridadSocial);
        nomina.getAttFechaPago().setDate(mtFechaPago);
        nomina.getAttFechaInicialPago().setDate(mtFechaInicialPago);
        nomina.getAttFechaFinalPago().setDate(mtFechaFinalPago);
        nomina.getAttNumDiasPagados().setDouble(mdNumDiasPagados);
        nomina.getAttDepartamento().setString(msDepartamento);
        nomina.getAttClabe().setString(msCuentaBancaria);
        nomina.getAttBanco().setInteger(mnBanco);
        nomina.getAttFechaInicioRelLaboral().setDate(mtFechaInicioRelLaboral);
        nomina.getAttAntiguedad().setInteger(mnAntiguedad);
        nomina.getAttPuesto().setString(msPuesto);
        nomina.getAttTipoContrato().setString(msTipoContrato);
        nomina.getAttTipoJornada().setString(msTipoJornada);
        nomina.getAttPeriodicidadPago().setString(msPeriodicidadPago);
        nomina.getAttSalarioBaseCotApor().setDouble(mdSalarioBaseCotApor);
        nomina.getAttRiesgoPuesto().setInteger(mnRiesgoPuesto);
        nomina.getAttSalarioDiarioIntegrado().setDouble(mdSalarioDiarioIntegrado);

        for (SHrsFormerPayrollConcept concept : moChildPayrollConcept) {
            switch (concept.getPkTipoConcepto()) {
                case SCfdConsts.CFDI_PAYROLL_PERCEPTION:
                    cfd.ver3.nom11.DElementPercepcion percepcion = new DElementPercepcion();

                    dTotalTaxedPerceptions += concept.getTotalGravado();
                    dTotalExemptPerceptions += concept.getTotalExento();

                    percepcion.getAttTipoPercepcion().setInteger(concept.getClaveOficial());
                    percepcion.getAttClave().setString(concept.getClaveEmpresa().length() < 3 ? SLibUtils.textRepeat("0", 3 - concept.getClaveEmpresa().length()) + concept.getClaveEmpresa() : concept.getClaveEmpresa());
                    percepcion.getAttConcepto().setString(concept.getConcepto());
                    percepcion.getAttImporteGravado().setDouble(concept.getTotalGravado());
                    percepcion.getAttImporteExento().setDouble(concept.getTotalExento());

                    percepciones.getEltHijosPercepcion().add(percepcion);

                    if (SLibUtils.belongsTo(concept.getPkSubtipoConcepto(), new int[] { SCfdConsts.CFDI_PAYROLL_PERCEPTION_EXTRA_TIME_DOUBLE[1], SCfdConsts.CFDI_PAYROLL_PERCEPTION_EXTRA_TIME_TRIPLE[1] })) {
                        cfd.ver3.nom11.DElementHorasExtra horasExtra = new cfd.ver3.nom11.DElementHorasExtra();

                        horasExtra.getAttDias().setInteger((int) concept.getCantidad());
                        horasExtra.getAttTipoHoras().setString(concept.getPkSubtipoConcepto() == SCfdConsts.CFDI_PAYROLL_PERCEPTION_EXTRA_TIME_DOUBLE[1] ? SCfdConsts.CFDI_PAYROLL_EXTRA_TIME_TYPE_DOUBLE : SCfdConsts.CFDI_PAYROLL_EXTRA_TIME_TYPE_TRIPLE);
                        horasExtra.getAttHorasExtra().setInteger(concept.getHoras_r());
                        horasExtra.getAttImportePagado().setDouble(concept.getTotalGravado() + concept.getTotalExento());

                        dTotalExtraTime += concept.getTotalGravado() + concept.getTotalExento();

                        horasExtras.getEltHijosHorasExtra().add(horasExtra);
                    }
                    break;
                case SCfdConsts.CFDI_PAYROLL_DEDUCTION:
                    cfd.ver3.nom11.DElementDeduccion deduccion = new DElementDeduccion();

                    dTotalTaxedDeductions += concept.getTotalGravado();
                    dTotalExemptDeductions += concept.getTotalExento();

                    deduccion.getAttTipoDeduccion().setInteger(concept.getClaveOficial());
                    deduccion.getAttClave().setString(concept.getClaveEmpresa().length() < 3 ? SLibUtils.textRepeat("0", 3 - concept.getClaveEmpresa().length()) + concept.getClaveEmpresa() : concept.getClaveEmpresa());
                    deduccion.getAttConcepto().setString(concept.getConcepto());
                    deduccion.getAttImporteGravado().setDouble(concept.getTotalGravado());
                    deduccion.getAttImporteExento().setDouble(concept.getTotalExento());

                    deducciones.getEltHijosDeduccion().add(deduccion);
                    break;
                default:
            }
        }

        if (!percepciones.getEltHijosPercepcion().isEmpty()) {
            percepciones.getAttTotalGravado().setDouble(dTotalTaxedPerceptions);
            percepciones.getAttTotalExento().setDouble(dTotalExemptPerceptions);
            nomina.setEltPercepciones(percepciones);
        }

        if (!deducciones.getEltHijosDeduccion().isEmpty()) {
            deducciones.getAttTotalGravado().setDouble(dTotalTaxedDeductions);
            deducciones.getAttTotalExento().setDouble(dTotalExemptDeductions);
            nomina.setEltDeducciones(deducciones);
        }

        if (!horasExtras.getEltHijosHorasExtra().isEmpty()) {
            nomina.setEltHorasExtras(horasExtras);
        }

        if (!incapacidades.getEltHijosIncapacidad().isEmpty()) {
            nomina.setEltIncapacidades(incapacidades);
        }

        for (int i = 0; i < horasExtras.getEltHijosHorasExtra().size(); i++) {
            dTotalExtraTimeAux += horasExtras.getEltHijosHorasExtra().get(i).getAttImportePagado().getDouble();
        }

        if (SLibUtils.round(dTotalExtraTime, SLibUtils.DecimalFormatPercentage2D.getMaximumFractionDigits()) != SLibUtils.round(dTotalExtraTimeAux, SLibUtils.DecimalFormatPercentage2D.getMaximumFractionDigits())) {
            nomina = null;
            throw new Exception("El importe pagado de horas extra (" + SLibUtils.getDecimalFormatAmount().format(dTotalExtraTimeAux) + ") no coincide con el total de las percepciones de horas extra (" + SLibUtils.getDecimalFormatAmount().format(dTotalExtraTime) + ").");
        }

        return nomina;
    }
    
    public cfd.DElement createCfdiElementNomina12() throws java.lang.Exception {
        String sPayrollType = "";
        double dTotalGravado = 0;
        double dTotalExento = 0;
        double dTotalSueldos = 0;
        double dTotalSeparacionIndemnizacion = 0;
        double dTotalSeparacionIndemnizacionGravado = 0;
        double dTotalSeparacionIndemnizacionExento = 0;
        double dTotalImpuestosRetenidos = 0;
        double dTotalOtrasDeducciones = 0;
        cfd.ver3.nom12.DElementNomina nomina = new cfd.ver3.nom12.DElementNomina();
        cfd.ver3.nom12.DElementEmisor emisor = new cfd.ver3.nom12.DElementEmisor();
        cfd.ver3.nom12.DElementReceptor receptor = new cfd.ver3.nom12.DElementReceptor();
        cfd.ver3.nom12.DElementPercepciones percepciones = new cfd.ver3.nom12.DElementPercepciones();
        cfd.ver3.nom12.DElementDeducciones deducciones = new cfd.ver3.nom12.DElementDeducciones();
        cfd.ver3.nom12.DElementIncapacidades incapacidades = new cfd.ver3.nom12.DElementIncapacidades();
        cfd.ver3.nom12.DElementOtrosPagos otrosPagos = new cfd.ver3.nom12.DElementOtrosPagos();
        
        if (SLibUtils.belongsTo(moPayroll.getFkNominaTipoId(), new int[] { SModSysConsts.HRSS_TP_PAY_SHT_NOR, SModSysConsts.HRSS_TP_PAY_SHT_SPE } )) {
            sPayrollType = SHrsConsts.TXT_PAY_ORD;
        }
        else if (SLibUtils.belongsTo(moPayroll.getFkNominaTipoId(), new int[] { SModSysConsts.HRSS_TP_PAY_SHT_EXT } )) {
            sPayrollType = SHrsConsts.TXT_PAY_EXT;
            msPeriodicidadPago = SHrsConsts.TXT_TP_PAY_OTH;
        }
        
        nomina.getAttTipoNomina().setString(sPayrollType);
        nomina.getAttFechaPago().setDate(mtFechaPago);
        nomina.getAttFechaInicialPago().setDate(mtFechaInicialPago);
        nomina.getAttFechaFinalPago().setDate(mtFechaFinalPago);
        nomina.getAttNumDiasPagados().setDouble(mdNumDiasPagados);
        
        // Create node Emisor:
        
        if (isTypeContractCommisionLaborLess()) {
            emisor.getAttRegistroPatronal().setString(DVer3Utils.formatAttributeValueAsKey(msRegistroPatronal));
            
            // Create node Receptor:
            
            receptor.getAttNumSeguridadSocial().setString(msNumSeguridadSocial);
            receptor.getAttFechaInicioRelLaboral().setDate(mtFechaInicioRelLaboral);
            receptor.getAttAntiguedad().setString("P" + mnAntiguedad + "W");
            receptor.getAttRiesgoPuesto().setString("" + mnRiesgoPuesto);
            receptor.getAttSalarioBaseCotApor().setDouble(mdSalarioBaseCotApor);
        }
        
        // Complement node Receptor:
        
        receptor.getAttCurp().setString(msCurp);
        receptor.getAttTipoContrato().setString(msTipoContrato);
        receptor.getAttSindicalizado().setString(msSindicalizado);
        //receptor.getAttTipoJornada().setString(msTipoJornada); // (jbarajas 12-01-2017) Omitted by audit suggestion 
        receptor.getAttNumEmpleado().setString(DVer3Utils.formatAttributeValueAsKey(msNumEmpleado));
        receptor.getAttDepartamento().setString(DVer3Utils.formatAttributeValueAsText(msDepartamento));
        receptor.getAttPuesto().setString(DVer3Utils.formatAttributeValueAsText(msPuesto));
        receptor.getAttPeriodicidadPago().setString(msPeriodicidadPago);
        
        // Validate recruitment scheme:
        
        if (isTypeContractCommisionLaborLess() &&
                !isRecruitmentSchemePensionersLess()) {
            throw new Exception("El tipo régimen no es 02, 03 ó 04.");
        }
        
        if (!isTypeContractCommisionLaborLess() &&
                isRecruitmentSchemePensionersLess()) {
            throw new Exception("El tipo régimen no está entre 05 a 99.");
        }
        
        receptor.getAttTipoRegimen().setString((String) miClient.getSession().readField(SModConsts.HRSS_TP_REC_SCHE, new int[] { mnTipoRegimen }, SDbRegistry.FIELD_CODE));
        
        // Validate length the account bank:
        
        if (msCuentaBancaria.length() > 0) {
            if (msCuentaBancaria.length() != SDataConstantsSys.BPSS_BPB_BANK_ACC_TEL && msCuentaBancaria.length() != SDataConstantsSys.BPSS_BPB_BANK_ACC_NUM &&
                    msCuentaBancaria.length() != SDataConstantsSys.BPSS_BPB_BANK_ACC_TRJ && msCuentaBancaria.length() != SDataConstantsSys.BPSS_BPB_BANK_ACC_CBE) {
                throw new Exception("La longitud de la cuenta bancaria es incorrecto.");
            }

            if (msCuentaBancaria.length() != SDataConstantsSys.BPSS_BPB_BANK_ACC_CBE) {
                receptor.getAttBanco().setString((String) miClient.getSession().readField(SModConsts.HRSS_BANK, new int[] { mnBanco }, SDbRegistry.FIELD_CODE));
            }
            receptor.getAttCuentaBancaria().setString(msCuentaBancaria);
        }
        
        receptor.getAttSalarioDiarioIntegrado().setDouble(mdSalarioDiarioIntegrado);
        receptor.getAttClaveEntFed().setString(msClaveEstado);
        
        for (SHrsFormerPayrollConcept concept : moChildPayrollConcept) {
            switch (concept.getPkTipoConcepto()) {
                case SCfdConsts.CFDI_PAYROLL_PERCEPTION:
                    if (concept.getClaveOficial() != SModSysConsts.HRSS_TP_EAR_TAX_SUB) {
                        cfd.ver3.nom12.DElementPercepcion percepcion = createEarningNode(concept);
                        
                        switch (concept.getClaveOficial()) {
                            case SModSysConsts.HRSS_TP_EAR_OVR_TME:
                                percepcion.getEltHijosHorasExtra().add(createEarningOverTimeNode(concept));
                                break;
                            case SModSysConsts.HRSS_TP_EAR_DIS:
                                incapacidades.getEltHijosIncapacidad().add(createEarningDisabilityNode(concept));
                                break;
                            case SModSysConsts.HRSS_TP_EAR_SEN_BON:
                            case SModSysConsts.HRSS_TP_EAR_SET:
                            case SModSysConsts.HRSS_TP_EAR_CMP:
                                dTotalSeparacionIndemnizacionGravado = SLibUtils.round((dTotalSeparacionIndemnizacionGravado + percepcion.getAttImporteGravado().getDouble()), SLibUtils.DecimalFormatValue2D.getMaximumFractionDigits());
                                dTotalSeparacionIndemnizacionExento = SLibUtils.round((dTotalSeparacionIndemnizacionExento + percepcion.getAttImporteExento().getDouble()), SLibUtils.DecimalFormatValue2D.getMaximumFractionDigits());
                                break;
                            default:
                        }
                        
                        if (!SLibUtils.belongsTo(concept.getClaveOficial(), new int[] { SModSysConsts.HRSS_TP_EAR_SEN_BON, SModSysConsts.HRSS_TP_EAR_SET, SModSysConsts.HRSS_TP_EAR_CMP })) { 
                            dTotalSueldos = SLibUtils.round((dTotalSueldos + (percepcion.getAttImporteGravado().getDouble() + percepcion.getAttImporteExento().getDouble())), SLibUtils.DecimalFormatValue2D.getMaximumFractionDigits());
                        }
                        dTotalGravado = SLibUtils.round((dTotalGravado + percepcion.getAttImporteGravado().getDouble()), SLibUtils.DecimalFormatValue2D.getMaximumFractionDigits());
                        dTotalExento = SLibUtils.round((dTotalExento + percepcion.getAttImporteExento().getDouble()), SLibUtils.DecimalFormatValue2D.getMaximumFractionDigits());
                        
                        percepciones.getEltHijosPercepcion().add(percepcion);
                    }
                    else if (concept.getClaveOficial() == SModSysConsts.HRSS_TP_EAR_TAX_SUB) {
                        otrosPagos.getEltHijosOtroPago().add(createEarningOtherPayNode(concept));
                    }
                    break;
                case SCfdConsts.CFDI_PAYROLL_DEDUCTION:                    
                    if (concept.getClaveOficial() == SModSysConsts.HRSS_TP_DED_TAX) {
                        dTotalImpuestosRetenidos += concept.getTotalGravado() + concept.getTotalExento();
                    }
                    else {
                        dTotalOtrasDeducciones += concept.getTotalGravado() + concept.getTotalExento();
                        
                        if (concept.getClaveOficial() == SModSysConsts.HRSS_TP_DED_DIS) {
                            incapacidades.getEltHijosIncapacidad().add(createEarningDisabilityNode(concept));
                        }
                    }
                    deducciones.getEltHijosDeduccion().add(createDeductionNode(concept));
                    break;
                default:
            }
        }

        nomina.setEltEmisor(emisor);
        nomina.setEltReceptor(receptor);
        
        if (dTotalSeparacionIndemnizacionGravado > 0 || dTotalSeparacionIndemnizacionExento > 0) {
            percepciones.setEltSeparacionIndemnizacion(createEarningSeparationNode(dTotalSeparacionIndemnizacionGravado, dTotalSeparacionIndemnizacionExento));
            dTotalSeparacionIndemnizacion = dTotalSeparacionIndemnizacionGravado + dTotalSeparacionIndemnizacionExento;
        }
        
        if (!otrosPagos.getEltHijosOtroPago().isEmpty()) {
            nomina.getAttTotalOtrosPagos().setDouble(otrosPagos.getTotal());
            nomina.setEltOtrosPagos(otrosPagos);
        }
        
        if (!percepciones.getEltHijosPercepcion().isEmpty()) {
            percepciones.getAttTotalSueldos().setDouble(dTotalSueldos);
            percepciones.getAttTotalSeparacionIndemnizacion().setDouble(dTotalSeparacionIndemnizacion);
            percepciones.getAttTotalGravado().setDouble(dTotalGravado);
            percepciones.getAttTotalExento().setDouble(dTotalExento);
            
            nomina.getAttTotalPercepciones().setDouble(dTotalSueldos + dTotalSeparacionIndemnizacion);
            nomina.setEltPercepciones(percepciones);
        }

        if (!deducciones.getEltHijosDeduccion().isEmpty()) {
            deducciones.getAttTotalOtrasDeducciones().setDouble(dTotalOtrasDeducciones);
            deducciones.getAttTotalImpuestosRetenidos().setDouble(dTotalImpuestosRetenidos);
            
            nomina.getAttTotalDeducciones().setDouble(dTotalOtrasDeducciones + dTotalImpuestosRetenidos);
            nomina.setEltDeducciones(deducciones);
        }
        
        if (!incapacidades.getEltHijosIncapacidad().isEmpty()) {
            nomina.setEltIncapacidades(incapacidades);
        }

        return nomina;
    }

    @Override
    public int getCfdTipoCfdXml() {
        return SCfdConsts.CFD_TYPE_PAYROLL;
    }

    @Override
    public String getCfdSerie() {
        return msSerie;
    }

    @Override
    public String getCfdFolio() {
        return "" + mnFolio;
    }

    @Override
    public String getCfdReferencia() {
        return "";
    }

    @Override
    public Date getCfdFecha() {
        Date tDate = null;
        Date tDateTime = null;
        long lTimes = 0;

        tDate = new Date();
        tDateTime = new Date();

        lTimes = tDateTime.getTime() - SLibTimeUtils.convertToDateOnly(tDateTime).getTime();

        tDate.setTime(moPayroll.getFecha().getTime() + lTimes);

        return tDate;
    }

    @Override
    public int getCfdFormaDePago() {
        return DAttributeOptionFormaPago.CFD_UNA_EXHIBICION;
    }

    @Override
    public int getCfdCondicionesDePago() {
        return DAttributeOptionCondicionesPago.CFD_CONTADO;
    }

    @Override
    public double getCfdSubTotal() {
        return mdTotalPercepciones;
    }

    @Override
    public double getCfdDescuento() {
        return mdTotalDeducciones;
    }

    @Override
    public String getCfdMotivoDescuento() {
        return "";
    }

    @Override
    public double getCfdTipoCambio() {
        return 1;
    }

    @Override
    public String getCfdMoneda() {
        return msMoneda;
    }

    @Override
    public double getCfdTotal() {
        return mdTotalNeto;
    }

    @Override
    public int getCfdTipoDeComprobante() {
        return DAttributeOptionTipoComprobante.CFD_EGRESO;
    }

    /**
     * Maintenance Log:
     * 
     * 2016-07-14, Sergio Flores: implementation of new payment method catalogue (erp.TRNU_TP_PAY_SYS DB table).
     */
    
    @Override
    public String getCfdMetodoDePago() {
        String metodoPago = "";

        try {
            metodoPago = SHrsFormerUtils.getPaymentMethodName(miClient, mnMetodoPago);
        }
        catch (Exception e) {
            SLibUtils.printException(this, e);
        }

        return metodoPago;
    }

    @Override
    public String getCfdNumCtaPago() {
        return "";
    }

    @Override
    public int getEmisor() {
        return moPayroll.getEmpresaId();
    }

    @Override
    public int getSucursalEmisor() {
        return moPayroll.getSucursalEmpresaId();
    }

    @Override
    public int getReceptor() {
        return mnPkEmpleadoId;
    }

    @Override
    public int getSucursalReceptor() {
        return mnPkSucursalEmpleadoId;
    }

    @Override
    public ArrayList<DElement> getCfdElementRegimenFiscal() {
        ArrayList<DElement> regimes = new ArrayList<DElement>();
        DElement regimen = null;

        for (int i = 0; i < moPayroll.getRegimenFiscal().length; i++) {
            regimen = new cfd.ver3.DElementRegimenFiscal();

            ((cfd.ver3.DElementRegimenFiscal) regimen).getAttRegimen().setString(moPayroll.getRegimenFiscal()[i]);
            regimes.add(regimen);
        }

        return regimes;
    }

    @Override
    public DElement getCfdElementAddenda() {
        return null;
    }

    @Override
    public DElement getCfdElementComplemento() {
        DElement complemento = null;

        try {
            complemento = new cfd.ver3.DElementComplemento();

            ((cfd.ver3.DElementComplemento) complemento).getElements().add(createCfdiElementNomina12());
        }
        catch (Exception e) {
            SLibUtils.showException(this, e);
        }

        return complemento;
    }

    @Override
    public ArrayList<SCfdDataConcepto> getCfdConceptos() {
        ArrayList<SCfdDataConcepto> concepts = null;
        SCfdDataConcepto concept = null;

        concepts = new ArrayList<SCfdDataConcepto>();
        concept = new SCfdDataConcepto();

        concept.setNoIdentificacion("");
        concept.setUnidad("ACT");
        concept.setCantidad(1);
        concept.setDescripcion(moPayroll.getDescripcion());
        concept.setValorUnitario(mdTotalPercepciones);
        concept.setImporte(mdTotalPercepciones);

        concepts.add(concept);

        return concepts;
    }

    @Override
    public ArrayList<SCfdDataImpuesto> getCfdImpuestos() {
        return new ArrayList<SCfdDataImpuesto>();
    }
}
