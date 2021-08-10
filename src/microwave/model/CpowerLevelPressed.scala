package microwave.model

class CpowerLevelPressed (microwave: Microwave) extends MicrowaveState (microwave){
  override def currentInstructions(): Instructions = {
    new Instructions(0, 0)
  }

  // Accessed by View. You should edit this method as you build functionality
  override def doorOpen(): Boolean = {
    false
  }

  override def openDoor(): Unit = {
    microwave.state = new OpowerLevelPressed(microwave)
  }

  override def closeDoor(): Unit = {}

  override def startPressed(): Unit = {
    microwave.state = new CstartPressed(microwave)
  }

  override def powerLevelPressed(): Unit = {}

  override def cookTimePressed(): Unit = {
    microwave.state = new CcookTimePressed(microwave)
  }

  override def thirtySecondsPressed(): Unit = {}

  override def popcornPressed(): Unit = {
    microwave.cTime = 140
    microwave.pLevel = 100
    microwave.state = new CstartPressed(microwave)
  }

  override def clearPressed(): Unit = {
    microwave.state = new CclearPressed(microwave)
  }

  override def numberPressed(number: Int): Unit = {
    microwave.pLevel = number * 10
    microwave.state = new CpowerLevelPressed(microwave)
  }

}
