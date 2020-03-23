package com.notas.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.notas.core.entity.CodigoPostal;
import com.notas.core.entity.Nota;
import com.notas.core.model.*;

@Component("convertidor")
public class Convertidor{
	public List<MNota> convertirLista(List<Nota> notas){
		List<MNota> mnotas = new ArrayList<>();
		
		for(Nota nota : notas) {
			mnotas.add(new MNota(nota));
		}
		return mnotas;
	}
	public List<ModeloCodigoPostal> convertirListaCodigoPostal(List<CodigoPostal> codigosPostales){
		List<ModeloCodigoPostal> modeloCodigoPostal = new ArrayList<>();
		
		for(CodigoPostal codigoPostal : codigosPostales) {
			modeloCodigoPostal.add(new ModeloCodigoPostal(codigoPostal));
		}
		return modeloCodigoPostal;
	}
	
}
