package microwave.model

class CclearPressed (microwave: Microwave) extends MicrowaveState (microwave){
  override def currentInstructions(): Instructions = {
    new Instructions(0, 100)
  }

  // Accessed by View. You should edit this method as you build functionality
  override def doorOpen(): Boolean = {
    microwave.doorStatus
  }

  override def openDoor(): Unit = {
    microwave.state = new doorOpen(microwave)
  }

  override def closeDoor(): Unit = {
    microwave.state = new doorClosed(microwave)
  }

  override def startPressed(): Unit = {}

  override def powerLevelPressed(): Unit = {
    microwave.state = new CpowerLevelPressed(microwave)
  }

  override def cookTimePressed(): Unit = {
    microwave.state = new CcookTimePressed(microwave)
  }

  override def thirtySecondsPressed(): Unit = {}

  override def popcornPressed(): Unit = {
    microwave.cTime = 140
    microwave.pLevel = 100
    microwave.state = new CstartPressed(microwave)
  }

  override def clearPressed(): Unit = {}

  override def numberPressed(number: Int): Unit = {
    microwave.state = new CcookTimePressed(microwave)
  }

}
