package com.sysgears.example.boot

import com.sysgears.example.dao.ChocolateConversions._
import com.sysgears.example.dao.ChocolateDAO
import com.sysgears.example.domain.{Chocolate, ChocolateQueryParams}


object Main extends App {
  val chocolateDAO = new ChocolateDAO

  //data for test:
  val entry = Chocolate(name = "Chocolate santa", ingredients = "cacao, mushrooms, milk", producer = "Kind Chocolate")
  val updateEntry = entry.copy(producer = "Wonka's Chocolate Factory")

  //create:
  val id = chocolateDAO.insert(entry)
  assert(id.isDefined)

  //read:
  val getResult = chocolateDAO.findOneById(id.get)
  assert(getResult.isDefined)
  assert(getResult.get == entry.copy(_id = id.get))

  //update:
  chocolateDAO.update(ChocolateQueryParams(name = Some("Chocolate santa")), updateEntry)
  assert(chocolateDAO.find(ChocolateQueryParams(producer = Some("Wonka's Chocolate Factory"))).nonEmpty)

  //delete:
  chocolateDAO.removeById(id.get)
  assert(chocolateDAO.findOneById(id.get).isEmpty)
}