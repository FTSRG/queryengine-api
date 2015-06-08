package hu.bme.mit.queryengine.api

import org.eclipse.incquery.runtime.rete.recipes.ReteRecipe
import java.io.File
import java.net.URL
import scala.concurrent.Future

trait QueryEngine {
  def loadData(modelUrl: URL, metamodelUrl: URL): Future[Index]
  def initializeQuery(reteRecipe: ReteRecipe, index: Index): Future[Query]
}