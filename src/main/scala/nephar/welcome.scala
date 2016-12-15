package nephar

import scalafx.scene.control.TextField
import scalafx.scene.control.Button
import scalafx.scene.control.ListView
import scalafx.scene.control.MenuItem
import scalafx.event.ActionEvent
import scalafxml.core.macros.sfxml
import scalafx.scene.Scene
import scalafx.Includes._
import scalafxml.core.FXMLLoader


@sfxml
class Welcome(fileQuit: MenuItem){
	def onQuit(event: ActionEvent) {
		App.stage.close()
	}
	def onPreferences(event: ActionEvent) {
		App.stage.scene = new Scene(App.closing)
	}
}
