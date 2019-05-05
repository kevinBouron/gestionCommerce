package com.fr.gestion.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.fr.gestion.DAO.IFactureDao;
import com.fr.gestion.entities.Facture;



public class FactureDao implements IFactureDao{

	IFactureDao dao;
	Facture facture;
	
	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facture> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facture> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Facture> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Facture> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Facture> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Facture getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Facture> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Facture> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Facture> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Facture> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Facture> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Facture entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Facture> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Facture> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Facture> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Facture> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Facture> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	//--------------------------------------------------------------------
	
	@Override
	public Facture findOneById(Long id) {
		
		return dao.getOne(id);
	}

	@Override
	public float CalculMontantTVA() {

		return facture.getPrixUnitaireHT()*facture.getQuantité()*facture.getTva();
	}

	@Override
	public float CalculMontantTTC() {
		
		return (facture.getPrixUnitaireHT()*facture.getQuantité()*facture.getTva())+(facture.getPrixUnitaireHT()*facture.getQuantité());
	}

	@Override
	public float CalculBaseHT() {
		
		return facture.getQuantité()*facture.getPrixUnitaireHT();
	}

	@Override
	public float Restedu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float MontantRemise() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float accompte() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
