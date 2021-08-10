package microwave.model

class Microwave() {

  var state: MicrowaveState = new doorClosed(this)
  var cTime: Int = 0
  var pLevel: Int = 100
  var doorStatus: Boolean = false

  // Accessed by View. You should edit this method as you build functionality
  def currentInstructions(): Instructions = {
    this.state.currentInstructions()
  }

  // Accessed by View. You should edit this method as you build functionality
  def doorOpen(): Boolean = {
    this.state.doorOpen()
  }

  def openDoor(): Unit = {
    this.state.openDoor()
  }

  def closeDoor(): Unit = {
    this.state.closeDoor()
  }

  def startPressed(): Unit = {
    this.state.startPressed()
  }

  def powerLevelPressed(): Unit = {
    this.state.powerLevelPressed()
  }

  def cookTimePressed(): Unit = {
    this.state.cookTimePressed()
  }

  def thirtySecondsPressed(): Unit = {
    this.state.thirtySecondsPressed()
  }

  def popcornPressed(): Unit = {
    this.state.popcornPressed()
  }

  def clearPressed(): Unit = {
    this.state.clearPressed()
  }

  def numberPressed(number: Int): Unit = {
    this.state.numberPressed(number)
  }

}
