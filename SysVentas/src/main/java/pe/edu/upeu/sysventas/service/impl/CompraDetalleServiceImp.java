package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysventas.model.CompraDetalle;
import pe.edu.upeu.sysventas.repository.CompraDetalleRepository;
import pe.edu.upeu.sysventas.repository.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.ICompraDetalleService;

@Transactional
@RequiredArgsConstructor
@Service
public class CompraDetalleServiceImp extends CrudGenericSeviceImp<CompraDetalle,Integer> implements ICompraDetalleService {
    private final CompraDetalleRepository repository;
    @Override
    protected ICrudGenericRepository getRepo() {
        return repository;
    }
}
