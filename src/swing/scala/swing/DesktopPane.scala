package scala.swing

import javax.swing.JDesktopPane

/**
 * User: shlax
 */

object DragMode extends Enumeration{
  val Live = Value(JDesktopPane.LIVE_DRAG_MODE)
}

class DesktopPane extends Component with SequentialContainer.Wrapper {
  override lazy val peer: JDesktopPane = new JDesktopPane

}
