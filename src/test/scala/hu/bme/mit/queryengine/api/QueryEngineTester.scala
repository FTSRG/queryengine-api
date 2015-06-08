package hu.bme.mit.queryengine.api

import org.junit._

import Assert._
import org.eclipse.incquery.runtime.rete.recipes.ReteRecipe
import java.net.URL
import scala.concurrent.ExecutionContext.Implicits.global

class QueryEngineTester {

  def test(queryEngine: QueryEngine, testData: TestData) = {
    for (
      index <- queryEngine.loadData(testData.modelUrl, testData.metamodelUrl);
      query <- queryEngine.initializeQuery(testData.reteRecipe, index);
   		resultInitial <- query.getResults(testData.productionRecipe)
    ) {
      assertEquals(testData.expectedResultInitial, resultInitial)
      for (
        changed <- index.change(testData.delta);
        resultAfterChange <- query.getResults(testData.productionRecipe)
      ) {
        assertEquals(testData.expectedResultAfterChange, resultAfterChange)
      }
    }
  }

}
