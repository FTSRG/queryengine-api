package hu.bme.mit.queryengine.api

import org.eclipse.incquery.runtime.rete.recipes.ReteRecipe
import java.net.URL
import org.eclipse.incquery.runtime.rete.recipes.ProductionRecipe

case class TestData(
    reteRecipe: ReteRecipe,
    productionRecipe: ProductionRecipe,
    modelUrl: URL,
    metamodelUrl: URL,
    expectedResultInitial: ChangeSet,
    delta: ChangeSet,
    expectedResultAfterChange: ChangeSet
)
