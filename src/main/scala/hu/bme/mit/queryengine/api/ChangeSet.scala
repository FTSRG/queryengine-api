package hu.bme.mit.queryengine.api

case class ChangeSet(positive: Set[List[String]], negative: Set[List[String]])