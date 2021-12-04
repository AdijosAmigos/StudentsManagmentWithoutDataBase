import java.util.List;

public class Course {
    private final int id;
    private final String name;
    private final List<User> students;


//  TODO: dopisac walidacje id odraz name


    public Course(int id, String name, List<User> students) {

        if (id < 0) {
            throw new IllegalArgumentException("Id must be greater or equal to 0!");
        }

        if (name.length() <= 0) {
            throw new IllegalArgumentException("Length must be geater than 0!");
        }

        this.id = id;
        this.name = name;
        this.students = students;
    }


//    TODO: dopisac testy

    void addStudent(User user) {
        if (!(user.getType() == UserType.STUDENT)) {
            throw new IllegalArgumentException();
        } else {
            students.add(user);
        }
    }
}