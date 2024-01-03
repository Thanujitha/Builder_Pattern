Use the Builder Pattern to Encapsulate the Constraction of a Product and allow it to be constracted in steps.

Component-
  class
  private final variable
  private constructor(paramiter:Builder)
  getters
  toString(); optional

  Builder-
    static class
    private variable
    setters(return:Builder)
    build(return:Component)
