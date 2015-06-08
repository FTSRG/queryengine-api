package hu.bme.mit.queryengine.api

import scala.concurrent.Future

trait Index {
  def change(delta: Delta): Future[Unit]
}