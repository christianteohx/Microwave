package microwave.model

class CstartPressed (microwave: Microwave) extends MicrowaveState (microwave){
  override def currentInstructions(): Instructions = {
    new Instructions(microwave.cTime, microwave.pLevel)
  }

  // Accessed by View. You should edit this method as you build functionality
  override def doorOpen(): Boolean = {
    false
  }

  override def openDoor(): Unit = {
    microwave.state = new doorOpen(microwave)
  }

  override def closeDoor(): Unit = {}

  override def startPressed(): Unit = {}

  override def powerLevelPressed(): Unit = {}

  override def cookTimePressed(): Unit = {}

  override def thirtySecondsPressed(): Unit = {
    microwave.cTime += 30
  }

  override def popcornPressed(): Unit = {}

  override def clearPressed(): Unit = {
    microwave.cTime = 0
    microwave.state = new CclearPressed(microwave)
  }

  override def numberPressed(number: Int): Unit = {
    microwave.cTime = number
    microwave.state = new CtimeNumberPressed(microwave)
  }

}
