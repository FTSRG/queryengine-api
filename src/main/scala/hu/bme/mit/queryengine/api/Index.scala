package hu.bme.mit.queryengine.api

import scala.concurrent.Future

trait Index {
  def change(delta: ChangeSet): Future[Unit]
}