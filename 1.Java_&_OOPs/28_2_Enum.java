// Enum : An enum (enumeration) is a special class used when a variable should have a fixed set of predefined values.
// Enum is actually a class. An enum is essentially a special kind of class.
// It can have:  fields, constructors, methods, constants
// Enum constructors are implicitly private.
// Enum methods -> values(), valueOf(), ordinal()
// Can't extends enum.
enum Status {
    PENDING, // these are kind like objects
    SUCCESS,
    FAILED
}

Status status = Status.SUCCESS;
System.out.println(status); // SUCCESS


// Enum with If-Else
enum Role { ADMIN, USER, GUEST }
public class Main {
    public static void main(String[] args) {
        Role role = Role.ADMIN;
        if (role == Role.ADMIN) {
            System.out.println("Full access");
        }
        else if (role == Role.USER) {
            System.out.println("Limited access");
        }
        else {
            System.out.println("Guest access");
        }
    }
}

//Enum in Switch
enum Status { PENDING,SUCCESS,FAILED }

public class Main {
    public static void main(String[] args) {
        Status status = Status.PENDING;
        switch (status) {
            case PENDING:
                System.out.println("Waiting...");
                break;
            case SUCCESS:
                System.out.println("Completed");
                break;
            case FAILED:
                System.out.println("Failed");
                break;
        }
    }
}


// Print all status values
for (Status status : Status.values()) {
    System.out.println(status);
}

// Enum with fields and constructor
enum Status {
    PENDING(1),
    SUCCESS(2),
    FAILED(3);
    private int code;
    Status(int code) {
        this.code = code;
    }
    int getCode() {
        return code;
    }
}

public class Main {
    public static void main(String[] args) {
        Status status = Status.SUCCESS;
        System.out.println(status);
        System.out.println(status.getCode());
    }
}