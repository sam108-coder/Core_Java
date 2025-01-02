package queueInterface.asbtractDesignPattern;

import java.util.Collection;

public abstract class AbstractListt implements Listt{

    @Override
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Not Supported yet : ");
    }

    @Override
    public boolean addAll(Collection c) {
        return true;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
    throw new UnsupportedOperationException("Not Supported yet : ");

    }
}
