package specification.operations.file;

import specification.model.FileWrapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FileBasicOperations
{
    /**
     * Uploads file to storage on given path.
     *
     * @param file     file which will be uploaded
     * @param onPath   file location on storage, without file name
     * @param fileName file name with extension
     */
    void uploadFile(File file, String onPath, String fileName) throws IOException, Exception;

    /**
     * Uploads file to storage with associated metadata. File will be uploaded on {@link FileWrapper#getPath()}
     *
     * @param file file to be uploaded
     * @throws IOException
     * @throws Exception
     */
    void uploadFile(FileWrapper file) throws IOException, Exception;

    /**
     * Concurrently upload multiple files.
     *
     * @param files - to be uploaded
     */
    void uploadMultipleFiles(List<FileWrapper> files) throws IOException, Exception;

    /**
     * Download file from pathToFile to location given as localPath.
     *
     * @param pathToFile file location on storage from root, without file name
     * @param fileName   file name on pathToFile that will be downloaded. If file has extension, has to be added.
     * @param localPath  where file will be downloaded
     */
    FileWrapper downloadFile(String pathToFile, String fileName, String localPath) throws IOException, Exception;
}
