package me.polovinskycode;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapTest {

    private Map map;

    @Before
    public void setUp() throws Exception {
        map = new Map();
    }

    @Test
    public void map_comListaInteiros_deveRetornarInteirosDobrados() {
        List<Integer> dobros = map.dobro(Arrays.asList(2, 4));
        Assert.assertThat(dobros, Matchers.hasSize(2));
        Assert.assertThat(dobros.get(0), Matchers.is(4));
        Assert.assertThat(dobros.get(1), Matchers.is(8));
    }

    @Test
    public void map_comListaInteiros_deveRetornarInteirosDeAcordoComFuncaoAltaOrdem() {
        List<Integer> dobros = map.dobro(Arrays.asList(2, 4), x -> (x * 2));
        Assert.assertThat(dobros, Matchers.hasSize(2));
        Assert.assertThat(dobros.get(0), Matchers.is(4));
        Assert.assertThat(dobros.get(1), Matchers.is(8));
    }
}