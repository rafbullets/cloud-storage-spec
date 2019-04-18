package specification.model;

import java.util.List;

public class FolderWrapper extends Wrapper
{
    protected List<FolderResult> folderResults;

    public FolderWrapper(List<FolderResult> folderResults, String folderMetadata) {
        this.folderResults = folderResults;
        this.metadata = folderMetadata;
    }
}
