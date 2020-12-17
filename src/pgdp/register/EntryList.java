package pgdp.register;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EntryList implements Iterable<Entry> {
    protected List<Entry> list = new ArrayList<>();

    public boolean add(Entry entry) {
        return list.add(entry);
    }

    public Entry get(int index) {
        return list.get(index);
    }

    public boolean remove(Entry entry) {
        return list.remove(entry);
    }

    public Entry remove(int index) {
        return list.remove(index);
    }

    public int size() {
        return list.size();
    }

    public Iterator<Entry> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
