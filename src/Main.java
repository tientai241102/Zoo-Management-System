import com.codegym.model.animal.enumerations.GenderAnimals;
import com.codegym.model.animal.enumerations.HealAnimals;
import com.codegym.model.animal.species.Dolphin;
import com.codegym.model.person.enumerations.AgeCategory;
import com.codegym.model.person.enumerations.GenderPerson;
import com.codegym.model.person.visitors.Child;
import com.codegym.model.ticket.ChildTicket;

public class Main {
    public static void main(String[] args) {
        Dolphin dolphin1 = new Dolphin(1,"Flipper","Elephant",120,2.5,29,HealAnimals.GOOD,GenderAnimals.MALE);
        System.out.println(dolphin1);
        ChildTicket childTicket = new ChildTicket();
        Child child = new Child("Tên của đứa bé", "Địa chỉ", "Thành phố", "Quốc gia", GenderPerson.MALE, 5, AgeCategory.CHILD, childTicket);
        System.out.println(child);
    }
}