package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;

public class CampeonatoService extends Service {

	public CampeonatoService() {

	}

	public void salvar(Campeonato campeonato) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(campeonato);
		em.getTransaction().commit();
		em.close();
	}

	public void alterarCampeonato(Campeonato campeonato) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(campeonato);
		em.getTransaction().commit();
		em.close();
	}

	public void removerCampeonatos(Campeonato campeonato) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		campeonato = em.find(Campeonato.class, campeonato.getCodigoCampeonato());
		em.remove(campeonato);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	public List<Campeonato> getCampeonatos() {

		List<Campeonato> campeonatos;

		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select c From Campeonato c");
		campeonatos = q.getResultList();
		em.close();

		return campeonatos;
	}

	public Campeonato getCampeonatoByCodigo(int codigo) {

		List<Campeonato> lista = getCampeonatos();
		Campeonato cam = new Campeonato();

		for (Campeonato c : lista) {
			if (codigo == c.getCodigoCampeonato())
				cam = c;
		}

		return cam;
	}

	public Campeonato getCampeonatoByNome(String nomeCampeonato) {

		List<Campeonato> lista = getCampeonatos();
		Campeonato cam = new Campeonato();

		for (Campeonato c : lista) {
			if (c.getNomeCampeonato().equals(nomeCampeonato))
				cam = c;
		}

		return cam;
	}

	public List<Categoria> pesquisarCampeonatoCategorias(Campeonato campeonato) {
		List<Categoria> categorias;

		EntityManager em = emf.createEntityManager();

		campeonato = em.merge(campeonato);

		em.refresh(campeonato);
		categorias = campeonato.getCategorias();

		em.close();

		return categorias;
	}
}
