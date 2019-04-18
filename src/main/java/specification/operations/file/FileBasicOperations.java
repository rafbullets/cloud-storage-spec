package specification.operations.file;

import specification.model.FileWrapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FileBasicOperations {
    /**
     * Uploads file to storage on given path.
     *
     * @param file     file which will be uploaded
     * @param location file location on storage, without file name
     * @param name     file name with extension
     * @throws IOException if something happend
     * @throws Exception   should be thrown maybe
     */
    void uploadFile(File file, String location, String name) throws IOException, Exception;

    /**
     * Uploads file to storage with associated metadata. File will be uploaded on {@link FileWrapper#getPath()}
     *
     * @param file file to be uploaded
     * @throws IOException if something happend
     * @throws Exception   should be thrown maybe
     */
    void uploadFile(FileWrapper file) throws IOException, Exception;

    /**
     * Concurrently upload multiple files.
     *
     * @param files to be uploaded
     * @throws IOException if something happend
     * @throws Exception   should be thrown maybe
     *
     */
    void uploadMultipleFiles(List<FileWrapper> files) throws IOException, Exception;

    /**
     * Download file from pathToFile to location given as localPath.
     *
     * @param location   file location on storage from root, without file name
     * @param name       file name on pathToFile that will be downloaded. If file has extension, has to be added.
     * @param pathOnDisk where file will be downloaded, with file name.
     * @throws IOException if something happend
     * @throws Exception   should be thrown maybe
     * @return FileWrapper which holds all data for downloaded file
     */
    FileWrapper downloadFile(String location, String name, String pathOnDisk) throws IOException, Exception;
}
