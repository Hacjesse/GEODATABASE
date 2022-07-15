/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Date;
import java.util.List;
import model.MunicipioService;
import model.Municipio;
import util.JPAUtil;
import model.Estado;
import model.EstadoService;
import model.Rodovia;
import model.RodoviaService;
/**
 *
 * @author caian
 */
public class Application {
    public static void main(String[] args) {
       MunicipioService municipioService = new MunicipioService();
       
       
       List<Municipio> municipios = municipioService.listarMunicipiosVizinhos("Campina Grande");
       for (Municipio m: municipios){
            System.out.println(m);
       }
       
       EstadoService estadoService = new EstadoService();
       
       List<Estado> estados = estadoService.listarEstadosVizinhos("Paraíba");
       for (Estado e: estados){
            System.out.println(e);
       }
       
       municipios = municipioService.municipiosDaPB("PB");
       
       for (Municipio m: municipios){
            System.out.println(m);
       }
       
       RodoviaService rodoviaService = new RodoviaService();
       
        List<Rodovia> rodovias = rodoviaService.rodoviasAtravessamGba("Guarabira");
       
       for (Rodovia r: rodovias){
           System.out.println(r);
       }
       
       
       

       double distancia = municipioService.distanciaEntreMunicipios("João Pessoa", "Guarabira");
       System.out.printf("Distância em km: %.2f", distancia / 1000);

       
       
       
       JPAUtil.close();
    }
}
