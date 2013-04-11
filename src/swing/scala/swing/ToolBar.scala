package scala.swing

import javax.swing.{SwingConstants, JToolBar}

/**
 * User: shlax
 * @see javax.swing.JToolBar
 */
class ToolBar(nm:String=null, o:Orientation.Value=Orientation.Horizontal) extends Component with SequentialContainer.Wrapper {
  override lazy val peer: JToolBar = new JToolBar(nm, o.id)

  def floatable = peer.isFloatable
  def floatable_=(f:Boolean) = peer.setFloatable(f)

  def orientation = if(peer.getOrientation == SwingConstants.VERTICAL) Orientation.Vertical else Orientation.Horizontal
  def orientation_=(o:Orientation.Value) = peer.setOrientation(o.id)

  def borderPainted = peer.isBorderPainted
  def borderPainted_=(b:Boolean) = peer.setBorderPainted(b)

  def rollover = peer.isRollover
  def rollover_=(b:Boolean) = peer.setRollover(b)

  def addSeparator() = peer.addSeparator()
  def addSeparator(size:Dimension) = peer.addSeparator(size)

  def add(a:Action) = {
    val b = new Button(a)
    contents += b
    b
  }

}

