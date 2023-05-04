package beans;
	 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.el.ELContext;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

//import org.antlr.runtime.ANTLRStringStream;
//import org.antlr.runtime.CommonTokenStream;
//import org.antlr.runtime.RecognitionException;

import dao.ConsultaDAOSQL;
import dao.EjercicioDAO;
import dao.EsquemaDAO;
import dao.RelacionDAO;
import dao.ResultadoDAO;
//import parser.AlgebraRelacionalLexer;
//import parser.AlgebraRelacionalParser;
import util.AtributoBean;
import util.Consulta;
import util.Ejercicio;
import util.EsquemaBean;
import util.RelacionBean;
import util.Respuesta;
import util.Resultado;
import util.TuplaBean;
import util.UserBean;
 
@ManagedBean(name="dtGestionarEjerciciosBeanSQL")
@ViewScoped
public class GestionarEjerciciosBeanSQL implements Serializable {
     
	//Ejemplo
	private String tableName;
	private List<Object[]> data;
	private List<String> columnNames;
	private String query = "";
	private String queryList = "";
	
	private List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
	private Ejercicio selectedEjercicio;
	private int cantEjercicios;
	
	private List<Respuesta> respuestas = new ArrayList<Respuesta>();	
	private Respuesta respuesta;
	private List<Consulta> consultas;
	private Consulta consulta;
	
    @PreDestroy
    public void destroy(){
//    	Util.reloadBd();
    }
	
	@PostConstruct
    public void init() {
		
		ELContext elContext = FacesContext.getCurrentInstance().getELContext();
    	EsquemaBean esquemaBean = (EsquemaBean) FacesContext.getCurrentInstance().getApplication()
			    .getELResolver().getValue(elContext, null, "bd");
    	
    	if(esquemaBean != null){
			ejercicios = EjercicioDAO.cargarEjercicios(esquemaBean);
			if(ejercicios == null){
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error al cargar los ejercicios","");
	       		FacesContext.getCurrentInstance().addMessage(null, msg);
			}else{
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Ejercicios Cargados","");
	       		FacesContext.getCurrentInstance().addMessage(null, msg);
			}
			cantEjercicios = ejercicios.size();
    	}
  		
    }
	
	public Ejercicio getSelectedEjercicio() {
		return selectedEjercicio;
	}

	public void setSelectedEjercicio(Ejercicio selectedEjercicio) {
		this.selectedEjercicio = selectedEjercicio;
	}

	public int getCantEjercicios() {
		return cantEjercicios;
	}

	public void setCantEjercicios(int cantEjercicios) {
		this.cantEjercicios = cantEjercicios;
	}

	public List<Ejercicio> getEjercicios() {
		if(ejercicios.size() == 0){
			for(int i = 0 ; i < cantEjercicios ; i++){
				System.out.println("Hola");
				Ejercicio ejercicio = new Ejercicio();
				ejercicios.add(ejercicio);
			}
		}else if(ejercicios.size() < cantEjercicios){
			for(int i = ejercicios.size() ; i < cantEjercicios ; i++){
				Ejercicio ejercicio = new Ejercicio();
				ejercicio.setId(i);
				ejercicios.add(ejercicio);
			}
		}else if(ejercicios.size() > cantEjercicios){
			for(int i = ejercicios.size(); i > cantEjercicios ; i--){
				ejercicios.remove(i-1);
			}
			
		}
		for(int i = 0 ; i < ejercicios.size() ; i++){
			Ejercicio ejercicio = ejercicios.get(i);
			ejercicio.setId(i);
			ejercicios.set(i,ejercicio);
		}
		return ejercicios;
	}

	public void setEjercicios(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}

	public String getQueryList() {
		return queryList;
	}

