// 
/*

    #  https://www.codewars.com/kata/we-are-family/java
    #  We are Family Kata

    We need a system that can learn facts about family relationships, check their consistency and answer queries about them.

    The task
    Create a class Family with the following methods. All arguments are names of persons. Upon the first use of a name, that name is added to the family.

    boolean male(String name) and boolean female(String name)

    Define the gender (corresponding to the method name) of the given person. Return false when these assignments cannot be made because of conflicts with earlier registered information.

    boolean isMale(String name) and boolean isFemale(String name)

    Return true when the person has the said gender. When no gender was assigned, both methods should return false

    boolean setParent(String childName, String parentName)

    Defines the child-parent relationship between two persons. Returns false when the relationship cannot be made because of conflicts with earlier registered information.

    List<String> getParents(String name) and List<String> getChildren(String name)

    Return the names of the person's parents/children in alphabetical order

    Deducing information
    When things can be implied from given information, it should be done.
*/ 

/* 
    For instance, a parent's gender can be determined as soon as the other parent's gender becomes known:

    Family fam = new Family();
    fam.setParentOf("Vera", "George");
    fam.setParentOf("Vera", "Vanessa");
    fam.female("Vanessa");
    fam.female("George"); // false, because:
    fam.isMale("George"); // ...this is true.
    Also setParentOf can return false. For example, if the relationship would infer that one becomes their own ancestor:

    Family fam = new Family();
    fam.setParentOf("Vera", "George");
    fam.setParentOf("George", "Vera"); // false

*/ 

Public Class Family {

    // Constructor 
    Class Family(String 'name') {
        
        // Methods 
        male();
        female();

        isMale();
        isFemale();

        setParent();

        getParents();

        getChildren();
    } 

    Public void male(String name){

    } 
}



public static void main(String[] args) {
    // TEST DATA
    Family fam = new Family();
    fam.setParentOf("Frank", "Morgan");       // true
    fam.setParentOf("Frank", "Dylan");        // true
    fam.male("Dylan");                        // true
    fam.setParentOf("Joy", "Frank");          // true
    fam.male("Frank");                        // true
    fam.male("Morgan");                       // false
    // (Morgan is a woman because she both is Frank's parent, but not his father) 
    fam.setParentOf("July", "Morgan");        // true
    // (The preceding assertion was rejected, so there is no conflict)
    fam.isMale("Joy") || fam.isFemale("Joy"); // false
    // (We know Joy is Frank's child, but we can't derive Joy's gender)
    fam.getChildrenOf("Morgan");              // Arrays.asList("Frank", "July")
    fam.setParentOf("Jennifer", "Morgan");    // true
    fam.getChildrenOf("Morgan");              // Arrays.asList("Frank", "Jennifer", "July")
    fam.getChildrenOf("Dylan");               // Arrays.asList("Frank")
    // (That is all we know for sure)
    fam.getParentsOf("Frank");                // Arrays.asList("Dylan", "Morgan")
    fam.setParentOf("Morgan", "Frank");       // false
    // (It is impossible to be the parent of your parent)
}
