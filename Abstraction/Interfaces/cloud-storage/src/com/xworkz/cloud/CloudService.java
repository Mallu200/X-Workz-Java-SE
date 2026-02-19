package com.xworkz.cloud;

public interface CloudService {
    // Contract methods
    void uploadFile(String fileName);
    void downloadFile(String fileName);
    void deleteFile(String fileName);
}