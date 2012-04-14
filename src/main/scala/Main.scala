import unfiltered.request._
import unfiltered.response._
import org.clapper.avsl.Logger

class Sample extends unfiltered.filter.Plan {
  val logger = Logger(classOf[Sample])
  def intent = {
    case Path(Seg(p :: Nil)) => {
      logger.debug(p)
      ResponseString(p)
    }
    case _ => ResponseString("Hello.")
  }
}

object Main extends App {
  val logger = Logger(Main.getClass)
  val port = util.Properties.envOrElse("PORT", "8080").toInt
  logger.info("started on port:%d".format(port))
  unfiltered.jetty.Http(port).plan(new Sample).run()
}