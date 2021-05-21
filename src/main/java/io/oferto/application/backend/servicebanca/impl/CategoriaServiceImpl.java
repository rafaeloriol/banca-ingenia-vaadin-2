package io.oferto.application.backend.servicebanca.impl;

import io.oferto.application.backend.modelbanca.Categoria;
import io.oferto.application.backend.repositorybanca.CategoriaRepository;
import io.oferto.application.backend.servicebanca.CategoriaService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    // inyección
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        // Si ya existe el tipo de Categoria devuelve null
        if(categoriaRepository.existsByTipoCategoria(categoria.getTipoCategoria()) == true) {
            return null;
        }else{
            return categoriaRepository.save(categoria);
        }

    }
}
