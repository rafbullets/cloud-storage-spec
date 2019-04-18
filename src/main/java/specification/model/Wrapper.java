package specification.model;

public abstract class Wrapper
{
    protected String name;
    protected String path;
    protected String metadata;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() { return path; }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

}
