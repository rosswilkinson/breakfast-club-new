package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{Action, Controller}

/**
  * Created by ddcn4301 on 21/09/16.
  */

@Singleton
class BreakfastAppController @Inject() extends Controller {
  def home = Action {
    OK(views.html.index("Your new application is ready."))
  }

}
