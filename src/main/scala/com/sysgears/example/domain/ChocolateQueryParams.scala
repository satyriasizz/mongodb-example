package com.sysgears.example.domain

/**
 * Created by saty on 16/12/2014.
 */
case class ChocolateQueryParams(_id: Option[ObjectId] = None,
                                  name: Option[String] = None,
                                 ingredients: Option[String] = None,
                                 producer: Option[String] = None)
