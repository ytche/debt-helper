package site.bigbear.debthelper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import site.bigbear.debthelper.service.BaseCrudService;

import java.util.Optional;

public class BaseCrudServiceImpl<R extends CrudRepository<M, Long>, M>
    implements BaseCrudService<M> {
  @Autowired private R baseRepository;

  @Override
  public <S extends M> S save(S entity) {
    return this.baseRepository.save(entity);
  }

  @Override
  public <S extends M> Iterable<S> saveAll(Iterable<S> entities) {
    return this.baseRepository.saveAll(entities);
  }

  @Override
  public Optional<M> findById(Long id) {
    return this.baseRepository.findById(id);
  }

  @Override
  public boolean existsById(Long id) {
    return this.baseRepository.existsById(id);
  }

  @Override
  public Iterable<M> findAll() {
    return this.baseRepository.findAll();
  }

  @Override
  public Iterable<M> findAllById(Iterable<Long> ids) {
    return this.baseRepository.findAllById(ids);
  }

  @Override
  public long count() {
    return this.baseRepository.count();
  }

  @Override
  public void deleteById(Long id) {
      this.baseRepository.deleteById(id);
  }

  @Override
  public void delete(M entity) {}

  @Override
  public void deleteAll(Iterable<? extends M> entities) {}

  @Override
  public void deleteAll() {}
}
