
vertx.createHttpServer().requestHandler({ req ->
  println("Got request with query params: ${req.query()}")
  req.response().end()
}).listen(8080, { listenResult ->
  if (listenResult.failed()) {
    println("Could not start HTTP server")
    listenResult.cause().printStackTrace()
  } else {
    println("Server started")
  }
})
