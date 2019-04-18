package specification.operations;

public interface CommonOperations
{
    /**
     * Deletes single file if name on given path is file.
     * If it is name of a folder, it will deletes whole folder.
     *
     * @param path
     * @param name
     */
    void delete(String path, String name) throws Exception;
}
