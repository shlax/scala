package scala.swing

import javax.swing.JDesktopPane

/**
 * User: shlax
 */

object DragMode extends Enumeration{
  val Live = Value(JDesktopPane.LIVE_DRAG_MODE)
  val Outline = Value(JDesktopPane.OUTLINE_DRAG_MODE)

}

class DesktopPane extends Component with SequentialContainer.Wrapper {
  override lazy val peer: JDesktopPane = new JDesktopPane

  def dragMode = if(peer.getDragMode == JDesktopPane.LIVE_DRAG_MODE) DragMode.Live else DragMode.Outline
  def dragMode_=(d:DragMode.Value) = peer.setDragMode(d.id)



}
