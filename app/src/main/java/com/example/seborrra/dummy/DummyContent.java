package com.example.seborrra.dummy;

import com.example.seborrra.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    //public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static final List<User> ITEMS = new ArrayList<User>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, String> ITEM_MAP = new HashMap<String, String>();

    private static final int COUNT = 12;

    static {
        // Add some sample items.
/*        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
*/
        //new User(email,pass,typeUser,phone)
        User usuario1 = new User("usuario1@email.com","1234156","normal","123456789");
        User usuario2 = new User("usuario2@email.com","1234156","normal","123456789");
        User usuario3 = new User("usuario3@email.com","1234156","normal","123456789");
        User boss = new User("boss@email.com","1234156","admin","123456789");
        addItem(usuario1);
        addItem(usuario2);
        addItem(usuario3);
        addItem(boss);
    }

    private static void addItem(User item) {
        ITEMS.add(item);
        //ITEMS.add(1, String.valueOf(item.getPhone()));
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}