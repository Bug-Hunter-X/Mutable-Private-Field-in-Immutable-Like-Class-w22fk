# Mutable Private Field in Seemingly Immutable Class

This example highlights a potential pitfall in Scala: using a mutable private field (`_age`) within a class that presents an immutable interface. While the code functions as intended (throwing an exception for negative ages), it breaks the principle of immutability.

The solution demonstrates how to achieve a better design with immutable data structures.
