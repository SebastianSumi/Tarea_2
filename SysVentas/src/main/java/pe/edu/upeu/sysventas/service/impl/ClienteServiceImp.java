package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysventas.model.Cliente;
import pe.edu.upeu.sysventas.repository.ClienteRepository;
import pe.edu.upeu.sysventas.repository.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.IClienteService;

@Transactional
@RequiredArgsConstructor
@Service
public class ClienteServiceImp extends CrudGenericSeviceImp<Cliente,Integer> implements IClienteService {
    private final ClienteRepository repository;
    @Override
    protected ICrudGenericRepository getRepo() {
        return repository;
    }
}