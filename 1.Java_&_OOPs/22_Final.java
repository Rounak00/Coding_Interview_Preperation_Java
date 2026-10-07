// final
//  |
//  |-- variable > 🔒 cannot reassign
//  |
//  |-- method   > 🔒 cannot override
//  |
//  |-- class    > 🔒 cannot extend


// for method example 
class Parent {
    final void show() {
        System.out.println("Hello");
    }
}

class Child extends Parent {
    void show() {  // ❌ Error
    }
}