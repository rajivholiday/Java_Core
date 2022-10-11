package happyfamily6;
import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {

    private List<Family> families = new ArrayList<>();

    @Override
    public Family getFamilyByIndex(int index) {
        return families.get(index);
    }

    @Override
    public List<Family> getAll() {
        return families;
    }

    @Override
    public void delete(Family family) {
        families.remove(family);

    }

    @Override
    public void delete(int index) {
        families.remove(index);
    }

    @Override
    public void add(Family family) {
        families.add(family);

    }

    @Override
    public Family saveFamily(Family requestedFamily) {
        for (Family newFamily : families) {
            if (!newFamily.equals(requestedFamily)) {
                families.add(requestedFamily);
            }
        }
        return null;  // dersde baxariq;
    }

}