import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LionTest {

    Lion lion;

    @BeforeEach
    void setUp(){
        lion = new Lion("Simba", false);
    }

    @Test
    void canMakeNoise(){
        assertThat(lion.makeNoise()).isEqualTo("ROAR!");
    }

    @Test
    void canMakeOpinionatedNoise(){
        assertThat(lion.makeNoise("Toy Story was overrated")).isEqualTo("In, my opinion, Toy Story was overrated.");
    }

    @Test
    void canEat(){
        assertThat(lion.eat()).isEqualTo("Mmm, that was tasty!");
    }

}
