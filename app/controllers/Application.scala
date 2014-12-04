package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index(s"Your new application is ready.")(Play.current.configuration.getString("message").getOrElse("No message")))
  }

}