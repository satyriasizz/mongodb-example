package com.sysgears.example.domain

import org.bson.types.ObjectId

case class ChocolateQueryParams(_id: Option[ObjectId] = None,
                                  name: Option[String] = None,
                                 ingredients: Option[String] = None,
                                 producer: Option[String] = None)
