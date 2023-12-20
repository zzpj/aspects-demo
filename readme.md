Aspect Oriented Programming (AOP) 
* programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns
* adds additional behavior to existing code without modification of the code itself
* AspectJ provides an implementation of AOP and has three core concepts:
  * Join Point (punkt złączeniowy, złączenie)
  * Pointcut (punkt przecięcia, przecięcie)
  * Advice (porada)
* built-in Spring (Boot)
* examples of usage:
  * extra code to method call (logger)
  * user authorization
  * error handling
  * transaction
  * caching
  * change of external library behaviour