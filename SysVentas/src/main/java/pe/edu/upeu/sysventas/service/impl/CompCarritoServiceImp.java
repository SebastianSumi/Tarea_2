package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysventas.model.CompCarrito;
import pe.edu.upeu.sysventas.repository.CompCarritoRepository;
import pe.edu.upeu.sysventas.repository.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.ICompCarritoService;

@Transactional
@RequiredArgsConstructor
@Service
public class CompCarritoServiceImp extends CrudGenericSeviceImp<CompCarrito,Integer> implements ICompCarritoService{
    private final CompCarritoRepository repository;
    @Override
    protected ICrudGenericRepository getRepo() {
        return repository;
    }
}
