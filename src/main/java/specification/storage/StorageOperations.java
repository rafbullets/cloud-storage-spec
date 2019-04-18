package specification.storage;

import java.util.List;

public interface StorageOperations {
    /**
     * Init storage.
     *
     * @param pathToRoot          where root will be
     * @param forbiddenExtensions specify extensions that are not allowed in storage on given root.
     */
    void init(String pathToRoot, List<String> forbiddenExtensions);
}
