package com.thxran.dropbox.request_response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FolderRequest {

    private String parentfolder_id;

    @NotEmpty(message = "folder name is missing!")
    @NotBlank(message = "folder name is missing!")
    private String folder_name;
}