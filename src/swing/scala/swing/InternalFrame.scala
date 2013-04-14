package scala.swing

import javax.swing.JInternalFrame

/**
 * User: shlax
 */
class InternalFrame(t:String="",r:Boolean=true,c:Boolean=true,m:Boolean=true,i:Boolean=true) extends Component with SequentialContainer.Wrapper {
  override lazy val peer: JInternalFrame = new JInternalFrame(t, r, c, m, i)

  var mb : Option[MenuBar] = None
  def menuMar = mb
  def menuMar_=(m:MenuBar){
    mb = Some(m)
    peer.setJMenuBar(m.peer)
  }

  def resizable = peer.isResizable
  def resizable_=(a:Boolean) = peer.setResizable(a)

  def closable = peer.isClosable
  def closable_=(a:Boolean) = peer.setClosable(a)

  def iconable = peer.isIconifiable
  def iconable_=(a:Boolean) = peer.setIconifiable(a)

  def maximizable = peer.isMaximizable
  def maximizable_=(a:Boolean) = peer.setMaximizable(a)

  def maximum = peer.isMaximum()
  def maximum_=(a:Boolean) = peer.setMaximum(a)

  def close() = peer.setClosed(true)
}
