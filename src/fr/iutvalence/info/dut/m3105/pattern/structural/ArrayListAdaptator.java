package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayListAdaptator<E> implements Stack<E>
{

	
	private List<E> list;

	public ArrayListAdaptator(List<E> list)
	{
		this.list = list;
	}
	
	
	@Override
	public void push(E element)
	{
		this.list.add(list.size(), element);
		
	}

	@Override
	public E pop()
	{
		return list.remove(list.size()-1);
	}

	@Override
	public E peek()
	{
		return list.get(list.size()-1);
	}

	@Override
	public int size()
	{
		return list.size();
	}

}
