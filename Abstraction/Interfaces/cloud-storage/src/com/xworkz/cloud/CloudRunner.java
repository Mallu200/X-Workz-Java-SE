package com.xworkz.cloud;

public class CloudRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Scenario: User starts with Google Drive (Free Tier)
        CloudService service = new GoogleDriveProvider();
        service.uploadFile("Resume.pdf");
        service.downloadFile("Photo.jpg");

        System.out.println("---------------------------");

        // Scenario: Company migrates to AWS for better security
        service = new AWSStorageProvider();
        service.uploadFile("Database_Backup.sql");
        service.deleteFile("Old_Logs.txt");

        System.out.println("Main method ended.");
    }
}