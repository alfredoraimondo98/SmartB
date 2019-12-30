package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Docente;
import Model.DocenteModel;

/**
 * Servlet implementation class FindServlet
 */
@WebServlet("/FindServlet")
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Il metodo restituisce il nome del docente dalla stringa in formato "Cognome Nome".
     * @param fullName
     * @return String nome
     */
    private static String getName(String fullName){
        return fullName.split(" (?!.* )")[1];
    }
    
    /**
     * Il metodo restituisce il cognome del docente dalla stringa in formato "Cognome Nome".
     * @param fullName
     * @return String cognome
     */
    private static String getSurname(String fullName){
        return fullName.split(" (?!.* )")[0];
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String docente = request.getParameter("docente");
		
		String nome = getName(docente);
		String cognome = getSurname(docente);
		
		System.out.println("Nome: "+getName(docente));
		System.out.println("Cognome: "+getSurname(docente));
		
		DocenteModel dm = new DocenteModel();
		Docente d = new Docente();
		
		try {
			d = dm.doRetrieveByNameAndSurname(nome,cognome);
			System.out.print(d);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(d.getMatricola() == null) {  //Se non esiste un docente con quella coppia Nome/Cognome
			out.write("Errore");
			return;
		}else {
			String result = "<tr>";
			result = result+"<th scope=\"row\">";
			result = result+"<label name=\"nome\" id=\"nome\">"+d.getNome()+"</label> <label name=\"cognome\" id=\"cognome\">"+d.getCognome()+"</label>";
			result = result+"</th>";
			result = result+"<td><p id=\"ufficio\">"+d.getUfficio()+"<p></td>";
			result = result+"<td><a href=\"RegView.jsp\"><i class=\"fas fa-info-circle\"></i></a></td>";
			result = result+"<td>";
			result = result+"<form name=\"form\" action=\"../addDocenteListaPreferiti\">";
			result = result+"<input id=\"matricolaDocente\" style=\"display:none;\" name=\"matricolaDocente\" value=\""+d.getMatricola()+"\"</>";
			result = result+"<button name=\"add\"><i class=\"fas fa-user-plus\"></i></button>";
			result = result+"</form>";
			result = result+"</td>";
			result = result+"<td>";
			result = result+"<form name=\"form\" action=\"../removeDocenteListaPreferiti\">";
			result = result+"<input id=\"matricolaDocente\" style=\"display:none;\" name=\"matricolaDocente\" value=\""+d.getMatricola()+"\"</>";
			result = result+"<button name=\"remove\"><i class=\"fas fa-user-plus\"></i></button>";
			result = result+"</form>";
			result = result+"</td>";
			result = result+"</tr>";
			result = result+"<tr>";
			result = result+"<td>";
			result = result+"<a href=\"../jsp/ViewRicercaDocenti.jsp\" ><p id=\"all\">Visualizza tutti i docenti</p></a>";
			result = result+"</td>";
			result = result+"</tr>";
			
			System.out.println(result);
			
			out.append(result);
		
		}  //fine else interno
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
