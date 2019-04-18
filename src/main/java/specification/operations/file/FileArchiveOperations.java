package specification.operations.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FileArchiveOperations {
    /**
     * Uploads multiple files as .zip file on given location.
     *
     * @param files    to be uploaded
     * @param location path where .zip file will be uploaded
     * @param name     name of the .zip file
     * @param meta     metadata for zip file
     * @throws IOException if something happend
     * @throws Exception   should be thrown maybe
     */
    void uploadAsZipFile(List<File> files, String location, String name, String meta) throws IOException, Exception;
}
