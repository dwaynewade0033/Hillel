package StreamsSecondPart;

public interface PersonService {
    void save(PersonModel p);
    PersonModel getById(int id);
}
