https://workat.tech/machine-coding/practice/design-key-value-store-6gz6cq124k65 

I was trying this question in machine coding interview round 

few learnings i have from this noting it down below 

package com.java.inmemorykeyvaluestore;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Learnings {

    /*****
     * So i was attempting this question called In memory key-value store in machine coding
     *
     * One of the requirements were something  like that we have in redis
     *
     * for a corresponding key we can have data like ,
     *
     * {
     *     "key" : "pewdiepie",
     *     "value" : {
     *         "title" : "playing scary games",
     *         "views" : 50000.00,
     *         "subscribed" : true,
     *         "estimated_time" : 30
     *     }
     * }
     *
     *
     * {
     *     "key" : "KSI",
     *     "value" : {
     *         "title" : "try Not to laugh",
     *         "views" : 40000.00,
     *         "subscribed" : true,
     *         "estimated_time" : 30
     *     }
     * }
     *
     *
     * Now thing is that i was wondering how can i take this kind of input from the
     * postman curl that i will be getting
     *
     * Then i remembered the arpit Bhayani video that i watched ,
     * and i chatgpted a little bit as well , so this question turned out to be a practice
     * for me Redis design only
     *
     *
     *
     * *****/


    // how my requestDto class would look like
    class KeyValueModelRequestDTO {
        @JsonProperty("key")
        private String key;
        @JsonProperty("value")
        private Object object;
    }

    /***
     * When i did the dry run myself , i saw that in the controller class
     * using @RequestBody , the deserialization into the object happened in the form of
     * LinkedHashMap
     *
     *
     * **/


    // how i wwas accessing the hashMap in my code
    // this also i looked up in chatgpt
    public void accessMap(Object object) {

        if(object instanceof Map<?,?>) {

            Map<?,?> value = (Map<?, ?>) object;
            // now i can do all the operations required to do with Map all i want
        }
    }


    // i can access it as a enum i can have a valueType in the KeyValueModel class of mine
    /***
     * lIKE
     * public enum ObjectType {
     *     PRIMITIVE,
     *     MAP
     * }
     *
     * ***/


    /****
     * aLSO I made one mistake that ,
     * i forgot to add @RestController in the controller class
     * and that was causing issues ,
     * it wasnt able to find the
     * endpoint
     * ***/


    /**
     * This was the first time i used
     * @DeleteMapping , as there was a requirement to delete a key
     * , i added it to my coding inventory , will use it wherever required
     * **/
}

