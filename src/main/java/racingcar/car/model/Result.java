package racingcar.car.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import racingcar.car.exception.CarNameLengthException;

public class Result {
  private List<String> winnerNames;

  public Result(Cars cars) {
    this.winnerNames = new ArrayList<>();
    calculateWinner(cars);
  }

  public List<String> getWinnerNames() {
    return winnerNames;
  }

  private void calculateWinner(Cars cars) {
    cars.sort();
    winnerNames.add(cars.get(0).getName());

    for (int i = 1; i < cars.size(); i++) {
      addIfTied(cars.getHighestScore(), cars.get(i));
    }
  }

  private void addIfTied(int highestScore, Car car) {
    if (car.getHistorySize() == highestScore) {
      winnerNames.add(car.getName());
    }
  }
}
