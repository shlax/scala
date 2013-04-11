package scala.swing

import javax.swing.JInternalFrame

/**
 * User: shlax
 */
class InternalFrame extends Component with SequentialContainer.Wrapper {
  override lazy val peer: JInternalFrame = new JInternalFrame
}
