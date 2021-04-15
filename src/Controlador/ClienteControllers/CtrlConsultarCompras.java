package Controlador.ClienteControllers;

import Modelo.Cliente;
import Vista.ClienteViews.FrmConsultarCompras;

public class CtrlConsultarCompras {
    
    FrmConsultarCompras vista;
    Cliente cliente;

    public CtrlConsultarCompras(FrmConsultarCompras vista, Cliente cliente) {
        this.vista = vista;
        this.cliente = cliente;
        
        
    }
    
    public void inicializar(){
        this.vista.show();
    }    
}
