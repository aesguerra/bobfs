package org.minyodev

import java.io.{BufferedReader, IOException}

/**
  * Create file.txt with record '123'
  * */
object Example {

  def main(args: Array[String]): Unit = {

    // fd means file descriptor (can be integer or long)
    val fd = BobFS.create("file.txt")

    // outputStream creates an java.io.OutputStream interface for the provided fd
    val writer = new java.io.PrintWriter(BobFS.outputStream(fd))
    writer.write("hello world")
    writer.flush
    writer.close

    // destroys the reference fd
    BobFS.close(fd)

    // file descriptor for reading
    val fd2 = BobFS.open("file.txt")

    // inputStream creates an java.io.InputStream interface for the provided fd
    val reader = new BufferedReader(BobFS.inputStream(fd2))

    try {
      var line: String = null

      while ((line = reader.readLine) != null)
        println(line)
    } catch {
      case e: IOException =>
        e.printStackTrace()
    } finally {
      if (reader != null)
        reader.close()
    }

    BobFS.close(fd2) // same as above
  }
}
