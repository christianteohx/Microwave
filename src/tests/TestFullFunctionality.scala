package tests

import microwave.model.Microwave
import org.scalatest.FunSuite

class TestFullFunctionality extends FunSuite {

  test("Test 1") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(1)
    microwave.numberPressed(1)
    microwave.openDoor()
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 0)
  }


  test("Test 3") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(1)
    microwave.numberPressed(1)
    microwave.startPressed()
    microwave.openDoor()
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 0)
  }

  test("Test 4") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(2)
    microwave.numberPressed(2)
    microwave.startPressed()
    microwave.clearPressed()
    microwave.cookTimePressed()
    microwave.numberPressed(1)
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 1)
  }

  test("Test 5") {
    val microwave: Microwave = new Microwave()

    microwave.popcornPressed()

    assert(microwave.currentInstructions().cookTime == 140)
    assert(microwave.currentInstructions().powerLevel == 100)
  }

  test("Test 6") {
    val microwave: Microwave = new Microwave()

    microwave.openDoor()
    microwave.popcornPressed()

    assert(microwave.currentInstructions().cookTime == 0)
    assert(microwave.currentInstructions().powerLevel == 0)
  }

  test("Test 7") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(5)
    microwave.powerLevelPressed()
    microwave.numberPressed(3)
    microwave.openDoor()
    microwave.numberPressed(7)
    microwave.closeDoor()
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 5)
    assert(microwave.currentInstructions().powerLevel == 70)
  }

  test("Test 8") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(6)
    microwave.numberPressed(7)
    microwave.startPressed()
    microwave.openDoor()
    microwave.clearPressed()
    microwave.numberPressed(5)
    microwave.thirtySecondsPressed()
    microwave.closeDoor()
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 35)
    assert(microwave.currentInstructions().powerLevel == 100)
  }

  test("Test 9") {
    val microwave: Microwave = new Microwave()

    microwave.popcornPressed()

    assert(microwave.currentInstructions().cookTime == 140)
    assert(microwave.currentInstructions().powerLevel == 100)
  }

  test("Test 10") {
    val microwave: Microwave = new Microwave()

    microwave.numberPressed(5)
    microwave.powerLevelPressed()
    microwave.numberPressed(3)
    microwave.openDoor()
    microwave.popcornPressed()
    microwave.closeDoor()
    microwave.startPressed()

    assert(microwave.currentInstructions().cookTime == 140)
    assert(microwave.currentInstructions().powerLevel == 100)
  }
}
