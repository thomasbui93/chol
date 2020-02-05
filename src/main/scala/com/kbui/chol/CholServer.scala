package com.kbui.chol

import com.twitter.finatra.http.routing.HttpRouter
import com.twitter.finatra.http.HttpServer
import com.kbui.chol.controllers.{HealthCheckController}

object CholServerMain extends CholServer

class CholServer extends HttpServer {
  override val disableAdminHttpServer = true

  override def configureHttp(router: HttpRouter) {
    router.add[HealthCheckController]
  }
}