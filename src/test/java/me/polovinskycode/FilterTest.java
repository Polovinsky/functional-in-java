package me.polovinskycode;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;

public class FilterTest {

    private Filter filter;

    @Before
    public void setUp() throws Exception {
        filter = new Filter();
    }

    @Test
    public void filtrar_comListaInteiros_deveRetornarNumerosPares() {
        List<Integer> pares = filter.filtrarPares(Arrays.asList(1, 2, 3, 4, 5, 8, 7));
        assertThat(pares, Matchers.hasSize(3));
        assertThat(pares.get(0), Matchers.is(2));
        assertThat(pares.get(1), Matchers.is(4));
        assertThat(pares.get(2), Matchers.is(8));
    }

    @Test
    public void filtrar_comListaInteiros_deveRetornarNumerosMenoresQue8() {
        List<Integer> range = filter.filtrarRange(Arrays.asList(1, 2, 3, 4, 5, 8, 7));
        assertThat(range, Matchers.hasSize(6));
    }

    @Test
    public void filtrar_comListaInteiros_deveRetornarFiltroDeAcordoComAFuncaoInformada() {
        List<Integer> range = filter.filtrarRange(Arrays.asList(1, 2, 3, 4, 5, 8, 7), x -> (x < 8 == true));
        assertThat(range, Matchers.hasSize(6));
    }
}