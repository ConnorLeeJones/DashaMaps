public interface HashMapX {

    // fundamentals
    void set(String key, String value);
    String delete(String key);
    Integer get(String key);
    boolean isEmpty();
    long size();

    // testing access
    boolean bucketSize(String key); // used for tests
}
