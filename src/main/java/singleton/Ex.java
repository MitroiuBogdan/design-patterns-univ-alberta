package singleton;

import static java.util.Objects.nonNull;

public class Ex {

    private static Ex instance = null;

    private Ex() {

    }

    public static Ex getInstance() {
        if (nonNull(instance)) {
            System.out.println("getInstance - instance not is null");
            return instance;
        }
        System.out.println("getInstance - instance is null");
        return instance = new Ex();
    }

}
