package com.emse;

import com.emse.alexa.Coordinate;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class Main {
    private static final String fileName = "Speaker.DoorbellPress.request.json";
    private static final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    private static final InputStream is = classloader.getResourceAsStream(fileName);


    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            assert is != null;
            String text = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            Coordinate coordinate = mapper.readValue(text, Coordinate.class);
            //Print the data of the instance
            System.out.println("Generated from JSON:");
            printCoordinate(coordinate);
            //Modify the instance
            coordinate.getEvent().getEndpoint().setEndpointID("endpoint-005");
            coordinate.getEvent().getHeader().setMessageID("id-modified-1234567890");
            //Print the modified instance
            System.out.println("Modified previous instance:");
            printCoordinate(coordinate);
            //Save the instance to JSON in the maven target folder
            String json = mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL).writerWithDefaultPrettyPrinter().writeValueAsString(coordinate);
            String root = System.getProperty("user.dir");
            String newFileName = fileName.replace(".json", ".modified.json");
            String path = root + "/target/" + newFileName;
            Files.write(Paths.get(path), Collections.singleton(json), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printCoordinate(Coordinate coordinate) {
        System.out.println("Object: " + coordinate);
        System.out.println("event: ");
        System.out.println("\theader: ");
        System.out.println("\t\tname: " + coordinate.getEvent().getHeader().getName().toValue());
        System.out.println("\t\tnamespace: "  + coordinate.getEvent().getHeader().getNamespace().toValue());
        System.out.println("\t\tpayloadVersion: "  + coordinate.getEvent().getHeader().getPayloadVersion().toValue());
        System.out.println("\t\tmessageId: "  + coordinate.getEvent().getHeader().getMessageID());
        System.out.println("\t\tcorrelationToken: "  + coordinate.getEvent().getHeader().getCorrelationToken());
        System.out.println("\tendpoint: ");
        System.out.println("\t\tendpointId: "  + coordinate.getEvent().getEndpoint().getEndpointID());
        System.out.println("\t\tscope: ");
        System.out.println("\t\t\ttype: "  + coordinate.getEvent().getEndpoint().getScope().getType().toValue());
        System.out.println("\t\t\ttoken: "  + coordinate.getEvent().getEndpoint().getScope().getToken());
        System.out.println("\tpayload: ");
        System.out.println("\t\ttimestamp: "  + coordinate.getEvent().getPayload().getTimestamp());
    }
}
