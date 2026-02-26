package com.project.fvl.util;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * JSE Topic: Generics & Object Serialization
 * This utility allows the system to save any list of objects to a physical file.
 */
public class DataExporter {

    /**
     * JSE Topic: Generic Methods <T>
     * This method is type-safe and can handle Lists of Vaults, Customers, or any Serializable object.
     */
    public static <T> void exportToBinary(List<T> list, String fileName) {
        System.out.println("--> [EXPORTER]: Preparing to write " + list.size() + " objects to disk...");

        // JSE Topic: Try-with-resources with Chained Streams
        // FileOutputStream handles the file, ObjectOutputStream converts objects to bytes
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

            // JSE Topic: Serialization
            oos.writeObject(list);

            System.out.println("--> [EXPORTER]: SUCCESS. File created: " + fileName);

        } catch (Exception e) {
            System.err.println("!! [EXPORTER]: ERROR - Could not complete serialization.");
            System.err.println("Reason: " + e.getMessage());
        }
    }
}