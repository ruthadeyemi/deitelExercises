package chapterThree;

public class SelfReviewExercises {
    public static void main(String[] args) {
      /*  3.1
         a) public.
         b) class.
         c) new
         d) type, name.
         e) default package.
         f) float, double.
         g) double,precision.
         h) nextDouble.
         i) modifier.
         j) void.
         k) nextLine.
         l) java.lang.
         m) import declaration.
         n) floating-point number.
         o) single.
         p) %f.
         q) primitive, reference.
                    3.2
                        ) False. By convention, method names begin with a lowercase first letter and all subsequent words in the name begin with a capital first letter.
                        b) True.
                        c) True.
                        d) False. A primitive-type variable cannot be used to invoke a method—a reference to an object is required to invoke the object’s methods.
                        e) False. Such variables are called local variables and can be used only in the method in which they’re declared.
                        f) True.
                        g) False. Primitive-type instance variables are initialized by default. Each local variable must explicitly be assigned a value.
                        h) True.
                        i) True.
                        j) True.
                        k) False. Such  literals are of type double by default.
        3.3
        A local variable is declared in the body of a method and can be used only from the point at
        which it’s declared through the end of the method declaration. An instance variable is declared in a
        class, but not in the body of any of the class’s methods. Also, instance variables are accessible to all
        methods of the class.

                               3.4
                                A parameter represents additional information that a method requires to perform its task.
                                Each parameter required by a method is specified in the method’s declaration. An argument is the
                                actual value for a method parameter. When a method is called, the argument values are passed to
                                 the corresponding parameters of the method so that it can perform its task.
        3.5
      The purpose of keyword new is to create an object of a class.
      When keyword new is used in an application, first a new object of the class to the right of new is created,
      then the class’s constructor is called to ensure that the object is initialized properly.
                                  3.6
                                 A default constructor is a constructor provided by the compiler when the programmer does not specify any constructors in the class.
                                 When a class has only the default constructor, its instance variables are initialized to their default values.
                                 Variables of constructor, its instance variables are initialized to their default values.
                                 Variables of types char, byte, short, int, long, float and double are initialized to 0, variables of ype boolean are initialized to false,
                                 and reference-type variables are initialized to null.

        3.7
        A class provides an instance variable (or several instance variables) when each object of the class must maintain information separately from all other objects of the class.
        For example, a class called Account that represents a bank account provides an instance variable to represent the balance of the account.
        Each Account object maintains its own balance, but does not know the balances of the bank’s other accounts.
                                  3.8
                                 Classes System and String are both in package java.lang, which is implicitly imported into every Java source-code file.
        3.9
        If every use of a class’s name in a program is fully qualified, there is no need to import he class.
         A class’s fully qualified name consists of the class’s package followed by the class name.
         For example, a program could use class Scanner without importing it if every use of Scanner in the program is specified as java.util.Scanner.
                                   3.10
                                   An instance variable is typically declared private in a class so that only the methods of the class in which the instance variable is declared can manipulate the variable.
                                   In some cases, it may be necessary for an application to modify the private data.
                                   For example, the owner of a bank account should be able to deposit or withdraw funds and check the account’s balance.
                                   A class’s designer can provide public set and get methods that enable an application to specify the value for, or retrieve the value of, a particular object’s private instance variable.
*/
    }
}
