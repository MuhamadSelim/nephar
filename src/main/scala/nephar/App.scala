package nephar

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.effect.DropShadow
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint._
import scalafx.scene.text.Text
import scalafx.scene.control.TextField
import scalafx.scene.control.Button
import scalafx.scene.control.ListView
import scalafx.event.ActionEvent
import scalafxml.core.macros.sfxml
import scala.reflect.runtime.universe.typeOf
import scalafxml.core.{FXMLView, DependenciesByType}
import scalafx.Includes._
case class TestDependency(initialPath: String)


object App extends JFXApp {

  val welcome = FXMLView(getClass.getResource("welcome.fxml"),
    new DependenciesByType(Map(
      typeOf[TestDependency] -> new TestDependency("hello world"))))


  val closing = FXMLView(getClass.getResource("startscreen.fxml"),
    new DependenciesByType(Map(
      typeOf[TestDependency] -> new TestDependency("hello world"))))

  stage = new JFXApp.PrimaryStage() {
    title = "NePhar"
    scene = new Scene(welcome)
    onCloseRequest= handle{
      println("Closing")
    }

  }
}
