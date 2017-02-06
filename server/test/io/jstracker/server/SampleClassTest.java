package io.jstracker.server;

import org.junit.Assert;
import org.junit.Test;

public class SampleClassTest {

  @Test
  public void testAdd() {
    Assert.assertEquals(5, SampleClass.add(2, 3));
  }
}
