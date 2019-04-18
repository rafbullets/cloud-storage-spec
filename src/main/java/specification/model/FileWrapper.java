package specification.model;

import java.io.File;

public class FileWrapper extends Wrapper
{
    protected File file;

    public FileWrapper(File file, String metadata, String name, String path) {
        this.file = file;
        this.name = name;
        this.path = path;
        this.metadata = metadata;
    }

    public FileWrapper(File file, String metadata) {
        this.file = file;
        this.metadata = metadata;
    }

    public String getMetadataPath() {
        return this.getPath() + ".__" + this.getName();
    }

    public File getFile() {
        return file;
    }

    @Override
    public String toString() {
        return "FileWrapper{" +
                "file=" + file+
                ", metadata='" + metadata + '\'' +
                '}';
    }
}
