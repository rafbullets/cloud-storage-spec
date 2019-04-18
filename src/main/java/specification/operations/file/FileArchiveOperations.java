package specification.operations.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FileArchiveOperations
{
    /**
     * Uploads multiple files as .zip file on given location.
     *
     * @param files       to be uploaded
     * @param path        path where .zip file will be uploaded
     * @param zipFileName name of the zip file
     * @param meta        metadata for zip file
     */
    void uploadAsZipFile(List<File> files, String path, String zipFileName, String meta) throws IOException, Exception;
}
