package com.kbui.chol.controllers

import com.twitter.finatra.http.EmbeddedHttpServer
import com.twitter.finagle.http.Status
import com.twitter.inject.server.FeatureTest
import com.kbui.chol.{CholServer}

class HealthCheckControllerSpec extends FeatureTest {
  override val server = new EmbeddedHttpServer(new CholServer, disableTestLogging = true)

  test("/z/ping") {
    server.httpGet(path = "/z/ping", andExpect = Status.Ok, withBody = "{\"status\":true}")
  }
}
