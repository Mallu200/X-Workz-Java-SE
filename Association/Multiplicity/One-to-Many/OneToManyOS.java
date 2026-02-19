class File {
    String fileName;
    double size; // size in KB

    // --- STEP 1: CONSTRUCTOR ---
    // Represents the allocation of space for a file on the disk.
    File(String name, double size) {
        this.fileName = name;
        this.size = size;
        // Mandatory SOP to track object creation
        System.out.println(">> [I/O-SYSTEM] Disk Write: File '" + name + "' saved successfully.");
    }
}

class Folder {
    String folderName;
    
    // --- STEP 2: THE ONE-TO-MANY LINK ---
    // The Folder class holds an array of File object references.
    // One Folder 'has-a' list of many Files.
    File[] fileList;

    // Constructor: Linking the 'Many' (Files) to the 'One' (Folder)
    Folder(String name, File[] list) {
        this.folderName = name;
        
        // The association is finalized here by pointing to the array of files
        this.fileList = list; 
        System.out.println(">> [OS-SHELL] Folder '" + name + "' initialized with " + list.length + " items.");
    }

    void explore() {
        System.out.println("\n--- [DIRECTORY EXPLORER: /" + folderName + "] ---");
        
        // Safety Check: Verify if the folder has any associated files
        if (fileList != null && fileList.length > 0) {
            // TRAVERSING THE MANY-SIDE:
            // Using a loop to access each associated File object's data
            for (File f : fileList) {
                System.out.println("  [FILE] " + f.fileName + "\t Size: " + f.size + " KB");
            }
            System.out.println("----------------------------------------------");
            System.out.println("Summary: " + fileList.length + " Total Files listed.");
        } else {
            System.out.println("  [EMPTY] This folder is empty.");
        }
        System.out.println("----------------------------------------------\n");
    }
}

class OneToManyOS {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Booting File System Module...");

        // 1. Create the 'Many' objects (Files) independently in memory
        File f1 = new File("Resume.pdf", 450.5);
        File f2 = new File("Photo.jpg", 1200.0);
        File f3 = new File("Notes.txt", 15.2);

        // 2. Group these independent references into an Array
        File[] docs = {f1, f2, f3};

        // 3. Create the 'One' object (Folder) and inject the 'Many' (Files)
        Folder myDocs = new Folder("Documents", docs);

        // 4. Utilize the association through the Folder's method
        myDocs.explore();

        System.out.println(">> [SYSTEM] File System Exploration Complete.");
    }
}