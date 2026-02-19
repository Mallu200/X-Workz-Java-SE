package com.xworkz.cloud;

public class GoogleDriveProvider implements CloudService {

    @Override
    public void uploadFile(String fileName) {
        System.out.println("Invoking uploadFile in GoogleDriveProvider");
        System.out.println(">> [GDrive] Syncing '" + fileName + "' to Google Cloud Storage.");
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println(">> [GDrive] Fetching '" + fileName + "' from your Drive account.");
    }

    @Override
    public void deleteFile(String fileName) {
        System.out.println(">> [GDrive] Moving '" + fileName + "' to Trash.");
    }
}