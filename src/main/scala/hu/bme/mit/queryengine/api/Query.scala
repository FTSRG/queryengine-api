package hu.bme.mit.queryengine.api

import org.eclipse.incquery.runtime.rete.recipes.ProductionRecipe
import scala.concurrent.Future

trait Query {
  def getResults(productionRecipe: ProductionRecipe): Future[QueryResult]
}