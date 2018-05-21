package sistema.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistema.modelos.Equipe;


public class EquipeService extends Service{
	
		
	public EquipeService()
	{
	}
	
	public void salvar(Equipe equipe)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(equipe);
		em.getTransaction().commit();
		em.close();
	}

	public void alterarEquipe(Equipe equipe) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(equipe);
		em.getTransaction().commit();
		em.close();
	}
	

	public void removerEquipe(Equipe equipe) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		equipe= em.find(Equipe.class, equipe.getCodigoEquipe());
		em.remove(equipe);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Equipe> getEquipes() {

		List<Equipe> equipes;

		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select c From Equipe c");
		equipes = q.getResultList();
		em.close();

		return equipes;
	}

	public Equipe getEquipeByCodigo(int codigo) {

		List<Equipe> lista = getEquipes();
		Equipe eq = new Equipe();

		for (Equipe e : lista) {
			if (codigo == e.getCodigoEquipe())
				eq = e;
		}

		return eq;
	}

	public Equipe getEquipeByNome(String nomeEquipe) {

		List<Equipe> lista = getEquipes();
		Equipe eq = new Equipe();

		for (Equipe e : lista) {
			if (e.getNome().equals(nomeEquipe))
				eq = e;
		}

		return eq;
	}
}