/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session3ireport;

import java.util.*;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Gabriel
 */
public class ParticipantesDatasource implements JRDataSource{
    private  List<Participante> listaParticipantes = new ArrayList<Participante>();
    private int indiceParticipanteActual = -1;

    @Override
    public boolean next() throws JRException {
        return ++indiceParticipanteActual<listaParticipantes.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        if("nombre".equals(jrf.getName())){
            valor = listaParticipantes.get(indiceParticipanteActual).getNombre();
        }else if(("username").equals(jrf.getName())){
            valor = listaParticipantes.get(indiceParticipanteActual).getUsername();
        }else if(("password").equals(jrf.getName())){
            valor = listaParticipantes.get(indiceParticipanteActual).getPassword();
        }else if(("comentarios").equals(jrf.getName())){
            valor = listaParticipantes.get(indiceParticipanteActual).getComentarios();
        }
        return valor;
    }
    public void addParticipante(Participante participante){
        this.listaParticipantes.add(participante);
    }


    
    
    
    
}
