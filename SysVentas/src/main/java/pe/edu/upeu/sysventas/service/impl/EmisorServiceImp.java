package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysventas.model.Emisor;
import pe.edu.upeu.sysventas.repository.EmisorRepository;
import pe.edu.upeu.sysventas.repository.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.IEmisorService;

@Transactional
@RequiredArgsConstructor
@Service
public class EmisorServiceImp extends CrudGenericSeviceImp<Emisor,Long> implements IEmisorService {
    private final EmisorRepository repository;
    @Override
    protected ICrudGenericRepository getRepo() {
        return repository;
    }
}
