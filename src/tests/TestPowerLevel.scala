package tests

import microwave.model.Microwave
import org.scalatest.FunSuite

class TestPowerLevel extends FunSuite {

  test("Test 1"){
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(5)
    microwave.numberPressed(5)
    microwave.powerLevelPressed()
    microwave.numberPressed(5)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 55)
    assert(microwave.currentInstructions().powerLevel == 50)
  }

  test("Test 2"){
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(5)
    microwave.numberPressed(5)
    microwave.powerLevelPressed()
    microwave.numberPressed(2)
    microwave.cookTimePressed()
    microwave.numberPressed(2)
    microwave.numberPressed(5)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 25)
    assert(microwave.currentInstructions().powerLevel == 20)
  }

  test("test 3") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(2)
    microwave.numberPressed(2)
    microwave.startPressed()

    assert(microwave.currentInstructions().powerLevel == 100)
  }

  test("test 4") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(3)
    microwave.numberPressed(3)
    microwave.powerLevelPressed()
    microwave.numberPressed(2)
    microwave.numberPressed(3)
    microwave.numberPressed(4)
    microwave.startPressed()

    assert(microwave.currentInstructions().powerLevel == 40)
  }

  test("test 5") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(3)
    microwave.numberPressed(3)
    microwave.powerLevelPressed()
    microwave.numberPressed(2)
    microwave.numberPressed(3)
    microwave.numberPressed(4)
    microwave.clearPressed()
    microwave.startPressed()

    assert(microwave.currentInstructions().powerLevel == 100)
  }

  test("test 6") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(5)
    microwave.numberPressed(9)
    microwave.powerLevelPressed()
    microwave.numberPressed(7)
    microwave.numberPressed(3)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 59)
    assert(microwave.currentInstructions().powerLevel == 30)
  }

  test("test 7") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(5)
    microwave.powerLevelPressed()
    microwave.numberPressed(6)
    microwave.cookTimePressed()
    microwave.numberPressed(1)
    microwave.numberPressed(0)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 10)
    assert(microwave.currentInstructions().powerLevel == 60)
  }
}
