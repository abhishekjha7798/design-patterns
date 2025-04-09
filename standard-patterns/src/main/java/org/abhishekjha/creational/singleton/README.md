Pitfalls:
 - Often Overused
 - Difficult to write UTs - since no instantiation
 - java.util.Calendar is NOT a Singleton - it's based on prototype pattern
 - Confused with Factory
   * Singleton always returns the same instance but Factory return various instances and can have multiple constructors
   * Singleton has no interface whereas Factory is interface driven and is more adaptable