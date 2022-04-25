class PeekingIterator implements Iterator<Integer> {

    private final List<Integer> list = new ArrayList<>();
    private int index;
    
    public PeekingIterator(Iterator<Integer> iterator) {
        iterator.forEachRemaining(i -> list.add(i));
    }
	
	public Integer peek() {
        if (!hasNext()){
            return -1;
        }
        return list.get(index);
	}
	
	@Override
	public Integer next() {
	    return list.get(index++);
	}
	
	@Override
	public boolean hasNext() {
	    return index < list.size();
	}
}