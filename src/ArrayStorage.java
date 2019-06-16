/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i<storage.length; i++){
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++){
            if (r != null){
                storage[i] = r;
            }
        }
    }

    Resume get(String uuid) {
        Resume resume = null;
        for (int i = 0; i < storage.length; i++){
            if (storage[i].equals(uuid)){
                resume = storage[i];
            }
        }
        return resume;
    }

    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++){
            if (storage[i].equals(uuid)){
                storage[i] = null;
                for (int j = i; j < storage.length; j++){
                    storage[j] = storage[j+1];
                }
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return storage;
    }

    int size() {
        int count = 0;
        for (int i = 0; i < storage.length; i++){
            if (storage[i] != null){
                count++;
            }
        }
        return count;
    }
}
