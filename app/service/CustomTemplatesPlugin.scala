package service

import securesocial.controllers.TemplatesPlugin
import play.api.mvc.{RequestHeader, Request}
import play.api.data.Form
import play.api.templates.{Txt, Html}
import securesocial.controllers.Registration.RegistrationInfo
import securesocial.core.{Identity, SecuredRequest}
import securesocial.controllers.PasswordChange.ChangeInfo
import views.html

class CustomTemplatesPlugin(application: play.Application) extends TemplatesPlugin
{
  def getAlreadyRegisteredEmail(user: securesocial.core.Identity)(implicit request: play.api.mvc.RequestHeader): (Option[play.api.templates.Txt], Option[play.api.templates.Html]) = ???
  def getLoginPage(form: play.api.data.Form[(String, String)],msg: Option[String])(implicit request: play.api.mvc.Request[play.api.mvc.AnyContent]): play.api.templates.Html = {
    views.html.auth.login(form, msg)
  }
  def getNotAuthorizedPage(implicit request: play.api.mvc.Request[play.api.mvc.AnyContent]): play.api.templates.Html = ???
  def getPasswordChangePage(form: play.api.data.Form[securesocial.controllers.PasswordChange.ChangeInfo])(implicit request: securesocial.core.SecuredRequest[play.api.mvc.AnyContent]): play.api.templates.Html = ???
  def getPasswordChangedNoticeEmail(user: securesocial.core.Identity)(implicit request: play.api.mvc.RequestHeader): (Option[play.api.templates.Txt], Option[play.api.templates.Html]) = ???
  def getResetPasswordPage(form: play.api.data.Form[(String, String)],token: String)(implicit request: play.api.mvc.Request[play.api.mvc.AnyContent]): play.api.templates.Html = ???
  def getSendPasswordResetEmail(user: securesocial.core.Identity,token: String)(implicit request: play.api.mvc.RequestHeader): (Option[play.api.templates.Txt], Option[play.api.templates.Html]) = ???
  def getSignUpEmail(token: String)(implicit request: play.api.mvc.RequestHeader): (Option[play.api.templates.Txt], Option[play.api.templates.Html]) = ???
  def getSignUpPage(form: play.api.data.Form[securesocial.controllers.Registration.RegistrationInfo],token: String)(implicit request: play.api.mvc.Request[play.api.mvc.AnyContent]): play.api.templates.Html = ???
  def getStartResetPasswordPage(form: play.api.data.Form[String])(implicit request: play.api.mvc.Request[play.api.mvc.AnyContent]): play.api.templates.Html = ???
  def getStartSignUpPage(form: play.api.data.Form[String])(implicit request: play.api.mvc.Request[play.api.mvc.AnyContent]): play.api.templates.Html = ???
  def getUnknownEmailNotice()(implicit request: play.api.mvc.RequestHeader): (Option[play.api.templates.Txt], Option[play.api.templates.Html]) = ???
  def getWelcomeEmail(user: securesocial.core.Identity)(implicit request: play.api.mvc.RequestHeader): (Option[play.api.templates.Txt], Option[play.api.templates.Html]) = ???
}
