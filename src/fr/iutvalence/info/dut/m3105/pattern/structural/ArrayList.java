package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E>
{
	private final E[] stack;
	private int nbElem;
	
	
	
	
	/**
	 * @param stack
	 * @param nbElem
	 */
	public ArrayList()
	{
		this.stack = (E[]) new Object[10];
		this.nbElem = 0;
	}

	@Override
	public void add(int position, E element)
	{
		this.stack[position] = element;
		this.nbElem ++;
		
	}

	@Override
	public E remove(int position)
	{
		nbElem --;
		return this.stack[position];
	}

	@Override
	public E get(int position)
	{
		return this.stack[position];
	}

	@Override
	public int size()
	{
		return nbElem;
	}

}
