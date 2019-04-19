package specification.operations.folder;

import specification.model.FolderWrapper;

public interface FolderBasicOperations {
    /**
     * Creates folder on given location.
     *
     * @param location on storage from root, without file name
     * @param name     folder name
     * @throws Exception if something bad happens
     */
    void createFolder(String location, String name) throws Exception;

    /**
     * Creates folder on given location with given name. Stores additional metadata about folder.
     *
     * @param location on storage from root, without file name
     * @param name     folder name
     * @param metadata metadata associated with newly created folder
     * @throws Exception if something bad happens
     */
    void createFolder(String location, String name, String metadata) throws Exception;

    /**
     * Returns folder's content.
     *
     * @param location   on storage from root, without file name
     * @param folderName name of the folder on given location
     * @return {@link FolderWrapper} which contains data about folder
     * @throws Exception if something bad happens
     */
    FolderWrapper listFolder(String location, String folderName) throws Exception;


    /**
     * Update metadata
     * @param path on path
     * @param name for file
     * @param metadata meta
     */
    void updateMetadata(String path, String name, String metadata);
}
