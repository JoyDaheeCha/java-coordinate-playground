package Car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    public void Car_연비_리턴_테스트() throws Exception {

        Car sonata = new Sonata(1);
        Car avante = new Avante(1);
        Car k5 = new K5(1);

        assertThat(sonata.getDistancePerLiter()).isEqualTo(10);
        assertThat(avante.getDistancePerLiter()).isEqualTo(15);
        assertThat(k5.getDistancePerLiter()).isEqualTo(13);
    }
}
