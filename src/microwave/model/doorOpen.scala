package microwave.model

class doorOpen (microwave: Microwave) extends MicrowaveState (microwave){
  override def currentInstructions(): Instructions = {
    new Instructions(0, 0)
  }

  // Accessed by View. You should edit this method as you build functionality
  override def doorOpen(): Boolean = {
    true
  }

  override def openDoor(): Unit = {}

  override def closeDoor(): Unit = {
    microwave.state = new doorClosed(microwave)
  }

  override def startPressed(): Unit = {}

  override def powerLevelPressed(): Unit = {
    microwave.state = new OpowerLevelPressed(microwave)
  }

  override def cookTimePressed(): Unit = {}

  override def thirtySecondsPressed(): Unit = {
    microwave.cTime += 30
  }

  override def popcornPressed(): Unit = {
    microwave.cTime = 140
    microwave.pLevel = 100
  }

  override def clearPressed(): Unit = {}

  override def numberPressed(number: Int): Unit = {
    microwave.cTime = number
    microwave.state = new OtimeNumberPressed(microwave)
  }

}
