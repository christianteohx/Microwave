package tests

import microwave.model.Microwave
import org.scalatest.FunSuite

class TestCookTime extends FunSuite {

  // Example test case
  test("Test 1") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(3)
    microwave.numberPressed(0)

    assert(microwave.currentInstructions().cookTime == 0)

    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 30)

  }

  test("Test 2") {
    val microwave: Microwave = new Microwave()

    microwave.thirtySecondsPressed()

    assert(microwave.currentInstructions().cookTime == 30)
  }

  test("Test 3") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(4)
    microwave.numberPressed(5)
    microwave.numberPressed(6)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 456)
  }

  test("Test 4") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(7)
    microwave.numberPressed(8)
    microwave.numberPressed(9)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 789)
  }

  test("Test 5") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(3)
    microwave.numberPressed(0)
    microwave.cookTimePressed()

    assert(microwave.currentInstructions().cookTime == 0)
  }

  test("Test 6") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(1)
    microwave.numberPressed(2)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 12)
  }

  test("Test 7") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(1)
    microwave.numberPressed(2)
    microwave.startPressed()
    microwave.thirtySecondsPressed()

    assert(microwave.currentInstructions().cookTime == 42)
  }

  test("Test 8") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(8)
    microwave.numberPressed(2)
    microwave.numberPressed(3)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 823)
  }

  test("Test 9") {
    val microwave: Microwave = new Microwave()

    microwave.thirtySecondsPressed()

    assert(microwave.currentInstructions().cookTime == 30)
  }

  test("Test 10") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(4)
    microwave.numberPressed(1)
    microwave.thirtySecondsPressed()

    assert(microwave.currentInstructions().cookTime == 0)
  }

  test("Test 11") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(2)
    microwave.thirtySecondsPressed()
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 32)
  }



}
