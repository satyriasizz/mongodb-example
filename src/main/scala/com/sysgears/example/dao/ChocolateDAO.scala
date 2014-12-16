package com.sysgears.example.dao

import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.dao.SalatDAO
import com.novus.salat.global._
import com.sysgears.example.domain.{Chocolate, ChocolateQueryParams}



class ChocolateDAO extends SalatDAO[Chocolate, ObjectId](collection = MongoConnection()("chocolate_base")("chocolate"))

object ChocolateConversions {
  implicit def paramsToDBObject(params: ChocolateQueryParams): DBObject =
    grater[ChocolateQueryParams].asDBObject(params)

  implicit def chocolateToDBObject(c: Chocolate): DBObject =
    grater[Chocolate].asDBObject(c)
}
