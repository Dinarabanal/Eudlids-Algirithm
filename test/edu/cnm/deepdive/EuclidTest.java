package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class EuclidTest {

  /*@Test
  void gcdInt() {
    assertAll(
        () -> assertEquals new Executable(6791, Euclid.gcd(38_593_253, 53_777_929));
        () -> assertEquals new Executable(6791, Euclid.gcd(53_777_929, 38_593_253)),

          }
        }
    );

      assertEquals(6791, Euclid.gcd(53_777_929, 38_593_253));
    }*/
  @Test
  void gcdInt() {
    assertAll(
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(67911, Euclid.gcd(53_777_929, 38_593_253));
          }
        },

        () -> {
          assertEquals(53_777_929, Euclid.gcd(53_777_929, 0));

          @Test
          void gcdInt (); {
            assertAll(
                new Executable() {
                  @Override
                  public void execute() throws Throwable {

                  }
                }
            @Override
            public void execute () throws Throwable;
            {
              assertEquals(53_777_929, Euclid.gcd(0, 53_777_929, 0));
            }

          } ;

          @Test
          void gcdLong () {
          }
        }