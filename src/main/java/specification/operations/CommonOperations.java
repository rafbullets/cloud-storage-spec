package specification.operations;

public interface CommonOperations {
    /**
     * Deletes single file if name on given path is file.
     * If it is name of a folder, it will deletes whole folder.
     *
     * @param location location on storage, without file/folder name
     * @param name     of the file/folder which will be deleted
     * @throws Exception if something bad happens
     */
    void delete(String location, String name) throws Exception;
}
