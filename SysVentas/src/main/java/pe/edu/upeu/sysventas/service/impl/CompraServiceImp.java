package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysventas.model.Compra;
import pe.edu.upeu.sysventas.repository.CompraRepository;
import pe.edu.upeu.sysventas.repository.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.ICompraservice;

@Transactional
@RequiredArgsConstructor
@Service
public class CompraServiceImp extends CrudGenericSeviceImp<Compra,Long> implements ICompraservice{
    private final CompraRepository repository;
    @Override
    protected ICrudGenericRepository getRepo() {
        return repository;
    }
}
