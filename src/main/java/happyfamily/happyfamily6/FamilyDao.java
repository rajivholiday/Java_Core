package happyfamily.happyfamily6;

import java.util.List;

public interface FamilyDao {

    Family getFamilyByIndex(int index);

    List<Family> getAll();

    public void delete(Family family);

    public void delete(int index);



    public void save (Family family);


}
