package com.xworkz.cloud;

public class AWSStorageProvider implements CloudService {

    @Override
    public void uploadFile(String fileName) {
        System.out.println("Invoking uploadFile in AWSStorageProvider");
        System.out.println(">> [AWS S3] Uploading '" + fileName + "' to S3 Bucket with high availability.");
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println(">> [AWS S3] Generating pre-signed URL to download '" + fileName + "'.");
    }

    @Override
    public void deleteFile(String fileName) {
        System.out.println(">> [AWS S3] Permanently deleting '" + fileName + "' from bucket.");
    }
}