import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class RandomizedSet {
    private int[] arr;
    private int size;
    private Set<Integer> set;
    private Random random;

    public RandomizedSet() {
        this.arr = new int[10]; 
        this.size = 0;
        this.set = new HashSet<>();
        this.random = new Random();
    }

    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        }

        if (size == arr.length) {
            int[] newArr = new int[size * 2];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }

        arr[size++] = val;
        set.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (arr[i] == val) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                arr[index] = arr[size - 1];
                size--;
                set.remove(val);
                return true;
            }
        }
        return false;
    }

    public int getRandom() {
        if (size == 0) {
            throw new IllegalStateException("Set is empty");
        }
        int randomIndex = random.nextInt(size);
        return arr[randomIndex];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */