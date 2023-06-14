package beans;

import javax.annotation.PostConstruct;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Collections;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.HashMap;


import dao.EstadisticasDAO;
import dao.ResultadoDAO;
import dao.ConsultaDAO;
import dao.ConsultaDAOSQL;

import util.EstadisticasEjecutorAR;
import util.EstadisticasEjecutorSQL;
import util.EstadisticaConsulta;
import util.EstadisticaRespuesta;
import util.EstadisticaResultado;
import util.EstadisticaTodo;
import util.Respuesta;
import util.Resultado;
import util.User;

 
@ManagedBean(name = "estadisticasViewAR")
@ViewScoped
public class EstadisticasViewAR implements Serializable {

   private boolean ver = false;
   
   private List<EstadisticasEjecutorAR> dataar;
   
   private DecimalFormat df = new DecimalFormat("##.##");
   
   private String selectedBd;
   private String selectedRut;
   private String selectedFecha;
   private String fecha;
   private String rut;
   
   private String tipoEstadisticaSeleccionada = "ejerciciosAR";
   
   private int cantQueryEjec;
   private String cantQueryCorrecta;
   private String cantQueryIncorrecta;
   private String porcQueryCorrecta;
   private String porcQueryIncorrecta;
   private String promQueryCorrecta;
   private String promQueryIncorrecta;
  
   private List<String> clasifError;
   private List<String> operadoresUtilizadas;
   private List<String> ruts;
   private List<String> fechas;
   private List<String> bds;
   private List<User> nombres;
   private User usuario;
   
   private BarChartModel errorModel;
   private BarChartModel barOperadores;
   
   
   
   
   
   
   public String getTipoEstadisticaSeleccionada() {
       return tipoEstadisticaSeleccionada;
   }
   public void setTipoEstadisticaSeleccionada(String tipoEstadisticaSeleccionada) {
       this.tipoEstadisticaSeleccionada = tipoEstadisticaSeleccionada;
   }


	public boolean getVer(){
	   return ver;
   }
	public void setVer(boolean ver){
	   this.ver = ver;
   }
	public List<String> getBds() {
	   return bds;
	}
	public void setBds(List<String> bds) {
		bds = this.bds;
	}
	public String getSelectedBd() {
		return selectedBd;
	}
	public void setSelectedBd(String selectedBd) {
		this.selectedBd = selectedBd;
	}
	public List<String> getFechas() {
		return fechas;
	}
	public void setFechas(List<String> fechas) {
		fechas = this.fechas;
	}
	public String getSelectedFecha() {
		return selectedFecha;
	}
	public void setSelectedFecha(String selectedFecha) {
		this.selectedFecha = selectedFecha;
	}
	
	
	public List<String> getRuts() {
		return ruts;
	}
	public void setRuts(List<String> ruts) {
	    this.ruts = ruts;
	}
	public String getSelectedRut() {
		return selectedRut;
	}
	public void setSelectedRut(String selectedRut) {
		this.selectedRut = selectedRut;
	}
	

	// ESTADISTICAS EJECUTOR AR
	public int getCantQueryEjec() {
		return cantQueryEjec;
	}
	public void setCantQueryEjec(int cantQueryEjec) {
		this.cantQueryEjec = cantQueryEjec;
	}
	public String getPromQueryCorrecta() {
		return promQueryCorrecta;
	}
	public void setPromQueryCorrecta(String promQueryCorrecta) {
		this.promQueryCorrecta = promQueryCorrecta;
	}
	public String getPromQueryIncorrecta() {
		return promQueryIncorrecta;
	}
	public void setPromQueryIncorrecta(String promQueryIncorrecta) {
		this.promQueryIncorrecta = promQueryIncorrecta;
	}
	public String getCantQueryCorrecta() {
		return cantQueryCorrecta;
	}
	public void setCantQueryCorrecta(String cantQueryCorrecta) {
		this.cantQueryCorrecta = cantQueryCorrecta;
	}
	public String getCantQueryIncorrecta() {
		return cantQueryIncorrecta;
	}
	public void setCantQueryIncorrecta(String cantQueryIncorrecta) {
		this.cantQueryIncorrecta = cantQueryIncorrecta;
	}
	public String getPorcQueryCorrecta() {
		return porcQueryCorrecta;
	}
	public void setPorcQueryCorrecta(String porcQueryCorrecta) {
		this.porcQueryCorrecta = porcQueryCorrecta;
	}
	public String getPorcQueryIncorrecta() {
		return porcQueryIncorrecta;
	}
	public void setPorcQueryIncorrecta(String porcQueryIncorrecta) {
		this.porcQueryIncorrecta = porcQueryIncorrecta;
	}
	public List<String> getClasifError() {
		return clasifError;
	}
	public void setClasifError(List<String> clasifError) {
		this.clasifError = clasifError;
	}
	public BarChartModel getErrorModel() {
		return errorModel;
	}
	public void setErrorModel(BarChartModel errorModel) {
		this.errorModel = errorModel;
	}
	public List<String> getOperadoresUtilizadas() {
		return operadoresUtilizadas;
	}
	public void setOperadoresUtilizadas(List<String> operadoresUtilizadas) {
		this.operadoresUtilizadas = operadoresUtilizadas;
	}
	public BarChartModel getBarOperadores() {
		return barOperadores;
	}
	public void setBarOperadores(BarChartModel barOperadores) {
		this.barOperadores = barOperadores;
	}

	
	@PostConstruct
	public void init(){	         
		System.out.println("INICIO INIT EJECUTOR AR");		
		dataar = new ArrayList<EstadisticasEjecutorAR>();
		cantQueryEjec = dataar.size();
		dataar = ConsultaDAO.cargarEstEjecAR();
		
		this.cantQueryCorrecta = df.format(0);
		this.cantQueryIncorrecta = df.format(0);
		this.porcQueryCorrecta = df.format(0);
		this.porcQueryIncorrecta = df.format(0);
				
		ruts = dataar.stream()
			    .map(EstadisticasEjecutorAR::getRut)
			    .filter(Objects::nonNull)
			    .distinct()
			    .collect(Collectors.toList());
			ruts.add(0, "GLOBAL");
		ruts.forEach(System.out::println);

		selectedRut = "GLOBAL";
		
		clasifError = new ArrayList<>();
		operadoresUtilizadas = new ArrayList<>();
		isGlobalSelected();
		verEstadisticas();

	}
	
