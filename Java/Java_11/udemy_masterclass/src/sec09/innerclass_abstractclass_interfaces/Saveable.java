package sec09.innerclass_abstractclass_interfaces;

import java.util.List;

public interface Saveable {
    List<String> write();
    void read(List<String> savedValues);
}
