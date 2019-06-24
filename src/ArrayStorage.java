/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10];

    void clear() {              // работает
        for (int i = 0; i<storage.length; i++){
            storage[i] = null;
        }
    }

    void save(Resume r) {        // работает
        for (int i = 0; i<storage.length; i++){
            if (storage[i] == null){
                storage[i] = r;
                break;
            }
        }
    }

    Resume get(String uuid) {   // работает, не проходит тестирование
        Resume resume = null;
        for (int i = 0; i<storage.length; i++){
            resume = storage[i];
            if (resume.uuid == uuid){
                break;
            }
            else {
                resume.uuid = "null";
                System.out.println(" Нет такого значения");
            }
        }
        return resume;
    }

    void delete(String uuid) {    //работает
        int namberArray = 0;
        Resume resume = null;
        for (int i = 0; i < storage.length; i++){
            resume = storage[i];
            if (resume.uuid.equals(uuid)){
                storage[i] = null;
                i = namberArray;
                break;
            }

        }
        for (int i = namberArray; i<storage.length; i++){
            storage[i] = storage[i+1];
            if (storage[i+1]==null){
                break;
            }
        }
    }


    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {       //работает
        return storage;
    }

    int size() {      // работает
        int count = 0;
        for (int i = 0; i < storage.length; i++){
            if (storage[i] != null){
                count++;
            }
        }
        return count;
    }
}
