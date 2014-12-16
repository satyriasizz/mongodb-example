package com.sysgears.example.dao

import com.mongodb.casbah.Imports._
import com.novus.salat.dao.SalatDAO
import com.novus.salat.global._
import com.sysgears.example.domain.Chocolate

class ChocolateDAO extends SalatDAO[Chocolate, ObjectId](collection = MongoConnection()("chocolate_base")("chocolate"))
