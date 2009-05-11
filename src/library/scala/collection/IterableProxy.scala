/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2009, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: IterableProxy.scala 15458 2008-06-28 20:23:22Z stepancheg $


package scala.collection

import generic._

// Methods could be printed by  cat Traversibe.scala | egrep '^  (override )?def'


/** This trait implements a proxy for iterable objects. It forwards
 *  all calls to a different iterable object
 *
 *  @author  Martin Odersky
 *  @version 2.8
 */
trait IterableProxy[+A] extends Iterable[A] with IterableProxyTemplate[A, Iterable[A]] 