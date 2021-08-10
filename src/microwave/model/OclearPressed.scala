package microwave.model

class OclearPressed (microwave: Microwave) extends MicrowaveState (microwave){
  override def currentInstructions(): Instructions = {
    new Instructions(0, 0)
  }

  // Accessed by View. You should edit this method as you build functionality
  override def doorOpen(): Boolean = {
    true
  }

  override def openDoor(): Unit = {}

  override def closeDoor(): Unit = {
    microwave.state = new CclearPressed(microwave)
  }

  override def startPressed(): Unit = {}

  override def powerLevelPressed(): Unit = {
    microwave.state = new OpowerLevelPressed(microwave)
  }

  override def cookTimePressed(): Unit = {}

  override def thirtySecondsPressed(): Unit = {}

  override def popcornPressed(): Unit = {}

  override def clearPressed(): Unit = {}

  override def numberPressed(number: Int): Unit = {
    microwave.cTime = number
  }

}
