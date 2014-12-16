package com.sysgears.example.dao

import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.sysgears.example.domain.{Chocolate, ChocolateQueryParams}
import scala.language.implicitConversions

object ChocolateConversions {
  implicit def paramsToDBObject(params: ChocolateQueryParams): DBObject =
    grater[ChocolateQueryParams].asDBObject(params)

  implicit def chocolateToDBObject(c: Chocolate): DBObject =
    grater[Chocolate].asDBObject(c)
}
