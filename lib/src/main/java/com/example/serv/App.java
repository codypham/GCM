package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCa0Bc7gUPLIgvKfRiiHXECQDwjSNvrl9s";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bE_4HMyhhqX69MfM77aVU81Rh0QyOh0pRK6usCevk4dxKnrP8GJ2d3LkRzSVKQIyPE14B5cyd785ZFbqOHOCM44dmhnqYBZwiGYvapl43WY4zcxxdd4OkAYzy14sy97pnenrA2G");

        c.createData("Working!!", "Test message");

        return c;
    }
}

