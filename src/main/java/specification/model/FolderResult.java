package specification.model;

public class FolderResult
{
    protected String name;
    protected boolean isDirectory;

    public FolderResult(String name, boolean isDirectory) {
        this.name = name;
        this.isDirectory = isDirectory;
    }

    public String getName() {
        return name;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    @Override
    public String toString() {
        return "FolderResult{" +
                "name='" + name + '\'' +
                ", isDirectory=" + isDirectory +
                '}';
    }
}
