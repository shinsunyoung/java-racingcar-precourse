package racingcar.car.controller;

import racingcar.car.model.Cars;
import racingcar.car.model.Racing;
import racingcar.car.model.Result;
import racingcar.car.view.InputView;
import racingcar.car.view.ResultView;
import racingcar.printer.Printer;
import racingcar.printer.SystemPrinter;


public class GameManager {

  private final Printer printer;
  private final InputView inputView;
  private final ResultView resultView;

  public GameManager(final SystemPrinter printer) {
    this.printer = printer;
    this.inputView = new InputView(printer);
    this.resultView = new ResultView(printer);
  }

  public void start() {
    play();
  }

  private void play() {
    final Cars cars = inputView.readCars();
    final Racing racing = inputView.readRacing();

    Result result = racing.play(cars, printer);
    resultView.printResult(result);
  }

}
