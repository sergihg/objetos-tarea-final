package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

//hora inicio 2:30
//hora final 3:20 con descansos
//timepo total 40 minutos aprox.

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }
    @Test
    public void pruebaDelConstructorConParametrosValidos(){
        // Given:
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);

        // When:
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);

        // Then:
        assertThat(dependencia1).isInstanceOf(Dependencia1.class);
        assertThat(dependencia2).isInstanceOf(Dependencia2.class);
        assertThat(dependencia3).isInstanceOf(Dependencia3.class);
        assertThat(algoritmoX).isNotNull();
    }
    @Test
    public void validarQueCuandoSeLlamaAlMetodoCon_aIgualb_LlamaASaveDeDepencia1(){
        // Given:
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);


        // When:
        int a = 1;
        int b = 1;
        String c = "save";
        algoritmoX.algoritmoACubrir(a,b,c);

        // Then:
        verify(dependencia1, times(1)).save(c);
        verify(dependencia3, times(1)).recover();
        verifyNoMoreInteractions(dependencia1);
        verifyNoMoreInteractions(dependencia2);
        verifyNoMoreInteractions(dependencia3);
    }
    @Test
    public void validarQueCuandoSeLlamaAlMetodoCon_aMenorQueb_LlamaAPrintDeDepencia2(){
        // Given:
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);


        // When:
        int a = 1;
        int b = 2;
        String c = "save";
        algoritmoX.algoritmoACubrir(a,b,c);

        // Then:
        verify(dependencia2, times(1)).print(a,c);
        verify(dependencia3, times(1)).recover();
        verifyNoMoreInteractions(dependencia1);
        verifyNoMoreInteractions(dependencia2);
        verifyNoMoreInteractions(dependencia3);
    }
    @Test
    public void validarQueCuandoSeLlamaAlMetodoCon_aMayorQueB_LlamaASaveDeDepencia1(){
        // Given:
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);


        // When:
        int a = 2;
        int b = 1;
        String c = "save";
        algoritmoX.algoritmoACubrir(a,b,c);

        // Then:
        verify(dependencia3, times(1)).send(a,b);
        verify(dependencia3, times(1)).recover();
        verifyNoMoreInteractions(dependencia1);
        verifyNoMoreInteractions(dependencia2);
        verifyNoMoreInteractions(dependencia3);
    }
}
