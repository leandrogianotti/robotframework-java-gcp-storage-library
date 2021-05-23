package com.github.leandrogianotti.gcpstoragelibrary.keywords;

import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@RobotKeywords
public class GCPStorageKeywords {

    @RobotKeyword
    @ArgumentNames({ "bucket", "fileName", "filePath" })
    public void uploadFileToStorage(String bucket, String fileName, String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(new File(filePath).toPath());
        Storage storage = StorageOptions.getDefaultInstance().getService();
        Bucket bucketStorage = storage.get(bucket); 
        bucketStorage.create(fileName, bytes);
    }

}