	public void setQueryList(String queryList) {
		this.queryList = queryList;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Object[]> getData(){
		return data;
	}
	
	public List<String> getColumnNames(){
		return columnNames;
	}
	
	public void setData(List<Object[]> data){
		this.data = data;
	}
	
	public void setColumnNames(List<String> columnNames){
		this.columnNames = columnNames;
	}
    
    public String getQuery(){
    	return query;
    }
    
	public void setQuery(String query) {
		this.query = query;
	}
	

	private boolean nombreValido(String query){
		if(		/*Revisa si la relacion auxiliar contiene palabras reservadas*/
				//DDL
				query.contains("CREATE") ||
				query.contains("ALTER") ||
				query.contains("DROP") ||
				query.contains("TRUNCATE") ||
				//DML
				query.contains("SELECT") ||
				query.contains("INSERT") ||
				query.contains("UPDATE") ||
				query.contains("DELETE") ||
					//CLAUSULAS
					query.contains("FROM") ||
					query.contains("GROUPBY") ||
					query.contains("HAVING") ||
					query.contains("ORDERBY") ||
					query.contains("WHERE") ||
					//OPERADORES LOGICOS
					query.contains("AND") ||
					query.contains("OR") ||
					query.contains("NOT") ||
					
					//OPERADORES DE COMPARACIÓN
					query.contains("<") ||
					query.contains(">") ||
					query.contains("<>") ||
					query.contains("<=") ||
					query.contains(">=") ||
					query.contains("BETWEEN") ||
					query.contains("LIKE") ||
					query.contains("IN") ||
					//FUNCIONES DE AGREGADO
					query.contains("AVG") ||
					query.contains("COUNT") ||
					query.contains("SUM") ||
					query.contains("MAX") ||
					query.contains("MIN") ||
					//MANEJO DE TABLAS
					query.contains("JOIN") ||
					query.contains("LEFTJOIN") ||
					query.contains("RIGHTJOIN") ||
					query.contains("UNION") 
					
				//query.contains(":=") || DE ASIGNACION
				
				){
			return false;
		}else{
			return true;
		}
	}

	
	
	
	// Filtra consulta y luego las ejecuta
	public void ejecutar(){
		
		if(selectedEjercicio != null){
			query = selectedEjercicio.getQuery(); //recoje la query escrita por el usuario
		}
		
		String test0[] = query.split("\\s+");
		System.out.println("query: " + query);
		
		// Revisa si tiene errores de sintaxis
		if(nombreValido(test0[0]) == false){
			
			ELContext elContext = FacesContext.getCurrentInstance().getELContext(); // obtiene el contexto de evaluación de expresiones de lenguaje actual en una aplicación web JSF.
			UserBean userBean = (UserBean) FacesContext.getCurrentInstance().getApplication() 
				    .getELResolver().getValue(elContext, null, "usuario");//OBTIENE una instancia del objeto UserBean en la aplicación web JSF, resolviendo su nombre en el contexto de evaluación de expresiones de lenguaje actual.
//			EsquemaBean esquema = (EsquemaBean) FacesContext.getCurrentInstance().getApplication()
//				    .getELResolver().getValue(elContext, null, "bd");
			RelacionBean resultado = new RelacionBean(); //VARIABLE PARA CONSTRUIR LA RELACION RESULTANTE
			boolean band = false;
		
			
			
			
			resultado = ConsultaDAOSQL.ejecutarQuery(query,userBean.getRut()); // EJECUTA  EL CONTENIDO DE LA QUERY EN EL DAO QUE ES QUE REALIZA LA CONSULTA
			tableName = resultado.getNombre();
			band = true;

			
			
			
			columnNames = new ArrayList<String>();
			data = new ArrayList<Object[]>();

		// Revisa el resultado de la consulta normal
				
			if(resultado.getTuplasBean()!= null){
					
					for(AtributoBean a : resultado.getAtributos())
						columnNames.add(a.getNombre());
					
					for(TuplaBean t : resultado.getTuplasBean())
						data.add(t.getAtributos());
					
					if(selectedEjercicio != null){
						queryList = selectedEjercicio.getQueryList();
					}						
					queryList = queryList + query + "\n";
					if(selectedEjercicio != null){
						selectedEjercicio.setQueryList(queryList);
					}
				
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Consulta realizada satisfactoriamente","");
		       		FacesContext.getCurrentInstance().addMessage(null, msg);
			}else{
					tableName = "";
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error al realizar la consulta: " + resultado.getNombre(),"");
		       		FacesContext.getCurrentInstance().addMessage(null, msg);
					System.out.println("Error: " + resultado.getNombre());
				}
				
				
			}
		
		// Error de sintaxis de consultas
		else{
			tableName = "";
			columnNames = null;
			data = null;
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error de sintaxis en la consulta de SQL","");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

	}

	
	
	
	public void ayudaSelect(){
		
			query = query +"SELECT ";
	}
	
	public void ayudaFrom(){
		
			query = query +" FROM ";
	}
	
	public void ayudaWhere(){
		
			query = query +" WHERE ";
	}
	
	public void ayudaDistinct(){
		
			query = query +" DISTINCT ";
	}
	
	public void ayudaOrderby(){
		
			query = query +" ORDER BY ";
	}
	
	public void ayudaGroupby(){
		
			query = query +" GROUP BY ";
	}
	
	public void ayudaHaving(){
		
			query = query +" HAVING ";
	}
	
	public void ayudaJoin(){
		
			query = query + " JOIN ";
	}
	
	

}


