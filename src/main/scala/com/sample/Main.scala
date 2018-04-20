package com.sample

import akka.typed.ActorSystem
import akka.typed.scaladsl.Actor

object Main extends App {
  ActorSystem[Nothing](Actor.empty, "system")
}