package reflang;

public interface Heap {

    public Value ref(Value val);

    public Value deref(Value.RefVal val_ref);

    public Value setref(Value.RefVal val_ref, Value val);

    public Value free(Value.RefVal val_ref);

    class Heap16Bit implements Heap {
        static final int HEAPSIZE = 65536;
        Value rep[] = new Value[HEAPSIZE];
        int index = 0;

        public Value ref(Value value) {
            if (index >= HEAPSIZE)
                return new Value.DynamicError("Out of memory error");
            Value.RefVal newloc = new Value.RefVal(index);
            rep[index++] = value;
            return newloc;
        }

        public Value deref(Value.RefVal loc) {
            try {
                return rep[loc.loc()];
            } catch (ArrayIndexOutOfBoundsException e) {
                return new Value.DynamicError("Segmentation fault at access: " + loc);
            }
        }

        public Value setref(Value.RefVal loc, Value value) {
            try {
                return rep[loc.loc()] = value;
            } catch (ArrayIndexOutOfBoundsException e) {
                return new Value.DynamicError("Segmentation fault at access: " + loc);
            }
        }

        public Value free(Value.RefVal loc) {
            try {
                rep[loc.loc()] = null;
                return loc;
            } catch (ArrayIndexOutOfBoundsException e) {
                return new Value.DynamicError("Segmentation fault at access: " + loc);
            }
        }
        Heap16Bit(){}
    }
}
