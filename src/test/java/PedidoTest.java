
import com.demo.Almacen;
import com.demo.Correo;
import com.demo.Pedido;
import com.demo.ServicioMail;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
/**
 * Created by moe on 4/30/16.
 */
public class PedidoTest {




    @org.junit.Test
    public void testSiNoHayStockSeDebeEnviarUnMailYElPedidoSeMarcaComoFallido() throws Exception {
        int cantidad=10;
        String producto="PC";
        Pedido pedido= new Pedido(producto, cantidad);
        ServicioMail servicioMail = mock(ServicioMail.class);
        Almacen almacen = mock(Almacen.class);
        pedido.setColaboradores(servicioMail);
        boolean hayStock = false;
        when(almacen.hayStock(producto, cantidad)).thenReturn(hayStock);

        // funcionalidad a validar
        pedido.procesarPedido(almacen);

        verify(almacen, times(1)).hayStock(producto, cantidad);
        verify(servicioMail, times(1)).enviarMail(any(Correo.class));
        assertFalse(pedido.isExitoso());
    }

    @Test
    public void testSiHayStockElPedidoSeMarcaExitosoYSeQUitanElementosDelAlmacen() throws Exception {

        int cantidad=10;
        String producto="PC";
        Almacen almacen=mock(Almacen.class);
        boolean hayStock= true;
        when(almacen.hayStock(producto, cantidad)).thenReturn(hayStock);
        Pedido pedido= new Pedido(producto, cantidad);


        pedido.procesarPedido(almacen);

        assertTrue(pedido.isExitoso());
        verify(almacen, times(1)).quitar(producto, cantidad);
    }
}
