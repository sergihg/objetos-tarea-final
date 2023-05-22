package uaslp.objetos.figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise3 {
    // CREA LAS CLASES Y METODOS NECESARIOS PARA QUE EL TEST SE EJECUTE CORRECTAMENTE

    // EVITA USAR LOS ATAJOS DEL IDE PARA CREAR CLASES, METODOS Y VARIABLES

    // NO DEBES MODIFICAR PARA NADA ESTA CLASE

    @Test
    public void testCuadrado() {
        // Given:
        Cuadrado cuadrado = new Cuadrado();

        // When:
        Exception ex = Assertions.assertThrows(LadoNoProvistoException.class, () -> cuadrado.getArea());

        assertTrue(ex instanceof DatoFaltanteException);

    }

    @Test
    public void testTriangulo2() {
        // Given:
        Triangulo triangulo = new Triangulo();

        // When:
        Exception ex = Assertions.assertThrows(BaseNoProvistaException.class, () -> triangulo.getArea());

        assertTrue(ex instanceof DatoFaltanteException);
    }

    @Test
    public void testTriangulo3() {
        // Given:
        Triangulo triangulo = new Triangulo();

        triangulo.setBase(123);

        // When:
        Exception ex = Assertions.assertThrows(AlturaNoProvistaException.class, () -> triangulo.getArea());

        assertTrue(ex instanceof DatoFaltanteException);
    }

    @Test
    public void testPoligono() {

        // Then:
        Exception ex = assertThrows(NumeroInvalidoDeLados.class, () -> new PoligonoRegular(3));

        assertFalse(ex instanceof DatoFaltanteException);
        assertEquals("Número de lados válido a partir de 5", ex.getMessage());

    }

}
