public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
/*
    Purpose of the interface and how they enable compile-time polymorphism.

    At the very fundamental level, interface establishes a "can-do" relationship. It doesn't represent the object itself;
    instead, it determines the behavior whether any object wants to considered as "lendable"

    It can be lent/lend.

    It can be returned vis returnBook.

    Its availability can be checked ->Book.isAvailable

    Any class, irrespective of its position in the class hierarchy, can fulfill the promise by implementating this contract.
    For ex: book, DVD are fundamentally different, but both can be lent.
 */