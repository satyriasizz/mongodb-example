package com.sysgears.example.boot

import com.sysgears.example.dao.ChocolateConversions._
import com.sysgears.example.dao.ChocolateDAO
import com.sysgears.example.domain.{Chocolate, ChocolateQueryParams}


object Main extends App {
  val chocolateDAO = new ChocolateDAO

  // Data for test:
  val entry = Chocolate(name = "Chocolate santa", ingredients = "cacao, mushrooms, milk", producer = "Kind Chocolate")
  val updateEntry = entry.copy(producer = "Wonka's Chocolate Factory")

  // Create:
  val id = chocolateDAO.insert(entry)
  assert(id.isDefined)

  // Read:
  val getResult = chocolateDAO.findOneById(id.get)
  assert(getResult.isDefined)
  assert(getResult.get == entry.copy(_id = id.get))

  // Update:
  chocolateDAO.update(ChocolateQueryParams(name = Some("Chocolate santa")), updateEntry)
  assert(chocolateDAO.find(ChocolateQueryParams(producer = Some("Wonka's Chocolate Factory"))).nonEmpty)

  // Delete:
  chocolateDAO.removeById(id.get)
  assert(chocolateDAO.findOneById(id.get).isEmpty)
}