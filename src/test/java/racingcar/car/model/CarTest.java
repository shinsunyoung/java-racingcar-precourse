package racingcar.car.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {


  @DisplayName("문자열로 Car 객체를 만들 수 있다")
  @Test
  void carTest() {
    // given
    String input = "abc";

    // when
    Car car = new Car(input);

    // then
    assertThat(car.getName()).isEqualTo(input);
  }


  @DisplayName("Car 객체의 이름은 5자 이하여야 한다.")
  @Test
  void inputIndependenceNumberTest() {
    // given
    String wrongInput = "abcdef";

    // when, then
    assertThatThrownBy(() -> {
      new Car(wrongInput);
    }).isInstanceOf(IllegalArgumentException.class);

  }

}