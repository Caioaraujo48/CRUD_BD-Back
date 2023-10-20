package br.com.escola.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.escola.conexao.Conexao;
import br.com.escola.dao.ProfessorDAO;
import br.com.escola.model.Professor;

public class ProgramaSelecionar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		ProfessorDAO professordao = new ProfessorDAO(con);
		
		ArrayList<Professor> lista = professordao.retornarDados();
		//ArrayList<Professor> lista = new professordao.retornarDados();
		
		if(lista != null)
		{
			for(Professor professor : lista)
			{
				System.out.println("Nome do Professor: " + professor.getNome());
				System.out.println("Nome do Curso: " + professor.getCurso());
				System.out.println("Salário do Professor: " + professor.getSalario());
			}
		}
	}
}
