package org.offen.victim;

/**
 * This is a test class that is intended to be used as a victim for the
 * ErrorProne plugin.
 */
public class Victim {

  /**
   * @return null
   */
  public String improperlyDocumentedMethod() {
    // Expect Error Prone to complain about the lack of a Javadoc summary
    return null;
  }

}