	public void verEstadisticas(){
	
		if ("GLOBAL".equals(selectedRut)) {
	        dataar = ConsultaDAO.cargarEstEjecAR();
	    }
	    else {
	        dataar = ConsultaDAO.cargarEstEjecARRut(selectedRut);
	        cargarDatosUsuario();
	        isGlobalSelected();
	        
	    }
		
		if(dataar != null){

				cantQueryEjec = dataar.size();
				ver = true;
				
				int cantQueryCorrecta = 0;
				int cantQueryIncorrecta = 0;
				float porcQueryCorrecta = 0;
				float porcQueryIncorrecta = 0;

				for(EstadisticasEjecutorAR e : dataar){
					cantQueryCorrecta = cantQueryCorrecta + (e.isQuery_correcta() ? 1 : 0);
					cantQueryIncorrecta = cantQueryIncorrecta + (e.isQuery_incorrecta() ? 1 : 0);
					
				}
				
				this.cantQueryCorrecta = df.format(cantQueryCorrecta);
				this.cantQueryIncorrecta = df.format(cantQueryIncorrecta);
				this.porcQueryCorrecta = df.format((cantQueryCorrecta * 100)/dataar.size());
				this.porcQueryIncorrecta = df.format((cantQueryIncorrecta * 100)/dataar.size());
				createErrorModel();
				createBarOperadores();
				
			}else{
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error al cargar las respuestas","");
	       		FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		
	}
	
	private void createErrorModel() {
		clasifError.clear();
		for(EstadisticasEjecutorAR e : dataar){
		    if(e.getClasificacion_error() != null){
		        clasifError.add(e.getClasificacion_error());
		    }
		}
		Collections.sort(clasifError);		
	    errorModel = new BarChartModel();

	    ChartSeries errors = new ChartSeries();
	    errors.setLabel("Errores");
	    for (String errorType : clasifError) {
	        errors.set(errorType, Collections.frequency(clasifError, errorType));
	    }
	    //errorModel = initErrorModel();
	    errorModel.setAnimate(true);
	    errorModel.addSeries(errors);
	    //errorModel.setTitle("Clasificacion de Errores");
	    errorModel.setLegendPosition("ne");
	    errorModel.setSeriesColors("1484e6");

	    Axis xAxis = errorModel.getAxis(AxisType.X);
	    xAxis.setLabel("Tipo de Error");
	    xAxis.setTickAngle(-35);

	    Axis yAxis = errorModel.getAxis(AxisType.Y);
	    yAxis.setLabel("Cantidad de Errores");
	    yAxis.setMin(0);
	    System.out.println("ERRORMODEL CREADO");	
	}
	
	private void createBarOperadores() {
		operadoresUtilizadas.clear();
		for (EstadisticasEjecutorAR data : dataar) {
	    	if(data.getOperador() != null){
	    		operadoresUtilizadas.add(data.getOperador());
	    	}
	    }
		Collections.sort(operadoresUtilizadas);		
	    barOperadores = new BarChartModel();

	    ChartSeries oper = new ChartSeries();
	    oper.setLabel("Operadores");
	    for (String operType : operadoresUtilizadas) {
	    	oper.set(operType, Collections.frequency(operadoresUtilizadas, operType));
	    }
	    //clau.set("color", "'background-color: #FF0000;'");
	    barOperadores.setAnimate(true);
	    barOperadores.addSeries(oper);
	    //barOperadores.setTitle("Clausulas Ejecutadas");
	    barOperadores.setLegendPosition("ne");
	    barOperadores.setSeriesColors("1484e6");

	    Axis xAxis = barOperadores.getAxis(AxisType.X);
	    xAxis.setLabel("Operador");
	    xAxis.setTickAngle(-35);

	    Axis yAxis = barOperadores.getAxis(AxisType.Y);
	    yAxis.setLabel("Cantidad de Ejecuciones");
	    yAxis.setMin(0);
	    System.out.println("CREATEBARCLAUSULAS CREADO");
	}
	
	public boolean isGlobalSelected() {
        return "GLOBAL".equalsIgnoreCase(selectedRut);
    }
	
	public String cargarDatosUsuario() {
	    List<User> nombres = ConsultaDAOSQL.cargarDatosUser(selectedRut);
	    if (!nombres.isEmpty()) {
	        usuario = nombres.get(0);
	        return usuario.getNombre1() + " " + usuario.getPaterno() + " " + usuario.getMaterno();
	    } else {
	        return "Usuario no encontrado";
	    }
	}
	
	public List<User> getNombres() {
		return nombres;
	}
	public void setNombres(List<User> nombres) {
		this.nombres = nombres;
	}
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
    
}