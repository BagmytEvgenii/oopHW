import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
// Создаем людей
        Person john = new Person("John", 1950);
        Person mary = new Person("Mary", 1955);
        Person susan = new Person("Susan", 1980);
        Person drake = new Person("Drake", 1999);
// Устанавливаем родительские связи
        drake.setFather(john);
        drake.setMother(mary);
        susan.setMother(mary);
        susan.setFather(john);
        john.addChild(susan);
        john.addChild(drake);
        mary.addChild(susan);
        mary.addChild(drake);
// Добавляем людей в древо
        familyTree.addPerson(john);
        familyTree.addPerson(mary);
        familyTree.addPerson(susan);
        familyTree.addPerson(drake);
// Пример получения всех детей Джона
        List<Person> johnsChildren = familyTree.getChildren(john);
        for (Person child : johnsChildren) {
            System.out.println("John's child: " + child.getName());
        }
    }
}