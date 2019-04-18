package specification.operations.folder;

import specification.model.FolderWrapper;

public interface FolderBasicOperations
{
    /**
     * Creates folder on given location.
     *
     * @param location
     * @param name
     * @return
     */
    void createFolder(String location, String name) throws Exception;

    /**
     * @param location
     * @param name
     * @param metadata
     * @throws Exception
     */
    void createFolder(String location, String name, String metadata) throws Exception;

    /**
     *
     * @param path
     * @param folderName
     * @return
     * @throws Exception
     */
    FolderWrapper listFolder(String path, String folderName) throws Exception;
}
