package microwave.model

class doorClosed (microwave: Microwave) extends MicrowaveState (microwave){
  override def currentInstructions(): Instructions = {
    new Instructions(0, 0)
  }

  // Accessed by View. You should edit this method as you build functionality
  override def doorOpen(): Boolean = {
    false
  }

  override def openDoor(): Unit = {
    microwave.state = new doorOpen(microwave)
  }

  override def closeDoor(): Unit = {}

  override def startPressed(): Unit = {
    microwave.state = new CstartPressed(microwave)
  }

  override def powerLevelPressed(): Unit = {
    microwave.state = new CpowerLevelPressed(microwave)
  }

  override def cookTimePressed(): Unit = {
    microwave.state = new CcookTimePressed(microwave)
  }

  override def thirtySecondsPressed(): Unit = {
    microwave.cTime += 30
    microwave.state = new CstartPressed(microwave)
  }

  override def popcornPressed(): Unit = {
    microwave.cTime = 140
    microwave.pLevel = 100
    microwave.state = new CstartPressed(microwave)
  }

  override def clearPressed(): Unit = {

  }

  override def numberPressed(number: Int): Unit = {
    microwave.cTime = number
    microwave.state = new CtimeNumberPressed(microwave)
  }

}
