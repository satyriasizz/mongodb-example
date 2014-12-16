package com.sysgears.example.domain

import com.mongodb.casbah.Imports.ObjectId

case class Chocolate(_id: ObjectId = new ObjectId,
                     name: String,
                     ingredients: String,
                     producer: String)

case class ChocolateQueryParams(_id: Option[ObjectId] = None,
                                  name: Option[String] = None,
                                 ingredients: Option[String] = None,
                                 producer: Option[String] = None)