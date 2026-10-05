/**
 * Java Access Modifiers — The 4-Door Rule
   Think of a class as a house and its members as things inside the house.
Java gives you 4 levels of doors:

                    ACCESS
                       │
        ┌──────────────┼──────────────┐──────────────┐
        │              │              │
     private       default       protected           public
        │              │              │                │
    🔴 Owner       🟡 Family       🟠 Relatives   🟢 Everyone
        only        / package        + children         │
                                                        │
                                                    EVERYWHERE
 */


// The easiest way to remember them:
private -> same class
default -> same package
protected -> package + child class (protected works in the same package AND outside the package through inheritance.)
public -> everywhere


//Table form 

Scope                          | Private | Protected | Public | Default
-------------------------------|---------|-----------|--------|--------
Same class                     |   Yes   |    Yes    |  Yes   |   Yes
Same package, subclass         |   No    |    Yes    |  Yes   |   Yes
Same package, non-subclass     |   No    |    Yes    |  Yes   |   Yes
Different package, subclass    |   No    |    Yes    |  Yes   |   No
Different package, non-subclass|   No    |    No     |  Yes   |   No