package scala.swing

import javax.swing.JDesktopPane

/**
 * User: shlax
 */
class DesktopPane extends Component with SequentialContainer.Wrapper {
  override lazy val peer: JDesktopPane = new JDesktopPane

}
