package daosImpl;

import java.util.List;

import daos.AnunciosDAO;

public class AnunciosDAOImpl implements AnunciosDAO{

	@Override
	public List<?> obtenerAnunciosPortada() {
		System.out.println("accedo a base de datos para sacar anuncios");
		return null;
	}

}
