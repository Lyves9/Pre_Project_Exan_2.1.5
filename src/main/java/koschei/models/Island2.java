package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Island2 {
    @Autowired
    private Wood3 wood;


    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
