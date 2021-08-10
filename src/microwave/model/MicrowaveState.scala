package microwave.model

abstract class MicrowaveState(microwave: Microwave) {

  def currentInstructions(): Instructions = {
    new Instructions(0, 0)
  }

  // Accessed by View. You should edit this method as you build functionality
  def doorOpen(): Boolean = {
    microwave.doorStatus
  }

  def openDoor(): Unit = {}

  def closeDoor(): Unit = {}

  def startPressed(): Unit = {}

  def powerLevelPressed(): Unit = {}

  def cookTimePressed(): Unit = {}

  def thirtySecondsPressed(): Unit = {}

  def popcornPressed(): Unit = {}

  def clearPressed(): Unit = {}

  def numberPressed(number: Int): Unit = {}

}
