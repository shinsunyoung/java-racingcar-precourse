package racingcar.car.controller;

import racingcar.car.model.CarNames;
import racingcar.car.view.InputView;
import racingcar.printer.SystemPrinter;


public class GameManager {

  private final InputView inputView;

  public GameManager(final SystemPrinter printer) {
    this.inputView = new InputView(printer);
  }

  public void start() {
    play();
  }

  private void play() {
    final CarNames answer = inputView.readCardNames();
  }

}
