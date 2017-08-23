package org.minyodev

import java.io.{FileReader, OutputStream}

import scala.collection.mutable.{ArrayBuffer, HashMap, ListBuffer}


/**
  * @author aesguerra
  * */
object BobFS {

  val fsTable: HashMap[String, Int] = new HashMap[String, Int]() // key=filename value=location index
  val dataBlocks = new ArrayBuffer[ListBuffer[ArrayBuffer[Byte]]] // ListBuffer of ArrayBuffer to support parallel reads of blocks for a given file (like HDFS)

  /**
    * Create a new FileDescriptor
    * */
  def create(f: String): FileDescriptor = null

  /**
    * File descriptor for reading
    * */
  def open(f: String): FileDescriptor = null

  /**
    * Creates a java.io.InputStream interface for the provided fd
    * */
  def inputStream(fd: FileDescriptor): FileReader = null

  /**
    * Creates a java.io.OutputStream interface for the provided fd
    * */
  def outputStream(fd: FileDescriptor): OutputStream = null

  /**
    * Destroys the reference fd
    * */
  def close(fs: FileDescriptor) = null

  /**
    * File descriptor (can be integer or long)
    * */
  class FileDescriptor { }
}
