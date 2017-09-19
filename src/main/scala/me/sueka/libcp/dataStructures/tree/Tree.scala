package me.sueka.libcp.dataStructures.tree

sealed trait Tree[+A]
case class Branch[A](childs: Tree[A]*) extends Tree[A]
case class Leaf[A](value: A) extends Tree[A]
