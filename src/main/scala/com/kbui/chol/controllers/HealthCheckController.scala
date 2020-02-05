package com.kbui.chol.controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.{Controller, HttpServer}
import com.kbui.chol.responses.{HealthCheckResponse}

class HealthCheckController extends Controller {
  get("/z/ping") { request: Request =>
    HealthCheckResponse(status = true)
  }
}