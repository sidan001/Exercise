package com.exercise.essential_classes.nio;

import java.nio.ByteBuffer;

public class CreateArrayBuffer
{
  static public void main( String args[] ) throws Exception {
    byte array[] = new byte[1024];

    ByteBuffer buffer = ByteBuffer.wrap( array );

    buffer.put( (byte)'a' );
    buffer.put( (byte)'b' );
    buffer.put( (byte)'c' );

    buffer.flip();

    System.out.println( (char)buffer.get() );
    System.out.println( (char)buffer.get() );
    System.out.println( (char)buffer.get() );

    for (int i = 0; i < 5; i++) {
      System.out.println("array["+"i] = " + array[i]);
    }
  }
}
