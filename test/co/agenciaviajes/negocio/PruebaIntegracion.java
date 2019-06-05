
package co.agenciaviajes.negocio;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Libardo, Ricardo, Julio
 */
public class PruebaIntegracion {
    
    public PruebaIntegracion() {
    }

    /**
     * Test del plan San Andres
     */
    @Test
    public void testSanAndres() {
        System.out.println("Test plan San Andres");
        
        DirectorPlan director = new DirectorPlan();
        PlanBuilder sanAndres = new SanAndresBuilder();
        director.setPlanBuilder(sanAndres);
        director.construirPlan();
        Plan plan = director.getPlan();
        
        assertEquals("Cali - San Andres", plan.getTransporte());
        assertEquals("Manuel", plan.getCliente().getNombres());
        assertEquals("Sanchez", plan.getCliente().getApellidos());        
        assertEquals("Hostal el vecino", plan.getAlojamiento());
        assertEquals("Desayunos, almuerzos y cenas", plan.getAlimentacion());
        assertEquals(true, plan.getImpuestoTiquete());
        assertEquals(true, plan.getSeguroHotelero());
        assertEquals("[Vuelta a la isla, Tour por la bahia, Manglares y mantarrayas]", Arrays.toString(plan.getTours()));
        assertEquals(true, plan.getImpuestoTiquete());
        assertEquals(3088000, plan.getValor());
    }

    /**
     * Test del plan Cartagena
     */
    @Test
    public void testCartagena() {
        System.out.println("Test plan Cartagena");
        
        DirectorPlan director = new DirectorPlan();
        PlanBuilder cartagena = new CartagenaBuilder();
        director.setPlanBuilder(cartagena);
        director.construirPlan();
        Plan plan = director.getPlan();
        
        assertEquals("Cali - Cartagena", plan.getTransporte());
        assertEquals("Andrea", plan.getCliente().getNombres());
        assertEquals("Fernandez", plan.getCliente().getApellidos());
        assertEquals("Hotel Cartagena Premium", plan.getAlojamiento());
        assertEquals("Desayunos, almuerzos y cenas", plan.getAlimentacion());
        assertEquals(true, plan.getImpuestoTiquete());
        assertEquals(true, plan.getSeguroHotelero());
        assertEquals("[Playa blanca con almuerzo]", Arrays.toString(plan.getTours()));
        assertEquals(true, plan.getImpuestoTiquete());
        assertEquals(3010800, plan.getValor());
    }    
    
     /**
     * Test del plan Cartagena
     */
    @Test
    public void testSantaMarta() {
        System.out.println("Test plan Santa Marta");
        
        DirectorPlan director = new DirectorPlan();
        PlanBuilder santaMarta = new SantaMartaBuilder();
        director.setPlanBuilder(santaMarta);
        director.construirPlan();
        Plan plan = director.getPlan();
        
        assertEquals("Popayan - Santa Marta", plan.getTransporte());
        assertEquals("Juan", plan.getCliente().getNombres());
        assertEquals("Ayala", plan.getCliente().getApellidos());
        assertEquals("Hotel Decameron", plan.getAlojamiento());
        assertEquals("Desayunos, almuerzos y cenas", plan.getAlimentacion());
        assertEquals(true, plan.getImpuestoTiquete());
        assertEquals(true, plan.getSeguroHotelero());
        assertEquals("[Playa blanca con almuerzo]", Arrays.toString(plan.getTours()));
        assertEquals(true, plan.getImpuestoTiquete());
        assertEquals(3010800, plan.getValor());
    }    
    
}
